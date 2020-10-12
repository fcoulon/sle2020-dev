package kaulua.references;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.inject.Inject;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import kaulua.common.Document;
import kaulua.findReferences.WorkspaceResourceAccess;
import kaulua.lsp.api.IReference;
import kaulua.references.DocumentSymbolService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.lsp4j.Location;
import org.eclipse.lsp4j.ReferenceParams;
import org.eclipse.xtext.resource.IExternalContentSupport;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;
import org.eclipse.xtext.resource.persistence.SerializableResourceDescription;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.UriExtensions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public abstract class AbstractReferenceJsonRPC implements IReference {
  @Inject
  @Extension
  private UriExtensions _uriExtensions;
  
  @Inject
  private DocumentSymbolService documentSymbolService;
  
  @Inject
  private IExternalContentSupport externalContentSupport;
  
  @Override
  public CompletableFuture<List<? extends Location>> references(final ReferenceParams params) {
    try {
      CompletableFuture<List<? extends Location>> _xblockexpression = null;
      {
        final URI uri = this._uriExtensions.toUri(params.getTextDocument().getUri());
        final String textDocument = this.requestDocument(params.getTextDocument().getUri());
        final Document document = new Document(Integer.valueOf(1), textDocument);
        final XtextResource mockResource = this.loadModel(uri, textDocument);
        final ArrayList<IResourceDescription> resDescriptions = new ArrayList<IResourceDescription>();
        final String serializedIndex = this.requestIndex();
        final Type typeOfSrc = new TypeToken<List<String>>() {
        }.getType();
        final List<String> response = new GsonBuilder().disableHtmlEscaping().create().<List<String>>fromJson(serializedIndex, typeOfSrc);
        for (final String element : response) {
          try {
            final byte[] bytes = Base64.getDecoder().decode(element);
            final ByteArrayInputStream stream = new ByteArrayInputStream(bytes);
            final ObjectInputStream input = new ObjectInputStream(stream);
            final SerializableResourceDescription chunk = new SerializableResourceDescription();
            chunk.readExternal(input);
            resDescriptions.add(chunk);
          } catch (final Throwable _t) {
            if (_t instanceof IOException) {
              final IOException e = (IOException)_t;
              e.printStackTrace();
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
        final ResourceDescriptionsData index = new ResourceDescriptionsData(resDescriptions);
        final WorkspaceResourceAccess resourceAcces = new WorkspaceResourceAccess(mockResource);
        final Supplier<List<? extends Location>> _function = () -> {
          return this.documentSymbolService.getReferences(document, mockResource, params, resourceAcces, index, CancelIndicator.NullImpl);
        };
        _xblockexpression = CompletableFuture.<List<? extends Location>>supplyAsync(_function);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
  
  public abstract String requestIndex();
}
