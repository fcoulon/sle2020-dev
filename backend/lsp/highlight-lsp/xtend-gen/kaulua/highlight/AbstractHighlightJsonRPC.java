package kaulua.highlight;

import com.google.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import kaulua.common.Document;
import kaulua.lsp.api.IDocumentHighlight;
import kaulua.occurences.IDocumentHighlightService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.lsp4j.DocumentHighlight;
import org.eclipse.lsp4j.TextDocumentPositionParams;
import org.eclipse.xtext.resource.IExternalContentSupport;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.UriExtensions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public abstract class AbstractHighlightJsonRPC implements IDocumentHighlight {
  @Inject
  @Extension
  private UriExtensions _uriExtensions;
  
  @Inject
  private IExternalContentSupport externalContentSupport;
  
  @Inject
  private IDocumentHighlightService highlightService;
  
  @Override
  public CompletableFuture<List<? extends DocumentHighlight>> documentHighlight(final TextDocumentPositionParams params) {
    final URI uri = this._uriExtensions.toUri(params.getTextDocument().getUri());
    final String textDocument = this.requestDocument(params.getTextDocument().getUri());
    final Document document = new Document(Integer.valueOf(1), textDocument);
    final XtextResource mockResource = this.loadModel(uri, textDocument);
    System.out.println("[DEBUG] 3");
    final Supplier<List<? extends DocumentHighlight>> _function = () -> {
      return this.highlightService.getDocumentHighlights(document, mockResource, params, CancelIndicator.NullImpl);
    };
    return CompletableFuture.<List<? extends DocumentHighlight>>supplyAsync(_function);
  }
  
  public XtextResource loadModel(final URI uri, final String content) {
    final ResourceSetImpl rs = new ResourceSetImpl();
    this.externalContentSupport.configureResourceSet(rs, new IExternalContentSupport.IExternalContentProvider() {
      @Override
      public IExternalContentSupport.IExternalContentProvider getActualContentProvider() {
        return this;
      }
      
      @Override
      public String getContent(final URI uri) {
        return content;
      }
      
      @Override
      public boolean hasContent(final URI uri) {
        return true;
      }
    });
    Resource _resource = rs.getResource(uri, true);
    return ((XtextResource) _resource);
  }
  
  public abstract String requestDocument(final String uri);
}
