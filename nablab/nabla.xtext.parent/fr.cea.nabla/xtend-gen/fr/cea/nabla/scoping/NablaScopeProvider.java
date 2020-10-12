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
package fr.cea.nabla.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.cea.nabla.nabla.Expression;
import fr.cea.nabla.nabla.Instruction;
import fr.cea.nabla.nabla.InstructionBlock;
import fr.cea.nabla.nabla.InstructionJob;
import fr.cea.nabla.nabla.Loop;
import fr.cea.nabla.nabla.NablaModule;
import fr.cea.nabla.nabla.ReductionCall;
import fr.cea.nabla.nabla.ScalarVar;
import fr.cea.nabla.nabla.ScalarVarDefinition;
import fr.cea.nabla.nabla.SpaceIterator;
import fr.cea.nabla.nabla.TimeIterator;
import fr.cea.nabla.nabla.TimeLoopJob;
import fr.cea.nabla.nabla.Var;
import fr.cea.nabla.nabla.VarGroupDeclaration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class NablaScopeProvider extends AbstractDeclarativeScopeProvider {
  public enum IteratorType {
    Space,
    
    Time;
  }
  
  /**
   * Scope des itérateurs pour les variables
   */
  public IScope scope_SpaceIteratorRef_iterator(final Expression context, final EReference r) {
    return this.iteratorsDefinedBefore(context.eContainer(), NablaScopeProvider.IteratorType.Space, 0);
  }
  
  public IScope scope_TimeIteratorRef_iterator(final Expression context, final EReference r) {
    return this.iteratorsDefinedBefore(context.eContainer(), NablaScopeProvider.IteratorType.Time, 0);
  }
  
  private IScope _iteratorsDefinedBefore(final EObject context, final NablaScopeProvider.IteratorType itType, final int depth) {
    return this.iteratorsDefinedBefore(context.eContainer(), itType, (depth + 1));
  }
  
  private IScope _iteratorsDefinedBefore(final Loop context, final NablaScopeProvider.IteratorType itType, final int depth) {
    return this.iteratorsForLoopOrReduction(context.getIterator(), context.eContainer(), itType, depth);
  }
  
  private IScope _iteratorsDefinedBefore(final ReductionCall context, final NablaScopeProvider.IteratorType itType, final int depth) {
    return this.iteratorsForLoopOrReduction(context.getIterator(), context.eContainer(), itType, depth);
  }
  
  private IScope _iteratorsDefinedBefore(final TimeLoopJob context, final NablaScopeProvider.IteratorType itType, final int depth) {
    IScope _xifexpression = null;
    boolean _equals = Objects.equal(itType, NablaScopeProvider.IteratorType.Time);
    if (_equals) {
      TimeIterator _iterator = context.getIterator();
      _xifexpression = Scopes.scopeFor(Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(_iterator)));
    } else {
      _xifexpression = IScope.NULLSCOPE;
    }
    return _xifexpression;
  }
  
  private IScope _iteratorsDefinedBefore(final InstructionJob context, final NablaScopeProvider.IteratorType itType, final int depth) {
    return IScope.NULLSCOPE;
  }
  
  private IScope _iteratorsDefinedBefore(final NablaModule context, final NablaScopeProvider.IteratorType itType, final int depth) {
    return IScope.NULLSCOPE;
  }
  
  private IScope iteratorsForLoopOrReduction(final SpaceIterator contextIterator, final EObject contextContainer, final NablaScopeProvider.IteratorType itType, final int depth) {
    IScope _xifexpression = null;
    boolean _equals = Objects.equal(itType, NablaScopeProvider.IteratorType.Space);
    if (_equals) {
      _xifexpression = Scopes.scopeFor(Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(contextIterator)), this.iteratorsDefinedBefore(contextContainer, itType, (depth + 1)));
    } else {
      _xifexpression = this.iteratorsDefinedBefore(contextContainer, itType, (depth + 1));
    }
    return _xifexpression;
  }
  
  /**
   * Scope des itérateurs pour les itérateurs
   */
  public IScope scope_SpaceIteratorRange_args(final Expression context, final EReference r) {
    return this.iteratorsDefinedBefore(context.eContainer(), NablaScopeProvider.IteratorType.Space, 0);
  }
  
  public IScope scope_SpaceIteratorRange_args(final Loop context, final EReference r) {
    return this.iteratorsDefinedBefore(context.eContainer(), NablaScopeProvider.IteratorType.Space, 0);
  }
  
  public IScope scope_SpaceIteratorRange_args(final ReductionCall context, final EReference r) {
    return this.iteratorsDefinedBefore(context.eContainer(), NablaScopeProvider.IteratorType.Space, 0);
  }
  
  /**
   * Scope des variables
   */
  public IScope scope_VarRef_variable(final Instruction context, final EReference r) {
    return this.variablesDefinedBefore(context.eContainer(), context, 0);
  }
  
  private IScope _variablesDefinedBefore(final EObject context, final EObject o, final int depth) {
    return this.variablesDefinedBefore(context.eContainer(), o.eContainer(), (depth + 1));
  }
  
  private IScope _variablesDefinedBefore(final NablaModule context, final EObject o, final int depth) {
    return Scopes.scopeFor(this.variablesDeclaredBefore(context.getVariables(), o, depth));
  }
  
  private IScope _variablesDefinedBefore(final InstructionBlock context, final EObject o, final int depth) {
    return Scopes.scopeFor(this.variablesDeclaredBefore(context.getInstructions(), o, depth), this.variablesDefinedBefore(context.eContainer(), o.eContainer(), (depth + 1)));
  }
  
  private Iterable<Var> variablesDeclaredBefore(final List<? extends EObject> list, final EObject o, final int depth) {
    final Function1<VarGroupDeclaration, EList<Var>> _function = (VarGroupDeclaration it) -> {
      return it.getVariables();
    };
    final Iterable<Var> vars1 = Iterables.<Var>concat(IterableExtensions.<VarGroupDeclaration, EList<Var>>map(Iterables.<VarGroupDeclaration>filter(list.subList(0, list.indexOf(o)), VarGroupDeclaration.class), _function));
    final Function1<ScalarVarDefinition, ScalarVar> _function_1 = (ScalarVarDefinition it) -> {
      return it.getVariable();
    };
    final Iterable<ScalarVar> vars2 = IterableExtensions.<ScalarVarDefinition, ScalarVar>map(Iterables.<ScalarVarDefinition>filter(list.subList(0, list.indexOf(o)), ScalarVarDefinition.class), _function_1);
    return Iterables.<Var>concat(vars1, vars2);
  }
  
  private IScope iteratorsDefinedBefore(final EObject context, final NablaScopeProvider.IteratorType itType, final int depth) {
    if (context instanceof InstructionJob) {
      return _iteratorsDefinedBefore((InstructionJob)context, itType, depth);
    } else if (context instanceof Loop) {
      return _iteratorsDefinedBefore((Loop)context, itType, depth);
    } else if (context instanceof ReductionCall) {
      return _iteratorsDefinedBefore((ReductionCall)context, itType, depth);
    } else if (context instanceof TimeLoopJob) {
      return _iteratorsDefinedBefore((TimeLoopJob)context, itType, depth);
    } else if (context instanceof NablaModule) {
      return _iteratorsDefinedBefore((NablaModule)context, itType, depth);
    } else if (context != null) {
      return _iteratorsDefinedBefore(context, itType, depth);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(context, itType, depth).toString());
    }
  }
  
  private IScope variablesDefinedBefore(final EObject context, final EObject o, final int depth) {
    if (context instanceof InstructionBlock) {
      return _variablesDefinedBefore((InstructionBlock)context, o, depth);
    } else if (context instanceof NablaModule) {
      return _variablesDefinedBefore((NablaModule)context, o, depth);
    } else if (context != null) {
      return _variablesDefinedBefore(context, o, depth);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(context, o, depth).toString());
    }
  }
}
