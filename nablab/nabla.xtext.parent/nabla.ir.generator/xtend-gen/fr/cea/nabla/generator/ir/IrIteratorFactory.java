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
import fr.cea.nabla.generator.ir.IrAnnotationHelper;
import fr.cea.nabla.generator.ir.IrConnectivityFactory;
import fr.cea.nabla.ir.ir.IrAnnotation;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.Iterator;
import fr.cea.nabla.ir.ir.IteratorRange;
import fr.cea.nabla.ir.ir.IteratorRangeOrRef;
import fr.cea.nabla.ir.ir.IteratorRef;
import fr.cea.nabla.nabla.SpaceIterator;
import fr.cea.nabla.nabla.SpaceIteratorRange;
import fr.cea.nabla.nabla.SpaceIteratorRef;
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
public class IrIteratorFactory {
  @Inject
  @Extension
  private IrAnnotationHelper _irAnnotationHelper;
  
  @Inject
  @Extension
  private IrConnectivityFactory _irConnectivityFactory;
  
  public Iterator toIrIterator(final SpaceIterator si) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(si);
    final Iterator _result;
    synchronized (_createCache_toIrIterator) {
      if (_createCache_toIrIterator.containsKey(_cacheKey)) {
        return _createCache_toIrIterator.get(_cacheKey);
      }
      Iterator _createIterator = IrFactory.eINSTANCE.createIterator();
      _result = _createIterator;
      _createCache_toIrIterator.put(_cacheKey, _result);
    }
    _init_toIrIterator(_result, si);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Iterator> _createCache_toIrIterator = CollectionLiterals.newHashMap();
  
  private void _init_toIrIterator(final Iterator it, final SpaceIterator si) {
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(si);
    _annotations.add(_irAnnotation);
    it.setName(si.getName());
    it.setRange(this.toIrIteratorRange(si.getRange()));
  }
  
  public IteratorRange toIrIteratorRange(final SpaceIteratorRange range) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(range);
    final IteratorRange _result;
    synchronized (_createCache_toIrIteratorRange) {
      if (_createCache_toIrIteratorRange.containsKey(_cacheKey)) {
        return _createCache_toIrIteratorRange.get(_cacheKey);
      }
      IteratorRange _createIteratorRange = IrFactory.eINSTANCE.createIteratorRange();
      _result = _createIteratorRange;
      _createCache_toIrIteratorRange.put(_cacheKey, _result);
    }
    _init_toIrIteratorRange(_result, range);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, IteratorRange> _createCache_toIrIteratorRange = CollectionLiterals.newHashMap();
  
  private void _init_toIrIteratorRange(final IteratorRange it, final SpaceIteratorRange range) {
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(range);
    _annotations.add(_irAnnotation);
    it.setConnectivity(this._irConnectivityFactory.toIrConnectivity(range.getConnectivity()));
    final Consumer<SpaceIteratorRef> _function = (SpaceIteratorRef x) -> {
      EList<IteratorRef> _args = it.getArgs();
      IteratorRef _irIteratorRef = this.toIrIteratorRef(x);
      _args.add(_irIteratorRef);
    };
    range.getArgs().forEach(_function);
  }
  
  public IteratorRef toIrIteratorRef(final SpaceIteratorRef ref) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(ref);
    final IteratorRef _result;
    synchronized (_createCache_toIrIteratorRef) {
      if (_createCache_toIrIteratorRef.containsKey(_cacheKey)) {
        return _createCache_toIrIteratorRef.get(_cacheKey);
      }
      IteratorRef _createIteratorRef = IrFactory.eINSTANCE.createIteratorRef();
      _result = _createIteratorRef;
      _createCache_toIrIteratorRef.put(_cacheKey, _result);
    }
    _init_toIrIteratorRef(_result, ref);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, IteratorRef> _createCache_toIrIteratorRef = CollectionLiterals.newHashMap();
  
  private void _init_toIrIteratorRef(final IteratorRef it, final SpaceIteratorRef ref) {
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(ref);
    _annotations.add(_irAnnotation);
    it.setIterator(this.toIrIterator(ref.getIterator()));
    it.setPrev(ref.isPrev());
    it.setNext(ref.isNext());
  }
  
  protected IteratorRangeOrRef _toIrIteratorRangeOrRef(final SpaceIteratorRange r) {
    return this.toIrIteratorRange(r);
  }
  
  protected IteratorRangeOrRef _toIrIteratorRangeOrRef(final SpaceIteratorRef r) {
    return this.toIrIteratorRef(r);
  }
  
  public IteratorRangeOrRef toIrIteratorRangeOrRef(final fr.cea.nabla.nabla.IteratorRangeOrRef r) {
    if (r instanceof SpaceIteratorRange) {
      return _toIrIteratorRangeOrRef((SpaceIteratorRange)r);
    } else if (r instanceof SpaceIteratorRef) {
      return _toIrIteratorRangeOrRef((SpaceIteratorRef)r);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r).toString());
    }
  }
}
