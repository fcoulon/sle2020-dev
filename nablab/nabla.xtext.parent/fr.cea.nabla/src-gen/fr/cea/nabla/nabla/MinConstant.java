/**
 * generated by Xtext 2.19.0
 */
package fr.cea.nabla.nabla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.nabla.MinConstant#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.cea.nabla.nabla.NablaPackage#getMinConstant()
 * @model
 * @generated
 */
public interface MinConstant extends Expression
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.cea.nabla.nabla.BasicType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see fr.cea.nabla.nabla.BasicType
   * @see #setType(BasicType)
   * @see fr.cea.nabla.nabla.NablaPackage#getMinConstant_Type()
   * @model
   * @generated
   */
  BasicType getType();

  /**
   * Sets the value of the '{@link fr.cea.nabla.nabla.MinConstant#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see fr.cea.nabla.nabla.BasicType
   * @see #getType()
   * @generated
   */
  void setType(BasicType value);

} // MinConstant
