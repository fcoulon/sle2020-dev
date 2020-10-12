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
import fr.cea.nabla.FunctionCallExtensions;
import fr.cea.nabla.generator.ir.IrAnnotationHelper;
import fr.cea.nabla.generator.ir.IrFunctionFactory;
import fr.cea.nabla.generator.ir.IrIteratorFactory;
import fr.cea.nabla.generator.ir.IrVariableFactory;
import fr.cea.nabla.generator.ir.Nabla2IrUtils;
import fr.cea.nabla.generator.ir.ReductionCallExtensions;
import fr.cea.nabla.ir.ir.BinaryExpression;
import fr.cea.nabla.ir.ir.Expression;
import fr.cea.nabla.ir.ir.ExpressionType;
import fr.cea.nabla.ir.ir.IrAnnotation;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.ir.UnaryExpression;
import fr.cea.nabla.ir.ir.VarRef;
import fr.cea.nabla.nabla.And;
import fr.cea.nabla.nabla.BasicType;
import fr.cea.nabla.nabla.BoolConstant;
import fr.cea.nabla.nabla.Comparison;
import fr.cea.nabla.nabla.Equality;
import fr.cea.nabla.nabla.FunctionCall;
import fr.cea.nabla.nabla.IntConstant;
import fr.cea.nabla.nabla.IteratorRangeOrRef;
import fr.cea.nabla.nabla.MaxConstant;
import fr.cea.nabla.nabla.MinConstant;
import fr.cea.nabla.nabla.Minus;
import fr.cea.nabla.nabla.MulOrDiv;
import fr.cea.nabla.nabla.Not;
import fr.cea.nabla.nabla.Or;
import fr.cea.nabla.nabla.Parenthesis;
import fr.cea.nabla.nabla.Plus;
import fr.cea.nabla.nabla.Real2Constant;
import fr.cea.nabla.nabla.Real2x2Constant;
import fr.cea.nabla.nabla.Real3Constant;
import fr.cea.nabla.nabla.Real3x3Constant;
import fr.cea.nabla.nabla.RealConstant;
import fr.cea.nabla.nabla.RealXCompactConstant;
import fr.cea.nabla.nabla.ReductionCall;
import fr.cea.nabla.nabla.UnaryMinus;
import fr.cea.nabla.typing.ExpressionTypeProvider;
import fr.cea.nabla.typing.NablaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class IrExpressionFactory {
  @Inject
  @Extension
  private FunctionCallExtensions _functionCallExtensions;
  
  @Inject
  @Extension
  private IrAnnotationHelper _irAnnotationHelper;
  
  @Inject
  @Extension
  private Nabla2IrUtils _nabla2IrUtils;
  
  @Inject
  @Extension
  private IrFunctionFactory _irFunctionFactory;
  
  @Inject
  @Extension
  private IrVariableFactory _irVariableFactory;
  
  @Inject
  @Extension
  private IrIteratorFactory _irIteratorFactory;
  
  @Inject
  @Extension
  private ExpressionTypeProvider _expressionTypeProvider;
  
  @Inject
  @Extension
  private ReductionCallExtensions _reductionCallExtensions;
  
  protected Expression _toIrExpression(final Or e) {
    return this.toIrBinaryExpr(e, e.getLeft(), e.getRight(), e.getOp());
  }
  
  protected Expression _toIrExpression(final And e) {
    return this.toIrBinaryExpr(e, e.getLeft(), e.getRight(), e.getOp());
  }
  
  protected Expression _toIrExpression(final Equality e) {
    return this.toIrBinaryExpr(e, e.getLeft(), e.getRight(), e.getOp());
  }
  
  protected Expression _toIrExpression(final Comparison e) {
    return this.toIrBinaryExpr(e, e.getLeft(), e.getRight(), e.getOp());
  }
  
  protected Expression _toIrExpression(final Plus e) {
    return this.toIrBinaryExpr(e, e.getLeft(), e.getRight(), e.getOp());
  }
  
  protected Expression _toIrExpression(final Minus e) {
    return this.toIrBinaryExpr(e, e.getLeft(), e.getRight(), e.getOp());
  }
  
  protected Expression _toIrExpression(final MulOrDiv e) {
    return this.toIrBinaryExpr(e, e.getLeft(), e.getRight(), e.getOp());
  }
  
  protected Expression _toIrExpression(final Parenthesis e) {
    fr.cea.nabla.ir.ir.Parenthesis _createParenthesis = IrFactory.eINSTANCE.createParenthesis();
    final Procedure1<fr.cea.nabla.ir.ir.Parenthesis> _function = (fr.cea.nabla.ir.ir.Parenthesis it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
      _annotations.add(_irAnnotation);
      NablaType _typeFor = this._expressionTypeProvider.getTypeFor(e);
      ExpressionType _irExpressionType = null;
      if (_typeFor!=null) {
        _irExpressionType=this.toIrExpressionType(_typeFor);
      }
      it.setType(_irExpressionType);
      it.setExpression(this.toIrExpression(e.getExpression()));
    };
    return ObjectExtensions.<fr.cea.nabla.ir.ir.Parenthesis>operator_doubleArrow(_createParenthesis, _function);
  }
  
  protected Expression _toIrExpression(final UnaryMinus e) {
    return this.toIrUnaryExpr(e, e.getExpression(), "-");
  }
  
  protected Expression _toIrExpression(final Not e) {
    return this.toIrUnaryExpr(e, e.getExpression(), "!");
  }
  
  protected Expression _toIrExpression(final IntConstant e) {
    fr.cea.nabla.ir.ir.IntConstant _createIntConstant = IrFactory.eINSTANCE.createIntConstant();
    final Procedure1<fr.cea.nabla.ir.ir.IntConstant> _function = (fr.cea.nabla.ir.ir.IntConstant it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
      _annotations.add(_irAnnotation);
      NablaType _typeFor = this._expressionTypeProvider.getTypeFor(e);
      ExpressionType _irExpressionType = null;
      if (_typeFor!=null) {
        _irExpressionType=this.toIrExpressionType(_typeFor);
      }
      it.setType(_irExpressionType);
      it.setValue(e.getValue());
    };
    return ObjectExtensions.<fr.cea.nabla.ir.ir.IntConstant>operator_doubleArrow(_createIntConstant, _function);
  }
  
  protected Expression _toIrExpression(final RealConstant e) {
    fr.cea.nabla.ir.ir.RealConstant _createRealConstant = IrFactory.eINSTANCE.createRealConstant();
    final Procedure1<fr.cea.nabla.ir.ir.RealConstant> _function = (fr.cea.nabla.ir.ir.RealConstant it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
      _annotations.add(_irAnnotation);
      NablaType _typeFor = this._expressionTypeProvider.getTypeFor(e);
      ExpressionType _irExpressionType = null;
      if (_typeFor!=null) {
        _irExpressionType=this.toIrExpressionType(_typeFor);
      }
      it.setType(_irExpressionType);
      it.setValue(e.getValue());
    };
    return ObjectExtensions.<fr.cea.nabla.ir.ir.RealConstant>operator_doubleArrow(_createRealConstant, _function);
  }
  
  protected Expression _toIrExpression(final Real2Constant e) {
    fr.cea.nabla.ir.ir.Real2Constant _createReal2Constant = IrFactory.eINSTANCE.createReal2Constant();
    final Procedure1<fr.cea.nabla.ir.ir.Real2Constant> _function = (fr.cea.nabla.ir.ir.Real2Constant it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
      _annotations.add(_irAnnotation);
      NablaType _typeFor = this._expressionTypeProvider.getTypeFor(e);
      ExpressionType _irExpressionType = null;
      if (_typeFor!=null) {
        _irExpressionType=this.toIrExpressionType(_typeFor);
      }
      it.setType(_irExpressionType);
      it.setX(e.getX());
      it.setY(e.getY());
    };
    return ObjectExtensions.<fr.cea.nabla.ir.ir.Real2Constant>operator_doubleArrow(_createReal2Constant, _function);
  }
  
  protected Expression _toIrExpression(final Real3Constant e) {
    fr.cea.nabla.ir.ir.Real3Constant _createReal3Constant = IrFactory.eINSTANCE.createReal3Constant();
    final Procedure1<fr.cea.nabla.ir.ir.Real3Constant> _function = (fr.cea.nabla.ir.ir.Real3Constant it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
      _annotations.add(_irAnnotation);
      NablaType _typeFor = this._expressionTypeProvider.getTypeFor(e);
      ExpressionType _irExpressionType = null;
      if (_typeFor!=null) {
        _irExpressionType=this.toIrExpressionType(_typeFor);
      }
      it.setType(_irExpressionType);
      it.setX(e.getX());
      it.setY(e.getY());
      it.setZ(e.getZ());
    };
    return ObjectExtensions.<fr.cea.nabla.ir.ir.Real3Constant>operator_doubleArrow(_createReal3Constant, _function);
  }
  
  protected Expression _toIrExpression(final Real2x2Constant e) {
    fr.cea.nabla.ir.ir.Real2x2Constant _createReal2x2Constant = IrFactory.eINSTANCE.createReal2x2Constant();
    final Procedure1<fr.cea.nabla.ir.ir.Real2x2Constant> _function = (fr.cea.nabla.ir.ir.Real2x2Constant it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
      _annotations.add(_irAnnotation);
      NablaType _typeFor = this._expressionTypeProvider.getTypeFor(e);
      ExpressionType _irExpressionType = null;
      if (_typeFor!=null) {
        _irExpressionType=this.toIrExpressionType(_typeFor);
      }
      it.setType(_irExpressionType);
      Expression _irExpression = this.toIrExpression(e.getX());
      it.setX(((fr.cea.nabla.ir.ir.Real2Constant) _irExpression));
      Expression _irExpression_1 = this.toIrExpression(e.getY());
      it.setY(((fr.cea.nabla.ir.ir.Real2Constant) _irExpression_1));
    };
    return ObjectExtensions.<fr.cea.nabla.ir.ir.Real2x2Constant>operator_doubleArrow(_createReal2x2Constant, _function);
  }
  
  protected Expression _toIrExpression(final Real3x3Constant e) {
    fr.cea.nabla.ir.ir.Real3x3Constant _createReal3x3Constant = IrFactory.eINSTANCE.createReal3x3Constant();
    final Procedure1<fr.cea.nabla.ir.ir.Real3x3Constant> _function = (fr.cea.nabla.ir.ir.Real3x3Constant it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
      _annotations.add(_irAnnotation);
      NablaType _typeFor = this._expressionTypeProvider.getTypeFor(e);
      ExpressionType _irExpressionType = null;
      if (_typeFor!=null) {
        _irExpressionType=this.toIrExpressionType(_typeFor);
      }
      it.setType(_irExpressionType);
      Expression _irExpression = this.toIrExpression(e.getX());
      it.setX(((fr.cea.nabla.ir.ir.Real3Constant) _irExpression));
      Expression _irExpression_1 = this.toIrExpression(e.getY());
      it.setY(((fr.cea.nabla.ir.ir.Real3Constant) _irExpression_1));
      Expression _irExpression_2 = this.toIrExpression(e.getZ());
      it.setZ(((fr.cea.nabla.ir.ir.Real3Constant) _irExpression_2));
    };
    return ObjectExtensions.<fr.cea.nabla.ir.ir.Real3x3Constant>operator_doubleArrow(_createReal3x3Constant, _function);
  }
  
  protected Expression _toIrExpression(final BoolConstant e) {
    fr.cea.nabla.ir.ir.BoolConstant _createBoolConstant = IrFactory.eINSTANCE.createBoolConstant();
    final Procedure1<fr.cea.nabla.ir.ir.BoolConstant> _function = (fr.cea.nabla.ir.ir.BoolConstant it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
      _annotations.add(_irAnnotation);
      NablaType _typeFor = this._expressionTypeProvider.getTypeFor(e);
      ExpressionType _irExpressionType = null;
      if (_typeFor!=null) {
        _irExpressionType=this.toIrExpressionType(_typeFor);
      }
      it.setType(_irExpressionType);
      it.setValue(e.isValue());
    };
    return ObjectExtensions.<fr.cea.nabla.ir.ir.BoolConstant>operator_doubleArrow(_createBoolConstant, _function);
  }
  
  protected Expression _toIrExpression(final RealXCompactConstant e) {
    Expression _irRealExpression = this.toIrRealExpression(e.getType(), e.getValue());
    final Procedure1<Expression> _function = (Expression it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
      _annotations.add(_irAnnotation);
      NablaType _typeFor = this._expressionTypeProvider.getTypeFor(e);
      ExpressionType _irExpressionType = null;
      if (_typeFor!=null) {
        _irExpressionType=this.toIrExpressionType(_typeFor);
      }
      it.setType(_irExpressionType);
    };
    return ObjectExtensions.<Expression>operator_doubleArrow(_irRealExpression, _function);
  }
  
  protected Expression _toIrExpression(final MinConstant e) {
    fr.cea.nabla.ir.ir.MinConstant _createMinConstant = IrFactory.eINSTANCE.createMinConstant();
    final Procedure1<fr.cea.nabla.ir.ir.MinConstant> _function = (fr.cea.nabla.ir.ir.MinConstant it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
      _annotations.add(_irAnnotation);
      NablaType _typeFor = this._expressionTypeProvider.getTypeFor(e);
      ExpressionType _irExpressionType = null;
      if (_typeFor!=null) {
        _irExpressionType=this.toIrExpressionType(_typeFor);
      }
      it.setType(_irExpressionType);
    };
    return ObjectExtensions.<fr.cea.nabla.ir.ir.MinConstant>operator_doubleArrow(_createMinConstant, _function);
  }
  
  protected Expression _toIrExpression(final MaxConstant e) {
    fr.cea.nabla.ir.ir.MaxConstant _createMaxConstant = IrFactory.eINSTANCE.createMaxConstant();
    final Procedure1<fr.cea.nabla.ir.ir.MaxConstant> _function = (fr.cea.nabla.ir.ir.MaxConstant it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
      _annotations.add(_irAnnotation);
      NablaType _typeFor = this._expressionTypeProvider.getTypeFor(e);
      ExpressionType _irExpressionType = null;
      if (_typeFor!=null) {
        _irExpressionType=this.toIrExpressionType(_typeFor);
      }
      it.setType(_irExpressionType);
    };
    return ObjectExtensions.<fr.cea.nabla.ir.ir.MaxConstant>operator_doubleArrow(_createMaxConstant, _function);
  }
  
  protected Expression _toIrExpression(final FunctionCall e) {
    fr.cea.nabla.ir.ir.FunctionCall _createFunctionCall = IrFactory.eINSTANCE.createFunctionCall();
    final Procedure1<fr.cea.nabla.ir.ir.FunctionCall> _function = (fr.cea.nabla.ir.ir.FunctionCall it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
      _annotations.add(_irAnnotation);
      NablaType _typeFor = this._expressionTypeProvider.getTypeFor(e);
      ExpressionType _irExpressionType = null;
      if (_typeFor!=null) {
        _irExpressionType=this.toIrExpressionType(_typeFor);
      }
      it.setType(_irExpressionType);
      it.setFunction(this._irFunctionFactory.toIrFunction(e.getFunction(), this._functionCallExtensions.getDeclaration(e)));
      EList<Expression> _args = it.getArgs();
      final Function1<fr.cea.nabla.nabla.Expression, Expression> _function_1 = (fr.cea.nabla.nabla.Expression it_1) -> {
        return this.toIrExpression(it_1);
      };
      List<Expression> _map = ListExtensions.<fr.cea.nabla.nabla.Expression, Expression>map(e.getArgs(), _function_1);
      Iterables.<Expression>addAll(_args, _map);
    };
    return ObjectExtensions.<fr.cea.nabla.ir.ir.FunctionCall>operator_doubleArrow(_createFunctionCall, _function);
  }
  
  protected Expression _toIrExpression(final ReductionCall e) {
    VarRef _xblockexpression = null;
    {
      final ScalarVariable irVariable = this._reductionCallExtensions.toIrLocalVariable(e);
      VarRef _createVarRef = IrFactory.eINSTANCE.createVarRef();
      final Procedure1<VarRef> _function = (VarRef it) -> {
        EList<IrAnnotation> _annotations = it.getAnnotations();
        IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
        _annotations.add(_irAnnotation);
        NablaType _typeFor = this._expressionTypeProvider.getTypeFor(e);
        ExpressionType _irExpressionType = null;
        if (_typeFor!=null) {
          _irExpressionType=this.toIrExpressionType(_typeFor);
        }
        it.setType(_irExpressionType);
        it.setVariable(irVariable);
      };
      _xblockexpression = ObjectExtensions.<VarRef>operator_doubleArrow(_createVarRef, _function);
    }
    return _xblockexpression;
  }
  
  protected Expression _toIrExpression(final fr.cea.nabla.nabla.VarRef e) {
    VarRef _createVarRef = IrFactory.eINSTANCE.createVarRef();
    final Procedure1<VarRef> _function = (VarRef it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(e);
      _annotations.add(_irAnnotation);
      NablaType _typeFor = this._expressionTypeProvider.getTypeFor(e);
      ExpressionType _irExpressionType = null;
      if (_typeFor!=null) {
        _irExpressionType=this.toIrExpressionType(_typeFor);
      }
      it.setType(_irExpressionType);
      it.setVariable(this._irVariableFactory.toIrVariable(e.getVariable(), e.getTimeIterator()));
      final Consumer<IteratorRangeOrRef> _function_1 = (IteratorRangeOrRef x) -> {
        EList<fr.cea.nabla.ir.ir.IteratorRangeOrRef> _iterators = it.getIterators();
        fr.cea.nabla.ir.ir.IteratorRangeOrRef _irIteratorRangeOrRef = this._irIteratorFactory.toIrIteratorRangeOrRef(x);
        _iterators.add(_irIteratorRangeOrRef);
      };
      e.getSpaceIterators().forEach(_function_1);
      final Consumer<String> _function_2 = (String x) -> {
        EList<String> _fields = it.getFields();
        _fields.add(x);
      };
      e.getFields().forEach(_function_2);
    };
    return ObjectExtensions.<VarRef>operator_doubleArrow(_createVarRef, _function);
  }
  
  private BinaryExpression toIrBinaryExpr(final fr.cea.nabla.nabla.Expression container, final fr.cea.nabla.nabla.Expression l, final fr.cea.nabla.nabla.Expression r, final String op) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(container, l, r, op);
    final BinaryExpression _result;
    synchronized (_createCache_toIrBinaryExpr) {
      if (_createCache_toIrBinaryExpr.containsKey(_cacheKey)) {
        return _createCache_toIrBinaryExpr.get(_cacheKey);
      }
      BinaryExpression _createBinaryExpression = IrFactory.eINSTANCE.createBinaryExpression();
      _result = _createBinaryExpression;
      _createCache_toIrBinaryExpr.put(_cacheKey, _result);
    }
    _init_toIrBinaryExpr(_result, container, l, r, op);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, BinaryExpression> _createCache_toIrBinaryExpr = CollectionLiterals.newHashMap();
  
  private void _init_toIrBinaryExpr(final BinaryExpression it, final fr.cea.nabla.nabla.Expression container, final fr.cea.nabla.nabla.Expression l, final fr.cea.nabla.nabla.Expression r, final String op) {
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(container);
    _annotations.add(_irAnnotation);
    NablaType _typeFor = this._expressionTypeProvider.getTypeFor(container);
    ExpressionType _irExpressionType = null;
    if (_typeFor!=null) {
      _irExpressionType=this.toIrExpressionType(_typeFor);
    }
    it.setType(_irExpressionType);
    it.setOperator(op);
    it.setLeft(this.toIrExpression(l));
    it.setRight(this.toIrExpression(r));
  }
  
  private UnaryExpression toIrUnaryExpr(final fr.cea.nabla.nabla.Expression container, final fr.cea.nabla.nabla.Expression e, final String op) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(container, e, op);
    final UnaryExpression _result;
    synchronized (_createCache_toIrUnaryExpr) {
      if (_createCache_toIrUnaryExpr.containsKey(_cacheKey)) {
        return _createCache_toIrUnaryExpr.get(_cacheKey);
      }
      UnaryExpression _createUnaryExpression = IrFactory.eINSTANCE.createUnaryExpression();
      _result = _createUnaryExpression;
      _createCache_toIrUnaryExpr.put(_cacheKey, _result);
    }
    _init_toIrUnaryExpr(_result, container, e, op);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, UnaryExpression> _createCache_toIrUnaryExpr = CollectionLiterals.newHashMap();
  
  private void _init_toIrUnaryExpr(final UnaryExpression it, final fr.cea.nabla.nabla.Expression container, final fr.cea.nabla.nabla.Expression e, final String op) {
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(container);
    _annotations.add(_irAnnotation);
    NablaType _typeFor = this._expressionTypeProvider.getTypeFor(container);
    ExpressionType _irExpressionType = null;
    if (_typeFor!=null) {
      _irExpressionType=this.toIrExpressionType(_typeFor);
    }
    it.setType(_irExpressionType);
    it.setOperator(op);
    it.setExpression(this.toIrExpression(e));
  }
  
  private ExpressionType toIrExpressionType(final NablaType t) {
    ExpressionType _createExpressionType = IrFactory.eINSTANCE.createExpressionType();
    final Procedure1<ExpressionType> _function = (ExpressionType it) -> {
      it.setBasicType(this._nabla2IrUtils.toIrBasicType(t.getBase()));
      it.setDimension(t.getDimension());
    };
    return ObjectExtensions.<ExpressionType>operator_doubleArrow(_createExpressionType, _function);
  }
  
  private Expression toIrRealExpression(final BasicType type, final double v) {
    Expression _switchResult = null;
    if (type != null) {
      switch (type) {
        case REAL:
          fr.cea.nabla.ir.ir.RealConstant _createRealConstant = IrFactory.eINSTANCE.createRealConstant();
          final Procedure1<fr.cea.nabla.ir.ir.RealConstant> _function = (fr.cea.nabla.ir.ir.RealConstant it) -> {
            it.setValue(v);
          };
          _switchResult = ObjectExtensions.<fr.cea.nabla.ir.ir.RealConstant>operator_doubleArrow(_createRealConstant, _function);
          break;
        case REAL2:
          fr.cea.nabla.ir.ir.Real2Constant _createReal2Constant = IrFactory.eINSTANCE.createReal2Constant();
          final Procedure1<fr.cea.nabla.ir.ir.Real2Constant> _function_1 = (fr.cea.nabla.ir.ir.Real2Constant it) -> {
            it.setX(v);
            it.setY(v);
          };
          _switchResult = ObjectExtensions.<fr.cea.nabla.ir.ir.Real2Constant>operator_doubleArrow(_createReal2Constant, _function_1);
          break;
        case REAL3:
          fr.cea.nabla.ir.ir.Real3Constant _createReal3Constant = IrFactory.eINSTANCE.createReal3Constant();
          final Procedure1<fr.cea.nabla.ir.ir.Real3Constant> _function_2 = (fr.cea.nabla.ir.ir.Real3Constant it) -> {
            it.setX(v);
            it.setY(v);
            it.setZ(v);
          };
          _switchResult = ObjectExtensions.<fr.cea.nabla.ir.ir.Real3Constant>operator_doubleArrow(_createReal3Constant, _function_2);
          break;
        case REAL2X2:
          fr.cea.nabla.ir.ir.Real2x2Constant _createReal2x2Constant = IrFactory.eINSTANCE.createReal2x2Constant();
          final Procedure1<fr.cea.nabla.ir.ir.Real2x2Constant> _function_3 = (fr.cea.nabla.ir.ir.Real2x2Constant it) -> {
            fr.cea.nabla.ir.ir.Real2Constant _createReal2Constant_1 = IrFactory.eINSTANCE.createReal2Constant();
            final Procedure1<fr.cea.nabla.ir.ir.Real2Constant> _function_4 = (fr.cea.nabla.ir.ir.Real2Constant it_1) -> {
              it_1.setX(v);
              it_1.setY(v);
            };
            fr.cea.nabla.ir.ir.Real2Constant _doubleArrow = ObjectExtensions.<fr.cea.nabla.ir.ir.Real2Constant>operator_doubleArrow(_createReal2Constant_1, _function_4);
            it.setX(_doubleArrow);
            fr.cea.nabla.ir.ir.Real2Constant _createReal2Constant_2 = IrFactory.eINSTANCE.createReal2Constant();
            final Procedure1<fr.cea.nabla.ir.ir.Real2Constant> _function_5 = (fr.cea.nabla.ir.ir.Real2Constant it_1) -> {
              it_1.setX(v);
              it_1.setY(v);
            };
            fr.cea.nabla.ir.ir.Real2Constant _doubleArrow_1 = ObjectExtensions.<fr.cea.nabla.ir.ir.Real2Constant>operator_doubleArrow(_createReal2Constant_2, _function_5);
            it.setY(_doubleArrow_1);
          };
          _switchResult = ObjectExtensions.<fr.cea.nabla.ir.ir.Real2x2Constant>operator_doubleArrow(_createReal2x2Constant, _function_3);
          break;
        case REAL3X3:
          fr.cea.nabla.ir.ir.Real3x3Constant _createReal3x3Constant = IrFactory.eINSTANCE.createReal3x3Constant();
          final Procedure1<fr.cea.nabla.ir.ir.Real3x3Constant> _function_4 = (fr.cea.nabla.ir.ir.Real3x3Constant it) -> {
            fr.cea.nabla.ir.ir.Real3Constant _createReal3Constant_1 = IrFactory.eINSTANCE.createReal3Constant();
            final Procedure1<fr.cea.nabla.ir.ir.Real3Constant> _function_5 = (fr.cea.nabla.ir.ir.Real3Constant it_1) -> {
              it_1.setX(v);
              it_1.setY(v);
              it_1.setZ(v);
            };
            fr.cea.nabla.ir.ir.Real3Constant _doubleArrow = ObjectExtensions.<fr.cea.nabla.ir.ir.Real3Constant>operator_doubleArrow(_createReal3Constant_1, _function_5);
            it.setX(_doubleArrow);
            fr.cea.nabla.ir.ir.Real3Constant _createReal3Constant_2 = IrFactory.eINSTANCE.createReal3Constant();
            final Procedure1<fr.cea.nabla.ir.ir.Real3Constant> _function_6 = (fr.cea.nabla.ir.ir.Real3Constant it_1) -> {
              it_1.setX(v);
              it_1.setY(v);
              it_1.setZ(v);
            };
            fr.cea.nabla.ir.ir.Real3Constant _doubleArrow_1 = ObjectExtensions.<fr.cea.nabla.ir.ir.Real3Constant>operator_doubleArrow(_createReal3Constant_2, _function_6);
            it.setY(_doubleArrow_1);
            fr.cea.nabla.ir.ir.Real3Constant _createReal3Constant_3 = IrFactory.eINSTANCE.createReal3Constant();
            final Procedure1<fr.cea.nabla.ir.ir.Real3Constant> _function_7 = (fr.cea.nabla.ir.ir.Real3Constant it_1) -> {
              it_1.setX(v);
              it_1.setY(v);
              it_1.setZ(v);
            };
            fr.cea.nabla.ir.ir.Real3Constant _doubleArrow_2 = ObjectExtensions.<fr.cea.nabla.ir.ir.Real3Constant>operator_doubleArrow(_createReal3Constant_3, _function_7);
            it.setZ(_doubleArrow_2);
          };
          _switchResult = ObjectExtensions.<fr.cea.nabla.ir.ir.Real3x3Constant>operator_doubleArrow(_createReal3x3Constant, _function_4);
          break;
        default:
          String _literal = type.getLiteral();
          String _plus = ("Type inattendu dans une constante : " + _literal);
          throw new RuntimeException(_plus);
      }
    } else {
      String _literal = type.getLiteral();
      String _plus = ("Type inattendu dans une constante : " + _literal);
      throw new RuntimeException(_plus);
    }
    return _switchResult;
  }
  
  public Expression toIrExpression(final fr.cea.nabla.nabla.Expression e) {
    if (e instanceof And) {
      return _toIrExpression((And)e);
    } else if (e instanceof BoolConstant) {
      return _toIrExpression((BoolConstant)e);
    } else if (e instanceof Comparison) {
      return _toIrExpression((Comparison)e);
    } else if (e instanceof Equality) {
      return _toIrExpression((Equality)e);
    } else if (e instanceof FunctionCall) {
      return _toIrExpression((FunctionCall)e);
    } else if (e instanceof IntConstant) {
      return _toIrExpression((IntConstant)e);
    } else if (e instanceof MaxConstant) {
      return _toIrExpression((MaxConstant)e);
    } else if (e instanceof MinConstant) {
      return _toIrExpression((MinConstant)e);
    } else if (e instanceof Minus) {
      return _toIrExpression((Minus)e);
    } else if (e instanceof MulOrDiv) {
      return _toIrExpression((MulOrDiv)e);
    } else if (e instanceof Not) {
      return _toIrExpression((Not)e);
    } else if (e instanceof Or) {
      return _toIrExpression((Or)e);
    } else if (e instanceof Parenthesis) {
      return _toIrExpression((Parenthesis)e);
    } else if (e instanceof Plus) {
      return _toIrExpression((Plus)e);
    } else if (e instanceof Real2Constant) {
      return _toIrExpression((Real2Constant)e);
    } else if (e instanceof Real2x2Constant) {
      return _toIrExpression((Real2x2Constant)e);
    } else if (e instanceof Real3Constant) {
      return _toIrExpression((Real3Constant)e);
    } else if (e instanceof Real3x3Constant) {
      return _toIrExpression((Real3x3Constant)e);
    } else if (e instanceof RealConstant) {
      return _toIrExpression((RealConstant)e);
    } else if (e instanceof RealXCompactConstant) {
      return _toIrExpression((RealXCompactConstant)e);
    } else if (e instanceof ReductionCall) {
      return _toIrExpression((ReductionCall)e);
    } else if (e instanceof UnaryMinus) {
      return _toIrExpression((UnaryMinus)e);
    } else if (e instanceof fr.cea.nabla.nabla.VarRef) {
      return _toIrExpression((fr.cea.nabla.nabla.VarRef)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
