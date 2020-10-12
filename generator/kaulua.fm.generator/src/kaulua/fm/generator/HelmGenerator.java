package kaulua.fm.generator;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import fr.inria.diverse.kaulua.Feature;
import fr.inria.diverse.kaulua.Protocol;

public class HelmGenerator {
	
	static String DEPLOYCHART_FILE_NAME = "deploy-charts.sh";
	
	public static void generateHelmCharts(File file) {
		
//		ResourceSet rs = new ResourceSetImpl();
//		Resource res = rs.createResource(URI.createURI("inmemory:/mode.kaulua"));
//		try {
//			InputStream inputStream = file.getContents();
//			res.load(inputStream, new HashMap<>());
//			generateCharts((Workbench) res.getContents().get(0));
//			generateChartProvisionningScript((Workbench) res.getContents().get(0));
//		} catch (IOException | CoreException e) {
//			e.printStackTrace();
//		}
	}
	
	public static void generateCharts(Protocol protocol, String dslName) {
		List<Job> jobs = createJobs(protocol);
		for(Job job : jobs) {
			job.schedule();
			try {
				job.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
		updateValuesFiles(protocol, dslName);
	}
	
	public static List<Job> createJobs(Protocol protocol) {
		
		List<Job> jobs = new LinkedList<>();
		
		String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		
		for(Feature service : protocol.getFeatures()) {
			String chartName = getChartName(service);
			Job job = createChartJob(chartName,wsPath);
			jobs.add(job);
		}
		
		return jobs;
	}
	
	public static Job createChartJob(String chartName, String containingFolder) {
		Job job = new Job("Generate Helm Chart: " + chartName) {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				String helm = "helm";
				String cmd = "create";
				try {
		          Process p = new ProcessBuilder(new String[] {helm,cmd,chartName})
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
	
	public static void generateChartProvisionningScript(Protocol protocol) {
		String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();

		StringBuilder builder = new StringBuilder();
		builder.append("#!/bin/bash\n");
		builder.append("\n");
		builder.append("cd "+ wsPath +"\n");
		builder.append("\n");
		
		for(Feature service : protocol.getFeatures()) {
			builder.append("helm push -f "+ getChartName(service) +"/ chartmuseum\n");
		}
		
		String content = builder.toString();
		String outputFile = wsPath + "/" + DEPLOYCHART_FILE_NAME;
		try {
			Files.write(Paths.get(outputFile), content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected static void updateValuesFiles(Protocol protocol, String dslName) {
		String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		for(Feature service : protocol.getFeatures()) {
			String valuesFile = wsPath + "/" + getChartName(service) +"/values.yaml";
			try {
				String content = Files.readString(Paths.get(valuesFile));
				content = content.replaceFirst("repository: nginx", "repository: " + ScriptGenerator.getImageName(service, dslName));
				content = content.replaceFirst("tag: stable", "tag: latest");
				Files.write(Paths.get(valuesFile), content.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	protected static String getChartName(Feature service) {
		return service.getName() + "-chart";
	}

}
