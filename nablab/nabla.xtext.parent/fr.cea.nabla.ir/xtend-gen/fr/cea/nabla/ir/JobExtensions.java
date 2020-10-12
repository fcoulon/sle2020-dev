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
package fr.cea.nabla.ir;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import fr.cea.nabla.ir.VariableExtensions;
import fr.cea.nabla.ir.ir.Affectation;
import fr.cea.nabla.ir.ir.InstructionJob;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.ir.IrPackage;
import fr.cea.nabla.ir.ir.Job;
import fr.cea.nabla.ir.ir.TimeIterationCopyJob;
import fr.cea.nabla.ir.ir.VarRef;
import fr.cea.nabla.ir.ir.Variable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class JobExtensions {
  public static HashSet<Job> getNextJobs(final Job from) {
    final HashSet<Job> fromTargetJobs = new HashSet<Job>();
    EObject _eContainer = from.eContainer();
    final IrModule irFile = ((IrModule) _eContainer);
    final Iterable<Variable> fromOutVars = JobExtensions.getOutVars(from);
    EList<Job> _jobs = irFile.getJobs();
    for (final Job to : _jobs) {
      for (final Variable outVar : fromOutVars) {
        final Function1<Variable, Boolean> _function = new Function1<Variable, Boolean>() {
          @Override
          public Boolean apply(final Variable x) {
            return Boolean.valueOf((x == outVar));
          }
        };
        boolean _exists = IterableExtensions.<Variable>exists(JobExtensions.getInVars(to), _function);
        if (_exists) {
          fromTargetJobs.add(to);
        }
      }
    }
    return fromTargetJobs;
  }
  
  protected static Iterable<Variable> _getOutVars(final TimeIterationCopyJob it) {
    Variable _left = it.getLeft();
    return IterableExtensions.<Variable>toSet(Collections.<Variable>unmodifiableList(CollectionLiterals.<Variable>newArrayList(_left)));
  }
  
  protected static Iterable<Variable> _getOutVars(final InstructionJob it) {
    final Function1<Affectation, Variable> _function = new Function1<Affectation, Variable>() {
      @Override
      public Variable apply(final Affectation it) {
        return it.getLeft().getVariable();
      }
    };
    final Function1<Variable, Boolean> _function_1 = new Function1<Variable, Boolean>() {
      @Override
      public Boolean apply(final Variable it) {
        return Boolean.valueOf(VariableExtensions.isGlobal(it));
      }
    };
    return IteratorExtensions.<Variable>toSet(IteratorExtensions.<Variable>filter(IteratorExtensions.<Affectation, Variable>map(Iterators.<Affectation>filter(it.eAllContents(), Affectation.class), _function), _function_1));
  }
  
  protected static Iterable<Variable> _getInVars(final TimeIterationCopyJob it) {
    Variable _right = it.getRight();
    return IterableExtensions.<Variable>toSet(Collections.<Variable>unmodifiableList(CollectionLiterals.<Variable>newArrayList(_right)));
  }
  
  protected static Iterable<Variable> _getInVars(final InstructionJob it) {
    final Function1<VarRef, Boolean> _function = new Function1<VarRef, Boolean>() {
      @Override
      public Boolean apply(final VarRef x) {
        EStructuralFeature _eContainingFeature = x.eContainingFeature();
        EReference _affectation_Left = IrPackage.eINSTANCE.getAffectation_Left();
        return Boolean.valueOf((!Objects.equal(_eContainingFeature, _affectation_Left)));
      }
    };
    final Function1<VarRef, Variable> _function_1 = new Function1<VarRef, Variable>() {
      @Override
      public Variable apply(final VarRef it) {
        return it.getVariable();
      }
    };
    final Function1<Variable, Boolean> _function_2 = new Function1<Variable, Boolean>() {
      @Override
      public Boolean apply(final Variable it) {
        return Boolean.valueOf(VariableExtensions.isGlobal(it));
      }
    };
    final Set<Variable> allVars = IteratorExtensions.<Variable>toSet(IteratorExtensions.<Variable>filter(IteratorExtensions.<VarRef, Variable>map(IteratorExtensions.<VarRef>filter(Iterators.<VarRef>filter(it.eAllContents(), VarRef.class), _function), _function_1), _function_2));
    return allVars;
  }
  
  public static Iterable<Variable> getOutVars(final Job it) {
    if (it instanceof InstructionJob) {
      return _getOutVars((InstructionJob)it);
    } else if (it instanceof TimeIterationCopyJob) {
      return _getOutVars((TimeIterationCopyJob)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public static Iterable<Variable> getInVars(final Job it) {
    if (it instanceof InstructionJob) {
      return _getInVars((InstructionJob)it);
    } else if (it instanceof TimeIterationCopyJob) {
      return _getInVars((TimeIterationCopyJob)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
