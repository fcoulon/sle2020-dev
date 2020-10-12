package fr.inria.diverse;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class DocumentResource {
	
	@Inject DocumentService documentService;

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public List<String> getDocumentList(@QueryParam("extension") String extension) {
    	
    	System.out.println("---------------");
    	System.out.println(" Recieve");
    	System.out.println("---------------");
    	System.out.println(extension);
    	
    	return documentService.getDocumentList(extension);
    }
    
    @GET
    @Path("document")
    @Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
    public String getDocument(@QueryParam("name") String name) {
    	
    	System.out.println("---------------");
    	System.out.println(" Recieve");
    	System.out.println("---------------");
    	System.out.println(name);
    	
    	int dotPos = name.lastIndexOf(".");
    	if(dotPos != -1) {
    		String extension = name.substring(dotPos+1);
			return documentService.getDocument(name, extension);
    	}
    	return "";
    }
    
    @POST
    @Path("update")
    @Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
    public void addDocument(@QueryParam("name") String name, String content) {
    	
    	System.out.println("---------------");
    	System.out.println(" Recieve");
    	System.out.println("---------------");
    	System.out.println(name);
    	System.out.println(content);
    	
    	int dotPos = name.lastIndexOf(".");
    	if(dotPos != -1) {
    		String extension = name.substring(dotPos+1);
    		documentService.addDocument(name, extension, content);    		
    	}
    }
}