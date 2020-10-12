package kaulua.highlight

import com.google.inject.Inject
import java.util.List
import java.util.concurrent.CompletableFuture
import kaulua.common.Document
import kaulua.lsp.api.IDocumentHighlight
import kaulua.occurences.IDocumentHighlightService
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.lsp4j.DocumentHighlight
import org.eclipse.lsp4j.TextDocumentItem
import org.eclipse.lsp4j.TextDocumentPositionParams
import org.eclipse.xtext.resource.IExternalContentSupport
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.util.UriExtensions

abstract class AbstractHighlightJsonRPC implements IDocumentHighlight {
	
	@Inject	extension UriExtensions
	
	@Inject
	IExternalContentSupport externalContentSupport
	
	@Inject
	IDocumentHighlightService highlightService
	
	override CompletableFuture<List<? extends DocumentHighlight>> documentHighlight(TextDocumentPositionParams params) {
		
		val uri = params.textDocument.uri.toUri
		val textDocument = requestDocument(params.textDocument.uri)
		val document = new Document(1,textDocument)
		val XtextResource mockResource = loadModel(uri,textDocument)
		System.out.println("[DEBUG] 3");
		return CompletableFuture.supplyAsync([highlightService.getDocumentHighlights(document, mockResource, params, CancelIndicator.NullImpl)])

	}
	
	def XtextResource loadModel(URI uri, String content) {
		 val rs = new ResourceSetImpl()
		 externalContentSupport.configureResourceSet(rs, new IExternalContentProvider() {
			override getActualContentProvider() { return this }
			override getContent(URI uri) { content }
			override hasContent(URI uri) { true }
		})
		return rs.getResource(uri,true) as XtextResource
	}
	
	def abstract String requestDocument(String uri);

}
