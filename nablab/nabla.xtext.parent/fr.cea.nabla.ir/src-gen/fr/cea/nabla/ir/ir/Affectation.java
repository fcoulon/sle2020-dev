/**
 */
package fr.cea.nabla.ir.ir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.ir.ir.Affectation#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.Affectation#getOperator <em>Operator</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.Affectation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see fr.cea.nabla.ir.ir.IrPackage#getAffectation()
 * @model
 * @generated
 */
public interface Affectation extends Instruction {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(VarRef)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getAffectation_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VarRef getLeft();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.Affectation#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(VarRef value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getAffectation_Operator()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.Affectation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getAffectation_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.Affectation#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // Affectation
