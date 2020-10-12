package kaulua.lsp.api;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.SymbolInformation;
import org.eclipse.lsp4j.WorkspaceSymbolParams;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;

public interface ISymbol {
	@JsonRequest
	CompletableFuture<List<? extends SymbolInformation>> symbol(WorkspaceSymbolParams params);
}
