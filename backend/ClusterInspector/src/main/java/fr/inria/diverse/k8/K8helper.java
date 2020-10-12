package fr.inria.diverse.k8;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.squareup.okhttp.Call;

import io.kubernetes.client.ApiCallback;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.models.V1ContainerPort;
import io.kubernetes.client.models.V1Node;
import io.kubernetes.client.models.V1NodeList;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1PodBuilder;
import io.kubernetes.client.models.V1PodList;
import io.kubernetes.client.models.V1Service;
import io.kubernetes.client.models.V1ServiceBuilder;
import io.kubernetes.client.models.V1ServicePort;
import io.kubernetes.client.models.V1Status;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.Config;

public class K8helper {

	public static final String NODE_LABEL = "kaulua-selector";
	public static final String KAULUA_IMG_PRFIX = "kaulua/";
	public static final String LANG_IMG_PRFIX = "nablab/";

	/*
	 * configuration : feature -> node
	 */
	public static void updateDeployment(Map<String, String> configuration, String clusterConfigPath) {
		
		System.out.println("Received configuration: " + configuration);
		
		// Init
		try {
			ApiClient client = Config.fromConfig(clusterConfigPath);
//			client.setDebugging(true);
			Configuration.setDefaultApiClient(client);
		} catch (IOException e) {
			e.printStackTrace();
		}

		CoreV1Api api = new CoreV1Api();

		// Get current state
		List<V1Pod> currentDeployement = getPods(api);
		System.out.println("Current deployment: "+ currentDeployement.stream().map(p->p.getMetadata().getName()).collect(Collectors.toList()) );

		// Init DB if not present
		if (!findCurrentPod(currentDeployement, "mongo-db").isPresent()) {
			V1Pod pod_mongo = createPod("mongo-db", "mongo:4.0", Optional.of(27017), Optional.ofNullable("node1"));
			V1Service service_mongo = createService("mongo-db", "mongo-db", Optional.of(27017), Optional.of(27017),
					Optional.of("TCP"));
			try {
				api.createNamespacedPod("default", pod_mongo, null, null, null);
				api.createNamespacedService("default", service_mongo, null, null, null);
			} catch (ApiException e1) {
				e1.printStackTrace();
			}
		}

		// Create or replace existing features
		for (Entry<String, String> entry : configuration.entrySet()) {
			String featureName = entry.getKey();
			String selectedNode = entry.getValue();

			Optional<V1Pod> currentPod = findCurrentPod(currentDeployement, featureName);
			if (currentPod.isPresent()) {
				String label = currentPod.get().getSpec().getNodeSelector().get(NODE_LABEL);
				if (label != null && !label.equals(selectedNode)) {
					deleteFeature(api, featureName);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					deployFeature(api, featureName, selectedNode);
				}
			} else {
				deployFeature(api, featureName, selectedNode);
			}
		}

		// Delete features
		System.out.println("To del: "+findDeletedFeatures(currentDeployement, configuration.keySet()));
		for (String toDelete : findDeletedFeatures(currentDeployement, configuration.keySet())) {
			System.out.println("Delete: "+toDelete);
			deleteFeature(api, toDelete);
		}
	}

	protected static Optional<V1Pod> findCurrentPod(List<V1Pod> currentDeployement, String podName) {
		return currentDeployement.stream().filter(pod -> pod.getMetadata().getName().equals(podName)).findFirst();
	}

	protected static List<String> findDeletedFeatures(List<V1Pod> currentDeployement, Set<String> featureNames) {
		return currentDeployement.stream().filter(pod -> !featureNames.contains(pod.getMetadata().getName()))
				.filter(pod -> !"mongo-db".equals(pod.getMetadata().getName()))
				.filter(pod -> !"storage".equals(pod.getMetadata().getName()))
				.filter(pod -> !"deployer".equals(pod.getMetadata().getName()))
				.filter(pod -> !pod.getMetadata().getName().startsWith("jaeger"))
				.map(pod -> pod.getMetadata().getName()).collect(Collectors.toList());
	}

