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
import com.google.inject.Inject;
import fr.cea.nabla.generator.ir.IrAnnotationHelper;
import fr.cea.nabla.generator.ir.ReductionCallExtensions;
import fr.cea.nabla.ir.ir.IrAnnotation;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.ReductionInstruction;
import fr.cea.nabla.nabla.And;
import fr.cea.nabla.nabla.BoolConstant;
import fr.cea.nabla.nabla.Comparison;
import fr.cea.nabla.nabla.Equality;
import fr.cea.nabla.nabla.Expression;
import fr.cea.nabla.nabla.FunctionCall;
import fr.cea.nabla.nabla.IntConstant;
import fr.cea.nabla.nabla.MaxConstant;
import fr.cea.nabla.nabla.MinConstant;
import fr.cea.nabla.nabla.Minus;
import fr.cea.nabla.nabla.MulOrDiv;
import fr.cea.nabla.nabla.Not;
import fr.cea.nabla.nabla.Or;
import fr.cea.nabla.nabla.Parenthesis;
import fr.cea.nabla.nabla.Plus;
import fr.cea.nabla.nabla.Real2Constant;
import fr.cea.nabla.nabla.Real3Constant;
import fr.cea.nabla.nabla.RealConstant;
import fr.cea.nabla.nabla.RealXCompactConstant;
import fr.cea.nabla.nabla.ReductionCall;
import fr.cea.nabla.nabla.UnaryMinus;
import fr.cea.nabla.nabla.VarRef;
import java.util.Arrays;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class IrReductionInstructionFactory {
  @Inject
  @Extension
  private ReductionCallExtensions _reductionCallExtensions;
  
  @Inject
  @Extension
  private IrAnnotationHelper _irAnnotationHelper;
  
  protected Iterable<ReductionInstruction> _toIrReductions(final Or it) {
    Iterable<ReductionInstruction> _irReductions = this.toIrReductions(it.getLeft());
    Iterable<ReductionInstruction> _irReductions_1 = this.toIrReductions(it.getRight());
    return Iterables.<ReductionInstruction>concat(_irReductions, _irReductions_1);
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final And it) {
    Iterable<ReductionInstruction> _irReductions = this.toIrReductions(it.getLeft());
    Iterable<ReductionInstruction> _irReductions_1 = this.toIrReductions(it.getRight());
    return Iterables.<ReductionInstruction>concat(_irReductions, _irReductions_1);
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final Equality it) {
    Iterable<ReductionInstruction> _irReductions = this.toIrReductions(it.getLeft());
    Iterable<ReductionInstruction> _irReductions_1 = this.toIrReductions(it.getRight());
    return Iterables.<ReductionInstruction>concat(_irReductions, _irReductions_1);
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final Comparison it) {
    Iterable<ReductionInstruction> _irReductions = this.toIrReductions(it.getLeft());
    Iterable<ReductionInstruction> _irReductions_1 = this.toIrReductions(it.getRight());
    return Iterables.<ReductionInstruction>concat(_irReductions, _irReductions_1);
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final Plus it) {
    Iterable<ReductionInstruction> _irReductions = this.toIrReductions(it.getLeft());
    Iterable<ReductionInstruction> _irReductions_1 = this.toIrReductions(it.getRight());
    return Iterables.<ReductionInstruction>concat(_irReductions, _irReductions_1);
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final Minus it) {
    Iterable<ReductionInstruction> _irReductions = this.toIrReductions(it.getLeft());
    Iterable<ReductionInstruction> _irReductions_1 = this.toIrReductions(it.getRight());
    return Iterables.<ReductionInstruction>concat(_irReductions, _irReductions_1);
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final MulOrDiv it) {
    Iterable<ReductionInstruction> _irReductions = this.toIrReductions(it.getLeft());
    Iterable<ReductionInstruction> _irReductions_1 = this.toIrReductions(it.getRight());
    return Iterables.<ReductionInstruction>concat(_irReductions, _irReductions_1);
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final Parenthesis it) {
    return this.toIrReductions(it.getExpression());
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final UnaryMinus it) {
    return this.toIrReductions(it.getExpression());
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final Not it) {
    return this.toIrReductions(it.getExpression());
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final IntConstant it) {
    return Collections.<ReductionInstruction>unmodifiableList(CollectionLiterals.<ReductionInstruction>newArrayList());
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final RealConstant it) {
    return Collections.<ReductionInstruction>unmodifiableList(CollectionLiterals.<ReductionInstruction>newArrayList());
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final Real2Constant it) {
    return Collections.<ReductionInstruction>unmodifiableList(CollectionLiterals.<ReductionInstruction>newArrayList());
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final Real3Constant it) {
    return Collections.<ReductionInstruction>unmodifiableList(CollectionLiterals.<ReductionInstruction>newArrayList());
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final BoolConstant it) {
    return Collections.<ReductionInstruction>unmodifiableList(CollectionLiterals.<ReductionInstruction>newArrayList());
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final RealXCompactConstant it) {
    return Collections.<ReductionInstruction>unmodifiableList(CollectionLiterals.<ReductionInstruction>newArrayList());
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final MinConstant it) {
    return Collections.<ReductionInstruction>unmodifiableList(CollectionLiterals.<ReductionInstruction>newArrayList());
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final MaxConstant it) {
    return Collections.<ReductionInstruction>unmodifiableList(CollectionLiterals.<ReductionInstruction>newArrayList());
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final FunctionCall it) {
    final Function1<Expression, Iterable<ReductionInstruction>> _function = (Expression a) -> {
      return this.toIrReductions(a);
    };
    return Iterables.<ReductionInstruction>concat(ListExtensions.<Expression, Iterable<ReductionInstruction>>map(it.getArgs(), _function));
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final ReductionCall it) {
    final ReductionInstruction irInstruction = IrFactory.eINSTANCE.createReductionInstruction();
    EList<IrAnnotation> _annotations = irInstruction.getAnnotations();
    IrAnnotation _irAnnotation = this._irAnnotationHelper.toIrAnnotation(it);
    _annotations.add(_irAnnotation);
    irInstruction.setVariable(this._reductionCallExtensions.toIrLocalVariable(it));
    irInstruction.setReduction(this._reductionCallExtensions.toIrReductionCall(it));
    return Collections.<ReductionInstruction>unmodifiableList(CollectionLiterals.<ReductionInstruction>newArrayList(irInstruction));
  }
  
  protected Iterable<ReductionInstruction> _toIrReductions(final VarRef e) {
    return Collections.<ReductionInstruction>unmodifiableList(CollectionLiterals.<ReductionInstruction>newArrayList());
  }
  
  public Iterable<ReductionInstruction> toIrReductions(final Expression it) {
    if (it instanceof And) {
      return _toIrReductions((And)it);
    } else if (it instanceof BoolConstant) {
      return _toIrReductions((BoolConstant)it);
    } else if (it instanceof Comparison) {
      return _toIrReductions((Comparison)it);
    } else if (it instanceof Equality) {
      return _toIrReductions((Equality)it);
    } else if (it instanceof FunctionCall) {
      return _toIrReductions((FunctionCall)it);
    } else if (it instanceof IntConstant) {
      return _toIrReductions((IntConstant)it);
    } else if (it instanceof MaxConstant) {
      return _toIrReductions((MaxConstant)it);
    } else if (it instanceof MinConstant) {
      return _toIrReductions((MinConstant)it);
    } else if (it instanceof Minus) {
      return _toIrReductions((Minus)it);
    } else if (it instanceof MulOrDiv) {
      return _toIrReductions((MulOrDiv)it);
    } else if (it instanceof Not) {
      return _toIrReductions((Not)it);
    } else if (it instanceof Or) {
      return _toIrReductions((Or)it);
    } else if (it instanceof Parenthesis) {
      return _toIrReductions((Parenthesis)it);
    } else if (it instanceof Plus) {
      return _toIrReductions((Plus)it);
    } else if (it instanceof Real2Constant) {
      return _toIrReductions((Real2Constant)it);
    } else if (it instanceof Real3Constant) {
      return _toIrReductions((Real3Constant)it);
    } else if (it instanceof RealConstant) {
      return _toIrReductions((RealConstant)it);
    } else if (it instanceof RealXCompactConstant) {
      return _toIrReductions((RealXCompactConstant)it);
    } else if (it instanceof ReductionCall) {
      return _toIrReductions((ReductionCall)it);
    } else if (it instanceof UnaryMinus) {
      return _toIrReductions((UnaryMinus)it);
    } else if (it instanceof VarRef) {
      return _toIrReductions((VarRef)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
