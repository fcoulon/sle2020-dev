/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.symbol

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.List
import org.eclipse.lsp4j.SymbolInformation
import org.eclipse.xtext.findReferences.IReferenceFinder.IResourceAccess
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.service.OperationCanceledManager
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.emf.ecore.resource.ResourceSet

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.11
 */
@Singleton
class WorkspaceSymbolService {

	@Inject
	DocumentSymbolService documentSymbolService

	def List<? extends SymbolInformation> getSymbols(
		String query,
		ResourceSet rs,
		IResourceDescriptions indexData,
		CancelIndicator cancelIndicator
	) {
		val result = newLinkedList
		for (resourceDescription : indexData.allResourceDescriptions) {
			result += documentSymbolService.getSymbols(resourceDescription, query, rs, cancelIndicator)
		}
		
		return result
	}

}
