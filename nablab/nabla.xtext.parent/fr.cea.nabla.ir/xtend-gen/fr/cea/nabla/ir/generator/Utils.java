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

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import fr.cea.nabla.ir.JobExtensions;
import fr.cea.nabla.ir.ir.ArrayVariable;
import fr.cea.nabla.ir.ir.Connectivity;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.ir.Iterator;
import fr.cea.nabla.ir.ir.IteratorRef;
import fr.cea.nabla.ir.ir.Job;
import fr.cea.nabla.ir.ir.Loop;
import fr.cea.nabla.ir.ir.Variable;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Utils {
  public String prev(final String s) {
    String _firstUpper = StringExtensions.toFirstUpper(s);
    return ("prev" + _firstUpper);
  }
  
  public String next(final String s) {
    String _firstUpper = StringExtensions.toFirstUpper(s);
    return ("next" + _firstUpper);
  }
  
  public String getNbElems(final Connectivity it) {
    String _firstUpper = StringExtensions.toFirstUpper(it.getName());
    return ("nb" + _firstUpper);
  }
  
  public CharSequence getComment(final Job it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Job ");
    String _name = it.getName();
    _builder.append(_name, " ");
    _builder.append(" @");
    double _at = it.getAt();
    _builder.append(_at, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* In variables: ");
    {
      Iterable<Variable> _inVars = JobExtensions.getInVars(it);
      boolean _hasElements = false;
      for(final Variable v : _inVars) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", " ");
        }
        String _name_1 = v.getName();
        _builder.append(_name_1, " ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* Out variables: ");
    {
      Iterable<Variable> _outVars = JobExtensions.getOutVars(it);
      boolean _hasElements_1 = false;
      for(final Variable v_1 : _outVars) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(", ", " ");
        }
        String _name_2 = v_1.getName();
        _builder.append(_name_2, " ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Retourne la liste des connectivités utilisées par le module,
   * lors de la déclaration des variables ou des itérateurs.
   */
  public Set<Connectivity> getUsedConnectivities(final IrModule it) {
    final Function1<ArrayVariable, EList<Connectivity>> _function = new Function1<ArrayVariable, EList<Connectivity>>() {
      @Override
      public EList<Connectivity> apply(final ArrayVariable it) {
        return it.getDimensions();
      }
    };
    final Set<Connectivity> connectivities = IterableExtensions.<Connectivity>toSet(Iterables.<Connectivity>concat(IterableExtensions.<ArrayVariable, EList<Connectivity>>map(Iterables.<ArrayVariable>filter(it.getVariables(), ArrayVariable.class), _function)));
    final Consumer<Job> _function_1 = new Consumer<Job>() {
      @Override
      public void accept(final Job j) {
        final Function1<Iterator, Connectivity> _function = new Function1<Iterator, Connectivity>() {
          @Override
          public Connectivity apply(final Iterator it) {
            return it.getRange().getConnectivity();
          }
        };
        Set<Connectivity> _set = IteratorExtensions.<Connectivity>toSet(IteratorExtensions.<Iterator, Connectivity>map(Iterators.<Iterator>filter(j.eAllContents(), Iterator.class), _function));
        Iterables.<Connectivity>addAll(connectivities, _set);
      }
    };
    it.getJobs().forEach(_function_1);
    return connectivities;
  }
  
  public boolean isTopLevelLoop(final EObject it) {
    boolean _xifexpression = false;
    EObject _eContainer = it.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      _xifexpression = false;
    } else {
      boolean _xifexpression_1 = false;
      EObject _eContainer_1 = it.eContainer();
      if ((_eContainer_1 instanceof Loop)) {
        _xifexpression_1 = false;
      } else {
        boolean _xifexpression_2 = false;
        EObject _eContainer_2 = it.eContainer();
        if ((_eContainer_2 instanceof Job)) {
          _xifexpression_2 = true;
        } else {
          _xifexpression_2 = this.isTopLevelLoop(it.eContainer());
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String prefix(final IteratorRef it, final String name) {
    String _xifexpression = null;
    boolean _isPrev = it.isPrev();
    if (_isPrev) {
      _xifexpression = this.prev(name);
    } else {
      String _xifexpression_1 = null;
      boolean _isNext = it.isNext();
      if (_isNext) {
        _xifexpression_1 = this.next(name);
      } else {
        _xifexpression_1 = name;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
