package minijava;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.lsp4j.DocumentHighlight;
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

import kaulua.lsp.api.IDocumentHighlight;
@Path("/")
public class highlightResource {

    @Inject
    @RestClient
    storageResource workspace;
    
    @POST
    @Path("/highlight")
    public String highlight(String message) {
		IDocumentHighlight localService = AppLifecycleBean.getService();
		((HighlightJsonRPC)localService).setWorkspace(workspace);
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
				param = jsonHandler.getGson().fromJson(json, TextDocumentPositionParams.class);
			}
			CompletableFuture<List<? extends DocumentHighlight>> futurResult = localService.documentHighlight((TextDocumentPositionParams) param);
			try {
				List<? extends DocumentHighlight> result = futurResult.get();
				
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
