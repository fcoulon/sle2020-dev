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
package fr.cea.nabla.generator.ir;

import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import fr.cea.nabla.generator.ir.IrAnnotationHelper;
import fr.cea.nabla.generator.ir.IrInstructionFactory;
import fr.cea.nabla.generator.ir.IrVariableFactory;
import fr.cea.nabla.ir.ir.IrAnnotation;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.Job;
import fr.cea.nabla.ir.ir.TimeIterationCopyJob;
import fr.cea.nabla.ir.ir.Variable;
import fr.cea.nabla.nabla.InstructionJob;
import fr.cea.nabla.nabla.TimeLoopJob;
import fr.cea.nabla.nabla.VarRef;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class JobExtensions {
  @Inject
  @Extension
  private IrAnnotationHelper _irAnnotationHelper;
  
  @Inject
  @Extension
  private IrInstructionFactory _irInstructionFactory;
  
  @Inject
  @Extension
  private IrVariableFactory _irVariableFactory;
  
  protected void _populateIrJobs(final InstructionJob j, final EList<Job> irJobs) {
    fr.cea.nabla.ir.ir.InstructionJob _createInstructionJob = IrFactory.eINSTANCE.createInstructionJob();
    final Procedure1<fr.cea.nabla.ir.ir.InstructionJob> _function = (fr.cea.nabla.ir.ir.InstructionJob it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(j);
      _annotations.add(_irAnnotation);
      it.setName(j.getName());
      it.setOnCycle(false);
      it.setInstruction(this._irInstructionFactory.toIrInstruction(j.getInstruction()));
    };
    fr.cea.nabla.ir.ir.InstructionJob _doubleArrow = ObjectExtensions.<fr.cea.nabla.ir.ir.InstructionJob>operator_doubleArrow(_createInstructionJob, _function);
    irJobs.add(_doubleArrow);
  }
  
  protected void _populateIrJobs(final TimeLoopJob j, final EList<Job> irJobs) {
    fr.cea.nabla.ir.ir.InstructionJob _createInstructionJob = IrFactory.eINSTANCE.createInstructionJob();
    final Procedure1<fr.cea.nabla.ir.ir.InstructionJob> _function = (fr.cea.nabla.ir.ir.InstructionJob it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(j);
      _annotations.add(_irAnnotation);
      String _name = j.getName();
      String _plus = ("Init_" + _name);
      it.setName(_plus);
      it.setOnCycle(false);
      it.setInstruction(this._irInstructionFactory.toIrInstruction(j.getInitialization()));
    };
    fr.cea.nabla.ir.ir.InstructionJob _doubleArrow = ObjectExtensions.<fr.cea.nabla.ir.ir.InstructionJob>operator_doubleArrow(_createInstructionJob, _function);
    irJobs.add(_doubleArrow);
    fr.cea.nabla.ir.ir.InstructionJob _createInstructionJob_1 = IrFactory.eINSTANCE.createInstructionJob();
    final Procedure1<fr.cea.nabla.ir.ir.InstructionJob> _function_1 = (fr.cea.nabla.ir.ir.InstructionJob it) -> {
      EList<IrAnnotation> _annotations = it.getAnnotations();
      IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(j);
      _annotations.add(_irAnnotation);
      String _name = j.getName();
      String _plus = ("Compute_" + _name);
      it.setName(_plus);
      it.setOnCycle(false);
      it.setInstruction(this._irInstructionFactory.toIrInstruction(j.getBody()));
    };
    fr.cea.nabla.ir.ir.InstructionJob _doubleArrow_1 = ObjectExtensions.<fr.cea.nabla.ir.ir.InstructionJob>operator_doubleArrow(_createInstructionJob_1, _function_1);
    irJobs.add(_doubleArrow_1);
  }
  
  public void populateIrVariablesAndJobs(final TimeLoopJob j, final EList<Variable> irVariables, final EList<Job> irJobs) {
    Iterable<VarRef> _iterable = IteratorExtensions.<VarRef>toIterable(Iterators.<VarRef>filter(j.getBody().eAllContents(), VarRef.class));
    for (final VarRef r : _iterable) {
      if (((r.getTimeIterator() != null) && r.getTimeIterator().isNext())) {
        final Variable vCurrent = this._irVariableFactory.toIrVariable(r.getVariable(), null);
        final Variable vNext = this._irVariableFactory.toIrVariable(r.getVariable(), r.getTimeIterator());
        irVariables.add(vNext);
        TimeIterationCopyJob _irCopyJob = this.toIrCopyJob(vCurrent, vNext, r.getTimeIterator().getIterator().getName());
        irJobs.add(_irCopyJob);
      }
    }
  }
  
  private TimeIterationCopyJob toIrCopyJob(final Variable current, final Variable next, final String tiName) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(current, next, tiName);
    final TimeIterationCopyJob _result;
    synchronized (_createCache_toIrCopyJob) {
      if (_createCache_toIrCopyJob.containsKey(_cacheKey)) {
        return _createCache_toIrCopyJob.get(_cacheKey);
      }
      TimeIterationCopyJob _createTimeIterationCopyJob = IrFactory.eINSTANCE.createTimeIterationCopyJob();
      _result = _createTimeIterationCopyJob;
      _createCache_toIrCopyJob.put(_cacheKey, _result);
    }
    _init_toIrCopyJob(_result, current, next, tiName);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, TimeIterationCopyJob> _createCache_toIrCopyJob = CollectionLiterals.newHashMap();
  
  private void _init_toIrCopyJob(final TimeIterationCopyJob it, final Variable current, final Variable next, final String tiName) {
    String _name = next.getName();
    String _plus = ("Copy_" + _name);
    String _plus_1 = (_plus + "_to_");
    String _name_1 = current.getName();
    String _plus_2 = (_plus_1 + _name_1);
    it.setName(_plus_2);
    it.setLeft(current);
    it.setRight(next);
    it.setTimeIteratorName(tiName);
  }
  
  public void populateIrJobs(final fr.cea.nabla.nabla.Job j, final EList<Job> irJobs) {
    if (j instanceof InstructionJob) {
      _populateIrJobs((InstructionJob)j, irJobs);
      return;
    } else if (j instanceof TimeLoopJob) {
      _populateIrJobs((TimeLoopJob)j, irJobs);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(j, irJobs).toString());
    }
  }
}
