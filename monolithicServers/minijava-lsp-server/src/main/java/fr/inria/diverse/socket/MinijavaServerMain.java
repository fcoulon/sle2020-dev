package fr.inria.diverse.socket;

import org.eclipse.xtext.ide.server.LanguageServerImpl;
import org.tetrabox.minijava.xtext.ide.MiniJavaIdeSetup;

public class MinijavaServerMain {
	
	public static void main(String[] args) {
		try {
			LanguageServerImpl server = new MiniJavaIdeSetup().createInjectorAndDoEMFRegistration().getInstance(LanguageServerImpl.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
