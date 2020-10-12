/*******************************************************************************
 * Copyright (c) 2017, 2018 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.refactoring

import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.util.ITextRegion

/**
 * @author koehnlein - Initial contribution and API
 * @since 2.13
 */
interface RefactoringIssueAcceptor {
	
	enum Severity {
		FATAL, ERROR, WARNING, INFO, OK
	}
	
	def void add(Severity severity, String message, URI uri, ResourceSet resourceSet)

	def void add(Severity severity, String message, URI resourceUri)
	
	def void add(Severity severity, String message, EObject element)

	def void add(Severity severity, String message, EObject element, ITextRegion region)

	def void add(Severity severity, String message, Exception exc, Logger log)

	def void add(Severity severity, String message, Object... params)
	
}
