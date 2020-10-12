/**
 */
package fr.cea.nabla.ir.ir.impl;

import fr.cea.nabla.ir.ir.IrPackage;
import fr.cea.nabla.ir.ir.ReductionCall;
import fr.cea.nabla.ir.ir.ReductionInstruction;
import fr.cea.nabla.ir.ir.ScalarVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reduction Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.ir.ir.impl.ReductionInstructionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.impl.ReductionInstructionImpl#getReduction <em>Reduction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReductionInstructionImpl extends InstructionImpl implements ReductionInstruction {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected ScalarVariable variable;

	/**
	 * The cached value of the '{@link #getReduction() <em>Reduction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReduction()
	 * @generated
	 * @ordered
	 */
	protected ReductionCall reduction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReductionInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IrPackage.Literals.REDUCTION_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalarVariable getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(ScalarVariable newVariable, NotificationChain msgs) {
		ScalarVariable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IrPackage.REDUCTION_INSTRUCTION__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariable(ScalarVariable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IrPackage.REDUCTION_INSTRUCTION__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IrPackage.REDUCTION_INSTRUCTION__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IrPackage.REDUCTION_INSTRUCTION__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReductionCall getReduction() {
		if (reduction != null && reduction.eIsProxy()) {
			InternalEObject oldReduction = (InternalEObject)reduction;
			reduction = (ReductionCall)eResolveProxy(oldReduction);
			if (reduction != oldReduction) {
				InternalEObject newReduction = (InternalEObject)reduction;
				NotificationChain msgs = oldReduction.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IrPackage.REDUCTION_INSTRUCTION__REDUCTION, null, null);
				if (newReduction.eInternalContainer() == null) {
					msgs = newReduction.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IrPackage.REDUCTION_INSTRUCTION__REDUCTION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IrPackage.REDUCTION_INSTRUCTION__REDUCTION, oldReduction, reduction));
			}
		}
		return reduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionCall basicGetReduction() {
		return reduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReduction(ReductionCall newReduction, NotificationChain msgs) {
		ReductionCall oldReduction = reduction;
		reduction = newReduction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IrPackage.REDUCTION_INSTRUCTION__REDUCTION, oldReduction, newReduction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReduction(ReductionCall newReduction) {
		if (newReduction != reduction) {
			NotificationChain msgs = null;
			if (reduction != null)
				msgs = ((InternalEObject)reduction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IrPackage.REDUCTION_INSTRUCTION__REDUCTION, null, msgs);
			if (newReduction != null)
				msgs = ((InternalEObject)newReduction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IrPackage.REDUCTION_INSTRUCTION__REDUCTION, null, msgs);
			msgs = basicSetReduction(newReduction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IrPackage.REDUCTION_INSTRUCTION__REDUCTION, newReduction, newReduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IrPackage.REDUCTION_INSTRUCTION__VARIABLE:
				return basicSetVariable(null, msgs);
			case IrPackage.REDUCTION_INSTRUCTION__REDUCTION:
				return basicSetReduction(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IrPackage.REDUCTION_INSTRUCTION__VARIABLE:
				return getVariable();
			case IrPackage.REDUCTION_INSTRUCTION__REDUCTION:
				if (resolve) return getReduction();
				return basicGetReduction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IrPackage.REDUCTION_INSTRUCTION__VARIABLE:
				setVariable((ScalarVariable)newValue);
				return;
			case IrPackage.REDUCTION_INSTRUCTION__REDUCTION:
				setReduction((ReductionCall)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IrPackage.REDUCTION_INSTRUCTION__VARIABLE:
				setVariable((ScalarVariable)null);
				return;
			case IrPackage.REDUCTION_INSTRUCTION__REDUCTION:
				setReduction((ReductionCall)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IrPackage.REDUCTION_INSTRUCTION__VARIABLE:
				return variable != null;
			case IrPackage.REDUCTION_INSTRUCTION__REDUCTION:
				return reduction != null;
		}
		return super.eIsSet(featureID);
	}

} //ReductionInstructionImpl
