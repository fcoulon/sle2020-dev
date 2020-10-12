/**
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package kaulua.rename;

import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Collections;
import kaulua.common.Document;
import kaulua.common.UriExtensions;
import kaulua.refactoring.IRenameStrategy2;
import kaulua.refactoring.RenameChange;
import kaulua.refactoring.RenameContext;
import kaulua.rename.ChangeConverter;
import kaulua.rename.RefactoringIssueAcceptor;
import kaulua.rename.ServerRefactoringIssueAcceptor;
import kaulua.serializer.IChangeSerializer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.lsp4j.RenameParams;
import org.eclipse.lsp4j.WorkspaceEdit;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * @author koehnlein - Initial contribution and API
 * @since 2.13
 */
@SuppressWarnings("all")
public class RenameService {
  @Inject
  @Extension
  private EObjectAtOffsetHelper _eObjectAtOffsetHelper;
  
  @Inject
  private IRenameStrategy2 renameStrategy;
  
  @Inject
  private ChangeConverter.Factory converterFactory;
  
  @Inject
  @Extension
  private UriExtensions _uriExtensions;
  
  @Inject
  private Provider<IChangeSerializer> changeSerializerProvider;
  
  @Inject
  private Provider<ServerRefactoringIssueAcceptor> issueProvider;
  
  public WorkspaceEdit rename(final Document document, final XtextResource xtextResource, final RenameParams renameParams, final CancelIndicator cancelIndicator) {
    final URI uri = this._uriExtensions.toUri(renameParams.getTextDocument().getUri());
    final ServerRefactoringIssueAcceptor issueAcceptor = this.issueProvider.get();
    final int offset = document.getOffSet(renameParams.getPosition());
    final WorkspaceEdit workspaceEdit = new WorkspaceEdit();
    final EObject element = this._eObjectAtOffsetHelper.resolveElementAt(xtextResource, offset);
    if (((element == null) || element.eIsProxy())) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("No element found at position line:�renameParams.position.line� column:�renameParams.position.character�");
      issueAcceptor.add(RefactoringIssueAcceptor.Severity.FATAL, _builder.toString());
    } else {
      String _newName = renameParams.getNewName();
      URI _uRI = EcoreUtil.getURI(element);
      final RenameChange change = new RenameChange(_newName, _uRI);
      final IChangeSerializer changeSerializer = this.changeSerializerProvider.get();
      final RenameContext context = new RenameContext(Collections.<RenameChange>unmodifiableList(CollectionLiterals.<RenameChange>newArrayList(change)), xtextResource, changeSerializer, issueAcceptor);
      this.renameStrategy.applyRename(context);
      final ChangeConverter changeConverter = this.converterFactory.create(document, xtextResource, workspaceEdit);
      changeSerializer.applyModifications(changeConverter);
    }
    return workspaceEdit;
  }
}
