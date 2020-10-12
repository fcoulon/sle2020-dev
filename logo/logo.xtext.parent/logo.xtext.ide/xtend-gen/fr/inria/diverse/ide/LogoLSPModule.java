package fr.inria.diverse.ide;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.inria.diverse.LogoRuntimeModule;
import fr.inria.diverse.LogoStandaloneSetup;
import fr.inria.diverse.ide.CustomServerModule;
import fr.inria.diverse.ide.LogoIdeModule;
import kmLogo.ASM.ASMPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.Modules2;

@SuppressWarnings("all")
public class LogoLSPModule extends LogoStandaloneSetup {
  @Override
  public Injector createInjector() {
    LogoRuntimeModule _logoRuntimeModule = new LogoRuntimeModule();
    LogoIdeModule _logoIdeModule = new LogoIdeModule();
    CustomServerModule _customServerModule = new CustomServerModule();
    final com.google.inject.Module _function = (Binder it) -> {
      it.<IResourceServiceProvider.Registry>bind(IResourceServiceProvider.Registry.class).toProvider(IResourceServiceProvider.Registry.RegistryProvider.class);
    };
    return Guice.createInjector(Modules2.mixin(_logoRuntimeModule, _logoIdeModule, _customServerModule, _function));
  }
  
  @Override
  public void register(final Injector injector) {
    super.register(injector);
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey("http://kmLogo/ASM");
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put("http://kmLogo/ASM", ASMPackage.eINSTANCE);
    }
  }
}
