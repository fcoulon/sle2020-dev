/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package kaulua.contentassist;

import kaulua.contentassist.ContentAssistEntry;

/**
 * @noreference
 */
@SuppressWarnings("all")
public interface IIdeContentProposalAcceptor {
  /**
   * Handle the given content assist entry. The entry may be {@code null}.
   */
  public abstract void accept(final ContentAssistEntry entry, final int priority);
  
  public abstract boolean canAcceptMoreProposals();
}
