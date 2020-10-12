package thingml;

import com.google.inject.AbstractModule;

class ServiceModule extends AbstractModule {
	
	@Override
	public void configure() {
		binder().bind(kaulua.lsp.api.IDefinition.class).to(DefinitionJsonRPC.class);
	}
	
}