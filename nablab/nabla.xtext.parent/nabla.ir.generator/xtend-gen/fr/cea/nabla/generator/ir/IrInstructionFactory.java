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
package fr.cea.nabla.generator.ir;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.cea.nabla.generator.ir.IrAnnotationHelper;
import fr.cea.nabla.generator.ir.IrExpressionFactory;
import fr.cea.nabla.generator.ir.IrIteratorFactory;
import fr.cea.nabla.generator.ir.IrReductionInstructionFactory;
import fr.cea.nabla.generator.ir.IrVariableFactory;
import fr.cea.nabla.ir.ir.Expression;
import fr.cea.nabla.ir.ir.Instruction;
import fr.cea.nabla.ir.ir.IrAnnotation;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.ReductionInstruction;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.ir.VarRef;
import fr.cea.nabla.nabla.Affectation;
import fr.cea.nabla.nabla.If;
import fr.cea.nabla.nabla.InstructionBlock;
import fr.cea.nabla.nabla.Loop;
import fr.cea.nabla.nabla.ReductionCall;
import fr.cea.nabla.nabla.ScalarVar;
import fr.cea.nabla.nabla.ScalarVarDefinition;
import fr.cea.nabla.nabla.VarGroupDeclaration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Attention : cette classe doit être un singleton car elle utilise des méthodes create.
 * Si elle n'est pas singleton, plusieurs instances d'un même objet seront créées lors
 * deu parcours du graphe d'origine (voir la documentation Xtext).
 */
@Singleton
@SuppressWarnings("all")
public class IrInstructionFactory {
  @Inject
  @Extension
  private IrVariableFactory _irVariableFactory;
  
  @Inject
  @Extension
  private IrIteratorFactory _irIteratorFactory;
  
  @Inject
  @Extension
  private IrExpressionFactory _irExpressionFactory;
  
  @Inject
  @Extension
  private IrAnnotationHelper _irAnnotationHelper;
  
  @Inject
  @Extension
  private IrReductionInstructionFactory _irReductionInstructionFactory;
  
  protected Instruction _toIrInstruction(final ScalarVarDefinition v) {
    fr.cea.nabla.ir.ir.ScalarVarDefinition _createScalarVarDefinition = IrFactory.eINSTANCE.createScalarVarDefinition();
    final Procedure1<fr.cea.nabla.ir.ir.ScalarVarDefinition> _function = (fr.cea.nabla.ir.ir.ScalarVarDefinition it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(v);
      _annotations.add(_irAnnotation);
      EList<ScalarVariable> _variables = it.getVariables();
      ScalarVariable _irScalarVariable = this._irVariableFactory.toIrScalarVariable(v.getVariable());
      _variables.add(_irScalarVariable);
    };
    final fr.cea.nabla.ir.ir.ScalarVarDefinition irInstr = ObjectExtensions.<fr.cea.nabla.ir.ir.ScalarVarDefinition>operator_doubleArrow(_createScalarVarDefinition, _function);
    return this.transformReductions(irInstr, v.getDefaultValue());
  }
  
  protected Instruction _toIrInstruction(final VarGroupDeclaration v) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(v);
    final fr.cea.nabla.ir.ir.ScalarVarDefinition _result;
    synchronized (_createCache_toIrInstruction) {
      if (_createCache_toIrInstruction.containsKey(_cacheKey)) {
        return _createCache_toIrInstruction.get(_cacheKey);
      }
      fr.cea.nabla.ir.ir.ScalarVarDefinition _createScalarVarDefinition = IrFactory.eINSTANCE.createScalarVarDefinition();
      _result = _createScalarVarDefinition;
      _createCache_toIrInstruction.put(_cacheKey, _result);
    }
    _init_toIrInstruction(_result, v);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Instruction> _createCache_toIrInstruction = CollectionLiterals.newHashMap();
  
  private void _init_toIrInstruction(final fr.cea.nabla.ir.ir.ScalarVarDefinition it, final VarGroupDeclaration v) {
    Iterable<ScalarVar> _filter = Iterables.<ScalarVar>filter(v.getVariables(), ScalarVar.class);
    for (final ScalarVar scalarVar : _filter) {
      {
        EList<IrAnnotation> _annotations = it.getAnnotations();
        IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(v);
        _annotations.add(_irAnnotation);
        EList<ScalarVariable> _variables = it.getVariables();
        ScalarVariable _irScalarVariable = this._irVariableFactory.toIrScalarVariable(scalarVar);
        _variables.add(_irScalarVariable);
      }
    }
  }
  
  protected Instruction _toIrInstruction(final InstructionBlock v) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(v);
    final fr.cea.nabla.ir.ir.InstructionBlock _result;
    synchronized (_createCache_toIrInstruction_1) {
      if (_createCache_toIrInstruction_1.containsKey(_cacheKey)) {
        return _createCache_toIrInstruction_1.get(_cacheKey);
      }
      fr.cea.nabla.ir.ir.InstructionBlock _createInstructionBlock = IrFactory.eINSTANCE.createInstructionBlock();
      _result = _createInstructionBlock;
      _createCache_toIrInstruction_1.put(_cacheKey, _result);
    }
    _init_toIrInstruction_1(_result, v);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Instruction> _createCache_toIrInstruction_1 = CollectionLiterals.newHashMap();
  
