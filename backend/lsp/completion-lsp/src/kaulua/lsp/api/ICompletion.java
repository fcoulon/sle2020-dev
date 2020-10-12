package kaulua.lsp.api;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.CompletionItem;
import org.eclipse.lsp4j.CompletionList;
import org.eclipse.lsp4j.CompletionParams;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;

public interface ICompletion {
	@JsonRequest
	CompletableFuture<Either<List<CompletionItem>, CompletionList>> completion(CompletionParams position);
}
