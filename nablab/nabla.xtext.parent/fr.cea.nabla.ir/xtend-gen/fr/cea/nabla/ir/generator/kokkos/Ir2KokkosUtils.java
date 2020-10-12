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
package fr.cea.nabla.ir.generator.kokkos;

import com.google.inject.Inject;
import fr.cea.nabla.ir.generator.Utils;
import fr.cea.nabla.ir.ir.BasicType;
import fr.cea.nabla.ir.ir.IteratorRange;
import fr.cea.nabla.ir.ir.IteratorRangeOrRef;
import fr.cea.nabla.ir.ir.IteratorRef;
import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Ir2KokkosUtils {
  @Inject
  @Extension
  private Utils _utils;
  
  public String getKokkosType(final BasicType t) {
    String _switchResult = null;
    if (t != null) {
      switch (t) {
        case VOID:
          _switchResult = "void";
          break;
        case BOOL:
          _switchResult = "bool";
          break;
        case INT:
          _switchResult = "int";
          break;
        case REAL:
          _switchResult = "double";
          break;
        case REAL2:
          _switchResult = "Real2";
          break;
        case REAL2X2:
          _switchResult = "Real2x2";
          break;
        case REAL3:
          _switchResult = "Real3";
          break;
        case REAL3X3:
          _switchResult = "Real3x3";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public CharSequence getAccessor(final IteratorRange it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("mesh->get");
    String _firstUpper = StringExtensions.toFirstUpper(it.getConnectivity().getName());
    _builder.append(_firstUpper);
    _builder.append("(");
    final Function1<IteratorRef, CharSequence> _function = new Function1<IteratorRef, CharSequence>() {
      @Override
      public CharSequence apply(final IteratorRef it) {
        return Ir2KokkosUtils.this.getRangeArgName(it);
      }
    };
    String _join = IterableExtensions.join(ListExtensions.<IteratorRef, CharSequence>map(it.getArgs(), _function), ",");
    _builder.append(_join);
    _builder.append(")");
    return _builder;
  }
  
  private CharSequence _getRangeArgName(final IteratorRange it) {
    return this.getAccessor(it);
  }
  
  private CharSequence _getRangeArgName(final IteratorRef it) {
    String _name = it.getIterator().getName();
    String _plus = (_name + "Id");
    return this._utils.prefix(it, _plus);
  }
  
  private CharSequence getRangeArgName(final IteratorRangeOrRef it) {
    if (it instanceof IteratorRange) {
      return _getRangeArgName((IteratorRange)it);
    } else if (it instanceof IteratorRef) {
      return _getRangeArgName((IteratorRef)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
