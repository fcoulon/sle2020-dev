package minijava;

import java.util.concurrent.ExecutorService;

import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Binder;
import com.google.inject.name.Names;

import org.tetrabox.minijava.xtext.ide.contentassist.antlr.MiniJavaParser;
import org.tetrabox.minijava.xtext.ide.contentassist.antlr.internal.InternalMiniJavaLexer;
import kaulua.completion.ExecutorServiceProvider;
import kaulua.contentassist.FQNPrefixMatcher;
import kaulua.contentassist.IPrefixMatcher;
import kaulua.contentassist.IProposalConflictHelper;
import kaulua.contentassist.antlr.AntlrProposalConflictHelper;
import kaulua.contentassist.antlr.IContentAssistParser;
import kaulua.contentassist.antlr.internal.Lexer;
import kaulua.contentassist.ide.LexerIdeBindings;
import kaulua.refactoring.IRenameStrategy2;
import kaulua.rename.IRenameService;
import kaulua.rename.RenameService;
class ServiceModule extends AbstractGenericModule {
	
	public Class<? extends kaulua.lsp.api.ICompletion> bindICompletion() {
		return CompletionJsonRPC.class;
	}
	
// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public void configureContentAssistLexer(Binder binder) {
		binder.bind(Lexer.class)
			.annotatedWith(Names.named(LexerIdeBindings.CONTENT_ASSIST))
			.to(InternalMiniJavaLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return MiniJavaParser.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IProposalConflictHelper> bindIProposalConflictHelper() {
		return AntlrProposalConflictHelper.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.ui.refactoring.RefactorElementNameFragment2
	public Class<? extends IRenameService> bindIRenameService() {
		return RenameService.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.ui.refactoring.RefactorElementNameFragment2
	public Class<? extends IRenameStrategy2> bindIRenameStrategy2() {
		return IRenameStrategy2.DefaultImpl.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.exporting.QualifiedNamesFragment2
	public Class<? extends IPrefixMatcher> bindIPrefixMatcher() {
		return FQNPrefixMatcher.class;
	}
	
	public void configureExecutorService(Binder binder) {
		binder.bind(ExecutorService.class).toProvider(ExecutorServiceProvider.class);
	}}