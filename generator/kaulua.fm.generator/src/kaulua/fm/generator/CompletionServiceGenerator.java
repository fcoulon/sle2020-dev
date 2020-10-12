package kaulua.fm.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.XtextRuntimeModule;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.Modules2;
import org.eclipse.xtext.xtext.generator.DefaultGeneratorModule;
import org.eclipse.xtext.xtext.generator.IXtextGeneratorLanguage;
import org.eclipse.xtext.xtext.generator.StandardLanguage;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;
import org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessExtensions;
import org.eclipse.xtext.xtext.generator.model.IXtextGeneratorFileSystemAccess;
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess;
import org.eclipse.xtext.xtext.generator.model.XtextGeneratorFileSystemAccess;
import org.eclipse.xtext.xtext.generator.model.project.IXtextProjectConfig;
import org.eclipse.xtext.xtext.generator.model.project.RuntimeProjectConfig;
import org.eclipse.xtext.xtext.generator.model.project.StandardProjectConfig;
import org.eclipse.xtext.xtext.generator.model.project.SubProjectConfig;
import org.eclipse.xtext.xtext.generator.parser.antlr.CombinedGrammarMarker;
import org.eclipse.xtext.xtext.generator.parser.antlr.KeywordHelper;
import org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;

import fr.inria.diverse.kaulua.Feature;
import kaulua.helper.MavenHelper;

public class CompletionServiceGenerator extends AbstractLspServiceGenerator {
	
	public static final String SERVICE_ID = "completion";

	@Override
	public boolean canHandle(Feature service) {
		return service.getName().equals(SERVICE_ID);
	}

	@Override
	public void generate(Feature service, String dslName, String xtextUri, String containingFolder) {
		
		createAppLifeCycle(service, dslName, xtextUri, "kaulua.lsp.api.ICompletion", containingFolder);
		createServiceModule(service, dslName, xtextUri, "kaulua.lsp.api.ICompletion", "CompletionJsonRPC", containingFolder);
		createResource(service, dslName, containingFolder);
		createServiceImplementation(service,dslName, containingFolder);
		updateQuarkusFiles(service, dslName, containingFolder);
		MavenGenerator.createCorsFilter(dslName,service.getName(), containingFolder);
		
//		Job job = new Job("Add src-gen") {
//			@Override
//			protected IStatus run(IProgressMonitor monitor) {
				createContentAssistParser(service, xtextUri, containingFolder);
				addSourceFolder(service.getName(), "src-gen");
				updateInternals(service, xtextUri, containingFolder);
//				return Status.OK_STATUS;
//			}
//		};
//		job.schedule();

		MavenHelper.addDependency(service.getName(), "completion-lsp", "completion-lsp", "0.0.1-SNAPSHOT", containingFolder);
		MavenHelper.addDependency(service.getName(), xtextUri, containingFolder);
		MavenHelper.addSrcGen(service.getName(), containingFolder);
	}

