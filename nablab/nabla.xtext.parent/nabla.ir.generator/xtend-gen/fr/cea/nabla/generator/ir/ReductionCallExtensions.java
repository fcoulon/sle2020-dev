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
import fr.cea.nabla.FunctionCallExtensions;
import fr.cea.nabla.generator.ir.IrAnnotationHelper;
import fr.cea.nabla.generator.ir.IrExpressionFactory;
import fr.cea.nabla.generator.ir.IrFunctionFactory;
import fr.cea.nabla.generator.ir.IrIteratorFactory;
import fr.cea.nabla.generator.ir.Nabla2IrUtils;
import fr.cea.nabla.ir.ir.IrAnnotation;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.nabla.ReductionCall;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * Attention : cette classe doit être un singleton car elle utilise des méthodes create.
 * Si elle n'est pas singleton, plusieurs instances d'un même objet seront créées (voir la documentation Xtext).
 */
@Singleton
@SuppressWarnings("all")
public class ReductionCallExtensions {
  @Inject
  @Extension
  private FunctionCallExtensions _functionCallExtensions;
  
  @Inject
  @Extension
  private Nabla2IrUtils _nabla2IrUtils;
  
  @Inject
  @Extension
  private IrExpressionFactory _irExpressionFactory;
  
  @Inject
  @Extension
  private IrAnnotationHelper _irAnnotationHelper;
  
  @Inject
  @Extension
  private IrFunctionFactory _irFunctionFactory;
  
  @Inject
  @Extension
  private IrIteratorFactory _irIteratorFactory;
  
  public ScalarVariable toIrLocalVariable(final ReductionCall rc) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(rc);
    final ScalarVariable _result;
    synchronized (_createCache_toIrLocalVariable) {
      if (_createCache_toIrLocalVariable.containsKey(_cacheKey)) {
        return _createCache_toIrLocalVariable.get(_cacheKey);
      }
      ScalarVariable _createScalarVariable = IrFactory.eINSTANCE.createScalarVariable();
      _result = _createScalarVariable;
      _createCache_toIrLocalVariable.put(_cacheKey, _result);
    }
    _init_toIrLocalVariable(_result, rc);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, ScalarVariable> _createCache_toIrLocalVariable = CollectionLiterals.newHashMap();
  
  private void _init_toIrLocalVariable(final ScalarVariable it, final ReductionCall rc) {
    String _name = rc.getReduction().getName();
    int _hashCode = rc.hashCode();
    String _plus = (_name + Integer.valueOf(_hashCode));
    it.setName(_plus);
    it.setType(this._nabla2IrUtils.toIrBasicType(this._functionCallExtensions.getDeclaration(rc).getReturnType()));
    it.setDefaultValue(this._irExpressionFactory.toIrExpression(this._functionCallExtensions.getDeclaration(rc).getSeed()));
  }
  
  public fr.cea.nabla.ir.ir.ReductionCall toIrReductionCall(final ReductionCall rc) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(rc);
    final fr.cea.nabla.ir.ir.ReductionCall _result;
    synchronized (_createCache_toIrReductionCall) {
      if (_createCache_toIrReductionCall.containsKey(_cacheKey)) {
        return _createCache_toIrReductionCall.get(_cacheKey);
      }
      fr.cea.nabla.ir.ir.ReductionCall _createReductionCall = IrFactory.eINSTANCE.createReductionCall();
      _result = _createReductionCall;
      _createCache_toIrReductionCall.put(_cacheKey, _result);
    }
    _init_toIrReductionCall(_result, rc);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, fr.cea.nabla.ir.ir.ReductionCall> _createCache_toIrReductionCall = CollectionLiterals.newHashMap();
  
  private void _init_toIrReductionCall(final fr.cea.nabla.ir.ir.ReductionCall it, final ReductionCall rc) {
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(rc);
    _annotations.add(_irAnnotation);
    it.setReduction(this._irFunctionFactory.toIrReduction(rc.getReduction(), this._functionCallExtensions.getDeclaration(rc)));
    it.setIterator(this._irIteratorFactory.toIrIterator(rc.getIterator()));
    it.setArg(this._irExpressionFactory.toIrExpression(rc.getArg()));
  }
}
