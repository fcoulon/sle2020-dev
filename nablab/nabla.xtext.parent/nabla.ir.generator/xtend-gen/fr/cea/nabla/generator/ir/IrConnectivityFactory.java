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
import fr.cea.nabla.generator.ir.IrAnnotationHelper;
import fr.cea.nabla.generator.ir.Nabla2IrUtils;
import fr.cea.nabla.ir.ir.Connectivity;
import fr.cea.nabla.ir.ir.IrAnnotation;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.ItemType;
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
public class IrConnectivityFactory {
  @Inject
  @Extension
  private Nabla2IrUtils _nabla2IrUtils;
  
  @Inject
  @Extension
  private IrAnnotationHelper _irAnnotationHelper;
  
  public Connectivity toIrConnectivity(final fr.cea.nabla.nabla.Connectivity c) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(c);
    final Connectivity _result;
    synchronized (_createCache_toIrConnectivity) {
      if (_createCache_toIrConnectivity.containsKey(_cacheKey)) {
        return _createCache_toIrConnectivity.get(_cacheKey);
      }
      Connectivity _createConnectivity = IrFactory.eINSTANCE.createConnectivity();
      _result = _createConnectivity;
      _createCache_toIrConnectivity.put(_cacheKey, _result);
    }
    _init_toIrConnectivity(_result, c);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Connectivity> _createCache_toIrConnectivity = CollectionLiterals.newHashMap();
  
  private void _init_toIrConnectivity(final Connectivity it, final fr.cea.nabla.nabla.Connectivity c) {
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(c);
    _annotations.add(_irAnnotation);
    it.setName(c.getName());
    it.setReturnType(this._nabla2IrUtils.toIrItemArgType(c.getReturnType()));
    EList<ItemType> _inTypes = it.getInTypes();
    final Function1<fr.cea.nabla.nabla.ItemType, ItemType> _function = (fr.cea.nabla.nabla.ItemType it_1) -> {
      return this._nabla2IrUtils.toIrItemType(it_1);
    };
    List<ItemType> _map = ListExtensions.<fr.cea.nabla.nabla.ItemType, ItemType>map(c.getInTypes(), _function);
    Iterables.<ItemType>addAll(_inTypes, _map);
  }
}
