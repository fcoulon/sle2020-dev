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
package fr.cea.nabla.ir.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import fr.cea.nabla.ir.ir.ArrayVariable;
import fr.cea.nabla.ir.ir.Connectivity;
import fr.cea.nabla.ir.ir.Instruction;
import fr.cea.nabla.ir.ir.Iterator;
import fr.cea.nabla.ir.ir.IteratorRange;
import fr.cea.nabla.ir.ir.IteratorRangeOrRef;
import fr.cea.nabla.ir.ir.IteratorRef;
import fr.cea.nabla.ir.ir.Loop;
import fr.cea.nabla.ir.ir.VarRef;
import fr.cea.nabla.ir.ir.Variable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class IndexHelper {
  @Data
  public static class Index {
    private final Iterator iterator;
    
    private final Connectivity connectivity;
    
    private final String connectivityArgIterator;
    
    public String getContainerName() {
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(this.connectivityArgIterator);
      if (_isNullOrEmpty) {
        _xifexpression = this.connectivity.getName();
      } else {
        String _name = this.connectivity.getName();
        String _firstUpper = StringExtensions.toFirstUpper(this.connectivityArgIterator);
        _xifexpression = (_name + _firstUpper);
      }
      return _xifexpression;
    }
    
    public String getLabel() {
      String _name = this.iterator.getName();
      String _firstUpper = StringExtensions.toFirstUpper(this.getContainerName());
      return (_name + _firstUpper);
    }
    
    @Override
    public boolean equals(final Object o) {
      if ((o instanceof IndexHelper.Index)) {
        final IndexHelper.Index i = ((IndexHelper.Index) o);
        return (((i.iterator == this.iterator) && (i.connectivity == this.connectivity)) && Objects.equal(i.connectivityArgIterator, this.connectivityArgIterator));
      }
      return false;
    }
    
    public Index(final Iterator iterator, final Connectivity connectivity, final String connectivityArgIterator) {
      super();
      this.iterator = iterator;
      this.connectivity = connectivity;
      this.connectivityArgIterator = connectivityArgIterator;
    }
    
    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((this.iterator== null) ? 0 : this.iterator.hashCode());
      result = prime * result + ((this.connectivity== null) ? 0 : this.connectivity.hashCode());
      return prime * result + ((this.connectivityArgIterator== null) ? 0 : this.connectivityArgIterator.hashCode());
    }
    
    @Override
    @Pure
    public String toString() {
      ToStringBuilder b = new ToStringBuilder(this);
      b.add("iterator", this.iterator);
      b.add("connectivity", this.connectivity);
      b.add("connectivityArgIterator", this.connectivityArgIterator);
      return b.toString();
    }
    
    @Pure
    public Iterator getIterator() {
      return this.iterator;
    }
    
    @Pure
    public Connectivity getConnectivity() {
      return this.connectivity;
    }
    
    @Pure
    public String getConnectivityArgIterator() {
      return this.connectivityArgIterator;
    }
  }
  
  public static class IndexFactory {
    public static IndexHelper.Index createIndex(final Iterator i) {
      IndexHelper.Index _xblockexpression = null;
      {
        String _xifexpression = null;
        boolean _isEmpty = i.getRange().getArgs().isEmpty();
        if (_isEmpty) {
          _xifexpression = "";
        } else {
          _xifexpression = IndexHelper.IndexFactory.getArgName(IterableExtensions.<IteratorRef>head(i.getRange().getArgs()));
        }
        final String arg = _xifexpression;
        Connectivity _connectivity = i.getRange().getConnectivity();
        _xblockexpression = new IndexHelper.Index(i, _connectivity, arg);
      }
      return _xblockexpression;
    }
    
    public static IndexHelper.Index createIndex(final Iterator i, final int iIndex, final List<Connectivity> connectivities, final List<IteratorRangeOrRef> args) {
      IndexHelper.Index _xblockexpression = null;
      {
        final Connectivity c = connectivities.get(iIndex);
        String _xifexpression = null;
        if ((c.getInTypes().isEmpty() || (iIndex == 0))) {
          _xifexpression = "";
        } else {
          _xifexpression = IndexHelper.IndexFactory.getArgName(args.get((iIndex - 1)));
        }
        final String arg = _xifexpression;
        _xblockexpression = new IndexHelper.Index(i, c, arg);
      }
      return _xblockexpression;
    }
    
    private static String _getArgName(final IteratorRef it) {
      return it.getIterator().getName();
    }
    
    private static String _getArgName(final IteratorRange it) {
      String _string = Integer.valueOf(it.hashCode()).toString();
      return ("range" + _string);
    }
    
    private static String getArgName(final IteratorRangeOrRef it) {
      if (it instanceof IteratorRange) {
        return _getArgName((IteratorRange)it);
      } else if (it instanceof IteratorRef) {
        return _getArgName((IteratorRef)it);
      } else {
        throw new IllegalArgumentException("Unhandled parameter types: " +
          Arrays.<Object>asList(it).toString());
      }
    }
  }
  
  public Iterable<IndexHelper.Index> getRequiredIndexes(final Loop context) {
    final HashSet<IndexHelper.Index> needed = this.getNeededIndexes(context);
    final HashSet<IndexHelper.Index> available = this.getAvailableIndexes(context);
    final Function1<IndexHelper.Index, Boolean> _function = new Function1<IndexHelper.Index, Boolean>() {
      @Override
      public Boolean apply(final IndexHelper.Index x) {
        final Function1<IndexHelper.Index, Boolean> _function = new Function1<IndexHelper.Index, Boolean>() {
          @Override
          public Boolean apply(final IndexHelper.Index y) {
            return Boolean.valueOf(Objects.equal(y, x));
          }
        };
        return Boolean.valueOf(IterableExtensions.<IndexHelper.Index>exists(available, _function));
      }
    };
    final Iterable<IndexHelper.Index> required = IterableExtensions.<IndexHelper.Index>reject(needed, _function);
    return required;
  }
  
  public boolean needIdFor(final Iterator it, final Loop context) {
    return ((!IterableExtensions.isEmpty(this.getRequiredIndexes(context))) || this.isIteratorUsedAsRangeArg(it, context));
  }
  
  public boolean needNext(final Iterator it, final Loop context) {
    final Function1<IteratorRef, Boolean> _function = new Function1<IteratorRef, Boolean>() {
      @Override
      public Boolean apply(final IteratorRef x) {
        Iterator _iterator = x.getIterator();
        return Boolean.valueOf((_iterator == it));
      }
    };
    final Function1<IteratorRef, Boolean> _function_1 = new Function1<IteratorRef, Boolean>() {
      @Override
      public Boolean apply(final IteratorRef x) {
        return Boolean.valueOf(x.isNext());
      }
    };
    return IteratorExtensions.<IteratorRef>exists(IteratorExtensions.<IteratorRef>filter(Iterators.<IteratorRef>filter(context.eAllContents(), IteratorRef.class), _function), _function_1);
  }
  
  public boolean needPrev(final Iterator it, final Loop context) {
    final Function1<IteratorRef, Boolean> _function = new Function1<IteratorRef, Boolean>() {
      @Override
      public Boolean apply(final IteratorRef x) {
        Iterator _iterator = x.getIterator();
        return Boolean.valueOf((_iterator == it));
      }
    };
    final Function1<IteratorRef, Boolean> _function_1 = new Function1<IteratorRef, Boolean>() {
      @Override
      public Boolean apply(final IteratorRef x) {
        return Boolean.valueOf(x.isPrev());
      }
    };
    return IteratorExtensions.<IteratorRef>exists(IteratorExtensions.<IteratorRef>filter(Iterators.<IteratorRef>filter(context.eAllContents(), IteratorRef.class), _function), _function_1);
  }
  
  public String indexToId(final IndexHelper.Index it) {
    return this.indexToId(it, "");
  }
  
  public String indexToId(final IndexHelper.Index it, final String prefix) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(prefix);
      if (_isNullOrEmpty) {
        _xifexpression = it.getLabel();
      } else {
        String _firstUpper = StringExtensions.toFirstUpper(it.getLabel());
        _xifexpression = (prefix + _firstUpper);
      }
      final String realLabel = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isIndexEqualId = it.connectivity.isIndexEqualId();
      if (_isIndexEqualId) {
        _xifexpression_1 = realLabel;
      } else {
        String _containerName = it.getContainerName();
        String _plus = (_containerName + "[");
        String _plus_1 = (_plus + realLabel);
        _xifexpression_1 = (_plus_1 + "]");
      }
      _xblockexpression = _xifexpression_1;
    }
    return _xblockexpression;
  }
  
  public String idToIndex(final IndexHelper.Index it, final String idName, final String separator) {
    String _xifexpression = null;
    boolean _isIndexEqualId = it.connectivity.isIndexEqualId();
    if (_isIndexEqualId) {
      _xifexpression = idName;
    } else {
      String _containerName = it.getContainerName();
      String _plus = ((("Utils" + separator) + "indexOf(") + _containerName);
      String _plus_1 = (_plus + ",");
      String _plus_2 = (_plus_1 + idName);
      _xifexpression = (_plus_2 + ")");
    }
    return _xifexpression;
  }
  
  /**
   * Retourne vrai si un IteratorRange utilise l'iterateur 'iterator'
   * dans un de ses arguments pour le contexte 'context'.
   */
  private boolean isIteratorUsedAsRangeArg(final Iterator it, final Instruction context) {
    Iterable<IteratorRange> _iterable = IteratorExtensions.<IteratorRange>toIterable(Iterators.<IteratorRange>filter(context.eAllContents(), IteratorRange.class));
    for (final IteratorRange range : _iterable) {
      Iterable<IteratorRef> _filter = Iterables.<IteratorRef>filter(range.getArgs(), IteratorRef.class);
      for (final IteratorRef ref : _filter) {
        Iterator _iterator = ref.getIterator();
        boolean _tripleEquals = (_iterator == it);
        if (_tripleEquals) {
          return true;
        }
      }
    }
    return false;
  }
  
  private HashSet<IndexHelper.Index> getAvailableIndexes(final Loop context) {
    final HashSet<IndexHelper.Index> indexes = new HashSet<IndexHelper.Index>();
    IndexHelper.Index _createIndex = IndexHelper.IndexFactory.createIndex(context.getIterator());
    indexes.add(_createIndex);
    List<Loop> _outerLoops = this.getOuterLoops(context.eContainer());
    for (final Loop outerLoop : _outerLoops) {
      {
        IndexHelper.Index _createIndex_1 = IndexHelper.IndexFactory.createIndex(outerLoop.getIterator());
        indexes.add(_createIndex_1);
        HashSet<IndexHelper.Index> _neededIndexes = this.getNeededIndexes(outerLoop);
        Iterables.<IndexHelper.Index>addAll(indexes, _neededIndexes);
      }
    }
    return indexes;
  }
  
  /**
   * Retourne, pour le contexte 'context', l'ensemble des itérateurs
   * nécessaires sous forme d'une liste de paires <Iterator, Connectivity>,
   * correspondant à la liste des déréférecement effectués par les variables.
   */
  private HashSet<IndexHelper.Index> getNeededIndexes(final Loop context) {
    final HashSet<IndexHelper.Index> indexes = new HashSet<IndexHelper.Index>();
    final Function1<VarRef, Boolean> _function = new Function1<VarRef, Boolean>() {
      @Override
      public Boolean apply(final VarRef x) {
        Loop _nearestLoop = IndexHelper.this.getNearestLoop(x);
        return Boolean.valueOf((_nearestLoop == context));
      }
    };
    Iterable<VarRef> _iterable = IteratorExtensions.<VarRef>toIterable(IteratorExtensions.<VarRef>filter(Iterators.<VarRef>filter(context.eAllContents(), VarRef.class), _function));
    for (final VarRef vRef : _iterable) {
      int _length = ((Object[])Conversions.unwrapArray(vRef.getIterators(), Object.class)).length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          final IteratorRangeOrRef vRefIter = vRef.getIterators().get((i).intValue());
          if ((vRefIter instanceof IteratorRef)) {
            final Iterator vrIterator = ((IteratorRef) vRefIter).getIterator();
            Variable _variable = vRef.getVariable();
            final EList<Connectivity> vrConnectivities = ((ArrayVariable) _variable).getDimensions();
            IndexHelper.Index _createIndex = IndexHelper.IndexFactory.createIndex(vrIterator, (i).intValue(), vrConnectivities, vRef.getIterators());
            indexes.add(_createIndex);
          }
        }
      }
    }
    return indexes;
  }
  
  private Loop getNearestLoop(final EObject o) {
    Loop _xifexpression = null;
    if ((o instanceof Loop)) {
      _xifexpression = ((Loop) o);
    } else {
      Loop _xifexpression_1 = null;
      EObject _eContainer = o.eContainer();
      boolean _tripleEquals = (_eContainer == null);
      if (_tripleEquals) {
        _xifexpression_1 = null;
      } else {
        _xifexpression_1 = this.getNearestLoop(o.eContainer());
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private List<Loop> getOuterLoops(final EObject o) {
    List<Loop> _xifexpression = null;
    if ((o instanceof Loop)) {
      final List<Loop> l = this.getOuterLoops(((Loop)o).eContainer());
      l.add(((Loop) o));
      return l;
    } else {
      List<Loop> _xifexpression_1 = null;
      EObject _eContainer = o.eContainer();
      boolean _tripleEquals = (_eContainer == null);
      if (_tripleEquals) {
        _xifexpression_1 = new ArrayList<Loop>();
      } else {
        _xifexpression_1 = this.getOuterLoops(o.eContainer());
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
