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

import com.google.common.collect.Iterators;
import fr.cea.nabla.ir.ir.Connectivity;
import fr.cea.nabla.ir.ir.Function;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.ir.Job;
import fr.cea.nabla.ir.ir.Reduction;
import fr.cea.nabla.ir.ir.ReductionInstruction;
import fr.cea.nabla.ir.ir.ScalarVarDefinition;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.ir.Variable;
import fr.cea.nabla.ir.transformers.IrTransformationStep;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ReplaceUtf8Chars implements IrTransformationStep {
  @Override
  public String getDescription() {
    return "Replace UTF8 characters in function, variable and job names by ASCII characters";
  }
  
  @Override
  public boolean transform(final IrModule m) {
    final Consumer<Variable> _function = new Consumer<Variable>() {
      @Override
      public void accept(final Variable x) {
        x.setName(ReplaceUtf8Chars.this.getNoUtf8(x.getName()));
      }
    };
    m.getVariables().forEach(_function);
    Iterable<ScalarVarDefinition> _iterable = IteratorExtensions.<ScalarVarDefinition>toIterable(Iterators.<ScalarVarDefinition>filter(m.eAllContents(), ScalarVarDefinition.class));
    for (final ScalarVarDefinition svd : _iterable) {
      final Consumer<ScalarVariable> _function_1 = new Consumer<ScalarVariable>() {
        @Override
        public void accept(final ScalarVariable x) {
          x.setName(ReplaceUtf8Chars.this.getNoUtf8(x.getName()));
        }
      };
      svd.getVariables().forEach(_function_1);
    }
    final Procedure1<ReductionInstruction> _function_2 = new Procedure1<ReductionInstruction>() {
      @Override
      public void apply(final ReductionInstruction x) {
        ScalarVariable _variable = x.getVariable();
        _variable.setName(ReplaceUtf8Chars.this.getNoUtf8(x.getVariable().getName()));
      }
    };
    IteratorExtensions.<ReductionInstruction>forEach(Iterators.<ReductionInstruction>filter(m.eAllContents(), ReductionInstruction.class), _function_2);
    final Consumer<Connectivity> _function_3 = new Consumer<Connectivity>() {
      @Override
      public void accept(final Connectivity x) {
        x.setName(ReplaceUtf8Chars.this.getNoUtf8(x.getName()));
      }
    };
    m.getConnectivities().forEach(_function_3);
    final Consumer<Function> _function_4 = new Consumer<Function>() {
      @Override
      public void accept(final Function x) {
        x.setName(ReplaceUtf8Chars.this.getNoUtf8(x.getName()));
      }
    };
    m.getFunctions().forEach(_function_4);
    final Consumer<Reduction> _function_5 = new Consumer<Reduction>() {
      @Override
      public void accept(final Reduction x) {
        x.setName(ReplaceUtf8Chars.this.getNoUtf8(x.getName()));
      }
    };
    m.getReductions().forEach(_function_5);
    final Consumer<Job> _function_6 = new Consumer<Job>() {
      @Override
      public void accept(final Job x) {
        x.setName(ReplaceUtf8Chars.this.getNoUtf8(x.getName()));
      }
    };
    m.getJobs().forEach(_function_6);
    return true;
  }
  
  private String getNoUtf8(final String name) {
    return name.replace("α", "alpha").replace("β", "beta").replace("γ", "gammma").replace("δ", "delta").replace("ϵ", "epsilon").replace("λ", "lambda").replace("ρ", "rho").replace("Ω", "omega").replace("√", "sqrt").replace("∑", "sum");
  }
}
