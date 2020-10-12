package kaulua.symbol;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.inject.Inject;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import kaulua.lsp.api.ISymbol;
import kaulua.symbol.WorkspaceSymbolService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.lsp4j.SymbolInformation;
import org.eclipse.lsp4j.WorkspaceSymbolParams;
import org.eclipse.xtext.resource.IExternalContentSupport;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;
import org.eclipse.xtext.resource.persistence.SerializableResourceDescription;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public abstract class AbstractSymbolJsonRPC implements ISymbol {
  @Inject
  private WorkspaceSymbolService workspaceSymbolService;
  
  @Inject
  protected IExternalContentSupport externalContentSupport;
  
  @Override
  public CompletableFuture<List<? extends SymbolInformation>> symbol(final WorkspaceSymbolParams params) {
    try {
      CompletableFuture<List<? extends SymbolInformation>> _xblockexpression = null;
      {
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
            Object _readObject = input.readObject();
            final SerializableResourceDescription chunk = ((SerializableResourceDescription) _readObject);
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
        final Function1<IResourceDescription, URI> _function = (IResourceDescription resDesc) -> {
          return resDesc.getURI();
        };
        final List<URI> allModelUris = IterableExtensions.<URI>toList(IterableExtensions.<IResourceDescription, URI>map(index.getAllResourceDescriptions(), _function));
        final ResourceSet allModels = this.loadModels(allModelUris);
        final Supplier<List<? extends SymbolInformation>> _function_1 = () -> {
          return this.workspaceSymbolService.getSymbols(params.getQuery(), allModels, index, CancelIndicator.NullImpl);
        };
        _xblockexpression = CompletableFuture.<List<? extends SymbolInformation>>supplyAsync(_function_1);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public ResourceSet loadModels(final List<URI> uris) {
    abstract class __AbstractSymbolJsonRPC_2 implements IExternalContentSupport.IExternalContentProvider {
      Map<URI, String> contents;
    }
    
    final ResourceSetImpl rs = new ResourceSetImpl();
    final Map<URI, String> allResources = new HashMap<URI, String>();
    for (final URI uri : uris) {
      {
        final String textDocument = this.requestDocument(uri.toString());
        allResources.put(uri, textDocument);
      }
    }
    __AbstractSymbolJsonRPC_2 ___AbstractSymbolJsonRPC_2 = new __AbstractSymbolJsonRPC_2() {
      {
        contents = allResources;
      }
      @Override
      public IExternalContentSupport.IExternalContentProvider getActualContentProvider() {
        return this;
      }
      
      @Override
      public String getContent(final URI uri) {
        return this.contents.get(uri);
      }
      
      @Override
      public boolean hasContent(final URI uri) {
        return true;
      }
    };
    this.externalContentSupport.configureResourceSet(rs, ___AbstractSymbolJsonRPC_2);
    return rs;
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
