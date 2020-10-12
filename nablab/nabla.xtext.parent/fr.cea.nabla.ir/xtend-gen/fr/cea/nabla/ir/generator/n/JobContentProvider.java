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
package fr.cea.nabla.ir.generator.n;

import com.google.inject.Inject;
import fr.cea.nabla.ir.generator.n.InstructionContentProvider;
import fr.cea.nabla.ir.generator.n.Ir2NUtils;
import fr.cea.nabla.ir.ir.Affectation;
import fr.cea.nabla.ir.ir.ArrayVariable;
import fr.cea.nabla.ir.ir.Connectivity;
import fr.cea.nabla.ir.ir.Instruction;
import fr.cea.nabla.ir.ir.InstructionBlock;
import fr.cea.nabla.ir.ir.InstructionJob;
import fr.cea.nabla.ir.ir.Job;
import fr.cea.nabla.ir.ir.Loop;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.ir.TimeIterationCopyJob;
import fr.cea.nabla.ir.ir.Variable;
import fr.cea.nabla.ir.transformers.ReplaceExternalReductions;
import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class JobContentProvider {
  @Inject
  @Extension
  private Ir2NUtils _ir2NUtils;
  
  @Inject
  @Extension
  private InstructionContentProvider _instructionContentProvider;
  
  protected CharSequence _getContent(final InstructionJob it) {
    CharSequence _xblockexpression = null;
    {
      final Instruction i = it.getInstruction();
      CharSequence _switchResult = null;
      boolean _matched = false;
      if (i instanceof Loop) {
        _matched=true;
        CharSequence _xifexpression = null;
        boolean _isReduction = this.isReduction(((Loop)i));
        if (_isReduction) {
          StringConcatenation _builder = new StringConcatenation();
          CharSequence _content = this._ir2NUtils.getContent(((Loop)i).getIterator());
          _builder.append(_content);
          _builder.append(" ");
          Instruction _body = ((Loop)i).getBody();
          CharSequence _reductionContent = this._instructionContentProvider.getReductionContent(((Affectation) _body));
          _builder.append(_reductionContent);
          _builder.append(" @ ");
          double _at = it.getAt();
          _builder.append(_at);
          _builder.append(";");
          _xifexpression = _builder;
        } else {
          Instruction _body_1 = ((Loop)i).getBody();
          StringConcatenation _builder_1 = new StringConcatenation();
          CharSequence _content_1 = this._ir2NUtils.getContent(((Loop)i).getIterator());
          _builder_1.append(_content_1);
          _builder_1.append(" ");
          CharSequence _header = this.getHeader(it);
          _builder_1.append(_header);
          _builder_1.append("@ ");
          double _at_1 = it.getAt();
          _builder_1.append(_at_1);
          _builder_1.append(" ");
          _xifexpression = this.getInnerJobContent(_body_1, _builder_1);
        }
        _switchResult = _xifexpression;
      }
      if (!_matched) {
        StringConcatenation _builder = new StringConcatenation();
        CharSequence _header = this.getHeader(it);
        _builder.append(_header);
        _builder.append("@ ");
        double _at = it.getAt();
        _builder.append(_at);
        _builder.append(" ");
        _switchResult = this.getInnerJobContent(i, _builder);
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _getContent(final TimeIterationCopyJob it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _loopHeader = this.getLoopHeader(it.getLeft());
    _builder.append(_loopHeader);
    _builder.append(" ");
    CharSequence _header = this.getHeader(it);
    _builder.append(_header);
    _builder.append("@ ");
    double _at = it.getAt();
    _builder.append(_at);
    _builder.append(" { ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _name = it.getLeft().getName();
    _builder.append(_name, "\t");
    _builder.append(" = ");
    String _name_1 = it.getRight().getName();
    _builder.append(_name_1, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence getHeader(final Job it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(it.getName());
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _name = it.getName();
        _builder.append(_name);
        _builder.append(" ");
      }
    }
    return _builder;
  }
  
  private CharSequence _getInnerJobContent(final Instruction i, final CharSequence header) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(header);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _content = this._instructionContentProvider.getContent(i);
    _builder.append(_content, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence _getInnerJobContent(final InstructionBlock i, final CharSequence header) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(header);
    CharSequence _content = this._instructionContentProvider.getContent(i);
    _builder.append(_content);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence _getLoopHeader(final ScalarVariable v) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  private CharSequence _getLoopHeader(final ArrayVariable v) {
    final Function1<Connectivity, String> _function = new Function1<Connectivity, String>() {
      @Override
      public String apply(final Connectivity d) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("∀ ");
        String _literal = d.getReturnType().getType().getLiteral();
        _builder.append(_literal);
        _builder.append("s");
        return _builder.toString();
      }
    };
    return IterableExtensions.join(ListExtensions.<Connectivity, String>map(v.getDimensions(), _function), " ");
  }
  
  private boolean isReduction(final Loop it) {
    return ((it.getBody() instanceof Affectation) && 
      ReplaceExternalReductions.ReductionOperators.values().contains(((Affectation) it.getBody()).getOperator()));
  }
  
  public CharSequence getContent(final Job it) {
    if (it instanceof InstructionJob) {
      return _getContent((InstructionJob)it);
    } else if (it instanceof TimeIterationCopyJob) {
      return _getContent((TimeIterationCopyJob)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  private CharSequence getInnerJobContent(final Instruction i, final CharSequence header) {
    if (i instanceof InstructionBlock) {
      return _getInnerJobContent((InstructionBlock)i, header);
    } else if (i != null) {
      return _getInnerJobContent(i, header);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(i, header).toString());
    }
  }
  
  private CharSequence getLoopHeader(final Variable v) {
    if (v instanceof ArrayVariable) {
      return _getLoopHeader((ArrayVariable)v);
    } else if (v instanceof ScalarVariable) {
      return _getLoopHeader((ScalarVariable)v);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(v).toString());
    }
  }
}
