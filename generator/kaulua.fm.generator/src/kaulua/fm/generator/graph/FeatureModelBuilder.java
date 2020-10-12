package kaulua.fm.generator.graph;

import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.SpanningTreeAlgorithm.SpanningTree;
import org.jgrapht.alg.shortestpath.BFSShortestPath;
import org.jgrapht.alg.spanning.KruskalMinimumSpanningTree;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.io.ComponentNameProvider;
import org.jgrapht.io.DOTExporter;
import org.jgrapht.io.ExportException;
import org.jgrapht.io.GraphExporter;
import org.prop4j.Implies;
import org.prop4j.Literal;

import de.ovgu.featureide.fm.core.base.IConstraint;
import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.IFeatureModelFactory;
import de.ovgu.featureide.fm.core.base.IFeatureModelStructure;
import de.ovgu.featureide.fm.core.base.IFeatureStructure;
import de.ovgu.featureide.fm.core.base.impl.DefaultFeatureModelFactory;
import fr.inria.diverse.kaulua.Dependency;
import fr.inria.diverse.kaulua.Feature;
import fr.inria.diverse.kaulua.KauluaPackage;
import fr.inria.diverse.kaulua.Protocol;
import kaulua.fm.generator.AbstractLspServiceGenerator;

public class FeatureModelBuilder {
	
