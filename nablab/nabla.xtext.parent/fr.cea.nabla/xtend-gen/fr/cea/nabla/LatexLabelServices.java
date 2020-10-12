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
package fr.cea.nabla;

import com.google.common.base.Objects;
import fr.cea.nabla.nabla.Affectation;
import fr.cea.nabla.nabla.And;
import fr.cea.nabla.nabla.BoolConstant;
import fr.cea.nabla.nabla.Comparison;
import fr.cea.nabla.nabla.Equality;
import fr.cea.nabla.nabla.Expression;
import fr.cea.nabla.nabla.FunctionCall;
import fr.cea.nabla.nabla.If;
import fr.cea.nabla.nabla.InstructionBlock;
import fr.cea.nabla.nabla.InstructionJob;
import fr.cea.nabla.nabla.IntConstant;
import fr.cea.nabla.nabla.IteratorRangeOrRef;
import fr.cea.nabla.nabla.Loop;
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
import fr.cea.nabla.nabla.ScalarVarDefinition;
import fr.cea.nabla.nabla.SpaceIterator;
import fr.cea.nabla.nabla.SpaceIteratorRange;
import fr.cea.nabla.nabla.SpaceIteratorRef;
import fr.cea.nabla.nabla.TimeIterator;
import fr.cea.nabla.nabla.TimeIteratorRef;
import fr.cea.nabla.nabla.TimeLoopJob;
import fr.cea.nabla.nabla.UnaryMinus;
import fr.cea.nabla.nabla.Var;
import fr.cea.nabla.nabla.VarGroupDeclaration;
import fr.cea.nabla.nabla.VarRef;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class LatexLabelServices {
  protected static String _getLatex(final InstructionJob it) {
    String _pu = LatexLabelServices.pu(it.getName());
    String _plus = ("\\texttt{" + _pu);
    String _plus_1 = (_plus + "} : ");
    String _latex = LatexLabelServices.getLatex(it.getInstruction());
    return (_plus_1 + _latex);
  }
  
  protected static String _getLatex(final TimeLoopJob it) {
    String _pu = LatexLabelServices.pu(it.getName());
    String _plus = ("\\texttt{" + _pu);
    String _plus_1 = (_plus + "} : \\forall {");
    String _latex = LatexLabelServices.getLatex(it.getIterator());
    String _plus_2 = (_plus_1 + _latex);
    String _plus_3 = (_plus_2 + "}, \\ ");
    String _latex_1 = LatexLabelServices.getLatex(it.getBody());
    return (_plus_3 + _latex_1);
  }
  
  protected static String _getLatex(final ScalarVarDefinition it) {
    String _literal = it.getType().getLiteral();
    String _plus = (_literal + " ");
    String _pu = LatexLabelServices.pu(it.getVariable().getName());
    String _plus_1 = (_plus + _pu);
    String _plus_2 = (_plus_1 + "=");
    String _latex = LatexLabelServices.getLatex(it.getDefaultValue());
    return (_plus_2 + _latex);
  }
  
  protected static String _getLatex(final VarGroupDeclaration it) {
    String _literal = it.getType().getLiteral();
    String _plus = (_literal + " ");
    final Function1<Var, String> _function = (Var x) -> {
      return LatexLabelServices.pu(x.getName());
    };
    String _join = IterableExtensions.join(ListExtensions.<Var, String>map(it.getVariables(), _function), ", ");
    return (_plus + _join);
  }
  
  protected static String _getLatex(final InstructionBlock it) {
    return "...";
  }
  
  protected static String _getLatex(final Affectation it) {
    VarRef _varRef = it.getVarRef();
    String _latex = null;
    if (_varRef!=null) {
      _latex=LatexLabelServices.getLatex(_varRef);
    }
    String _plus = (_latex + " = ");
    Expression _expression = it.getExpression();
    String _latex_1 = null;
    if (_expression!=null) {
      _latex_1=LatexLabelServices.getLatex(_expression);
    }
    return (_plus + _latex_1);
  }
  
  protected static String _getLatex(final Loop it) {
    String _latex = LatexLabelServices.getLatex(it.getIterator());
    String _plus = ("\\forall {" + _latex);
    String _plus_1 = (_plus + "}, \\ ");
    String _latex_1 = LatexLabelServices.getLatex(it.getBody());
    return (_plus_1 + _latex_1);
  }
  
  protected static String _getLatex(final If it) {
    String _latex = LatexLabelServices.getLatex(it.getCondition());
    String _plus = ("if (" + _latex);
    return (_plus + ")");
  }
  
  protected static String _getLatex(final TimeIterator it) {
    String _pu = LatexLabelServices.pu(it.getName());
    return (_pu + "\\in ℕ");
  }
  
  protected static String _getLatex(final SpaceIterator it) {
    String _pu = LatexLabelServices.pu(it.getName());
    String _plus = (_pu + "\\in ");
    String _latex = LatexLabelServices.getLatex(it.getRange());
    return (_plus + _latex);
  }
  
  protected static String _getLatex(final SpaceIteratorRange it) {
    String _pu = LatexLabelServices.pu(it.getConnectivity().getName());
    String _plus = (_pu + "(");
    final Function1<SpaceIteratorRef, String> _function = (SpaceIteratorRef it_1) -> {
      return LatexLabelServices.getLatex(it_1);
    };
    String _join = IterableExtensions.join(ListExtensions.<SpaceIteratorRef, String>map(it.getArgs(), _function), ",");
    String _plus_1 = (_plus + _join);
    return (_plus_1 + ")");
  }
  
  protected static String _getLatex(final SpaceIteratorRef it) {
    String _xifexpression = null;
    boolean _isNext = it.isNext();
    if (_isNext) {
      String _pu = LatexLabelServices.pu(it.getIterator().getName());
      _xifexpression = (_pu + "+1");
    } else {
      String _xifexpression_1 = null;
      boolean _isPrev = it.isPrev();
      if (_isPrev) {
        String _pu_1 = LatexLabelServices.pu(it.getIterator().getName());
        _xifexpression_1 = (_pu_1 + "-1");
      } else {
        _xifexpression_1 = LatexLabelServices.pu(it.getIterator().getName());
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected static String _getLatex(final Or it) {
    String _latex = LatexLabelServices.getLatex(it.getLeft());
    String _plus = (_latex + " or ");
    String _latex_1 = LatexLabelServices.getLatex(it.getRight());
    return (_plus + _latex_1);
  }
  
  protected static String _getLatex(final And it) {
    String _latex = LatexLabelServices.getLatex(it.getLeft());
    String _plus = (_latex + " and ");
    String _latex_1 = LatexLabelServices.getLatex(it.getRight());
    return (_plus + _latex_1);
  }
  
  protected static String _getLatex(final Equality it) {
    String _latex = LatexLabelServices.getLatex(it.getLeft());
    String _plus = (_latex + " == ");
    String _latex_1 = LatexLabelServices.getLatex(it.getRight());
    return (_plus + _latex_1);
  }
  
  protected static String _getLatex(final Comparison it) {
    String _latex = LatexLabelServices.getLatex(it.getLeft());
    String _plus = (_latex + " ");
    String _op = it.getOp();
    String _plus_1 = (_plus + _op);
    String _plus_2 = (_plus_1 + " ");
    String _latex_1 = LatexLabelServices.getLatex(it.getRight());
    return (_plus_2 + _latex_1);
  }
  
  protected static String _getLatex(final Plus it) {
    String _latex = LatexLabelServices.getLatex(it.getLeft());
    String _plus = (_latex + " + ");
    String _latex_1 = LatexLabelServices.getLatex(it.getRight());
    return (_plus + _latex_1);
  }
  
  protected static String _getLatex(final Minus it) {
    String _latex = LatexLabelServices.getLatex(it.getLeft());
    String _plus = (_latex + " - ");
    String _latex_1 = LatexLabelServices.getLatex(it.getRight());
    return (_plus + _latex_1);
  }
  
  protected static String _getLatex(final MulOrDiv it) {
    String _xifexpression = null;
    String _op = it.getOp();
    boolean _equals = Objects.equal(_op, "/");
    if (_equals) {
      String _latex = LatexLabelServices.getLatex(it.getLeft());
      String _plus = ("\\frac{" + _latex);
      String _plus_1 = (_plus + "}{");
      String _latex_1 = LatexLabelServices.getLatex(it.getRight());
      String _plus_2 = (_plus_1 + _latex_1);
      _xifexpression = (_plus_2 + "}");
    } else {
      String _latex_2 = LatexLabelServices.getLatex(it.getLeft());
      String _plus_3 = (_latex_2 + " \\cdot ");
      String _latex_3 = LatexLabelServices.getLatex(it.getRight());
      _xifexpression = (_plus_3 + _latex_3);
    }
    return _xifexpression;
  }
  
  protected static String _getLatex(final Parenthesis it) {
    String _latex = LatexLabelServices.getLatex(it.getExpression());
    String _plus = ("(" + _latex);
    return (_plus + ")");
  }
  
  protected static String _getLatex(final UnaryMinus it) {
    String _latex = LatexLabelServices.getLatex(it.getExpression());
    return ("-" + _latex);
  }
  
  protected static String _getLatex(final Not it) {
    String _latex = LatexLabelServices.getLatex(it.getExpression());
    String _plus = ("\\neg {" + _latex);
    return (_plus + "}");
  }
  
  protected static String _getLatex(final IntConstant it) {
    return Integer.valueOf(it.getValue()).toString();
  }
  
  protected static String _getLatex(final RealConstant it) {
    return Double.valueOf(it.getValue()).toString();
  }
  
  protected static String _getLatex(final Real2Constant it) {
    double _x = it.getX();
    String _plus = ("\\{" + Double.valueOf(_x));
    String _plus_1 = (_plus + ",");
    double _y = it.getY();
    String _plus_2 = (_plus_1 + Double.valueOf(_y));
    return (_plus_2 + "\\}");
  }
  
  protected static String _getLatex(final Real3Constant it) {
    double _x = it.getX();
    String _plus = ("\\{" + Double.valueOf(_x));
    String _plus_1 = (_plus + ",");
    double _y = it.getY();
    String _plus_2 = (_plus_1 + Double.valueOf(_y));
    String _plus_3 = (_plus_2 + ",");
    double _z = it.getZ();
    String _plus_4 = (_plus_3 + Double.valueOf(_z));
    return (_plus_4 + "\\}");
  }
  
  protected static String _getLatex(final Real2x2Constant it) {
    String _latex = LatexLabelServices.getLatex(it.getX());
    String _plus = ("\\{" + _latex);
    String _plus_1 = (_plus + ",");
    String _latex_1 = LatexLabelServices.getLatex(it.getY());
    String _plus_2 = (_plus_1 + _latex_1);
    return (_plus_2 + "\\}");
  }
  
  protected static String _getLatex(final Real3x3Constant it) {
    String _latex = LatexLabelServices.getLatex(it.getX());
    String _plus = ("\\{" + _latex);
    String _plus_1 = (_plus + ",");
    String _latex_1 = LatexLabelServices.getLatex(it.getY());
    String _plus_2 = (_plus_1 + _latex_1);
    String _plus_3 = (_plus_2 + ",");
    String _latex_2 = LatexLabelServices.getLatex(it.getZ());
    String _plus_4 = (_plus_3 + _latex_2);
    return (_plus_4 + "\\}");
  }
  
  protected static String _getLatex(final BoolConstant it) {
    return Boolean.valueOf(it.isValue()).toString();
  }
  
  protected static String _getLatex(final RealXCompactConstant it) {
    String _literal = it.getType().getLiteral();
    String _plus = (_literal + "(");
    double _value = it.getValue();
    String _plus_1 = (_plus + Double.valueOf(_value));
    return (_plus_1 + ")");
  }
  
  protected static String _getLatex(final MinConstant it) {
    return "-∞";
  }
  
  protected static String _getLatex(final MaxConstant it) {
    return "∞";
  }
  
  protected static String _getLatex(final FunctionCall it) {
    String _pu = LatexLabelServices.pu(it.getFunction().getName());
    String _plus = (_pu + "(");
    final Function1<Expression, String> _function = (Expression it_1) -> {
      return LatexLabelServices.getLatex(it_1);
    };
    String _join = IterableExtensions.join(ListExtensions.<Expression, String>map(it.getArgs(), _function), ",");
    String _plus_1 = (_plus + _join);
    return (_plus_1 + ")");
  }
  
  protected static String _getLatex(final ReductionCall it) {
    String _pu = LatexLabelServices.pu(it.getReduction().getName());
    String _plus = (_pu + "_{");
    String _latex = LatexLabelServices.getLatex(it.getIterator());
    String _plus_1 = (_plus + _latex);
    String _plus_2 = (_plus_1 + "}");
    String _plus_3 = (_plus_2 + "(");
    String _latex_1 = LatexLabelServices.getLatex(it.getArg());
    String _plus_4 = (_plus_3 + _latex_1);
    return (_plus_4 + ")");
  }
  
  protected static String _getLatex(final VarRef it) {
    String label = LatexLabelServices.pu(it.getVariable().getName());
    boolean _isEmpty = it.getSpaceIterators().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _label = label;
      final Function1<IteratorRangeOrRef, String> _function = (IteratorRangeOrRef x) -> {
        return LatexLabelServices.getLatex(x);
      };
      String _join = IterableExtensions.join(ListExtensions.<IteratorRangeOrRef, String>map(it.getSpaceIterators(), _function), ",");
      String _plus = ("_{" + _join);
      String _plus_1 = (_plus + "}");
      label = (_label + _plus_1);
    }
    TimeIteratorRef _timeIterator = it.getTimeIterator();
    boolean _tripleNotEquals = (_timeIterator != null);
    if (_tripleNotEquals) {
      String _label_1 = label;
      String _latex = LatexLabelServices.getLatex(it.getTimeIterator());
      String _plus_2 = (" ^{" + _latex);
      String _plus_3 = (_plus_2 + "}");
      label = (_label_1 + _plus_3);
    }
    EList<String> _fields = it.getFields();
    for (final String f : _fields) {
      String _label_2 = label;
      label = (_label_2 + ("." + f));
    }
    return label;
  }
  
  protected static String _getLatex(final TimeIteratorRef it) {
    String _xifexpression = null;
    boolean _isInit = it.isInit();
    if (_isInit) {
      String _pu = LatexLabelServices.pu(it.getIterator().getName());
      String _plus = (_pu + "=");
      int _value = it.getValue();
      _xifexpression = (_plus + Integer.valueOf(_value));
    } else {
      String _xifexpression_1 = null;
      boolean _isNext = it.isNext();
      if (_isNext) {
        String _pu_1 = LatexLabelServices.pu(it.getIterator().getName());
        String _plus_1 = (_pu_1 + "+");
        int _value_1 = it.getValue();
        _xifexpression_1 = (_plus_1 + Integer.valueOf(_value_1));
      } else {
        _xifexpression_1 = LatexLabelServices.pu(it.getIterator().getName());
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private static String pu(final String it) {
    String _xifexpression = null;
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(it);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      _xifexpression = it.replaceAll("_", "\\\\_");
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public static String getLatex(final EObject it) {
    if (it instanceof Affectation) {
      return _getLatex((Affectation)it);
    } else if (it instanceof And) {
      return _getLatex((And)it);
    } else if (it instanceof BoolConstant) {
      return _getLatex((BoolConstant)it);
    } else if (it instanceof Comparison) {
      return _getLatex((Comparison)it);
    } else if (it instanceof Equality) {
      return _getLatex((Equality)it);
    } else if (it instanceof FunctionCall) {
      return _getLatex((FunctionCall)it);
    } else if (it instanceof If) {
      return _getLatex((If)it);
    } else if (it instanceof InstructionBlock) {
      return _getLatex((InstructionBlock)it);
    } else if (it instanceof InstructionJob) {
      return _getLatex((InstructionJob)it);
    } else if (it instanceof IntConstant) {
      return _getLatex((IntConstant)it);
    } else if (it instanceof Loop) {
      return _getLatex((Loop)it);
    } else if (it instanceof MaxConstant) {
      return _getLatex((MaxConstant)it);
    } else if (it instanceof MinConstant) {
      return _getLatex((MinConstant)it);
    } else if (it instanceof Minus) {
      return _getLatex((Minus)it);
    } else if (it instanceof MulOrDiv) {
      return _getLatex((MulOrDiv)it);
    } else if (it instanceof Not) {
      return _getLatex((Not)it);
    } else if (it instanceof Or) {
      return _getLatex((Or)it);
    } else if (it instanceof Parenthesis) {
      return _getLatex((Parenthesis)it);
    } else if (it instanceof Plus) {
      return _getLatex((Plus)it);
    } else if (it instanceof Real2Constant) {
      return _getLatex((Real2Constant)it);
    } else if (it instanceof Real2x2Constant) {
      return _getLatex((Real2x2Constant)it);
    } else if (it instanceof Real3Constant) {
      return _getLatex((Real3Constant)it);
    } else if (it instanceof Real3x3Constant) {
      return _getLatex((Real3x3Constant)it);
    } else if (it instanceof RealConstant) {
      return _getLatex((RealConstant)it);
    } else if (it instanceof RealXCompactConstant) {
      return _getLatex((RealXCompactConstant)it);
    } else if (it instanceof ReductionCall) {
      return _getLatex((ReductionCall)it);
    } else if (it instanceof ScalarVarDefinition) {
      return _getLatex((ScalarVarDefinition)it);
    } else if (it instanceof SpaceIteratorRange) {
      return _getLatex((SpaceIteratorRange)it);
    } else if (it instanceof SpaceIteratorRef) {
      return _getLatex((SpaceIteratorRef)it);
    } else if (it instanceof TimeLoopJob) {
      return _getLatex((TimeLoopJob)it);
    } else if (it instanceof UnaryMinus) {
      return _getLatex((UnaryMinus)it);
    } else if (it instanceof VarGroupDeclaration) {
      return _getLatex((VarGroupDeclaration)it);
    } else if (it instanceof VarRef) {
      return _getLatex((VarRef)it);
    } else if (it instanceof SpaceIterator) {
      return _getLatex((SpaceIterator)it);
    } else if (it instanceof TimeIterator) {
      return _getLatex((TimeIterator)it);
    } else if (it instanceof TimeIteratorRef) {
      return _getLatex((TimeIteratorRef)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
