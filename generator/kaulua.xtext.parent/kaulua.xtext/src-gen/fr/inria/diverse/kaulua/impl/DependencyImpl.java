/**
 * generated by Xtext 2.19.0
 */
package fr.inria.diverse.kaulua.impl;

import fr.inria.diverse.kaulua.Capability;
import fr.inria.diverse.kaulua.Dependency;
import fr.inria.diverse.kaulua.KauluaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.kaulua.impl.DependencyImpl#getCaller <em>Caller</em>}</li>
 *   <li>{@link fr.inria.diverse.kaulua.impl.DependencyImpl#getCallee <em>Callee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency
{
  /**
   * The cached value of the '{@link #getCaller() <em>Caller</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaller()
   * @generated
   * @ordered
   */
  protected Capability caller;

  /**
   * The cached value of the '{@link #getCallee() <em>Callee</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallee()
   * @generated
   * @ordered
   */
  protected Capability callee;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KauluaPackage.Literals.DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Capability getCaller()
  {
    if (caller != null && caller.eIsProxy())
    {
      InternalEObject oldCaller = (InternalEObject)caller;
      caller = (Capability)eResolveProxy(oldCaller);
      if (caller != oldCaller)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KauluaPackage.DEPENDENCY__CALLER, oldCaller, caller));
      }
    }
    return caller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Capability basicGetCaller()
  {
    return caller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCaller(Capability newCaller)
  {
    Capability oldCaller = caller;
    caller = newCaller;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KauluaPackage.DEPENDENCY__CALLER, oldCaller, caller));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Capability getCallee()
  {
    if (callee != null && callee.eIsProxy())
    {
      InternalEObject oldCallee = (InternalEObject)callee;
      callee = (Capability)eResolveProxy(oldCallee);
      if (callee != oldCallee)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KauluaPackage.DEPENDENCY__CALLEE, oldCallee, callee));
      }
    }
    return callee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Capability basicGetCallee()
  {
    return callee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCallee(Capability newCallee)
  {
    Capability oldCallee = callee;
    callee = newCallee;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KauluaPackage.DEPENDENCY__CALLEE, oldCallee, callee));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KauluaPackage.DEPENDENCY__CALLER:
        if (resolve) return getCaller();
        return basicGetCaller();
      case KauluaPackage.DEPENDENCY__CALLEE:
        if (resolve) return getCallee();
        return basicGetCallee();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KauluaPackage.DEPENDENCY__CALLER:
        setCaller((Capability)newValue);
        return;
      case KauluaPackage.DEPENDENCY__CALLEE:
        setCallee((Capability)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KauluaPackage.DEPENDENCY__CALLER:
        setCaller((Capability)null);
        return;
      case KauluaPackage.DEPENDENCY__CALLEE:
        setCallee((Capability)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KauluaPackage.DEPENDENCY__CALLER:
        return caller != null;
      case KauluaPackage.DEPENDENCY__CALLEE:
        return callee != null;
    }
    return super.eIsSet(featureID);
  }

} //DependencyImpl
