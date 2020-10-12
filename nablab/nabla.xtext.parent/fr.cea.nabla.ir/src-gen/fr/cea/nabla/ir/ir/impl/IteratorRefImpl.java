/**
 */
package fr.cea.nabla.ir.ir.impl;

import fr.cea.nabla.ir.ir.IrPackage;
import fr.cea.nabla.ir.ir.Iterator;
import fr.cea.nabla.ir.ir.IteratorRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterator Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.ir.ir.impl.IteratorRefImpl#getIterator <em>Iterator</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.impl.IteratorRefImpl#isPrev <em>Prev</em>}</li>
 *   <li>{@link fr.cea.nabla.ir.ir.impl.IteratorRefImpl#isNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IteratorRefImpl extends IteratorRangeOrRefImpl implements IteratorRef {
	/**
	 * The cached value of the '{@link #getIterator() <em>Iterator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterator()
	 * @generated
	 * @ordered
	 */
	protected Iterator iterator;

	/**
	 * The default value of the '{@link #isPrev() <em>Prev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrev()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREV_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrev() <em>Prev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrev()
	 * @generated
	 * @ordered
	 */
	protected boolean prev = PREV_EDEFAULT;

	/**
	 * The default value of the '{@link #isNext() <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNext()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEXT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNext() <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNext()
	 * @generated
	 * @ordered
	 */
	protected boolean next = NEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IteratorRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IrPackage.Literals.ITERATOR_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Iterator getIterator() {
		if (iterator != null && iterator.eIsProxy()) {
			InternalEObject oldIterator = (InternalEObject)iterator;
			iterator = (Iterator)eResolveProxy(oldIterator);
			if (iterator != oldIterator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IrPackage.ITERATOR_REF__ITERATOR, oldIterator, iterator));
			}
		}
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator basicGetIterator() {
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIterator(Iterator newIterator) {
		Iterator oldIterator = iterator;
		iterator = newIterator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IrPackage.ITERATOR_REF__ITERATOR, oldIterator, iterator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPrev() {
		return prev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrev(boolean newPrev) {
		boolean oldPrev = prev;
		prev = newPrev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IrPackage.ITERATOR_REF__PREV, oldPrev, prev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNext(boolean newNext) {
		boolean oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IrPackage.ITERATOR_REF__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IrPackage.ITERATOR_REF__ITERATOR:
				if (resolve) return getIterator();
				return basicGetIterator();
			case IrPackage.ITERATOR_REF__PREV:
				return isPrev();
			case IrPackage.ITERATOR_REF__NEXT:
				return isNext();
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
			case IrPackage.ITERATOR_REF__ITERATOR:
				setIterator((Iterator)newValue);
				return;
			case IrPackage.ITERATOR_REF__PREV:
				setPrev((Boolean)newValue);
				return;
			case IrPackage.ITERATOR_REF__NEXT:
				setNext((Boolean)newValue);
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
			case IrPackage.ITERATOR_REF__ITERATOR:
				setIterator((Iterator)null);
				return;
			case IrPackage.ITERATOR_REF__PREV:
				setPrev(PREV_EDEFAULT);
				return;
			case IrPackage.ITERATOR_REF__NEXT:
				setNext(NEXT_EDEFAULT);
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
			case IrPackage.ITERATOR_REF__ITERATOR:
				return iterator != null;
			case IrPackage.ITERATOR_REF__PREV:
				return prev != PREV_EDEFAULT;
			case IrPackage.ITERATOR_REF__NEXT:
				return next != NEXT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (prev: ");
		result.append(prev);
		result.append(", next: ");
		result.append(next);
		result.append(')');
		return result.toString();
	}

} //IteratorRefImpl
