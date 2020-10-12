/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package fr.cea.nabla.ide;

import com.google.inject.Inject;
import fr.cea.nabla.LatexLabelServices;
import fr.cea.nabla.ide.CustomDocumentHighlight;
import fr.cea.nabla.nabla.Instruction;
import fr.cea.nabla.nabla.Job;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.lsp4j.DocumentHighlight;
import org.eclipse.lsp4j.DocumentHighlightKind;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.TextDocumentPositionParams;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.ide.server.Document;
import org.eclipse.xtext.ide.server.LanguageServerImpl;
import org.eclipse.xtext.ide.server.UriExtensions;
import org.eclipse.xtext.ide.server.WorkspaceManager;
import org.eclipse.xtext.ide.server.occurrences.IDocumentHighlightService;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class CustomLanguageServerImpl extends LanguageServerImpl {
  @Inject
  @Extension
  private UriExtensions _uriExtensions;
  
  @Inject
  @Extension
  private IResourceServiceProvider.Registry languagesRegistry;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private WorkspaceManager manager;
  
  @Inject
  private EObjectAtOffsetHelper eObjectAtOffsetHelper;
  
  @Inject
  @Override
  public void setWorkspaceManager(final WorkspaceManager manager) {
    super.setWorkspaceManager(manager);
    this.manager = manager;
  }
  
  @Override
  public CompletableFuture<List<? extends DocumentHighlight>> documentHighlight(final TextDocumentPositionParams params) {
    final Function1<CancelIndicator, List<? extends DocumentHighlight>> _function = (CancelIndicator cancelIndicator) -> {
      final URI uri = this._uriExtensions.toUri(params.getTextDocument().getUri());
      final IResourceServiceProvider serviceProvider = this.languagesRegistry.getResourceServiceProvider(uri);
      IDocumentHighlightService _get = null;
      if (serviceProvider!=null) {
        _get=serviceProvider.<IDocumentHighlightService>get(IDocumentHighlightService.class);
      }
      final IDocumentHighlightService service = _get;
      if ((service == null)) {
        return CollectionLiterals.<DocumentHighlight>emptyList();
      }
      final Function2<Document, XtextResource, List<? extends DocumentHighlight>> _function_1 = (Document doc, XtextResource resource) -> {
        final int offSet = doc.getOffSet(params.getPosition());
        final EObject containedElementAt = this.eObjectAtOffsetHelper.resolveContainedElementAt(resource, offSet);
        final List<? extends DocumentHighlight> res = service.getDocumentHighlights(doc, resource, params, cancelIndicator);
        boolean _isEmpty = res.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          final EObject nablaElt = this.getJobOrInstruction(containedElementAt);
          if ((nablaElt != null)) {
            final String latex = LatexLabelServices.getLatex(nablaElt);
            final List<DocumentHighlight> myList = CollectionLiterals.<DocumentHighlight>newArrayList();
            final Procedure2<DocumentHighlight, Integer> _function_2 = (DocumentHighlight element, Integer index) -> {
              if (((index).intValue() == 0)) {
                Range _range = element.getRange();
                DocumentHighlightKind _kind = element.getKind();
                final CustomDocumentHighlight replacedElement = new CustomDocumentHighlight(_range, _kind, latex);
                myList.add(replacedElement);
              } else {
                myList.add(element);
              }
            };
            IterableExtensions.forEach(res, _function_2);
            return myList;
          }
        }
        return res;
      };
      return this.manager.<List<? extends DocumentHighlight>>doRead(uri, _function_1);
    };
    return this.getRequestManager().<List<? extends DocumentHighlight>>runRead(_function);
  }
  
  private EObject getJobOrInstruction(final EObject elt) {
    EObject _switchResult = null;
    boolean _matched = false;
    if (elt instanceof Job) {
      _matched=true;
      _switchResult = elt;
    }
    if (!_matched) {
      if (elt instanceof Instruction) {
        _matched=true;
        _switchResult = elt;
      }
    }
    if (!_matched) {
      EObject _xifexpression = null;
      EObject _eContainer = elt.eContainer();
      boolean _tripleEquals = (_eContainer == null);
      if (_tripleEquals) {
        _xifexpression = null;
      } else {
        _xifexpression = this.getJobOrInstruction(elt.eContainer());
      }
      _switchResult = _xifexpression;
    }
    return _switchResult;
  }
  
  @Pure
  public WorkspaceManager getManager() {
    return this.manager;
  }
}
