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

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import fr.cea.nabla.ir.generator.IrGenerator;
import fr.cea.nabla.ir.generator.n.DirtyPatchProvider;
import fr.cea.nabla.ir.generator.n.ExpressionContentProvider;
import fr.cea.nabla.ir.generator.n.Ir2NUtils;
import fr.cea.nabla.ir.generator.n.JobContentProvider;
import fr.cea.nabla.ir.ir.ArrayVariable;
import fr.cea.nabla.ir.ir.BasicType;
import fr.cea.nabla.ir.ir.Connectivity;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.ir.ItemType;
import fr.cea.nabla.ir.ir.Job;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.transformers.ConfigureNablaConnectivities;
import fr.cea.nabla.ir.transformers.FillJobHLTs;
import fr.cea.nabla.ir.transformers.IrTransformationStep;
import fr.cea.nabla.ir.transformers.ReplaceDefaultValues;
import fr.cea.nabla.ir.transformers.ReplaceExternalReductions;
import fr.cea.nabla.ir.transformers.ReplaceInternalReductions;
import fr.cea.nabla.ir.transformers.ReplaceUtf8Chars;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Ir2N extends IrGenerator {
  private static final String FileExtension = "n";
  
  private static final List<? extends IrTransformationStep> TransformationSteps = Collections.<IrTransformationStep>unmodifiableList(CollectionLiterals.<IrTransformationStep>newArrayList(new ReplaceUtf8Chars(), new ReplaceInternalReductions(), new ReplaceExternalReductions(), new ReplaceDefaultValues(), new ConfigureNablaConnectivities(), new FillJobHLTs()));
  
  @Inject
  @Extension
  private Ir2NUtils _ir2NUtils;
  
  @Inject
  @Extension
  private ExpressionContentProvider _expressionContentProvider;
  
  @Inject
  @Extension
  private JobContentProvider _jobContentProvider;
  
  @Inject
  @Extension
  private DirtyPatchProvider _dirtyPatchProvider;
  
  public Ir2N() {
    super(Ir2N.FileExtension, Ir2N.TransformationSteps);
  }
  
  @Override
  public CharSequence getFileContent(final IrModule it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _fileHeader = this._dirtyPatchProvider.getFileHeader();
    _builder.append(_fileHeader);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("options {");
    _builder.newLine();
    {
      final Function1<ScalarVariable, Boolean> _function = new Function1<ScalarVariable, Boolean>() {
        @Override
        public Boolean apply(final ScalarVariable it) {
          return Boolean.valueOf(it.isConst());
        }
      };
      Iterable<ScalarVariable> _filter = IterableExtensions.<ScalarVariable>filter(Iterables.<ScalarVariable>filter(it.getVariables(), ScalarVariable.class), _function);
      for(final ScalarVariable v : _filter) {
        _builder.append("\t");
        String _nType = this._ir2NUtils.getNType(v.getType());
        _builder.append(_nType, "\t");
        _builder.append(" ");
        String _name = v.getName();
        _builder.append(_name, "\t");
        _builder.append(" = ");
        CharSequence _content = this._expressionContentProvider.getContent(v.getDefaultValue());
        _builder.append(_content, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("global {");
    _builder.newLine();
    _builder.append("\t");
    final Function1<ScalarVariable, Boolean> _function_1 = new Function1<ScalarVariable, Boolean>() {
      @Override
      public Boolean apply(final ScalarVariable it) {
        boolean _isConst = it.isConst();
        return Boolean.valueOf((!_isConst));
      }
    };
    final Function1<ScalarVariable, BasicType> _function_2 = new Function1<ScalarVariable, BasicType>() {
      @Override
      public BasicType apply(final ScalarVariable it) {
        return it.getType();
      }
    };
    final Map<BasicType, List<ScalarVariable>> varsByType = IterableExtensions.<BasicType, ScalarVariable>groupBy(IterableExtensions.<ScalarVariable>filter(Iterables.<ScalarVariable>filter(it.getVariables(), ScalarVariable.class), _function_1), _function_2);
    _builder.newLineIfNotEmpty();
    {
      Set<BasicType> _keySet = varsByType.keySet();
      for(final BasicType type : _keySet) {
        _builder.append("\t");
        String _nType_1 = this._ir2NUtils.getNType(type);
        _builder.append(_nType_1, "\t");
        _builder.append(" ");
        {
          List<ScalarVariable> _get = varsByType.get(type);
          boolean _hasElements = false;
          for(final ScalarVariable v_1 : _get) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "\t");
            }
            String _name_1 = v_1.getName();
            _builder.append(_name_1, "\t");
          }
        }
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    {
      Set<ItemType> _keySet_1 = this.getItemVariables(it).keySet();
      boolean _hasElements_1 = false;
      for(final ItemType support : _keySet_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        String _literal = support.getLiteral();
        _builder.append(_literal);
        _builder.append("s {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        final Function1<ArrayVariable, BasicType> _function_3 = new Function1<ArrayVariable, BasicType>() {
          @Override
          public BasicType apply(final ArrayVariable it) {
            return it.getType();
          }
        };
        final Map<BasicType, List<ArrayVariable>> itemVarsByType = IterableExtensions.<BasicType, ArrayVariable>groupBy(this.getItemVariables(it).get(support), _function_3);
        _builder.newLineIfNotEmpty();
        {
          Set<BasicType> _keySet_2 = itemVarsByType.keySet();
          for(final BasicType type_1 : _keySet_2) {
            _builder.append("\t");
            String _nType_2 = this._ir2NUtils.getNType(type_1);
            _builder.append(_nType_2, "\t");
            _builder.append(" ");
            {
              final Function1<ArrayVariable, Boolean> _function_4 = new Function1<ArrayVariable, Boolean>() {
                @Override
                public Boolean apply(final ArrayVariable x) {
                  String _name = x.getName();
                  return Boolean.valueOf((!Objects.equal(_name, "coord")));
                }
              };
              Iterable<ArrayVariable> _filter_1 = IterableExtensions.<ArrayVariable>filter(itemVarsByType.get(type_1), _function_4);
              boolean _hasElements_2 = false;
              for(final ArrayVariable v_2 : _filter_1) {
                if (!_hasElements_2) {
                  _hasElements_2 = true;
                } else {
                  _builder.appendImmediate(", ", "\t");
                }
                String _name_2 = v_2.getName();
                _builder.append(_name_2, "\t");
              }
            }
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("};");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("computeLoop @ 0.0 { printf(\"t = %f\\n\", t); }");
    _builder.newLine();
    _builder.newLine();
    {
      final Function1<Job, Double> _function_5 = new Function1<Job, Double>() {
        @Override
        public Double apply(final Job it) {
          return Double.valueOf(it.getAt());
        }
      };
      List<Job> _sortBy = IterableExtensions.<Job, Double>sortBy(it.getJobs(), _function_5);
      for(final Job j : _sortBy) {
        CharSequence _content_1 = this._jobContentProvider.getContent(j);
        _builder.append(_content_1);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  private Map<ItemType, List<ArrayVariable>> getItemVariables(final IrModule it) {
    try {
      Map<ItemType, List<ArrayVariable>> _xblockexpression = null;
      {
        final String msg = "** Unmanaged dimensions of variables: ";
        final Function1<ArrayVariable, Boolean> _function = new Function1<ArrayVariable, Boolean>() {
          @Override
          public Boolean apply(final ArrayVariable it) {
            int _size = it.getDimensions().size();
            return Boolean.valueOf((_size > 2));
          }
        };
        final Iterable<ArrayVariable> unmanagedDimvars = IterableExtensions.<ArrayVariable>filter(Iterables.<ArrayVariable>filter(it.getVariables(), ArrayVariable.class), _function);
        boolean _isEmpty = IterableExtensions.isEmpty(unmanagedDimvars);
        boolean _not = (!_isEmpty);
        if (_not) {
          final Function1<ArrayVariable, String> _function_1 = new Function1<ArrayVariable, String>() {
            @Override
            public String apply(final ArrayVariable it) {
              return it.getName();
            }
          };
          String _join = IterableExtensions.join(IterableExtensions.<ArrayVariable, String>map(unmanagedDimvars, _function_1), ", ");
          String _plus = (msg + _join);
          throw new Exception(_plus);
        }
        final Function1<ArrayVariable, Boolean> _function_2 = new Function1<ArrayVariable, Boolean>() {
          @Override
          public Boolean apply(final ArrayVariable it) {
            int _size = it.getDimensions().size();
            return Boolean.valueOf((_size == 1));
          }
        };
        final Iterable<ArrayVariable> dim1Vars = IterableExtensions.<ArrayVariable>filter(Iterables.<ArrayVariable>filter(it.getVariables(), ArrayVariable.class), _function_2);
        final Function1<ArrayVariable, Boolean> _function_3 = new Function1<ArrayVariable, Boolean>() {
          @Override
          public Boolean apply(final ArrayVariable it) {
            return Boolean.valueOf((!(IterableExtensions.<Connectivity>head(it.getDimensions()).getInTypes().isEmpty() && IterableExtensions.<Connectivity>head(it.getDimensions()).getReturnType().isMultiple())));
          }
        };
        final Iterable<ArrayVariable> wrongDim1Vars = IterableExtensions.<ArrayVariable>filter(dim1Vars, _function_3);
        boolean _isEmpty_1 = IterableExtensions.isEmpty(wrongDim1Vars);
        boolean _not_1 = (!_isEmpty_1);
        if (_not_1) {
          final Function1<ArrayVariable, String> _function_4 = new Function1<ArrayVariable, String>() {
            @Override
            public String apply(final ArrayVariable it) {
              return it.getName();
            }
          };
          String _join_1 = IterableExtensions.join(IterableExtensions.<ArrayVariable, String>map(wrongDim1Vars, _function_4), ", ");
          String _plus_1 = (msg + _join_1);
          throw new Exception(_plus_1);
        }
        final Function1<ArrayVariable, Boolean> _function_5 = new Function1<ArrayVariable, Boolean>() {
          @Override
          public Boolean apply(final ArrayVariable it) {
            int _size = it.getDimensions().size();
            return Boolean.valueOf((_size == 2));
          }
        };
        final Iterable<ArrayVariable> dim2Vars = IterableExtensions.<ArrayVariable>filter(Iterables.<ArrayVariable>filter(it.getVariables(), ArrayVariable.class), _function_5);
        final Function1<ArrayVariable, Boolean> _function_6 = new Function1<ArrayVariable, Boolean>() {
          @Override
          public Boolean apply(final ArrayVariable it) {
            return Boolean.valueOf((!((it.getDimensions().get(1).getInTypes().size() == 1) && Objects.equal(it.getDimensions().get(0).getReturnType().getType(), IterableExtensions.<ItemType>head(it.getDimensions().get(1).getInTypes())))));
          }
        };
        final Iterable<ArrayVariable> wrongDim2Vars = IterableExtensions.<ArrayVariable>filter(dim2Vars, _function_6);
        boolean _isEmpty_2 = IterableExtensions.isEmpty(wrongDim2Vars);
        boolean _not_2 = (!_isEmpty_2);
        if (_not_2) {
          final Function1<ArrayVariable, String> _function_7 = new Function1<ArrayVariable, String>() {
            @Override
            public String apply(final ArrayVariable it) {
              return it.getName();
            }
          };
          String _join_2 = IterableExtensions.join(IterableExtensions.<ArrayVariable, String>map(wrongDim2Vars, _function_7), ", ");
          String _plus_2 = (msg + _join_2);
          throw new Exception(_plus_2);
        }
        final Function1<ArrayVariable, ItemType> _function_8 = new Function1<ArrayVariable, ItemType>() {
          @Override
          public ItemType apply(final ArrayVariable it) {
            return IterableExtensions.<Connectivity>head(it.getDimensions()).getReturnType().getType();
          }
        };
        _xblockexpression = IterableExtensions.<ItemType, ArrayVariable>groupBy(Iterables.<ArrayVariable>filter(it.getVariables(), ArrayVariable.class), _function_8);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
