package fr.cea.nabla.ide;

import com.google.inject.AbstractModule;
import fr.cea.nabla.ide.CustomLanguageServerImpl;
import java.util.concurrent.ExecutorService;
import org.eclipse.lsp4j.services.LanguageServer;
import org.eclipse.xtext.ide.ExecutorServiceProvider;
import org.eclipse.xtext.ide.server.DefaultProjectDescriptionFactory;
import org.eclipse.xtext.ide.server.IProjectDescriptionFactory;
import org.eclipse.xtext.ide.server.IWorkspaceConfigFactory;
import org.eclipse.xtext.ide.server.ProjectWorkspaceConfigFactory;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.ResourceServiceProviderServiceLoader;
import org.eclipse.xtext.resource.containers.ProjectDescriptionBasedContainerManager;

/**
 * @author Sven Efftinge - Initial contribution and API
 * @since 2.11
 */
@SuppressWarnings("all")
public class CustomServerModule extends AbstractModule {
  @Override
  protected void configure() {
    this.binder().<ExecutorService>bind(ExecutorService.class).toProvider(ExecutorServiceProvider.class);
    this.<LanguageServer>bind(LanguageServer.class).to(CustomLanguageServerImpl.class);
    this.<IResourceServiceProvider.Registry>bind(IResourceServiceProvider.Registry.class).toProvider(ResourceServiceProviderServiceLoader.class);
    this.<IWorkspaceConfigFactory>bind(IWorkspaceConfigFactory.class).to(ProjectWorkspaceConfigFactory.class);
    this.<IProjectDescriptionFactory>bind(IProjectDescriptionFactory.class).to(DefaultProjectDescriptionFactory.class);
    this.<IContainer.Manager>bind(IContainer.Manager.class).to(ProjectDescriptionBasedContainerManager.class);
  }
}
