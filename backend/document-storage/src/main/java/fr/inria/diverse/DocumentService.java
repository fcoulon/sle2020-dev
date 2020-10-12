package fr.inria.diverse;

import java.util.LinkedList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.QueryParam;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

@ApplicationScoped
public class DocumentService {
	
	static String DB = "kaulua";
	
	@Inject MongoClient mongoClient;

    public List<String> getDocumentList(String extension) {
    	
    	List<String> documents = new LinkedList<String>();
    	
    	MongoCollection<Document> collection = mongoClient.getDatabase(DB).getCollection(extension);
    	MongoCursor<Document> it = collection.find().iterator();
    	try {
    		while(it.hasNext()) {
    			Document mongoDoc = it.next();
    			documents.add(mongoDoc.getString("name"));
    		}
    	} finally {
            it.close();
        }
    	
        return documents;
    }
    
    public String getDocument( String name, String extension) {
    	
    	MongoCollection<Document> collection = mongoClient.getDatabase(DB).getCollection(extension);
    	MongoCursor<Document> it = collection.find().iterator();
    	try {
    		while(it.hasNext()) {
    			Document mongoDoc = it.next();
    			String mongoDocName = mongoDoc.getString("name");
    			if(mongoDocName.equals(name)) {
    				return mongoDoc.getString("content");
    			}
    		}
    	} finally {
            it.close();
        }
    	
    	return "";
    }
    
    public void addDocument(String name, String extension,  String content) {
    	Document document = new Document()
                .append("name", name)
                .append("content", content);
    	
    	MongoCollection<Document> collection = mongoClient.getDatabase(DB).getCollection(extension);
    	
    	BasicDBObject fields = new BasicDBObject();
    	fields.put("name", name);
    	
    	FindIterable<Document> matchingDocs = collection.find(fields);
    	Document doc = matchingDocs.first();
    	if(doc != null) {
    		collection.findOneAndReplace(fields, document);
    	}
    	else {
    		collection.insertOne(document);
    	}
    	
    }

}
