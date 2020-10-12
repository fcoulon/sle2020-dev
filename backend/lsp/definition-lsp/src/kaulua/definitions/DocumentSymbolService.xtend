/*******************************************************************************
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.definitions

import com.google.inject.Inject
import com.google.inject.Provider
import com.google.inject.Singleton
import java.util.List
import kaulua.common.Document
import kaulua.common.DocumentExtensions
import org.eclipse.emf.ecore.EObject
import org.eclipse.lsp4j.Location
import org.eclipse.lsp4j.TextDocumentPositionParams
import org.eclipse.xtext.findReferences.TargetURICollector
import org.eclipse.xtext.findReferences.TargetURIs
import org.eclipse.xtext.resource.EObjectAtOffsetHelper
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.service.OperationCanceledManager
import org.eclipse.xtext.util.CancelIndicator

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.11
 */
@Singleton
class DocumentSymbolService {

	@Inject
	extension DocumentExtensions

	@Inject
	extension EObjectAtOffsetHelper

	@Inject
	TargetURICollector targetURICollector

	@Inject
	Provider<TargetURIs> targetURIProvider

	@Inject
	OperationCanceledManager operationCanceledManager

	def List<? extends Location> getDefinitions(
		Document document,
		XtextResource resource,
		TextDocumentPositionParams params,
//		IResourceAccess resourceAccess,
		CancelIndicator cancelIndicator
	) {
		val offset = document.getOffSet(params.position)
		return getDefinitions(resource, offset, cancelIndicator)
	}

	def List<? extends Location> getDefinitions(
		XtextResource resource,
		int offset,
		CancelIndicator cancelIndicator
	) {
		val element = resource.resolveElementAt(offset)
		if (element === null)
			return emptyList

		val locations = newArrayList
		val targetURIs = element.collectTargetURIs
		for (targetURI : targetURIs) {
			operationCanceledManager.checkCanceled(cancelIndicator)
			
			val object = resource.resourceSet.getEObject(targetURI, true)
			if (object !== null) {
				val location = object.newLocation
				if (location !== null)
					locations += location
			}
		}
		return locations
	}
	

	protected def TargetURIs collectTargetURIs(EObject targetObject) {
		val targetURIs = targetURIProvider.get
		targetURICollector.add(targetObject, targetURIs)
		return targetURIs
	}
	
}
