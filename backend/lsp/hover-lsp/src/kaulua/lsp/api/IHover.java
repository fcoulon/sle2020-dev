package kaulua.lsp.api;

import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.Hover;
import org.eclipse.lsp4j.TextDocumentPositionParams;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;

public interface IHover {
	@JsonRequest
	CompletableFuture<Hover> hover(TextDocumentPositionParams position);
}
