package org.thingml.xtext.ide;

import com.google.inject.AbstractModule;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtext.ide.ExecutorServiceProvider;
import org.eclipse.xtext.ide.server.DefaultProjectDescriptionFactory;
import org.eclipse.xtext.ide.server.IProjectDescriptionFactory;
import org.eclipse.xtext.ide.server.IWorkspaceConfigFactory;
import org.eclipse.xtext.ide.server.ProjectWorkspaceConfigFactory;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.ResourceServiceProviderServiceLoader;
import org.eclipse.xtext.resource.containers.ProjectDescriptionBasedContainerManager;

@SuppressWarnings("all")
public class CustomServerModule extends AbstractModule {
  protected void configure() {
    this.binder().<ExecutorService>bind(ExecutorService.class).toProvider(ExecutorServiceProvider.class);
    this.<IResourceServiceProvider.Registry>bind(IResourceServiceProvider.Registry.class).toProvider(ResourceServiceProviderServiceLoader.class);
    this.<IWorkspaceConfigFactory>bind(IWorkspaceConfigFactory.class).to(ProjectWorkspaceConfigFactory.class);
    this.<IProjectDescriptionFactory>bind(IProjectDescriptionFactory.class).to(DefaultProjectDescriptionFactory.class);
    this.<IContainer.Manager>bind(IContainer.Manager.class).to(ProjectDescriptionBasedContainerManager.class);
  }
}
