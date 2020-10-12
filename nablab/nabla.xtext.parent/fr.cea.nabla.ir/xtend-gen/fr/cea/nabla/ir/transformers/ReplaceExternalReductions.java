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

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import fr.cea.nabla.ir.ir.Affectation;
import fr.cea.nabla.ir.ir.ArrayVariable;
import fr.cea.nabla.ir.ir.Connectivity;
import fr.cea.nabla.ir.ir.Expression;
import fr.cea.nabla.ir.ir.ExpressionType;
import fr.cea.nabla.ir.ir.Instruction;
import fr.cea.nabla.ir.ir.InstructionBlock;
import fr.cea.nabla.ir.ir.InstructionJob;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.ir.Iterator;
import fr.cea.nabla.ir.ir.Job;
import fr.cea.nabla.ir.ir.Reduction;
import fr.cea.nabla.ir.ir.ReductionCall;
import fr.cea.nabla.ir.ir.ReductionInstruction;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.ir.VarRef;
import fr.cea.nabla.ir.ir.Variable;
import fr.cea.nabla.ir.transformers.IrTransformationStep;
import fr.cea.nabla.ir.transformers.ReplaceReductionsBase;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ReplaceExternalReductions extends ReplaceReductionsBase implements IrTransformationStep {
  public static final Map<String, String> ReductionOperators = Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(Pair.<String, String>of("sum", "+?="), Pair.<String, String>of("reduceMin", "<?="), Pair.<String, String>of("reduceMax", ">?=")));
  
  @Override
  public String getDescription() {
    return "Replace external reductions by loops and affectations with nabla operator (the reduction variable becomes global)";
  }
  
  /**
   * Transforme le module m pour qu'il n'est plus d'instance de ReductionInstruction 'externes',
   * c'est à dire non intégrées à une boucle. Chaque ReductionInstruction est remplacée par
   * 2 jobs.
   * Pour X = sum(j E cells)(Yj + 4) + Z, on a :
   *   - un job avec une boucle cells qui calcule l'argument de la réduction tmpSumXXX = Yj+4
   *   - un job avec une boucle cells qui fait la réduction sumXXX +?= tmpSumXXX
   * Si l'argument est une VarRef, le premier job est inutile (=> remplacer tmpSumXXX par Y dans le 2e).
   * Si l'expression finale est une VarRef, le dernier job est inutile mais aucune optimisation
   * n'a été faite pour le moment.
   */
  @Override
  public boolean transform(final IrModule m) {
    try {
      final Function1<ReductionInstruction, Boolean> _function = new Function1<ReductionInstruction, Boolean>() {
        @Override
        public Boolean apply(final ReductionInstruction it) {
          return Boolean.valueOf(ReplaceExternalReductions.this.isExternal(it.getReduction()));
        }
      };
      List<ReductionInstruction> _list = IteratorExtensions.<ReductionInstruction>toList(IteratorExtensions.<ReductionInstruction>filter(Iterators.<ReductionInstruction>filter(m.eAllContents(), ReductionInstruction.class), _function));
      for (final ReductionInstruction reductionInstr : _list) {
        {
          final Reduction reduc = reductionInstr.getReduction().getReduction();
          if (((!(reductionInstr.eContainer() instanceof InstructionBlock)) || (!(IterableExtensions.<Instruction>last(((InstructionBlock) reductionInstr.eContainer()).getInstructions()) instanceof Affectation)))) {
            throw new Exception("Unexpected IR pattern for reduction");
          }
          final VarRef reducOperatorRhs = this.handleReductionArg(m, reductionInstr);
          final ScalarVariable reducOperatorLhs = reductionInstr.getVariable();
          EList<Job> _jobs = m.getJobs();
          InstructionJob _createInstructionJob = IrFactory.eINSTANCE.createInstructionJob();
          final Procedure1<InstructionJob> _function_1 = new Procedure1<InstructionJob>() {
            @Override
            public void apply(final InstructionJob it) {
              String _name = reductionInstr.getVariable().getName();
              String _plus = ("Reduce_" + _name);
              it.setName(_plus);
              it.setInstruction(ReplaceExternalReductions.this.createReductionLoop(reductionInstr.getReduction().getIterator(), reducOperatorLhs, reducOperatorRhs, ReplaceExternalReductions.this.getOperator(reduc)));
            }
          };
          InstructionJob _doubleArrow = ObjectExtensions.<InstructionJob>operator_doubleArrow(_createInstructionJob, _function_1);
          _jobs.add(_doubleArrow);
          EList<Variable> _variables = m.getVariables();
          ScalarVariable _variable = reductionInstr.getVariable();
          _variables.add(_variable);
          EcoreUtil.delete(reductionInstr);
          final Function1<ReductionCall, Boolean> _function_2 = new Function1<ReductionCall, Boolean>() {
            @Override
            public Boolean apply(final ReductionCall x) {
              Reduction _reduction = x.getReduction();
              return Boolean.valueOf(Objects.equal(_reduction, reduc));
            }
          };
          boolean _exists = IteratorExtensions.<ReductionCall>exists(Iterators.<ReductionCall>filter(m.eAllContents(), ReductionCall.class), _function_2);
          boolean _not = (!_exists);
          if (_not) {
            EcoreUtil.delete(reduc, true);
          }
        }
      }
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Si l'argument de la réduction est une VarRef, retourne cette VarRef
   * sinon crée un job pour calculer l'expression, une variable por stocker le
   * résultat et retourne cette variable.
   * Ex 1 : X = sum(j E cells)(Yj + 4) + Z, retourne une variable aux mailles avec valeur de Yj+4.
   * Ex 2 : X = sum(j E cells)(Yj) + Z retourne Yj
   */
  private VarRef handleReductionArg(final IrModule m, final ReductionInstruction reductionInstr) {
    Expression _arg = reductionInstr.getReduction().getArg();
    if ((_arg instanceof VarRef)) {
      Expression _arg_1 = reductionInstr.getReduction().getArg();
      return ((VarRef) _arg_1);
    } else {
      final ReductionCall reduc = reductionInstr.getReduction();
      ArrayVariable _createArrayVariable = IrFactory.eINSTANCE.createArrayVariable();
      final Procedure1<ArrayVariable> _function = new Procedure1<ArrayVariable>() {
        @Override
        public void apply(final ArrayVariable it) {
          String _name = reductionInstr.getVariable().getName();
          String _plus = (_name + "ArgValue");
          it.setName(_plus);
          it.setType(reductionInstr.getVariable().getType());
          EList<Connectivity> _dimensions = it.getDimensions();
          Connectivity _connectivity = reductionInstr.getReduction().getIterator().getRange().getConnectivity();
          _dimensions.add(_connectivity);
        }
      };
      final ArrayVariable argValue = ObjectExtensions.<ArrayVariable>operator_doubleArrow(_createArrayVariable, _function);
      EList<Variable> _variables = m.getVariables();
      _variables.add(argValue);
      VarRef _createVarRef = IrFactory.eINSTANCE.createVarRef();
      final Procedure1<VarRef> _function_1 = new Procedure1<VarRef>() {
        @Override
        public void apply(final VarRef it) {
          it.setVariable(argValue);
          it.setType(EcoreUtil.<ExpressionType>copy(reduc.getArg().getType()));
        }
      };
      final VarRef argValueRef = ObjectExtensions.<VarRef>operator_doubleArrow(_createVarRef, _function_1);
      InstructionJob _createInstructionJob = IrFactory.eINSTANCE.createInstructionJob();
      final Procedure1<InstructionJob> _function_2 = new Procedure1<InstructionJob>() {
        @Override
        public void apply(final InstructionJob it) {
          String _name = reductionInstr.getVariable().getName();
          String _plus = ("Compute_" + _name);
          String _plus_1 = (_plus + "_arg");
          it.setName(_plus_1);
          it.setInstruction(ReplaceExternalReductions.this.createReductionLoop(EcoreUtil.<Iterator>copy(reduc.getIterator()), argValue, reduc.getArg(), "="));
        }
      };
      final InstructionJob argJob = ObjectExtensions.<InstructionJob>operator_doubleArrow(_createInstructionJob, _function_2);
      EList<Job> _jobs = m.getJobs();
      _jobs.add(argJob);
      return argValueRef;
    }
  }
  
  private String getOperator(final Reduction it) {
    try {
      String _xblockexpression = null;
      {
        final String op = ReplaceExternalReductions.ReductionOperators.get(it.getName());
        String _xifexpression = null;
        if ((op == null)) {
          String _name = it.getName();
          String _plus = ("Unsupported reduction function: " + _name);
          throw new Exception(_plus);
        } else {
          _xifexpression = op;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
