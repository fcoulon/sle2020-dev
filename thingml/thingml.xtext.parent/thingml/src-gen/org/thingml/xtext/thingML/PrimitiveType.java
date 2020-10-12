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
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.PrimitiveType#getByteSize <em>Byte Size</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type
{
  /**
   * Returns the value of the '<em><b>Byte Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Byte Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Byte Size</em>' attribute.
   * @see #setByteSize(long)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getPrimitiveType_ByteSize()
   * @model
   * @generated
   */
  long getByteSize();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.PrimitiveType#getByteSize <em>Byte Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Byte Size</em>' attribute.
   * @see #getByteSize()
   * @generated
   */
  void setByteSize(long value);

} // PrimitiveType
