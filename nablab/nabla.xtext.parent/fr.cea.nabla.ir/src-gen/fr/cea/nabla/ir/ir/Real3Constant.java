/**
 */
package fr.cea.nabla.ir.ir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real3 Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.ir.ir.Real3Constant#getX <em>X</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.Real3Constant#getY <em>Y</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.Real3Constant#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see fr.cea.nabla.ir.ir.IrPackage#getReal3Constant()
 * @model
 * @generated
 */
public interface Real3Constant extends Expression {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getReal3Constant_X()
	 * @model unique="false" required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.Real3Constant#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getReal3Constant_Y()
	 * @model unique="false" required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.Real3Constant#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(double)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getReal3Constant_Z()
	 * @model unique="false" required="true"
	 * @generated
	 */
	double getZ();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.Real3Constant#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(double value);

} // Real3Constant
