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
package fr.cea.nabla.ir.generator.java;

import com.google.inject.Inject;
import fr.cea.nabla.ir.VariableExtensions;
import fr.cea.nabla.ir.generator.IndexHelper;
import fr.cea.nabla.ir.generator.Utils;
import fr.cea.nabla.ir.generator.java.Ir2JavaUtils;
import fr.cea.nabla.ir.ir.ArrayVariable;
import fr.cea.nabla.ir.ir.BasicType;
import fr.cea.nabla.ir.ir.BinaryExpression;
import fr.cea.nabla.ir.ir.BoolConstant;
import fr.cea.nabla.ir.ir.Expression;
import fr.cea.nabla.ir.ir.FunctionCall;
import fr.cea.nabla.ir.ir.IntConstant;
import fr.cea.nabla.ir.ir.IteratorRange;
import fr.cea.nabla.ir.ir.IteratorRangeOrRef;
import fr.cea.nabla.ir.ir.IteratorRef;
import fr.cea.nabla.ir.ir.MaxConstant;
import fr.cea.nabla.ir.ir.MinConstant;
import fr.cea.nabla.ir.ir.Parenthesis;
import fr.cea.nabla.ir.ir.Real2Constant;
import fr.cea.nabla.ir.ir.Real2x2Constant;
import fr.cea.nabla.ir.ir.Real3Constant;
import fr.cea.nabla.ir.ir.Real3x3Constant;
import fr.cea.nabla.ir.ir.RealConstant;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.ir.UnaryExpression;
import fr.cea.nabla.ir.ir.VarRef;
import fr.cea.nabla.ir.ir.Variable;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ExpressionContentProvider {
  @Inject
  @Extension
  private Utils _utils;
  
  @Inject
  @Extension
  private Ir2JavaUtils _ir2JavaUtils;
  
  protected CharSequence _getContent(final BinaryExpression it) {
    CharSequence _xblockexpression = null;
    {
      final CharSequence lContent = this.getContent(it.getLeft());
      final CharSequence rContent = this.getContent(it.getRight());
      CharSequence _xifexpression = null;
      boolean _isJavaBasicType = this._ir2JavaUtils.isJavaBasicType(it.getLeft().getType().getBasicType());
      boolean _not = (!_isJavaBasicType);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(lContent);
        _builder.append(".");
        String _javaOperator = this._ir2JavaUtils.getJavaOperator(it.getOperator());
        _builder.append(_javaOperator);
        _builder.append("(");
        _builder.append(rContent);
        _builder.append(")");
        _xifexpression = _builder;
      } else {
        CharSequence _xifexpression_1 = null;
        boolean _isJavaBasicType_1 = this._ir2JavaUtils.isJavaBasicType(it.getRight().getType().getBasicType());
        boolean _not_1 = (!_isJavaBasicType_1);
        if (_not_1) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(rContent);
          _builder_1.append(".");
          String _javaOperator_1 = this._ir2JavaUtils.getJavaOperator(it.getOperator());
          _builder_1.append(_javaOperator_1);
          _builder_1.append("(");
          _builder_1.append(lContent);
          _builder_1.append(")");
          _xifexpression_1 = _builder_1;
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append(lContent);
          _builder_2.append(" ");
          String _operator = it.getOperator();
          _builder_2.append(_operator);
          _builder_2.append(" ");
          _builder_2.append(rContent);
          _xifexpression_1 = _builder_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _getContent(final UnaryExpression it) {
    CharSequence _xblockexpression = null;
    {
      final CharSequence content = this.getContent(it.getExpression());
      CharSequence _xifexpression = null;
      boolean _isJavaBasicType = this._ir2JavaUtils.isJavaBasicType(it.getExpression().getType().getBasicType());
      if (_isJavaBasicType) {
        StringConcatenation _builder = new StringConcatenation();
        String _operator = it.getOperator();
        _builder.append(_operator);
        _builder.append(content);
        _xifexpression = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(content);
        _builder_1.append(".");
        String _javaOperator = this._ir2JavaUtils.getJavaOperator(it.getOperator());
        _builder_1.append(_javaOperator);
        _builder_1.append("()");
        _xifexpression = _builder_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
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
    _builder.append("new Real2(");
    double _x = it.getX();
    _builder.append(_x);
    _builder.append(", ");
    double _y = it.getY();
    _builder.append(_y);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _getContent(final Real3Constant it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new Real3(");
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
    _builder.append("new Real2x2(");
    CharSequence _content = this.getContent(it.getX());
    _builder.append(_content);
    _builder.append(", ");
    CharSequence _content_1 = this.getContent(it.getY());
    _builder.append(_content_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _getContent(final Real3x3Constant it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new Real3x3(");
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
      CharSequence _switchResult = null;
      BasicType _basicType = it.getType().getBasicType();
      if (_basicType != null) {
        switch (_basicType) {
          case INT:
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Integer.MIN_VALUE");
            _switchResult = _builder;
            break;
          case REAL:
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Double.MIN_VALUE");
            _switchResult = _builder_1;
            break;
          case REAL2:
          case REAL2X2:
          case REAL3:
          case REAL3X3:
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("new ");
            BasicType _basicType_1 = it.getType().getBasicType();
            _builder_2.append(_basicType_1);
            _builder_2.append("(Double.MIN_VALUE)");
            _switchResult = _builder_2;
            break;
          default:
            BasicType _basicType_2 = it.getType().getBasicType();
            String _plus = ("Invalid expression Min for type: " + _basicType_2);
            throw new Exception(_plus);
        }
      } else {
        BasicType _basicType_2 = it.getType().getBasicType();
        String _plus = ("Invalid expression Min for type: " + _basicType_2);
        throw new Exception(_plus);
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected CharSequence _getContent(final MaxConstant it) {
    try {
      CharSequence _switchResult = null;
      BasicType _basicType = it.getType().getBasicType();
      if (_basicType != null) {
        switch (_basicType) {
          case INT:
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Integer.MAX_VALUE");
            _switchResult = _builder;
            break;
          case REAL:
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Double.MAX_VALUE");
            _switchResult = _builder_1;
            break;
          case REAL2:
          case REAL2X2:
          case REAL3:
          case REAL3X3:
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("new ");
            BasicType _basicType_1 = it.getType().getBasicType();
            _builder_2.append(_basicType_1);
            _builder_2.append("(Double.MAX_VALUE)");
            _switchResult = _builder_2;
            break;
          default:
            BasicType _basicType_2 = it.getType().getBasicType();
            String _plus = ("Invalid expression Max for type: " + _basicType_2);
            throw new Exception(_plus);
        }
      } else {
        BasicType _basicType_2 = it.getType().getBasicType();
        String _plus = ("Invalid expression Max for type: " + _basicType_2);
        throw new Exception(_plus);
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected CharSequence _getContent(final FunctionCall it) {
    StringConcatenation _builder = new StringConcatenation();
    String _provider = it.getFunction().getProvider();
    _builder.append(_provider);
    _builder.append("Functions.");
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
    String _codeName = this.getCodeName(it.getVariable());
    _builder.append(_codeName);
    String _iteratorsContent = this.getIteratorsContent(it);
    _builder.append(_iteratorsContent);
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
        _builder.append("get");
        String _firstUpper = StringExtensions.toFirstUpper(f);
        _builder.append(_firstUpper);
        _builder.append("()");
      }
    }
    return _builder;
  }
  
  private String getCodeName(final Variable it) {
    String _xifexpression = null;
    boolean _isScalarConst = VariableExtensions.isScalarConst(it);
    if (_isScalarConst) {
      String _name = it.getName();
      _xifexpression = ("options." + _name);
    } else {
      _xifexpression = it.getName();
    }
    return _xifexpression;
  }
  
  private String getIteratorsContent(final VarRef it) {
    if ((it.getIterators().isEmpty() || (it.getVariable() instanceof ScalarVariable))) {
      return "";
    }
    Variable _variable = it.getVariable();
    final ArrayVariable array = ((ArrayVariable) _variable);
    int _size = array.getDimensions().size();
    int _size_1 = it.getIterators().size();
    boolean _lessThan = (_size < _size_1);
    if (_lessThan) {
      return "";
    }
    String content = "";
    int _size_2 = it.getIterators().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_2, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final IteratorRangeOrRef iter = it.getIterators().get((i).intValue());
        boolean _matched = false;
        if (iter instanceof IteratorRange) {
          _matched=true;
          String _content = content;
          CharSequence _accessor = this._ir2JavaUtils.getAccessor(((IteratorRange)iter));
          String _plus = ("[" + _accessor);
          String _plus_1 = (_plus + "]");
          content = (_content + _plus_1);
        }
        if (!_matched) {
          if (iter instanceof IteratorRef) {
            _matched=true;
            final IndexHelper.Index index = IndexHelper.IndexFactory.createIndex(((IteratorRef)iter).getIterator(), (i).intValue(), array.getDimensions(), it.getIterators());
            String _content = content;
            String _prefix = this._utils.prefix(((IteratorRef)iter), index.getLabel());
            String _plus = ("[" + _prefix);
            String _plus_1 = (_plus + "]");
            content = (_content + _plus_1);
          }
        }
      }
    }
    return content;
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
