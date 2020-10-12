/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.contentassist.antlr;

import org.eclipse.xtext.AbstractRule;

/**
 * The partial content assist parser allows to set the entry rule.
 * @since 2.9
 */
public interface IPartialEditingContentAssistParser extends IContentAssistParser {

	void initializeFor(AbstractRule rule);
	
}
