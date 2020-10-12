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

import fr.cea.nabla.nabla.BasicType;
import fr.cea.nabla.typing.NablaType;

@SuppressWarnings("all")
public class BasicTypeProvider {
  public static final NablaType INT = new NablaType(BasicType.INT, 0);
  
  public static final NablaType REAL = new NablaType(BasicType.REAL, 0);
  
  public static final NablaType REAL2 = new NablaType(BasicType.REAL2, 0);
  
  public static final NablaType REAL2X2 = new NablaType(BasicType.REAL2X2, 0);
  
  public static final NablaType REAL3 = new NablaType(BasicType.REAL3, 0);
  
  public static final NablaType REAL3X3 = new NablaType(BasicType.REAL3X3, 0);
  
  public static final NablaType BOOL = new NablaType(BasicType.BOOL, 0);
  
  public NablaType getTypeFor(final BasicType it) {
    if (it != null) {
      switch (it) {
        case BOOL:
          return BasicTypeProvider.BOOL;
        case INT:
          return BasicTypeProvider.INT;
        case REAL:
          return BasicTypeProvider.REAL;
        case REAL2:
          return BasicTypeProvider.REAL2;
        case REAL3:
          return BasicTypeProvider.REAL3;
        case REAL2X2:
          return BasicTypeProvider.REAL2X2;
        case REAL3X3:
          return BasicTypeProvider.REAL3X3;
        default:
          break;
      }
    }
    return null;
  }
}
