/**
 */
package fr.cea.nabla.ir.ir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.ir.ir.IrModule#getName <em>Name</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.IrModule#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.IrModule#getFunctions <em>Functions</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.IrModule#getReductions <em>Reductions</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.IrModule#getConnectivities <em>Connectivities</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.IrModule#getVariables <em>Variables</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.IrModule#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @see fr.cea.nabla.ir.ir.IrPackage#getIrModule()
 * @model
 * @generated
 */
public interface IrModule extends IrAnnotable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.cea.nabla.ir.ir.IrPackage#getIrModule_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.cea.nabla.ir.ir.IrModule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nabla.ir.ir.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see fr.cea.nabla.ir.ir.IrPackage#getIrModule_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nabla.ir.ir.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see fr.cea.nabla.ir.ir.IrPackage#getIrModule_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunctions();

	/**
	 * Returns the value of the '<em><b>Reductions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nabla.ir.ir.Reduction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reductions</em>' containment reference list.
	 * @see fr.cea.nabla.ir.ir.IrPackage#getIrModule_Reductions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reduction> getReductions();

	/**
	 * Returns the value of the '<em><b>Connectivities</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nabla.ir.ir.Connectivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivities</em>' containment reference list.
	 * @see fr.cea.nabla.ir.ir.IrPackage#getIrModule_Connectivities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connectivity> getConnectivities();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nabla.ir.ir.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see fr.cea.nabla.ir.ir.IrPackage#getIrModule_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nabla.ir.ir.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see fr.cea.nabla.ir.ir.IrPackage#getIrModule_Jobs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Job> getJobs();

} // IrModule
