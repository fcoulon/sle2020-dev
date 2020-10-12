package logo;

import com.google.inject.AbstractModule;

class ServiceModule extends AbstractModule {
	
	@Override
	public void configure() {
		binder().bind(kaulua.lsp.api.IDocumentHighlight.class).to(HighlightJsonRPC.class);
	}
	
}