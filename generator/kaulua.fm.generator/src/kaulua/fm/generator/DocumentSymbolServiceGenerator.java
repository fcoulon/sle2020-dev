package kaulua.fm.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import fr.inria.diverse.kaulua.Feature;
import kaulua.helper.MavenHelper;

public class DocumentSymbolServiceGenerator extends AbstractLspServiceGenerator {

public static final String SERVICE_ID = "documentSymbol";
	
	@Override
	public boolean canHandle(Feature service) {
		return service.getName().equals(SERVICE_ID);
	}
	
	@Override
	public void generate(Feature service, String dslName, String xtextUri, String containingFolder) {
		
		createAppLifeCycle(service, dslName, xtextUri, "kaulua.lsp.api.IDocumentSymbol", containingFolder);
		createServiceModule(service, dslName, xtextUri, "kaulua.lsp.api.IDocumentSymbol", "DocumentSymbolJsonRPC", containingFolder);
		createResource(service, dslName, containingFolder);
		createServiceImplementation(service,dslName, containingFolder);
		updateQuarkusFiles(service, dslName, containingFolder);
		MavenGenerator.createCorsFilter(dslName,service.getName(), containingFolder);
		
		MavenHelper.addDependency(service.getName(), "document-symbol-lsp", "document-symbol-lsp", "0.0.1-SNAPSHOT", containingFolder);
		MavenHelper.addDependency(service.getName(), xtextUri, containingFolder);
	}

	@Override
	void createResource(Feature service, String dslName, String containingFolder) {
		String serviceName = service.getName();
		String className = "documentSymbolResource";
		String path = "/documentSymbol";
		String pkg = dslName.replaceAll("\\.", "/");
		Path pkgPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg);
		Path resPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg+"/"+className+".java");
		
		String template = 
				"package %s;\n" + 
				"\n" + 
				"import java.util.LinkedHashMap;\n" + 
				"import java.util.List;\n" + 
				"import java.util.Map;\n" + 
				"import java.util.concurrent.CompletableFuture;\n" + 
				"import java.util.concurrent.ExecutionException;\n" + 
				"\n" + 
				"import javax.inject.Inject;\n" + 
				"import javax.ws.rs.POST;\n" + 
				"import javax.ws.rs.Path;\n" + 
				"import javax.ws.rs.Produces;\n" + 
				"import javax.ws.rs.Consumes;\n" +
				"import javax.ws.rs.core.MediaType;\n" + 
				"\n" + 
				"import org.eclipse.lsp4j.DocumentSymbol;\n" + 
				"import org.eclipse.lsp4j.DocumentSymbolParams;\n" + 
				"import org.eclipse.lsp4j.SymbolInformation;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.json.JsonRpcMethod;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.json.MessageConstants;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.json.MessageJsonHandler;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.messages.Either;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.messages.Message;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.messages.RequestMessage;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.messages.ResponseMessage;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints;\n" + 
				"import org.eclipse.microprofile.rest.client.inject.RestClient;\n" + 
				"\n" + 
				"import com.google.gson.JsonElement;\n" + 
				"\n" + 
				"import kaulua.lsp.api.IDocumentSymbol;" +
				"\n" + 
				"@Path(\"/\")\n" + 
				"public class %s {\n" + 
				"\n" + 
				"    @Inject\n" + 
				"    @RestClient\n" + 
				"    storageResource workspace;\n" +
				"    \n" + 
				"    @POST\n" + 
				"    @Path(\"/documentsymbol\")\n" + 
				"    @Consumes(MediaType.TEXT_PLAIN)\n" +
				"    @Produces(MediaType.TEXT_PLAIN)\n" + 
				"    public String documentSymbol(String message) {\n" + 
				"		IDocumentSymbol localService = AppLifecycleBean.getService();\n" + 
				"		((DocumentSymbolJsonRPC)localService).setWorkspace(workspace);\n" + 
				"		Map<String, JsonRpcMethod> supportedMethods = new LinkedHashMap<>();\n" + 
				"		supportedMethods.putAll(ServiceEndpoints.getSupportedMethods(localService.getClass()));\n" + 
				"		MessageJsonHandler jsonHandler = new MessageJsonHandler(supportedMethods);\n" + 
				"		\n" + 
				"		//Remove header\n" + 
				"		if(message.startsWith(\"Content-Length:\")) {\n" + 
				"			int firstReturn = message.indexOf(\"\\n\");\n" + 
				"			message = message.substring(firstReturn+1);\n" + 
				"		}\n" + 
				"		\n" + 
				"		Message msg = jsonHandler.parseMessage(message);\n" + 
				"		\n" + 
				"		\n" + 
				"		if(msg instanceof RequestMessage) {\n" + 
				"			RequestMessage request = (RequestMessage) msg;\n" + 
				"			Object param = request.getParams();\n" + 
				"			if(param instanceof JsonElement) {\n" + 
				"				JsonElement json = (JsonElement) ((RequestMessage) msg).getParams();\n" + 
				"				param = jsonHandler.getGson().fromJson(json, DocumentSymbolParams.class);\n" + 
				"			}\n" + 
				"			CompletableFuture<List<Either<SymbolInformation, DocumentSymbol>>> futurResult = localService.documentSymbol((DocumentSymbolParams) param);\n" + 
				"			try {\n" + 
				"				List<Either<SymbolInformation, DocumentSymbol>> result = futurResult.get();\n" + 
				"				\n" + 
				"				ResponseMessage responseMessage = new ResponseMessage();\n" + 
				"				responseMessage.setRawId(request.getRawId());\n" + 
				"				responseMessage.setJsonrpc(MessageConstants.JSONRPC_VERSION);\n" + 
				"				responseMessage.setResult(result);\n" + 
				"				\n" + 
				"				return jsonHandler.serialize(responseMessage);\n" + 
				"				\n" + 
				"			} catch (InterruptedException e) {\n" + 
				"				e.printStackTrace();\n" + 
				"			} catch (ExecutionException e) {\n" + 
				"				e.printStackTrace();\n" + 
				"			}\n" + 
				"		}\n" + 
				"		\n" + 
				"		return \"\";" +
				"    }\n" + 
				"}\n" + 
				"";
		
		String content = String.format(template, pkg,className);
		
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

	@Override
	void createServiceImplementation(Feature service, String dslName, String containingFolder) {
		String serviceName = service.getName();
		String className = "DocumentSymbolJsonRPC";
		String pkg = dslName.replaceAll("\\.", "/");
		Path pkgPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg);
		Path resPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg+"/"+className+".java");
		String template = 
				"package %s;\n" + 
				"\n" + 
				"import org.eclipse.lsp4j.TextDocumentItem;\n" + 
				"\n" + 
				"import com.google.gson.GsonBuilder;\n" + 
				"\n" + 
				"import kaulua.documentsymbol.AbstractDocumentSymbolJsonRPC;\n" + 
				"\n" + 
				"public class %s extends AbstractDocumentSymbolJsonRPC {\n" + 
				"	\n" + 
				"	storageResource workspace;\n" + 
				"	\n" + 
				"	public void setWorkspace(storageResource workspace) {\n" + 
				"		this.workspace = workspace;\n" + 
				"	}\n" + 
				"\n" + 
				"	@Override\n" + 
				"	public String requestDocument(String uri) {\n" + 
				"		String content = workspace.document(uri);\n" + 
				"		return content;\n" + 
				"	}\n" + 
				"\n" + 
				"}\n" + 
				"";
		
		String content = String.format(template, pkg, className);
		
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

}
