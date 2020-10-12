package kaulua.completion

import com.google.inject.Inject
import java.util.concurrent.CompletableFuture
import kaulua.common.Document
import kaulua.common.UriExtensions
import kaulua.lsp.api.ICompletion
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.lsp4j.CompletionItem
import org.eclipse.lsp4j.CompletionParams
import org.eclipse.lsp4j.TextDocumentItem
import org.eclipse.lsp4j.jsonrpc.messages.Either
import org.eclipse.xtext.resource.IExternalContentSupport
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceFactory
import org.eclipse.xtext.util.CancelIndicator

abstract class AbstractCompletionJsonRPC implements ICompletion {
	
	@Inject	extension UriExtensions
	
	@Inject
	ContentAssistService contentAssistService
	
	@Inject
	IExternalContentSupport externalContentSupport
	
	@Inject
	XtextResourceFactory xtextResourceFactory
	
	override completion(CompletionParams params) {
		
		System.out.println("[DEBUG] 0");
		
		val uri = params.textDocument.uri.toUri
		val textDocument = requestDocument(params.textDocument.uri)
		val document = new Document(1,textDocument)
		val XtextResource mockResource = loadModel(uri,textDocument)
		
		System.out.println("[DEBUG] -1");
		return CompletableFuture.supplyAsync([Either.forRight(contentAssistService.createCompletionList(document, mockResource, params, CancelIndicator.NullImpl))])
	}
	
	def resolveCompletionItem(CompletionItem unresolved) {
		return CompletableFuture.completedFuture(unresolved)
	}
	
	def XtextResource loadModel(URI uri, String content) {
		val rs = new ResourceSetImpl()
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("xtext", xtextResourceFactory);
	 	externalContentSupport.configureResourceSet(rs, new IExternalContentProvider() {
			override getActualContentProvider() { return this }
			override getContent(URI uri) { content }
			override hasContent(URI uri) { true }
		})
		return rs.getResource(uri,true) as XtextResource
	}
	
	def abstract String requestDocument(String uri);

}
