package kaulua.fm.generator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import fr.inria.diverse.kaulua.Capability;
import fr.inria.diverse.kaulua.Dependency;
import fr.inria.diverse.kaulua.Feature;
import fr.inria.diverse.kaulua.Protocol;

public class RestServiceGenerator implements IServiceGenerator {

	@Override
	public void generate(Feature service, String dslName, String xtextUri, String containingFolder) {
		createCalledResources(service, dslName, containingFolder);
		createResource(service, dslName, containingFolder);
	}

	@Override
	public boolean canHandle(Feature service) {
		return true;
	}

	protected void createCalledResources(Feature service, String dslName, String containingFolder) {
		Map<Feature, List<Capability>> usedCapabilities = new HashMap<>();
		List<Dependency> connections = getDependencies(service);
		for (Dependency conn : connections) {
			Feature calledService = (Feature) conn.getCallee().eContainer();
			Capability calledCapability = conn.getCallee();
			List<Capability> used = usedCapabilities.get(calledService);
			if (used == null) {
				used = new LinkedList<>();
				usedCapabilities.put(calledService, used);
			}
			used.add(calledCapability);
		}

		for (Entry<Feature, List<Capability>> entry : usedCapabilities.entrySet()) {
			createCalledResources(service, dslName, entry.getKey(), entry.getValue(), containingFolder);
		}
	}

	protected void createCalledResources(Feature service, String dslName, Feature calledService,
			List<Capability> usedCapabilities, String containingFolder) {
		String serviceName = service.getName();
		String className = calledService.getName() + "Resource";
		String pkg = dslName.replaceAll("\\.", "/");
		Path pkgPath = Paths.get(containingFolder + "/" + serviceName + "/src/main/java/" + pkg);
		Path resPath = Paths
				.get(containingFolder + "/" + serviceName + "/src/main/java/" + pkg + "/" + className + ".java");

		String head = "package %s;\n" + "\n" + "import javax.ws.rs.GET;\n" + "import javax.ws.rs.POST;\n"
				+ "import javax.ws.rs.Path;\n" + "import javax.ws.rs.QueryParam;\n" + "import javax.ws.rs.Produces;\n"
				+ "import javax.ws.rs.Consumes;\n" + "import javax.ws.rs.core.MediaType;\n" + "\n"
				+ "import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;\n" + "\n" + "@Path(\"/\")\n"
				+ "@RegisterRestClient\n" + "public interface %s {\n" + "\n";
		String tail = "}\n" + "";

		StringBuilder sb = new StringBuilder();
		sb.append(head);
		for (Capability usedCapability : usedCapabilities) {
			
			JsonObject capabilityDefinition = loadDefinitionFile(usedCapability);
			JsonArray arguments = capabilityDefinition.getAsJsonArray("arguments");
			
			boolean hasBody = false;
			List<String> methodArgs = new ArrayList<>();
			for(int i = 0; i < arguments.size(); i++) {
				String argName = arguments.get(i).getAsString();
				if(argName.equals("message")) {
					methodArgs.add("String " + argName);
					hasBody = true;
				}
				else {
					methodArgs.add("@QueryParam(\"" + argName + "\") String " + argName);
				}
			}
			
			String params = methodArgs.stream().collect(Collectors.joining(","));

			if (hasBody) {
				sb.append("	@POST\n");
			} else {
				sb.append("	@GET\n");
			}
			sb.append("	@Consumes(MediaType.TEXT_PLAIN)\n");
			sb.append("	@Produces(MediaType.TEXT_PLAIN)\n");
			sb.append("	@Path(\"/" + usedCapability.getName() + "\")\n");
			sb.append("	String " + usedCapability.getName() + "(" + params + ");\n");
			sb.append("	\n");
		}
		sb.append(tail);
		String template = sb.toString();

		String content = String.format(template, pkg, className);

		try {
			if (!Files.exists(pkgPath)) {
				Files.createDirectories(pkgPath);
			}
			if (!Files.exists(resPath)) {
				Files.createFile(resPath);
			}
			Files.writeString(resPath, content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<Dependency> getDependencies(Feature service) {
		List<Dependency> res = new ArrayList<>();

		Protocol protocol = (Protocol) service.eContainer();

		for (Dependency conn : protocol.getDependencies()) {
			if (conn.getCaller().eContainer() == service) {
				res.add(conn);
			}
		}

		return res;
	}

	protected void createResource(Feature service, String dslName, String containingFolder) {
		String serviceName = service.getName();
		String className = serviceName + "Resource";
		String path = "/" + serviceName;
		String pkg = dslName.replaceAll("\\.", "/");
		Path pkgPath = Paths.get(containingFolder + "/" + serviceName + "/src/main/java/" + pkg);
		Path resPath = Paths
				.get(containingFolder + "/" + serviceName + "/src/main/java/" + pkg + "/" + className + ".java");

		StringBuilder contentBuilder = new StringBuilder();
		String templateBegin = "package %s;\n" + "\n" + "import javax.ws.rs.GET;\n" + "import javax.ws.rs.Path;\n"
				+ "import javax.ws.rs.QueryParam;\n" + "import javax.ws.rs.Produces;\n"
				+ "import javax.ws.rs.core.MediaType;\n" + "\n" + "@Path(\"%s\")\n" + "public class %s {\n" + "\n";

		String templateEnd = "}\n" + "";

		contentBuilder.append(templateBegin);
		for (Capability capability : service.getCapabilities()) {
			
			JsonObject capabilityDefinition = loadDefinitionFile(capability);
			JsonArray arguments = capabilityDefinition.getAsJsonArray("arguments");
			List<String> methodArgs = new ArrayList<>();
			for(int i = 0; i < arguments.size(); i++) {
				String argName = arguments.get(i).getAsString();
				methodArgs.add("@QueryParam(\"" + argName + "\") String " + argName);
			}
			String args = methodArgs.stream().collect(Collectors.joining(","));
			String returnType = capabilityDefinition.get("returnType").getAsString();
			
			String mtdContent = "        \n";
			if (!returnType.equals("void")) {
				mtdContent = "        return null;\n";
			}

			String templateMtd = "    @GET\n" + "    @Produces(MediaType.TEXT_PLAIN)\n" + "    public " + returnType
					+ " " + capability.getName() + "(" + args + ") {\n" + mtdContent + "    }\n";

			contentBuilder.append(templateMtd);
			contentBuilder.append("\n");
		}
		contentBuilder.append(templateEnd);

		String content = String.format(contentBuilder.toString(), pkg, path, className);

		try {
			if (!Files.exists(pkgPath)) {
				Files.createDirectories(pkgPath);
			}
			if (!Files.exists(resPath)) {
				Files.createFile(resPath);
			}
			Files.writeString(resPath, content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected JsonObject loadDefinitionFile(Capability capability) {
		String filePath = capability.getDefinitionFile();

		
		String jsonText = "{}";
		try {
			URL url = new URL(filePath);
		    InputStream inputStream = url.openConnection().getInputStream();
		    jsonText = new BufferedReader(
		  	      new InputStreamReader(inputStream, StandardCharsets.UTF_8))
		  	        .lines()
		  	        .collect(Collectors.joining("\n"));
//			jsonText = new String(Files.readAllBytes(Paths.get(filePath)));
		} catch (IOException e) {
			e.printStackTrace();
		}

		JsonParser parser = new JsonParser();
		return (JsonObject) parser.parse(jsonText);

	}

}
