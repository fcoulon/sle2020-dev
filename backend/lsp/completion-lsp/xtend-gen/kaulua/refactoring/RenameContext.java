/**
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package kaulua.refactoring;

import java.util.List;
import kaulua.refactoring.RefactoringIssueAcceptor;
import kaulua.refactoring.RenameChange;
import kaulua.serializer.IChangeSerializer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author koehnlein - Initial contribution and API
 * @since 2.13
 */
@FinalFieldsConstructor
@Accessors(AccessorType.PUBLIC_GETTER)
@SuppressWarnings("all")
public class RenameContext {
  private final List<? extends RenameChange> changes;
  
  private final Resource resource;
  
  private final IChangeSerializer changeSerializer;
  
  private final RefactoringIssueAcceptor issues;
  
  public void addModification(final RenameChange change, final IChangeSerializer.IModification<EObject> modification) {
    final EObject target = this.resource.getResourceSet().getEObject(change.getTargetURI(), true);
    if ((target instanceof EObject)) {
      EcoreUtil.resolveAll(target.eResource());
      this.changeSerializer.<EObject>addModification(target, modification);
    } else {
      this.issues.add(RefactoringIssueAcceptor.Severity.ERROR, "Element cannot be found", change.getTargetURI());
    }
  }
  
  public RenameContext(final List<? extends RenameChange> changes, final Resource resource, final IChangeSerializer changeSerializer, final RefactoringIssueAcceptor issues) {
    super();
    this.changes = changes;
    this.resource = resource;
    this.changeSerializer = changeSerializer;
    this.issues = issues;
  }
  
  @Pure
  public List<? extends RenameChange> getChanges() {
    return this.changes;
  }
  
  @Pure
  public Resource getResource() {
    return this.resource;
  }
  
  @Pure
  public IChangeSerializer getChangeSerializer() {
    return this.changeSerializer;
  }
  
  @Pure
  public RefactoringIssueAcceptor getIssues() {
    return this.issues;
  }
}
