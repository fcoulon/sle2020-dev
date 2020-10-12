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
import fr.cea.nabla.ir.generator.n.ExpressionContentProvider;
import fr.cea.nabla.ir.generator.n.Ir2NUtils;
import fr.cea.nabla.ir.ir.Affectation;
import fr.cea.nabla.ir.ir.Expression;
import fr.cea.nabla.ir.ir.If;
import fr.cea.nabla.ir.ir.Instruction;
import fr.cea.nabla.ir.ir.InstructionBlock;
import fr.cea.nabla.ir.ir.Loop;
import fr.cea.nabla.ir.ir.ReductionInstruction;
import fr.cea.nabla.ir.ir.ScalarVarDefinition;
import fr.cea.nabla.ir.ir.ScalarVariable;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class InstructionContentProvider {
  @Inject
  @Extension
  private Ir2NUtils _ir2NUtils;
  
  @Inject
  @Extension
  private ExpressionContentProvider _expressionContentProvider;
  
  protected CharSequence _getContent(final ReductionInstruction it) {
    try {
      throw new Exception("Les instances de ReductionInstruction doivent être supprimées avant de générer le Nabla");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected CharSequence _getContent(final ScalarVarDefinition it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ScalarVariable> _variables = it.getVariables();
      for(final ScalarVariable v : _variables) {
        String _nType = this._ir2NUtils.getNType(v.getType());
        _builder.append(_nType);
        _builder.append(" ");
        String _name = v.getName();
        _builder.append(_name);
        {
          Expression _defaultValue = v.getDefaultValue();
          boolean _tripleNotEquals = (_defaultValue != null);
          if (_tripleNotEquals) {
            _builder.append(" = ");
            CharSequence _content = this._expressionContentProvider.getContent(v.getDefaultValue());
            _builder.append(_content);
          }
        }
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _getContent(final InstructionBlock it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    {
      EList<Instruction> _instructions = it.getInstructions();
      for(final Instruction i : _instructions) {
        _builder.append("\t");
        CharSequence _content = this.getContent(i);
        _builder.append(_content, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _getContent(final Affectation it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _reductionContent = this.getReductionContent(it);
    _builder.append(_reductionContent);
    _builder.append(";");
    return _builder;
  }
  
  public CharSequence getReductionContent(final Affectation it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _content = this._expressionContentProvider.getContent(it.getLeft());
    _builder.append(_content);
    _builder.append(" ");
    String _operator = it.getOperator();
    _builder.append(_operator);
    _builder.append(" ");
    CharSequence _content_1 = this._expressionContentProvider.getContent(it.getRight());
    _builder.append(_content_1);
    return _builder;
  }
  
  protected CharSequence _getContent(final Loop it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _content = this._ir2NUtils.getContent(it.getIterator());
    _builder.append(_content);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _content_1 = this.getContent(it.getBody());
    _builder.append(_content_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _getContent(final If it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (");
    CharSequence _content = this._expressionContentProvider.getContent(it.getCondition());
    _builder.append(_content);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _content_1 = this.getContent(it.getThenInstruction());
    _builder.append(_content_1, "\t");
    _builder.newLineIfNotEmpty();
    {
      Instruction _elseInstruction = it.getElseInstruction();
      boolean _tripleNotEquals = (_elseInstruction != null);
      if (_tripleNotEquals) {
        _builder.append("else {");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _content_2 = this.getContent(it.getElseInstruction());
        _builder.append(_content_2, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence getContent(final Instruction it) {
    if (it instanceof Affectation) {
      return _getContent((Affectation)it);
    } else if (it instanceof If) {
      return _getContent((If)it);
    } else if (it instanceof InstructionBlock) {
      return _getContent((InstructionBlock)it);
    } else if (it instanceof Loop) {
      return _getContent((Loop)it);
    } else if (it instanceof ReductionInstruction) {
      return _getContent((ReductionInstruction)it);
    } else if (it instanceof ScalarVarDefinition) {
      return _getContent((ScalarVarDefinition)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
