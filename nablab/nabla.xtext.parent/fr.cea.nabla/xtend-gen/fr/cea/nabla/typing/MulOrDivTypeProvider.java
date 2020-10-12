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
import fr.cea.nabla.typing.BinaryOperatorTypeProvider;
import fr.cea.nabla.typing.DivTypeProvider;
import fr.cea.nabla.typing.MulTypeProvider;

@SuppressWarnings("all")
public class MulOrDivTypeProvider {
  @Inject
  private MulTypeProvider mtp;
  
  @Inject
  private DivTypeProvider dtp;
  
  public BinaryOperatorTypeProvider getTypeProvider(final String op) {
    BinaryOperatorTypeProvider _switchResult = null;
    if (op != null) {
      switch (op) {
        case "*":
          _switchResult = this.mtp;
          break;
        case "/":
          _switchResult = this.dtp;
          break;
        default:
          throw new RuntimeException(("Unexpected operator: " + op));
      }
    } else {
      throw new RuntimeException(("Unexpected operator: " + op));
    }
    return _switchResult;
  }
}
