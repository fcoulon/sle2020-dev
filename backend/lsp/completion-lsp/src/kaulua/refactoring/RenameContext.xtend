/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.refactoring

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import kaulua.refactoring.RefactoringIssueAcceptor.Severity
import kaulua.serializer.IChangeSerializer
import org.eclipse.emf.ecore.resource.Resource

/**
 * @author koehnlein - Initial contribution and API
 * @since 2.13
 */
@FinalFieldsConstructor
@Accessors(PUBLIC_GETTER)
class RenameContext {
	val List<? extends RenameChange> changes
	val Resource resource
	val IChangeSerializer changeSerializer
	val RefactoringIssueAcceptor issues
	
	def void addModification(RenameChange change, IChangeSerializer.IModification<EObject> modification) {
		val target = resource.resourceSet.getEObject(change.targetURI, true)
		if (target instanceof EObject) {
			EcoreUtil.resolveAll(target.eResource)
			changeSerializer.addModification(target, modification)
		} else {
			issues.add(Severity.ERROR, 'Element cannot be found', change.targetURI)
		}
	}
}
