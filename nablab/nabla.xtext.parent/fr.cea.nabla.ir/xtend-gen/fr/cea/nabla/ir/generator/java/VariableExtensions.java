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
package fr.cea.nabla.ir.generator.java;

import com.google.inject.Inject;
import fr.cea.nabla.ir.generator.java.Ir2JavaUtils;
import fr.cea.nabla.ir.ir.ArrayVariable;
import fr.cea.nabla.ir.ir.Connectivity;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.ir.Variable;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class VariableExtensions {
  @Inject
  @Extension
  private Ir2JavaUtils _ir2JavaUtils;
  
  protected String _getJavaType(final ScalarVariable it) {
    return this._ir2JavaUtils.getJavaType(it.getType());
  }
  
  protected String _getJavaType(final ArrayVariable it) {
    String t = this._ir2JavaUtils.getJavaType(it.getType());
    EList<Connectivity> _dimensions = it.getDimensions();
    for (final Connectivity d : _dimensions) {
      String _t = t;
      t = (_t + "[]");
    }
    return t;
  }
  
  public String getJavaType(final Variable it) {
    if (it instanceof ArrayVariable) {
      return _getJavaType((ArrayVariable)it);
    } else if (it instanceof ScalarVariable) {
      return _getJavaType((ScalarVariable)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
