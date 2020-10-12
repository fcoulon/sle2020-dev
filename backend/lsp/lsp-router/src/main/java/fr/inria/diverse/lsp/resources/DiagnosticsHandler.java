package fr.inria.diverse.lsp.resources;

import java.io.UnsupportedEncodingException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.inria.diverse.socket.RouterSocket;

@Path("/publishDiagnostics")
public class DiagnosticsHandler {
	
	private static final Logger LOGGER = LoggerFactory.getLogger("ListenerBean");

	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public void publishDiagnostics(String issues) {
		
//		LOGGER.debug("---------------");
//		LOGGER.debug(" Recieved issues");
//		LOGGER.debug("---------------");
//		LOGGER.debug(issues);
		System.out.println("---------------");
    	System.out.println(" Recieved issues");
    	System.out.println("---------------");
    	System.out.println(issues);
		
		if(RouterSocket.currentSession.isPresent()) {
//			LOGGER.debug("[DEBUG] diagnostics");
			System.out.println("[DEBUG] diagnostics");
			RouterSocket.currentSession.get().getAsyncRemote().sendText(issues);
		}
		
	}
	
}
