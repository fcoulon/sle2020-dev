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
import fr.cea.nabla.generator.GeneratorUtils;
import fr.cea.nabla.generator.ir.IrAnnotationHelper;
import fr.cea.nabla.ir.ir.BasicType;
import fr.cea.nabla.ir.ir.Import;
import fr.cea.nabla.ir.ir.IrAnnotation;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.ItemArgType;
import fr.cea.nabla.ir.ir.ItemType;
import java.util.ArrayList;
import java.util.HashMap;
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
public class Nabla2IrUtils extends GeneratorUtils {
  @Inject
  @Extension
  private IrAnnotationHelper _irAnnotationHelper;
  
  public BasicType toIrBasicType(final fr.cea.nabla.nabla.BasicType t) {
    int _value = t.getValue();
    int _plus = (_value + 1);
    final BasicType type = BasicType.get(_plus);
    if ((type == null)) {
      String _literal = t.getLiteral();
      String _plus_1 = ("Conversion Nabla --> IR impossible : type inconnu " + _literal);
      throw new RuntimeException(_plus_1);
    }
    return type;
  }
  
  public ItemType toIrItemType(final fr.cea.nabla.nabla.ItemType t) {
    int _value = t.getValue();
    int _plus = (_value + 1);
    final ItemType type = ItemType.get(_plus);
    if ((type == null)) {
      String _literal = t.getLiteral();
      String _plus_1 = ("Conversion Nabla --> IR impossible : type inconnu " + _literal);
      throw new RuntimeException(_plus_1);
    }
    return type;
  }
  
  public ItemArgType toIrItemArgType(final fr.cea.nabla.nabla.ItemArgType i) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(i);
    final ItemArgType _result;
    synchronized (_createCache_toIrItemArgType) {
      if (_createCache_toIrItemArgType.containsKey(_cacheKey)) {
        return _createCache_toIrItemArgType.get(_cacheKey);
      }
      ItemArgType _createItemArgType = IrFactory.eINSTANCE.createItemArgType();
      _result = _createItemArgType;
      _createCache_toIrItemArgType.put(_cacheKey, _result);
    }
    _init_toIrItemArgType(_result, i);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, ItemArgType> _createCache_toIrItemArgType = CollectionLiterals.newHashMap();
  
  private void _init_toIrItemArgType(final ItemArgType it, final fr.cea.nabla.nabla.ItemArgType i) {
    it.setMultiple(i.isMultiple());
    it.setType(this.toIrItemType(i.getType()));
  }
  
  public Import toIrImport(final fr.cea.nabla.nabla.Import i) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(i);
    final Import _result;
    synchronized (_createCache_toIrImport) {
      if (_createCache_toIrImport.containsKey(_cacheKey)) {
        return _createCache_toIrImport.get(_cacheKey);
      }
      Import _createImport = IrFactory.eINSTANCE.createImport();
      _result = _createImport;
      _createCache_toIrImport.put(_cacheKey, _result);
    }
    _init_toIrImport(_result, i);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Import> _createCache_toIrImport = CollectionLiterals.newHashMap();
  
  private void _init_toIrImport(final Import it, final fr.cea.nabla.nabla.Import i) {
    it.setImportedNamespace(i.getImportedNamespace());
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(i);
    _annotations.add(_irAnnotation);
  }
}
