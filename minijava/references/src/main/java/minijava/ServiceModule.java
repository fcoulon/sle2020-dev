package minijava;

import com.google.inject.AbstractModule;

class ServiceModule extends AbstractModule {
	
	@Override
	public void configure() {
		binder().bind(kaulua.lsp.api.IReference.class).to(ReferencesJsonRPC.class);
	}
	
}