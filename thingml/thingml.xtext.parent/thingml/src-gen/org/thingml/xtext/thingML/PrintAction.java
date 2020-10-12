/**
 * *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *  *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.thingml.xtext.thingML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.PrintAction#isLine <em>Line</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.PrintAction#getMsg <em>Msg</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getPrintAction()
 * @model
 * @generated
 */
public interface PrintAction extends Action
{
  /**
   * Returns the value of the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line</em>' attribute.
   * @see #setLine(boolean)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getPrintAction_Line()
   * @model
   * @generated
   */
  boolean isLine();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.PrintAction#isLine <em>Line</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line</em>' attribute.
   * @see #isLine()
   * @generated
   */
  void setLine(boolean value);

  /**
   * Returns the value of the '<em><b>Msg</b></em>' containment reference list.
   * The list contents are of type {@link org.thingml.xtext.thingML.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msg</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg</em>' containment reference list.
   * @see org.thingml.xtext.thingML.ThingMLPackage#getPrintAction_Msg()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getMsg();

} // PrintAction
