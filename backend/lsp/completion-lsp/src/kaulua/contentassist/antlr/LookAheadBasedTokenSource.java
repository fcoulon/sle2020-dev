/*******************************************************************************
 * Copyright (c) 2017 itemis AG (http://www.itemis.de) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.contentassist.antlr;

import java.util.Iterator;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @since 2.14
 */
public class LookAheadBasedTokenSource implements TokenSource {
	private final Iterator<? extends ILookAheadTerminal> iter;

	protected LookAheadBasedTokenSource(Iterator<? extends ILookAheadTerminal> iter) {
		this.iter = iter;
	}

	@Override
	public Token nextToken() {
		if (iter.hasNext()) {
			ILookAheadTerminal lookAhead = iter.next();
			return lookAhead.getToken();
		}
		return Token.EOF_TOKEN;
	}

	@Override
	public String getSourceName() {
		return "LookAheadTerminalTokenSource";
	}
}