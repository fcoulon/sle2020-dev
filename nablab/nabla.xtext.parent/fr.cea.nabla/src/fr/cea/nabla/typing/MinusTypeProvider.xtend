/*******************************************************************************
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
 *******************************************************************************/
package fr.cea.nabla.typing

import fr.cea.nabla.nabla.BasicType

class MinusTypeProvider implements BinaryOperatorTypeProvider
{
	override NablaType typeFor(NablaType leftType, NablaType rightType)
	{
		if (!NablaType::isBasicType(leftType) || !NablaType::isBasicType(rightType)) return NablaType::UNDEFINED
		if (leftType.base==BasicType::BOOL || rightType==BasicType::BOOL)  return NablaType::UNDEFINED

		switch leftType.base
		{
			case INT: 
				switch rightType.base
				{
					case INT, case REAL: rightType
					default: NablaType::UNDEFINED
				} 
			case REAL:
				switch rightType.base
				{
					case INT, case REAL: leftType
					default: NablaType::UNDEFINED
				}
			case REAL2:
				switch rightType.base
				{
					case INT, case REAL, case REAL2: leftType
					default: NablaType::UNDEFINED
				}
			case REAL3:
				switch rightType.base
				{
					case INT, case REAL, case REAL3: leftType
					default: NablaType::UNDEFINED
				}
			case REAL2X2:
				switch rightType.base
				{
					case REAL2X2: leftType
					default: NablaType::UNDEFINED
				}			
			case REAL3X3:
				switch rightType.base
				{
					case REAL3X3: leftType
					default: NablaType::UNDEFINED
				}			
			default: NablaType::UNDEFINED 
		}
	}
}