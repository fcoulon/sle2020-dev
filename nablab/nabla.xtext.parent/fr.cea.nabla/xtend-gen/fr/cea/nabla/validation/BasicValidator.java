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
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import fr.cea.nabla.MandatoryOptions;
import fr.cea.nabla.Utils;
import fr.cea.nabla.VarExtensions;
import fr.cea.nabla.nabla.Affectation;
import fr.cea.nabla.nabla.ArrayVar;
import fr.cea.nabla.nabla.Connectivity;
import fr.cea.nabla.nabla.Function;
import fr.cea.nabla.nabla.FunctionCall;
import fr.cea.nabla.nabla.ItemArgType;
import fr.cea.nabla.nabla.ItemType;
import fr.cea.nabla.nabla.IteratorRangeOrRef;
import fr.cea.nabla.nabla.NablaModule;
import fr.cea.nabla.nabla.NablaPackage;
import fr.cea.nabla.nabla.Reduction;
import fr.cea.nabla.nabla.ReductionCall;
import fr.cea.nabla.nabla.ScalarVarDefinition;
import fr.cea.nabla.nabla.SpaceIterator;
import fr.cea.nabla.nabla.SpaceIteratorRange;
import fr.cea.nabla.nabla.SpaceIteratorRef;
import fr.cea.nabla.nabla.Var;
import fr.cea.nabla.nabla.VarGroupDeclaration;
import fr.cea.nabla.nabla.VarRef;
import fr.cea.nabla.validation.AbstractNablaValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class BasicValidator extends AbstractNablaValidator {
  public static final String NO_COORD_VARIABLE = "NablaError::NoCoordVariable";
  
  @Inject
  @Extension
  private VarExtensions _varExtensions;
  
  @Check
  public void checkNoInnerReductionCall(final ReductionCall it) {
    if (((it.getArg() instanceof ReductionCall) || IteratorExtensions.<EObject>exists(it.getArg().eAllContents(), ((Function1<EObject, Boolean>) (EObject x) -> {
      return Boolean.valueOf((x instanceof ReductionCall));
    })))) {
      this.error("Reduction must not contains reduction", NablaPackage.Literals.REDUCTION_CALL__ARG);
    }
  }
  
  @Check
  public void checkCoordVar(final NablaModule it) {
    final Function1<VarGroupDeclaration, Boolean> _function = (VarGroupDeclaration g) -> {
      final Function1<Var, Boolean> _function_1 = (Var v) -> {
        String _name = v.getName();
        return Boolean.valueOf(Objects.equal(_name, MandatoryOptions.COORD));
      };
      return Boolean.valueOf(IterableExtensions.<Var>exists(g.getVariables(), _function_1));
    };
    boolean _exists = IterableExtensions.<VarGroupDeclaration>exists(Iterables.<VarGroupDeclaration>filter(it.getVariables(), VarGroupDeclaration.class), _function);
    boolean _not = (!_exists);
    if (_not) {
      this.warning((("Module must contain a node variable named \'" + MandatoryOptions.COORD) + "\' to store node coordinates"), NablaPackage.Literals.NABLA_MODULE__NAME, BasicValidator.NO_COORD_VARIABLE);
    }
  }
  
  @Check
  public void checkName(final NablaModule it) {
    if (((!StringExtensions.isNullOrEmpty(it.getName())) && Character.isLowerCase(it.getName().charAt(0)))) {
      this.error("Module name must start with an uppercase", NablaPackage.Literals.NABLA_MODULE__NAME);
    }
  }
  
  @Check
  public void checkUnusedVariables(final Var it) {
    final boolean referenced = (MandatoryOptions.OPTION_NAMES.contains(it.getName()) || IteratorExtensions.<VarRef>exists(Iterators.<VarRef>filter(Utils.getNablaModule(it).eAllContents(), VarRef.class), ((Function1<VarRef, Boolean>) (VarRef x) -> {
      Var _variable = x.getVariable();
      return Boolean.valueOf((_variable == it));
    })));
    if ((!referenced)) {
      this.warning("Unused variable", NablaPackage.Literals.VAR__NAME);
    }
  }
  
  @Check
  public void checkUnusedFunctions(final Function it) {
    final Function1<FunctionCall, Boolean> _function = (FunctionCall x) -> {
      Function _function_1 = x.getFunction();
      return Boolean.valueOf((_function_1 == it));
    };
    final boolean referenced = IteratorExtensions.<FunctionCall>exists(Iterators.<FunctionCall>filter(Utils.getNablaModule(it).eAllContents(), FunctionCall.class), _function);
    if ((!referenced)) {
      this.warning("Unused function", NablaPackage.Literals.CALLABLE__NAME);
    }
  }
  
  @Check
  public void checkUnusedReductions(final Reduction it) {
    final Function1<ReductionCall, Boolean> _function = (ReductionCall x) -> {
      Reduction _reduction = x.getReduction();
      return Boolean.valueOf((_reduction == it));
    };
    final boolean referenced = IteratorExtensions.<ReductionCall>exists(Iterators.<ReductionCall>filter(Utils.getNablaModule(it).eAllContents(), ReductionCall.class), _function);
    if ((!referenced)) {
      this.warning("Unused function", NablaPackage.Literals.CALLABLE__NAME);
    }
  }
  
  @Check
  public void checkUnusedConnectivities(final Connectivity it) {
    final boolean referenced = (IteratorExtensions.<SpaceIteratorRange>exists(Iterators.<SpaceIteratorRange>filter(Utils.getNablaModule(it).eAllContents(), SpaceIteratorRange.class), ((Function1<SpaceIteratorRange, Boolean>) (SpaceIteratorRange x) -> {
      Connectivity _connectivity = x.getConnectivity();
      return Boolean.valueOf((_connectivity == it));
    })) || IteratorExtensions.<ArrayVar>exists(Iterators.<ArrayVar>filter(Utils.getNablaModule(it).eAllContents(), ArrayVar.class), ((Function1<ArrayVar, Boolean>) (ArrayVar x) -> {
      return Boolean.valueOf(x.getDimensions().contains(it));
    })));
    if ((!referenced)) {
      this.warning("Unused connectivity", NablaPackage.Literals.CONNECTIVITY__NAME);
    }
  }
  
  @Check
  public void checkDimensions(final ArrayVar it) {
    boolean _isEmpty = it.getDimensions().isEmpty();
    if (_isEmpty) {
      return;
    }
    final Function1<Connectivity, Boolean> _function = (Connectivity d) -> {
      return Boolean.valueOf(d.getReturnType().isMultiple());
    };
    boolean _exists = IterableExtensions.<Connectivity>exists(it.getDimensions(), _function);
    boolean _not = (!_exists);
    if (_not) {
      this.error("All dimensions must be on connectivities which return a set of items", NablaPackage.Literals.ARRAY_VAR__DIMENSIONS);
    }
    boolean _isEmpty_1 = IterableExtensions.<Connectivity>head(it.getDimensions()).getInTypes().isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      this.error("Dimension 1 must be on connectivities with 0 argument", NablaPackage.Literals.ARRAY_VAR__DIMENSIONS);
    }
    int _length = ((Object[])Conversions.unwrapArray(it.getDimensions(), Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      int _length_1 = ((Object[])Conversions.unwrapArray(it.getDimensions().get((i).intValue()).getInTypes(), Object.class)).length;
      boolean _notEquals = (_length_1 != 1);
      if (_notEquals) {
        this.error("Dimension 2..N must be on connectivities with 1 argument", NablaPackage.Literals.ARRAY_VAR__DIMENSIONS, (i).intValue());
      } else {
        ItemType _head = IterableExtensions.<ItemType>head(it.getDimensions().get((i).intValue()).getInTypes());
        ItemType _type = it.getDimensions().get(((i).intValue() - 1)).getReturnType().getType();
        boolean _notEquals_1 = (!Objects.equal(_head, _type));
        if (_notEquals_1) {
          this.error((((("Dimension " + Integer.valueOf(((i).intValue() + 1))) + " argument must have same type as dimension ") + i) + " return type"), NablaPackage.Literals.ARRAY_VAR__DIMENSIONS, (i).intValue());
        }
      }
    }
  }
  
  @Check
  public void checkConstVar(final Affectation it) {
    if ((this._varExtensions.isConst(it.getVarRef().getVariable()) && (it.getVarRef().getVariable().eContainer() instanceof NablaModule))) {
      this.error("Affectation to const variable", NablaPackage.Literals.AFFECTATION__VAR_REF);
    }
  }
  
  @Check
  public void checkConstVar(final ScalarVarDefinition it) {
    if (((it.isConst() && (it.getDefaultValue() != null)) && IteratorExtensions.<VarRef>exists(Iterators.<VarRef>filter(it.getDefaultValue().eAllContents(), VarRef.class), ((Function1<VarRef, Boolean>) (VarRef x) -> {
      boolean _isConst = this._varExtensions.isConst(x.getVariable());
      return Boolean.valueOf((!_isConst));
    })))) {
      this.error("Assignment with non const variables", NablaPackage.Literals.SCALAR_VAR_DEFINITION__DEFAULT_VALUE);
    }
  }
  
  @Check
  public void checkOnlyScalarVarInInstructions(final ArrayVar it) {
    final EObject varGroupDeclaration = it.eContainer();
    if (((varGroupDeclaration != null) && (!(varGroupDeclaration.eContainer() instanceof NablaModule)))) {
      this.error("Local variables can only be scalar (no array).", NablaPackage.Literals.VAR__NAME);
    }
  }
  
  @Check
  public void checkIteratorRange(final VarRef it) {
    Var _variable = it.getVariable();
    if ((_variable instanceof ArrayVar)) {
      Var _variable_1 = it.getVariable();
      final EList<Connectivity> dimensions = ((ArrayVar) _variable_1).getDimensions();
      int _length = ((Object[])Conversions.unwrapArray(dimensions, Object.class)).length;
      int _length_1 = ((Object[])Conversions.unwrapArray(it.getSpaceIterators(), Object.class)).length;
      boolean _lessThan = (_length < _length_1);
      if (_lessThan) {
        int _length_2 = ((Object[])Conversions.unwrapArray(it.getSpaceIterators(), Object.class)).length;
        String _plus = ("Too many indices: " + Integer.valueOf(_length_2));
        String _plus_1 = (_plus + "(variable dimension is ");
        int _length_3 = ((Object[])Conversions.unwrapArray(dimensions, Object.class)).length;
        String _plus_2 = (_plus_1 + Integer.valueOf(_length_3));
        String _plus_3 = (_plus_2 + ")");
        this.error(_plus_3, NablaPackage.Literals.VAR_REF__SPACE_ITERATORS);
      } else {
        int _length_4 = ((Object[])Conversions.unwrapArray(it.getSpaceIterators(), Object.class)).length;
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length_4, true);
        for (final Integer i : _doubleDotLessThan) {
          {
            final IteratorRangeOrRef si = it.getSpaceIterators().get((i).intValue());
            final Connectivity expectedC = dimensions.get((i).intValue());
            final ItemType expectedT = expectedC.getReturnType().getType();
            boolean _matched = false;
            if (si instanceof SpaceIteratorRange) {
              _matched=true;
              final ItemArgType rt = ((SpaceIteratorRange)si).getConnectivity().getReturnType();
              boolean _isMultiple = rt.isMultiple();
              if (_isMultiple) {
                this.error("Connectivity return type must be a singleton", NablaPackage.Literals.VAR_REF__SPACE_ITERATORS);
              } else {
                ItemType _type = rt.getType();
                boolean _notEquals = (!Objects.equal(_type, expectedT));
                if (_notEquals) {
                  String _literal = expectedT.getLiteral();
                  String _plus_4 = ("Wrong iterator type: Expected " + _literal);
                  String _plus_5 = (_plus_4 + ", but was ");
                  String _literal_1 = rt.getType().getLiteral();
                  String _plus_6 = (_plus_5 + _literal_1);
                  this.error(_plus_6, NablaPackage.Literals.VAR_REF__SPACE_ITERATORS, (i).intValue());
                }
              }
            }
            if (!_matched) {
              if (si instanceof SpaceIteratorRef) {
                _matched=true;
                final ItemType actualT = ((SpaceIteratorRef)si).getIterator().getRange().getConnectivity().getReturnType().getType();
                boolean _notEquals = (!Objects.equal(actualT, expectedT));
                if (_notEquals) {
                  String _literal = expectedT.getLiteral();
                  String _plus_4 = ("Wrong iterator type: Expected " + _literal);
                  String _plus_5 = (_plus_4 + ", but was ");
                  String _literal_1 = actualT.getLiteral();
                  String _plus_6 = (_plus_5 + _literal_1);
                  this.error(_plus_6, NablaPackage.Literals.VAR_REF__SPACE_ITERATORS, (i).intValue());
                }
              }
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkArgs(final SpaceIterator it) {
    boolean _isMultiple = it.getRange().getConnectivity().getReturnType().isMultiple();
    boolean _not = (!_isMultiple);
    if (_not) {
      this.error("Range of iteration must not be a singleton", NablaPackage.Literals.SPACE_ITERATOR__RANGE);
    }
  }
  
  @Check
  public void checkArgs(final SpaceIteratorRange it) {
    int _length = ((Object[])Conversions.unwrapArray(it.getArgs(), Object.class)).length;
    int _length_1 = ((Object[])Conversions.unwrapArray(it.getConnectivity().getInTypes(), Object.class)).length;
    boolean _notEquals = (_length != _length_1);
    if (_notEquals) {
      int _length_2 = ((Object[])Conversions.unwrapArray(it.getConnectivity().getInTypes(), Object.class)).length;
      String _plus = ("Invalid number of arguments: Expected " + Integer.valueOf(_length_2));
      String _plus_1 = (_plus + ", but was ");
      int _length_3 = ((Object[])Conversions.unwrapArray(it.getArgs(), Object.class)).length;
      String _plus_2 = (_plus_1 + Integer.valueOf(_length_3));
      this.error(_plus_2, NablaPackage.Literals.SPACE_ITERATOR_RANGE__ARGS);
    } else {
      int _length_4 = ((Object[])Conversions.unwrapArray(it.getArgs(), Object.class)).length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length_4, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          final ItemType actualT = it.getArgs().get((i).intValue()).getIterator().getRange().getConnectivity().getReturnType().getType();
          final ItemType expectedT = it.getConnectivity().getInTypes().get((i).intValue());
          boolean _notEquals_1 = (!Objects.equal(actualT, expectedT));
          if (_notEquals_1) {
            String _literal = expectedT.getLiteral();
            String _plus_3 = ("Wrong arguments: Expected " + _literal);
            String _plus_4 = (_plus_3 + ", but was ");
            String _literal_1 = actualT.getLiteral();
            String _plus_5 = (_plus_4 + _literal_1);
            this.error(_plus_5, NablaPackage.Literals.SPACE_ITERATOR_RANGE__ARGS, (i).intValue());
          }
        }
      }
    }
  }
}
