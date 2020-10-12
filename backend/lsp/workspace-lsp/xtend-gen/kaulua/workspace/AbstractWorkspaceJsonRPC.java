package kaulua.workspace;

import com.google.inject.Inject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import kaulua.common.Document;
import kaulua.common.UriExtensions;
import kaulua.lsp.api.IWorkspace;
import kaulua.server.BuildManager;
import kaulua.server.WorkspaceManager;
import kaulua.server.concurrent.RequestManager;
import kaulua.server.findReferences.WorkspaceResourceAccess;
import org.eclipse.emf.common.util.URI;
import org.eclipse.lsp4j.Diagnostic;
import org.eclipse.lsp4j.DiagnosticSeverity;
import org.eclipse.lsp4j.DidChangeTextDocumentParams;
import org.eclipse.lsp4j.DidCloseTextDocumentParams;
import org.eclipse.lsp4j.DidOpenTextDocumentParams;
import org.eclipse.lsp4j.DidSaveTextDocumentParams;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.PublishDiagnosticsParams;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.TextDocumentContentChangeEvent;
import org.eclipse.lsp4j.TextEdit;
import org.eclipse.lsp4j.jsonrpc.json.JsonRpcMethod;
import org.eclipse.lsp4j.jsonrpc.json.MessageJsonHandler;
import org.eclipse.lsp4j.jsonrpc.messages.NotificationMessage;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class AbstractWorkspaceJsonRPC implements IWorkspace {
  @Inject
  @Accessors(AccessorType.PUBLIC_GETTER)
  private RequestManager requestManager;
  
  @Inject
  @Extension
  protected UriExtensions _uriExtensions;
  
  protected WorkspaceManager workspaceManager;
  
  protected WorkspaceResourceAccess resourceAccess;
  
  @Inject
  public void setWorkspaceManager(final WorkspaceManager manager) {
    this.workspaceManager = manager;
    WorkspaceResourceAccess _workspaceResourceAccess = new WorkspaceResourceAccess(this.workspaceManager);
    this.resourceAccess = _workspaceResourceAccess;
    final Procedure2<URI, Iterable<Issue>> _function = (URI uri, Iterable<Issue> issues) -> {
      InputOutput.<String>println("[DEBUG] 10");
      PublishDiagnosticsParams _publishDiagnosticsParams = new PublishDiagnosticsParams();
      final Procedure1<PublishDiagnosticsParams> _function_1 = (PublishDiagnosticsParams it) -> {
        InputOutput.<String>println("[DEBUG] 9");
        it.setUri(this._uriExtensions.toUriString(uri));
        final Function1<Issue, Boolean> _function_2 = (Issue it_1) -> {
          Severity _severity = it_1.getSeverity();
          return Boolean.valueOf((_severity != Severity.IGNORE));
        };
        final Function1<Issue, Diagnostic> _function_3 = (Issue it_1) -> {
          return this.toDiagnostic(it_1);
        };
        it.setDiagnostics(IterableExtensions.<Diagnostic>toList(IterableExtensions.<Issue, Diagnostic>map(IterableExtensions.<Issue>filter(issues, _function_2), _function_3)));
      };
      final PublishDiagnosticsParams diagnostics = ObjectExtensions.<PublishDiagnosticsParams>operator_doubleArrow(_publishDiagnosticsParams, _function_1);
      final NotificationMessage notif = new NotificationMessage();
      notif.setMethod("textDocument/publishDiagnostics");
      notif.setParams(diagnostics);
      final Map<String, JsonRpcMethod> supportedMethods = new LinkedHashMap<String, JsonRpcMethod>();
      final MessageJsonHandler jsonHandler = new MessageJsonHandler(supportedMethods);
      final String message = jsonHandler.serialize(notif);
      this.postIssues(message);
    };
    final Procedure2<URI, Iterable<Issue>> diagnosticsListener = _function;
    this.workspaceManager.initialize(null, diagnosticsListener, CancelIndicator.NullImpl);
  }
  
  private Diagnostic toDiagnostic(final Issue issue) {
    Diagnostic _xblockexpression = null;
    {
      InputOutput.<String>println("[DEBUG] 8");
      Diagnostic _diagnostic = new Diagnostic();
      final Procedure1<Diagnostic> _function = (Diagnostic it) -> {
        it.setCode(issue.getCode());
        DiagnosticSeverity _switchResult = null;
        Severity _severity = issue.getSeverity();
        if (_severity != null) {
          switch (_severity) {
            case ERROR:
              _switchResult = DiagnosticSeverity.Error;
              break;
            case WARNING:
              _switchResult = DiagnosticSeverity.Warning;
              break;
            case INFO:
              _switchResult = DiagnosticSeverity.Information;
              break;
            default:
              _switchResult = DiagnosticSeverity.Hint;
              break;
          }
        } else {
          _switchResult = DiagnosticSeverity.Hint;
        }
        it.setSeverity(_switchResult);
        it.setMessage(issue.getMessage());
        Integer _elvis = null;
        Integer _lineNumber = issue.getLineNumber();
        if (_lineNumber != null) {
          _elvis = _lineNumber;
        } else {
          _elvis = Integer.valueOf(1);
        }
        final int lineNumber = ((_elvis).intValue() - 1);
        Integer _elvis_1 = null;
        Integer _column = issue.getColumn();
        if (_column != null) {
          _elvis_1 = _column;
        } else {
          _elvis_1 = Integer.valueOf(1);
        }
        final int column = ((_elvis_1).intValue() - 1);
        Integer _elvis_2 = null;
        Integer _length = issue.getLength();
        if (_length != null) {
          _elvis_2 = _length;
        } else {
          _elvis_2 = Integer.valueOf(0);
        }
        final Integer length = _elvis_2;
        Position _position = new Position(lineNumber, column);
        Position _position_1 = new Position(lineNumber, (column + (length).intValue()));
        Range _range = new Range(_position, _position_1);
        it.setRange(_range);
      };
      _xblockexpression = ObjectExtensions.<Diagnostic>operator_doubleArrow(_diagnostic, _function);
    }
    return _xblockexpression;
  }
  
  @Override
  public void didOpen(final DidOpenTextDocumentParams params) {
    InputOutput.<String>println("[DEBUG] 1");
    final Function0<BuildManager.Buildable> _function = () -> {
      return this.workspaceManager.didOpen(this._uriExtensions.toUri(params.getTextDocument().getUri()), Integer.valueOf(params.getTextDocument().getVersion()), params.getTextDocument().getText());
    };
    final Function2<CancelIndicator, BuildManager.Buildable, List<IResourceDescription.Delta>> _function_1 = (CancelIndicator cancelIndicator, BuildManager.Buildable buildable) -> {
      return buildable.build(cancelIndicator);
    };
    this.requestManager.<BuildManager.Buildable, List<IResourceDescription.Delta>>runWrite(_function, _function_1);
  }
  
  @Override
  public void didChange(final DidChangeTextDocumentParams params) {
    final Function0<BuildManager.Buildable> _function = () -> {
      final Function1<TextDocumentContentChangeEvent, TextEdit> _function_1 = (TextDocumentContentChangeEvent event) -> {
        TextEdit _xblockexpression = null;
        {
          Range range = event.getRange();
          if ((range == null)) {
            final Document originalDoc = this.workspaceManager.getDocument(params.getTextDocument().getUri());
            final Position end = originalDoc.getPosition(originalDoc.getContents().length());
            Position _position = new Position(0, 0);
            Range _range = new Range(_position, end);
            range = _range;
          }
          this.updateFile(params.getTextDocument().getUri().toString(), event.getText());
          String _text = event.getText();
          _xblockexpression = new TextEdit(range, _text);
        }
        return _xblockexpression;
      };
      return this.workspaceManager.didChange(
        this._uriExtensions.toUri(params.getTextDocument().getUri()), 
        params.getTextDocument().getVersion(), 
        ListExtensions.<TextDocumentContentChangeEvent, TextEdit>map(params.getContentChanges(), _function_1));
    };
    final Function2<CancelIndicator, BuildManager.Buildable, List<IResourceDescription.Delta>> _function_1 = (CancelIndicator cancelIndicator, BuildManager.Buildable buildable) -> {
      return buildable.build(cancelIndicator);
    };
    this.requestManager.<BuildManager.Buildable, List<IResourceDescription.Delta>>runWrite(_function, _function_1);
  }
  
  @Override
  public void didSave(final DidSaveTextDocumentParams params) {
  }
  
  @Override
  public void didClose(final DidCloseTextDocumentParams params) {
    final Function0<BuildManager.Buildable> _function = () -> {
      return this.workspaceManager.didClose(this._uriExtensions.toUri(params.getTextDocument().getUri()));
    };
    final Function2<CancelIndicator, BuildManager.Buildable, List<IResourceDescription.Delta>> _function_1 = (CancelIndicator cancelIndicator, BuildManager.Buildable buildable) -> {
      return buildable.build(cancelIndicator);
    };
    this.requestManager.<BuildManager.Buildable, List<IResourceDescription.Delta>>runWrite(_function, _function_1);
  }
  
  @Override
  public CompletableFuture<IResourceDescriptions> getIndex() {
    final Supplier<IResourceDescriptions> _function = () -> {
      return this.workspaceManager.getIndex();
    };
    return CompletableFuture.<IResourceDescriptions>supplyAsync(_function);
  }
  
  public abstract void updateFile(final String fileUri, final String newContent);
  
  public abstract void postIssues(final String issues);
  
  @Pure
  public RequestManager getRequestManager() {
    return this.requestManager;
  }
}
