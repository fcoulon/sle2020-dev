/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.serializer.hooks;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 * 
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IReferenceSnapshot {
	URI getSourceEObjectUri();

	URI getContainerEObjectURI();

	EReference getEReference();

	int getIndexInList();

	IEObjectSnapshot getTarget();

}
