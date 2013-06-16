/**
 */
package hu.bme.mit.incquery.cep.metamodels.internalsm;

import hu.bme.mit.incquery.cep.metamodels.cep.Event;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Execution Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel#getStateMachines <em>State Machines</em>}</li>
 *   <li>{@link hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel#getLatestEvent <em>Latest Event</em>}</li>
 *   <li>{@link hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel#getCurrentStateVisitors <em>Current State Visitors</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.InternalsmPackage#getInternalExecutionModel()
 * @model
 * @generated
 */
public interface InternalExecutionModel extends EObject {
	/**
	 * Returns the value of the '<em><b>State Machines</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.incquery.cep.metamodels.internalsm.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machines</em>' containment reference list.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.InternalsmPackage#getInternalExecutionModel_StateMachines()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateMachine> getStateMachines();

	/**
	 * Returns the value of the '<em><b>Latest Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Event</em>' containment reference.
	 * @see #setLatestEvent(Event)
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.InternalsmPackage#getInternalExecutionModel_LatestEvent()
	 * @model containment="true"
	 * @generated
	 */
	Event getLatestEvent();

	/**
	 * Sets the value of the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel#getLatestEvent <em>Latest Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Event</em>' containment reference.
	 * @see #getLatestEvent()
	 * @generated
	 */
	void setLatestEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Current State Visitors</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.incquery.cep.metamodels.internalsm.EventToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State Visitors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State Visitors</em>' containment reference list.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.InternalsmPackage#getInternalExecutionModel_CurrentStateVisitors()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventToken> getCurrentStateVisitors();

} // InternalExecutionModel
