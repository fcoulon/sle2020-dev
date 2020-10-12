package kaulua.fm.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.inria.diverse.kaulua.Feature;

public class DiagramServiceGenerator implements IServiceGenerator {
	
	public static final String SERVICE_ID = "odweb.diagram";

	@Override
	public boolean canHandle(Feature service) {
		return service.getName().equals(SERVICE_ID);
	}

	@Override
	public void generate(Feature service, String dslName, String xtextUri, String containingFolder) {
//		Dsl dsl = ((Workbench) service.eContainer()).getDsl();
//		String dslName = dsl.getName();
//		String odesignUri = dsl.getOdesign();
//		String ecoreUri = dsl.getEcore();
//		String rootEPackageName = getRootEPackageName(ecoreUri); 
//		createResource(service, dslName, containingFolder);
//		createServiceImplementation(service,dslName,rootEPackageName,odesignUri, containingFolder);
//		MavenGenerator.createCorsFilter(dslName,service.getName(), containingFolder);
//		
//		MavenHelper.addDependency(service.getName(), "diagram-renderer", "diagram-renderer", "0.0.1-SNAPSHOT", containingFolder);
//		MavenHelper.addDependency(service.getName(), ecoreUri, containingFolder);
//		MavenHelper.addDependency(service.getName(), odesignUri, containingFolder);
	}
	
	protected void createResource(Feature service, String dslName, String containingFolder) {
		String serviceName = service.getName();
		String className = "diagramResource";
		String path = "/diagram";
		String pkg = dslName.replaceAll("\\.", "/");
		Path pkgPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg);
		Path resPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg+"/"+className+".java");
		
		String template = 
				"package %s;\n" + 
				"\n" + 
				"import javax.ws.rs.POST;\n" + 
				"import javax.ws.rs.Path;\n" +
				"import javax.ws.rs.QueryParam;\n" + 
				"import javax.ws.rs.Produces;\n" + 
				"import javax.ws.rs.core.MediaType;\n" +
				"import fr.obeo.odweb.diagrams.layout.LayoutedDiagram;\n" + 
				"\n" + 
				"@Path(\"%s\")\n" + 
				"public class %s {\n" + 
				"\n" + 
				"    @POST\n" + 
				"    @Produces(MediaType.TEXT_PLAIN)\n" + 
				"    public LayoutedDiagram getDiagram(@QueryParam(\"diagramDescriptionId\") String diagramDescriptionId, String modelContent) {\n" + 
				"        DiagramRenderer service = new DiagramRenderer();\n" + 
				"        LayoutedDiagram result = service.getDiagram(diagramDescriptionId,modelContent);\n" + 
				"        return result;\n" + 
				"    }\n" + 
				"}\n" + 
				"";
		
		String content = String.format(template, pkg,path,className);
		
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
	
	protected void createServiceImplementation(Feature service, String dslName, String ePackageQualifiedName, String odesignUri, String containingFolder) {
		String serviceName = service.getName();
		String className = "DiagramRenderer";
		String pkg = dslName.replaceAll("\\.", "/");
		Path pkgPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg);
		Path resPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg+"/"+className+".java");
		
		String ePackageSimpleName = ePackageQualifiedName.substring(ePackageQualifiedName.lastIndexOf(".")+1);
		
		String template = 
				"package %s;\n" + 
				"\n" + 
				"import java.io.ByteArrayInputStream;\n" + 
				"import java.io.IOException;\n" + 
				"import java.io.InputStream;\n" + 
				"import java.nio.charset.Charset;\n" + 
				"import java.util.HashMap;\n" + 
				"import java.util.Optional;\n" + 
				"\n" + 
				"import org.eclipse.emf.common.util.URI;\n" + 
				"import org.eclipse.emf.ecore.EObject;\n" + 
				"import org.eclipse.emf.ecore.resource.Resource;\n" + 
				"import org.eclipse.emf.ecore.resource.ResourceSet;\n" + 
				"import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;\n" + 
				"import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;\n" + 
				"import org.springframework.core.io.ClassPathResource;\n" + 
				"\n" + 
				"import %s;\n" + 
				"import fr.inria.diverse.AbstractDiagramRenderer;\n" + 
				"\n" + 
				"public class %s extends AbstractDiagramRenderer {\n" + 
				"	\n" + 
				"	private static final String ODESIGN_LOCATION = \"%s\";\n" + 
				"\n" + 
				"	@Override\n" + 
				"	protected Optional<EObject> getModel(String modelContent) {\n" + 
				"		try {\n" + 
				"			%s pkg = %s.eINSTANCE; // init the registry\n" + 
				"			ResourceSet rs = new ResourceSetImpl();\n" + 
				"			rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(\"model\",new XMIResourceFactoryImpl());\n" + 
				"			String modelUri = \"model.model\";\n" + 
				"			Resource res = rs.createResource(URI.createURI(modelUri));\n" + 
				"			InputStream inputStream = new ByteArrayInputStream(modelContent.getBytes(Charset.forName(\"UTF-8\")));\n" + 
				"			res.load(inputStream, new HashMap<>());\n" + 
				"			return Optional.ofNullable(res.getContents().get(0));\n" + 
				"		}\n" + 
				"		catch(Exception e) {\n" + 
				"			e.printStackTrace();\n" + 
				"		}\n" + 
				"		return Optional.empty();\n" + 
				"	}\n" + 
				"\n" + 
				"	@Override\n" + 
				"	protected Optional<InputStream> getOdesign() {\n" + 
				"		ClassPathResource odesign = new ClassPathResource(ODESIGN_LOCATION);\n" + 
				"		try {\n" + 
				"			InputStream inputStream = odesign.getInputStream();\n" + 
				"			return Optional.of(inputStream);\n" + 
				"		} catch (IOException e) {\n" + 
				"			e.printStackTrace();\n" + 
				"		}\n" + 
				"		return Optional.empty();\n" + 
				"	}\n" + 
				"\n" + 
				"}\n" + 
				"";
		
		String content = String.format(template, pkg,ePackageQualifiedName,className,odesignUri,ePackageSimpleName,ePackageSimpleName);
		
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
	
	protected String getRootEPackageName(String ecoreUri) {
		
		URI uri = URI.createURI(ecoreUri);
		URI genmodelUri = uri.trimFileExtension().appendFileExtension("genmodel");
		
		ResourceSet rs = new ResourceSetImpl();
		Resource ecoreRes = rs.getResource(uri, true);
		Resource genmodelRes = rs.getResource(genmodelUri, true);
		
		EPackage rootPkg = (EPackage) ecoreRes.getContents().get(0);
		GenModel genmodel = (GenModel) genmodelRes.getContents().get(0);
		GenPackage rootGenPkg = genmodel.findGenPackage(rootPkg);
		
		String className = rootGenPkg.getQualifiedPackageName() +"." + rootGenPkg.getBasicPackageName();
		return className;
	}

}
