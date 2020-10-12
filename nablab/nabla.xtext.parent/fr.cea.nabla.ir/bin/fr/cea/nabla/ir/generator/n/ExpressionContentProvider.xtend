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
 * 	Jean-Sylvan Camier - Nabla generation support
 *******************************************************************************/
package fr.cea.nabla.ir.generator.n

import com.google.inject.Inject
import fr.cea.nabla.ir.ir.BasicType
import fr.cea.nabla.ir.ir.BinaryExpression
import fr.cea.nabla.ir.ir.BoolConstant
import fr.cea.nabla.ir.ir.FunctionCall
import fr.cea.nabla.ir.ir.IntConstant
import fr.cea.nabla.ir.ir.IteratorRef
import fr.cea.nabla.ir.ir.MaxConstant
import fr.cea.nabla.ir.ir.MinConstant
import fr.cea.nabla.ir.ir.Parenthesis
import fr.cea.nabla.ir.ir.Real2Constant
import fr.cea.nabla.ir.ir.Real2x2Constant
import fr.cea.nabla.ir.ir.Real3Constant
import fr.cea.nabla.ir.ir.Real3x3Constant
import fr.cea.nabla.ir.ir.RealConstant
import fr.cea.nabla.ir.ir.UnaryExpression
import fr.cea.nabla.ir.ir.VarRef

class ExpressionContentProvider
{
	@Inject extension Ir2NUtils

	def dispatch CharSequence getContent(BinaryExpression it) '''«left.content» «operator» «right.content»'''
	def dispatch CharSequence getContent(UnaryExpression it) '''«operator»«expression.content»'''
	def dispatch CharSequence getContent(Parenthesis it) '''(«expression.content»)'''
	def dispatch CharSequence getContent(IntConstant it) '''«value»'''
	def dispatch CharSequence getContent(RealConstant it) '''«value»'''
	def dispatch CharSequence getContent(Real2Constant it) '''«BasicType::REAL3.NType»(«x», «y», 0.0)'''
	def dispatch CharSequence getContent(Real3Constant it) '''«BasicType::REAL3.NType»(«x», «y», «z»)'''
	def dispatch CharSequence getContent(Real2x2Constant it) '''«BasicType::REAL2X2.NType»(«x.content», «y.content», «BasicType::REAL3.NType»(0.0, 0.0, 1.0))'''
	def dispatch CharSequence getContent(Real3x3Constant it) '''«BasicType::REAL3X3.NType»(«x.content», «y.content», «z.content»)'''
	def dispatch CharSequence getContent(BoolConstant it) '''«value»'''
	
	def dispatch CharSequence getContent(MinConstant it) 
	{
		switch getType().basicType
		{
			case INT  : '-\u221E'
			case REAL : '-\u221E'
			case REAL2, case REAL2X2, case REAL3, case REAL3X3: 'new ' + getType().basicType.NType + '(-\u221E)'
			default: throw new Exception('Invalid expression Min for type: ' + getType().basicType)
		}
	}

	def dispatch CharSequence getContent(MaxConstant it) 
	{
		switch getType().basicType
		{
			case INT  : '\u221E'
			case REAL : '\u221E'
			case REAL2, case REAL2X2, case REAL3, case REAL3X3: 'new ' + getType().basicType.NType + '(\u221E)'
			default: throw new Exception('Invalid expression Max for type: ' + getType().basicType)
		}
	}

	def dispatch CharSequence getContent(FunctionCall it) 
	'''«function.name»(«FOR a:args SEPARATOR ', '»«a.content»«ENDFOR»)'''
	
	def dispatch CharSequence getContent(VarRef it) 
	'''«variable.name»«suffix»«FOR f:fields BEFORE '.' SEPARATOR '.'»«f»«ENDFOR»'''
	
	private def getSuffix(VarRef it) 
	{ 
		val itRefs = iterators.filter(IteratorRef)
		if (itRefs.exists[prev]) '[#-1]'
		else if (itRefs.exists[next]) '[#+1]'
		else ''
	}
}