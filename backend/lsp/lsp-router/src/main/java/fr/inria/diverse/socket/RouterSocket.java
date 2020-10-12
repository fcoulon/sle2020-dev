package fr.inria.diverse.socket;

import java.io.IOException;
import java.io.StringReader;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.inria.diverse.lsp.resources.Completion;
import fr.inria.diverse.lsp.resources.Definition;
import fr.inria.diverse.lsp.resources.DocumentHighlight;
import fr.inria.diverse.lsp.resources.DocumentSymbol;
import fr.inria.diverse.lsp.resources.Formatting;
import fr.inria.diverse.lsp.resources.Hover;
import fr.inria.diverse.lsp.resources.References;
import fr.inria.diverse.lsp.resources.Rename;
import fr.inria.diverse.lsp.resources.Symbol;
import fr.inria.diverse.lsp.resources.Workspace;

@ServerEndpoint("/lsp")
@ApplicationScoped
public class RouterSocket {
	
	private static final Logger LOGGER = LoggerFactory.getLogger("ListenerBean");
	
	@Inject
    @RestClient
    Completion completion;
	
	@Inject
    @RestClient
    Definition definitions;
	
	@Inject
    @RestClient
    DocumentHighlight documentHighlight;
	
	@Inject
    @RestClient
    DocumentSymbol documentSymbol;
	
	@Inject
    @RestClient
    Formatting formatting;
	
	@Inject
    @RestClient
    Hover hover;
	
	@Inject
    @RestClient
    References references;
	
	@Inject
    @RestClient
    Rename rename;
	
	@Inject
    @RestClient
    Symbol symbol;
	
	@Inject
    @RestClient
	Workspace workspace;
	
	public static Optional<Session> currentSession = Optional.empty();

	@OnOpen
    public void onOpen(Session session) {
		currentSession = Optional.of(session);
		LOGGER.debug("open " + session.getId());
    }

    @OnClose
    public void onClose(Session session) {
    	currentSession = Optional.empty();
    	LOGGER.debug("close " + session.getId());
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
    	LOGGER.debug("error " + session.getId());
    }
    
    @OnMessage
    public void onMessage(String message, Session session) {
    	System.out.println("---------------");
    	System.out.println(" Recieve");
    	System.out.println("---------------");
    	System.out.println(message);
        
        try {
        	JsonReader reader = Json.createReader(new StringReader(message));
        	JsonObject messageObject = reader.readObject();
        	reader.close();
        	
        	String method = messageObject.getString("method");
        	String response = dispatch(method,message);
        	
        	if(response != null) {
        		System.out.println("---------------");
        		System.out.println(" Send");
        		System.out.println("---------------");
        		System.out.println(response);
        		//TODO: handle error
        		session.getAsyncRemote().sendText(response);
        	}
        	
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
    
    private String dispatch(String method, String message) {
    	switch (method) {
		case "initialize": //TODO: ask a registry
			return 
					"{\"jsonrpc\": \"2.0\", \"result\":" +
			    	"{\n" + 
					"  \"capabilities\": {\n" + 
					"    \"textDocumentSync\": 1,\n" + 
					"    \"completionProvider\": {\n" + 
					"      \"resolveProvider\": "+isCompletionUp()+",\n" + 
					"      \"triggerCharacters\": [\n" + 
					"        \"/\"\n" + 
					"      ]\n" + 
					"    },\n" + 
					"    \"hoverProvider\": "+isHoverUp()+",\n" + 
					"    \"documentSymbolProvider\": "+isDocumentSymbolUp()+",\n" + 
					"    \"workspaceSymbolProvider\": "+isSymbolUp()+",\n" + 
					"    \"documentFormattingProvider\": "+isFormattingUp()+",\n" + 
					"    \"referencesProvider\": "+isReferenceUp()+",\n" + 
					"    \"definitionProvider\": "+isDefinitionUp()+",\n" + 
					"    \"documentHighlightProvider\": "+isDocumentHighlightUp()+",\n" + 
					"    \"codeActionProvider\": false,\n" + 
					"    \"renameProvider\": "+isRenameUp()+",\n" + 
					"    \"colorProvider\": false,\n" + 
					"    \"foldingRangeProvider\": false\n" + 
					"  }\n" + 
					"} " +
					", \"id\": 0}";
		case "initialized":
			return null;
		case "textDocument/didOpen":
			workspace.didOpen(message);
			return null;
		case "textDocument/didClose":
			workspace.didClose(message);
			return null;
		case "textDocument/didChange":
			workspace.callService(message);
			return null;
		case "textDocument/completion":
			return completion.callService(message);
		case "textDocument/definition":
			return definitions.callService(message);
		case "textDocument/documentHighlight":
			return documentHighlight.callService(message);
		case "textDocument/documentSymbol":
			return documentSymbol.callService(message);
		case "textDocument/formatting":
			return formatting.callService(message);
		case "textDocument/hover":
			return hover.callService(message);
		case "textDocument/references":
			return references.callService(message);
		case "textDocument/rename":
			return rename.callService(message);
		case "workspace/symbol":
			return symbol.callService(message);
		default:
			return "Could not find method \"" + method + "\"";
		}
    }
    
    private boolean isCompletionUp() {
    	try {
    		return isUp(completion.check());
    	}
    	catch(Exception e) {}
    	return false;
    }
    
    private boolean isDefinitionUp() {
    	try {
    		return isUp(definitions.check());
    	}
    	catch(Exception e) {}
    	return false;
    }
    
    private boolean isDocumentHighlightUp() {
    	try {
    		return isUp(documentHighlight.check());
    	}
    	catch(Exception e) {}
    	return false;
    }
    
    private boolean isDocumentSymbolUp() {
    	try {
    		return isUp(documentSymbol.check());
    	}
    	catch(Exception e) {}
    	return false;
    }
    
    private boolean isFormattingUp() {
    	try {
    		return isUp(formatting.check());
    	}
    	catch(Exception e) {}
    	return false;
    }
    
    private boolean isHoverUp() {
    	try {
    		return isUp(hover.check());
    	}
    	catch(Exception e) {}
    	return false;
    }
    
    private boolean isReferenceUp() {
    	try {
    		return isUp(references.check());
    	}
    	catch(Exception e) {}
    	return false;
    }
    
    private boolean isRenameUp() {
    	try {
    		return isUp(rename.check());
    	}
    	catch(Exception e) {}
    	return false;
    }
    
    private boolean isSymbolUp() {
    	try {
    		return isUp(symbol.check());
    	}
    	catch(Exception e) {}
    	return false;
    }
    
    private boolean isUp(String response) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonNode actualObj = mapper.readTree(response);
			JsonNode status = actualObj.get("status");
			System.out.println("[DEBUG] Check: " + status.asText());
			return status.asText().equals("UP");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("[DEBUG] Default health check");
		return false;
    }
}
