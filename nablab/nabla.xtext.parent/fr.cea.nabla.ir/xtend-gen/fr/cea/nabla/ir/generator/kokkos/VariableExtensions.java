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
import fr.cea.nabla.ir.generator.kokkos.Ir2KokkosUtils;
import fr.cea.nabla.ir.ir.ArrayVariable;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.ir.Variable;
import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class VariableExtensions {
  @Inject
  @Extension
  private Ir2KokkosUtils _ir2KokkosUtils;
  
  protected String _getKokkosType(final ScalarVariable it) {
    return this._ir2KokkosUtils.getKokkosType(it.getType());
  }
  
  protected String _getKokkosType(final ArrayVariable it) {
    String t = this._ir2KokkosUtils.getKokkosType(it.getType());
    return t;
  }
  
  public CharSequence getKokkosAllocation(final ArrayVariable it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//mesh.createVariable<");
    String _kokkosType = this.getKokkosType(it);
    _builder.append(_kokkosType);
    _builder.append(">(kmds::KMDS_CELL, \"");
    String _name = it.getName();
    _builder.append(_name);
    _builder.append("\")");
    return _builder;
  }
  
  public String getKokkosType(final Variable it) {
    if (it instanceof ArrayVariable) {
      return _getKokkosType((ArrayVariable)it);
    } else if (it instanceof ScalarVariable) {
      return _getKokkosType((ScalarVariable)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
