package minijava;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.lsp4j.DidChangeTextDocumentParams;
import org.eclipse.lsp4j.DidCloseTextDocumentParams;
import org.eclipse.lsp4j.DidOpenTextDocumentParams;
import org.eclipse.lsp4j.jsonrpc.json.JsonRpcMethod;
import org.eclipse.lsp4j.jsonrpc.json.MessageJsonHandler;
import org.eclipse.lsp4j.jsonrpc.messages.Message;
import org.eclipse.lsp4j.jsonrpc.messages.NotificationMessage;
import org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.persistence.SerializableResourceDescription;

import com.google.common.collect.Lists;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import kaulua.lsp.api.IWorkspace;
@Path("/")
public class workspaceResource {

    @Inject
    @RestClient
    storageResource storage;
    
    @Inject
    @RestClient
    routerResource router;
    
    @GET
    @Path("/index")
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
		IWorkspace localService = AppLifecycleBean.getService();
		((WorkspaceJsonRPC)localService).setRouter(router);
		((WorkspaceJsonRPC)localService).setStorage(storage);
		Map<String, JsonRpcMethod> supportedMethods = new LinkedHashMap<>();
		supportedMethods.putAll(ServiceEndpoints.getSupportedMethods(localService.getClass()));
		MessageJsonHandler jsonHandler = new MessageJsonHandler(supportedMethods);

		CompletableFuture<IResourceDescriptions> futurResult = localService.getIndex();
		//Serialize the index
		try {
			IResourceDescriptions result = futurResult.get();
			ArrayList<IResourceDescription> index = Lists.newArrayList(result.getAllResourceDescriptions());
			List<String> descriptions = new ArrayList<>();
			for (IResourceDescription iResourceDescription : index) {
				SerializableResourceDescription s = (SerializableResourceDescription)iResourceDescription;
				
				try {
					ByteArrayOutputStream stream = new ByteArrayOutputStream();
					ObjectOutputStream out = new ObjectOutputStream(stream);
					out.writeObject(s);
					String encoded = Base64.getEncoder().encodeToString(stream.toByteArray());
					descriptions.add(encoded);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			Type typeOfSrc = new TypeToken<List<String>>(){}.getType();
			String response = new GsonBuilder().disableHtmlEscaping().create().toJson(descriptions, typeOfSrc);
//			LOGGER.debug(response);
			return response;
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		return "";    }
	
	@POST
	@Path("/didChange")
	@Produces(MediaType.TEXT_PLAIN)
	public void didChange(String message) {
		
		
		IWorkspace localService = AppLifecycleBean.getService();
		((WorkspaceJsonRPC)localService).setRouter(router);
		((WorkspaceJsonRPC)localService).setStorage(storage);
		Map<String, JsonRpcMethod> supportedMethods = new LinkedHashMap<>();
		supportedMethods.putAll(ServiceEndpoints.getSupportedMethods(localService.getClass()));
		MessageJsonHandler jsonHandler = new MessageJsonHandler(supportedMethods);
		
		//Remove header
		if(message.startsWith("Content-Length:")) {
			int firstReturn = message.indexOf("\n");
			message = message.substring(firstReturn+1);
		}
		
		Message msg = jsonHandler.parseMessage(message);
		
		if(msg instanceof NotificationMessage) {
			NotificationMessage notif = (NotificationMessage) msg; 
			Object param = notif.getParams();
			if(param instanceof JsonElement) {
				JsonElement json = (JsonElement) ((NotificationMessage) msg).getParams();
				param = jsonHandler.getGson().fromJson(json, DidChangeTextDocumentParams.class);
			}
			localService.didChange((DidChangeTextDocumentParams) param);
		}
	}
	
	@POST
	@Path("/didOpen")
	@Produces(MediaType.TEXT_PLAIN)
	public void didOpen(String message) {
		
		IWorkspace localService = AppLifecycleBean.getService();
		((WorkspaceJsonRPC)localService).setRouter(router);
		((WorkspaceJsonRPC)localService).setStorage(storage);
		Map<String, JsonRpcMethod> supportedMethods = new LinkedHashMap<>();
		supportedMethods.putAll(ServiceEndpoints.getSupportedMethods(localService.getClass()));
		MessageJsonHandler jsonHandler = new MessageJsonHandler(supportedMethods);
		
		//Remove header
		if(message.startsWith("Content-Length:")) {
			int firstReturn = message.indexOf("\n");
			message = message.substring(firstReturn+1);
		}
		
		Message msg = jsonHandler.parseMessage(message);
		
		if(msg instanceof NotificationMessage) {
			NotificationMessage notif = (NotificationMessage) msg; 
			Object param = notif.getParams();
			if(param instanceof JsonElement) {
				JsonElement json = (JsonElement) ((NotificationMessage) msg).getParams();
				param = jsonHandler.getGson().fromJson(json, DidOpenTextDocumentParams.class);
			}
			localService.didOpen((DidOpenTextDocumentParams) param);
		}
	}
	
	@POST
	@Path("/didClose")
	@Produces(MediaType.TEXT_PLAIN)
	public void didClose(String message) {
		
		IWorkspace localService = AppLifecycleBean.getService();
		((WorkspaceJsonRPC)localService).setRouter(router);
		((WorkspaceJsonRPC)localService).setStorage(storage);
		Map<String, JsonRpcMethod> supportedMethods = new LinkedHashMap<>();
		supportedMethods.putAll(ServiceEndpoints.getSupportedMethods(localService.getClass()));
		MessageJsonHandler jsonHandler = new MessageJsonHandler(supportedMethods);
		
		//Remove header
		if(message.startsWith("Content-Length:")) {
			int firstReturn = message.indexOf("\n");
			message = message.substring(firstReturn+1);
		}
		
		Message msg = jsonHandler.parseMessage(message);
		
		if(msg instanceof NotificationMessage) {
			NotificationMessage notif = (NotificationMessage) msg; 
			Object param = notif.getParams();
			if(param instanceof JsonElement) {
				JsonElement json = (JsonElement) ((NotificationMessage) msg).getParams();
				param = jsonHandler.getGson().fromJson(json, DidCloseTextDocumentParams.class);
			}
			localService.didClose((DidCloseTextDocumentParams) param);
		}
	}}
