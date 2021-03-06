/**
 */
package hu.bme.mit.incquery.cep.metamodels.internalsm.impl;

import hu.bme.mit.incquery.cep.metamodels.cep.Event;

import hu.bme.mit.incquery.cep.metamodels.internalsm.EventProcessingContext;
import hu.bme.mit.incquery.cep.metamodels.internalsm.EventToken;
import hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel;
import hu.bme.mit.incquery.cep.metamodels.internalsm.InternalsmPackage;
import hu.bme.mit.incquery.cep.metamodels.internalsm.StateMachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Execution Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalExecutionModelImpl#getStateMachines <em>State Machines</em>}</li>
 *   <li>{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalExecutionModelImpl#getLatestEvent <em>Latest Event</em>}</li>
 *   <li>{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalExecutionModelImpl#getEventTokens <em>Event Tokens</em>}</li>
 *   <li>{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalExecutionModelImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalExecutionModelImpl extends EObjectImpl implements InternalExecutionModel {
	/**
	 * The cached value of the '{@link #getStateMachines() <em>State Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> stateMachines;

	/**
	 * The cached value of the '{@link #getLatestEvent() <em>Latest Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestEvent()
	 * @generated
	 * @ordered
	 */
	protected Event latestEvent;

	/**
	 * The cached value of the '{@link #getEventTokens() <em>Event Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<EventToken> eventTokens;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final EventProcessingContext CONTEXT_EDEFAULT = EventProcessingContext.CHRONICLE;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EventProcessingContext context = CONTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalExecutionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalsmPackage.Literals.INTERNAL_EXECUTION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getStateMachines() {
		if (stateMachines == null) {
			stateMachines = new EObjectContainmentEList<StateMachine>(StateMachine.class, this, InternalsmPackage.INTERNAL_EXECUTION_MODEL__STATE_MACHINES);
		}
		return stateMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getLatestEvent() {
		return latestEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatestEvent(Event newLatestEvent, NotificationChain msgs) {
		Event oldLatestEvent = latestEvent;
		latestEvent = newLatestEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InternalsmPackage.INTERNAL_EXECUTION_MODEL__LATEST_EVENT, oldLatestEvent, newLatestEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatestEvent(Event newLatestEvent) {
		if (newLatestEvent != latestEvent) {
			NotificationChain msgs = null;
			if (latestEvent != null)
				msgs = ((InternalEObject)latestEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InternalsmPackage.INTERNAL_EXECUTION_MODEL__LATEST_EVENT, null, msgs);
			if (newLatestEvent != null)
				msgs = ((InternalEObject)newLatestEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InternalsmPackage.INTERNAL_EXECUTION_MODEL__LATEST_EVENT, null, msgs);
			msgs = basicSetLatestEvent(newLatestEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalsmPackage.INTERNAL_EXECUTION_MODEL__LATEST_EVENT, newLatestEvent, newLatestEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventToken> getEventTokens() {
		if (eventTokens == null) {
			eventTokens = new EObjectContainmentEList<EventToken>(EventToken.class, this, InternalsmPackage.INTERNAL_EXECUTION_MODEL__EVENT_TOKENS);
		}
		return eventTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventProcessingContext getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(EventProcessingContext newContext) {
		EventProcessingContext oldContext = context;
		context = newContext == null ? CONTEXT_EDEFAULT : newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalsmPackage.INTERNAL_EXECUTION_MODEL__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__STATE_MACHINES:
				return ((InternalEList<?>)getStateMachines()).basicRemove(otherEnd, msgs);
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__LATEST_EVENT:
				return basicSetLatestEvent(null, msgs);
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__EVENT_TOKENS:
				return ((InternalEList<?>)getEventTokens()).basicRemove(otherEnd, msgs);
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
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__STATE_MACHINES:
				return getStateMachines();
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__LATEST_EVENT:
				return getLatestEvent();
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__EVENT_TOKENS:
				return getEventTokens();
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__CONTEXT:
				return getContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__STATE_MACHINES:
				getStateMachines().clear();
				getStateMachines().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__LATEST_EVENT:
				setLatestEvent((Event)newValue);
				return;
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__EVENT_TOKENS:
				getEventTokens().clear();
				getEventTokens().addAll((Collection<? extends EventToken>)newValue);
				return;
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__CONTEXT:
				setContext((EventProcessingContext)newValue);
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
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__STATE_MACHINES:
				getStateMachines().clear();
				return;
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__LATEST_EVENT:
				setLatestEvent((Event)null);
				return;
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__EVENT_TOKENS:
				getEventTokens().clear();
				return;
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
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
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__STATE_MACHINES:
				return stateMachines != null && !stateMachines.isEmpty();
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__LATEST_EVENT:
				return latestEvent != null;
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__EVENT_TOKENS:
				return eventTokens != null && !eventTokens.isEmpty();
			case InternalsmPackage.INTERNAL_EXECUTION_MODEL__CONTEXT:
				return context != CONTEXT_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (context: ");
		result.append(context);
		result.append(')');
		return result.toString();
	}

} //InternalExecutionModelImpl
