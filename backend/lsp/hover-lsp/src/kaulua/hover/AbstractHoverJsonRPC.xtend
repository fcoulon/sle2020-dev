package kaulua.hover

import com.google.inject.Inject
import java.util.concurrent.CompletableFuture
import kaulua.common.Document
import kaulua.lsp.api.IHover
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.lsp4j.TextDocumentItem
import org.eclipse.lsp4j.TextDocumentPositionParams
import org.eclipse.xtext.resource.IExternalContentSupport
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.util.UriExtensions

abstract class AbstractHoverJsonRPC implements IHover {
	
	@Inject	extension UriExtensions
	
	@Inject
	IExternalContentSupport externalContentSupport
	
	@Inject
	IHoverService hoverService
	
	override hover(TextDocumentPositionParams params) {
		
		val uri = params.textDocument.uri.toUri
		
		val textDocument = requestDocument(params.textDocument.uri)
		val document = new Document(1,textDocument)
		val XtextResource mockResource = loadModel(uri,textDocument)
		
		return CompletableFuture.supplyAsync([hoverService.hover(document, mockResource, params, CancelIndicator.NullImpl)])
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
