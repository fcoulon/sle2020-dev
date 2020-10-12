package kaulua.fm.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import fr.inria.diverse.kaulua.Dependency;
import fr.inria.diverse.kaulua.Feature;
import fr.inria.diverse.kaulua.Protocol;

abstract public class AbstractLspServiceGenerator implements IServiceGenerator {
	
	abstract void createResource(Feature service, String dslName, String containingFolder);
	
	abstract void createServiceImplementation(Feature service, String dslName, String containingFolder);

	protected void createAppLifeCycle(Feature service, String dslName, String xtextUri, String serviceInterface, String containingFolder) {
		String standaloneSetup = getStandaloneSetup(xtextUri);
		String serviceName = service.getName();
		String className = "AppLifecycleBean";
		String pkg = dslName.replaceAll("\\.", "/");
		Path pkgPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg);
		Path resPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg+"/"+className+".java");
		String template = 
				"package %s;\n" + 
				"\n" + 
				"import javax.enterprise.context.ApplicationScoped;\n" + 
				"import javax.enterprise.event.Observes;\n" + 
				"\n" + 
				"import org.slf4j.Logger;\n" + 
				"import org.slf4j.LoggerFactory;\n" + 
				"\n" + 
				"import com.google.inject.Injector;\n" + 
				"\n" + 
				"import io.quarkus.runtime.ShutdownEvent;\n" + 
				"import io.quarkus.runtime.StartupEvent;\n" + 
				"\n" + 
				"@ApplicationScoped\n" + 
				"public class AppLifecycleBean {\n" + 
				"\n" + 
				"	private static final Logger LOGGER = LoggerFactory.getLogger(\"ListenerBean\");\n" + 
				"	\n" + 
				"	static %s service;\n" + 
				"	\n" + 
				"	void onStart(@Observes StartupEvent ev) {\n" + 
				"		LOGGER.info(\"%s is starting...\");\n" + 
				"		getService();\n" + 
				"	}\n" + 
				"\n" + 
				"	void onStop(@Observes ShutdownEvent ev) { //\n" + 
				"		LOGGER.info(\"%s is stopping...\");\n" + 
				"	}\n" + 
				"	\n" + 
				"	public static %s getService() {\n" + 
				"		if(service == null) {\n" + 
				"			Injector injector = new %s().createInjectorAndDoEMFRegistration().createChildInjector(new ServiceModule());\n" + 
				"			service = injector.getInstance(%s.class);\n" + 
				"		}\n" + 
				"		return service;\n" + 
				"	}\n" + 
				"}\n" + 
				"";
		
		String content = String.format(template, pkg, serviceInterface, serviceName, serviceName, serviceInterface, standaloneSetup, serviceInterface);
		
		try {
			if(!Files.exists(pkgPath)) {
				Files.createDirectories(pkgPath);
			}
			if(!Files.exists(resPath)) {
				Files.createFile(resPath);				
			}
			Files.writeString(resPath, content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void createServiceModule(Feature service, String dslName, String xtextUri, String serviceInterface, String serviceClass, String containingFolder) {
		String serviceName = service.getName();
		String className = "ServiceModule";
		String pkg = dslName.replaceAll("\\.", "/");
		Path pkgPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg);
		Path resPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg+"/"+className+".java");
		String template = 
				"package %s;\n" + 
				"\n" + 
				"import com.google.inject.AbstractModule;\n" + 
				"\n" + 
				"class ServiceModule extends AbstractModule {\n" + 
				"	\n" + 
				"	@Override\n" + 
				"	public void configure() {\n" + 
				"		binder().bind(%s.class).to(%s.class);\n" + 
				"	}\n" + 
				"	\n" + 
				"}";
		
		String content = String.format(template, pkg, serviceInterface, serviceClass);
		
		try {
			if(!Files.exists(pkgPath)) {
				Files.createDirectories(pkgPath);
			}
			if(!Files.exists(resPath)) {
				Files.createFile(resPath);				
			}
			Files.writeString(resPath, content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected String getStandaloneSetup(String xtextUri) {
		
		int start = xtextUri.indexOf("/src/");
		int end = xtextUri.lastIndexOf(".xtext");
		String subUri = xtextUri.substring(start+5, end);
		String result = subUri + "StandaloneSetup";
		result = result.replaceAll("/", "\\.");
		return result;
	}
	
	protected void updateQuarkusFiles(Feature service, String dslName, String containingFolder) {
		updateAppProperties(service,dslName,containingFolder);
		updateDockerfile(service,dslName,containingFolder);
	}
	
	protected void updateAppProperties(Feature service, String dslName, String containingFolder) {
		String serviceName = service.getName();
		String pkg = dslName.replaceAll("\\.", "/");
		Path configPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/resources/application.properties");
		
		StringBuffer newContent = new StringBuffer();
		List<Dependency> connections = getDependencies(service);
		Set<Feature> calledServices = connections.stream()
			.map(c -> (Feature) c.getCallee().eContainer())
			.collect(Collectors.toSet());
		for(Feature calledService : calledServices) {
			String calledResource = calledService.getName()+"Resource";
			newContent.append("\n"+pkg+"."+calledResource+"/mp-rest/url=http://"+calledService.getName()+":8080\n");
		}
		
		newContent.append("quarkus.jaeger.service-name="+serviceName+"\n" + 
				"quarkus.jaeger.sampler-type=const\n" + 
				"quarkus.jaeger.sampler-param=1\n");
		
		try {
		    Files.writeString(configPath, newContent.toString(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void updateDockerfile(Feature service, String dslName, String containingFolder) {
		
		String serviceName = service.getName();
		Path dockerfilePath = Paths.get(containingFolder+"/"+serviceName+"/src/main/docker/Dockerfile.jvm");
		
		String newContent = 
				"FROM fabric8/java-centos-openjdk11-jre\n" + 
				"ENV JAVA_OPTIONS=\"-Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dfile.encoding=UTF-8\"\n" + 
				"ENV AB_ENABLED=jmx_exporter\n" + 
				"COPY target/lib/* /deployments/lib/\n" + 
				"COPY target/*-runner.jar /deployments/app.jar\n" + 
				"EXPOSE 8080\n" + 
				"\n" + 
				"ENTRYPOINT [ \"/deployments/run-java.sh\" ]\n";
		
		try {
		    Files.writeString(dockerfilePath, newContent);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static List<Dependency> getDependencies(Feature service) {
		List<Dependency> res = new ArrayList<>();
		
		Protocol protocol = (Protocol) service.eContainer();
		
		for(Dependency conn : protocol.getDependencies()) {
			if(conn.getCaller().eContainer()  == service) {
				res.add(conn);
			}
		}
		
		return res;
	}

}
