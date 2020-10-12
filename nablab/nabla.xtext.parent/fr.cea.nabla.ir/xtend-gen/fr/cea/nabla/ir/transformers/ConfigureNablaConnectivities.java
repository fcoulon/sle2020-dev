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
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class ConfigureNablaConnectivities implements IrTransformationStep {
  private static final Map<String, String> NablaConnectivities = Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(Pair.<String, String>of("cellsOfNode", "cells"), Pair.<String, String>of("nodesOfCell", "nodes"), Pair.<String, String>of("nodesOfFace", "nodes"), Pair.<String, String>of("innerNodes", "inner nodes"), Pair.<String, String>of("outerFaces", "outer faces")));
  
  @Override
  public String getDescription() {
    String _join = IterableExtensions.join(ConfigureNablaConnectivities.NablaConnectivities.values(), ", ");
    return ("Configure Nabla connectivities: " + _join);
  }
  
  @Override
  public boolean transform(final IrModule m) {
    final Consumer<Connectivity> _function = new Consumer<Connectivity>() {
      @Override
      public void accept(final Connectivity c) {
        c.setName(ConfigureNablaConnectivities.NablaConnectivities.getOrDefault(c.getName(), c.getName()));
      }
    };
    m.getConnectivities().forEach(_function);
    return true;
  }
}
