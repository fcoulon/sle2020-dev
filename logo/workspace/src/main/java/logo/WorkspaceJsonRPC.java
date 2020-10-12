package logo;

import org.eclipse.lsp4j.TextDocumentItem;

import com.google.gson.GsonBuilder;

import kaulua.workspace.AbstractWorkspaceJsonRPC;

public class WorkspaceJsonRPC extends AbstractWorkspaceJsonRPC {
	
	storageResource storage;
	
	routerResource router;
	
	public void setStorage(storageResource storage) {
		this.storage = storage;
	}

	public void setRouter(routerResource router) {
		this.router = router;
	}

	@Override
	public void postIssues(String message) {
		System.out.println("[SEND ISSUES] " + message);
		router.diagnostics(message);
	}

	@Override
	public void updateFile(String fileUri, String newContent) {
		storage.update(fileUri,newContent);
	}

}
