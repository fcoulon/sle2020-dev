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

import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.cea.nabla.VarExtensions;
import fr.cea.nabla.generator.ir.IrAnnotationHelper;
import fr.cea.nabla.generator.ir.IrConnectivityFactory;
import fr.cea.nabla.generator.ir.IrExpressionFactory;
import fr.cea.nabla.generator.ir.Nabla2IrUtils;
import fr.cea.nabla.ir.ir.ArrayVariable;
import fr.cea.nabla.ir.ir.IrAnnotation;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.ir.Variable;
import fr.cea.nabla.nabla.ArrayVar;
import fr.cea.nabla.nabla.Connectivity;
import fr.cea.nabla.nabla.Expression;
import fr.cea.nabla.nabla.ScalarVar;
import fr.cea.nabla.nabla.TimeIteratorRef;
import fr.cea.nabla.nabla.Var;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * Attention : cette classe doit être un singleton car elle utilise des méthodes create.
 * Si elle n'est pas singleton, plusieurs instances d'un même objet seront créées lors
 * deu parcours du graphe d'origine (voir la documentation Xtext).
 */
@Singleton
@SuppressWarnings("all")
public class IrVariableFactory {
  @Inject
  @Extension
  private VarExtensions _varExtensions;
  
  @Inject
  @Extension
  private IrExpressionFactory _irExpressionFactory;
  
  @Inject
  @Extension
  private Nabla2IrUtils _nabla2IrUtils;
  
  @Inject
  @Extension
  private IrAnnotationHelper _irAnnotationHelper;
  
  @Inject
  @Extension
  private IrConnectivityFactory _irConnectivityFactory;
  
  /**
   * Cette méthode permet de construire une variable IR depuis
   * une variable Nabla. C'est utile à partir d'une instance de VarRef.
   * A une variable Nabla peut correspondre plusieurs variables IR,
   * en fonction de l'itérateur en temps.
   */
  public Variable toIrVariable(final Var v, final TimeIteratorRef tr) {
    Variable _xblockexpression = null;
    {
      final String varName = this.buildVarName(v, tr);
      Variable _switchResult = null;
      boolean _matched = false;
      if (v instanceof ScalarVar) {
        _matched=true;
        _switchResult = this.toIrScalarVariable(((ScalarVar)v), varName);
      }
      if (!_matched) {
        if (v instanceof ArrayVar) {
          _matched=true;
          _switchResult = this.toIrArrayVariable(((ArrayVar)v), varName);
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  protected Variable _toIrVariable(final ScalarVar v) {
    return this.toIrScalarVariable(v, v.getName());
  }
  
  protected Variable _toIrVariable(final ArrayVar v) {
    return this.toIrArrayVariable(v, v.getName());
  }
  
  public ScalarVariable toIrScalarVariable(final ScalarVar v) {
    return this.toIrScalarVariable(v, v.getName());
  }
  
  public ArrayVariable toIrArrayVariable(final ArrayVar v) {
    return this.toIrArrayVariable(v, v.getName());
  }
  
  public ScalarVariable toIrScalarVariable(final ScalarVar v, final String varName) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(v, varName);
    final ScalarVariable _result;
    synchronized (_createCache_toIrScalarVariable) {
      if (_createCache_toIrScalarVariable.containsKey(_cacheKey)) {
        return _createCache_toIrScalarVariable.get(_cacheKey);
      }
      ScalarVariable _createScalarVariable = IrFactory.eINSTANCE.createScalarVariable();
      _result = _createScalarVariable;
      _createCache_toIrScalarVariable.put(_cacheKey, _result);
    }
    _init_toIrScalarVariable(_result, v, varName);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, ScalarVariable> _createCache_toIrScalarVariable = CollectionLiterals.newHashMap();
  
  private void _init_toIrScalarVariable(final ScalarVariable it, final ScalarVar v, final String varName) {
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(v);
    _annotations.add(_irAnnotation);
    it.setName(varName);
    it.setType(this._nabla2IrUtils.toIrBasicType(this._varExtensions.getBasicType(v)));
    final Expression value = this._varExtensions.getDefaultValue(v);
    if ((value != null)) {
      it.setDefaultValue(this._irExpressionFactory.toIrExpression(value));
    }
  }
  
  public ArrayVariable toIrArrayVariable(final ArrayVar v, final String varName) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(v, varName);
    final ArrayVariable _result;
    synchronized (_createCache_toIrArrayVariable) {
      if (_createCache_toIrArrayVariable.containsKey(_cacheKey)) {
        return _createCache_toIrArrayVariable.get(_cacheKey);
      }
      ArrayVariable _createArrayVariable = IrFactory.eINSTANCE.createArrayVariable();
      _result = _createArrayVariable;
      _createCache_toIrArrayVariable.put(_cacheKey, _result);
    }
    _init_toIrArrayVariable(_result, v, varName);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, ArrayVariable> _createCache_toIrArrayVariable = CollectionLiterals.newHashMap();
  
  private void _init_toIrArrayVariable(final ArrayVariable it, final ArrayVar v, final String varName) {
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(v);
    _annotations.add(_irAnnotation);
    it.setName(varName);
    it.setType(this._nabla2IrUtils.toIrBasicType(this._varExtensions.getBasicType(v)));
    final Consumer<Connectivity> _function = (Connectivity x) -> {
      EList<fr.cea.nabla.ir.ir.Connectivity> _dimensions = it.getDimensions();
      fr.cea.nabla.ir.ir.Connectivity _irConnectivity = this._irConnectivityFactory.toIrConnectivity(x);
      _dimensions.add(_irConnectivity);
    };
    v.getDimensions().forEach(_function);
  }
  
  private String buildVarName(final Var v, final TimeIteratorRef i) {
    String _xifexpression = null;
    if (((i != null) && i.isNext())) {
      String _name = v.getName();
      String _plus = (_name + "_");
      String _name_1 = i.getIterator().getName();
      String _plus_1 = (_plus + _name_1);
      String _plus_2 = (_plus_1 + "_plus_");
      int _value = i.getValue();
      _xifexpression = (_plus_2 + Integer.valueOf(_value));
    } else {
      _xifexpression = v.getName();
    }
    return _xifexpression;
  }
  
  public Variable toIrVariable(final Var v) {
    if (v instanceof ArrayVar) {
      return _toIrVariable((ArrayVar)v);
    } else if (v instanceof ScalarVar) {
      return _toIrVariable((ScalarVar)v);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(v).toString());
    }
  }
}
