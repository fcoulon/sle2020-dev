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

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import fr.cea.nabla.ir.generator.IrGenerator;
import fr.cea.nabla.ir.generator.Utils;
import fr.cea.nabla.ir.generator.java.ExpressionContentProvider;
import fr.cea.nabla.ir.generator.java.Ir2JavaUtils;
import fr.cea.nabla.ir.generator.java.JobContentProvider;
import fr.cea.nabla.ir.generator.java.VariableExtensions;
import fr.cea.nabla.ir.ir.ArrayVariable;
import fr.cea.nabla.ir.ir.BasicType;
import fr.cea.nabla.ir.ir.Connectivity;
import fr.cea.nabla.ir.ir.Expression;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.ir.Job;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.ir.Variable;
import fr.cea.nabla.ir.transformers.FillJobHLTs;
import fr.cea.nabla.ir.transformers.IrTransformationStep;
import fr.cea.nabla.ir.transformers.OptimizeConnectivities;
import fr.cea.nabla.ir.transformers.ReplaceInternalReductions;
import fr.cea.nabla.ir.transformers.ReplaceUtf8Chars;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Ir2Java extends IrGenerator {
  private static final String FileExtension = "java";
  
  private static final List<? extends IrTransformationStep> TransformationSteps = Collections.<IrTransformationStep>unmodifiableList(CollectionLiterals.<IrTransformationStep>newArrayList(new ReplaceUtf8Chars(), new ReplaceInternalReductions(), new OptimizeConnectivities(), new FillJobHLTs()));
  
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
  private JobContentProvider _jobContentProvider;
  
  @Inject
  @Extension
  private VariableExtensions _variableExtensions;
  
  public Ir2Java() {
    super(Ir2Java.FileExtension, Ir2Java.TransformationSteps);
  }
  
  /**
   * TODO améliorer le scope des itérateurs de reduction
   * TODO reporter les annotations en infos de debug. Comment ?
   * TODO : filtrer les propositions de complétion pour l'itérateur en fonction du type
   * TODO bug : operator multiply (1 / 4) -> appel multiply (int avec v=0) au lieu de multiply(double)
   * TODO : parallélisme de taches du graphe en Kokkos et Java.
   */
  @Override
  public CharSequence getFileContent(final IrModule it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _lowerCase = it.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("import java.util.Arrays;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.stream.IntStream;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import fr.cea.nabla.javalib.Utils;");
    _builder.newLine();
    _builder.append("import fr.cea.nabla.javalib.types.*;");
    _builder.newLine();
    _builder.append("import fr.cea.nabla.javalib.mesh.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@SuppressWarnings(\"all\")");
    _builder.newLine();
    _builder.append("public final class ");
    String _name = it.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public final static class Options");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
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
        _builder.append("\t\t");
        _builder.append("public final ");
        String _javaType = this._variableExtensions.getJavaType(v);
        _builder.append(_javaType, "\t\t");
        _builder.append(" ");
        String _name_1 = v.getName();
        _builder.append(_name_1, "\t\t");
        _builder.append(" = ");
        CharSequence _content = this._expressionContentProvider.getContent(v.getDefaultValue());
        _builder.append(_content, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final Options options;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Mesh");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final NumericMesh2D mesh;");
    _builder.newLine();
    _builder.append("\t");
    {
      Set<Connectivity> _usedConnectivities = this._utils.getUsedConnectivities(it);
      boolean _hasElements = false;
      for(final Connectivity c : _usedConnectivities) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("private final int ", "\t");
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        String _nbElems = this._utils.getNbElems(c);
        _builder.append(_nbElems, "\t");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private final VtkFileWriter2D writer;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Global Variables");
    _builder.newLine();
    _builder.append("\t");
    final Function1<ScalarVariable, Boolean> _function_1 = new Function1<ScalarVariable, Boolean>() {
      @Override
      public Boolean apply(final ScalarVariable it) {
        boolean _isConst = it.isConst();
        return Boolean.valueOf((!_isConst));
      }
    };
    final Iterable<ScalarVariable> globals = IterableExtensions.<ScalarVariable>filter(Iterables.<ScalarVariable>filter(it.getVariables(), ScalarVariable.class), _function_1);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    final Function1<ScalarVariable, Boolean> _function_2 = new Function1<ScalarVariable, Boolean>() {
      @Override
      public Boolean apply(final ScalarVariable x) {
        Expression _defaultValue = x.getDefaultValue();
        return Boolean.valueOf((_defaultValue != null));
      }
    };
    final Iterable<ScalarVariable> initializedGlobals = IterableExtensions.<ScalarVariable>filter(globals, _function_2);
    _builder.newLineIfNotEmpty();
    {
      for(final ScalarVariable uv : initializedGlobals) {
        _builder.append("\t");
        _builder.append("private ");
        String _javaType_1 = this._ir2JavaUtils.getJavaType(uv.getType());
        _builder.append(_javaType_1, "\t");
        _builder.append(" ");
        String _name_2 = uv.getName();
        _builder.append(_name_2, "\t");
        _builder.append(" = ");
        CharSequence _content_1 = this._expressionContentProvider.getContent(uv.getDefaultValue());
        _builder.append(_content_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    final Function1<ScalarVariable, Boolean> _function_3 = new Function1<ScalarVariable, Boolean>() {
      @Override
      public Boolean apply(final ScalarVariable x) {
        Expression _defaultValue = x.getDefaultValue();
        return Boolean.valueOf((_defaultValue == null));
      }
    };
    final Function1<ScalarVariable, BasicType> _function_4 = new Function1<ScalarVariable, BasicType>() {
      @Override
      public BasicType apply(final ScalarVariable it) {
        return it.getType();
      }
    };
    final Map<BasicType, List<ScalarVariable>> uninitializedGlobals = IterableExtensions.<BasicType, ScalarVariable>groupBy(IterableExtensions.<ScalarVariable>filter(globals, _function_3), _function_4);
    _builder.newLineIfNotEmpty();
    {
      Set<BasicType> _keySet = uninitializedGlobals.keySet();
      for(final BasicType type : _keySet) {
        _builder.append("\t");
        _builder.append("private ");
        String _javaType_2 = this._ir2JavaUtils.getJavaType(type);
        _builder.append(_javaType_2, "\t");
        _builder.append(" ");
        {
          List<ScalarVariable> _get = uninitializedGlobals.get(type);
          boolean _hasElements_1 = false;
          for(final ScalarVariable v_1 : _get) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(", ", "\t");
            }
            String _name_3 = v_1.getName();
            _builder.append(_name_3, "\t");
          }
        }
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    final Function1<ArrayVariable, BasicType> _function_5 = new Function1<ArrayVariable, BasicType>() {
      @Override
      public BasicType apply(final ArrayVariable it) {
        return it.getType();
      }
    };
    final Map<BasicType, List<ArrayVariable>> arrays = IterableExtensions.<BasicType, ArrayVariable>groupBy(Iterables.<ArrayVariable>filter(it.getVariables(), ArrayVariable.class), _function_5);
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = arrays.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\t");
        _builder.append("// Array Variables");
        _builder.newLine();
        {
          Set<BasicType> _keySet_1 = arrays.keySet();
          for(final BasicType type_1 : _keySet_1) {
            _builder.append("\t");
            _builder.append("private ");
            String _javaType_3 = this._ir2JavaUtils.getJavaType(type_1);
            _builder.append(_javaType_3, "\t");
            _builder.append(" ");
            {
              List<ArrayVariable> _get_1 = arrays.get(type_1);
              boolean _hasElements_2 = false;
              for(final ArrayVariable v_2 : _get_1) {
                if (!_hasElements_2) {
                  _hasElements_2 = true;
                } else {
                  _builder.appendImmediate(", ", "\t");
                }
                String _name_4 = v_2.getName();
                _builder.append(_name_4, "\t");
                {
                  int _length = ((Object[])Conversions.unwrapArray(v_2.getDimensions(), Object.class)).length;
                  IntegerRange _upTo = new IntegerRange(1, _length);
                  for(final Integer i : _upTo) {
                    _builder.append("[]");
                  }
                }
              }
            }
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_5 = it.getName();
    _builder.append(_name_5, "\t");
    _builder.append("(Options aOptions, NumericMesh2D aNumericMesh2D)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("options = aOptions;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("mesh = aNumericMesh2D;");
    _builder.newLine();
    {
      Set<Connectivity> _usedConnectivities_1 = this._utils.getUsedConnectivities(it);
      for(final Connectivity c_1 : _usedConnectivities_1) {
        _builder.append("\t\t");
        String _nbElems_1 = this._utils.getNbElems(c_1);
        _builder.append(_nbElems_1, "\t\t");
        _builder.append(" = ");
        CharSequence _connectivityAccessor = this.getConnectivityAccessor(c_1);
        _builder.append(_connectivityAccessor, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("writer = new VtkFileWriter2D(\"");
    String _name_6 = it.getName();
    _builder.append(_name_6, "\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Arrays allocation");
    _builder.newLine();
    {
      Iterable<ArrayVariable> _filter_1 = Iterables.<ArrayVariable>filter(it.getVariables(), ArrayVariable.class);
      for(final ArrayVariable a : _filter_1) {
        _builder.append("\t\t");
        String _name_7 = a.getName();
        _builder.append(_name_7, "\t\t");
        _builder.append(" = new ");
        String _javaType_4 = this._ir2JavaUtils.getJavaType(a.getType());
        _builder.append(_javaType_4, "\t\t");
        {
          EList<Connectivity> _dimensions = a.getDimensions();
          for(final Connectivity d : _dimensions) {
            _builder.append("[");
            String _nbElems_2 = this._utils.getNbElems(d);
            _builder.append(_nbElems_2, "\t\t");
            _builder.append("]");
          }
        }
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        {
          boolean _isJavaBasicType = this._ir2JavaUtils.isJavaBasicType(a.getType());
          boolean _not_1 = (!_isJavaBasicType);
          if (_not_1) {
            EList<Connectivity> _dimensions_1 = a.getDimensions();
            String _name_8 = a.getName();
            String _javaType_5 = this._ir2JavaUtils.getJavaType(a.getType());
            String _plus = ("new " + _javaType_5);
            String _plus_1 = (_plus + "(0.0)");
            ArrayList<String> _arrayList = new ArrayList<String>();
            CharSequence _allocate = this.allocate(_dimensions_1, _name_8, _plus_1, _arrayList);
            _builder.append(_allocate, "\t\t");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      final Function1<Variable, Boolean> _function_6 = new Function1<Variable, Boolean>() {
        @Override
        public Boolean apply(final Variable x) {
          String _name = x.getName();
          return Boolean.valueOf(Objects.equal(_name, "coord"));
        }
      };
      boolean _exists = IterableExtensions.<Variable>exists(it.getVariables(), _function_6);
      if (_exists) {
        _builder.append("\t\t");
        _builder.append("// Copy node coordinates");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("ArrayList<Real2> gNodes = mesh.getGeometricMesh().getNodes();");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("IntStream.range(0, nbNodes).parallel().forEach(rNodes -> coord[rNodes] = gNodes.get(rNodes));");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      final Function1<Job, Double> _function_7 = new Function1<Job, Double>() {
        @Override
        public Double apply(final Job it) {
          return Double.valueOf(it.getAt());
        }
      };
      List<Job> _sortBy = IterableExtensions.<Job, Double>sortBy(it.getJobs(), _function_7);
      boolean _hasElements_3 = false;
      for(final Job j : _sortBy) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate("\n", "\t");
        }
        _builder.append("\t");
        CharSequence _content_2 = this._jobContentProvider.getContent(j);
        _builder.append(_content_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void simulate()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"Début de l\'exécution du module ");
    String _name_9 = it.getName();
    _builder.append(_name_9, "\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    {
      final Function1<Job, Boolean> _function_8 = new Function1<Job, Boolean>() {
        @Override
        public Boolean apply(final Job x) {
          double _at = x.getAt();
          return Boolean.valueOf((_at < 0));
        }
      };
      final Function1<Job, Double> _function_9 = new Function1<Job, Double>() {
        @Override
        public Double apply(final Job it) {
          return Double.valueOf(it.getAt());
        }
      };
      List<Job> _sortBy_1 = IterableExtensions.<Job, Double>sortBy(IterableExtensions.<Job>filter(it.getJobs(), _function_8), _function_9);
      for(final Job j_1 : _sortBy_1) {
        _builder.append("\t\t");
        String _firstLower = StringExtensions.toFirstLower(j_1.getName());
        _builder.append(_firstLower, "\t\t");
        _builder.append("(); // @");
        double _at = j_1.getAt();
        _builder.append(_at, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      final Function1<Job, Boolean> _function_10 = new Function1<Job, Boolean>() {
        @Override
        public Boolean apply(final Job it) {
          double _at = it.getAt();
          return Boolean.valueOf((_at > 0));
        }
      };
      boolean _exists_1 = IterableExtensions.<Job>exists(it.getJobs(), _function_10);
      if (_exists_1) {
        _builder.newLine();
        _builder.append("\t\t");
        final Iterable<ArrayVariable> variablesToPersist = this.getPersistentArrayVariables(it);
        _builder.newLineIfNotEmpty();
        {
          boolean _isEmpty_1 = IterableExtensions.isEmpty(variablesToPersist);
          boolean _not_2 = (!_isEmpty_1);
          if (_not_2) {
            _builder.append("\t\t");
            _builder.append("HashMap<String, double[]> cellVariables = new HashMap<String, double[]>();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("HashMap<String, double[]> nodeVariables = new HashMap<String, double[]>();");
            _builder.newLine();
            {
              for(final ArrayVariable v_3 : variablesToPersist) {
                _builder.append("\t\t");
                String _literal = IterableExtensions.<Connectivity>head(v_3.getDimensions()).getReturnType().getType().getLiteral();
                _builder.append(_literal, "\t\t");
                _builder.append("Variables.put(\"");
                String _persistenceName = v_3.getPersistenceName();
                _builder.append(_persistenceName, "\t\t");
                _builder.append("\", ");
                String _name_10 = v_3.getName();
                _builder.append(_name_10, "\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t\t");
        _builder.append("int iteration = 0;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("while (t < options.option_stoptime && iteration < options.option_max_iterations)");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("iteration++;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("System.out.println(\"[\" + iteration + \"] t = \" + t);");
        _builder.newLine();
        {
          final Function1<Job, Boolean> _function_11 = new Function1<Job, Boolean>() {
            @Override
            public Boolean apply(final Job x) {
              double _at = x.getAt();
              return Boolean.valueOf((_at > 0));
            }
          };
          final Function1<Job, Double> _function_12 = new Function1<Job, Double>() {
            @Override
            public Double apply(final Job it) {
              return Double.valueOf(it.getAt());
            }
          };
          List<Job> _sortBy_2 = IterableExtensions.<Job, Double>sortBy(IterableExtensions.<Job>filter(it.getJobs(), _function_11), _function_12);
          for(final Job j_2 : _sortBy_2) {
            _builder.append("\t\t");
            _builder.append("\t");
            String _firstLower_1 = StringExtensions.toFirstLower(j_2.getName());
            _builder.append(_firstLower_1, "\t\t\t");
            _builder.append("(); // @");
            double _at_1 = j_2.getAt();
            _builder.append(_at_1, "\t\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _isEmpty_2 = IterableExtensions.isEmpty(variablesToPersist);
          boolean _not_3 = (!_isEmpty_2);
          if (_not_3) {
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("writer.writeFile(iteration, X, mesh.getGeometricMesh().getQuads(), cellVariables, nodeVariables);");
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("System.out.println(\"Fin de l\'exécution du module ");
    String _name_11 = it.getName();
    _builder.append(_name_11, "\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    String _name_12 = it.getName();
    _builder.append(_name_12, "\t\t");
    _builder.append(".Options o = new ");
    String _name_13 = it.getName();
    _builder.append(_name_13, "\t\t");
    _builder.append(".Options();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("Mesh<Real2> gm = CartesianMesh2DGenerator.generate(o.X_EDGE_ELEMS, o.Y_EDGE_ELEMS, o.LENGTH, o.LENGTH);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("NumericMesh2D nm = new NumericMesh2D(gm);");
    _builder.newLine();
    _builder.append("\t\t");
    String _name_14 = it.getName();
    _builder.append(_name_14, "\t\t");
    _builder.append(" i = new ");
    String _name_15 = it.getName();
    _builder.append(_name_15, "\t\t");
    _builder.append("(o, nm);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("i.simulate();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence getConnectivityAccessor(final Connectivity c) {
    CharSequence _xifexpression = null;
    boolean _isEmpty = c.getInTypes().isEmpty();
    if (_isEmpty) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("mesh.getNb");
      String _firstUpper = StringExtensions.toFirstUpper(c.getName());
      _builder.append(_firstUpper);
      _builder.append("()");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("NumericMesh2D.MaxNb");
      String _firstUpper_1 = StringExtensions.toFirstUpper(c.getName());
      _builder_1.append(_firstUpper_1);
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  private CharSequence allocate(final Iterable<Connectivity> connectivities, final String varName, final String allocation, final List<String> indexes) {
    CharSequence _xifexpression = null;
    boolean _isEmpty = IterableExtensions.isEmpty(connectivities);
    if (_isEmpty) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(varName);
      {
        for(final String i : indexes) {
          _builder.append("[");
          _builder.append(i);
          _builder.append("]");
        }
      }
      _builder.append(" = ");
      _builder.append(allocation);
      _builder.append(";");
      _xifexpression = _builder;
    } else {
      CharSequence _xblockexpression = null;
      {
        final Connectivity c = IterableExtensions.<Connectivity>head(connectivities);
        indexes.add(this.getIndexName(c));
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("IntStream.range(0, ");
        String _nbElems = this._utils.getNbElems(c);
        _builder_1.append(_nbElems);
        _builder_1.append(").parallel().forEach(");
        String _indexName = this.getIndexName(c);
        _builder_1.append(_indexName);
        _builder_1.append(" -> ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("{");
        _builder_1.newLine();
        _builder_1.append("\t");
        CharSequence _allocate = this.allocate(IterableExtensions.<Connectivity>tail(connectivities), varName, allocation, indexes);
        _builder_1.append(_allocate, "\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("});");
        _builder_1.newLine();
        _xblockexpression = _builder_1;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private String getIndexName(final Connectivity c) {
    String _firstUpper = StringExtensions.toFirstUpper(c.getName());
    return ("i" + _firstUpper);
  }
  
  private Iterable<ArrayVariable> getPersistentArrayVariables(final IrModule it) {
    final Function1<ArrayVariable, Boolean> _function = new Function1<ArrayVariable, Boolean>() {
      @Override
      public Boolean apply(final ArrayVariable x) {
        return Boolean.valueOf((x.isPersist() && (x.getDimensions().size() == 1)));
      }
    };
    return IterableExtensions.<ArrayVariable>filter(Iterables.<ArrayVariable>filter(it.getVariables(), ArrayVariable.class), _function);
  }
}
