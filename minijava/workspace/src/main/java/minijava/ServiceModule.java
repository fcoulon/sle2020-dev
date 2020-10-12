package minijava;

import com.google.inject.AbstractModule;

import java.util.concurrent.ExecutorService;
import kaulua.server.DefaultProjectDescriptionFactory;
import kaulua.server.ExecutorServiceProvider;
import kaulua.server.IProjectDescriptionFactory;
import kaulua.server.IWorkspaceConfigFactory;
import kaulua.server.ProjectWorkspaceConfigFactory;

class ServiceModule extends AbstractModule {
	
	@Override
	public void configure() {
		binder().bind(kaulua.lsp.api.IWorkspace.class).to(WorkspaceJsonRPC.class);
		binder().bind(ExecutorService.class).toProvider(ExecutorServiceProvider.class);
		binder().bind(IWorkspaceConfigFactory.class).to(ProjectWorkspaceConfigFactory.class);
		binder().bind(IProjectDescriptionFactory.class).to(DefaultProjectDescriptionFactory.class);
	}
	
}