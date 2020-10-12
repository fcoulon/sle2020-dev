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
package fr.cea.nabla.ir.generator.n;

import fr.cea.nabla.ir.ir.BasicType;
import fr.cea.nabla.ir.ir.Iterator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Ir2NUtils {
  public String getNType(final BasicType t) {
    String _switchResult = null;
    if (t != null) {
      switch (t) {
        case VOID:
          _switchResult = "void";
          break;
        case BOOL:
          _switchResult = "ℾ";
          break;
        case INT:
          _switchResult = "ℕ";
          break;
        case REAL:
          _switchResult = "ℝ";
          break;
        case REAL2:
        case REAL3:
          _switchResult = "ℝ³";
          break;
        case REAL2X2:
        case REAL3X3:
          _switchResult = "ℝ³ˣ³";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public CharSequence getContent(final Iterator it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((it != null)) {
        _builder.append("∀ ");
        String _name = it.getRange().getConnectivity().getName();
        _builder.append(_name);
      }
    }
    return _builder;
  }
}
