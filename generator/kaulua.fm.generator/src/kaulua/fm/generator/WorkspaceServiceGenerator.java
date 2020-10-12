package kaulua.fm.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import fr.inria.diverse.kaulua.Dependency;
import fr.inria.diverse.kaulua.Feature;
import kaulua.helper.MavenHelper;

public class WorkspaceServiceGenerator extends AbstractLspServiceGenerator {
	
	public static final String SERVICE_ID = "workspace";

	@Override
	public boolean canHandle(Feature service) {
		return service.getName().equals(SERVICE_ID);
	}
	
	@Override
	public void generate(Feature service, String dslName, String xtextUri, String containingFolder) {

		createAppLifeCycle(service, dslName, xtextUri, "kaulua.lsp.api.IWorkspace", containingFolder);
		createServiceModule(service, dslName, xtextUri, "kaulua.lsp.api.IWorkspace", "WorkspaceJsonRPC", containingFolder);
		createResource(service, dslName, containingFolder);
		createServiceImplementation(service,dslName, containingFolder);
		createRouterResource(service,dslName,containingFolder);
		updateRouterProperties(service,dslName,containingFolder);
		updateQuarkusFiles(service, dslName, containingFolder);
		MavenGenerator.createCorsFilter(dslName,service.getName(), containingFolder);
		
		MavenHelper.addDependency(service.getName(), "workspace-lsp", "workspace-lsp", "0.0.1-SNAPSHOT", containingFolder);
		MavenHelper.addDependency(service.getName(), xtextUri, containingFolder);
	}

