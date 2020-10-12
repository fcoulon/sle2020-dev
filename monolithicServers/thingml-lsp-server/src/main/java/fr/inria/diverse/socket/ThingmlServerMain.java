package fr.inria.diverse.socket;

import org.eclipse.xtext.ide.server.LanguageServerImpl;
import org.thingml.xtext.ide.ThingMLIdeSetup;

public class ThingmlServerMain {
	
	public static void main(String[] args) {
		try {
			LanguageServerImpl server = new ThingMLIdeSetup().createInjectorAndDoEMFRegistration().getInstance(LanguageServerImpl.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
