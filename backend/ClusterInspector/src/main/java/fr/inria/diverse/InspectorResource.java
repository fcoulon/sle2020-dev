package fr.inria.diverse;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.json.JSONArray;
import org.json.JSONObject;

import fr.inria.diverse.k8.K8helper;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1Service;
import io.kubernetes.client.util.Config;

@Path("/")
public class InspectorResource {
	
	@Inject
    @RestClient
    Router router;

	@GET
	@Path("/urls")
	@Produces(MediaType.TEXT_PLAIN)
	public String getUrls() {
		try {
			String configFile = ConfigProvider.getConfig().getValue("kube.config", String.class);
			System.out.println(configFile);
			ApiClient client = Config.fromConfig(configFile);
			Configuration.setDefaultApiClient(client);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		CoreV1Api api = new CoreV1Api();
		
		String routerIP = getIp("router",api);
		String storageIP = getIp("storage",api);
		
		JSONObject node2 = new JSONObject();
		node2.put("service", "router");
		node2.put("url", routerIP);
		
		JSONObject node3 = new JSONObject();
		node3.put("service", "storage");
		node3.put("url", storageIP);
		
		JSONObject list = new JSONObject();
		list.put("services",List.of(node2,node3));
		
		return list.toString();
	}
	
	public static String getIp(String service, CoreV1Api api) {
		
		try {
			V1Pod pod = api.readNamespacedPod(service, "default", null, null, null);
			V1Service srv = api.readNamespacedService(service, "default", null, null, null);
			
			return "http://"+pod.getStatus().getHostIP()+":"+srv.getSpec().getPorts().get(0).getNodePort();
			
		} catch (ApiException e) {
			e.printStackTrace();
		}
		
		return "none";
	}
	
	@POST
	@Path("/deploy")
	public static void updateDeployment(String deployment) {
		
//		type DeploymentProgressProps = {
//			    config: NodeConfig[]
//			}
//
//			type NodeConfig = {
//			    nodeName: string
//			    features: string[]
//			}
		
		Map<String,String> configuration = new HashMap<>();
		
		JSONArray nodeConfigs = new JSONArray(deployment);
		for(int i = 0; i < nodeConfigs.length(); i++) {
			JSONObject nodeConfig = nodeConfigs.getJSONObject(i);
			String featureName = nodeConfig.getString("featureName");
			String nodeName = nodeConfig.getString("deploymentLocation");
			configuration.put(featureName, nodeName);
//			JSONArray jFeatures = nodeConfig.getJSONArray("features");
//			List<String> features = jFeatures.toList().stream().map(o -> o.toString()).collect(Collectors.toList());
//			for(String feature : features) {
//				configuration.put(feature, nodeName);
//			}
		}
		
		for(Entry<String,String> entry : configuration.entrySet() ) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		String configFile = ConfigProvider.getConfig().getValue("kube.config", String.class);
		K8helper.updateDeployment(configuration, configFile);
	}
	
	@GET
	@Path("/deployment")
	@Produces(MediaType.TEXT_PLAIN)
	public String getDeployment() {
		String configFile = ConfigProvider.getConfig().getValue("kube.config", String.class);
		Map<String, String> configuration = K8helper.getDeployment(configFile);
		
		JSONArray nodeConfigs = new JSONArray();
		for(Entry<String, String> entry : configuration.entrySet()) {
			JSONObject nodeConfig =  new JSONObject();
			nodeConfig.put("featureName", entry.getKey());
			nodeConfig.put("deploymentLocation", entry.getValue());
			nodeConfigs.put(nodeConfig);
		}
		
		return nodeConfigs.toString();
	}
	
	@GET
	@Path("/nodes")
	@Produces(MediaType.APPLICATION_JSON)
	public static List<String> nodes() {
		String configFile = ConfigProvider.getConfig().getValue("kube.config", String.class);
		return K8helper.getNodes(configFile);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/views")
	public List<String> getActiveViews() {
		List<String> config = new LinkedList<String>();
		
		try {
			if(router.check().contains("UP")) {
				config.add("Text editor");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return config;
	}
}