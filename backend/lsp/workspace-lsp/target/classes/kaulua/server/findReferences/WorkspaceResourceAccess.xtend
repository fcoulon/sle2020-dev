/*******************************************************************************
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.server.findReferences

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.findReferences.IReferenceFinder.IResourceAccess
import kaulua.server.WorkspaceManager
import org.eclipse.xtext.util.concurrent.IUnitOfWork

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.11
 */
@FinalFieldsConstructor
class WorkspaceResourceAccess implements IResourceAccess {

	val WorkspaceManager workspaceManager

	override <R> readOnly(URI targetURI, IUnitOfWork<R, ResourceSet> work) {
		return workspaceManager.doRead(targetURI) [ document, resource |
			if (resource === null) {
				return null
			}
			return work.exec(resource.resourceSet)
		]
	}

}
