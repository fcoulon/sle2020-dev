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
	
	static kaulua.lsp.api.IDefinition service;
	
	void onStart(@Observes StartupEvent ev) {
		LOGGER.info("definition is starting...");
		getService();
	}

	void onStop(@Observes ShutdownEvent ev) { //
		LOGGER.info("definition is stopping...");
	}
	
	public static kaulua.lsp.api.IDefinition getService() {
		if(service == null) {
			Injector injector = new org.tetrabox.minijava.xtext.MiniJavaStandaloneSetup().createInjectorAndDoEMFRegistration().createChildInjector(new ServiceModule());
			service = injector.getInstance(kaulua.lsp.api.IDefinition.class);
		}
		return service;
	}
}
