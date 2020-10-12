package kaulua.lsp.api;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.Location;
import org.eclipse.lsp4j.TextDocumentPositionParams;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;

public interface IDefinition {
	@JsonRequest
	CompletableFuture<List<? extends Location>> definition(TextDocumentPositionParams position);
}
