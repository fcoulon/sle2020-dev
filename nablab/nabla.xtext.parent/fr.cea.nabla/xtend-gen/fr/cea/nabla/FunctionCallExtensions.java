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
package fr.cea.nabla;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import fr.cea.nabla.nabla.BasicType;
import fr.cea.nabla.nabla.Expression;
import fr.cea.nabla.nabla.FunctionArg;
import fr.cea.nabla.nabla.FunctionCall;
import fr.cea.nabla.nabla.ReductionArg;
import fr.cea.nabla.nabla.ReductionCall;
import fr.cea.nabla.typing.ExpressionTypeProvider;
import fr.cea.nabla.typing.NablaType;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FunctionCallExtensions {
  @Inject
  @Extension
  private ExpressionTypeProvider _expressionTypeProvider;
  
  public FunctionArg getDeclaration(final FunctionCall it) {
    final Function1<FunctionArg, Boolean> _function = (FunctionArg x) -> {
      return Boolean.valueOf(this.match(x.getInTypes(), it.getArgs()));
    };
    return IterableExtensions.<FunctionArg>findFirst(it.getFunction().getArgGroups(), _function);
  }
  
  public ReductionArg getDeclaration(final ReductionCall it) {
    final Function1<ReductionArg, Boolean> _function = (ReductionArg x) -> {
      return Boolean.valueOf(this.match(x.getCollectionType(), it.getArg()));
    };
    return IterableExtensions.<ReductionArg>findFirst(it.getReduction().getArgGroups(), _function);
  }
  
  private boolean match(final List<BasicType> a, final List<Expression> b) {
    int _length = ((Object[])Conversions.unwrapArray(a, Object.class)).length;
    int _length_1 = ((Object[])Conversions.unwrapArray(b, Object.class)).length;
    boolean _notEquals = (_length != _length_1);
    if (_notEquals) {
      return false;
    }
    int _length_2 = ((Object[])Conversions.unwrapArray(a, Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length_2, true);
    for (final Integer i : _doubleDotLessThan) {
      boolean _match = this.match(a.get((i).intValue()), b.get((i).intValue()));
      boolean _not = (!_match);
      if (_not) {
        return false;
      }
    }
    return true;
  }
  
  private boolean match(final BasicType a, final Expression b) {
    final NablaType bType = this._expressionTypeProvider.getTypeFor(b);
    return (((bType != NablaType.UNDEFINED) && (bType.getDimension() == 0)) && Objects.equal(bType.getBase(), a));
  }
}
