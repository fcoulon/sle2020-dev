/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package kaulua.documentsymbol;

import com.google.common.collect.Iterables;
import com.google.common.graph.SuccessorsFunction;
import com.google.common.graph.Traverser;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kaulua.common.DocumentExtensions;
import kaulua.common.UriExtensions;
import kaulua.documentsymbol.HierarchicalDocumentSymbolService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.lsp4j.DocumentSymbol;
import org.eclipse.lsp4j.Location;
import org.eclipse.lsp4j.SymbolInformation;
import org.eclipse.lsp4j.SymbolKind;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.xtext.findReferences.IReferenceFinder;
import org.eclipse.xtext.findReferences.TargetURICollector;
import org.eclipse.xtext.findReferences.TargetURIs;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.service.OperationCanceledManager;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.11
 */
@Singleton
@SuppressWarnings("all")
public class DocumentSymbolService {
  @Inject
  @Extension
  private UriExtensions _uriExtensions;
  
  @Inject
  @Extension
  private DocumentExtensions _documentExtensions;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private TargetURICollector targetURICollector;
  
  @Inject
  private Provider<TargetURIs> targetURIProvider;
  
  @Inject
  private OperationCanceledManager operationCanceledManager;
  
  @Inject
  private HierarchicalDocumentSymbolService hierarchicalDocumentSymbolService;
  
  protected TargetURIs collectTargetURIs(final EObject targetObject) {
    final TargetURIs targetURIs = this.targetURIProvider.get();
    this.targetURICollector.add(targetObject, targetURIs);
    return targetURIs;
  }
  
  public List<Either<SymbolInformation, DocumentSymbol>> getSymbols(final XtextResource resource, final CancelIndicator cancelIndicator) {
    final String uri = this._uriExtensions.toUriString(resource.getURI());
    final ArrayList<SymbolInformation> infos = CollectionLiterals.<SymbolInformation>newArrayList();
    final Function1<Either<SymbolInformation, DocumentSymbol>, DocumentSymbol> _function = (Either<SymbolInformation, DocumentSymbol> it) -> {
      return it.getRight();
    };
    final List<DocumentSymbol> rootSymbols = ListExtensions.<Either<SymbolInformation, DocumentSymbol>, DocumentSymbol>map(this.hierarchicalDocumentSymbolService.getSymbols(resource, cancelIndicator), _function);
    final Consumer<DocumentSymbol> _function_1 = (DocumentSymbol rootSymbol) -> {
      final SuccessorsFunction<DocumentSymbol> _function_2 = (DocumentSymbol it) -> {
        return it.getChildren();
      };
      final Iterable<DocumentSymbol> symbols = Traverser.<DocumentSymbol>forTree(_function_2).depthFirstPreOrder(rootSymbol);
      final Function1<DocumentSymbol, String> _function_3 = (DocumentSymbol symbol) -> {
        final Function1<DocumentSymbol, Boolean> _function_4 = (DocumentSymbol it) -> {
          return Boolean.valueOf((((it != symbol) && (!IterableExtensions.isNullOrEmpty(it.getChildren()))) && it.getChildren().contains(symbol)));
        };
        DocumentSymbol _findFirst = IterableExtensions.<DocumentSymbol>findFirst(symbols, _function_4);
        String _name = null;
        if (_findFirst!=null) {
          _name=_findFirst.getName();
        }
        return _name;
      };
      final Function1<? super DocumentSymbol, ? extends String> containerNameProvider = _function_3;
      final Function1<DocumentSymbol, SymbolInformation> _function_4 = (DocumentSymbol it) -> {
        return this.createSymbol(uri, it, containerNameProvider);
      };
      Iterables.<SymbolInformation>addAll(infos, IterableExtensions.<DocumentSymbol, SymbolInformation>map(symbols, _function_4));
    };
    rootSymbols.forEach(_function_1);
    final Function1<SymbolInformation, Either<SymbolInformation, DocumentSymbol>> _function_2 = (SymbolInformation it) -> {
      return Either.<SymbolInformation, DocumentSymbol>forLeft(it);
    };
    return ListExtensions.<SymbolInformation, Either<SymbolInformation, DocumentSymbol>>map(infos, _function_2);
  }
  
  protected EObject getContainer(final EObject obj) {
    return obj.eContainer();
  }
  
