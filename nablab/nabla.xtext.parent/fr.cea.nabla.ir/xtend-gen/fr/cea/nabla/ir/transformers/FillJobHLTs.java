/**
 * Copyright (c) 2018 CEA
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * 	Benoit Lelandais - initial implementation
 * 	Marie-Pierre Oudot - initial implementation
 * 	Jean-Sylvain Camier - Nabla generation support
 */
package fr.cea.nabla.ir.transformers;

import com.google.common.base.Objects;
import fr.cea.nabla.ir.JobExtensions;
import fr.cea.nabla.ir.ir.InstructionJob;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.ir.Job;
import fr.cea.nabla.ir.ir.TimeIterationCopyJob;
import fr.cea.nabla.ir.transformers.IrTransformationStep;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.cycle.CycleDetector;
import org.jgrapht.alg.shortestpath.FloydWarshallShortestPaths;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.DirectedWeightedPseudograph;

@SuppressWarnings("all")
public class FillJobHLTs implements IrTransformationStep {
  private static final String TimeLoopSourceNodeLabel = "TimeLoopSourceNode";
  
  private static final String GlobalSourceNodeLabel = "GlobalSourceNode";
  
  @Override
  public String getDescription() {
    return "Compute Hierarchical Logical Time (HLT) of each jobs";
  }
  
  /**
   * Prend en paramètre une instance de IrModule et renseigne l'attribut @ des jobs
   * en utilisant des fonctionnalités de la bibliothèque de graphe jgrapht.
   * Retourne faux si le graphe a des cycles et que le calcul des @ est impossible, vrai sinon.
   * Si le graphe a des cycles, les noeuds impliqués ont leur attribut onCycle à vrai.
   */
  @Override
  public boolean transform(final IrModule m) {
    InstructionJob _createInstructionJob = IrFactory.eINSTANCE.createInstructionJob();
    final Procedure1<InstructionJob> _function = new Procedure1<InstructionJob>() {
      @Override
      public void apply(final InstructionJob it) {
        it.setName(FillJobHLTs.GlobalSourceNodeLabel);
      }
    };
    final InstructionJob globalSourceNode = ObjectExtensions.<InstructionJob>operator_doubleArrow(_createInstructionJob, _function);
    InstructionJob _createInstructionJob_1 = IrFactory.eINSTANCE.createInstructionJob();
    final Procedure1<InstructionJob> _function_1 = new Procedure1<InstructionJob>() {
      @Override
      public void apply(final InstructionJob it) {
        it.setName(FillJobHLTs.TimeLoopSourceNodeLabel);
      }
    };
    final InstructionJob timeLoopSourceNode = ObjectExtensions.<InstructionJob>operator_doubleArrow(_createInstructionJob_1, _function_1);
    final DirectedWeightedPseudograph<Job, DefaultWeightedEdge> g = this.createGraph(m, globalSourceNode, timeLoopSourceNode);
    final Set<Job> cycles = this.findCycle(g);
    final boolean hasCycles = (cycles != null);
    if (hasCycles) {
      InputOutput.<String>println("*** HLT calculation impossible: graph contains cycles.");
      final Function1<Job, String> _function_2 = new Function1<Job, String>() {
        @Override
        public String apply(final Job it) {
          return it.getName();
        }
      };
      String _join = IterableExtensions.join(IterableExtensions.<Job, String>map(cycles, _function_2), " -> ");
      String _plus = ("*** " + _join);
      InputOutput.<String>println(_plus);
    } else {
      final FloydWarshallShortestPaths<Job, DefaultWeightedEdge> jalgo = new FloydWarshallShortestPaths<Job, DefaultWeightedEdge>(g);
      final Consumer<DefaultWeightedEdge> _function_3 = new Consumer<DefaultWeightedEdge>() {
        @Override
        public void accept(final DefaultWeightedEdge e) {
          g.setEdgeWeight(e, (-1));
        }
      };
      g.edgeSet().forEach(_function_3);
      final Function1<Job, Boolean> _function_4 = new Function1<Job, Boolean>() {
        @Override
        public Boolean apply(final Job v) {
          return Boolean.valueOf((!Objects.equal(v, timeLoopSourceNode)));
        }
      };
      Iterable<Job> _filter = IterableExtensions.<Job>filter(g.vertexSet(), _function_4);
      for (final Job v : _filter) {
        {
          final GraphPath<Job, DefaultWeightedEdge> graphPath = jalgo.getPath(timeLoopSourceNode, v);
          if ((graphPath != null)) {
            Job _endVertex = graphPath.getEndVertex();
            _endVertex.setAt(Math.abs(graphPath.getWeight()));
          }
        }
      }
      final HashMap<Job, Double> weightByJobs = new HashMap<Job, Double>();
      final Function1<Job, Boolean> _function_5 = new Function1<Job, Boolean>() {
        @Override
        public Boolean apply(final Job v) {
          return Boolean.valueOf(((!Objects.equal(v, globalSourceNode)) && (((int) v.getAt()) == 0)));
        }
      };
      Iterable<Job> _filter_1 = IterableExtensions.<Job>filter(g.vertexSet(), _function_5);
      for (final Job v_1 : _filter_1) {
        {
          final GraphPath<Job, DefaultWeightedEdge> graphPath = jalgo.getPath(globalSourceNode, v_1);
          if ((graphPath != null)) {
            weightByJobs.put(graphPath.getEndVertex(), Double.valueOf(graphPath.getWeight()));
          }
        }
      }
      final Double minWeight = IterableExtensions.<Double>min(weightByJobs.values());
      Set<Job> _keySet = weightByJobs.keySet();
      for (final Job j : _keySet) {
        Double _get = weightByJobs.get(j);
        double _minus = DoubleExtensions.operator_minus(minWeight, _get);
        double _minus_1 = (_minus - 1);
        j.setAt(_minus_1);
      }
    }
    return (!hasCycles);
  }
  
