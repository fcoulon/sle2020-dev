/**
 * generated by Xtext 2.19.0
 */
package fr.cea.nabla.nabla;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.nabla.ArrayVar#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @see fr.cea.nabla.nabla.NablaPackage#getArrayVar()
 * @model
 * @generated
 */
public interface ArrayVar extends Var
{
  /**
   * Returns the value of the '<em><b>Dimensions</b></em>' reference list.
   * The list contents are of type {@link fr.cea.nabla.nabla.Connectivity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimensions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimensions</em>' reference list.
   * @see fr.cea.nabla.nabla.NablaPackage#getArrayVar_Dimensions()
   * @model
   * @generated
   */
  EList<Connectivity> getDimensions();

} // ArrayVar
