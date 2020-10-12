package nablab;

import org.eclipse.emf.common.util.URI;
import org.eclipse.lsp4j.TextDocumentItem;
import org.eclipse.xtext.resource.XtextResource;

import com.google.gson.GsonBuilder;

import io.opentracing.Span;
import io.opentracing.Tracer;
import io.opentracing.util.GlobalTracer;
import kaulua.references.AbstractReferenceJsonRPC;

public class ReferencesJsonRPC extends AbstractReferenceJsonRPC {
	
	workspaceResource workspace;
	storageResource storage;
	
	public void setWorkspace(workspaceResource workspace) {
		this.workspace = workspace;
	}
	
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

}