	@Override
	void createResource(Feature service, String dslName, String containingFolder) {
		String serviceName = service.getName();
		String className = "workspaceResource";
		String path = "/workspace";
		String pkg = dslName.replaceAll("\\.", "/");
		Path pkgPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg);
		Path resPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg+"/"+className+".java");
		
		String template = 
				"package %s;\n" + 
				"\n" + 
				"import java.io.ByteArrayOutputStream;\n" + 
				"import java.io.IOException;\n" + 
				"import java.io.ObjectOutputStream;\n" + 
				"import java.lang.reflect.Type;\n" + 
				"import java.util.ArrayList;\n" + 
				"import java.util.Base64;\n" + 
				"import java.util.LinkedHashMap;\n" + 
				"import java.util.List;\n" + 
				"import java.util.Map;\n" + 
				"import java.util.concurrent.CompletableFuture;\n" + 
				"import java.util.concurrent.ExecutionException;\n" + 
				"\n" + 
				"import javax.inject.Inject;\n" + 
				"import javax.ws.rs.GET;\n" + 
				"import javax.ws.rs.POST;\n" + 
				"import javax.ws.rs.Path;\n" + 
				"import javax.ws.rs.Produces;\n" + 
				"import javax.ws.rs.core.MediaType;\n" + 
				"\n" + 
				"import org.eclipse.lsp4j.DidChangeTextDocumentParams;\n" + 
				"import org.eclipse.lsp4j.DidCloseTextDocumentParams;\n" + 
				"import org.eclipse.lsp4j.DidOpenTextDocumentParams;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.json.JsonRpcMethod;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.json.MessageJsonHandler;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.messages.Message;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.messages.NotificationMessage;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints;\n" + 
				"import org.eclipse.microprofile.rest.client.inject.RestClient;\n" + 
				"import org.eclipse.xtext.resource.IResourceDescription;\n" + 
				"import org.eclipse.xtext.resource.IResourceDescriptions;\n" + 
				"import org.eclipse.xtext.resource.persistence.SerializableResourceDescription;\n" + 
				"\n" + 
				"import com.google.common.collect.Lists;\n" + 
				"import com.google.gson.GsonBuilder;\n" + 
				"import com.google.gson.JsonElement;\n" + 
				"import com.google.gson.reflect.TypeToken;\n" + 
				"\n" + 
				"import kaulua.lsp.api.IWorkspace;" +
				"\n" + 
				"@Path(\"/\")\n" + 
				"public class %s {\n" + 
				"\n" + 
				"    @Inject\n" + 
				"    @RestClient\n" + 
				"    storageResource storage;\n" +
				"    \n" + 
				"    @Inject\n" + 
				"    @RestClient\n" + 
				"    routerResource router;\n" +
				"    \n" + 
				"    @GET\n" + 
				"    @Path(\"/index\")\n" + 
				"    @Produces(MediaType.TEXT_PLAIN)\n" + 
				"    public String index() {\n" + 
				"		IWorkspace localService = AppLifecycleBean.getService();\n" + 
				"		((WorkspaceJsonRPC)localService).setRouter(router);\n" + 
				"		((WorkspaceJsonRPC)localService).setStorage(storage);\n" + 
				"		Map<String, JsonRpcMethod> supportedMethods = new LinkedHashMap<>();\n" + 
				"		supportedMethods.putAll(ServiceEndpoints.getSupportedMethods(localService.getClass()));\n" + 
				"		MessageJsonHandler jsonHandler = new MessageJsonHandler(supportedMethods);\n" + 
				"\n" + 
				"		CompletableFuture<IResourceDescriptions> futurResult = localService.getIndex();\n" + 
				"		//Serialize the index\n" + 
				"		try {\n" + 
				"			IResourceDescriptions result = futurResult.get();\n" + 
				"			ArrayList<IResourceDescription> index = Lists.newArrayList(result.getAllResourceDescriptions());\n" + 
				"			List<String> descriptions = new ArrayList<>();\n" + 
				"			for (IResourceDescription iResourceDescription : index) {\n" + 
				"				SerializableResourceDescription s = (SerializableResourceDescription)iResourceDescription;\n" + 
				"				\n" + 
				"				try {\n" + 
				"					ByteArrayOutputStream stream = new ByteArrayOutputStream();\n" + 
				"					ObjectOutputStream out = new ObjectOutputStream(stream);\n" + 
				"					out.writeObject(s);\n" + 
				"					String encoded = Base64.getEncoder().encodeToString(stream.toByteArray());\n" + 
				"					descriptions.add(encoded);\n" + 
				"				} catch (IOException e) {\n" + 
				"					e.printStackTrace();\n" + 
				"				}\n" + 
				"			}\n" + 
				"			\n" + 
				"			Type typeOfSrc = new TypeToken<List<String>>(){}.getType();\n" + 
				"			String response = new GsonBuilder().disableHtmlEscaping().create().toJson(descriptions, typeOfSrc);\n" + 
				"//			LOGGER.debug(response);\n" + 
				"			return response;\n" + 
				"			\n" + 
				"		} catch (InterruptedException e) {\n" + 
				"			e.printStackTrace();\n" + 
				"		} catch (ExecutionException e) {\n" + 
				"			e.printStackTrace();\n" + 
				"		}\n" + 
				"		\n" + 
				"		return \"\";" +
				"    }\n" + 
				"	\n" + 
				"	@POST\n" + 
				"	@Path(\"/didChange\")\n" + 
				"	@Produces(MediaType.TEXT_PLAIN)\n" + 
				"	public void didChange(String message) {\n" + 
				"		\n" + 
				"		\n" + 
				"		IWorkspace localService = AppLifecycleBean.getService();\n" + 
				"		((WorkspaceJsonRPC)localService).setRouter(router);\n" + 
				"		((WorkspaceJsonRPC)localService).setStorage(storage);\n" + 
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
				"		if(msg instanceof NotificationMessage) {\n" + 
				"			NotificationMessage notif = (NotificationMessage) msg; \n" + 
				"			Object param = notif.getParams();\n" + 
				"			if(param instanceof JsonElement) {\n" + 
				"				JsonElement json = (JsonElement) ((NotificationMessage) msg).getParams();\n" + 
				"				param = jsonHandler.getGson().fromJson(json, DidChangeTextDocumentParams.class);\n" + 
				"			}\n" + 
				"			localService.didChange((DidChangeTextDocumentParams) param);\n" + 
				"		}\n" + 
				"	}\n" + 
				"	\n" + 
				"	@POST\n" + 
				"	@Path(\"/didOpen\")\n" + 
				"	@Produces(MediaType.TEXT_PLAIN)\n" + 
				"	public void didOpen(String message) {\n" + 
				"		\n" + 
				"		IWorkspace localService = AppLifecycleBean.getService();\n" + 
				"		((WorkspaceJsonRPC)localService).setRouter(router);\n" + 
				"		((WorkspaceJsonRPC)localService).setStorage(storage);\n" + 
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
				"		if(msg instanceof NotificationMessage) {\n" + 
				"			NotificationMessage notif = (NotificationMessage) msg; \n" + 
				"			Object param = notif.getParams();\n" + 
				"			if(param instanceof JsonElement) {\n" + 
				"				JsonElement json = (JsonElement) ((NotificationMessage) msg).getParams();\n" + 
				"				param = jsonHandler.getGson().fromJson(json, DidOpenTextDocumentParams.class);\n" + 
				"			}\n" + 
				"			localService.didOpen((DidOpenTextDocumentParams) param);\n" + 
				"		}\n" + 
				"	}\n" + 
				"	\n" + 
				"	@POST\n" + 
				"	@Path(\"/didClose\")\n" + 
				"	@Produces(MediaType.TEXT_PLAIN)\n" + 
				"	public void didClose(String message) {\n" + 
				"		\n" + 
				"		IWorkspace localService = AppLifecycleBean.getService();\n" + 
				"		((WorkspaceJsonRPC)localService).setRouter(router);\n" + 
				"		((WorkspaceJsonRPC)localService).setStorage(storage);\n" + 
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
				"		if(msg instanceof NotificationMessage) {\n" + 
				"			NotificationMessage notif = (NotificationMessage) msg; \n" + 
				"			Object param = notif.getParams();\n" + 
				"			if(param instanceof JsonElement) {\n" + 
				"				JsonElement json = (JsonElement) ((NotificationMessage) msg).getParams();\n" + 
				"				param = jsonHandler.getGson().fromJson(json, DidCloseTextDocumentParams.class);\n" + 
				"			}\n" + 
				"			localService.didClose((DidCloseTextDocumentParams) param);\n" + 
				"		}\n" + 
				"	}" +
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
		String className = "WorkspaceJsonRPC";
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
				"import kaulua.workspace.AbstractWorkspaceJsonRPC;\n" + 
				"\n" + 
				"public class %s extends AbstractWorkspaceJsonRPC {\n" + 
				"	\n" + 
				"	storageResource storage;\n" + 
				"	\n" + 
				"	routerResource router;\n" + 
				"	\n" + 
				"	public void setStorage(storageResource storage) {\n" + 
				"		this.storage = storage;\n" + 
				"	}\n" + 
				"\n" + 
				"	public void setRouter(routerResource router) {\n" + 
				"		this.router = router;\n" + 
				"	}\n" +
				"\n" + 
				"	@Override\n" + 
				"	public void postIssues(String message) {\n" + 
				"		router.diagnostics(message);\n" + 
				"	}\n" + 
				"\n" + 
				"	@Override\n" + 
				"	public void updateFile(String fileUri, String newContent) {\n" + 
				"		storage.update(fileUri,newContent);\n" + 
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
	
	@Override
	protected void createServiceModule(Feature service, String dslName, String xtextUri, String serviceInterface, String serviceClass,
			String containingFolder) {
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
				"import java.util.concurrent.ExecutorService;\n" +
				"import kaulua.server.DefaultProjectDescriptionFactory;\n" + 
				"import kaulua.server.ExecutorServiceProvider;\n" + 
				"import kaulua.server.IProjectDescriptionFactory;\n" + 
				"import kaulua.server.IWorkspaceConfigFactory;\n" + 
				"import kaulua.server.ProjectWorkspaceConfigFactory;\n" +
				"\n" +
				"class ServiceModule extends AbstractModule {\n" + 
				"	\n" + 
				"	@Override\n" + 
				"	public void configure() {\n" + 
				"		binder().bind(%s.class).to(%s.class);\n" + 
				"		binder().bind(ExecutorService.class).toProvider(ExecutorServiceProvider.class);\n" + 
				"		binder().bind(IWorkspaceConfigFactory.class).to(ProjectWorkspaceConfigFactory.class);\n" + 
				"		binder().bind(IProjectDescriptionFactory.class).to(DefaultProjectDescriptionFactory.class);\n" +
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
	
	void createRouterResource(Feature service, String dslName, String containingFolder) {
		String serviceName = service.getName();
		String className = "routerResource";
		String pkg = dslName.replaceAll("\\.", "/");
		Path pkgPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg);
		Path resPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg+"/"+className+".java");
		
		String template = 
				"package %s;\n" + 
				"\n" + 
				"import javax.ws.rs.GET;\n" + 
				"import javax.ws.rs.POST;\n" + 
				"import javax.ws.rs.Path;\n" + 
				"import javax.ws.rs.QueryParam;\n" + 
				"import javax.ws.rs.Produces;\n" + 
				"import javax.ws.rs.Consumes;\n" + 
				"import javax.ws.rs.core.MediaType;\n" + 
				"\n" + 
				"import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;\n" + 
				"\n" + 
				"@Path(\"/\")@RegisterRestClient\n" + 
				"public interface routerResource {\n" + 
				"\n" + 
				"	@POST\n" + 
				"	@Path(\"/publishDiagnostics\")\n" + 
				"	@Consumes(MediaType.TEXT_PLAIN)\n" + 
				"	@Produces(MediaType.TEXT_PLAIN)\n" + 
				"	void diagnostics(String event);\n" + 
				"	\n" + 
				"}";
		
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
	
	protected void updateRouterProperties(Feature service, String dslName, String containingFolder) {
		String serviceName = service.getName();
		String pkg = dslName.replaceAll("\\.", "/");
		Path configPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/resources/application.properties");
		
		StringBuffer newContent = new StringBuffer();
		String calledResource = "routerResource";
		newContent.append("\n"+pkg+"."+calledResource+"/mp-rest/url=http://router:8080\n");
		
		try {
		    Files.writeString(configPath, newContent.toString(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