	public static IFeatureModel build(Protocol protocol, String dslName) {
		
		Graph<Feature, DefaultEdge> g = new DefaultDirectedGraph<>(DefaultEdge.class);
		
		// Build the dependency graph
		for(Feature service: protocol.getFeatures()) {
			g.addVertex(service);
		}
		
		for(Feature service: protocol.getFeatures()) {
			List<Dependency> connections = AbstractLspServiceGenerator.getDependencies(service);
			for(Dependency conn : connections) {
				Feature calledService = (Feature) conn.getCallee().eContainer();
				g.addEdge(service, calledService);
			}
		}
		
		// Add fake root if the graph is a forest
		List<Feature> roots = new ArrayList<>();
		for(Feature v : g.vertexSet()) {
			if(g.outgoingEdgesOf(v).size() == 0) {
				roots.add(v);
			}
		}
		
		Feature fakeRoot = KauluaPackage.eINSTANCE.getKauluaFactory().createFeature();
		fakeRoot.setName("fakeRoot");
		g.addVertex(fakeRoot);
		for(Feature v : roots) {
			g.addEdge(v,fakeRoot);
		}
		
		// Compute transitive reduction
		BFSShortestPath pathAlg = new BFSShortestPath(g);
		for(Feature service: protocol.getFeatures()) {
			List<Dependency> connections = AbstractLspServiceGenerator.getDependencies(service);
			for(Dependency conn: connections) {
				Feature calledService = (Feature) conn.getCallee().eContainer();
				
				if(g.outgoingEdgesOf(service).size() > 1) {
					g.removeEdge(service, calledService);
					
					GraphPath<Feature, DefaultEdge> path = pathAlg.getPath(service, calledService);
					if(path == null) {
						g.addEdge(service, calledService);
					}
				}
			}
		}
		
		printGraph(g);
		
		// Compute spanning forest
		KruskalMinimumSpanningTree<Feature, DefaultEdge> spanningTreeAlg = new KruskalMinimumSpanningTree<>(g);
//		PrimMinimumSpanningTree<Service, DefaultEdge> spanningTreeAlg = new PrimMinimumSpanningTree<>(g);
		SpanningTree<DefaultEdge> spanningTree = spanningTreeAlg.getSpanningTree();
		AsSubgraph<Feature, DefaultEdge> tree = new AsSubgraph(g, g.vertexSet(), spanningTree.getEdges());
		
		Set<DefaultEdge> removedEdges = new HashSet<>(g.edgeSet());
		removedEdges.removeAll(spanningTree.getEdges());
		
		printGraph(tree);
		System.out.println(removedEdges);
		
		// Compute the feature model
		IFeatureModelFactory factory = DefaultFeatureModelFactory.getInstance();
		IFeatureModel fm = factory.create();
		IFeatureModelStructure structure = fm.getStructure();
		
		IFeature rootFeat = factory.createFeature(fm, protocol.getName());
		fm.addFeature(rootFeat);
		structure.setRoot(rootFeat.getStructure());
		
		Map<IFeature,Feature> fmToProtocol = new HashMap<>();
		Stack<Feature> toProcess = new Stack<>();
		toProcess.add(fakeRoot);
		while(!toProcess.isEmpty()) {
			Feature current = toProcess.pop();
			for(DefaultEdge toAdd : tree.incomingEdgesOf(current)) {
				toProcess.push(tree.getEdgeSource(toAdd));
			}
			
			if(!current.getName().equals("fakeRoot")) {
				IFeature feat = factory.createFeature(fm, current.getName());
				fm.addFeature(feat);
				fmToProtocol.put(feat,current);

				Feature parent = tree.getEdgeTarget(tree.outgoingEdgesOf(current).iterator().next());
				if(parent.getName().equals("fakeRoot")) {
					rootFeat.getStructure().addChild(feat.getStructure());
				}
				else {
					IFeature parentFeat = fm.getFeature(parent.getName());
					parentFeat.getStructure().addChild(feat.getStructure());
				}
			}
		}
		
		for(DefaultEdge removed : removedEdges) {
			Feature src = g.getEdgeSource(removed);
			Feature tgt = g.getEdgeTarget(removed);
			
			Literal srv = new Literal(src.getName());
			Literal req = new Literal(tgt.getName());
			Implies impl = new Implies(srv,req);
			IConstraint constr = factory.createConstraint(fm, impl);
			fm.addConstraint(constr);
		}
		
		Collection<IFeature> features = fm.getFeatures();
//		Map<IFeatureStructure,IFeature> movedMandatories = new HashMap<>();
		Map<IFeatureStructure,List<IFeatureStructure>> movedChildren = new HashMap<>();
		Map<String,List<IFeature>> alternativeGroups = new HashMap<>();
		for(IFeature fm_feat : features) {
			Feature proto_feat = fmToProtocol.get(fm_feat);
			if(proto_feat != null && proto_feat.isIsMandatory()) {
				fm_feat.getStructure().setMandatory(true);
				IFeatureStructure parent = fm_feat.getStructure().getParent();
				List<IFeatureStructure> children = new ArrayList<IFeatureStructure>(fm_feat.getStructure().getChildren());
//				movedMandatories.put(parent,fm_feat);
				movedChildren.put(parent, children);
			}
			if(proto_feat != null && proto_feat.getAlternativeGroup() != null) {
				List<IFeature> group = alternativeGroups.get(proto_feat.getAlternativeGroup());
				if(group == null) {
					group = new ArrayList<>();
					alternativeGroups.put(proto_feat.getAlternativeGroup(), group);
				}
				group.add(fm_feat);
			}
		}
		
//		for(Entry<IFeatureStructure, IFeature> toMoveEntry : movedMandatories.entrySet()) {
//			IFeatureStructure parent = toMoveEntry.getKey();
//			IFeature toMove = toMoveEntry.getValue();
//			toMove.getStructure().setMandatory(true);
//			parent.addChild(toMove.getStructure());
//		}
		
		for(Entry<IFeatureStructure, List<IFeatureStructure>> moveEntry : movedChildren.entrySet()) {
			IFeatureStructure parent = moveEntry.getKey();
			List<IFeatureStructure> children = moveEntry.getValue();
			IFeatureStructure oldParent = children.get(0).getParent();
			for(IFeatureStructure child : children) {
				oldParent.removeChild(child);
			}
			for(IFeatureStructure child : children) {
				parent.addChild(child);
			}
		}
		
		for(Entry<String, List<IFeature>> groupEntry : alternativeGroups.entrySet()) {
			String groupName = groupEntry.getKey();
			List<IFeature> group = groupEntry.getValue();
			IFeatureStructure parent = group.get(0).getStructure().getParent();
			
			IFeature groupFeat = factory.createFeature(fm, groupName);
			fm.addFeature(groupFeat);
			groupFeat.getStructure().setAlternative();
			parent.addChild(groupFeat.getStructure());
			
			for(IFeature child : group) {
				parent.removeChild(child.getStructure());
			}
			for(IFeature child : group) {
				groupFeat.getStructure().addChild(child.getStructure());
			}
			
		}
		
		return fm;
	}
	
	public static void printGraph(Graph g) {

        // use helper classes to define how vertices should be rendered,
        // adhering to the DOT language restrictions
        ComponentNameProvider<Feature> vertexIdProvider = new ComponentNameProvider<Feature>()
        {
            public String getName(Feature srv)
            {
                return srv.getName();
            }
        };
        ComponentNameProvider<Feature> vertexLabelProvider = new ComponentNameProvider<Feature>()
        {
            public String getName(Feature srv)
            {
                return srv.getName();
            }
        };
        GraphExporter<Feature, DefaultEdge> exporter =
            new DOTExporter<>(vertexIdProvider, vertexLabelProvider, null);
        Writer writer = new StringWriter();
        try {
			exporter.exportGraph(g, writer);
		} catch (ExportException e) {
			e.printStackTrace();
		}
        System.out.println(writer.toString());
	}

}
