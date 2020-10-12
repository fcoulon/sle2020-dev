package kaulua.completion;

import com.google.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import kaulua.common.Document;
import kaulua.common.UriExtensions;
import kaulua.completion.ContentAssistService;
import kaulua.lsp.api.ICompletion;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.lsp4j.CompletionItem;
import org.eclipse.lsp4j.CompletionList;
import org.eclipse.lsp4j.CompletionParams;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.xtext.resource.IExternalContentSupport;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public abstract class AbstractCompletionJsonRPC implements ICompletion {
  @Inject
  @Extension
  private UriExtensions _uriExtensions;
  
  @Inject
  private ContentAssistService contentAssistService;
  
  @Inject
  private IExternalContentSupport externalContentSupport;
  
  @Inject
  private XtextResourceFactory xtextResourceFactory;
  
  @Override
  public CompletableFuture<Either<List<CompletionItem>, CompletionList>> completion(final CompletionParams params) {
    System.out.println("[DEBUG] 0");
    final URI uri = this._uriExtensions.toUri(params.getTextDocument().getUri());
    final String textDocument = this.requestDocument(params.getTextDocument().getUri());
    final Document document = new Document(Integer.valueOf(1), textDocument);
    final XtextResource mockResource = this.loadModel(uri, textDocument);
    System.out.println("[DEBUG] -1");
    final Supplier<Either<List<CompletionItem>, CompletionList>> _function = () -> {
      return Either.<List<CompletionItem>, CompletionList>forRight(this.contentAssistService.createCompletionList(document, mockResource, params, CancelIndicator.NullImpl));
    };
    return CompletableFuture.<Either<List<CompletionItem>, CompletionList>>supplyAsync(_function);
  }
  
  public CompletableFuture<CompletionItem> resolveCompletionItem(final CompletionItem unresolved) {
    return CompletableFuture.<CompletionItem>completedFuture(unresolved);
  }
  
  public XtextResource loadModel(final URI uri, final String content) {
    final ResourceSetImpl rs = new ResourceSetImpl();
    rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xtext", this.xtextResourceFactory);
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
