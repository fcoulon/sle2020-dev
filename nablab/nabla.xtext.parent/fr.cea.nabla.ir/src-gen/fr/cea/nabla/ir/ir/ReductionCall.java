/**
 */
package fr.cea.nabla.ir.ir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduction Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.ir.ir.ReductionCall#getReduction <em>Reduction</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.ReductionCall#getIterator <em>Iterator</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.ReductionCall#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @see fr.cea.nabla.ir.ir.IrPackage#getReductionCall()
 * @model
 * @generated
 */
public interface ReductionCall extends IrAnnotable {
	/**
	 * Returns the value of the '<em><b>Reduction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction</em>' reference.
	 * @see #setReduction(Reduction)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getReductionCall_Reduction()
	 * @model required="true"
	 * @generated
	 */
	Reduction getReduction();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.ReductionCall#getReduction <em>Reduction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reduction</em>' reference.
	 * @see #getReduction()
	 * @generated
	 */
	void setReduction(Reduction value);

	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' containment reference.
	 * @see #setIterator(Iterator)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getReductionCall_Iterator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Iterator getIterator();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.ReductionCall#getIterator <em>Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator</em>' containment reference.
	 * @see #getIterator()
	 * @generated
	 */
	void setIterator(Iterator value);

	/**
	 * Returns the value of the '<em><b>Arg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' containment reference.
	 * @see #setArg(Expression)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getReductionCall_Arg()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getArg();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.ReductionCall#getArg <em>Arg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' containment reference.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(Expression value);

} // ReductionCall
