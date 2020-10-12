package kaulua.fm.generator;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.inria.diverse.kaulua.Feature;
import fr.inria.diverse.kaulua.Protocol;

public class ScriptGenerator {
	
	static String BUILDIMAGES_FILE_NAME = "build-images.sh";
	static String LOADIMAGES_FILE_NAME = "load-images.sh";
	static String DEPLOYMENT_FILE_NAME = "deployment.yaml";
	static String COMPOSE_FILE_NAME = "docker-compose.yml";
	static String CLUSTERCONFIG_FILE_NAME = "config_cluster.yaml";
	static String SETUPCLUSTER_FILE_NAME = "setup-cluster.sh";
	static int NUMBER_OF_WORKERS = 2;
	
	public static void generateScripts(File file) {
		
		Properties dsl = MavenGenerator.loadPropertiesFile(file.getLocation().toString());
		String xtextPath = dsl.getProperty("xtext");
		String protocolPath = dsl.getProperty("protocol");
//		String xtextPath = "platform:/resource/" + file.getProject().getName() + "/" + file.getProjectRelativePath();
		int nameStart = xtextPath.lastIndexOf("/") + 1;
		int nameEnd = xtextPath.lastIndexOf(".xtext");
		String dslName = dsl.getProperty("name");
		
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.createResource(URI.createURI("inmemory:/mode.kaulua"));
		try {
//			URL url = new URL("platform:/plugin/kaulua.fm.generator/lsp.kaulua");
			URL url = new URL(protocolPath);
		    InputStream inputStream = url.openConnection().getInputStream();
//			InputStream inputStream = file.getContents();
			res.load(inputStream, new HashMap<>());
			Protocol protocol = (Protocol) res.getContents().get(0);
			
			String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
			String containingFolder = wsPath + "/" + dslName;
			
			generateImageBuildScript(protocol,dslName,containingFolder);
			generateImageLoadScript(protocol,dslName,containingFolder);
			generateDeploymentConfig(protocol,dslName,containingFolder);
//			generateClusterSetupScript(protocol, dslName,NUMBER_OF_WORKERS, containingFolder);
//			generateDockerCompose(protocol,dslName,containingFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void generateImageBuildScript(Protocol protocol, String dslName, String containingFolder) {
		StringBuilder builder = new StringBuilder();
		builder.append("#!/bin/bash\n");
		builder.append("\n");
//		builder.append("cd "+ containingFolder +"\n");
		builder.append("\n");
		
		for(Feature service : protocol.getFeatures()) {
			if(isGenerated(service)) {
				builder.append("cd " + service.getName()+"\n");
				builder.append("mvn package\n");
				builder.append("docker build -f src/main/docker/Dockerfile.jvm -t "+ getImageName(service, dslName) +" .\n");
				builder.append("cd ..\n");
				builder.append("\n");
			}
		}
		
//		builder.append("cd ../feature-model\n");
//		builder.append("mvn package\n");
//		builder.append("docker build -f src/main/docker/Dockerfile.jvm -t "+ dslName +"/feature-model .\n");
//		builder.append("cd -\n");
//		builder.append("\n");
		
		String content = builder.toString();
		String outputFile = containingFolder + "/" + BUILDIMAGES_FILE_NAME;
		try {
			Files.write(Paths.get(outputFile), content.getBytes());
			Files.setPosixFilePermissions(Paths.get(outputFile), Set.of(PosixFilePermission.OWNER_READ, PosixFilePermission.OWNER_WRITE, PosixFilePermission.OWNER_EXECUTE));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void generateImageLoadScript(Protocol protocol, String dslName, String containingFolder) {
		StringBuilder builder = new StringBuilder();
		builder.append("#!/bin/bash\n");
		builder.append("\n");
		builder.append("cd "+ containingFolder +"\n");
		builder.append("\n");
		
		for(Feature service : protocol.getFeatures()) {
			if(isGenerated(service)) {
				builder.append("echo \"" + getImageName(service, dslName) + "\"\n");
				builder.append("kind load docker-image "+ getImageName(service, dslName) +" --name clusterone\n");
				builder.append("\n");
			}
		}
		
		String content = builder.toString();
		String outputFile = containingFolder + "/" + LOADIMAGES_FILE_NAME;
		try {
			Files.write(Paths.get(outputFile), content.getBytes());
			Files.setPosixFilePermissions(Paths.get(outputFile), Set.of(PosixFilePermission.OWNER_READ, PosixFilePermission.OWNER_WRITE, PosixFilePermission.OWNER_EXECUTE));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void generateDeploymentConfig(Protocol protocol, String dslName, String containingFolder) {
		StringBuilder builder = new StringBuilder();
		builder.append("---\n" + 
				"apiVersion: \"v1\"\n" + 
				"kind: \"List\"\n" + 
				"items:\n");
		
		for(Feature service : protocol.getFeatures()) {
			if(isGenerated(service)) {
				builder.append("- apiVersion: \"v1\"\n" + 
						"  kind: \"Pod\"\n" + 
						"  metadata:\n" + 
						"    labels:\n" + 
						"      app: "+service.getName().toLowerCase()+"\n" + 
						"    name: "+service.getName().toLowerCase()+"\n" + 
						"  spec:\n" + 
						"    containers:\n" + 
						"    - image: "+getImageName(service, dslName)+"\n" + 
						"      imagePullPolicy: IfNotPresent\n" + 
						"      name: "+service.getName().toLowerCase()+"\n" + 
						"      ports: []\n" + 
						"    nodeSelector:\n" + 
						"      kaulua-selector: node1\n");
				builder.append("- apiVersion: \"v1\"\n" + 
						"  kind: \"Service\"\n" + 
						"  metadata:\n" + 
						"    name: "+service.getName().toLowerCase()+"\n" + 
						"  spec:\n" + 
						"    type: NodePort\n" + 
						"    ports:\n" + 
						"    - port: 8080\n" + 
						"      protocol: TCP\n" + 
						"      targetPort: 8080\n" + 
						"    selector:\n" + 
						"      app: "+ service.getName().toLowerCase()+"\n");
			}
		}
		
		String content = builder.toString();
		String outputFile = containingFolder + "/" + DEPLOYMENT_FILE_NAME;
		try {
			Files.write(Paths.get(outputFile), content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void generateClusterSetupScript(Protocol protocol, String dslName, int numberOfWorkers, String containingFolder) {
		String head = 
		"kind: Cluster\n" + 
		"apiVersion: kind.sigs.k8s.io/v1alpha3\n" + 
		"nodes:\n" + 
		"- role: control-plane";
		
		StringBuilder configBuilder = new StringBuilder();
		configBuilder.append(head+"\n");
		for(int i = 0; i < numberOfWorkers; i++) {
			configBuilder.append("- role: worker\n");
		}
		
		StringBuilder scriptBuilder = new StringBuilder();
		scriptBuilder.append("#!/bin/bash\n");
		scriptBuilder.append("\n");
		scriptBuilder.append("# Create cluster nodes\n");
		scriptBuilder.append("kind create cluster --config " + CLUSTERCONFIG_FILE_NAME +"\n");
		scriptBuilder.append("\n");
		scriptBuilder.append("# Create account on the cluster for Tiller\n");
		scriptBuilder.append("kubectl apply -f https://raw.githubusercontent.com/Microsoft/k8s-On-demand-micro-services-deployment/master/rbac-example/tiller.yaml\n");
		scriptBuilder.append("\n");
		scriptBuilder.append("# Setup Helm\n");
		scriptBuilder.append("helm init --service-account tiller\n");
		scriptBuilder.append("\n");
		scriptBuilder.append("# Load docker images in the cluster\n");
		for(Feature service : protocol.getFeatures()) {
			scriptBuilder.append("kind load docker-image "+ getImageName(service, dslName) +" \n");
		}
		scriptBuilder.append("\n");
		scriptBuilder.append("# Deploy chartmuseum in the cluster\n");
		scriptBuilder.append("helm install --name my-chartmuseum stable/chartmuseum --set service.type=NodePort --set env.open.DISABLE_API=false\n");
		scriptBuilder.append("\n");
		scriptBuilder.append("# Add chartmuseum to helm\n");
		scriptBuilder.append("export NODE_PORT=$(kubectl get --namespace default -o jsonpath=\"{.spec.ports[0].nodePort}\" services my-chartmuseum-chartmuseum)\n");
		scriptBuilder.append("export NODE_IP=$(kubectl get nodes --namespace default -o jsonpath=\"{.items[0].status.addresses[0].address}\")\n");
		scriptBuilder.append("export CHARTMUSEUM_URL=http://$NODE_IP:$NODE_PORT/\n");
		scriptBuilder.append("helm repo add chartmuseum $CHARTMUSEUM_URL\n");
		
		String configContent = configBuilder.toString();
		String scriptContent = scriptBuilder.toString();
		String outputConfigFile = containingFolder + "/" + CLUSTERCONFIG_FILE_NAME;
		String outputScriptFile = containingFolder + "/" + SETUPCLUSTER_FILE_NAME;
		try {
			Files.write(Paths.get(outputConfigFile), configContent.getBytes());
			Files.write(Paths.get(outputScriptFile), scriptContent.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static String getImageName(Feature service, String dslName) {
		Protocol protocol = (Protocol) service.eContainer();
		String serviceName = service.getName().toLowerCase();
		return dslName+"/"+serviceName;
	}
	
	public static void generateDockerCompose(Protocol protocol, String dslName, String containingFolder) {
		StringBuilder builder = new StringBuilder();
		builder.append("version: '3'\n" + 
				"services:\n");
		
		builder.append(
				"  router:\n" + 
				"    image: \"kaulua/lsp-router\"\n" + 
				"    ports:\n" + 
				"     - \"8080:8080\"\n" +
				"  storage:\n" + 
				"    image: \"kaulua/document-storage\"\n" + 
				"    ports:\n" + 
				"     - \"8081:8080\"\n" + 
				"  mongo-db:\n" + 
				"    image: \"mongo:4.0\"\n");
		for(Feature service : protocol.getFeatures()) {
			if(isGenerated(service)) {
				builder.append(
						"  "+service.getName()+":\n" +
								"    image: \""+getImageName(service, dslName)+"\"\n");
			}
		}
		
		String content = builder.toString();
		String outputFile = containingFolder + "/" + COMPOSE_FILE_NAME;
		try {
			Files.write(Paths.get(outputFile), content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isGenerated(Feature feature) {
		return !feature.getName().equals("router") && !feature.getName().equals("storage");
	}
}
