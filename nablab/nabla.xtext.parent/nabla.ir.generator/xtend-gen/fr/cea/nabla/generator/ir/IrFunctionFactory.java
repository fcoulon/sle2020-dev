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
import fr.cea.nabla.Utils;
import fr.cea.nabla.generator.ir.IrAnnotationHelper;
import fr.cea.nabla.generator.ir.Nabla2IrUtils;
import fr.cea.nabla.ir.ir.BasicType;
import fr.cea.nabla.ir.ir.Function;
import fr.cea.nabla.ir.ir.IrAnnotation;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.Reduction;
import fr.cea.nabla.nabla.FunctionArg;
import fr.cea.nabla.nabla.ReductionArg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Attention : cette classe doit être un singleton car elle utilise des méthodes create.
 * Si elle n'est pas singleton, plusieurs instances d'un même objet seront créées lors
 * deu parcours du graphe d'origine (voir la documentation Xtext).
 */
@Singleton
@SuppressWarnings("all")
public class IrFunctionFactory {
  @Inject
  @Extension
  private Nabla2IrUtils _nabla2IrUtils;
  
  @Inject
  @Extension
  private IrAnnotationHelper _irAnnotationHelper;
  
  public Function toIrFunction(final fr.cea.nabla.nabla.Function f, final FunctionArg a) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(f, a);
    final Function _result;
    synchronized (_createCache_toIrFunction) {
      if (_createCache_toIrFunction.containsKey(_cacheKey)) {
        return _createCache_toIrFunction.get(_cacheKey);
      }
      Function _createFunction = IrFactory.eINSTANCE.createFunction();
      _result = _createFunction;
      _createCache_toIrFunction.put(_cacheKey, _result);
    }
    _init_toIrFunction(_result, f, a);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Function> _createCache_toIrFunction = CollectionLiterals.newHashMap();
  
  private void _init_toIrFunction(final Function it, final fr.cea.nabla.nabla.Function f, final FunctionArg a) {
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(a);
    _annotations.add(_irAnnotation);
    it.setName(f.getName());
    it.setReturnType(this._nabla2IrUtils.toIrBasicType(a.getReturnType()));
    EList<BasicType> _inTypes = it.getInTypes();
    final Function1<fr.cea.nabla.nabla.BasicType, BasicType> _function = (fr.cea.nabla.nabla.BasicType it_1) -> {
      return this._nabla2IrUtils.toIrBasicType(it_1);
    };
    List<BasicType> _map = ListExtensions.<fr.cea.nabla.nabla.BasicType, BasicType>map(a.getInTypes(), _function);
    Iterables.<BasicType>addAll(_inTypes, _map);
    it.setProvider(Utils.getNablaModule(f).getName());
  }
  
  public Reduction toIrReduction(final fr.cea.nabla.nabla.Reduction f, final ReductionArg a) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(f, a);
    final Reduction _result;
    synchronized (_createCache_toIrReduction) {
      if (_createCache_toIrReduction.containsKey(_cacheKey)) {
        return _createCache_toIrReduction.get(_cacheKey);
      }
      Reduction _createReduction = IrFactory.eINSTANCE.createReduction();
      _result = _createReduction;
      _createCache_toIrReduction.put(_cacheKey, _result);
    }
    _init_toIrReduction(_result, f, a);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Reduction> _createCache_toIrReduction = CollectionLiterals.newHashMap();
  
  private void _init_toIrReduction(final Reduction it, final fr.cea.nabla.nabla.Reduction f, final ReductionArg a) {
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(a);
    _annotations.add(_irAnnotation);
    it.setName(f.getName());
    it.setCollectionType(this._nabla2IrUtils.toIrBasicType(a.getCollectionType()));
    it.setReturnType(this._nabla2IrUtils.toIrBasicType(a.getReturnType()));
    it.setProvider(Utils.getNablaModule(f).getName());
  }
}
