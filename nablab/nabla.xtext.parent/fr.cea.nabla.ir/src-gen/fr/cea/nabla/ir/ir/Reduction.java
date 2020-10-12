/**
 */
package fr.cea.nabla.ir.ir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.ir.ir.Reduction#getName <em>Name</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.Reduction#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.Reduction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.Reduction#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see fr.cea.nabla.ir.ir.IrPackage#getReduction()
 * @model
 * @generated
 */
public interface Reduction extends IrAnnotable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getReduction_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.Reduction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Collection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.cea.nabla.ir.ir.BasicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Type</em>' attribute.
	 * @see fr.cea.nabla.ir.ir.BasicType
	 * @see #setCollectionType(BasicType)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getReduction_CollectionType()
	 * @model unique="false" required="true"
	 * @generated
	 */
	BasicType getCollectionType();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.Reduction#getCollectionType <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Type</em>' attribute.
	 * @see fr.cea.nabla.ir.ir.BasicType
	 * @see #getCollectionType()
	 * @generated
	 */
	void setCollectionType(BasicType value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.cea.nabla.ir.ir.BasicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see fr.cea.nabla.ir.ir.BasicType
	 * @see #setReturnType(BasicType)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getReduction_ReturnType()
	 * @model unique="false" required="true"
	 * @generated
	 */
	BasicType getReturnType();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.Reduction#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see fr.cea.nabla.ir.ir.BasicType
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(BasicType value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getReduction_Provider()
	 * @model required="true"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.Reduction#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

} // Reduction
