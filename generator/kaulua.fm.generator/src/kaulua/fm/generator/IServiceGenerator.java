package kaulua.fm.generator;

import fr.inria.diverse.kaulua.Feature;

public interface IServiceGenerator {

	/**
	 * Generate Maven project implementing the service
	 */
	void generate(Feature service, String dslName, String xtextUri, String containingFolder);
	
	/**
	 * Return true if this generator can generate this service
	 */
	boolean canHandle(Feature service);
}
