package logo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.resource.XtextResource;

import io.opentracing.Span;
import io.opentracing.Tracer;
import io.opentracing.util.GlobalTracer;
import kaulua.symbol.AbstractSymbolJsonRPC;

public class SymbolJsonRPC extends AbstractSymbolJsonRPC {
	
	workspaceResource workspace;
	
	public void setWorkspace(workspaceResource workspace) {
		this.workspace = workspace;
	}
	storageResource storage;
	
	public void setStorage(storageResource storage) {
		this.storage = storage;
	}

	@Override
	public String requestDocument(String uri) {
		String content = storage.document(uri);
		return content;
	}

	@Override
	public String requestIndex() {
		String content = workspace.index();
		return content;
	}
	
	@Override
	public XtextResource loadModel(URI uri, String content) {
		
		Tracer tracer = GlobalTracer.get();
		Span span = tracer.buildSpan("load_model").start();
		
		XtextResource res = super.loadModel(uri, content);
		span.finish();
		
		return res;
	}
	
	@Override
	public ResourceSet loadModels(List<URI> uris) {
		
		ResourceSetImpl rs = new ResourceSetImpl();

		Map<URI, String> allResources = new HashMap<>();
		for (URI uri : uris) {
			String textDocument = requestDocument(uri.toString());
			allResources.put(uri, textDocument);
		}
		externalContentSupport.configureResourceSet(rs, new IExternalContentProvider() {
			Map<URI, String> contents = allResources;

			@Override
			public IExternalContentProvider getActualContentProvider() {
				return this;
			}

			@Override
			public String getContent(URI uri) {
				return contents.get(uri);
			}

			@Override
			public boolean hasContent(URI uri) {
				return true;
			}
		});
		
		Tracer tracer = GlobalTracer.get();
		Span span = tracer.buildSpan("load_model").start();
		for (URI uri : uris) {
			rs.getResource(uri,true);
		}
		span.finish();

		return rs;
	}
}
