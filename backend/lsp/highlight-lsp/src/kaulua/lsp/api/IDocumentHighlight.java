package kaulua.lsp.api;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.DocumentHighlight;
import org.eclipse.lsp4j.TextDocumentPositionParams;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;

public interface IDocumentHighlight {
	@JsonRequest
	CompletableFuture<List<? extends DocumentHighlight>> documentHighlight(TextDocumentPositionParams position);
}
