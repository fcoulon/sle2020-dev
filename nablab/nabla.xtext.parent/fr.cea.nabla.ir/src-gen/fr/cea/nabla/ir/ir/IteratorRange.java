/**
 */
package fr.cea.nabla.ir.ir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.ir.ir.IteratorRange#getConnectivity <em>Connectivity</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.IteratorRange#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see fr.cea.nabla.ir.ir.IrPackage#getIteratorRange()
 * @model
 * @generated
 */
public interface IteratorRange extends IteratorRangeOrRef {
	/**
	 * Returns the value of the '<em><b>Connectivity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity</em>' reference.
	 * @see #setConnectivity(Connectivity)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getIteratorRange_Connectivity()
	 * @model required="true"
	 * @generated
	 */
	Connectivity getConnectivity();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.IteratorRange#getConnectivity <em>Connectivity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity</em>' reference.
	 * @see #getConnectivity()
	 * @generated
	 */
	void setConnectivity(Connectivity value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nabla.ir.ir.IteratorRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see fr.cea.nabla.ir.ir.IrPackage#getIteratorRange_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<IteratorRef> getArgs();

} // IteratorRange
