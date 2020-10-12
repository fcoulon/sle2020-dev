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
package fr.cea.nabla.ir.transformers;

import fr.cea.nabla.ir.ir.Connectivity;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.transformers.IrTransformationStep;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class OptimizeConnectivities implements IrTransformationStep {
  private static final List<String> ConnectivitiesToOptimize = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("cells", "nodes", "faces"));
  
  @Override
  public String getDescription() {
    return "Annotate connectivities when Id and Index are equals (ex: cells)";
  }
  
  @Override
  public boolean transform(final IrModule m) {
    final Consumer<Connectivity> _function = new Consumer<Connectivity>() {
      @Override
      public void accept(final Connectivity c) {
        boolean _contains = OptimizeConnectivities.ConnectivitiesToOptimize.contains(c.getName());
        if (_contains) {
          c.setIndexEqualId(true);
        }
      }
    };
    m.getConnectivities().forEach(_function);
    return true;
  }
}
