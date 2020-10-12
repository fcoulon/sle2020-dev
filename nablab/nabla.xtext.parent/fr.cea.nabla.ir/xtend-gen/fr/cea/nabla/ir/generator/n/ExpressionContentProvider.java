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
 * 	Jean-Sylvan Camier - Nabla generation support
 */
package fr.cea.nabla.ir.generator.n;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import fr.cea.nabla.ir.generator.n.Ir2NUtils;
import fr.cea.nabla.ir.ir.BasicType;
import fr.cea.nabla.ir.ir.BinaryExpression;
import fr.cea.nabla.ir.ir.BoolConstant;
import fr.cea.nabla.ir.ir.Expression;
import fr.cea.nabla.ir.ir.FunctionCall;
import fr.cea.nabla.ir.ir.IntConstant;
import fr.cea.nabla.ir.ir.IteratorRef;
import fr.cea.nabla.ir.ir.MaxConstant;
import fr.cea.nabla.ir.ir.MinConstant;
import fr.cea.nabla.ir.ir.Parenthesis;
import fr.cea.nabla.ir.ir.Real2Constant;
import fr.cea.nabla.ir.ir.Real2x2Constant;
import fr.cea.nabla.ir.ir.Real3Constant;
import fr.cea.nabla.ir.ir.Real3x3Constant;
import fr.cea.nabla.ir.ir.RealConstant;
import fr.cea.nabla.ir.ir.UnaryExpression;
import fr.cea.nabla.ir.ir.VarRef;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ExpressionContentProvider {
  @Inject
  @Extension
  private Ir2NUtils _ir2NUtils;
  
  protected CharSequence _getContent(final BinaryExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _content = this.getContent(it.getLeft());
    _builder.append(_content);
    _builder.append(" ");
    String _operator = it.getOperator();
    _builder.append(_operator);
    _builder.append(" ");
    CharSequence _content_1 = this.getContent(it.getRight());
    _builder.append(_content_1);
    return _builder;
  }
  
  protected CharSequence _getContent(final UnaryExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    String _operator = it.getOperator();
    _builder.append(_operator);
    CharSequence _content = this.getContent(it.getExpression());
    _builder.append(_content);
    return _builder;
  }
  
  protected CharSequence _getContent(final Parenthesis it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _content = this.getContent(it.getExpression());
    _builder.append(_content);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _getContent(final IntConstant it) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = it.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  protected CharSequence _getContent(final RealConstant it) {
    StringConcatenation _builder = new StringConcatenation();
    double _value = it.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  protected CharSequence _getContent(final Real2Constant it) {
    StringConcatenation _builder = new StringConcatenation();
    String _nType = this._ir2NUtils.getNType(BasicType.REAL3);
    _builder.append(_nType);
    _builder.append("(");
    double _x = it.getX();
    _builder.append(_x);
    _builder.append(", ");
    double _y = it.getY();
    _builder.append(_y);
    _builder.append(", 0.0)");
    return _builder;
  }
  
  protected CharSequence _getContent(final Real3Constant it) {
    StringConcatenation _builder = new StringConcatenation();
    String _nType = this._ir2NUtils.getNType(BasicType.REAL3);
    _builder.append(_nType);
    _builder.append("(");
    double _x = it.getX();
    _builder.append(_x);
    _builder.append(", ");
    double _y = it.getY();
    _builder.append(_y);
    _builder.append(", ");
    double _z = it.getZ();
    _builder.append(_z);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _getContent(final Real2x2Constant it) {
    StringConcatenation _builder = new StringConcatenation();
    String _nType = this._ir2NUtils.getNType(BasicType.REAL2X2);
    _builder.append(_nType);
    _builder.append("(");
    CharSequence _content = this.getContent(it.getX());
    _builder.append(_content);
    _builder.append(", ");
    CharSequence _content_1 = this.getContent(it.getY());
    _builder.append(_content_1);
    _builder.append(", ");
    String _nType_1 = this._ir2NUtils.getNType(BasicType.REAL3);
    _builder.append(_nType_1);
    _builder.append("(0.0, 0.0, 1.0))");
    return _builder;
  }
  
  protected CharSequence _getContent(final Real3x3Constant it) {
    StringConcatenation _builder = new StringConcatenation();
    String _nType = this._ir2NUtils.getNType(BasicType.REAL3X3);
    _builder.append(_nType);
    _builder.append("(");
    CharSequence _content = this.getContent(it.getX());
    _builder.append(_content);
    _builder.append(", ");
    CharSequence _content_1 = this.getContent(it.getY());
    _builder.append(_content_1);
    _builder.append(", ");
    CharSequence _content_2 = this.getContent(it.getZ());
    _builder.append(_content_2);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _getContent(final BoolConstant it) {
    StringConcatenation _builder = new StringConcatenation();
    boolean _isValue = it.isValue();
    _builder.append(_isValue);
    return _builder;
  }
  
  protected CharSequence _getContent(final MinConstant it) {
    try {
      String _switchResult = null;
      BasicType _basicType = it.getType().getBasicType();
      if (_basicType != null) {
        switch (_basicType) {
          case INT:
            _switchResult = "-∞";
            break;
          case REAL:
            _switchResult = "-∞";
            break;
          case REAL2:
          case REAL2X2:
          case REAL3:
          case REAL3X3:
            String _nType = this._ir2NUtils.getNType(it.getType().getBasicType());
            String _plus = ("new " + _nType);
            _switchResult = (_plus + "(-∞)");
            break;
          default:
            BasicType _basicType_1 = it.getType().getBasicType();
            String _plus_1 = ("Invalid expression Min for type: " + _basicType_1);
            throw new Exception(_plus_1);
        }
      } else {
        BasicType _basicType_1 = it.getType().getBasicType();
        String _plus_1 = ("Invalid expression Min for type: " + _basicType_1);
        throw new Exception(_plus_1);
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected CharSequence _getContent(final MaxConstant it) {
    try {
      String _switchResult = null;
      BasicType _basicType = it.getType().getBasicType();
      if (_basicType != null) {
        switch (_basicType) {
          case INT:
            _switchResult = "∞";
            break;
          case REAL:
            _switchResult = "∞";
            break;
          case REAL2:
          case REAL2X2:
          case REAL3:
          case REAL3X3:
            String _nType = this._ir2NUtils.getNType(it.getType().getBasicType());
            String _plus = ("new " + _nType);
            _switchResult = (_plus + "(∞)");
            break;
          default:
            BasicType _basicType_1 = it.getType().getBasicType();
            String _plus_1 = ("Invalid expression Max for type: " + _basicType_1);
            throw new Exception(_plus_1);
        }
      } else {
        BasicType _basicType_1 = it.getType().getBasicType();
        String _plus_1 = ("Invalid expression Max for type: " + _basicType_1);
        throw new Exception(_plus_1);
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected CharSequence _getContent(final FunctionCall it) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = it.getFunction().getName();
    _builder.append(_name);
    _builder.append("(");
    {
      EList<Expression> _args = it.getArgs();
      boolean _hasElements = false;
      for(final Expression a : _args) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        CharSequence _content = this.getContent(a);
        _builder.append(_content);
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _getContent(final VarRef it) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = it.getVariable().getName();
    _builder.append(_name);
    String _suffix = this.getSuffix(it);
    _builder.append(_suffix);
    {
      EList<String> _fields = it.getFields();
      boolean _hasElements = false;
      for(final String f : _fields) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append(".");
        } else {
          _builder.appendImmediate(".", "");
        }
        _builder.append(f);
      }
    }
    return _builder;
  }
  
  private String getSuffix(final VarRef it) {
    String _xblockexpression = null;
    {
      final Iterable<IteratorRef> itRefs = Iterables.<IteratorRef>filter(it.getIterators(), IteratorRef.class);
      String _xifexpression = null;
      final Function1<IteratorRef, Boolean> _function = new Function1<IteratorRef, Boolean>() {
        @Override
        public Boolean apply(final IteratorRef it) {
          return Boolean.valueOf(it.isPrev());
        }
      };
      boolean _exists = IterableExtensions.<IteratorRef>exists(itRefs, _function);
      if (_exists) {
        _xifexpression = "[#-1]";
      } else {
        String _xifexpression_1 = null;
        final Function1<IteratorRef, Boolean> _function_1 = new Function1<IteratorRef, Boolean>() {
          @Override
          public Boolean apply(final IteratorRef it) {
            return Boolean.valueOf(it.isNext());
          }
        };
        boolean _exists_1 = IterableExtensions.<IteratorRef>exists(itRefs, _function_1);
        if (_exists_1) {
          _xifexpression_1 = "[#+1]";
        } else {
          _xifexpression_1 = "";
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public CharSequence getContent(final Expression it) {
    if (it instanceof BinaryExpression) {
      return _getContent((BinaryExpression)it);
    } else if (it instanceof BoolConstant) {
      return _getContent((BoolConstant)it);
    } else if (it instanceof FunctionCall) {
      return _getContent((FunctionCall)it);
    } else if (it instanceof IntConstant) {
      return _getContent((IntConstant)it);
    } else if (it instanceof MaxConstant) {
      return _getContent((MaxConstant)it);
    } else if (it instanceof MinConstant) {
      return _getContent((MinConstant)it);
    } else if (it instanceof Parenthesis) {
      return _getContent((Parenthesis)it);
    } else if (it instanceof Real2Constant) {
      return _getContent((Real2Constant)it);
    } else if (it instanceof Real2x2Constant) {
      return _getContent((Real2x2Constant)it);
    } else if (it instanceof Real3Constant) {
      return _getContent((Real3Constant)it);
    } else if (it instanceof Real3x3Constant) {
      return _getContent((Real3x3Constant)it);
    } else if (it instanceof RealConstant) {
      return _getContent((RealConstant)it);
    } else if (it instanceof UnaryExpression) {
      return _getContent((UnaryExpression)it);
    } else if (it instanceof VarRef) {
      return _getContent((VarRef)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
