/*******************************************************************************
 * Copyright (c) 2014, 2018 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.contentassist.antlr;

import java.util.Collection;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import kaulua.contentassist.ide.LexerIdeBindings;
import kaulua.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import kaulua.contentassist.antlr.internal.Lexer;
import kaulua.partialEditing.IPartialEditingContentAssistParser;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

/**
 * @since 2.9
 */
public abstract class AbstractContentAssistParser
		extends BaseContentAssistParser<FollowElement, LookAheadTerminal, AbstractInternalContentAssistParser>
		implements IContentAssistParser, IPartialEditingContentAssistParser {

	@Inject
	@Named(LexerIdeBindings.CONTENT_ASSIST)
	private Provider<Lexer> lexerProvider;

	@Override
	protected TokenSource createLexer(CharStream stream) {
		Lexer lexer = lexerProvider.get();
		lexer.setCharStream(stream);
		return lexer;
	}
	
	/* Abstract override is necessary to be backwards compatible due to generic signature in super class */
	@Override
	protected abstract AbstractInternalContentAssistParser createParser();
	
	/* Delegating override is necessary to avoid synthetic method signatures in subtypes and thereby preserve binary compatibility in edge-cases */
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		return super.getFollowElements(parser);
	}

}
