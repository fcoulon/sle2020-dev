/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package kaulua.symbol;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.LinkedList;
import java.util.List;
import kaulua.symbol.DocumentSymbolService;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.lsp4j.SymbolInformation;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.11
 */
@Singleton
@SuppressWarnings("all")
public class WorkspaceSymbolService {
  @Inject
  private DocumentSymbolService documentSymbolService;
  
  public List<? extends SymbolInformation> getSymbols(final String query, final ResourceSet rs, final IResourceDescriptions indexData, final CancelIndicator cancelIndicator) {
    final LinkedList<SymbolInformation> result = CollectionLiterals.<SymbolInformation>newLinkedList();
    Iterable<IResourceDescription> _allResourceDescriptions = indexData.getAllResourceDescriptions();
    for (final IResourceDescription resourceDescription : _allResourceDescriptions) {
      List<? extends SymbolInformation> _symbols = this.documentSymbolService.getSymbols(resourceDescription, query, rs, cancelIndicator);
      Iterables.<SymbolInformation>addAll(result, _symbols);
    }
    return result;
  }
}
