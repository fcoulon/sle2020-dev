package logo;

import org.eclipse.emf.common.util.URI;
import org.eclipse.lsp4j.TextDocumentItem;
import org.eclipse.xtext.resource.XtextResource;

import com.google.gson.GsonBuilder;

import io.opentracing.Span;
import io.opentracing.Tracer;
import io.opentracing.util.GlobalTracer;
import kaulua.rename.AbstractRenameJsonRPC;

public class RenameJsonRPC extends AbstractRenameJsonRPC {
	
	storageResource workspace;
	
	public void setWorkspace(storageResource workspace) {
		this.workspace = workspace;
	}

	@Override
	public String requestDocument(String uri) {
		String content = workspace.document(uri);
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
