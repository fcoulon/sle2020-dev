package org.tetrabox.minijava.xtext.ide

import com.google.inject.Guice
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.util.Modules2
import org.tetrabox.minijava.xtext.MiniJavaRuntimeModule
import org.tetrabox.minijava.xtext.MiniJavaStandaloneSetup

class MinijavaLSPModule extends MiniJavaStandaloneSetup {
	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MiniJavaRuntimeModule, new MiniJavaIdeModule, new CustomServerModule,
			[bind(IResourceServiceProvider.Registry).toProvider(IResourceServiceProvider.Registry.RegistryProvider)]
		))
	}
	
}