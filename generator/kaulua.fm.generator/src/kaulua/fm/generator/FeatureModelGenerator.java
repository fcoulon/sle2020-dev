package kaulua.fm.generator;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.Bundle;
import org.prop4j.Implies;
import org.prop4j.Literal;

import de.ovgu.featureide.fm.core.ExtensionManager.NoSuchExtensionException;
import de.ovgu.featureide.fm.core.base.IConstraint;
import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.IFeatureModelFactory;
import de.ovgu.featureide.fm.core.base.IFeatureModelStructure;
import de.ovgu.featureide.fm.core.base.impl.DefaultFeatureModelFactory;
import de.ovgu.featureide.fm.core.base.impl.FMFactoryManager;
import de.ovgu.featureide.fm.core.io.manager.SimpleFileHandler;
import de.ovgu.featureide.fm.core.io.xml.XmlFeatureModelFormat;
import fr.inria.diverse.kaulua.Dependency;
import fr.inria.diverse.kaulua.Feature;
import fr.inria.diverse.kaulua.Protocol;
import kaulua.fm.generator.graph.FeatureModelBuilder;
import kaulua.helper.MavenHelper;

public class FeatureModelGenerator {
	
	static final String FM_SUFFIX = ".fm";
	static final String FM_SERVICE = "feature-model";
	
	 public static IFeatureModel loadFromXml(String xml) {
    	XmlFeatureModelFormat format = new XmlFeatureModelFormat();
		try {
			IFeatureModel fm = FMFactoryManager.getInstance().getFactory(format).create();
			if (format.read(fm, xml).containsError()) {
				//fail();
			}
			else {
				return fm;
			}
		} catch (NoSuchExtensionException e) {
			e.printStackTrace();
		}
		return null;

    }
	
