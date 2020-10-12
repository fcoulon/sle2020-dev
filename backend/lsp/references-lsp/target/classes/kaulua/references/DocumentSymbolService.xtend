/*******************************************************************************
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.references

import com.google.inject.Inject
import com.google.inject.Provider
import com.google.inject.Singleton
import java.util.List
import kaulua.common.Document
import kaulua.common.DocumentExtensions
import kaulua.util.CancelIndicatorProgressMonitor
import org.eclipse.emf.ecore.EObject
import org.eclipse.lsp4j.Location
import org.eclipse.lsp4j.ReferenceParams
import org.eclipse.xtext.findReferences.IReferenceFinder
import org.eclipse.xtext.findReferences.IReferenceFinder.IResourceAccess
import org.eclipse.xtext.findReferences.ReferenceAcceptor
import org.eclipse.xtext.findReferences.TargetURICollector
import org.eclipse.xtext.findReferences.TargetURIs
import org.eclipse.xtext.resource.EObjectAtOffsetHelper
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.resource.IResourceServiceProvider
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
	IReferenceFinder referenceFinder

	@Inject
	TargetURICollector targetURICollector

	@Inject
	Provider<TargetURIs> targetURIProvider

	@Inject
	OperationCanceledManager operationCanceledManager

	@Inject
	IResourceServiceProvider.Registry resourceServiceProviderRegistry
	

	def List<? extends Location> getDefinitions(
		XtextResource resource,
		int offset,
//		IResourceAccess resourceAccess,
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
	
	def List<? extends Location> getReferences(
		Document document,
		XtextResource resource,
		ReferenceParams params,
		IResourceAccess resourceAccess,
		IResourceDescriptions indexData,
		CancelIndicator cancelIndicator
	) {
		val offset = document.getOffSet(params.position)
				
		val definitions = if (params.context.includeDeclaration)
				getDefinitions(resource, offset, cancelIndicator)
			else
				emptyList
		
		val references = getReferences(resource, offset, resourceAccess, indexData, cancelIndicator)
		val result = definitions + references
		return result.toList
	}

	def List<? extends Location> getReferences(
		XtextResource resource,
		int offset,
		IResourceAccess resourceAccess,
		IResourceDescriptions indexData,
		CancelIndicator cancelIndicator
	) {
		val element = resource.resolveElementAt(offset)
		if (element === null)
			return emptyList

		val locations = newArrayList
		val targetURIs = element.collectTargetURIs
		referenceFinder.findAllReferences(
			targetURIs,
			resourceAccess,
			indexData,
			new ReferenceAcceptor(resourceServiceProviderRegistry, [ reference |
				
				val object = resource.resourceSet.getEObject(reference.sourceEObjectUri, true)
				if (object !== null) {
					val location = object.newLocation(reference.EReference, reference.indexInList)
					if (location !== null)
						locations += location
				}
			]),
			new CancelIndicatorProgressMonitor(cancelIndicator)
		)
		return locations
	}

	protected def TargetURIs collectTargetURIs(EObject targetObject) {
		val targetURIs = targetURIProvider.get
		targetURICollector.add(targetObject, targetURIs)
		return targetURIs
	}

}
