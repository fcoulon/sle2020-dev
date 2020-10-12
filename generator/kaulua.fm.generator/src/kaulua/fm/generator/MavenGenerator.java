package kaulua.fm.generator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Collectors;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.inria.diverse.kaulua.Feature;
import fr.inria.diverse.kaulua.Protocol;
import kaulua.helper.MavenHelper;

public class MavenGenerator {
	
	public static void generateMavenProjects(File propertiesFile) {
		
		Properties dsl = loadPropertiesFile(propertiesFile.getLocation().toString()); // represent a DSL with Xtext and Kaulua file
		
		String xtextPath = dsl.getProperty("xtext");
		int nameStart = xtextPath.lastIndexOf("/") + 1;
		int nameEnd = xtextPath.lastIndexOf(".xtext");
		String dslName = dsl.getProperty("name");
		
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.createResource(URI.createURI("inmemory:/mode.kaulua"));
		try {
			String protocolPath = dsl.getProperty("protocol");
			URL url = new URL(protocolPath);
		    InputStream inputStream = url.openConnection().getInputStream();
			res.load(inputStream, new HashMap<>());
			Protocol protocol = (Protocol) res.getContents().get(0);
			generate(protocol, dslName, xtextPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void generate(Protocol protocol, String dslName, String xtextUri) {
		
		MavenServiceGenerator mandatoryGenerator = new MavenServiceGenerator();
		List<IServiceGenerator> generators = new LinkedList<>();
		generators.add(new RestServiceGenerator());
		generators.add(new FormServiceGenerator());
		generators.add(new DiagramServiceGenerator());
		generators.add(new CompletionServiceGenerator());
		generators.add(new DefinitionServiceGenerator());
		generators.add(new DocumentSymbolServiceGenerator());
		generators.add(new FormattingServiceGenerator());
		generators.add(new HoverServiceGenerator());
		generators.add(new HighlightServiceGenerator());
		generators.add(new ReferencesServiceGenerator());
		generators.add(new RenameServiceGenerator());
		generators.add(new SymbolServiceGenerator());
		generators.add(new WorkspaceServiceGenerator());
		
		String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		String containingFolder = wsPath + "/" + dslName;
		new java.io.File(containingFolder).mkdir();
		
		for(Feature service: protocol.getFeatures()) {
			if(ScriptGenerator.isGenerated(service)) {
				// Create base project
				mandatoryGenerator.generate(service, dslName, xtextUri, containingFolder);
				
				// Complete project with service specific generation
				List<IServiceGenerator> serviceGenerators = generators.stream().filter(gen -> gen.canHandle(service)).collect(Collectors.toList());
				for(IServiceGenerator serviceGenerator : serviceGenerators) {
					serviceGenerator.generate(service, dslName, xtextUri, containingFolder);
				}
				
				// Update the workspace
				MavenHelper.importProject(service.getName(), containingFolder);
				
				// Fix Antlr version conflict with Quarkus
				MavenHelper.addDependency(service.getName(), "org.antlr", "antlr-runtime", "[3.2]", containingFolder);
			}
		}
		
		createParentPom(protocol, dslName, containingFolder);
	}
	

	
	public static void createCorsFilter(String dslName, String projectName, String containingFolder) {
		String pkg = dslName.replaceAll("\\.", "/");
		Path corslPath = Paths.get(containingFolder+"/"+projectName+"/src/main/java/"+pkg+"/CorsFilter.java");
		
		String content = 
				"package "+dslName+";\n" + 
				"\n" + 
				"import java.io.IOException;\n" + 
				"\n" + 
				"import javax.ws.rs.container.ContainerRequestContext;\n" + 
				"import javax.ws.rs.container.ContainerResponseContext;\n" + 
				"import javax.ws.rs.container.ContainerResponseFilter;\n" + 
				"import javax.ws.rs.ext.Provider;\n" + 
				"\n" + 
				"@Provider\n" + 
				"public class CorsFilter implements ContainerResponseFilter {\n" + 
				"\n" + 
				"	@Override\n" + 
				"	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)\n" + 
				"			throws IOException {\n" + 
				"		responseContext.getHeaders().add(\"Access-Control-Allow-Origin\", \"*\");\n" + 
				"	}\n" + 
				"\n" + 
				"}";
		
		try {
			if(!Files.exists(corslPath)) {
				Files.createFile(corslPath);
				Files.writeString(corslPath, content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void createParentPom(Protocol protocol, String dslName, String containingFolder) {
		
		Path pomPath = Paths.get(containingFolder + "/pom.xml"); 
		
		StringBuffer sb = new StringBuffer();
		for(Feature service : protocol.getFeatures()) {
			if(ScriptGenerator.isGenerated(service)) {
				sb.append("	<module>" + service.getName() + "</module>\n");
			}
		}
		
		String content = 
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				"\n" + 
				"<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" + 
				"	xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\n" + 
				"	<modelVersion>4.0.0</modelVersion>\n" + 
				"\n" + 
				"	<groupId>"+ dslName +"</groupId>\n" + 
				"	<artifactId>root</artifactId>\n" + 
				"	<version>1.0-SNAPSHOT</version>\n" + 
				"	<packaging>pom</packaging>\n" + 
				"\n" + 
				"	<modules>\n" + 
				
				sb.toString() +
				
				"	</modules>\n" + 
				"\n" + 
				"</project>";
		
		try {
			if(!Files.exists(pomPath)) {
				Files.createFile(pomPath);
				Files.writeString(pomPath, content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Properties loadPropertiesFile(String filePath) {
		Properties propFile = new Properties();
        try (InputStream input = new FileInputStream(filePath)) {
        	propFile.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propFile;
	}
}