	protected static void deployFeature(CoreV1Api api, String featureName, String selectedNode) {
		System.out.println("Deploy: " + featureName + " on " + selectedNode);
		V1Pod pod = null;
		if (isKaulua(featureName)) {
			pod = createPod(featureName, KAULUA_IMG_PRFIX + featureName, Optional.of(8080),
					Optional.ofNullable(selectedNode));
		} else {
			pod = createPod(featureName, LANG_IMG_PRFIX + featureName, Optional.of(8080),
					Optional.ofNullable(selectedNode));
		}
		V1Service service = createService(featureName, featureName, Optional.of(8080), getPort(featureName, 8080),
				Optional.of("TCP"));
		try {
			api.createNamespacedPod("default", pod, null, null, null);
			api.createNamespacedService("default", service, null, null, null);
		} catch (ApiException e) {
			e.printStackTrace();
		}
	}

	protected static void deleteFeature(CoreV1Api api, String featureName) {
		System.out.println("Feat: " +featureName);
		try {
			V1Status status = api.deleteNamespacedPod(featureName, "default", null, null, null, null, null, null);
			System.out.println(status.toString());
		} catch (Exception e) {
			if (e.getCause() instanceof IllegalStateException) {
                IllegalStateException ise = (IllegalStateException) e.getCause();
                if (ise.getMessage() != null && ise.getMessage().contains("Expected a string but was BEGIN_OBJECT")) {
                	System.out.println("Catching exception because of issue https://github.com/kubernetes-client/java/issues/86");
                }
                else e.printStackTrace();
            }
			else {
				e.printStackTrace();
			}
			
		}
		try {
			api.deleteNamespacedService(featureName, "default", null, null, null, null, null, null);
		} catch (Exception e) {
			if (e.getCause() instanceof IllegalStateException) {
                IllegalStateException ise = (IllegalStateException) e.getCause();
                if (ise.getMessage() != null && ise.getMessage().contains("Expected a string but was BEGIN_OBJECT"))
                   System.out.println("Catching exception because of issue https://github.com/kubernetes-client/java/issues/86");
                else e.printStackTrace();
            }
			else {
				e.printStackTrace();
			}
		}
	}

	protected static List<V1Pod> getPods(CoreV1Api api) {
		try {
			V1PodList pods = api.listNamespacedPod("default", null, null, null, null, null, null, null, null, null);
			return pods.getItems();
		} catch (ApiException e) {
			e.printStackTrace();
		}

		return new LinkedList<>();
	}

	protected static V1Pod createPod(String podName, String dockerImage, Optional<Integer> port,
			Optional<String> selectedNode) {

		List<V1ContainerPort> containerPorts = new LinkedList<>();
		if (port.isPresent()) {
			V1ContainerPort containerPort = new V1ContainerPort();
			containerPort.setContainerPort(port.get());
		}

		Map<String, String> nodeSelectors = new HashMap<>();
		if (selectedNode.isPresent()) {
			nodeSelectors.put(NODE_LABEL, selectedNode.get());
		}

		if (podName.equals("deployer")) {
			V1Pod pod = new V1PodBuilder().withNewMetadata().withName(podName.toLowerCase())
					.addToLabels("app", podName.toLowerCase()).endMetadata().withNewSpec().addNewContainer()
					.withName(podName.toLowerCase()).withImage(dockerImage).withPorts(containerPorts)
					.withImagePullPolicy("IfNotPresent").endContainer().addToNodeSelector(nodeSelectors).endSpec()
					.build();
			return pod;
		}

		V1Pod pod = new V1PodBuilder()
				.withNewMetadata()
					.withName(podName.toLowerCase())
					.addToLabels("app", podName.toLowerCase())
				.endMetadata()
				.withNewSpec()
					.addNewContainer()
						.withName(podName.toLowerCase())
						.withImage(dockerImage)
						.withPorts(containerPorts)
						.withImagePullPolicy("IfNotPresent")
					.endContainer()
					.addToNodeSelector(nodeSelectors)
				.endSpec()
				.build();

		return pod;
	}

