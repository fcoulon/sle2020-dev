package kaulua.documentsymbol

import com.google.inject.Inject
import java.util.concurrent.CompletableFuture
import kaulua.common.UriExtensions
import kaulua.lsp.api.IDocumentSymbol
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.lsp4j.DocumentSymbolParams
import org.eclipse.lsp4j.TextDocumentItem
import org.eclipse.xtext.resource.IExternalContentSupport
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator

abstract class AbstractDocumentSymbolJsonRPC implements IDocumentSymbol {
	
	@Inject	extension UriExtensions
	
	@Inject
	protected DocumentSymbolService documentSymbolService
	
	@Inject
	IExternalContentSupport externalContentSupport
	
	override documentSymbol(DocumentSymbolParams params) {
		
		val uri = params.textDocument.uri.toUri
		val textDocument = requestDocument(params.textDocument.uri)
		val XtextResource mockResource = loadModel(uri,textDocument)
		
		return CompletableFuture.completedFuture(documentSymbolService.getSymbols(mockResource, CancelIndicator.NullImpl))
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
	
	abstract def String requestDocument(String uri);
	
}