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
package fr.cea.nabla.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import fr.cea.nabla.nabla.Affectation;
import fr.cea.nabla.nabla.And;
import fr.cea.nabla.nabla.BasicType;
import fr.cea.nabla.nabla.Comparison;
import fr.cea.nabla.nabla.Equality;
import fr.cea.nabla.nabla.Expression;
import fr.cea.nabla.nabla.FunctionCall;
import fr.cea.nabla.nabla.If;
import fr.cea.nabla.nabla.Minus;
import fr.cea.nabla.nabla.MulOrDiv;
import fr.cea.nabla.nabla.NablaPackage;
import fr.cea.nabla.nabla.Not;
import fr.cea.nabla.nabla.Or;
import fr.cea.nabla.nabla.Plus;
import fr.cea.nabla.nabla.ReductionArg;
import fr.cea.nabla.nabla.ReductionCall;
import fr.cea.nabla.nabla.ScalarVarDefinition;
import fr.cea.nabla.nabla.Var;
import fr.cea.nabla.nabla.VarRef;
import fr.cea.nabla.typing.BasicTypeProvider;
import fr.cea.nabla.typing.BinaryOperatorTypeProvider;
import fr.cea.nabla.typing.ComparisonAndEqualityTypeProvider;
import fr.cea.nabla.typing.ExpressionTypeProvider;
import fr.cea.nabla.typing.MinusTypeProvider;
import fr.cea.nabla.typing.MulOrDivTypeProvider;
import fr.cea.nabla.typing.NablaType;
import fr.cea.nabla.typing.PlusTypeProvider;
import fr.cea.nabla.validation.BasicValidator;
import java.util.List;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class TypeValidator extends BasicValidator {
  private static final String INVALID_FIELD = "NablaInvalidField";
  
  private final NablaPackage np = NablaPackage.eINSTANCE;
  
  @Inject
  @Extension
  private ExpressionTypeProvider _expressionTypeProvider;
  
  @Inject
  @Extension
  private BasicTypeProvider _basicTypeProvider;
  
  @Inject
  @Extension
  private MulOrDivTypeProvider _mulOrDivTypeProvider;
  
  @Inject
  private PlusTypeProvider plusTypeProvider;
  
  @Inject
  private MinusTypeProvider minusTypeProvider;
  
  @Inject
  private ComparisonAndEqualityTypeProvider comparisonAndEqualityTypeProvider;
  
  @Check
  public void checkType(final ScalarVarDefinition it) {
    Expression _defaultValue = it.getDefaultValue();
    NablaType _typeFor = null;
    if (_defaultValue!=null) {
      _typeFor=this._expressionTypeProvider.getTypeFor(_defaultValue);
    }
    this.checkExpectedType(_typeFor, this._basicTypeProvider.getTypeFor(it.getType()), this.np.getScalarVarDefinition_DefaultValue());
  }
  
  @Check
  public void checkType(final Affectation it) {
    Expression _expression = it.getExpression();
    NablaType _typeFor = null;
    if (_expression!=null) {
      _typeFor=this._expressionTypeProvider.getTypeFor(_expression);
    }
    this.checkExpectedType(_typeFor, this._expressionTypeProvider.getTypeFor(it.getVarRef()), this.np.getAffectation_Expression());
  }
  
  @Check
  public void checkType(final If it) {
    Expression _condition = it.getCondition();
    NablaType _typeFor = null;
    if (_condition!=null) {
      _typeFor=this._expressionTypeProvider.getTypeFor(_condition);
    }
    this.checkExpectedType(_typeFor, BasicTypeProvider.BOOL, this.np.getIf_Condition());
  }
  
  @Check
  public void checkSeedAndReturnTypes(final ReductionArg it) {
    final NablaType seedType = this._expressionTypeProvider.getTypeFor(it.getSeed());
    if (((seedType != NablaType.UNDEFINED) && (seedType.getBase() != it.getReturnType()))) {
      String _literal = seedType.getBase().getLiteral();
      String _plus = ("Seed type and return types must be identical: " + _literal);
      String _plus_1 = (_plus + "!=");
      String _literal_1 = it.getReturnType().getLiteral();
      String msg = (_plus_1 + _literal_1);
      this.error(msg, NablaPackage.Literals.REDUCTION_ARG__SEED);
    }
  }
  
  @Check
  public void checkArgs(final FunctionCall it) {
    NablaType _typeFor = this._expressionTypeProvider.getTypeFor(it);
    boolean _equals = Objects.equal(_typeFor, NablaType.UNDEFINED);
    if (_equals) {
      final Function1<Expression, String> _function = (Expression x) -> {
        return NablaType.getLabel(this._expressionTypeProvider.getTypeFor(x));
      };
      final List<String> inTypes = ListExtensions.<Expression, String>map(it.getArgs(), _function);
      String _join = IterableExtensions.join(inTypes, ", ");
      String msg = ("Wrong arguments : " + _join);
      this.error(msg, NablaPackage.Literals.FUNCTION_CALL__FUNCTION);
    }
  }
  
  @Check
  public void checkArgs(final ReductionCall it) {
    NablaType _typeFor = this._expressionTypeProvider.getTypeFor(it);
    boolean _equals = Objects.equal(_typeFor, NablaType.UNDEFINED);
    if (_equals) {
      final String inType = NablaType.getLabel(this._expressionTypeProvider.getTypeFor(it.getArg()));
      String msg = ("Wrong arguments : " + inType);
      this.error(msg, NablaPackage.Literals.REDUCTION_CALL__REDUCTION);
    }
  }
  
  @Check
  public void checkType(final VarRef it) {
    final NablaType t = this._expressionTypeProvider.getTypeForWithoutFields(it);
    boolean _equals = Objects.equal(t, NablaType.UNDEFINED);
    if (_equals) {
      Var _variable = it.getVariable();
      String _name = null;
      if (_variable!=null) {
        _name=_variable.getName();
      }
      final String msg = ("Invalid type for variable " + _name);
      this.error(msg, NablaPackage.Literals.VAR_REF__VARIABLE);
    } else {
      boolean _isEmpty = it.getFields().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final EAttribute eAtt = NablaPackage.Literals.VAR_REF__FIELDS;
        String _name_1 = it.getVariable().getName();
        final String msg_1 = ("Invalid field on variable " + _name_1);
        BasicType _base = t.getBase();
        if (_base != null) {
          switch (_base) {
            case REAL2:
              if (((it.getFields().size() != 1) || (!this.isValidReal2Field(IterableExtensions.<String>head(it.getFields()))))) {
                this.error(msg_1, eAtt, TypeValidator.INVALID_FIELD);
              }
              break;
            case REAL3:
              if (((it.getFields().size() != 1) || (!this.isValidReal3Field(IterableExtensions.<String>head(it.getFields()))))) {
                this.error(msg_1, eAtt, TypeValidator.INVALID_FIELD);
              }
              break;
            case REAL2X2:
              if (((it.getFields().size() != 2) || IterableExtensions.<String>exists(it.getFields(), ((Function1<String, Boolean>) (String f) -> {
                boolean _isValidReal2Field = this.isValidReal2Field(f);
                return Boolean.valueOf((!_isValidReal2Field));
              })))) {
                this.error(msg_1, eAtt, TypeValidator.INVALID_FIELD);
              }
              break;
            case REAL3X3:
              if (((it.getFields().size() != 2) || IterableExtensions.<String>exists(it.getFields(), ((Function1<String, Boolean>) (String f) -> {
                boolean _isValidReal3Field = this.isValidReal3Field(f);
                return Boolean.valueOf((!_isValidReal3Field));
              })))) {
                this.error(msg_1, eAtt, TypeValidator.INVALID_FIELD);
              }
              break;
            default:
              this.error(msg_1, eAtt, TypeValidator.INVALID_FIELD);
              break;
          }
        } else {
          this.error(msg_1, eAtt, TypeValidator.INVALID_FIELD);
        }
      }
    }
  }
  
  @Check
  public void checkType(final Not it) {
    Expression _expression = it.getExpression();
    NablaType _typeFor = null;
    if (_expression!=null) {
      _typeFor=this._expressionTypeProvider.getTypeFor(_expression);
    }
    this.checkExpectedType(_typeFor, BasicTypeProvider.BOOL, this.np.getNot_Expression());
  }
  
  @Check
  public void checkType(final MulOrDiv it) {
    this.checkBinaryOp(it.getLeft(), it.getRight(), this._mulOrDivTypeProvider.getTypeProvider(it.getOp()), this.np.getMulOrDiv_Op(), it.getOp());
  }
  
  @Check
  public void checkType(final Plus it) {
    this.checkBinaryOp(it.getLeft(), it.getRight(), this.plusTypeProvider, this.np.getPlus_Op(), it.getOp());
  }
  
  @Check
  public void checkType(final Minus it) {
    this.checkBinaryOp(it.getLeft(), it.getRight(), this.minusTypeProvider, this.np.getMinus_Op(), it.getOp());
  }
  
  @Check
  public void checkType(final Comparison it) {
    this.checkBinaryOp(it.getLeft(), it.getRight(), this.comparisonAndEqualityTypeProvider, this.np.getComparison_Op(), it.getOp());
  }
  
  @Check
  public void checkType(final Equality it) {
    this.checkBinaryOp(it.getLeft(), it.getRight(), this.comparisonAndEqualityTypeProvider, this.np.getComparison_Op(), it.getOp());
  }
  
  @Check
  public void checkType(final And it) {
    Expression _left = it.getLeft();
    NablaType _typeFor = null;
    if (_left!=null) {
      _typeFor=this._expressionTypeProvider.getTypeFor(_left);
    }
    this.checkExpectedType(_typeFor, BasicTypeProvider.BOOL, this.np.getAnd_Left());
    Expression _right = it.getRight();
    NablaType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this._expressionTypeProvider.getTypeFor(_right);
    }
    this.checkExpectedType(_typeFor_1, BasicTypeProvider.BOOL, this.np.getAnd_Right());
  }
  
  @Check
  public void checkType(final Or it) {
    Expression _left = it.getLeft();
    NablaType _typeFor = null;
    if (_left!=null) {
      _typeFor=this._expressionTypeProvider.getTypeFor(_left);
    }
    this.checkExpectedType(_typeFor, BasicTypeProvider.BOOL, this.np.getOr_Left());
    Expression _right = it.getRight();
    NablaType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this._expressionTypeProvider.getTypeFor(_right);
    }
    this.checkExpectedType(_typeFor_1, BasicTypeProvider.BOOL, this.np.getOr_Right());
  }
  
  private void checkExpectedType(final NablaType actualType, final NablaType expectedType, final EReference reference) {
    boolean _not = (!((Objects.equal(actualType, NablaType.UNDEFINED) || Objects.equal(expectedType, NablaType.UNDEFINED)) || actualType.match(expectedType)));
    if (_not) {
      String _label = NablaType.getLabel(expectedType);
      String _plus = ("Expected " + _label);
      String _plus_1 = (_plus + " type, but was ");
      String _label_1 = NablaType.getLabel(actualType);
      String _plus_2 = (_plus_1 + _label_1);
      this.error(_plus_2, reference);
    }
  }
  
  private void checkBinaryOp(final Expression left, final Expression right, final BinaryOperatorTypeProvider provider, final EAttribute operator, final String op) {
    NablaType _typeFor = null;
    if (left!=null) {
      _typeFor=this._expressionTypeProvider.getTypeFor(left);
    }
    final NablaType leftType = _typeFor;
    NablaType _typeFor_1 = null;
    if (right!=null) {
      _typeFor_1=this._expressionTypeProvider.getTypeFor(right);
    }
    final NablaType rightType = _typeFor_1;
    boolean _not = (!(Objects.equal(leftType, NablaType.UNDEFINED) || Objects.equal(rightType, NablaType.UNDEFINED)));
    if (_not) {
      NablaType _typeFor_2 = provider.typeFor(leftType, rightType);
      boolean _equals = Objects.equal(_typeFor_2, NablaType.UNDEFINED);
      if (_equals) {
        String _label = NablaType.getLabel(leftType);
        String _plus = ((("Binary operator " + op) + " undefined on types ") + _label);
        String _plus_1 = (_plus + " and ");
        String _label_1 = NablaType.getLabel(rightType);
        String _plus_2 = (_plus_1 + _label_1);
        this.error(_plus_2, operator);
      }
    }
  }
  
  private boolean isValidReal2Field(final String s) {
    return (Objects.equal(s, "x") || Objects.equal(s, "y"));
  }
  
  private boolean isValidReal3Field(final String s) {
    return (this.isValidReal2Field(s) || Objects.equal(s, "z"));
  }
}
