package kaulua.lsp.api;

import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.RenameParams;
import org.eclipse.lsp4j.WorkspaceEdit;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;

public interface IRename {
	@JsonRequest
	CompletableFuture<WorkspaceEdit> rename(RenameParams params);
}
