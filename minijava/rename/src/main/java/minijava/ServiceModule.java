package minijava;

import com.google.inject.AbstractModule;
import kaulua.refactoring.IRenameStrategy2;

class ServiceModule extends AbstractModule {
	
	@Override
	public void configure() {
		binder().bind(kaulua.lsp.api.IRename.class).to(RenameJsonRPC.class);
		binder().bind(IRenameStrategy2.class).to(IRenameStrategy2.DefaultImpl.class);
	}
	
}