	public static void generate(File propertiesFile) {
		
		Properties dsl = MavenGenerator.loadPropertiesFile(propertiesFile.getLocation().toString());
		
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
			generate(protocol, dslName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		generateImageBuildScript(dslName);
	}

	public static void generate(Protocol protocol, String dslName) {
		
		IFeatureModel fm = FeatureModelBuilder.build(protocol, dslName);
//		IFeatureModel fm = createFeatureModel(wb);
//		createNewProject(wb.getDsl().getName()+FM_SUFFIX, fm);
		createNewServiceProject(dslName, fm);
		
		System.out.println(fm);
	}
	
	public static IFeatureModel createFeatureModel (Protocol protocol, String dslName) {
		IFeatureModelFactory factory = DefaultFeatureModelFactory.getInstance();
		IFeatureModel fm = factory.create();
		IFeatureModelStructure structure = fm.getStructure();
		
		IFeature rootFeat = factory.createFeature(fm, "IDE_for_"+ dslName);
		fm.addFeature(rootFeat);
		structure.setRoot(rootFeat.getStructure());

		for(Feature service : protocol.getFeatures()) {
			IFeature feat = factory.createFeature(fm, service.getName());
			fm.addFeature(feat);
			rootFeat.getStructure().addChild(feat.getStructure());
			for(Implies impl : getRequirement(service)) {
				IConstraint constr = factory.createConstraint(fm, impl);
				fm.addConstraint(constr);
			}
		}
		
		return fm;
	}
	
	protected static List<Implies> getRequirement(Feature service) {
		List<Implies> res = new LinkedList<>();
		List<Dependency> connections = AbstractLspServiceGenerator.getDependencies(service);
		for(Dependency conn : connections) {
			String required = ((Feature) conn.getCallee().eContainer()).getName();
			Literal srv = new Literal(service.getName());
			Literal req = new Literal(required);
			Implies impl = new Implies(srv,req);
			res.add(impl);
			
//			else if(link instanceof Listen) {
//				Listen listen = (Listen) link;
//				String requiring = ((Service) listen.getNotifier().eContainer()).getName();
//				Literal srv = new Literal(requiring);
//				Literal req = new Literal(service.getName());
//				Implies impl = new Implies(srv,req);
//				res.add(impl);
//			}
		}
		return res;
	}
	
//	public static void createNewProject(String projectName, IFeatureModel featureModel) {
//		try {
//			// Create Eclipse project
//			IProgressMonitor progressMonitor = new NullProgressMonitor();
//			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//			IProject project = root.getProject(projectName);
//			project.create(progressMonitor);
//			project.open(new NullProgressMonitor());
//			
//			// Add FeatureIDE config
//			String sourcePath = "features";
//			String configPath = "configs";
//			String compositionToolId = "de.ovgu.featureide.composer.ahead";
//			String buildPath = "src";
//			DefaultNewFeatureProjectWizardExtension wizardExtension = new DefaultNewFeatureProjectWizardExtension();
//			wizardExtension.enhanceProject(project, compositionToolId, sourcePath, configPath, buildPath, true, true);
//			
//			// Create Feature Model
//			final Path modelPath = Paths.get(project.getFile("model.xml").getLocationURI());
//			SimpleFileHandler.save(modelPath, featureModel,  new XmlFeatureModelFormat());
//			
//		} catch (CoreException e) {
//			e.printStackTrace();
//		}
//	}
	
	public static void createNewServiceProject(String dslName, IFeatureModel featureModel) {
		String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		Job createJob = MavenServiceGenerator.createMavenJob(dslName, FM_SERVICE, wsPath);
		createJob.schedule();
		try {
			// Create project
			createJob.join();
			MavenHelper.addDependency(FM_SERVICE,"de.ovgu.featureide","de.ovgu.featureide.core","3.6.1", wsPath, "system", "${basedir}/lib/de.ovgu.featureide.core_3.6.1.201910312107.jar");
			MavenHelper.addDependency(FM_SERVICE,"de.ovgu.featureide","de.ovgu.featureide.fm.core","3.6.1", wsPath, "system", "${basedir}/lib/de.ovgu.featureide.fm.core_3.6.1.201910312107.jar");
			MavenHelper.addDependency(FM_SERVICE,"org.json","json","20180130", wsPath);
			MavenHelper.addDependency(FM_SERVICE, "org.ow2.sat4j", "org.ow2.sat4j.core", "2.3.4", wsPath);
			
			//Copy FeatureIde dependencies
			System.out.println("---DEBUG---");
			Path libDir  = Paths.get(wsPath+"/"+FM_SERVICE+"/lib/");
			Files.createDirectories(libDir);
			Bundle bundle = Platform.getBundle("kaulua.fm.generator");
			System.out.println(bundle);
			URL entry = Platform.getBundle("kaulua.fm.generator").getEntry("lib/de.ovgu.featureide.core_3.6.1.201910312107.jar");
			System.out.println(entry);
			URL srcCoreUrl = FileLocator.toFileURL(Platform.getBundle("kaulua.fm.generator").getEntry("lib/de.ovgu.featureide.core_3.6.1.201910312107.jar"));
			System.out.println(srcCoreUrl);
			URL srcFmCoreUrl = FileLocator.toFileURL(Platform.getBundle("kaulua.fm.generator").getEntry("lib/de.ovgu.featureide.fm.core_3.6.1.201910312107.jar"));
			System.out.println(srcFmCoreUrl);
			Path srcCore  = Paths.get(srcCoreUrl.toString().substring(5)); // remove file:
			System.out.println(srcCore);
			Path srcFmCore  = Paths.get(srcFmCoreUrl.toString().substring(5)); // remove file:
			System.out.println(srcFmCore);
			Path dstCore  = Paths.get(wsPath+"/"+FM_SERVICE+"/lib/de.ovgu.featureide.core_3.6.1.201910312107.jar");
			System.out.println(dstCore);
			Path dstFmCore  = Paths.get(wsPath+"/"+FM_SERVICE+"/lib/de.ovgu.featureide.fm.core_3.6.1.201910312107.jar");
			System.out.println(dstFmCore);
			Files.copy(srcCore, dstCore);
			Files.copy(srcFmCore, dstFmCore);
			
			// Create Feature Model
			Path modelDir  = Paths.get(wsPath+"/"+FM_SERVICE+"/src/main/resources/model/");
			Path modelPath = Paths.get(wsPath+"/"+FM_SERVICE+"/src/main/resources/model/"+"model.xml");
			Files.createDirectories(modelDir);
			Files.createFile(modelPath);
			SimpleFileHandler.save(modelPath, featureModel,  new XmlFeatureModelFormat());
			
			// Add service implementation
			createResource(dslName,"FeatureModelResource","/");
			MavenGenerator.createCorsFilter(dslName,FM_SERVICE, wsPath);
			createJsonHelper(dslName);

			MavenHelper.importProject(FM_SERVICE, wsPath);
			
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}
	
	protected static void createResource(String dslName, String className, String path) {
		String pkg = dslName.replaceAll("\\.", "/");
		String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		Path pkgPath = Paths.get(wsPath+"/"+FM_SERVICE+"/src/main/java/"+pkg);
		Path resPath = Paths.get(wsPath+"/"+FM_SERVICE+"/src/main/java/"+pkg+"/"+className+".java");
		
		String content = 
				"package "+dslName+";\n" + 
				"\n" + 
				"import java.io.BufferedReader;\n" + 
				"import java.io.IOException;\n" + 
				"import java.io.InputStream;\n" + 
				"import java.io.InputStreamReader;\n" + 
				"import java.util.Optional;\n" + 
				"\n" + 
				"import javax.ws.rs.GET;\n" + 
				"import javax.ws.rs.POST;\n" + 
				"import javax.ws.rs.Path;\n" + 
				"import javax.ws.rs.Produces;\n" + 
				"import javax.ws.rs.core.MediaType;\n" + 
				"\n" + 
				"import de.ovgu.featureide.fm.core.analysis.cnf.formula.FeatureModelFormula;\n" + 
				"import de.ovgu.featureide.fm.core.base.IFeatureModel;\n" + 
				"import de.ovgu.featureide.fm.core.base.impl.DefaultFeatureModelFactory;\n" + 
				"import de.ovgu.featureide.fm.core.base.impl.FeatureModel;\n" + 
				"import de.ovgu.featureide.fm.core.configuration.Configuration;\n" + 
				"import de.ovgu.featureide.fm.core.configuration.ConfigurationPropagator;\n" + 
				"import de.ovgu.featureide.fm.core.configuration.DefaultFormat;\n" + 
				"import de.ovgu.featureide.fm.core.io.xml.XmlFeatureModelFormat;\n" + 
				"\n" + 
				"@Path(\""+path+"\")\n" + 
				"public class "+className+" {\n" + 
				"\n" + 
				"    @GET\n" + 
				"    @Produces(MediaType.TEXT_PLAIN)\n" + 
				"    @Path(\"model\")\n" + 
				"    public String getFeatureModel() {\n" + 
				"    	\n" + 
				"    	Optional<IFeatureModel> fm = loadFm();\n" + 
				"    	\n" + 
				"    	if(fm.isPresent()) {\n" + 
				"    		return JsonHelper.convert(fm.get()).toString();\n" + 
				"    	}\n" + 
				"    	else {\n" + 
				"    		return \"\";\n" + 
				"    	}\n" + 
				"    }\n" + 
				"    \n" + 
				"    @POST\n" + 
				"    @Produces(MediaType.TEXT_PLAIN)\n" + 
				"    @Path(\"configuration\")\n" + 
				"    public String validate(String configuration) {\n" + 
				"    	\n" + 
				"    	Optional<IFeatureModel> fm = loadFm();\n" + 
				"    	if(fm.isPresent()) {\n" + 
				"    		FeatureModelFormula formula = new FeatureModelFormula(fm.get());\n" + 
				"			Configuration config = new Configuration(formula);\n" + 
				"			DefaultFormat r = new DefaultFormat();\n" + 
				"    		r.read(config, configuration);\n" + 
				"    		ConfigurationPropagator confPropagator = new ConfigurationPropagator(formula, config);\n" + 
				"    		return String.valueOf(confPropagator.isValid().execute(null));\n" + 
				"    	}\n" + 
				"    	return \"false\";\n" + 
				"    }\n" + 
				"    \n" + 
				"    protected Optional<IFeatureModel> loadFm() {\n" + 
				"    	\n" + 
				"    	InputStream in = getClass().getResourceAsStream(\"/model/model.xml\"); \n" + 
				"    	BufferedReader reader = new BufferedReader(new InputStreamReader(in));\n" + 
				"    	StringBuilder builder = new StringBuilder();\n" + 
				"    	String line;\n" + 
				"        try {\n" + 
				"			while ((line = reader.readLine()) != null) {\n" + 
				"				builder.append(line);\n" + 
				"				builder.append(\"\\n\");\n" + 
				"			}\n" + 
				"		} catch (IOException e1) {\n" + 
				"			e1.printStackTrace();\n" + 
				"			return Optional.empty();\n" + 
				"		}\n" + 
				"        \n" + 
				"        String xmlContent = builder.toString();\n" + 
				"        return Optional.ofNullable(loadFromXml(xmlContent));\n" + 
				"    	\n" + 
				"    }\n" + 
				"    \n" + 
				"    protected IFeatureModel loadFromXml(String xml) {\n" + 
				"    	XmlFeatureModelFormat format = new XmlFeatureModelFormat();\n" + 
				"		try {\n" + 
				"			\n" + 
				"			DefaultFeatureModelFactory fmFactory = DefaultFeatureModelFactory.getInstance();\n" + 
				"			FeatureModel fm = fmFactory.create();\n" + 
				"			if (format.read(fm, xml).containsError()) {\n" + 
				"				//fail();\n" + 
				"			}\n" + 
				"			else {\n" + 
				"				return fm;\n" + 
				"			}\n" + 
				"		} catch (Exception e) {\n" + 
				"			e.printStackTrace();\n" + 
				"		}\n" + 
				"		return null;\n" + 
				"\n" + 
				"    }\n" + 
				"    \n" + 
				"}";
		
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
	
	protected static void createJsonHelper(String dslName) {
		String pkg = dslName.replaceAll("\\.", "/");
		String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		Path helperlPath = Paths.get(wsPath+"/"+FM_SERVICE+"/src/main/java/"+pkg+"/JsonHelper.java");
		
		String content = 
				"package "+dslName+";\n" + 
				"\n" + 
				"import de.ovgu.featureide.fm.core.base.IFeatureModel;\n" + 
				"import de.ovgu.featureide.fm.core.base.IFeatureStructure;\n" + 
				"\n" + 
				"import java.util.ArrayList;\n" + 
				"import java.util.List;\n" + 
				"\n" + 
				"import org.json.JSONObject;\n" + 
				"\n" + 
				"public class JsonHelper {\n" + 
				"	\n" + 
				"	public static JSONObject convert(IFeatureModel fm) {\n" + 
				"		JSONObject node = convert(fm.getStructure().getRoot());\n" + 
				"		JSONObject root = new JSONObject();\n" + 
				"		root.put(\"tree\", node);\n" + 
				"		\n" + 
				"		return root;\n" +
				"	}\n" + 
				"	\n" + 
				"	public static JSONObject convert(IFeatureStructure feat) {\n" + 
				"		\n" + 
				"		List<JSONObject> children = new ArrayList<>();\n" + 
				"		for(IFeatureStructure child : feat.getChildren()) {\n" + 
				"			JSONObject childNode = convert(child);\n" + 
				"			children.add(childNode);\n" + 
				"		}\n" + 
				"		\n" + 
				"		JSONObject node = new JSONObject();\n" + 
				"		node.put(\"name\", feat.getFeature().getName());\n" + 
				"		node.put(\"children\", children);\n" + 
				"		\n" + 
				"		return node;\n" + 
				"	}\n" + 
				"	\n" + 
				"}";
		
		try {
			Files.createFile(helperlPath);
			Files.writeString(helperlPath, content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void generateImageBuildScript(String dslName) {
		
		String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		String containingFolder = wsPath + "/feature-model";
		
		StringBuilder builder = new StringBuilder();
		builder.append("#!/bin/bash\n");
		builder.append("\n");
		
		builder.append("mvn package\n");
		builder.append("docker build -f src/main/docker/Dockerfile.jvm -t "+ dslName +"/feature-model .\n");
		builder.append("\n");
		
		String content = builder.toString();
		String outputFile = containingFolder + "/build-images.sh";
		try {
			Files.write(Paths.get(outputFile), content.getBytes());
			Files.setPosixFilePermissions(Paths.get(outputFile), Set.of(PosixFilePermission.OWNER_READ, PosixFilePermission.OWNER_WRITE, PosixFilePermission.OWNER_EXECUTE));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