	protected static V1Service createService(String serviceName, String podSelector, Optional<Integer> innerPort,
			Optional<Integer> externalPort, Optional<String> protocol) {

		List<V1ServicePort> servicePorts = new LinkedList<>();
		if (innerPort.isPresent() && externalPort.isPresent()) {
			V1ServicePort port = new V1ServicePort();
			port.setTargetPort(new IntOrString(innerPort.get()));
			port.setPort(externalPort.get());
			if (protocol.isPresent()) {
				port.setProtocol(protocol.get());
			}
			servicePorts.add(port);
		}

		Map<String, String> serviceSelectors = new HashMap<>();
		serviceSelectors.put("app", podSelector.toLowerCase());

		V1Service srv = new V1ServiceBuilder().withNewMetadata().withName(serviceName.toLowerCase()).endMetadata()
				.withNewSpec().withPorts(servicePorts).withSelector(serviceSelectors).withType("NodePort").endSpec()
				.build();

		return srv;
	}
	
	protected static boolean isKaulua(String serviceName) {
		return serviceName.equals("router") || serviceName.equals("storage") || serviceName.equals("deployer");
	}
	
	protected static Optional<Integer> getPort(String service, int defaultPort) {
		
		if(service.equals("router")) {
			return Optional.of(8080);
		}
		
		if(service.equals("diagram")) {
			return Optional.of(8082);
		}
		
		if(service.equals("form")) {
			return Optional.of(8085);
		}
		
		if(service.equals("deployer")) {
			return Optional.of(8084);
		}
		
		if(service.equals("storage")) {
			return Optional.of(8086);
		}
		
		return Optional.of(defaultPort);
	}
	
	public static List<String> getNodes(String clusterConfigPath) {
		LinkedList<String> res = new LinkedList<String>();
		try {			
			ApiClient client = Config.fromConfig(clusterConfigPath);
			Configuration.setDefaultApiClient(client);
			CoreV1Api api = new CoreV1Api();
			V1NodeList nodeList = api.listNode(true, null, null, null, null, null, null, null, false);
			List<V1Node> nodes = nodeList.getItems();
			
			for(V1Node node : nodes) {
				
				String label = node.getMetadata().getLabels().get(NODE_LABEL);
				if(label != null) {
					res.add(label);
				}
			}
			
		} catch (IOException | ApiException e) {
			if(e instanceof ApiException) {
				System.out.println(((ApiException) e).getResponseBody());
			}
			e.printStackTrace();
		}
		
		return res;
	}
	
	public static Map<String, String> getDeployment(String clusterConfigPath) {
		Map<String, String> configuration = new HashMap<>();
		
		// Init
		try {
			ApiClient client = Config.fromConfig(clusterConfigPath);
			Configuration.setDefaultApiClient(client);
		} catch (IOException e) {
			e.printStackTrace();
		}

		CoreV1Api api = new CoreV1Api();

		// Get current state
//		V1NodeList nodeList = api.listNode(true, null, null, null, null, null, null, null, false);
//		Map<String,V1Node> locations = new HashMap<>();
//		List<V1Node> nodes = nodeList.getItems();
//		for(V1Node node : nodes) {
//			String label = node.getMetadata().getLabels().get(NODE_LABEL);
//			if(label != null) {
//				locations.put(label, node);
//			}
//		}
		List<V1Pod> currentDeployement = getPods(api);
		
		for(V1Pod pod : currentDeployement) {
			String name = pod.getMetadata().getName();
			if(pod.getSpec().getNodeSelector() != null) {
				String nodeSelector = pod.getSpec().getNodeSelector().get(NODE_LABEL);
				System.out.println(name +" -> " + nodeSelector);
				if(name != null && nodeSelector != null) {
					configuration.put(name, nodeSelector);
				}				
			}
		}
		
		return configuration;
	}
}
