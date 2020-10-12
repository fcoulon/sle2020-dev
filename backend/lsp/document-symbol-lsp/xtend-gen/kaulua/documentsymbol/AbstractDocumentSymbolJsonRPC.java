package kaulua.documentsymbol;

import com.google.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import kaulua.common.UriExtensions;
import kaulua.documentsymbol.DocumentSymbolService;
import kaulua.lsp.api.IDocumentSymbol;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.lsp4j.DocumentSymbol;
import org.eclipse.lsp4j.DocumentSymbolParams;
import org.eclipse.lsp4j.SymbolInformation;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.xtext.resource.IExternalContentSupport;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public abstract class AbstractDocumentSymbolJsonRPC implements IDocumentSymbol {
  @Inject
  @Extension
  private UriExtensions _uriExtensions;
  
  @Inject
  protected DocumentSymbolService documentSymbolService;
  
  @Inject
  private IExternalContentSupport externalContentSupport;
  
  @Override
  public CompletableFuture<List<Either<SymbolInformation, DocumentSymbol>>> documentSymbol(final DocumentSymbolParams params) {
    final URI uri = this._uriExtensions.toUri(params.getTextDocument().getUri());
    final String textDocument = this.requestDocument(params.getTextDocument().getUri());
    final XtextResource mockResource = this.loadModel(uri, textDocument);
    return CompletableFuture.<List<Either<SymbolInformation, DocumentSymbol>>>completedFuture(this.documentSymbolService.getSymbols(mockResource, CancelIndicator.NullImpl));
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