	@Override
	void createResource(Feature service, String dslName, String containingFolder) {
		String serviceName = service.getName();
		String className = "completionResource";
		String path = "/completion";
		String pkg = dslName.replaceAll("\\.", "/");
		Path pkgPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg);
		Path resPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg+"/"+className+".java");
		
		String template = 
				"package %s;\n" + 
				"\n" + 
				"import java.util.LinkedHashMap;\n" + 
				"import java.util.List;\n" + 
				"import java.util.Map;\n" + 
				"import java.util.concurrent.CompletableFuture;\n" + 
				"import java.util.concurrent.ExecutionException;\n" + 
				"\n" + 
				"import javax.inject.Inject;\n" + 
				"import javax.ws.rs.POST;\n" + 
				"import javax.ws.rs.Path;\n" + 
				"import javax.ws.rs.Produces;\n" + 
				"import javax.ws.rs.Consumes;\n" +
				"import javax.ws.rs.core.MediaType;\n" + 
				"\n" + 
				"import org.eclipse.lsp4j.CompletionItem;\n" + 
				"import org.eclipse.lsp4j.CompletionList;\n" + 
				"import org.eclipse.lsp4j.CompletionParams;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.json.JsonRpcMethod;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.json.MessageConstants;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.json.MessageJsonHandler;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.messages.Either;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.messages.Message;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.messages.RequestMessage;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.messages.ResponseMessage;\n" + 
				"import org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints;\n" + 
				"import org.eclipse.microprofile.rest.client.inject.RestClient;\n" + 
				"\n" + 
				"import com.google.gson.JsonElement;\n" + 
				"\n" + 
				"import kaulua.lsp.api.ICompletion;" +
				"\n" + 
				"@Path(\"/\")\n" + 
				"public class %s {\n" + 
				"\n" + 
				"    @Inject\n" + 
				"    @RestClient\n" + 
				"    storageResource workspace;\n" +
				"    \n" + 
				"    @POST\n" + 
				"    @Path(\"/completion\")\n" + 
				"    @Consumes(MediaType.TEXT_PLAIN)\n" + 
				"    @Produces(MediaType.TEXT_PLAIN)\n" + 
				"    public String completion(String message) {\n" + 
				"		ICompletion localService = AppLifecycleBean.getService();\n" + 
				"		((CompletionJsonRPC)localService).setWorkspace(workspace);\n" + 
				"		Map<String, JsonRpcMethod> supportedMethods = new LinkedHashMap<>();\n" + 
				"		supportedMethods.putAll(ServiceEndpoints.getSupportedMethods(localService.getClass()));\n" + 
				"		MessageJsonHandler jsonHandler = new MessageJsonHandler(supportedMethods);\n" + 
				"		\n" + 
				"		//Remove header\n" + 
				"		if(message.startsWith(\"Content-Length:\")) {\n" + 
				"			int firstReturn = message.indexOf(\"\\n\");\n" + 
				"			message = message.substring(firstReturn+1);\n" + 
				"		}\n" + 
				"		\n" + 
				"		Message msg = jsonHandler.parseMessage(message);\n" + 
				"		\n" + 
				"		if(msg instanceof RequestMessage) {\n" + 
				"			RequestMessage request = (RequestMessage) msg; \n" + 
				"			Object param = request.getParams();\n" + 
				"			if(param instanceof JsonElement) {\n" + 
				"				JsonElement json = (JsonElement) ((RequestMessage) msg).getParams();\n" + 
				"				param = jsonHandler.getGson().fromJson(json, CompletionParams.class);\n" + 
				"			}\n" + 
				"			CompletableFuture<Either<List<CompletionItem>, CompletionList>> futurResult = localService.completion((CompletionParams) param);\n" + 
				"			try {\n" + 
				"				Either<List<CompletionItem>, CompletionList> result = futurResult.get();\n" + 
				"				\n" + 
				"				ResponseMessage responseMessage = new ResponseMessage();\n" + 
				"				responseMessage.setRawId(request.getRawId());\n" + 
				"				responseMessage.setJsonrpc(MessageConstants.JSONRPC_VERSION);\n" + 
				"				responseMessage.setResult(result);\n" + 
				"				\n" + 
				"				return jsonHandler.serialize(responseMessage);\n" + 
				"				\n" + 
				"			} catch (InterruptedException e) {\n" + 
				"				e.printStackTrace();\n" + 
				"			} catch (ExecutionException e) {\n" + 
				"				e.printStackTrace();\n" + 
				"			}\n" + 
				"			\n" + 
				"		}\n" + 
				"		\n" + 
				"		return \"\";\n" +
				"    }\n" + 
				"}\n" + 
				"";
		
		String content = String.format(template, pkg,className);
		
		try {
			if(!Files.exists(pkgPath)) {
				Files.createDirectories(pkgPath);
			}
			if(!Files.exists(resPath)) {
				Files.createFile(resPath);				
			}
			Files.writeString(resPath, content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	void createServiceImplementation(Feature service, String dslName, String containingFolder) {
		String serviceName = service.getName();
		String className = "CompletionJsonRPC";
		String pkg = dslName.replaceAll("\\.", "/");
		Path pkgPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg);
		Path resPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg+"/"+className+".java");
		String template = 
				"package %s;\n" + 
				"\n" + 
				"import org.eclipse.lsp4j.TextDocumentItem;\n" + 
				"\n" + 
				"import com.google.gson.GsonBuilder;\n" + 
				"\n" + 
				"import kaulua.completion.AbstractCompletionJsonRPC;\n" + 
				"\n" + 
				"public class %s extends AbstractCompletionJsonRPC {\n" + 
				"	\n" + 
				"	storageResource workspace;\n" + 
				"	\n" + 
				"	public void setWorkspace(storageResource workspace) {\n" + 
				"		this.workspace = workspace;\n" + 
				"	}\n" + 
				"\n" + 
				"	@Override\n" + 
				"	public String requestDocument(String uri) {\n" + 
				"		String content = workspace.document(uri);\n" + 
				"		return content;\n" + 
				"	}\n" + 
				"\n" + 
				"}\n" + 
				"";
		
		String content = String.format(template, pkg, className);
		
		try {
			if(!Files.exists(pkgPath)) {
				Files.createDirectories(pkgPath);
			}
			if(!Files.exists(resPath)) {
				Files.createFile(resPath);				
			}
			Files.writeString(resPath, content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void createContentAssistParser(Feature service, String xtextUri, String containingFolder) {
		
		XtextResourceSet rs = new XtextResourceSet();
		Resource res = rs.getResource(URI.createURI(xtextUri), true);
		Grammar root = (Grammar) res.getContents().get(0);
		
		Injector injector = Guice.createInjector(
				Modules2.mixin(new XtextRuntimeModule(), new FragmentGeneratorModule(root)));

		boolean isCombinedGrammar = true;
		GrammarAccessExtensions grammarUtil =  injector.getInstance(GrammarAccessExtensions.class);
		new KeywordHelper(root, false, grammarUtil);
		new CombinedGrammarMarker(isCombinedGrammar).attachToEmfObject(root);
		
		CustomStandardLanguage sl = (CustomStandardLanguage) injector.getInstance(IXtextGeneratorLanguage.class);
		XtextAntlrGeneratorFragment2 gen = sl.getParserGen();

		gen.initialize(injector);
		
		// Generate grammar
		CustomXtextAntlrGeneratorFragment2 gen2 = new CustomXtextAntlrGeneratorFragment2();
		gen2.initialize(injector);
		gen2.initProjectConf(injector,service.getName(), containingFolder);
		gen2.generateInternals();
		
		//Generate parser
		JavaFileAccess jfa = gen.generateContentAssistParser();
		IXtextProjectConfig conf = injector.getInstance(IXtextProjectConfig.class);
		IXtextGeneratorFileSystemAccess srcGen = conf.getGenericIde().getSrcGen();
		
		String orignalImport = "import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;";
		String newImport = "import kaulua.contentassist.antlr.AbstractContentAssistParser;";
		String originalContent = jfa.getContentString();
		String newContent = originalContent.replace(orignalImport, newImport);
		
//		jfa.writeTo(srcGen);
		srcGen.generateFile(jfa.getPath(), newContent);
		
//		Path parserPath = Paths.get(jfa.getPath());
//		try {
//			if(!Files.exists(parserPath)) {
//				Files.createFile(parserPath);				
//			}
//			Files.writeString(parserPath, newContent);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		String s = "";
	}

	static class CustomStandardLanguage extends StandardLanguage {
		public XtextAntlrGeneratorFragment2 getParserGen() {
			return getParserGenerator();
		}
		
	}
	
	static class CustomXtextAntlrGeneratorFragment2 extends XtextAntlrGeneratorFragment2 {
		
		public void generateInternals() {
			generateContentAssistGrammar();
		}
		
		public void initProjectConf(Injector injector, String serviceName, String containingFolder) {
			Path pkgPath = Paths.get(containingFolder+"/"+serviceName+"/src-gen");
			SubProjectConfig projectConf = ((SubProjectConfig) getProjectConfig().getGenericIde());
			projectConf.setEnabled(true);
			projectConf.setSrcGen(pkgPath.toAbsolutePath().toString());
			getProjectConfig().initialize(injector);
		}
	}
	
	static class FragmentGeneratorModule extends DefaultGeneratorModule {
		Grammar grammar;

		FragmentGeneratorModule (Grammar g) {
			this.grammar = g;
		}

		public Class<? extends XtextGeneratorNaming> bindNaming() {
			return XtextGeneratorNaming.class;
		}

		public void configureGrammar(Binder binder) {
			binder.bind(Grammar.class).toInstance(grammar);
		}

		public void configureXtextProjectConfig(Binder binder) {
			CustomStandardLanguage lang = new CustomStandardLanguage();
			lang.initialize(grammar);
			binder.bind(IXtextGeneratorLanguage.class).toInstance(lang);
		}
		public void configureIXtextProjectConfig(Binder binder){
			binder.bind(IXtextProjectConfig.class).toInstance(new FakeProjectConfig());
		}
	}

	static class FakeProjectConfig extends StandardProjectConfig {

		public RuntimeProjectConfig getRuntime() {
			return new RuntimeProjectConfig() {

				public String getName() {
					return "completion";
				}

				public String getEcoreModelFolder() {
					return "rootFolder/ecoreFolder";
				}

				public IXtextGeneratorFileSystemAccess getSrcGen() {
					return new XtextGeneratorFileSystemAccess("rootFolder/src-gen", false);
				}

				public IXtextGeneratorFileSystemAccess getRoot() {
					return new XtextGeneratorFileSystemAccess("rootFolder", false);
				}

			};
		}
	}
	
	protected static void addSourceFolder(String projectName, String folderName) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		try {
			project.open(null);
			IJavaProject javaProject = JavaCore.create(project);
			IClasspathEntry[] entries = javaProject.getRawClasspath();

			IClasspathEntry[] newEntries = new IClasspathEntry[entries.length + 1];
			System.arraycopy(entries, 0, newEntries, 0, entries.length);

			IPath srcPath = javaProject.getPath().append(folderName);
			IClasspathEntry srcEntry = JavaCore.newSourceEntry(srcPath, null);

			newEntries[entries.length] = JavaCore.newSourceEntry(srcEntry.getPath());
			javaProject.setRawClasspath(newEntries, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	protected void createServiceModule(Feature service, String dslName, String xtextUri, String serviceInterface, String serviceClass, String containingFolder) {
		
		Grammar grammar = loadGrammarString(xtextUri);
		String dslQualifiedName = grammar.getName();
		String dslQualifier = dslQualifiedName.substring(0, dslQualifiedName.lastIndexOf("."));
		
		String grammarName = grammar.getName();
		String simpleGrammarName = grammarName;
		int lastDot = grammarName.lastIndexOf(".");
		if(lastDot != -1) {
			simpleGrammarName = grammarName.substring(lastDot+1);
		}
		
		String serviceName = service.getName();
		String className = "ServiceModule";
		String pkg = dslName.replaceAll("\\.", "/");
		Path pkgPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg);
		Path resPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg+"/"+className+".java");
		String template = 
				"package %s;\n" + 
				"\n" + 
				"import java.util.concurrent.ExecutorService;\n" + 
				"\n" + 
				"import org.eclipse.xtext.service.AbstractGenericModule;\n" + 
				"\n" + 
				"import com.google.inject.Binder;\n" + 
				"import com.google.inject.name.Names;\n" + 
				"\n" + 
				"import %s.ide.contentassist.antlr."+simpleGrammarName+"Parser;\n" + 
				"import %s.ide.contentassist.antlr.internal.Internal"+simpleGrammarName+"Lexer;\n" + 
				"import kaulua.completion.ExecutorServiceProvider;\n" + 
				"import kaulua.contentassist.FQNPrefixMatcher;\n" + 
				"import kaulua.contentassist.IPrefixMatcher;\n" + 
				"import kaulua.contentassist.IProposalConflictHelper;\n" + 
				"import kaulua.contentassist.antlr.AntlrProposalConflictHelper;\n" + 
				"import kaulua.contentassist.antlr.IContentAssistParser;\n" + 
				"import kaulua.contentassist.antlr.internal.Lexer;\n" + 
				"import kaulua.contentassist.ide.LexerIdeBindings;\n" + 
				"import kaulua.refactoring.IRenameStrategy2;\n" + 
				"import kaulua.rename.IRenameService;\n" + 
				"import kaulua.rename.RenameService;" + 
				"\n" + 
				"class ServiceModule extends AbstractGenericModule {\n" + 
				"	\n" + 
				"	public Class<? extends kaulua.lsp.api.ICompletion> bindICompletion() {\n" + 
				"		return CompletionJsonRPC.class;\n" + 
				"	}\n" + 
				"	\n" + 
				"// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2\n" + 
				"	public void configureContentAssistLexer(Binder binder) {\n" + 
				"		binder.bind(Lexer.class)\n" + 
				"			.annotatedWith(Names.named(LexerIdeBindings.CONTENT_ASSIST))\n" + 
				"			.to(Internal"+simpleGrammarName+"Lexer.class);\n" + 
				"	}\n" + 
				"	\n" + 
				"	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2\n" + 
				"	public Class<? extends IContentAssistParser> bindIContentAssistParser() {\n" + 
				"		return "+simpleGrammarName+"Parser.class;\n" + 
				"	}\n" + 
				"	\n" + 
				"	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2\n" + 
				"	public Class<? extends IProposalConflictHelper> bindIProposalConflictHelper() {\n" + 
				"		return AntlrProposalConflictHelper.class;\n" + 
				"	}\n" + 
				"	\n" + 
				"	// contributed by org.eclipse.xtext.xtext.generator.ui.refactoring.RefactorElementNameFragment2\n" + 
				"	public Class<? extends IRenameService> bindIRenameService() {\n" + 
				"		return RenameService.class;\n" + 
				"	}\n" + 
				"	\n" + 
				"	// contributed by org.eclipse.xtext.xtext.generator.ui.refactoring.RefactorElementNameFragment2\n" + 
				"	public Class<? extends IRenameStrategy2> bindIRenameStrategy2() {\n" + 
				"		return IRenameStrategy2.DefaultImpl.class;\n" + 
				"	}\n" + 
				"	\n" + 
				"	// contributed by org.eclipse.xtext.xtext.generator.exporting.QualifiedNamesFragment2\n" + 
				"	public Class<? extends IPrefixMatcher> bindIPrefixMatcher() {\n" + 
				"		return FQNPrefixMatcher.class;\n" + 
				"	}\n" + 
				"	\n" + 
				"	public void configureExecutorService(Binder binder) {\n" + 
				"		binder.bind(ExecutorService.class).toProvider(ExecutorServiceProvider.class);\n" + 
				"	}" +
				"}";
		
		String content = String.format(template, pkg, dslQualifier, dslQualifier, serviceInterface, serviceClass);
		
		try {
			if(!Files.exists(pkgPath)) {
				Files.createDirectories(pkgPath);
			}
			if(!Files.exists(resPath)) {
				Files.createFile(resPath);				
			}
			Files.writeString(resPath, content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected Grammar loadGrammarString(String xtextUri) {
		XtextResourceSet rs = new XtextResourceSet();
		Resource res = rs.getResource(URI.createURI(xtextUri), true);
		Grammar root = (Grammar) res.getContents().get(0);
		return root;
	}
	
	protected void updateInternals(Feature service, String xtextUri, String containingFolder) {
		Grammar grammar = loadGrammarString(xtextUri);
		String dslQualifiedName = grammar.getName();
		String dslSimpleName = dslQualifiedName.substring(dslQualifiedName.lastIndexOf(".")+1);
		String dslQualifier = dslQualifiedName.substring(0, dslQualifiedName.lastIndexOf("."));
		
		updateLexer(service.getName(),dslQualifier,dslSimpleName,containingFolder);
		updateParser(service.getName(),dslQualifier,dslSimpleName,containingFolder);
	}
	
	protected static void updateLexer(String serviceName, String dslQualifier, String dslName, String containingFolder) {
		String pkg = dslQualifier.replaceAll("\\.", "/");
		Path lexerPath = Paths.get(containingFolder+"/"+serviceName+"/src-gen/"+pkg+"/ide/contentassist/antlr/internal/Internal"+dslName+"Lexer.java");
		try {
			String oldContent = Files.readString(lexerPath);
			String oldImport = "import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;";
			String newImport = "import kaulua.contentassist.antlr.internal.Lexer;";
			String newContent = oldContent.replace(oldImport, newImport);
			Files.writeString(lexerPath, newContent);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected static void updateParser(String serviceName, String dslQualifier, String dslName, String containingFolder) {
		String pkg = dslQualifier.replaceAll("\\.", "/");
		Path lexerPath = Paths.get(containingFolder+"/"+serviceName+"/src-gen/"+pkg+"/ide/contentassist/antlr/internal/Internal"+dslName+"Parser.java");
		try {
			String oldContent = Files.readString(lexerPath);
			String oldImport = "import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;";
			String newImport = "import kaulua.contentassist.antlr.internal.AbstractInternalContentAssistParser;";
			String newContent = oldContent.replace(oldImport, newImport);
			oldImport = "import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;";
			newImport = "import kaulua.contentassist.antlr.internal.DFA;";
			newContent = newContent.replace(oldImport, newImport);
			Files.writeString(lexerPath, newContent);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

