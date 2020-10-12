/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package kaulua.symbol;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import java.util.LinkedList;
import java.util.List;
import kaulua.common.DocumentExtensions;
import kaulua.common.UriExtensions;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.lsp4j.DocumentSymbol;
import org.eclipse.lsp4j.Location;
import org.eclipse.lsp4j.SymbolInformation;
import org.eclipse.lsp4j.SymbolKind;
import org.eclipse.xtext.findReferences.IReferenceFinder;
import org.eclipse.xtext.findReferences.TargetURICollector;
import org.eclipse.xtext.findReferences.TargetURIs;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.service.OperationCanceledManager;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
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
  private EObjectAtOffsetHelper _eObjectAtOffsetHelper;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private IReferenceFinder referenceFinder;
  
  @Inject
  private TargetURICollector targetURICollector;
  
  @Inject
  private Provider<TargetURIs> targetURIProvider;
  
  @Inject
  private OperationCanceledManager operationCanceledManager;
  
  @Inject
  private IResourceServiceProvider.Registry resourceServiceProviderRegistry;
  
  protected TargetURIs collectTargetURIs(final EObject targetObject) {
    final TargetURIs targetURIs = this.targetURIProvider.get();
    this.targetURICollector.add(targetObject, targetURIs);
    return targetURIs;
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
  
  public List<? extends SymbolInformation> getSymbols(final IResourceDescription resourceDescription, final String query, final ResourceSet rs, final CancelIndicator cancelIndicator) {
    final LinkedList<SymbolInformation> symbols = CollectionLiterals.<SymbolInformation>newLinkedList();
    final Resource resource = rs.getResource(resourceDescription.getURI(), true);
    Iterable<IEObjectDescription> _exportedObjects = resourceDescription.getExportedObjects();
    for (final IEObjectDescription description : _exportedObjects) {
      {
        this.operationCanceledManager.checkCanceled(cancelIndicator);
        boolean _filter = this.filter(description, query);
        if (_filter) {
          final Procedure1<SymbolInformation> _function = (SymbolInformation symbol) -> {
            symbols.add(symbol);
          };
          this.createSymbol(description, resource, _function);
        }
      }
    }
    return symbols;
  }
  
  protected boolean filter(final IEObjectDescription description, final String query) {
    return description.getQualifiedName().toLowerCase().toString().contains(query.toLowerCase());
  }
  
  protected void createSymbol(final IEObjectDescription description, final Resource resource, final Procedure1<? super SymbolInformation> acceptor) {
    final String name = this.getSymbolName(description);
    if ((name == null)) {
      return;
    }
    final SymbolKind kind = this.getSymbolKind(description);
    if ((kind == null)) {
      return;
    }
    final EObject object = resource.getResourceSet().getEObject(description.getEObjectURI(), true);
    if ((object != null)) {
      final Location location = this.getSymbolLocation(object);
      if ((location != null)) {
        final SymbolInformation symbol = new SymbolInformation(name, kind, location);
        acceptor.apply(symbol);
      }
    }
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
}
