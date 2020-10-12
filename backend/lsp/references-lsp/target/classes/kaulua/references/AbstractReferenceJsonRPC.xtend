package kaulua.references

import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.google.inject.Inject
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.ObjectInputStream
import java.lang.reflect.Type
import java.util.ArrayList
import java.util.Base64
import java.util.List
import java.util.concurrent.CompletableFuture
import kaulua.common.Document
import kaulua.findReferences.WorkspaceResourceAccess
import kaulua.lsp.api.IReference
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.lsp4j.ReferenceParams
import org.eclipse.lsp4j.TextDocumentItem
import org.eclipse.xtext.resource.IExternalContentSupport
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData
import org.eclipse.xtext.resource.persistence.SerializableResourceDescription
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.util.UriExtensions

abstract class AbstractReferenceJsonRPC implements IReference {
	
	@Inject	extension UriExtensions
	
	@Inject
	DocumentSymbolService documentSymbolService
	
	@Inject
	IExternalContentSupport externalContentSupport
	
	override references(ReferenceParams params) {
		
		val uri = params.textDocument.uri.toUri
		val textDocument = requestDocument(params.textDocument.uri)
		val document = new Document(1,textDocument)
		val XtextResource mockResource = loadModel(uri,textDocument)
		
		val resDescriptions = new ArrayList<IResourceDescription>()
		val serializedIndex = requestIndex()
		val Type typeOfSrc = new TypeToken<List<String>>(){}.getType();
		val List<String> response = new GsonBuilder().disableHtmlEscaping().create.fromJson(serializedIndex, typeOfSrc);
		
		for (element : response) {
			try {
				val byte[] bytes = Base64.getDecoder().decode(element);
				val ByteArrayInputStream stream = new ByteArrayInputStream(bytes);
				val input = new ObjectInputStream(stream)
				val chunk = new SerializableResourceDescription()
				chunk.readExternal(input)
				resDescriptions.add(chunk)
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		val index = new ResourceDescriptionsData(resDescriptions)
		
		val resourceAcces = new WorkspaceResourceAccess(mockResource)
		CompletableFuture.supplyAsync([documentSymbolService.getReferences(document, mockResource, params, resourceAcces, index, CancelIndicator.NullImpl)])
		
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
	
	def abstract String requestIndex();

}