  /**
   * @since 2.16
   */
  protected SymbolInformation createSymbol(final String uri, final DocumentSymbol symbol, final Function1<? super DocumentSymbol, ? extends String> containerNameProvider) {
    SymbolInformation _symbolInformation = new SymbolInformation();
    final Procedure1<SymbolInformation> _function = (SymbolInformation it) -> {
      it.setName(symbol.getName());
      it.setKind(symbol.getKind());
      it.setDeprecated(symbol.getDeprecated());
      Location _location = new Location();
      final Procedure1<Location> _function_1 = (Location it_1) -> {
        it_1.setUri(uri);
        it_1.setRange(symbol.getSelectionRange());
      };
      Location _doubleArrow = ObjectExtensions.<Location>operator_doubleArrow(_location, _function_1);
      it.setLocation(_doubleArrow);
      it.setContainerName(containerNameProvider.apply(symbol));
    };
    return ObjectExtensions.<SymbolInformation>operator_doubleArrow(_symbolInformation, _function);
  }
  
  protected SymbolInformation createSymbol(final EObject object) {
    final String name = this.getSymbolName(object);
    if ((name == null)) {
      return null;
    }
    final SymbolKind kind = this.getSymbolKind(object);
    if ((kind == null)) {
      return null;
    }
    final Location location = this.getSymbolLocation(object);
    if ((location == null)) {
      return null;
    }
    final SymbolInformation symbol = new SymbolInformation();
    symbol.setName(name);
    symbol.setKind(kind);
    symbol.setLocation(location);
    return symbol;
  }
  
  protected String getSymbolName(final EObject object) {
    return this.getSymbolName(this._iQualifiedNameProvider.getFullyQualifiedName(object));
  }
  
  protected SymbolKind getSymbolKind(final EObject object) {
    return this.getSymbolKind(object.eClass());
  }
  
  protected Location getSymbolLocation(final EObject object) {
    return this._documentExtensions.newLocation(object);
  }
  
  protected boolean filter(final IEObjectDescription description, final String query) {
    return description.getQualifiedName().toLowerCase().toString().contains(query.toLowerCase());
  }
  
  protected void createSymbol(final IEObjectDescription description, final IReferenceFinder.IResourceAccess resourceAccess, final Procedure1<? super SymbolInformation> acceptor) {
    final String name = this.getSymbolName(description);
    if ((name == null)) {
      return;
    }
    final SymbolKind kind = this.getSymbolKind(description);
    if ((kind == null)) {
      return;
    }
    final Procedure1<Location> _function = (Location location) -> {
      final SymbolInformation symbol = new SymbolInformation(name, kind, location);
      acceptor.apply(symbol);
    };
    this.getSymbolLocation(description, resourceAccess, _function);
  }
  
  protected SymbolInformation createSymbol(final IEObjectDescription description) {
    final String symbolName = this.getSymbolName(description);
    if ((symbolName == null)) {
      return null;
    }
    final SymbolKind symbolKind = this.getSymbolKind(description);
    if ((symbolKind == null)) {
      return null;
    }
    final SymbolInformation symbol = new SymbolInformation();
    symbol.setName(symbolName);
    symbol.setKind(symbolKind);
    return symbol;
  }
  
  protected String getSymbolName(final IEObjectDescription description) {
    return this.getSymbolName(description.getQualifiedName());
  }
  
  protected SymbolKind getSymbolKind(final IEObjectDescription description) {
    return this.getSymbolKind(description.getEClass());
  }
  
  protected void getSymbolLocation(final IEObjectDescription description, final IReferenceFinder.IResourceAccess resourceAccess, final Procedure1<? super Location> acceptor) {
    final Procedure1<EObject> _function = (EObject obj) -> {
      final Location location = this.getSymbolLocation(obj);
      if ((location != null)) {
        acceptor.apply(location);
      }
    };
    this.doRead(resourceAccess, description.getEObjectURI(), _function);
  }
  
  protected String getSymbolName(final QualifiedName qualifiedName) {
    String _string = null;
    if (qualifiedName!=null) {
      _string=qualifiedName.toString();
    }
    return _string;
  }
  
  protected SymbolKind getSymbolKind(final EClass type) {
    return SymbolKind.Property;
  }
  
  protected void doRead(final IReferenceFinder.IResourceAccess resourceAccess, final URI objectURI, final Procedure1<? super EObject> acceptor) {
    final IUnitOfWork<Object, ResourceSet> _function = (ResourceSet resourceSet) -> {
      final EObject object = resourceSet.getEObject(objectURI, true);
      if ((object != null)) {
        acceptor.apply(object);
      }
      return null;
    };
    resourceAccess.<Object>readOnly(objectURI, _function);
  }
}
