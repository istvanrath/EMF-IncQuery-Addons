/**
 */
package hu.bme.mit.incquery.cep.dsl.eventPatternLanguage.impl;

import hu.bme.mit.incquery.cep.dsl.eventPatternLanguage.Action;
import hu.bme.mit.incquery.cep.dsl.eventPatternLanguage.Event;
import hu.bme.mit.incquery.cep.dsl.eventPatternLanguage.EventPatternLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.incquery.cep.dsl.eventPatternLanguage.impl.EventImpl#getActionDefinition <em>Action Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends EventModelElementsImpl implements Event
{
  /**
   * The cached value of the '{@link #getActionDefinition() <em>Action Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionDefinition()
   * @generated
   * @ordered
   */
  protected Action actionDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return EventPatternLanguagePackage.Literals.EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getActionDefinition()
  {
    return actionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionDefinition(Action newActionDefinition, NotificationChain msgs)
  {
    Action oldActionDefinition = actionDefinition;
    actionDefinition = newActionDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPatternLanguagePackage.EVENT__ACTION_DEFINITION, oldActionDefinition, newActionDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionDefinition(Action newActionDefinition)
  {
    if (newActionDefinition != actionDefinition)
    {
      NotificationChain msgs = null;
      if (actionDefinition != null)
        msgs = ((InternalEObject)actionDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPatternLanguagePackage.EVENT__ACTION_DEFINITION, null, msgs);
      if (newActionDefinition != null)
        msgs = ((InternalEObject)newActionDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPatternLanguagePackage.EVENT__ACTION_DEFINITION, null, msgs);
      msgs = basicSetActionDefinition(newActionDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventPatternLanguagePackage.EVENT__ACTION_DEFINITION, newActionDefinition, newActionDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EventPatternLanguagePackage.EVENT__ACTION_DEFINITION:
        return basicSetActionDefinition(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EventPatternLanguagePackage.EVENT__ACTION_DEFINITION:
        return getActionDefinition();
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
      case EventPatternLanguagePackage.EVENT__ACTION_DEFINITION:
        setActionDefinition((Action)newValue);
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
      case EventPatternLanguagePackage.EVENT__ACTION_DEFINITION:
        setActionDefinition((Action)null);
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
      case EventPatternLanguagePackage.EVENT__ACTION_DEFINITION:
        return actionDefinition != null;
    }
    return super.eIsSet(featureID);
  }

} //EventImpl
