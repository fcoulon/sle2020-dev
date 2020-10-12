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

import fr.cea.nabla.ir.JobExtensions;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.ir.Job;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.ir.Variable;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class VariableExtensions {
  public static boolean isScalarConst(final Variable it) {
    return ((it instanceof ScalarVariable) && ((ScalarVariable) it).isConst());
  }
  
  public static HashSet<Job> getNextJobs(final Variable it) {
    final HashSet<Job> nextJobs = new HashSet<Job>();
    EList<Job> _jobs = VariableExtensions.getIrModule(it).getJobs();
    for (final Job j : _jobs) {
      final Function1<Variable, Boolean> _function = new Function1<Variable, Boolean>() {
        @Override
        public Boolean apply(final Variable x) {
          return Boolean.valueOf((x == it));
        }
      };
      boolean _exists = IterableExtensions.<Variable>exists(JobExtensions.getInVars(j), _function);
      if (_exists) {
        nextJobs.add(j);
      }
    }
    return nextJobs;
  }
  
  public static HashSet<Job> getPreviousJobs(final Variable it) {
    final HashSet<Job> previousJobs = new HashSet<Job>();
    EList<Job> _jobs = VariableExtensions.getIrModule(it).getJobs();
    for (final Job j : _jobs) {
      final Function1<Variable, Boolean> _function = new Function1<Variable, Boolean>() {
        @Override
        public Boolean apply(final Variable x) {
          return Boolean.valueOf((x == it));
        }
      };
      boolean _exists = IterableExtensions.<Variable>exists(JobExtensions.getOutVars(j), _function);
      if (_exists) {
        previousJobs.add(j);
      }
    }
    return previousJobs;
  }
  
  public static boolean isGlobal(final Variable it) {
    EObject _eContainer = it.eContainer();
    return (_eContainer instanceof IrModule);
  }
  
  private static IrModule getIrModule(final EObject it) {
    IrModule _xifexpression = null;
    EObject _eContainer = it.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      _xifexpression = null;
    } else {
      IrModule _xifexpression_1 = null;
      EObject _eContainer_1 = it.eContainer();
      if ((_eContainer_1 instanceof IrModule)) {
        EObject _eContainer_2 = it.eContainer();
        _xifexpression_1 = ((IrModule) _eContainer_2);
      } else {
        _xifexpression_1 = VariableExtensions.getIrModule(it.eContainer());
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
