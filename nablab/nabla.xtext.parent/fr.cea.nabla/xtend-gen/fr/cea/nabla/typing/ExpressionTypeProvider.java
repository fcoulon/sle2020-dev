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
package fr.cea.nabla.typing;

import com.google.inject.Inject;
import fr.cea.nabla.FunctionCallExtensions;
import fr.cea.nabla.nabla.And;
import fr.cea.nabla.nabla.BasicType;
import fr.cea.nabla.nabla.BoolConstant;
import fr.cea.nabla.nabla.Comparison;
import fr.cea.nabla.nabla.Equality;
import fr.cea.nabla.nabla.Expression;
import fr.cea.nabla.nabla.FunctionArg;
import fr.cea.nabla.nabla.FunctionCall;
import fr.cea.nabla.nabla.IntConstant;
import fr.cea.nabla.nabla.ItemType;
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
import fr.cea.nabla.nabla.ReductionArg;
import fr.cea.nabla.nabla.ReductionCall;
import fr.cea.nabla.nabla.SpaceIteratorRange;
import fr.cea.nabla.nabla.SpaceIteratorRef;
import fr.cea.nabla.nabla.UnaryMinus;
import fr.cea.nabla.nabla.Var;
import fr.cea.nabla.nabla.VarRef;
import fr.cea.nabla.typing.BasicTypeProvider;
import fr.cea.nabla.typing.BinaryOperatorTypeProvider;
import fr.cea.nabla.typing.MinusTypeProvider;
import fr.cea.nabla.typing.MulOrDivTypeProvider;
import fr.cea.nabla.typing.NablaType;
import fr.cea.nabla.typing.PlusTypeProvider;
import fr.cea.nabla.typing.VarTypeProvider;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ExpressionTypeProvider {
  @Inject
  @Extension
  private FunctionCallExtensions _functionCallExtensions;
  
  @Inject
  @Extension
  private BasicTypeProvider _basicTypeProvider;
  
  @Inject
  @Extension
  private VarTypeProvider _varTypeProvider;
  
  @Inject
  @Extension
  private MulOrDivTypeProvider _mulOrDivTypeProvider;
  
  @Inject
  private PlusTypeProvider ptp;
  
  @Inject
  private MinusTypeProvider mtp;
  
  protected NablaType _getTypeFor(final Expression e) {
    NablaType _switchResult = null;
    boolean _matched = false;
    if (e instanceof IntConstant) {
      _matched=true;
      _switchResult = BasicTypeProvider.INT;
    }
    if (!_matched) {
      if (e instanceof RealConstant) {
        _matched=true;
        _switchResult = BasicTypeProvider.REAL;
      }
    }
    if (!_matched) {
      if (e instanceof Real2Constant) {
        _matched=true;
        _switchResult = BasicTypeProvider.REAL2;
      }
    }
    if (!_matched) {
      if (e instanceof Real3Constant) {
        _matched=true;
        _switchResult = BasicTypeProvider.REAL3;
      }
    }
    if (!_matched) {
      if (e instanceof Real2x2Constant) {
        _matched=true;
        _switchResult = BasicTypeProvider.REAL2X2;
      }
    }
    if (!_matched) {
      if (e instanceof Real3x3Constant) {
        _matched=true;
        _switchResult = BasicTypeProvider.REAL3X3;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        _switchResult = BasicTypeProvider.BOOL;
      }
    }
    if (!_matched) {
      if (e instanceof RealXCompactConstant) {
        _matched=true;
        _switchResult = this._basicTypeProvider.getTypeFor(((RealXCompactConstant)e).getType());
      }
    }
    if (!_matched) {
      if (e instanceof MinConstant) {
        _matched=true;
        _switchResult = this._basicTypeProvider.getTypeFor(((MinConstant)e).getType());
      }
    }
    if (!_matched) {
      if (e instanceof MaxConstant) {
        _matched=true;
        _switchResult = this._basicTypeProvider.getTypeFor(((MaxConstant)e).getType());
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
      }
      if (!_matched) {
        if (e instanceof And) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (e instanceof Not) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (e instanceof Equality) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (e instanceof Comparison) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = BasicTypeProvider.BOOL;
      }
    }
    if (!_matched) {
      if (e instanceof Plus) {
        _matched=true;
        Expression _left = ((Plus)e).getLeft();
        NablaType _typeFor = null;
        if (_left!=null) {
          _typeFor=this.getTypeFor(_left);
        }
        Expression _right = ((Plus)e).getRight();
        NablaType _typeFor_1 = null;
        if (_right!=null) {
          _typeFor_1=this.getTypeFor(_right);
        }
        _switchResult = this.ptp.typeFor(_typeFor, _typeFor_1);
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        Expression _left = ((Minus)e).getLeft();
        NablaType _typeFor = null;
        if (_left!=null) {
          _typeFor=this.getTypeFor(_left);
        }
        Expression _right = ((Minus)e).getRight();
        NablaType _typeFor_1 = null;
        if (_right!=null) {
          _typeFor_1=this.getTypeFor(_right);
        }
        _switchResult = this.mtp.typeFor(_typeFor, _typeFor_1);
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        _matched=true;
        BinaryOperatorTypeProvider _typeProvider = this._mulOrDivTypeProvider.getTypeProvider(((MulOrDiv)e).getOp());
        Expression _left = ((MulOrDiv)e).getLeft();
        NablaType _typeFor = null;
        if (_left!=null) {
          _typeFor=this.getTypeFor(_left);
        }
        Expression _right = null;
        if (((MulOrDiv)e)!=null) {
          _right=((MulOrDiv)e).getRight();
        }
        _switchResult = _typeProvider.typeFor(_typeFor, this.getTypeFor(_right));
      }
    }
    if (!_matched) {
      if (e instanceof UnaryMinus) {
        _matched=true;
        Expression _expression = ((UnaryMinus)e).getExpression();
        NablaType _typeFor = null;
        if (_expression!=null) {
          _typeFor=this.getTypeFor(_expression);
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof Parenthesis) {
        _matched=true;
        Expression _expression = ((Parenthesis)e).getExpression();
        NablaType _typeFor = null;
        if (_expression!=null) {
          _typeFor=this.getTypeFor(_expression);
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof FunctionCall) {
        _matched=true;
        _switchResult = this.getTypeFor(e);
      }
    }
    if (!_matched) {
      if (e instanceof ReductionCall) {
        _matched=true;
        _switchResult = this.getTypeFor(e);
      }
    }
    if (!_matched) {
      if (e instanceof VarRef) {
        _matched=true;
        _switchResult = this.getTypeFor(e);
      }
    }
    return _switchResult;
  }
  
  protected NablaType _getTypeFor(final FunctionCall it) {
    NablaType _xblockexpression = null;
    {
      final FunctionArg decl = this._functionCallExtensions.getDeclaration(it);
      NablaType _xifexpression = null;
      if ((decl == null)) {
        _xifexpression = NablaType.UNDEFINED;
      } else {
        _xifexpression = this._basicTypeProvider.getTypeFor(decl.getReturnType());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected NablaType _getTypeFor(final ReductionCall it) {
    NablaType _xblockexpression = null;
    {
      final ReductionArg decl = this._functionCallExtensions.getDeclaration(it);
      NablaType _xifexpression = null;
      if ((decl == null)) {
        _xifexpression = NablaType.UNDEFINED;
      } else {
        _xifexpression = this._basicTypeProvider.getTypeFor(decl.getReturnType());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected NablaType _getTypeFor(final VarRef it) {
    NablaType _xblockexpression = null;
    {
      final NablaType varRefTypeWithoutFields = this.getTypeForWithoutFields(it);
      NablaType _xifexpression = null;
      if ((varRefTypeWithoutFields == NablaType.UNDEFINED)) {
        _xifexpression = NablaType.UNDEFINED;
      } else {
        _xifexpression = this.typeAfterFields(varRefTypeWithoutFields, it.getFields());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public NablaType getTypeForWithoutFields(final VarRef it) {
    NablaType _xifexpression = null;
    Var _variable = it.getVariable();
    boolean _tripleEquals = (_variable == null);
    if (_tripleEquals) {
      _xifexpression = NablaType.UNDEFINED;
    } else {
      NablaType _xblockexpression = null;
      {
        final NablaType varType = this._varTypeProvider.getTypeFor(it.getVariable());
        NablaType _xifexpression_1 = null;
        if (((varType == NablaType.UNDEFINED) || ((varType.getDimension() - ((Object[])Conversions.unwrapArray(it.getSpaceIterators(), Object.class)).length) < 0))) {
          _xifexpression_1 = NablaType.UNDEFINED;
        } else {
          BasicType _base = varType.getBase();
          int _dimension = varType.getDimension();
          int _length = ((Object[])Conversions.unwrapArray(it.getSpaceIterators(), Object.class)).length;
          int _minus = (_dimension - _length);
          _xifexpression_1 = new NablaType(_base, _minus);
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private NablaType typeAfterFields(final NablaType t, final List<String> fields) {
    NablaType _xifexpression = null;
    boolean _isEmpty = fields.isEmpty();
    if (_isEmpty) {
      _xifexpression = t;
    } else {
      NablaType _xifexpression_1 = null;
      int _dimension = t.getDimension();
      boolean _greaterThan = (_dimension > 0);
      if (_greaterThan) {
        _xifexpression_1 = NablaType.UNDEFINED;
      } else {
        NablaType _switchResult = null;
        BasicType _base = t.getBase();
        if (_base != null) {
          switch (_base) {
            case REAL2:
              _switchResult = this.convertReal2(fields);
              break;
            case REAL3:
              _switchResult = this.convertReal3(fields);
              break;
            case REAL2X2:
              _switchResult = this.convertReal2x2(fields);
              break;
            case REAL3X3:
              _switchResult = this.convertReal3x3(fields);
              break;
            default:
              _switchResult = NablaType.UNDEFINED;
              break;
          }
        } else {
          _switchResult = NablaType.UNDEFINED;
        }
        _xifexpression_1 = _switchResult;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private NablaType convertReal2(final List<String> fields) {
    NablaType _switchResult = null;
    int _length = ((Object[])Conversions.unwrapArray(fields, Object.class)).length;
    switch (_length) {
      case 0:
        _switchResult = BasicTypeProvider.REAL2;
        break;
      case 1:
        _switchResult = BasicTypeProvider.REAL;
        break;
      default:
        _switchResult = NablaType.UNDEFINED;
        break;
    }
    return _switchResult;
  }
  
  private NablaType convertReal3(final List<String> fields) {
    NablaType _switchResult = null;
    int _length = ((Object[])Conversions.unwrapArray(fields, Object.class)).length;
    switch (_length) {
      case 0:
        _switchResult = BasicTypeProvider.REAL3;
        break;
      case 1:
        _switchResult = BasicTypeProvider.REAL;
        break;
      default:
        _switchResult = NablaType.UNDEFINED;
        break;
    }
    return _switchResult;
  }
  
  private NablaType convertReal2x2(final List<String> fields) {
    NablaType _switchResult = null;
    int _length = ((Object[])Conversions.unwrapArray(fields, Object.class)).length;
    switch (_length) {
      case 0:
        _switchResult = BasicTypeProvider.REAL2X2;
        break;
      case 1:
        _switchResult = BasicTypeProvider.REAL2;
        break;
      case 2:
        _switchResult = BasicTypeProvider.REAL;
        break;
      default:
        _switchResult = NablaType.UNDEFINED;
        break;
    }
    return _switchResult;
  }
  
  private NablaType convertReal3x3(final List<String> fields) {
    NablaType _switchResult = null;
    int _length = ((Object[])Conversions.unwrapArray(fields, Object.class)).length;
    switch (_length) {
      case 0:
        _switchResult = BasicTypeProvider.REAL3X3;
        break;
      case 1:
        _switchResult = BasicTypeProvider.REAL3;
        break;
      case 2:
        _switchResult = BasicTypeProvider.REAL;
        break;
      default:
        _switchResult = NablaType.UNDEFINED;
        break;
    }
    return _switchResult;
  }
  
  private ItemType _getItemType(final SpaceIteratorRange it) {
    return it.getConnectivity().getReturnType().getType();
  }
  
  private ItemType _getItemType(final SpaceIteratorRef it) {
    return this.getItemType(it.getIterator().getRange());
  }
  
  public NablaType getTypeFor(final Expression it) {
    if (it instanceof FunctionCall) {
      return _getTypeFor((FunctionCall)it);
    } else if (it instanceof ReductionCall) {
      return _getTypeFor((ReductionCall)it);
    } else if (it instanceof VarRef) {
      return _getTypeFor((VarRef)it);
    } else if (it != null) {
      return _getTypeFor(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  private ItemType getItemType(final IteratorRangeOrRef it) {
    if (it instanceof SpaceIteratorRange) {
      return _getItemType((SpaceIteratorRange)it);
    } else if (it instanceof SpaceIteratorRef) {
      return _getItemType((SpaceIteratorRef)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