  /**
   * Création d'un graphe comrrespondant à l'IR.
   * 2 noeuds sources sont ajoutés : 1 correspondant à un noeud source global
   * et l'autre à l'entrée de la boucle en temps. Notons que les arcs sortants
   * des jobs de type TimeIterationCopyJob ne sont pas construits pour éviter les cycles.
   */
  private DirectedWeightedPseudograph<Job, DefaultWeightedEdge> createGraph(final IrModule it, final Job globalSourceNode, final Job timeLoopSourceNode) {
    final DirectedWeightedPseudograph<Job, DefaultWeightedEdge> g = new DirectedWeightedPseudograph<Job, DefaultWeightedEdge>(DefaultWeightedEdge.class);
    final Consumer<Job> _function = new Consumer<Job>() {
      @Override
      public void accept(final Job x) {
        g.addVertex(x);
      }
    };
    it.getJobs().forEach(_function);
    g.addVertex(timeLoopSourceNode);
    EList<Job> _jobs = it.getJobs();
    for (final Job from : _jobs) {
      HashSet<Job> _nextJobs = JobExtensions.getNextJobs(from);
      for (final Job to : _nextJobs) {
        if ((from instanceof TimeIterationCopyJob)) {
          g.addEdge(timeLoopSourceNode, to);
        } else {
          g.addEdge(from, to);
        }
      }
    }
    g.addVertex(globalSourceNode);
    final Function1<Job, Boolean> _function_1 = new Function1<Job, Boolean>() {
      @Override
      public Boolean apply(final Job v) {
        return Boolean.valueOf((((v != globalSourceNode) && (v != timeLoopSourceNode)) && g.incomingEdgesOf(v).isEmpty()));
      }
    };
    final Consumer<Job> _function_2 = new Consumer<Job>() {
      @Override
      public void accept(final Job x) {
        g.addEdge(globalSourceNode, x);
      }
    };
    IterableExtensions.<Job>filter(g.vertexSet(), _function_1).forEach(_function_2);
    return g;
  }
  
  /**
   * Retourne la liste des noeuds du graphe impliqués dans au moins un cycle, null si pas de cycle
   */
  private Set<Job> findCycle(final DirectedWeightedPseudograph<Job, DefaultWeightedEdge> g) {
    final CycleDetector<Job, DefaultWeightedEdge> cycleDetector = new CycleDetector<Job, DefaultWeightedEdge>(g);
    boolean _detectCycles = cycleDetector.detectCycles();
    if (_detectCycles) {
      final Set<Job> nodesOnCycle = cycleDetector.findCycles();
      final Consumer<Job> _function = new Consumer<Job>() {
        @Override
        public void accept(final Job it) {
          it.setOnCycle(true);
        }
      };
      nodesOnCycle.forEach(_function);
      return nodesOnCycle;
    } else {
      return null;
    }
  }
}
