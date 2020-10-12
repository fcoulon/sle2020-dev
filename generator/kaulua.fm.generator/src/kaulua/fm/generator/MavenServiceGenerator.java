package kaulua.fm.generator;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import fr.inria.diverse.kaulua.Feature;

public class MavenServiceGenerator implements IServiceGenerator {

	@Override
	public void generate(Feature service, String dslName, String xtextUri, String containingFolder) {
		String artifactId = service.getName();
		Job createJob = createMavenJob(dslName, artifactId, containingFolder);
		createJob.schedule();
		try {
			createJob.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String className = service.getName() + "Resource";
		String path = "/";
		List<String> capabilities = service.getCapabilities().stream().map(c -> c.getName()).collect(Collectors.toList());
		createResource(dslName, service.getName(), className, path, capabilities, containingFolder);
	}

	@Override
	public boolean canHandle(Feature service) {
		return true;
	}

	public static Job createMavenJob(String groupId, String artifactId, String containingFolder) {
		Job job = new Job("Generate " + groupId + "." + artifactId) {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				String mvn = "mvn";
				String groupIdArg = "-DprojectGroupId=" + groupId;
				String artifactIdArg = "-DprojectArtifactId=" + artifactId;
				String archetypeArg = "io.quarkus:quarkus-maven-plugin:1.7.3.Final:create";
				String restClientExt = "-Dextensions=rest-client,health";
				try {
		          Process p = new ProcessBuilder(new String[] {mvn,archetypeArg,groupIdArg,artifactIdArg,restClientExt})
		          		.directory(new java.io.File(containingFolder))
		          		.redirectError(Redirect.INHERIT)
		                .redirectOutput(Redirect.INHERIT)
		                .start();
		          p.waitFor();
		      } catch (IOException | InterruptedException e) {
		          e.printStackTrace();
		          return Status.CANCEL_STATUS;
		      }
				return Status.OK_STATUS;
			}
		};
		return job;
	}
	
	public static void createResource(String dslName, String serviceName, String className, String path, List<String> capabilities, String containingFolder) {
		String pkg = dslName.replaceAll("\\.", "/");
		Path pkgPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg);
		Path resPath = Paths.get(containingFolder+"/"+serviceName+"/src/main/java/"+pkg+"/"+className+".java");
		
		String headTemplate = 
				"package %s;\n" + 
				"\n" + 
				"import javax.ws.rs.GET;\n" + 
				"import javax.ws.rs.Path;\n" + 
				"import javax.ws.rs.Produces;\n" + 
				"import javax.ws.rs.core.MediaType;\n" + 
				"\n" + 
				"@Path(\"%s\")\n" + 
				"public class %s {\n" + 
				"\n";
				
		
		String tailTemplate = 
				"}\n" + 
				"";
		
		String capTemplate = 
				"    @GET\n" + 
				"    @Path(\"%s\")\n" +
				"    @Produces(MediaType.TEXT_PLAIN)\n" + 
				"    public String %s() {\n" + 
				"        return \"hello\";\n" + 
				"    }\n\n";
		
		StringBuilder sb = new StringBuilder();
		String head = String.format(headTemplate, dslName, path, className);
		sb.append(head);
		for(String capability : capabilities) {
			String cap = String.format(capTemplate, capability, capability);
			sb.append(cap);
		}
		sb.append(tailTemplate);
		
		String content = sb.toString();
		
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
}
