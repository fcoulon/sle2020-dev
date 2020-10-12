package nablab;

import com.google.inject.AbstractModule;

class ServiceModule extends AbstractModule {
	
	@Override
	public void configure() {
		binder().bind(kaulua.lsp.api.IHover.class).to(HoverJsonRPC.class);
	}
	
}