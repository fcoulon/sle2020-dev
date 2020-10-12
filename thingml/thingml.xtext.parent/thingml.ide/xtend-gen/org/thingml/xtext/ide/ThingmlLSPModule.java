package org.thingml.xtext.ide;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.Modules2;
import org.thingml.xtext.ThingMLRuntimeModule;
import org.thingml.xtext.ThingMLStandaloneSetup;
import org.thingml.xtext.ide.CustomServerModule;
import org.thingml.xtext.ide.ThingMLIdeModule;

@SuppressWarnings("all")
public class ThingmlLSPModule extends ThingMLStandaloneSetup {
  public Injector createInjector() {
    ThingMLRuntimeModule _thingMLRuntimeModule = new ThingMLRuntimeModule();
    ThingMLIdeModule _thingMLIdeModule = new ThingMLIdeModule();
    CustomServerModule _customServerModule = new CustomServerModule();
    final com.google.inject.Module _function = new com.google.inject.Module() {
      public void configure(final Binder it) {
        it.<IResourceServiceProvider.Registry>bind(IResourceServiceProvider.Registry.class).toProvider(IResourceServiceProvider.Registry.RegistryProvider.class);
      }
    };
    return Guice.createInjector(Modules2.mixin(_thingMLRuntimeModule, _thingMLIdeModule, _customServerModule, _function));
  }
}
