package kaulua.workspace

import com.google.inject.Inject
import java.util.LinkedHashMap
import java.util.Map
import java.util.concurrent.CompletableFuture
import kaulua.common.UriExtensions
import kaulua.lsp.api.IWorkspace
import kaulua.server.WorkspaceManager
import kaulua.server.concurrent.RequestManager
import kaulua.server.findReferences.WorkspaceResourceAccess
import org.eclipse.emf.common.util.URI
import org.eclipse.lsp4j.Diagnostic
import org.eclipse.lsp4j.DiagnosticSeverity
import org.eclipse.lsp4j.DidChangeTextDocumentParams
import org.eclipse.lsp4j.DidCloseTextDocumentParams
import org.eclipse.lsp4j.DidOpenTextDocumentParams
import org.eclipse.lsp4j.DidSaveTextDocumentParams
import org.eclipse.lsp4j.Position
import org.eclipse.lsp4j.PublishDiagnosticsParams
import org.eclipse.lsp4j.Range
import org.eclipse.lsp4j.TextDocumentItem
import org.eclipse.lsp4j.TextEdit
import org.eclipse.lsp4j.jsonrpc.json.JsonRpcMethod
import org.eclipse.lsp4j.jsonrpc.json.MessageJsonHandler
import org.eclipse.lsp4j.jsonrpc.messages.NotificationMessage
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.Issue
import java.util.Optional

abstract class AbstractWorkspaceJsonRPC implements IWorkspace {
	
	@Inject @Accessors(PUBLIC_GETTER) RequestManager requestManager
	@Inject extension protected UriExtensions
	
	// injected below	
	protected WorkspaceManager workspaceManager
	protected WorkspaceResourceAccess resourceAccess
	
	
	@Inject
	def void setWorkspaceManager(WorkspaceManager manager) {
		this.workspaceManager = manager
		resourceAccess = new WorkspaceResourceAccess(workspaceManager)
		
		val diagnosticsListener = [URI uri, Iterable<Issue> issues | 
			println("[DEBUG] 10")
			val diagnostics = new PublishDiagnosticsParams => [
				println("[DEBUG] 9")
				it.uri = toUriString(uri)
				it.diagnostics = issues.filter[severity !== Severity.IGNORE].map[toDiagnostic].toList
			]
			
			val notif = new NotificationMessage()
			notif.method = "textDocument/publishDiagnostics"
			notif.params = diagnostics
			
			val Map<String, JsonRpcMethod> supportedMethods = new LinkedHashMap();
//			supportedMethods.putAll(ServiceEndpoints.getSupportedMethods(localService.getClass()));
			val MessageJsonHandler jsonHandler = new MessageJsonHandler(supportedMethods);
			val message = jsonHandler.serialize(notif)
			
			postIssues(message)
			
//			issues.forEach[
//				LOGGER.debug(it.severity + " " + it.lineNumber +":"+it.column + " " + it.message )
//			]
		]
		
		workspaceManager.initialize(null, diagnosticsListener, CancelIndicator.NullImpl) // from LanguageServerImpl.initialize()
	}
	
	private def Diagnostic toDiagnostic(Issue issue) {
		println("[DEBUG] 8")
		new Diagnostic => [
			code = issue.code
			severity = switch issue.severity {
				case ERROR: DiagnosticSeverity.Error
				case WARNING: DiagnosticSeverity.Warning
				case INFO: DiagnosticSeverity.Information
				default: DiagnosticSeverity.Hint
			}
			message = issue.message
            val lineNumber = (issue.lineNumber ?: 1) - 1
            val column = (issue.column ?: 1) - 1
            val length = (issue.length ?: 0)
			range = new Range(
				new Position(lineNumber, column),
				new Position(lineNumber, column + length)
			)
		]
	}
	
	override didOpen(DidOpenTextDocumentParams params) {
		println("[DEBUG] 1")
		requestManager.runWrite([
			workspaceManager.didOpen(params.textDocument.uri.toUri, params.textDocument.version, params.textDocument.text)
		], [cancelIndicator , buildable | 
			buildable.build(cancelIndicator)
		])
	}
	
	override didChange(DidChangeTextDocumentParams params) {
		requestManager.runWrite(
			[
			workspaceManager.didChange(
				params.textDocument.uri.toUri,
				params.textDocument.version,
				params.contentChanges.map [ event |
					var range = event.range
					if (range === null) {
						val originalDoc = workspaceManager.getDocument(params.textDocument.uri)
						val end = originalDoc.getPosition(originalDoc.contents.length)
						range = new Range(new Position(0, 0), end)
					}
					
					updateFile(params.textDocument.uri.toString,event.text)
					
					new TextEdit(range, event.text)
				]
			)
		], [ cancelIndicator, buildable |
			buildable.build(cancelIndicator)
		])

	}
	
	override didSave(DidSaveTextDocumentParams params) {
		// the document's content is in sync with the file system
		// doesn't matter to us, so do nothing
	}
	
	override didClose(DidCloseTextDocumentParams params) {
		requestManager.runWrite([
			workspaceManager.didClose(params.textDocument.uri.toUri)
		], [cancelIndicator , buildable | 
			buildable.build(cancelIndicator)
		])
	}
	
	override getIndex() {
		return CompletableFuture.supplyAsync( [workspaceManager.index] );
	}
	
	abstract def void updateFile(String fileUri, String newContent)
	
	abstract def void postIssues(String issues);
	
}