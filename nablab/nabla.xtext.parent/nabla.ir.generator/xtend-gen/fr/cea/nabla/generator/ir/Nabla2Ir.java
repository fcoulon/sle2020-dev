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

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import fr.cea.nabla.FunctionCallExtensions;
import fr.cea.nabla.generator.ir.IrAnnotationHelper;
import fr.cea.nabla.generator.ir.IrConnectivityFactory;
import fr.cea.nabla.generator.ir.IrExpressionFactory;
import fr.cea.nabla.generator.ir.IrFunctionFactory;
import fr.cea.nabla.generator.ir.IrVariableFactory;
import fr.cea.nabla.generator.ir.JobExtensions;
import fr.cea.nabla.generator.ir.Nabla2IrUtils;
import fr.cea.nabla.ir.ir.Function;
import fr.cea.nabla.ir.ir.IrAnnotation;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.ir.Reduction;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.ir.Variable;
import fr.cea.nabla.nabla.Connectivity;
import fr.cea.nabla.nabla.ConnectivityDeclarationBlock;
import fr.cea.nabla.nabla.FunctionCall;
import fr.cea.nabla.nabla.Import;
import fr.cea.nabla.nabla.Instruction;
import fr.cea.nabla.nabla.Job;
import fr.cea.nabla.nabla.NablaModule;
import fr.cea.nabla.nabla.ReductionCall;
import fr.cea.nabla.nabla.ScalarVarDefinition;
import fr.cea.nabla.nabla.TimeLoopJob;
import fr.cea.nabla.nabla.Var;
import fr.cea.nabla.nabla.VarGroupDeclaration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Nabla2Ir {
  @Inject
  @Extension
  private Nabla2IrUtils _nabla2IrUtils;
  
  @Inject
  @Extension
  private JobExtensions _jobExtensions;
  
  @Inject
  @Extension
  private IrFunctionFactory _irFunctionFactory;
  
  @Inject
  @Extension
  private IrVariableFactory _irVariableFactory;
  
  @Inject
  @Extension
  private IrConnectivityFactory _irConnectivityFactory;
  
  @Inject
  @Extension
  private IrExpressionFactory _irExpressionFactory;
  
  @Inject
  @Extension
  private IrAnnotationHelper _irAnnotationHelper;
  
  @Inject
  @Extension
  private FunctionCallExtensions _functionCallExtensions;
  
  public IrModule toIrModule(final NablaModule m) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(m);
    final IrModule _result;
    synchronized (_createCache_toIrModule) {
      if (_createCache_toIrModule.containsKey(_cacheKey)) {
        return _createCache_toIrModule.get(_cacheKey);
      }
      IrModule _createIrModule = IrFactory.eINSTANCE.createIrModule();
      _result = _createIrModule;
      _createCache_toIrModule.put(_cacheKey, _result);
    }
    _init_toIrModule(_result, m);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, IrModule> _createCache_toIrModule = CollectionLiterals.newHashMap();
  
  private void _init_toIrModule(final IrModule it, final NablaModule m) {
    EList<IrAnnotation> _annotations = it.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(m);
    _annotations.add(_irAnnotation);
    it.setName(m.getName());
    final Consumer<Import> _function = (Import x) -> {
      EList<fr.cea.nabla.ir.ir.Import> _imports = it.getImports();
      fr.cea.nabla.ir.ir.Import _irImport = this._nabla2IrUtils.toIrImport(x);
      _imports.add(_irImport);
    };
    m.getImports().forEach(_function);
    final Procedure1<FunctionCall> _function_1 = (FunctionCall x) -> {
      EList<Function> _functions = it.getFunctions();
      Function _irFunction = this._irFunctionFactory.toIrFunction(x.getFunction(), this._functionCallExtensions.getDeclaration(x));
      _functions.add(_irFunction);
    };
    IteratorExtensions.<FunctionCall>forEach(Iterators.<FunctionCall>filter(m.eAllContents(), FunctionCall.class), _function_1);
    final Procedure1<ReductionCall> _function_2 = (ReductionCall x) -> {
      EList<Reduction> _reductions = it.getReductions();
      Reduction _irReduction = this._irFunctionFactory.toIrReduction(x.getReduction(), this._functionCallExtensions.getDeclaration(x));
      _reductions.add(_irReduction);
    };
    IteratorExtensions.<ReductionCall>forEach(Iterators.<ReductionCall>filter(m.eAllContents(), ReductionCall.class), _function_2);
    Iterable<ConnectivityDeclarationBlock> _filter = Iterables.<ConnectivityDeclarationBlock>filter(m.getBlocks(), ConnectivityDeclarationBlock.class);
    for (final ConnectivityDeclarationBlock block : _filter) {
      final Consumer<Connectivity> _function_3 = (Connectivity x) -> {
        EList<fr.cea.nabla.ir.ir.Connectivity> _connectivities = it.getConnectivities();
        fr.cea.nabla.ir.ir.Connectivity _irConnectivity = this._irConnectivityFactory.toIrConnectivity(x);
        _connectivities.add(_irConnectivity);
      };
      block.getConnectivities().forEach(_function_3);
    }
    EList<Instruction> _variables = m.getVariables();
    for (final Instruction vDecl : _variables) {
      boolean _matched = false;
      if (vDecl instanceof ScalarVarDefinition) {
        _matched=true;
        final ScalarVariable irVar = this._irVariableFactory.toIrScalarVariable(((ScalarVarDefinition)vDecl).getVariable());
        irVar.setDefaultValue(this._irExpressionFactory.toIrExpression(((ScalarVarDefinition)vDecl).getDefaultValue()));
        irVar.setConst(((ScalarVarDefinition)vDecl).isConst());
        EList<Variable> _variables_1 = it.getVariables();
        _variables_1.add(irVar);
      }
      if (!_matched) {
        if (vDecl instanceof VarGroupDeclaration) {
          _matched=true;
          final Consumer<Var> _function_4 = (Var x) -> {
            EList<Variable> _variables_1 = it.getVariables();
            Variable _irVariable = this._irVariableFactory.toIrVariable(x);
            _variables_1.add(_irVariable);
          };
          ((VarGroupDeclaration)vDecl).getVariables().forEach(_function_4);
        }
      }
    }
    final Consumer<TimeLoopJob> _function_4 = (TimeLoopJob x) -> {
      this._jobExtensions.populateIrVariablesAndJobs(x, it.getVariables(), it.getJobs());
    };
    Iterables.<TimeLoopJob>filter(m.getJobs(), TimeLoopJob.class).forEach(_function_4);
    final Consumer<Job> _function_5 = (Job x) -> {
      this._jobExtensions.populateIrJobs(x, it.getJobs());
    };
    m.getJobs().forEach(_function_5);
  }
}