  private void _init_toIrInstruction_1(final fr.cea.nabla.ir.ir.InstructionBlock it, final InstructionBlock v) {
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(v);
    _annotations.add(_irAnnotation);
    final Consumer<fr.cea.nabla.nabla.Instruction> _function = (fr.cea.nabla.nabla.Instruction x) -> {
      EList<Instruction> _instructions = it.getInstructions();
      Instruction _irInstruction = this.toIrInstruction(x);
      _instructions.add(_irInstruction);
    };
    v.getInstructions().forEach(_function);
  }
  
  protected Instruction _toIrInstruction(final Affectation v) {
    fr.cea.nabla.ir.ir.Affectation _createAffectation = IrFactory.eINSTANCE.createAffectation();
    final Procedure1<fr.cea.nabla.ir.ir.Affectation> _function = (fr.cea.nabla.ir.ir.Affectation it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(v);
      _annotations.add(_irAnnotation);
      Expression _irExpression = this._irExpressionFactory.toIrExpression(v.getVarRef());
      it.setLeft(((VarRef) _irExpression));
      it.setOperator("=");
      it.setRight(this._irExpressionFactory.toIrExpression(v.getExpression()));
    };
    final fr.cea.nabla.ir.ir.Affectation irInstr = ObjectExtensions.<fr.cea.nabla.ir.ir.Affectation>operator_doubleArrow(_createAffectation, _function);
    return this.transformReductions(irInstr, v.getExpression());
  }
  
  protected Instruction _toIrInstruction(final Loop v) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(v);
    final fr.cea.nabla.ir.ir.Loop _result;
    synchronized (_createCache_toIrInstruction_2) {
      if (_createCache_toIrInstruction_2.containsKey(_cacheKey)) {
        return _createCache_toIrInstruction_2.get(_cacheKey);
      }
      fr.cea.nabla.ir.ir.Loop _createLoop = IrFactory.eINSTANCE.createLoop();
      _result = _createLoop;
      _createCache_toIrInstruction_2.put(_cacheKey, _result);
    }
    _init_toIrInstruction_2(_result, v);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Instruction> _createCache_toIrInstruction_2 = CollectionLiterals.newHashMap();
  
  private void _init_toIrInstruction_2(final fr.cea.nabla.ir.ir.Loop it, final Loop v) {
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(v);
    _annotations.add(_irAnnotation);
    it.setIterator(this._irIteratorFactory.toIrIterator(v.getIterator()));
    it.setBody(this.toIrInstruction(v.getBody()));
  }
  
  protected Instruction _toIrInstruction(final If v) {
    fr.cea.nabla.ir.ir.If _createIf = IrFactory.eINSTANCE.createIf();
    final Procedure1<fr.cea.nabla.ir.ir.If> _function = (fr.cea.nabla.ir.ir.If it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(v);
      _annotations.add(_irAnnotation);
      it.setCondition(this._irExpressionFactory.toIrExpression(v.getCondition()));
      it.setThenInstruction(this.toIrInstruction(v.getThen()));
      fr.cea.nabla.nabla.Instruction _else = v.getElse();
      boolean _tripleNotEquals = (_else != null);
      if (_tripleNotEquals) {
        it.setElseInstruction(this.toIrInstruction(v.getElse()));
      }
    };
    final fr.cea.nabla.ir.ir.If irInstr = ObjectExtensions.<fr.cea.nabla.ir.ir.If>operator_doubleArrow(_createIf, _function);
    return this.transformReductions(irInstr, v.getCondition());
  }
  
  private Instruction transformReductions(final Instruction i, final fr.cea.nabla.nabla.Expression e) {
    if (((e instanceof ReductionCall) || IteratorExtensions.<EObject>exists(e.eAllContents(), ((Function1<EObject, Boolean>) (EObject x) -> {
      return Boolean.valueOf((x instanceof ReductionCall));
    })))) {
      fr.cea.nabla.ir.ir.InstructionBlock _createInstructionBlock = IrFactory.eINSTANCE.createInstructionBlock();
      final Procedure1<fr.cea.nabla.ir.ir.InstructionBlock> _function = (fr.cea.nabla.ir.ir.InstructionBlock it) -> {
        EList<IrAnnotation> _annotations = it.getAnnotations();
        IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
        _annotations.add(_irAnnotation);
        EList<Instruction> _instructions = it.getInstructions();
        Iterable<ReductionInstruction> _irReductions = this._irReductionInstructionFactory.toIrReductions(e);
        Iterables.<Instruction>addAll(_instructions, _irReductions);
        EList<Instruction> _instructions_1 = it.getInstructions();
        _instructions_1.add(i);
      };
      return ObjectExtensions.<fr.cea.nabla.ir.ir.InstructionBlock>operator_doubleArrow(_createInstructionBlock, _function);
    } else {
      return i;
    }
  }
  
  public Instruction toIrInstruction(final fr.cea.nabla.nabla.Instruction v) {
    if (v instanceof Affectation) {
      return _toIrInstruction((Affectation)v);
    } else if (v instanceof If) {
      return _toIrInstruction((If)v);
    } else if (v instanceof InstructionBlock) {
      return _toIrInstruction((InstructionBlock)v);
    } else if (v instanceof Loop) {
      return _toIrInstruction((Loop)v);
    } else if (v instanceof ScalarVarDefinition) {
      return _toIrInstruction((ScalarVarDefinition)v);
    } else if (v instanceof VarGroupDeclaration) {
      return _toIrInstruction((VarGroupDeclaration)v);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(v).toString());
    }
  }
}
