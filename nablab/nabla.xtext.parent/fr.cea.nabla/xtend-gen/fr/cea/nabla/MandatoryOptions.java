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

import fr.cea.nabla.nabla.BasicType;
import fr.cea.nabla.nabla.IntConstant;
import fr.cea.nabla.nabla.NablaFactory;
import fr.cea.nabla.nabla.RealXCompactConstant;
import fr.cea.nabla.nabla.ScalarVar;
import fr.cea.nabla.nabla.ScalarVarDefinition;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MandatoryOptions {
  public static final String COORD = "coord";
  
  public static final String LENGTH = "LENGTH";
  
  public static final String X_EDGE_ELEMS = "X_EDGE_ELEMS";
  
  public static final String Y_EDGE_ELEMS = "Y_EDGE_ELEMS";
  
  public static final String Z_EDGE_ELEMS = "Z_EDGE_ELEMS";
  
  public static final String STOP_TIME = "option_stoptime";
  
  public static final String MAX_ITERATIONS = "option_max_iterations";
  
  public static final List<String> OPTION_NAMES = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(MandatoryOptions.LENGTH, MandatoryOptions.X_EDGE_ELEMS, MandatoryOptions.Y_EDGE_ELEMS, MandatoryOptions.Z_EDGE_ELEMS, MandatoryOptions.STOP_TIME, MandatoryOptions.MAX_ITERATIONS));
  
  public List<ScalarVarDefinition> getOptions() {
    ScalarVarDefinition _length = this.getLength();
    ScalarVarDefinition _xEdgeElem = this.getXEdgeElem();
    ScalarVarDefinition _yEdgeElem = this.getYEdgeElem();
    ScalarVarDefinition _zEdgeElem = this.getZEdgeElem();
    ScalarVarDefinition _stopTime = this.getStopTime();
    ScalarVarDefinition _maxIterations = this.getMaxIterations();
    return Collections.<ScalarVarDefinition>unmodifiableList(CollectionLiterals.<ScalarVarDefinition>newArrayList(_length, _xEdgeElem, _yEdgeElem, _zEdgeElem, _stopTime, _maxIterations));
  }
  
  public ScalarVarDefinition getLength() {
    return this.getRealOption(MandatoryOptions.LENGTH, 1.0);
  }
  
  public ScalarVarDefinition getStopTime() {
    return this.getRealOption(MandatoryOptions.STOP_TIME, 0.1);
  }
  
  public ScalarVarDefinition getMaxIterations() {
    return this.getIntOption(MandatoryOptions.MAX_ITERATIONS, 48);
  }
  
  public ScalarVarDefinition getXEdgeElem() {
    return this.getIntOption(MandatoryOptions.X_EDGE_ELEMS, 8);
  }
  
  public ScalarVarDefinition getYEdgeElem() {
    return this.getIntOption(MandatoryOptions.Y_EDGE_ELEMS, 8);
  }
  
  public ScalarVarDefinition getZEdgeElem() {
    return this.getIntOption(MandatoryOptions.Z_EDGE_ELEMS, 1);
  }
  
  private ScalarVarDefinition getIntOption(final String optionName, final int optionValue) {
    final NablaFactory f = NablaFactory.eINSTANCE;
    final ScalarVarDefinition edgeElem = f.createScalarVarDefinition();
    ScalarVar _createScalarVar = f.createScalarVar();
    final Procedure1<ScalarVar> _function = (ScalarVar it) -> {
      it.setName(optionName);
    };
    ScalarVar _doubleArrow = ObjectExtensions.<ScalarVar>operator_doubleArrow(_createScalarVar, _function);
    edgeElem.setVariable(_doubleArrow);
    edgeElem.setType(BasicType.INT);
    IntConstant _createIntConstant = f.createIntConstant();
    final Procedure1<IntConstant> _function_1 = (IntConstant it) -> {
      it.setValue(optionValue);
    };
    IntConstant _doubleArrow_1 = ObjectExtensions.<IntConstant>operator_doubleArrow(_createIntConstant, _function_1);
    edgeElem.setDefaultValue(_doubleArrow_1);
    return edgeElem;
  }
  
  private ScalarVarDefinition getRealOption(final String optionName, final double optionValue) {
    final NablaFactory f = NablaFactory.eINSTANCE;
    final ScalarVarDefinition length = f.createScalarVarDefinition();
    ScalarVar _createScalarVar = f.createScalarVar();
    final Procedure1<ScalarVar> _function = (ScalarVar it) -> {
      it.setName(optionName);
    };
    ScalarVar _doubleArrow = ObjectExtensions.<ScalarVar>operator_doubleArrow(_createScalarVar, _function);
    length.setVariable(_doubleArrow);
    length.setType(BasicType.REAL);
    RealXCompactConstant _createRealXCompactConstant = f.createRealXCompactConstant();
    final Procedure1<RealXCompactConstant> _function_1 = (RealXCompactConstant it) -> {
      it.setType(BasicType.REAL);
      it.setValue(optionValue);
    };
    RealXCompactConstant _doubleArrow_1 = ObjectExtensions.<RealXCompactConstant>operator_doubleArrow(_createRealXCompactConstant, _function_1);
    length.setDefaultValue(_doubleArrow_1);
    return length;
  }
}
