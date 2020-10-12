package fr.inria.diverse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface Router {
	
	@GET
	@Path("/health")
	String check();
	
}
