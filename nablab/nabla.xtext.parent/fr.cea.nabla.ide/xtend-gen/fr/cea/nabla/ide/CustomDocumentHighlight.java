/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package fr.cea.nabla.ide;

import org.eclipse.lsp4j.DocumentHighlight;
import org.eclipse.lsp4j.DocumentHighlightKind;
import org.eclipse.lsp4j.Range;

/**
 * A document highlight is a range inside a text document which deserves special attention. Usually a document highlight
 * is visualized by changing the background color of its range.
 */
@SuppressWarnings("all")
public class CustomDocumentHighlight extends DocumentHighlight {
  public String formula;
  
  public CustomDocumentHighlight(final Range range, final DocumentHighlightKind kind, final String formula) {
    super(range, kind);
    this.formula = formula;
  }
}
