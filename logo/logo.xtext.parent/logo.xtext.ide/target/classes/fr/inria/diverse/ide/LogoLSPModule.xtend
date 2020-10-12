package fr.inria.diverse.ide

import com.google.inject.Guice
import fr.inria.diverse.LogoRuntimeModule
import fr.inria.diverse.LogoStandaloneSetup
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.util.Modules2
import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import kmLogo.ASM.ASMPackage

class LogoLSPModule extends LogoStandaloneSetup {
	
	override createInjector() {
		Guice.createInjector(Modules2.mixin(new LogoRuntimeModule, new LogoIdeModule, new CustomServerModule,
			[bind(IResourceServiceProvider.Registry).toProvider(IResourceServiceProvider.Registry.RegistryProvider)]
		))
	}
	
	override register(Injector injector) {
		super.register(injector)
		if (!EPackage.Registry.INSTANCE.containsKey("http://kmLogo/ASM")) {
			EPackage.Registry.INSTANCE.put("http://kmLogo/ASM", ASMPackage.eINSTANCE);
		}
	}
	
}