package kaulua.symbol

import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.google.inject.Inject
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.ObjectInputStream
import java.lang.reflect.Type
import java.util.ArrayList
import java.util.Base64
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.concurrent.CompletableFuture
import kaulua.common.UriExtensions
import kaulua.lsp.api.ISymbol
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.lsp4j.TextDocumentItem
import org.eclipse.lsp4j.WorkspaceSymbolParams
import org.eclipse.xtext.resource.IExternalContentSupport
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData
import org.eclipse.xtext.resource.persistence.SerializableResourceDescription
import org.eclipse.xtext.util.CancelIndicator

abstract class AbstractSymbolJsonRPC implements ISymbol {
	
	@Inject WorkspaceSymbolService workspaceSymbolService
	
	@Inject
	protected IExternalContentSupport externalContentSupport
	
	override symbol(WorkspaceSymbolParams params) {
		
		val resDescriptions = new ArrayList<IResourceDescription>()
		val serializedIndex = requestIndex()
		val Type typeOfSrc = new TypeToken<List<String>>(){}.getType();
		val List<String> response = new GsonBuilder().disableHtmlEscaping().create.fromJson(serializedIndex, typeOfSrc);
		
		for (element : response) {
			try {
				val byte[] bytes = Base64.getDecoder().decode(element);
				val ByteArrayInputStream stream = new ByteArrayInputStream(bytes);
				val input = new ObjectInputStream(stream)
				val chunk = input.readObject as SerializableResourceDescription
				resDescriptions.add(chunk)
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		val index = new ResourceDescriptionsData(resDescriptions)
		
		val allModelUris = index.allResourceDescriptions.map[resDesc | resDesc.URI].toList
		val allModels = loadModels(allModelUris);
		CompletableFuture.supplyAsync([workspaceSymbolService.getSymbols(params.query, allModels, index, CancelIndicator.NullImpl)])
		
	}
	
	def ResourceSet loadModels(List<URI> uris) {
		val rs = new ResourceSetImpl();
		
		val Map<URI,String> allResources = new HashMap();
		for(uri : uris) {
			val textDocument = requestDocument(uri.toString)
			allResources.put(uri,textDocument)
		}
		 externalContentSupport.configureResourceSet(rs, new IExternalContentProvider() {
		 	val Map<URI,String> contents = allResources;
			override getActualContentProvider() { return this }
			override getContent(URI uri) { contents.get(uri) }
			override hasContent(URI uri) { true }
		})
		
		return rs
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
