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
package fr.cea.nabla.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.cea.nabla.NablaRuntimeModule;
import fr.cea.nabla.NablaStandaloneSetup;
import fr.cea.nabla.ide.NablaIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class NablaIdeSetup extends NablaStandaloneSetup {
  @Override
  public Injector createInjector() {
    NablaRuntimeModule _nablaRuntimeModule = new NablaRuntimeModule();
    NablaIdeModule _nablaIdeModule = new NablaIdeModule();
    return Guice.createInjector(Modules2.mixin(_nablaRuntimeModule, _nablaIdeModule));
  }
}
