package org.thingml.xtext.ide

import com.google.inject.Guice
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.util.Modules2
import org.thingml.xtext.ThingMLRuntimeModule
import org.thingml.xtext.ThingMLStandaloneSetup

class ThingmlLSPModule extends ThingMLStandaloneSetup {
	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ThingMLRuntimeModule, new ThingMLIdeModule, new CustomServerModule,
			[bind(IResourceServiceProvider.Registry).toProvider(IResourceServiceProvider.Registry.RegistryProvider)]
		))
	}
}