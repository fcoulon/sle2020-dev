package org.tetrabox.minijava.xtext.ide;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.Modules2;
import org.tetrabox.minijava.xtext.MiniJavaRuntimeModule;
import org.tetrabox.minijava.xtext.MiniJavaStandaloneSetup;
import org.tetrabox.minijava.xtext.ide.CustomServerModule;
import org.tetrabox.minijava.xtext.ide.MiniJavaIdeModule;

@SuppressWarnings("all")
public class MinijavaLSPModule extends MiniJavaStandaloneSetup {
  @Override
  public Injector createInjector() {
    MiniJavaRuntimeModule _miniJavaRuntimeModule = new MiniJavaRuntimeModule();
    MiniJavaIdeModule _miniJavaIdeModule = new MiniJavaIdeModule();
    CustomServerModule _customServerModule = new CustomServerModule();
    final com.google.inject.Module _function = (Binder it) -> {
      it.<IResourceServiceProvider.Registry>bind(IResourceServiceProvider.Registry.class).toProvider(IResourceServiceProvider.Registry.RegistryProvider.class);
    };
    return Guice.createInjector(Modules2.mixin(_miniJavaRuntimeModule, _miniJavaIdeModule, _customServerModule, _function));
  }
}
