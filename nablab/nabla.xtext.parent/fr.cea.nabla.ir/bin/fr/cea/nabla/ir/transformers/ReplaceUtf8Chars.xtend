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
package fr.cea.nabla.ir.transformers

import fr.cea.nabla.ir.ir.IrModule
import fr.cea.nabla.ir.ir.ReductionInstruction
import fr.cea.nabla.ir.ir.ScalarVarDefinition

class ReplaceUtf8Chars implements IrTransformationStep 
{
	override getDescription() 
	{
		'Replace UTF8 characters in function, variable and job names by ASCII characters'
	}
	
	override transform(IrModule m) 
	{
		m.variables.forEach[x | x.name = x.name.noUtf8]
		for (svd : m.eAllContents.filter(ScalarVarDefinition).toIterable)
			svd.variables.forEach[x | x.name = x.name.noUtf8]
		m.eAllContents.filter(ReductionInstruction).forEach[x | x.variable.name = x.variable.name.noUtf8]
		m.connectivities.forEach[x | x.name = x.name.noUtf8]
		m.functions.forEach[x | x.name = x.name.noUtf8]
		m.reductions.forEach[x | x.name = x.name.noUtf8]
		m.jobs.forEach[x | x.name = x.name.noUtf8]
		return true
	}
	
	private def getNoUtf8(String name)
	{
		name.replace('\u03B1', 'alpha')
		.replace('\u03B2', 'beta')
		.replace('\u03B3', 'gammma') // ce n'est pa une erreur ! le gamma a l'air réservé en Nabla !
		.replace('\u03B4', 'delta')
		.replace('\u03F5', 'epsilon')
		.replace('\u03BB', 'lambda')
		.replace('\u03C1', 'rho')
		.replace('\u2126', 'omega')
		.replace('\u221A', 'sqrt')
		.replace('\u2211', 'sum')
	}
}