/*******************************************************************************
 * Copyright (c) 2014, 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.contentassist.antlr;

import org.antlr.runtime.Token;
import org.eclipse.xtext.AbstractElement;

/**
 * @since 2.9
 */
public abstract class LookAheadTerminal implements ILookAheadTerminal {

	private Token token;
	
	public abstract boolean matches(AbstractElement element);
	
	@Override
	public Token getToken() {
		return token;
	}
	
	public void setToken(Token token) {
		this.token = token;
	}
	
	@Override
	public String toString() {
		return "LookAheadTerminal: " + token.toString();
	}
}
