package thingml;

import com.google.inject.AbstractModule;
import org.eclipse.xtext.formatting2.IFormatter2;
import kaulua.formatting.NullFormatter;

class ServiceModule extends AbstractModule {
	
	@Override
	public void configure() {
		binder().bind(kaulua.lsp.api.IFormatting.class).to(FormattingJsonRPC.class);
//		binder().bind(IFormatter2.class).to(NullFormatter.class);
	}
	
}