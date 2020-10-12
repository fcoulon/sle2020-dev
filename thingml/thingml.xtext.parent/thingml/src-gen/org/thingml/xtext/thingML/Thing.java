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
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.Thing#isFragment <em>Fragment</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.Thing#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.Thing#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.Thing#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.Thing#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.Thing#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.Thing#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.Thing#getBehaviour <em>Behaviour</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getThing()
 * @model
 * @generated
 */
public interface Thing extends Type
{
  /**
   * Returns the value of the '<em><b>Fragment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fragment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fragment</em>' attribute.
   * @see #setFragment(boolean)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getThing_Fragment()
   * @model
   * @generated
   */
  boolean isFragment();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.Thing#isFragment <em>Fragment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fragment</em>' attribute.
   * @see #isFragment()
   * @generated
   */
  void setFragment(boolean value);

  /**
   * Returns the value of the '<em><b>Includes</b></em>' reference list.
   * The list contents are of type {@link org.thingml.xtext.thingML.Thing}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' reference list.
   * @see org.thingml.xtext.thingML.ThingMLPackage#getThing_Includes()
   * @model
   * @generated
   */
  EList<Thing> getIncludes();

  /**
   * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
   * The list contents are of type {@link org.thingml.xtext.thingML.Message}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages</em>' containment reference list.
   * @see org.thingml.xtext.thingML.ThingMLPackage#getThing_Messages()
   * @model containment="true"
   * @generated
   */
  EList<Message> getMessages();

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link org.thingml.xtext.thingML.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see org.thingml.xtext.thingML.ThingMLPackage#getThing_Ports()
   * @model containment="true"
   * @generated
   */
  EList<Port> getPorts();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.thingml.xtext.thingML.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.thingml.xtext.thingML.ThingMLPackage#getThing_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.thingml.xtext.thingML.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.thingml.xtext.thingML.ThingMLPackage#getThing_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

  /**
   * Returns the value of the '<em><b>Assign</b></em>' containment reference list.
   * The list contents are of type {@link org.thingml.xtext.thingML.PropertyAssign}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign</em>' containment reference list.
   * @see org.thingml.xtext.thingML.ThingMLPackage#getThing_Assign()
   * @model containment="true"
   * @generated
   */
  EList<PropertyAssign> getAssign();

  /**
   * Returns the value of the '<em><b>Behaviour</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviour</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviour</em>' containment reference.
   * @see #setBehaviour(CompositeState)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getThing_Behaviour()
   * @model containment="true"
   * @generated
   */
  CompositeState getBehaviour();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.Thing#getBehaviour <em>Behaviour</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behaviour</em>' containment reference.
   * @see #getBehaviour()
   * @generated
   */
  void setBehaviour(CompositeState value);

} // Thing
