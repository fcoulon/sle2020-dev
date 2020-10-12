package kaulua.lsp.api;

import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.DidChangeTextDocumentParams;
import org.eclipse.lsp4j.DidCloseTextDocumentParams;
import org.eclipse.lsp4j.DidOpenTextDocumentParams;
import org.eclipse.lsp4j.DidSaveTextDocumentParams;
import org.eclipse.lsp4j.jsonrpc.services.JsonNotification;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;
import org.eclipse.xtext.resource.IResourceDescriptions;

public interface IWorkspace {
	@JsonNotification void didOpen(DidOpenTextDocumentParams params);

	@JsonNotification void didChange(DidChangeTextDocumentParams params);

	@JsonNotification void didSave(DidSaveTextDocumentParams params);

	@JsonNotification void didClose(DidCloseTextDocumentParams params);
	
	@JsonRequest CompletableFuture<IResourceDescriptions> getIndex();

}
