package nablab;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.lsp4j.Location;
import org.eclipse.lsp4j.ReferenceParams;
import org.eclipse.lsp4j.TextDocumentPositionParams;
import org.eclipse.lsp4j.jsonrpc.json.JsonRpcMethod;
import org.eclipse.lsp4j.jsonrpc.json.MessageConstants;
import org.eclipse.lsp4j.jsonrpc.json.MessageJsonHandler;
import org.eclipse.lsp4j.jsonrpc.messages.Message;
import org.eclipse.lsp4j.jsonrpc.messages.RequestMessage;
import org.eclipse.lsp4j.jsonrpc.messages.ResponseMessage;
import org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.google.gson.JsonElement;

import kaulua.lsp.api.IReference;
@Path("/")
public class referencesResource {

    @Inject
    @RestClient
    workspaceResource workspace;
    
    @Inject
    @RestClient
    storageResource storage;
    
    @POST
    @Path("/references")    public String references(String message) {
		IReference localService = AppLifecycleBean.getService();
       ((ReferencesJsonRPC)localService).setWorkspace(workspace);
		((ReferencesJsonRPC)localService).setStorage(storage);
		Map<String, JsonRpcMethod> supportedMethods = new LinkedHashMap<>();
		supportedMethods.putAll(ServiceEndpoints.getSupportedMethods(localService.getClass()));
		MessageJsonHandler jsonHandler = new MessageJsonHandler(supportedMethods);
		
		//Remove header
		if(message.startsWith("Content-Length:")) {
			int firstReturn = message.indexOf("\n");
			message = message.substring(firstReturn+1);
		}
		
		
		Message msg = jsonHandler.parseMessage(message);
		
		if(msg instanceof RequestMessage) {
			RequestMessage request = (RequestMessage) msg; 
			Object param = request.getParams();
			if(param instanceof JsonElement) {
				JsonElement json = (JsonElement) ((RequestMessage) msg).getParams();
				param = jsonHandler.getGson().fromJson(json, ReferenceParams.class);
			}
			CompletableFuture<List<? extends Location>> futurResult = localService.references((ReferenceParams) param);
			try {
				List<? extends Location> result = futurResult.get();
				
				ResponseMessage responseMessage = new ResponseMessage();
				responseMessage.setRawId(request.getRawId());
				responseMessage.setJsonrpc(MessageConstants.JSONRPC_VERSION);
				responseMessage.setResult(result);
				
				return jsonHandler.serialize(responseMessage);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
			
		}
		
		return "";    }
}
