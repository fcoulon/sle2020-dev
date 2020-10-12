/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.rename

import org.eclipse.lsp4j.RenameParams
import org.eclipse.lsp4j.WorkspaceEdit
import org.eclipse.xtext.util.CancelIndicator
import kaulua.common.Document
import org.eclipse.xtext.resource.XtextResource

/**
 * @author koehnlein - Initial contribution and API
 * @since 2.13
 */
interface IRenameService {
	def WorkspaceEdit rename(Document document, XtextResource xtextResource, RenameParams renameParams, CancelIndicator cancelIndicator)
}