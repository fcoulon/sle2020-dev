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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literal Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.EnumLiteralRef#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.EnumLiteralRef#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getEnumLiteralRef()
 * @model
 * @generated
 */
public interface EnumLiteralRef extends Literal
{
  /**
   * Returns the value of the '<em><b>Enum</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum</em>' reference.
   * @see #setEnum(Enumeration)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getEnumLiteralRef_Enum()
   * @model
   * @generated
   */
  Enumeration getEnum();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.EnumLiteralRef#getEnum <em>Enum</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum</em>' reference.
   * @see #getEnum()
   * @generated
   */
  void setEnum(Enumeration value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' reference.
   * @see #setLiteral(EnumerationLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getEnumLiteralRef_Literal()
   * @model
   * @generated
   */
  EnumerationLiteral getLiteral();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.EnumLiteralRef#getLiteral <em>Literal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(EnumerationLiteral value);

} // EnumLiteralRef
