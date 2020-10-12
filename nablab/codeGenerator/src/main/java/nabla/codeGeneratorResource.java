package nabla;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.resource.ExternalContentSupport;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Inject;
import com.google.inject.Injector;

import fr.cea.nabla.generator.ir.Nabla2Ir;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.nabla.NablaModule;
import nabla.ir.generator.JavaGenerator;

@Path("/codeGenerator")
public class codeGeneratorResource {
	
	@Inject
    @RestClient
    storageResource storage;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String generate(@QueryParam("name") String name) {
    	
    	Injector injector = new fr.cea.nabla.NablaStandaloneSetup().createInjectorAndDoEMFRegistration();

    	String content = storage.document(name);
    	ResourceSet rs = new ResourceSetImpl();
    	rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("nablair", new XMIResourceFactoryImpl());
    	Resource lib = rs.getResource(URI.createURI("nablalib/mathfunctions.nabla"), true);
    	
    	System.out.println("DEBUG content:");
    	System.out.println(content);
    	
    	System.out.println("DEBUG lib:");
    	System.out.println(lib.getContents());
    	
    	XtextResource res = loadModel(rs, URI.createURI(name), content);
    	NablaModule module = (NablaModule) res.getContents().get(0);
    	
    	System.out.println("DEBUG imports:");
    	System.out.println(module.getImports());
    	
    	InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
        Nabla2Ir converter = injector.getInstance(Nabla2Ir.class);
        IrModule irModule = converter.toIrModule(module);
    	String generatedFileName = JavaGenerator.callJavaGenerator(fsa, injector, module, irModule);
    	
        return fsa.getTextFiles().get(IFileSystemAccess.DEFAULT_OUTPUT+generatedFileName).toString();
    }
    
	private static XtextResource loadModel(ResourceSet rs, URI uri, final String content) {
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
		 
		return (XtextResource) rs.getResource(uri,true);
	}

}
