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
import fr.cea.nabla.nabla.Expression;
import fr.cea.nabla.nabla.NablaModule;
import fr.cea.nabla.nabla.ScalarVarDefinition;
import fr.cea.nabla.nabla.Var;
import fr.cea.nabla.nabla.VarGroupDeclaration;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class VarExtensions {
  public BasicType getBasicType(final Var it) {
    BasicType _xblockexpression = null;
    {
      final EObject decl = it.eContainer();
      BasicType _switchResult = null;
      boolean _matched = false;
      if (decl instanceof ScalarVarDefinition) {
        _matched=true;
        _switchResult = ((ScalarVarDefinition)decl).getType();
      }
      if (!_matched) {
        if (decl instanceof VarGroupDeclaration) {
          _matched=true;
          _switchResult = ((VarGroupDeclaration)decl).getType();
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public boolean isConst(final Var it) {
    boolean _xblockexpression = false;
    {
      final EObject decl = it.eContainer();
      boolean _switchResult = false;
      boolean _matched = false;
      if (decl instanceof ScalarVarDefinition) {
        _matched=true;
        _switchResult = ((ScalarVarDefinition)decl).isConst();
      }
      if (!_matched) {
        _switchResult = false;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public boolean isGlobal(final Var it) {
    EObject _eContainer = it.eContainer().eContainer();
    return (_eContainer instanceof NablaModule);
  }
  
  public Expression getDefaultValue(final Var it) {
    Expression _xblockexpression = null;
    {
      final EObject decl = it.eContainer();
      Expression _switchResult = null;
      boolean _matched = false;
      if (decl instanceof ScalarVarDefinition) {
        _matched=true;
        _switchResult = ((ScalarVarDefinition)decl).getDefaultValue();
      }
      if (!_matched) {
        if (decl instanceof VarGroupDeclaration) {
          _matched=true;
          _switchResult = null;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
