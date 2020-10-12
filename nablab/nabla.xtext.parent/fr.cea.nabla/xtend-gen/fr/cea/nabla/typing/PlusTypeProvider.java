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
package fr.cea.nabla.typing;

import com.google.common.base.Objects;
import fr.cea.nabla.nabla.BasicType;
import fr.cea.nabla.typing.BinaryOperatorTypeProvider;
import fr.cea.nabla.typing.NablaType;

@SuppressWarnings("all")
public class PlusTypeProvider implements BinaryOperatorTypeProvider {
  @Override
  public NablaType typeFor(final NablaType leftType, final NablaType rightType) {
    NablaType _xblockexpression = null;
    {
      if (((!NablaType.isBasicType(leftType)) || (!NablaType.isBasicType(rightType)))) {
        return NablaType.UNDEFINED;
      }
      if ((Objects.equal(leftType.getBase(), BasicType.BOOL) || Objects.equal(rightType, BasicType.BOOL))) {
        return NablaType.UNDEFINED;
      }
      NablaType _switchResult = null;
      BasicType _base = leftType.getBase();
      if (_base != null) {
        switch (_base) {
          case INT:
            NablaType _switchResult_1 = null;
            BasicType _base_1 = rightType.getBase();
            if (_base_1 != null) {
              switch (_base_1) {
                case INT:
                case REAL:
                case REAL2:
                case REAL3:
                  _switchResult_1 = rightType;
                  break;
                default:
                  _switchResult_1 = NablaType.UNDEFINED;
                  break;
              }
            } else {
              _switchResult_1 = NablaType.UNDEFINED;
            }
            _switchResult = _switchResult_1;
            break;
          case REAL:
            NablaType _switchResult_2 = null;
            BasicType _base_2 = rightType.getBase();
            if (_base_2 != null) {
              switch (_base_2) {
                case INT:
                  return leftType;
                case REAL:
                case REAL2:
                case REAL3:
                  _switchResult_2 = rightType;
                  break;
                default:
                  _switchResult_2 = NablaType.UNDEFINED;
                  break;
              }
            } else {
              _switchResult_2 = NablaType.UNDEFINED;
            }
            _switchResult = _switchResult_2;
            break;
          case REAL2:
            NablaType _switchResult_3 = null;
            BasicType _base_3 = rightType.getBase();
            if (_base_3 != null) {
              switch (_base_3) {
                case INT:
                case REAL:
                case REAL2:
                  return leftType;
                default:
                  _switchResult_3 = NablaType.UNDEFINED;
                  break;
              }
            } else {
              _switchResult_3 = NablaType.UNDEFINED;
            }
            _switchResult = _switchResult_3;
            break;
          case REAL3:
            NablaType _switchResult_4 = null;
            BasicType _base_4 = rightType.getBase();
            if (_base_4 != null) {
              switch (_base_4) {
                case INT:
                case REAL:
                case REAL3:
                  return leftType;
                default:
                  _switchResult_4 = NablaType.UNDEFINED;
                  break;
              }
            } else {
              _switchResult_4 = NablaType.UNDEFINED;
            }
            _switchResult = _switchResult_4;
            break;
          case REAL2X2:
            NablaType _switchResult_5 = null;
            BasicType _base_5 = rightType.getBase();
            if (_base_5 != null) {
              switch (_base_5) {
                case REAL2X2:
                  _switchResult_5 = leftType;
                  break;
                default:
                  _switchResult_5 = NablaType.UNDEFINED;
                  break;
              }
            } else {
              _switchResult_5 = NablaType.UNDEFINED;
            }
            _switchResult = _switchResult_5;
            break;
          case REAL3X3:
            NablaType _switchResult_6 = null;
            BasicType _base_6 = rightType.getBase();
            if (_base_6 != null) {
              switch (_base_6) {
                case REAL3X3:
                  _switchResult_6 = leftType;
                  break;
                default:
                  _switchResult_6 = NablaType.UNDEFINED;
                  break;
              }
            } else {
              _switchResult_6 = NablaType.UNDEFINED;
            }
            _switchResult = _switchResult_6;
            break;
          default:
            _switchResult = NablaType.UNDEFINED;
            break;
        }
      } else {
        _switchResult = NablaType.UNDEFINED;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
