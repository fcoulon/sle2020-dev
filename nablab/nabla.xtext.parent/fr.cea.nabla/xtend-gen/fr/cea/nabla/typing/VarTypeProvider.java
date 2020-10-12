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
package fr.cea.nabla.typing;

import com.google.inject.Inject;
import fr.cea.nabla.VarExtensions;
import fr.cea.nabla.nabla.ArrayVar;
import fr.cea.nabla.nabla.BasicType;
import fr.cea.nabla.nabla.ScalarVar;
import fr.cea.nabla.nabla.Var;
import fr.cea.nabla.typing.NablaType;
import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class VarTypeProvider {
  @Inject
  @Extension
  private VarExtensions _varExtensions;
  
  protected NablaType _getTypeFor(final ScalarVar it) {
    BasicType _basicType = this._varExtensions.getBasicType(it);
    return new NablaType(_basicType, 0);
  }
  
  protected NablaType _getTypeFor(final ArrayVar it) {
    BasicType _basicType = this._varExtensions.getBasicType(it);
    int _length = ((Object[])Conversions.unwrapArray(it.getDimensions(), Object.class)).length;
    return new NablaType(_basicType, _length);
  }
  
  public NablaType getTypeFor(final Var it) {
    if (it instanceof ArrayVar) {
      return _getTypeFor((ArrayVar)it);
    } else if (it instanceof ScalarVar) {
      return _getTypeFor((ScalarVar)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
