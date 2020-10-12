package kaulua.lsp.api;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.Location;
import org.eclipse.lsp4j.ReferenceParams;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;

public interface IReference {
	@JsonRequest
	CompletableFuture<List<? extends Location>> references(ReferenceParams params);
}
