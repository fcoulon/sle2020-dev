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
package fr.cea.nabla.ir.generator.kokkos;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import fr.cea.nabla.ir.generator.IrGenerator;
import fr.cea.nabla.ir.generator.Utils;
import fr.cea.nabla.ir.generator.kokkos.ExpressionContentProvider;
import fr.cea.nabla.ir.generator.kokkos.Ir2KokkosUtils;
import fr.cea.nabla.ir.generator.kokkos.JobContentProvider;
import fr.cea.nabla.ir.generator.kokkos.VariableExtensions;
import fr.cea.nabla.ir.ir.ArrayVariable;
import fr.cea.nabla.ir.ir.BasicType;
import fr.cea.nabla.ir.ir.Connectivity;
import fr.cea.nabla.ir.ir.Function;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.ir.Job;
import fr.cea.nabla.ir.ir.ScalarVariable;
import fr.cea.nabla.ir.transformers.FillJobHLTs;
import fr.cea.nabla.ir.transformers.IrTransformationStep;
import fr.cea.nabla.ir.transformers.OptimizeConnectivities;
import fr.cea.nabla.ir.transformers.ReplaceInternalReductions;
import fr.cea.nabla.ir.transformers.ReplaceUtf8Chars;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Ir2Kokkos extends IrGenerator {
  private static final String FileExtension = "cpp";
  
  private static final List<? extends IrTransformationStep> TransformationSteps = Collections.<IrTransformationStep>unmodifiableList(CollectionLiterals.<IrTransformationStep>newArrayList(new ReplaceUtf8Chars(), new ReplaceInternalReductions(), new OptimizeConnectivities(), new FillJobHLTs()));
  
  @Inject
  @Extension
  private Utils _utils;
  
  @Inject
  @Extension
  private Ir2KokkosUtils _ir2KokkosUtils;
  
  @Inject
  @Extension
  private ExpressionContentProvider _expressionContentProvider;
  
  @Inject
  @Extension
  private JobContentProvider _jobContentProvider;
  
  @Inject
  @Extension
  private VariableExtensions _variableExtensions;
  
  public Ir2Kokkos() {
    super(Ir2Kokkos.FileExtension, Ir2Kokkos.TransformationSteps);
  }
  
  @Override
  public CharSequence getFileContent(final IrModule it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include <iostream>");
    _builder.newLine();
    _builder.append("#include <limits>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Kokkos headers");
    _builder.newLine();
    _builder.append("#include <Kokkos_Core.hpp>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Project headers");
    _builder.newLine();
    _builder.append("#include \"mesh/NumericMesh2D.h\"");
    _builder.newLine();
    _builder.append("#include \"mesh/CartesianMesh2DGenerator.h\"");
    _builder.newLine();
    _builder.append("#include \"mesh/VtkFileWriter2D.h\"");
    _builder.newLine();
    _builder.append("#include \"Utils.h\"");
    _builder.newLine();
    _builder.append("#include \"types/Types.h\"");
    _builder.newLine();
    _builder.append("#include \"types/MathFunctions.h\"");
    _builder.newLine();
    {
      final Function1<Function, Boolean> _function = new Function1<Function, Boolean>() {
        @Override
        public Boolean apply(final Function f) {
          String _provider = f.getProvider();
          String _name = it.getName();
          return Boolean.valueOf(Objects.equal(_provider, _name));
        }
      };
      boolean _exists = IterableExtensions.<Function>exists(it.getFunctions(), _function);
      if (_exists) {
        _builder.append("#include \"");
        String _lowerCase = it.getName().toLowerCase();
        _builder.append(_lowerCase);
        _builder.append("/");
        String _name = it.getName();
        _builder.append(_name);
        _builder.append("Functions.h\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("using namespace nablalib;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class ");
    String _name_1 = it.getName();
    _builder.append(_name_1);
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("struct Options");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    {
      final Function1<ScalarVariable, Boolean> _function_1 = new Function1<ScalarVariable, Boolean>() {
        @Override
        public Boolean apply(final ScalarVariable it) {
          return Boolean.valueOf(it.isConst());
        }
      };
      Iterable<ScalarVariable> _filter = IterableExtensions.<ScalarVariable>filter(Iterables.<ScalarVariable>filter(it.getVariables(), ScalarVariable.class), _function_1);
      for(final ScalarVariable v : _filter) {
        _builder.append("\t\t");
        String _kokkosType = this._variableExtensions.getKokkosType(v);
        _builder.append(_kokkosType, "\t\t");
        _builder.append(" ");
        String _name_2 = v.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append(" = ");
        CharSequence _content = this._expressionContentProvider.getContent(v.getDefaultValue());
        _builder.append(_content, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("private:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Options* options;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NumericMesh2D* mesh;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VtkFileWriter2D writer;");
    _builder.newLine();
    _builder.append("\t");
    {
      Set<Connectivity> _usedConnectivities = this._utils.getUsedConnectivities(it);
      boolean _hasElements = false;
      for(final Connectivity c : _usedConnectivities) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("int ", "\t");
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        String _nbElems = this._utils.getNbElems(c);
        _builder.append(_nbElems, "\t");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Global Variables");
    _builder.newLine();
    _builder.append("\t");
    final Function1<ScalarVariable, Boolean> _function_2 = new Function1<ScalarVariable, Boolean>() {
      @Override
      public Boolean apply(final ScalarVariable it) {
        boolean _isConst = it.isConst();
        return Boolean.valueOf((!_isConst));
      }
    };
    final Function1<ScalarVariable, BasicType> _function_3 = new Function1<ScalarVariable, BasicType>() {
      @Override
      public BasicType apply(final ScalarVariable it) {
        return it.getType();
      }
    };
    final Map<BasicType, List<ScalarVariable>> globals = IterableExtensions.<BasicType, ScalarVariable>groupBy(IterableExtensions.<ScalarVariable>filter(Iterables.<ScalarVariable>filter(it.getVariables(), ScalarVariable.class), _function_2), _function_3);
    _builder.newLineIfNotEmpty();
    {
      Set<BasicType> _keySet = globals.keySet();
      for(final BasicType type : _keySet) {
        _builder.append("\t");
        String _kokkosType_1 = this._ir2KokkosUtils.getKokkosType(type);
        _builder.append(_kokkosType_1, "\t");
        _builder.append(" ");
        {
          List<ScalarVariable> _get = globals.get(type);
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
    final Iterable<ArrayVariable> arrays = Iterables.<ArrayVariable>filter(it.getVariables(), ArrayVariable.class);
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = IterableExtensions.isEmpty(arrays);
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\t");
        _builder.append("// Array Variables");
        _builder.newLine();
        {
          for(final ArrayVariable a : arrays) {
            _builder.append("\t");
            _builder.append("Kokkos::View<");
            String _kokkosType_2 = this._ir2KokkosUtils.getKokkosType(a.getType());
            _builder.append(_kokkosType_2, "\t");
            final Function1<Connectivity, String> _function_4 = new Function1<Connectivity, String>() {
              @Override
              public String apply(final Connectivity it) {
                return "*";
              }
            };
            String _join = IterableExtensions.join(ListExtensions.<Connectivity, String>map(a.getDimensions(), _function_4));
            _builder.append(_join, "\t");
            _builder.append("> ");
            String _name_4 = a.getName();
            _builder.append(_name_4, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t");
    String _name_5 = it.getName();
    _builder.append(_name_5, "\t");
    _builder.append("(Options* aOptions, NumericMesh2D* aNumericMesh2D)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(": options(aOptions)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(", mesh(aNumericMesh2D)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(", writer(\"");
    String _name_6 = it.getName();
    _builder.append(_name_6, "\t");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    {
      Set<Connectivity> _usedConnectivities_1 = this._utils.getUsedConnectivities(it);
      for(final Connectivity c_1 : _usedConnectivities_1) {
        _builder.append("\t");
        _builder.append(", ");
        String _nbElems_1 = this._utils.getNbElems(c_1);
        _builder.append(_nbElems_1, "\t");
        _builder.append("(");
        CharSequence _connectivityAccessor = this.getConnectivityAccessor(c_1);
        _builder.append(_connectivityAccessor, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      for(final ArrayVariable a_1 : arrays) {
        _builder.append("\t");
        _builder.append(", ");
        String _name_7 = a_1.getName();
        _builder.append(_name_7, "\t");
        _builder.append("(\"");
        String _name_8 = a_1.getName();
        _builder.append(_name_8, "\t");
        _builder.append("\", ");
        {
          EList<Connectivity> _dimensions = a_1.getDimensions();
          boolean _hasElements_2 = false;
          for(final Connectivity d : _dimensions) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(", ", "\t");
            }
            String _nbElems_2 = this._utils.getNbElems(d);
            _builder.append(_nbElems_2, "\t");
          }
        }
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Copy node coordinates");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("auto gNodes = mesh->getGeometricMesh()->getNodes();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Kokkos::parallel_for(nbNodes, KOKKOS_LAMBDA(const int rNodes)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("coord(rNodes) = gNodes[rNodes];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("private:");
    _builder.newLine();
    {
      final Function1<Job, Double> _function_5 = new Function1<Job, Double>() {
        @Override
        public Double apply(final Job it) {
          return Double.valueOf(it.getAt());
        }
      };
      List<Job> _sortBy = IterableExtensions.<Job, Double>sortBy(it.getJobs(), _function_5);
      boolean _hasElements_3 = false;
      for(final Job j : _sortBy) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate("\n", "\t");
        }
        _builder.append("\t");
        CharSequence _content_1 = this._jobContentProvider.getContent(j);
        _builder.append(_content_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void simulate()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("std::cout << \"Début de l\'exécution du module ");
    String _name_9 = it.getName();
    _builder.append(_name_9, "\t\t");
    _builder.append("\" << std::endl;");
    _builder.newLineIfNotEmpty();
    {
      final Function1<Job, Boolean> _function_6 = new Function1<Job, Boolean>() {
        @Override
        public Boolean apply(final Job x) {
          double _at = x.getAt();
          return Boolean.valueOf((_at < 0));
        }
      };
      final Function1<Job, Double> _function_7 = new Function1<Job, Double>() {
        @Override
        public Double apply(final Job it) {
          return Double.valueOf(it.getAt());
        }
      };
      List<Job> _sortBy_1 = IterableExtensions.<Job, Double>sortBy(IterableExtensions.<Job>filter(it.getJobs(), _function_6), _function_7);
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
    _builder.newLine();
    _builder.append("\t\t");
    final Iterable<ArrayVariable> variablesToPersist = this.getPersistentArrayVariables(it);
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty_1 = IterableExtensions.isEmpty(variablesToPersist);
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\t\t");
        _builder.append("map<string, Kokkos::View<double*>> cellVariables;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("map<string, Kokkos::View<double*>> nodeVariables;");
        _builder.newLine();
        {
          for(final ArrayVariable v_2 : variablesToPersist) {
            _builder.append("\t\t");
            String _literal = IterableExtensions.<Connectivity>head(v_2.getDimensions()).getReturnType().getType().getLiteral();
            _builder.append(_literal, "\t\t");
            _builder.append("Variables.insert(pair<string,Kokkos::View<double*>>(\"");
            String _persistenceName = v_2.getPersistenceName();
            _builder.append(_persistenceName, "\t\t");
            _builder.append("\", ");
            String _name_10 = v_2.getName();
            _builder.append(_name_10, "\t\t");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("int iteration = 0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while (t < options->option_stoptime && iteration < options->option_max_iterations)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("iteration++;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("std::cout << \"[\" << iteration << \"] t = \" << t << std::endl;");
    _builder.newLine();
    {
      final Function1<Job, Boolean> _function_8 = new Function1<Job, Boolean>() {
        @Override
        public Boolean apply(final Job x) {
          double _at = x.getAt();
          return Boolean.valueOf((_at > 0));
        }
      };
      final Function1<Job, Double> _function_9 = new Function1<Job, Double>() {
        @Override
        public Double apply(final Job it) {
          return Double.valueOf(it.getAt());
        }
      };
      List<Job> _sortBy_2 = IterableExtensions.<Job, Double>sortBy(IterableExtensions.<Job>filter(it.getJobs(), _function_8), _function_9);
      for(final Job j_2 : _sortBy_2) {
        _builder.append("\t\t\t");
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
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\t\t\t");
        _builder.append("auto quads = mesh->getGeometricMesh()->getQuads();");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("writer.writeFile(iteration, X, quads, cellVariables, nodeVariables);");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("std::cout << \"Fin de l\'exécution du module ");
    String _name_11 = it.getName();
    _builder.append(_name_11, "\t\t");
    _builder.append("\" << std::endl;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("};\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("int main(int argc, char* argv[]) ");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Kokkos::initialize(argc, argv);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("auto o = new ");
    String _name_12 = it.getName();
    _builder.append(_name_12, "\t");
    _builder.append("::Options();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("auto gm = CartesianMesh2DGenerator::generate(o->X_EDGE_ELEMS, o->Y_EDGE_ELEMS, o->LENGTH, o->LENGTH);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("auto nm = new NumericMesh2D(gm);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("auto c = new ");
    String _name_13 = it.getName();
    _builder.append(_name_13, "\t");
    _builder.append("(o, nm);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("c->simulate();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("delete c;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("delete nm;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("delete gm;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("delete o;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Kokkos::finalize();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence getConnectivityAccessor(final Connectivity c) {
    CharSequence _xifexpression = null;
    boolean _isEmpty = c.getInTypes().isEmpty();
    if (_isEmpty) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("mesh->getNb");
      String _firstUpper = StringExtensions.toFirstUpper(c.getName());
      _builder.append(_firstUpper);
      _builder.append("()");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("NumericMesh2D::MaxNb");
      String _firstUpper_1 = StringExtensions.toFirstUpper(c.getName());
      _builder_1.append(_firstUpper_1);
      _xifexpression = _builder_1;
    }
    return _xifexpression;
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
