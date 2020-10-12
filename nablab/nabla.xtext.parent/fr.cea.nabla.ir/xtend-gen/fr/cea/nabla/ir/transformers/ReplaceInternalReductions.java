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
import fr.cea.nabla.ir.ir.BasicType;
import fr.cea.nabla.ir.ir.BinaryExpression;
import fr.cea.nabla.ir.ir.Expression;
import fr.cea.nabla.ir.ir.ExpressionType;
import fr.cea.nabla.ir.ir.Function;
import fr.cea.nabla.ir.ir.FunctionCall;
import fr.cea.nabla.ir.ir.Instruction;
import fr.cea.nabla.ir.ir.InstructionBlock;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.ir.Loop;
import fr.cea.nabla.ir.ir.Parenthesis;
import fr.cea.nabla.ir.ir.Reduction;
import fr.cea.nabla.ir.ir.ReductionCall;
import fr.cea.nabla.ir.ir.ReductionInstruction;
import fr.cea.nabla.ir.ir.ScalarVarDefinition;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.ir.VarRef;
import fr.cea.nabla.ir.transformers.IrTransformationStep;
import fr.cea.nabla.ir.transformers.ReplaceReductionsBase;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ReplaceInternalReductions extends ReplaceReductionsBase implements IrTransformationStep {
  private static final Map<String, String> Operators = Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(Pair.<String, String>of("sum", "+"), Pair.<String, String>of("prod", "*")));
  
  @Override
  public String getDescription() {
    return "Replace internal reductions by loops";
  }
  
  /**
   * Transforme le module m pour qu'il n'est plus d'instance de ReductionInstruction.
   * Les réductions sont remplacées par des opérateurs ou des fonctions traditionnelles.
   * Le choix se fait en fonction de la liste Operators.
   */
  @Override
  public boolean transform(final IrModule m) {
    final Function1<ReductionInstruction, Boolean> _function = new Function1<ReductionInstruction, Boolean>() {
      @Override
      public Boolean apply(final ReductionInstruction it) {
        boolean _isExternal = ReplaceInternalReductions.this.isExternal(it.getReduction());
        return Boolean.valueOf((!_isExternal));
      }
    };
    Iterable<ReductionInstruction> _iterable = IteratorExtensions.<ReductionInstruction>toIterable(IteratorExtensions.<ReductionInstruction>filter(Iterators.<ReductionInstruction>filter(m.eAllContents(), ReductionInstruction.class), _function));
    for (final ReductionInstruction reductionInstr : _iterable) {
      {
        final Reduction reduc = reductionInstr.getReduction().getReduction();
        final Expression loopExpression = this.createAffectationRHS(m, reductionInstr);
        final Loop loop = this.createReductionLoop(reductionInstr.getReduction().getIterator(), reductionInstr.getVariable(), loopExpression, "=");
        ScalarVarDefinition _createScalarVarDefinition = IrFactory.eINSTANCE.createScalarVarDefinition();
        final Procedure1<ScalarVarDefinition> _function_1 = new Procedure1<ScalarVarDefinition>() {
          @Override
          public void apply(final ScalarVarDefinition it) {
            EList<ScalarVariable> _variables = it.getVariables();
            ScalarVariable _variable = reductionInstr.getVariable();
            _variables.add(_variable);
          }
        };
        final ScalarVarDefinition variableDefinition = ObjectExtensions.<ScalarVarDefinition>operator_doubleArrow(_createScalarVarDefinition, _function_1);
        this.replace(reductionInstr, variableDefinition, loop);
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
  }
  
  private Expression createAffectationRHS(final IrModule m, final ReductionInstruction reductionInstr) {
    final Reduction reduction = reductionInstr.getReduction().getReduction();
    VarRef _createVarRef = IrFactory.eINSTANCE.createVarRef();
    final Procedure1<VarRef> _function = new Procedure1<VarRef>() {
      @Override
      public void apply(final VarRef it) {
        it.setVariable(reductionInstr.getVariable());
        it.setType(ReplaceInternalReductions.this.createExpressionType(it.getVariable().getType()));
      }
    };
    final VarRef varRef = ObjectExtensions.<VarRef>operator_doubleArrow(_createVarRef, _function);
    boolean _contains = ReplaceInternalReductions.Operators.keySet().contains(reduction.getName());
    if (_contains) {
      BinaryExpression _createBinaryExpression = IrFactory.eINSTANCE.createBinaryExpression();
      final Procedure1<BinaryExpression> _function_1 = new Procedure1<BinaryExpression>() {
        @Override
        public void apply(final BinaryExpression it) {
          it.setType(ReplaceInternalReductions.this.createExpressionType(reduction.getReturnType()));
          it.setOperator(ReplaceInternalReductions.Operators.get(reduction.getName()));
          it.setLeft(varRef);
          Parenthesis _createParenthesis = IrFactory.eINSTANCE.createParenthesis();
          final Procedure1<Parenthesis> _function = new Procedure1<Parenthesis>() {
            @Override
            public void apply(final Parenthesis it) {
              it.setExpression(reductionInstr.getReduction().getArg());
              it.setType(EcoreUtil.<ExpressionType>copy(it.getExpression().getType()));
            }
          };
          Parenthesis _doubleArrow = ObjectExtensions.<Parenthesis>operator_doubleArrow(_createParenthesis, _function);
          it.setRight(_doubleArrow);
        }
      };
      return ObjectExtensions.<BinaryExpression>operator_doubleArrow(_createBinaryExpression, _function_1);
    } else {
      final Function f = this.findOrCreateFunction(m, reduction);
      FunctionCall _createFunctionCall = IrFactory.eINSTANCE.createFunctionCall();
      final Procedure1<FunctionCall> _function_2 = new Procedure1<FunctionCall>() {
        @Override
        public void apply(final FunctionCall it) {
          it.setType(ReplaceInternalReductions.this.createExpressionType(f.getReturnType()));
          it.setFunction(f);
          EList<Expression> _args = it.getArgs();
          _args.add(varRef);
          EList<Expression> _args_1 = it.getArgs();
          Expression _arg = reductionInstr.getReduction().getArg();
          _args_1.add(_arg);
        }
      };
      return ObjectExtensions.<FunctionCall>operator_doubleArrow(_createFunctionCall, _function_2);
    }
  }
  
  private Function findOrCreateFunction(final IrModule m, final Reduction r) {
    final Function1<Function, Boolean> _function = new Function1<Function, Boolean>() {
      @Override
      public Boolean apply(final Function it) {
        return Boolean.valueOf(((((Objects.equal(it.getName(), r.getName()) && 
          (((Object[])Conversions.unwrapArray(it.getInTypes(), Object.class)).length == 2)) && 
          Objects.equal(it.getInTypes().get(0), r.getCollectionType())) && 
          Objects.equal(it.getInTypes().get(1), r.getReturnType())) && 
          Objects.equal(it.getReturnType(), r.getReturnType())));
      }
    };
    Function function = IterableExtensions.<Function>findFirst(m.getFunctions(), _function);
    if ((function == null)) {
      Function _createFunction = IrFactory.eINSTANCE.createFunction();
      final Procedure1<Function> _function_1 = new Procedure1<Function>() {
        @Override
        public void apply(final Function it) {
          it.setName(r.getName());
          EList<BasicType> _inTypes = it.getInTypes();
          BasicType _collectionType = r.getCollectionType();
          _inTypes.add(_collectionType);
          EList<BasicType> _inTypes_1 = it.getInTypes();
          BasicType _returnType = r.getReturnType();
          _inTypes_1.add(_returnType);
          it.setReturnType(r.getReturnType());
          it.setProvider(r.getProvider());
        }
      };
      Function _doubleArrow = ObjectExtensions.<Function>operator_doubleArrow(_createFunction, _function_1);
      function = _doubleArrow;
      EList<Function> _functions = m.getFunctions();
      _functions.add(function);
    }
    return function;
  }
  
  /**
   * Extension de la méthode EcoreUtil::replace pour une liste d'objet.
   * Si le eContainmentFeature est de cardinalité 1, un block est créé,
   * sinon les instructions sont ajoutées une à une à l'emplacement de la réduction.
   */
  private void replace(final ReductionInstruction reduction, final ScalarVarDefinition replacementI1, final Loop replacementI2) {
    final EObject container = reduction.eContainer();
    if ((container != null)) {
      final EReference feature = reduction.eContainmentFeature();
      boolean _isMany = FeatureMapUtil.isMany(container, feature);
      if (_isMany) {
        Object _eGet = container.eGet(feature);
        final List<Object> list = ((List<Object>) _eGet);
        final int reductionIndex = list.indexOf(reduction);
        list.set(reductionIndex, replacementI1);
        list.add((reductionIndex + 1), replacementI2);
      } else {
        InstructionBlock _createInstructionBlock = IrFactory.eINSTANCE.createInstructionBlock();
        final Procedure1<InstructionBlock> _function = new Procedure1<InstructionBlock>() {
          @Override
          public void apply(final InstructionBlock it) {
            EList<Instruction> _instructions = it.getInstructions();
            _instructions.add(replacementI1);
            EList<Instruction> _instructions_1 = it.getInstructions();
            _instructions_1.add(replacementI2);
          }
        };
        final InstructionBlock replacementBlock = ObjectExtensions.<InstructionBlock>operator_doubleArrow(_createInstructionBlock, _function);
        container.eSet(feature, replacementBlock);
      }
    }
  }
  
  private ExpressionType createExpressionType(final BasicType t) {
    ExpressionType _createExpressionType = IrFactory.eINSTANCE.createExpressionType();
    final Procedure1<ExpressionType> _function = new Procedure1<ExpressionType>() {
      @Override
      public void apply(final ExpressionType it) {
        it.setBasicType(t);
        it.setDimension(0);
      }
    };
    return ObjectExtensions.<ExpressionType>operator_doubleArrow(_createExpressionType, _function);
  }
}
