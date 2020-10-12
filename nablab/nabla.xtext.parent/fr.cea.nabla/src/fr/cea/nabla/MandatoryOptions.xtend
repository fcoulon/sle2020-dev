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
package fr.cea.nabla

import fr.cea.nabla.nabla.BasicType
import fr.cea.nabla.nabla.NablaFactory

class MandatoryOptions 
{
	public static val COORD = 'coord'
	public static val LENGTH = 'LENGTH'
	public static val X_EDGE_ELEMS = 'X_EDGE_ELEMS'
	public static val Y_EDGE_ELEMS = 'Y_EDGE_ELEMS'
	public static val Z_EDGE_ELEMS = 'Z_EDGE_ELEMS'
	public static val STOP_TIME = 'option_stoptime'
	public static val MAX_ITERATIONS = 'option_max_iterations'
	
	public static val OPTION_NAMES = #[LENGTH, X_EDGE_ELEMS, Y_EDGE_ELEMS, Z_EDGE_ELEMS, STOP_TIME, MAX_ITERATIONS]

	def getOptions() { #[length, XEdgeElem, YEdgeElem, ZEdgeElem, stopTime, maxIterations] }
	
	def getLength() { getRealOption(LENGTH, 1.0) }
	def getStopTime() { getRealOption(STOP_TIME, 0.1) }
	def getMaxIterations() { getIntOption(MAX_ITERATIONS, 48) }

	def getXEdgeElem() { getIntOption(X_EDGE_ELEMS, 8) }
	def getYEdgeElem() { getIntOption(Y_EDGE_ELEMS, 8) }
	def getZEdgeElem() { getIntOption(Z_EDGE_ELEMS, 1) }
	
	private def getIntOption(String optionName, int optionValue)
	{
		val f = NablaFactory::eINSTANCE
		val edgeElem = f.createScalarVarDefinition
		edgeElem.variable = f.createScalarVar => [ name=optionName ]
		edgeElem.type = BasicType::INT
		edgeElem.defaultValue = f.createIntConstant => [ value=optionValue ]
		return edgeElem
	}
	
	private def getRealOption(String optionName, double optionValue)
	{
		val f = NablaFactory::eINSTANCE
		val length = f.createScalarVarDefinition
		length.variable = f.createScalarVar => [ name=optionName ]
		length.type = BasicType::REAL
		length.defaultValue = f.createRealXCompactConstant => [ type=BasicType::REAL value=optionValue ]
		return length
	}
}