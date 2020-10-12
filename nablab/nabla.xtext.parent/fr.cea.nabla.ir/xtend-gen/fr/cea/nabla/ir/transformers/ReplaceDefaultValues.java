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

import com.google.common.collect.Iterables;
import fr.cea.nabla.ir.ir.Affectation;
import fr.cea.nabla.ir.ir.InstructionJob;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.ir.Job;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.ir.VarRef;
import fr.cea.nabla.ir.transformers.IrTransformationStep;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ReplaceDefaultValues implements IrTransformationStep {
  @Override
  public String getDescription() {
    return "Replace global variables default values by initialization jobs";
  }
  
  /**
   * Transforme le module m pour qu'il n'y ait plus de variable avec des valeurs par défaut.
   * Les variables sont initialisées dans des jobs d'initialisation.
   */
  @Override
  public boolean transform(final IrModule m) {
    final Function1<ScalarVariable, Boolean> _function = new Function1<ScalarVariable, Boolean>() {
      @Override
      public Boolean apply(final ScalarVariable x) {
        return Boolean.valueOf(((!x.isConst()) && (x.getDefaultValue() != null)));
      }
    };
    Iterable<ScalarVariable> _filter = IterableExtensions.<ScalarVariable>filter(Iterables.<ScalarVariable>filter(m.getVariables(), ScalarVariable.class), _function);
    for (final ScalarVariable v : _filter) {
      EList<Job> _jobs = m.getJobs();
      InstructionJob _createInstructionJob = IrFactory.eINSTANCE.createInstructionJob();
      final Procedure1<InstructionJob> _function_1 = new Procedure1<InstructionJob>() {
        @Override
        public void apply(final InstructionJob it) {
          it.getAnnotations().addAll(v.getDefaultValue().getAnnotations());
          String _name = v.getName();
          String _plus = ("Init_" + _name);
          it.setName(_plus);
          Affectation _createAffectation = IrFactory.eINSTANCE.createAffectation();
          final Procedure1<Affectation> _function = new Procedure1<Affectation>() {
            @Override
            public void apply(final Affectation it) {
              VarRef _createVarRef = IrFactory.eINSTANCE.createVarRef();
              final Procedure1<VarRef> _function = new Procedure1<VarRef>() {
                @Override
                public void apply(final VarRef it) {
                  it.setVariable(v);
                }
              };
              VarRef _doubleArrow = ObjectExtensions.<VarRef>operator_doubleArrow(_createVarRef, _function);
              it.setLeft(_doubleArrow);
              it.setOperator("=");
              it.setRight(v.getDefaultValue());
            }
          };
          Affectation _doubleArrow = ObjectExtensions.<Affectation>operator_doubleArrow(_createAffectation, _function);
          it.setInstruction(_doubleArrow);
        }
      };
      InstructionJob _doubleArrow = ObjectExtensions.<InstructionJob>operator_doubleArrow(_createInstructionJob, _function_1);
      _jobs.add(_doubleArrow);
    }
    return true;
  }
}
