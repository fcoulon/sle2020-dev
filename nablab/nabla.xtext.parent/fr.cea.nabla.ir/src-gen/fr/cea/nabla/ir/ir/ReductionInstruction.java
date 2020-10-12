/**
 */
package fr.cea.nabla.ir.ir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduction Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.ir.ir.ReductionInstruction#getVariable <em>Variable</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.ReductionInstruction#getReduction <em>Reduction</em>}</li>
 * </ul>
 *
 * @see fr.cea.nabla.ir.ir.IrPackage#getReductionInstruction()
 * @model
 * @generated
 */
public interface ReductionInstruction extends Instruction {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(ScalarVariable)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getReductionInstruction_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScalarVariable getVariable();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.ReductionInstruction#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(ScalarVariable value);

	/**
	 * Returns the value of the '<em><b>Reduction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction</em>' containment reference.
	 * @see #setReduction(ReductionCall)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getReductionInstruction_Reduction()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	ReductionCall getReduction();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.ReductionInstruction#getReduction <em>Reduction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reduction</em>' containment reference.
	 * @see #getReduction()
	 * @generated
	 */
	void setReduction(ReductionCall value);

} // ReductionInstruction
