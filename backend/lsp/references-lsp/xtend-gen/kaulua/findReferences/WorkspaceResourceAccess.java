/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package kaulua.findReferences;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.findReferences.IReferenceFinder;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.11
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class WorkspaceResourceAccess implements IReferenceFinder.IResourceAccess {
  private Resource res;
  
  public WorkspaceResourceAccess(final Resource r) {
    this.res = r;
  }
  
  @Override
  public <R extends Object> R readOnly(final URI targetURI, final IUnitOfWork<R, ResourceSet> work) {
    try {
      return work.exec(this.res.getResourceSet());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
