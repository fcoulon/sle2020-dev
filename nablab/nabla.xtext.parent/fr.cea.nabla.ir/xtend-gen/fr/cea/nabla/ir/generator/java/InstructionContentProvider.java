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
package fr.cea.nabla.ir.generator.java;

import com.google.inject.Inject;
import fr.cea.nabla.ir.generator.IndexHelper;
import fr.cea.nabla.ir.generator.Utils;
import fr.cea.nabla.ir.generator.java.ExpressionContentProvider;
import fr.cea.nabla.ir.generator.java.Ir2JavaUtils;
import fr.cea.nabla.ir.generator.java.VariableExtensions;
import fr.cea.nabla.ir.ir.Affectation;
import fr.cea.nabla.ir.ir.Expression;
import fr.cea.nabla.ir.ir.If;
import fr.cea.nabla.ir.ir.Instruction;
import fr.cea.nabla.ir.ir.InstructionBlock;
import fr.cea.nabla.ir.ir.Iterator;
import fr.cea.nabla.ir.ir.Loop;
import fr.cea.nabla.ir.ir.ReductionCall;
import fr.cea.nabla.ir.ir.ReductionInstruction;
import fr.cea.nabla.ir.ir.ScalarVarDefinition;
import fr.cea.nabla.ir.ir.ScalarVariable;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class InstructionContentProvider {
  @Inject
  @Extension
  private Utils _utils;
  
  @Inject
  @Extension
  private Ir2JavaUtils _ir2JavaUtils;
  
  @Inject
  @Extension
  private ExpressionContentProvider _expressionContentProvider;
  
  @Inject
  @Extension
  private VariableExtensions _variableExtensions;
  
  @Inject
  @Extension
  private IndexHelper _indexHelper;
  
  protected CharSequence _getInnerContent(final Instruction it) {
    return this.getContent(it);
  }
  
  protected CharSequence _getInnerContent(final InstructionBlock it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Instruction> _instructions = it.getInstructions();
      for(final Instruction i : _instructions) {
        CharSequence _content = this.getContent(i);
        _builder.append(_content);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  /**
   * Les réductions à l'intérieur des boucles ont été remplacées dans l'IR par des boucles.
   * Ne restent que les réductions au niveau des jobs => reduction //
   */
  protected CharSequence _getContent(final ReductionInstruction it) {
    StringConcatenation _builder = new StringConcatenation();
    String _javaType = this._variableExtensions.getJavaType(it.getVariable());
    _builder.append(_javaType);
    _builder.append(" ");
    String _name = it.getVariable().getName();
    _builder.append(_name);
    _builder.append(" = IntStream.range(0, ");
    String _nbElems = this._utils.getNbElems(it.getReduction().getIterator().getRange().getConnectivity());
    _builder.append(_nbElems);
    _builder.append(").boxed().parallel().reduce(");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _content = this._expressionContentProvider.getContent(it.getVariable().getDefaultValue());
    _builder.append(_content, "\t");
    _builder.append(", ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("(r, ");
    String _label = IndexHelper.IndexFactory.createIndex(it.getReduction().getIterator()).getLabel();
    _builder.append(_label, "\t");
    _builder.append(") -> ");
    CharSequence _javaName = this.getJavaName(it.getReduction());
    _builder.append(_javaName, "\t");
    _builder.append("(r, ");
    CharSequence _content_1 = this._expressionContentProvider.getContent(it.getReduction().getArg());
    _builder.append(_content_1, "\t");
    _builder.append("),");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("(r1, r2) -> ");
    CharSequence _javaName_1 = this.getJavaName(it.getReduction());
    _builder.append(_javaName_1, "\t");
    _builder.append("(r1, r2)");
    _builder.newLineIfNotEmpty();
    _builder.append(");");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _getContent(final ScalarVarDefinition it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ScalarVariable> _variables = it.getVariables();
      for(final ScalarVariable v : _variables) {
        String _javaType = this._variableExtensions.getJavaType(v);
        _builder.append(_javaType);
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
    CharSequence _xifexpression = null;
    boolean _isJavaBasicType = this._ir2JavaUtils.isJavaBasicType(it.getLeft().getVariable().getType());
    if (_isJavaBasicType) {
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _content = this._expressionContentProvider.getContent(it.getLeft());
      _builder.append(_content);
      _builder.append(" ");
      String _operator = it.getOperator();
      _builder.append(_operator);
      _builder.append(" ");
      CharSequence _content_1 = this._expressionContentProvider.getContent(it.getRight());
      _builder.append(_content_1);
      _builder.append(";");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      CharSequence _content_2 = this._expressionContentProvider.getContent(it.getLeft());
      _builder_1.append(_content_2);
      _builder_1.append(".");
      String _javaOperator = this._ir2JavaUtils.getJavaOperator(it.getOperator());
      _builder_1.append(_javaOperator);
      _builder_1.append("(");
      CharSequence _content_3 = this._expressionContentProvider.getContent(it.getRight());
      _builder_1.append(_content_3);
      _builder_1.append(");");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _getContent(final Loop it) {
    CharSequence _xifexpression = null;
    boolean _isTopLevelLoop = this._utils.isTopLevelLoop(it);
    if (_isTopLevelLoop) {
      _xifexpression = this.addParallelLoop(it.getIterator(), it);
    } else {
      _xifexpression = this.addSequentialLoop(it.getIterator(), it);
    }
    return _xifexpression;
  }
  
  protected CharSequence _getContent(final If it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (");
    CharSequence _content = this._expressionContentProvider.getContent(it.getCondition());
    _builder.append(_content);
    _builder.append(") ");
    _builder.newLineIfNotEmpty();
    {
      Instruction _thenInstruction = it.getThenInstruction();
      boolean _not = (!(_thenInstruction instanceof InstructionBlock));
      if (_not) {
        _builder.append("\t");
      }
    }
    CharSequence _content_1 = this.getContent(it.getThenInstruction());
    _builder.append(_content_1);
    _builder.newLineIfNotEmpty();
    {
      Instruction _elseInstruction = it.getElseInstruction();
      boolean _tripleNotEquals = (_elseInstruction != null);
      if (_tripleNotEquals) {
        _builder.append("else ");
        _builder.newLine();
        {
          Instruction _elseInstruction_1 = it.getElseInstruction();
          boolean _not_1 = (!(_elseInstruction_1 instanceof InstructionBlock));
          if (_not_1) {
            _builder.append("\t");
          }
        }
        CharSequence _content_2 = this.getContent(it.getElseInstruction());
        _builder.append(_content_2);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private CharSequence addParallelLoop(final Iterator it, final Loop l) {
    StringConcatenation _builder = new StringConcatenation();
    final IndexHelper.Index itIndex = IndexHelper.IndexFactory.createIndex(it);
    _builder.newLineIfNotEmpty();
    {
      boolean _isIndexEqualId = it.getRange().getConnectivity().isIndexEqualId();
      boolean _not = (!_isIndexEqualId);
      if (_not) {
        _builder.append("int[] ");
        String _containerName = itIndex.getContainerName();
        _builder.append(_containerName);
        _builder.append(" = ");
        CharSequence _accessor = this._ir2JavaUtils.getAccessor(it.getRange());
        _builder.append(_accessor);
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("IntStream.range(0, ");
    String _nbElems = this._utils.getNbElems(it.getRange().getConnectivity());
    _builder.append(_nbElems);
    _builder.append(").parallel().forEach(");
    String _label = itIndex.getLabel();
    _builder.append(_label);
    _builder.append(" -> ");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    {
      boolean _needIdFor = this._indexHelper.needIdFor(it, l);
      if (_needIdFor) {
        _builder.append("int ");
        String _name = it.getName();
        _builder.append(_name, "\t");
        _builder.append("Id = ");
        String _indexToId = this._indexHelper.indexToId(itIndex);
        _builder.append(_indexToId, "\t");
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Iterable<IndexHelper.Index> _requiredIndexes = this._indexHelper.getRequiredIndexes(l);
      for(final IndexHelper.Index index : _requiredIndexes) {
        _builder.append("\t");
        _builder.append("int ");
        String _label_1 = index.getLabel();
        _builder.append(_label_1, "\t");
        _builder.append(" = ");
        String _name_1 = it.getName();
        String _plus = (_name_1 + "Id");
        String _idToIndex = this.idToIndex(index, _plus);
        _builder.append(_idToIndex, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    CharSequence _innerContent = this.getInnerContent(l.getBody());
    _builder.append(_innerContent, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence addSequentialLoop(final Iterator it, final Loop l) {
    StringConcatenation _builder = new StringConcatenation();
    final IndexHelper.Index itIndex = IndexHelper.IndexFactory.createIndex(it);
    _builder.newLineIfNotEmpty();
    _builder.append("int[] ");
    String _containerName = itIndex.getContainerName();
    _builder.append(_containerName);
    _builder.append(" = ");
    CharSequence _accessor = this._ir2JavaUtils.getAccessor(it.getRange());
    _builder.append(_accessor);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("for (int ");
    String _label = itIndex.getLabel();
    _builder.append(_label);
    _builder.append("=0; ");
    String _label_1 = itIndex.getLabel();
    _builder.append(_label_1);
    _builder.append("<");
    String _containerName_1 = itIndex.getContainerName();
    _builder.append(_containerName_1);
    _builder.append(".length; ");
    String _label_2 = itIndex.getLabel();
    _builder.append(_label_2);
    _builder.append("++)");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    {
      boolean _needPrev = this._indexHelper.needPrev(it, l);
      if (_needPrev) {
        _builder.append("int ");
        String _prev = this._utils.prev(itIndex.getLabel());
        _builder.append(_prev, "\t");
        _builder.append(" = (");
        String _label_3 = itIndex.getLabel();
        _builder.append(_label_3, "\t");
        _builder.append("-1+");
        String _containerName_2 = itIndex.getContainerName();
        _builder.append(_containerName_2, "\t");
        _builder.append(".length)%");
        String _containerName_3 = itIndex.getContainerName();
        _builder.append(_containerName_3, "\t");
        _builder.append(".length;");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      boolean _needNext = this._indexHelper.needNext(it, l);
      if (_needNext) {
        _builder.append("int ");
        String _next = this._utils.next(itIndex.getLabel());
        _builder.append(_next, "\t");
        _builder.append(" = (");
        String _label_4 = itIndex.getLabel();
        _builder.append(_label_4, "\t");
        _builder.append("+1+");
        String _containerName_4 = itIndex.getContainerName();
        _builder.append(_containerName_4, "\t");
        _builder.append(".length)%");
        String _containerName_5 = itIndex.getContainerName();
        _builder.append(_containerName_5, "\t");
        _builder.append(".length;");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      boolean _needIdFor = this._indexHelper.needIdFor(it, l);
      if (_needIdFor) {
        _builder.append("\t");
        String _name = it.getName();
        final String idName = (_name + "Id");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("int ");
        _builder.append(idName, "\t");
        _builder.append(" = ");
        String _indexToId = this._indexHelper.indexToId(itIndex);
        _builder.append(_indexToId, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          boolean _needPrev_1 = this._indexHelper.needPrev(it, l);
          if (_needPrev_1) {
            _builder.append("int ");
            String _prev_1 = this._utils.prev(idName);
            _builder.append(_prev_1, "\t");
            _builder.append(" = ");
            String _indexToId_1 = this._indexHelper.indexToId(itIndex, "prev");
            _builder.append(_indexToId_1, "\t");
            _builder.append(";");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          boolean _needNext_1 = this._indexHelper.needNext(it, l);
          if (_needNext_1) {
            _builder.append("int ");
            String _next_1 = this._utils.next(idName);
            _builder.append(_next_1, "\t");
            _builder.append(" = ");
            String _indexToId_2 = this._indexHelper.indexToId(itIndex, "next");
            _builder.append(_indexToId_2, "\t");
            _builder.append(";");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          Iterable<IndexHelper.Index> _requiredIndexes = this._indexHelper.getRequiredIndexes(l);
          for(final IndexHelper.Index index : _requiredIndexes) {
            _builder.append("\t");
            String _name_1 = index.getIterator().getName();
            final String cIdName = (_name_1 + "Id");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            {
              boolean _isIndexEqualId = index.getConnectivity().isIndexEqualId();
              boolean _not = (!_isIndexEqualId);
              if (_not) {
                CharSequence _idToIndexArray = this.idToIndexArray(index);
                _builder.append(_idToIndexArray, "\t");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("int ");
            String _label_5 = index.getLabel();
            _builder.append(_label_5, "\t");
            _builder.append(" = ");
            String _idToIndex = this.idToIndex(index, cIdName);
            _builder.append(_idToIndex, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            {
              boolean _needPrev_2 = this._indexHelper.needPrev(it, l);
              if (_needPrev_2) {
                _builder.append("int ");
                String _prev_2 = this._utils.prev(index.getLabel());
                _builder.append(_prev_2, "\t");
                _builder.append(" = ");
                String _idToIndex_1 = this.idToIndex(index, this._utils.prev(cIdName));
                _builder.append(_idToIndex_1, "\t");
                _builder.append(";");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            {
              boolean _needNext_2 = this._indexHelper.needNext(it, l);
              if (_needNext_2) {
                _builder.append("int ");
                String _next_2 = this._utils.next(index.getLabel());
                _builder.append(_next_2, "\t");
                _builder.append(" = ");
                String _idToIndex_2 = this.idToIndex(index, this._utils.next(cIdName));
                _builder.append(_idToIndex_2, "\t");
                _builder.append(";");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    CharSequence _innerContent = this.getInnerContent(l.getBody());
    _builder.append(_innerContent, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence idToIndexArray(final IndexHelper.Index it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("int[] ");
    String _containerName = it.getContainerName();
    _builder.append(_containerName);
    _builder.append(" = mesh.get");
    String _firstUpper = StringExtensions.toFirstUpper(it.getConnectivity().getName());
    _builder.append(_firstUpper);
    _builder.append("(");
    String _connectivityArgIterator = it.getConnectivityArgIterator();
    _builder.append(_connectivityArgIterator);
    _builder.append("Id);");
    return _builder;
  }
  
  private CharSequence getJavaName(final ReductionCall it) {
    StringConcatenation _builder = new StringConcatenation();
    String _provider = it.getReduction().getProvider();
    _builder.append(_provider);
    _builder.append("Functions.");
    String _name = it.getReduction().getName();
    _builder.append(_name);
    return _builder;
  }
  
  private String idToIndex(final IndexHelper.Index i, final String idName) {
    return this._indexHelper.idToIndex(i, idName, ".");
  }
  
  public CharSequence getInnerContent(final Instruction it) {
    if (it instanceof InstructionBlock) {
      return _getInnerContent((InstructionBlock)it);
    } else if (it != null) {
      return _getInnerContent(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
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
