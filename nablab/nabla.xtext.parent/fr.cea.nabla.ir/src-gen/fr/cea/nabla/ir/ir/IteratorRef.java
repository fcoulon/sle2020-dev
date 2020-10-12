/**
 */
package fr.cea.nabla.ir.ir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.ir.ir.IteratorRef#getIterator <em>Iterator</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.IteratorRef#isPrev <em>Prev</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.IteratorRef#isNext <em>Next</em>}</li>
 * </ul>
 *
 * @see fr.cea.nabla.ir.ir.IrPackage#getIteratorRef()
 * @model
 * @generated
 */
public interface IteratorRef extends IteratorRangeOrRef {
	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' reference.
	 * @see #setIterator(Iterator)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getIteratorRef_Iterator()
	 * @model required="true"
	 * @generated
	 */
	Iterator getIterator();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.IteratorRef#getIterator <em>Iterator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator</em>' reference.
	 * @see #getIterator()
	 * @generated
	 */
	void setIterator(Iterator value);

	/**
	 * Returns the value of the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev</em>' attribute.
	 * @see #setPrev(boolean)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getIteratorRef_Prev()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPrev();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.IteratorRef#isPrev <em>Prev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev</em>' attribute.
	 * @see #isPrev()
	 * @generated
	 */
	void setPrev(boolean value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' attribute.
	 * @see #setNext(boolean)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getIteratorRef_Next()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNext();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.IteratorRef#isNext <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' attribute.
	 * @see #isNext()
	 * @generated
	 */
	void setNext(boolean value);

} // IteratorRef
