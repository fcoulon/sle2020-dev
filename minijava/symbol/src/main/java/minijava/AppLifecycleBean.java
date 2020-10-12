package minijava;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Injector;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class AppLifecycleBean {

	private static final Logger LOGGER = LoggerFactory.getLogger("ListenerBean");
	
	static kaulua.lsp.api.ISymbol service;
	
	void onStart(@Observes StartupEvent ev) {
		LOGGER.info("symbol is starting...");
		getService();
	}

	void onStop(@Observes ShutdownEvent ev) { //
		LOGGER.info("symbol is stopping...");
	}
	
	public static kaulua.lsp.api.ISymbol getService() {
		if(service == null) {
			Injector injector = new org.tetrabox.minijava.xtext.MiniJavaStandaloneSetup().createInjectorAndDoEMFRegistration().createChildInjector(new ServiceModule());
			service = injector.getInstance(kaulua.lsp.api.ISymbol.class);
		}
		return service;
	}
}
