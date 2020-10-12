/**
 * Copyright (c) 2018 CEA
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * 	Benoit Lelandais - initial implementation
 * 	Marie-Pierre Oudot - initial implementation
 * 	Jean-Sylvain Camier - Nabla generation support
 */
package fr.cea.nabla.typing;

import com.google.common.base.Objects;
import fr.cea.nabla.typing.BasicTypeProvider;
import fr.cea.nabla.typing.BinaryOperatorTypeProvider;
import fr.cea.nabla.typing.NablaType;

@SuppressWarnings("all")
public class ComparisonAndEqualityTypeProvider implements BinaryOperatorTypeProvider {
  @Override
  public NablaType typeFor(final NablaType leftType, final NablaType rightType) {
    NablaType _xifexpression = null;
    if (((NablaType.isBasicType(leftType) && NablaType.isBasicType(rightType)) && Objects.equal(leftType.getBase(), rightType.getBase()))) {
      _xifexpression = BasicTypeProvider.BOOL;
    } else {
      _xifexpression = NablaType.UNDEFINED;
    }
    return _xifexpression;
  }
}
