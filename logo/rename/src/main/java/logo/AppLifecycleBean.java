package logo;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.eclipse.emf.ecore.EPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Injector;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import kmLogo.ASM.ASMPackage;

@ApplicationScoped
public class AppLifecycleBean {

	private static final Logger LOGGER = LoggerFactory.getLogger("ListenerBean");
	
	static kaulua.lsp.api.IRename service;
	
	void onStart(@Observes StartupEvent ev) {
		LOGGER.info("rename is starting...");
		getService();
	}

	void onStop(@Observes ShutdownEvent ev) { //
		LOGGER.info("rename is stopping...");
	}
	
	public static kaulua.lsp.api.IRename getService() {
		if(service == null) {
			Injector injector = new fr.inria.diverse.LogoStandaloneSetup().createInjectorAndDoEMFRegistration().createChildInjector(new ServiceModule());
			service = injector.getInstance(kaulua.lsp.api.IRename.class);
			if (!EPackage.Registry.INSTANCE.containsKey("http://kmLogo/ASM")) {
				EPackage.Registry.INSTANCE.put("http://kmLogo/ASM", ASMPackage.eINSTANCE);
			}
		}
		return service;
	}
}
