package nabla.ir.generator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.resource.ExternalContentSupport;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

import fr.cea.nabla.generator.GeneratorUtils;
import fr.cea.nabla.generator.ir.Nabla2Ir;
import fr.cea.nabla.ir.generator.java.Ir2Java;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.transformers.IrTransformationStep;
import fr.cea.nabla.ir.transformers.TagPersistentVariables;
import fr.cea.nabla.nabla.NablaModule;

public class JavaGenerator {
	
	static final String IrExtension = "nablair";

	public static void main(String[] args) {
		
		Injector injector = new fr.cea.nabla.NablaStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		String nablaFile = "input/Glace2d_1.nabla";
		Optional<String> content = openFile(nablaFile);
		
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("nablair", new XMIResourceFactoryImpl());
		rs.getResource(URI.createURI("nablalib/mathfunctions.nabla"), true);
		XtextResource res = loadModel(rs, URI.createURI(nablaFile), content.get());
		
//		res.getAllContents().forEachRemaining(elem -> {
//			if(elem instanceof FunctionCall) {
//				FunctionCall call = (FunctionCall) elem;
//				System.out.println(EcoreUtil.getURI(elem));
//				System.out.println("\t"+EcoreUtil.getURI(call.getFunction()));
//				System.out.println("\t"+call.getFunction().getArgGroups());
//				System.out.println("\t"+call.getArgs());
//				System.out.println();
//			}
//		});
		
		Nabla2Ir converter = injector.getInstance(Nabla2Ir.class);
		
		NablaModule module = (NablaModule) res.getContents().get(0);
		IrModule irModule = converter.toIrModule(module);
		
		InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
		callJavaGenerator(fsa,injector,module,irModule);
		
		System.out.println(fsa.getAllFiles());
	}
	
	public static String callJavaGenerator(InMemoryFileSystemAccess fsa, Injector injector, NablaModule module, IrModule irModuleRef) {
		
		
		Ir2Java ir2Java = injector.getInstance(Ir2Java.class);;
		Resource input = module.eResource();
		Properties properties = new Properties();
		
		ir2Java.setGenerationDir("javaGenerationDir");
		TagPersistentVariables tagVariableStep = new TagPersistentVariables(properties);
		tagVariableStep.transform(irModuleRef);
		
		String fileNameWithoutExtension = module.getName().toLowerCase() + '/' + module.getName();
		String languageFileNameWithoutExtensions = ir2Java.getGenerationDir() + '/' + fileNameWithoutExtension;
				
		IrModule irModule = EcoreUtil.copy(irModuleRef);
		System.out.println("Starting generation chain for " + getShortName(ir2Java) + " (." + ir2Java.getFileExtension() + " file)");
		System.out.println("\tBuilding Nabla Intermediate Representation");

		// application des transformation de l'IR (dépendant du langage
		boolean transformOK = true;
		Iterator<? extends IrTransformationStep> stepIt = ir2Java.getTransformationSteps().iterator();
		while (stepIt.hasNext() && transformOK)
		{
			IrTransformationStep step = stepIt.next();
			System.out.println("\tIR -> IR: " + step.getDescription());
			createAndSaveResource(fsa, input.getResourceSet(), addExtensions(languageFileNameWithoutExtensions,Arrays.asList("before" + getShortName(step), ir2Java.getFileExtension(), IrExtension)), irModule);		
			transformOK = step.transform(irModule);
		}
		createAndSaveResource(fsa, input.getResourceSet(), addExtensions(languageFileNameWithoutExtensions,Arrays.asList(ir2Java.getFileExtension(), IrExtension)), irModule);
	
		// génération du fichier source
		if (transformOK)
		{
			System.out.println("\tGenerating ." + ir2Java.getFileExtension() + " file");
			CharSequence fileContent = ir2Java.getFileContent(irModule);
			String fileName = addExtensions(languageFileNameWithoutExtensions,Arrays.asList(ir2Java.getFileExtension()));
			fsa.generateFile(fileName, fileContent);
			return fileName;
		}	
		
		return null;
	}

	private static String getShortName(Object o) {
		return o.getClass().getName().substring(o.getClass().getPackage().getName().length() + 1);
	}

	private static String addExtensions(String fileNameWithoutExtension, List<String> extensions) {
		return fileNameWithoutExtension + '.' + String.join(".", extensions);
	}
	
	/** Crée et sauve la resource au même endroit que le paramètre baseResource en changeant l'extension par newExtension */
	private static void createAndSaveResource(IFileSystemAccess2 fsa, ResourceSet rSet, String fileName, EObject content)
	{
		GeneratorUtils utils = new GeneratorUtils();
		
		URI uri = fsa.getURI(fileName);
		Resource resource = rSet.createResource(uri);
		resource.getContents().add(content);
//		try {
//			resource.save(utils.getXmlSaveOptions());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	public static XtextResource loadModel(ResourceSet rs, URI uri, final String content) {

		ExternalContentSupport externalContentSupport = new ExternalContentSupport();
		externalContentSupport.configureResourceSet(rs, new IExternalContentProvider() {
			public String getContent(URI uri) {
				return content;
			}

			public boolean hasContent(URI uri) {
				return true;
			}

			public IExternalContentProvider getActualContentProvider() {
				return this;
			}
		});

		return (XtextResource) rs.getResource(uri, true);
	}
	
	public static Optional<String> openFile(String fileName) {
		
		String prefix = "inmemory:/";
		String realFileName = fileName.replace(prefix, "");
		
		try {
			byte[] bytes = Files.readAllBytes(Paths.get(realFileName));
			String content = new String(bytes, StandardCharsets.UTF_8);
			return Optional.of(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}
}
