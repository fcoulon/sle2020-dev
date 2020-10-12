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
package fr.cea.nabla.ir.transformers;

import fr.cea.nabla.ir.ir.Affectation;
import fr.cea.nabla.ir.ir.Expression;
import fr.cea.nabla.ir.ir.ExpressionType;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.Iterator;
import fr.cea.nabla.ir.ir.Job;
import fr.cea.nabla.ir.ir.Loop;
import fr.cea.nabla.ir.ir.ReductionCall;
import fr.cea.nabla.ir.ir.VarRef;
import fr.cea.nabla.ir.ir.Variable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class ReplaceReductionsBase {
  protected Loop createReductionLoop(final Iterator iterator, final Variable affectationLHS, final Expression affectationRHS, final String op) {
    final Loop loop = IrFactory.eINSTANCE.createLoop();
    loop.setIterator(iterator);
    Affectation _createAffectation = IrFactory.eINSTANCE.createAffectation();
    final Procedure1<Affectation> _function = new Procedure1<Affectation>() {
      @Override
      public void apply(final Affectation it) {
        VarRef _createVarRef = IrFactory.eINSTANCE.createVarRef();
        final Procedure1<VarRef> _function = new Procedure1<VarRef>() {
          @Override
          public void apply(final VarRef it) {
            it.setVariable(affectationLHS);
            it.setType(EcoreUtil.<ExpressionType>copy(affectationRHS.getType()));
          }
        };
        VarRef _doubleArrow = ObjectExtensions.<VarRef>operator_doubleArrow(_createVarRef, _function);
        it.setLeft(_doubleArrow);
        it.setOperator(op);
        it.setRight(affectationRHS);
      }
    };
    Affectation _doubleArrow = ObjectExtensions.<Affectation>operator_doubleArrow(_createAffectation, _function);
    loop.setBody(_doubleArrow);
    return loop;
  }
  
  protected boolean isExternal(final EObject it) {
    boolean _xifexpression = false;
    EObject _eContainer = it.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      _xifexpression = false;
    } else {
      boolean _xifexpression_1 = false;
      EObject _eContainer_1 = it.eContainer();
      if ((_eContainer_1 instanceof Loop)) {
        _xifexpression_1 = false;
      } else {
        boolean _xifexpression_2 = false;
        EObject _eContainer_2 = it.eContainer();
        if ((_eContainer_2 instanceof ReductionCall)) {
          _xifexpression_2 = false;
        } else {
          boolean _xifexpression_3 = false;
          EObject _eContainer_3 = it.eContainer();
          if ((_eContainer_3 instanceof Job)) {
            _xifexpression_3 = true;
          } else {
            _xifexpression_3 = this.isExternal(it.eContainer());
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
