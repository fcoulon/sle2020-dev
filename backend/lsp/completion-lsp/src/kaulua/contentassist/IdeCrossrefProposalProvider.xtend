/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.contentassist

import com.google.common.base.Predicate
import com.google.inject.Inject
import org.apache.log4j.Logger
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope

/**
 * Special content assist proposal provider for cross-references.
 * @noreference
 */
class IdeCrossrefProposalProvider {
	
	static val LOG = Logger.getLogger(IdeCrossrefProposalProvider)
	
	@Accessors(PROTECTED_GETTER)
	@Inject IQualifiedNameConverter qualifiedNameConverter
	
	@Accessors(PROTECTED_GETTER)
	@Inject IdeContentProposalCreator proposalCreator
	
	@Inject IdeContentProposalPriorities proposalPriorities
	
	def void lookupCrossReference(IScope scope, CrossReference crossReference, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor, Predicate<IEObjectDescription> filter) {
		try {
			for (candidate : queryScope(scope, crossReference, context)) {
				if (!acceptor.canAcceptMoreProposals) {
					return
				}
				if (filter.apply(candidate)) {
					val entry = createProposal(candidate, crossReference, context)
					acceptor.accept(entry, proposalPriorities.getCrossRefPriority(candidate, entry))
				}
			}
		} catch (UnsupportedOperationException uoe) {
			LOG.error('Failed to create content assist proposals for cross-reference.', uoe)
		}
	}
	
	protected def queryScope(IScope scope, CrossReference crossReference, ContentAssistContext context) {
		return scope.allElements
	}
	
	protected def ContentAssistEntry createProposal(IEObjectDescription candidate, CrossReference crossRef, ContentAssistContext context) {
		proposalCreator.createProposal(qualifiedNameConverter.toString(candidate.name), context) [
			source = candidate
			description = candidate.getEClass?.name
			kind = ContentAssistEntry.KIND_REFERENCE
		]
	}
	
}
