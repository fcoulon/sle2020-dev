package kaulua.lsp.api;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.DocumentFormattingParams;
import org.eclipse.lsp4j.DocumentRangeFormattingParams;
import org.eclipse.lsp4j.TextEdit;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;

public interface IFormatting {
	
	@JsonRequest
	public CompletableFuture<List<? extends TextEdit>> formatting(DocumentFormattingParams params);
	
	@JsonRequest
	CompletableFuture<List<? extends TextEdit>> rangeFormatting(DocumentRangeFormattingParams params);
}
