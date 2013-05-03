/**
 */
package hu.bme.mit.incquery.cep.metamodels.internalsm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.InternalsmFactory
 * @model kind="package"
 * @generated
 */
public interface InternalsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "internalsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "sm.meta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.incquery.metamodels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InternalsmPackage eINSTANCE = hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.StateImpl
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getState()
	 * @generated
	 */
	int STATE = 0;

	/**
	 * The feature id for the '<em><b>Out Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUT_TRANSITIONS = 0;

	/**
	 * The feature id for the '<em><b>In Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IN_TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Current Visitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CURRENT_VISITORS = 3;

	/**
	 * The feature id for the '<em><b>Start Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__START_CONSTRAINTS = 4;

	/**
	 * The feature id for the '<em><b>Stop Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STOP_CONSTRAINTS = 5;

	/**
	 * The feature id for the '<em><b>Intermediate Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTERMEDIATE_CONSTRAINTS = 6;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.TransitionImpl
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Pre State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PRE_STATE = 0;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = 1;

	/**
	 * The feature id for the '<em><b>Post State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__POST_STATE = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.GuardImpl
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 2;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__EVENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Time Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__TIME_CONSTRAINT = 1;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.FinalStateImpl
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 3;

	/**
	 * The feature id for the '<em><b>Out Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OUT_TRANSITIONS = STATE__OUT_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>In Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__IN_TRANSITIONS = STATE__IN_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Current Visitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__CURRENT_VISITORS = STATE__CURRENT_VISITORS;

	/**
	 * The feature id for the '<em><b>Start Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__START_CONSTRAINTS = STATE__START_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Stop Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__STOP_CONSTRAINTS = STATE__STOP_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Intermediate Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__INTERMEDIATE_CONSTRAINTS = STATE__INTERMEDIATE_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ACTIONS = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InitStateImpl <em>Init State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InitStateImpl
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getInitState()
	 * @generated
	 */
	int INIT_STATE = 4;

	/**
	 * The feature id for the '<em><b>Out Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_STATE__OUT_TRANSITIONS = STATE__OUT_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>In Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_STATE__IN_TRANSITIONS = STATE__IN_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Current Visitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_STATE__CURRENT_VISITORS = STATE__CURRENT_VISITORS;

	/**
	 * The feature id for the '<em><b>Start Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_STATE__START_CONSTRAINTS = STATE__START_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Stop Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_STATE__STOP_CONSTRAINTS = STATE__STOP_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Intermediate Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_STATE__INTERMEDIATE_CONSTRAINTS = STATE__INTERMEDIATE_CONSTRAINTS;

	/**
	 * The number of structural features of the '<em>Init State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.TrapStateImpl <em>Trap State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.TrapStateImpl
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getTrapState()
	 * @generated
	 */
	int TRAP_STATE = 5;

	/**
	 * The feature id for the '<em><b>Out Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP_STATE__OUT_TRANSITIONS = STATE__OUT_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>In Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP_STATE__IN_TRANSITIONS = STATE__IN_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Current Visitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP_STATE__CURRENT_VISITORS = STATE__CURRENT_VISITORS;

	/**
	 * The feature id for the '<em><b>Start Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP_STATE__START_CONSTRAINTS = STATE__START_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Stop Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP_STATE__STOP_CONSTRAINTS = STATE__STOP_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Intermediate Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP_STATE__INTERMEDIATE_CONSTRAINTS = STATE__INTERMEDIATE_CONSTRAINTS;

	/**
	 * The number of structural features of the '<em>Trap State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.StateMachineImpl
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 6;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES = 0;

	/**
	 * The feature id for the '<em><b>Event Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__EVENT_PATTERN = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalExecutionModelImpl <em>Internal Execution Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalExecutionModelImpl
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getInternalExecutionModel()
	 * @generated
	 */
	int INTERNAL_EXECUTION_MODEL = 7;

	/**
	 * The feature id for the '<em><b>State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EXECUTION_MODEL__STATE_MACHINES = 0;

	/**
	 * The feature id for the '<em><b>Latest Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EXECUTION_MODEL__LATEST_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Current State Visitors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EXECUTION_MODEL__CURRENT_STATE_VISITORS = 2;

	/**
	 * The number of structural features of the '<em>Internal Execution Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EXECUTION_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.ActionImpl
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The feature id for the '<em><b>Msg To Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__MSG_TO_LOG = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.CurrentStateVisitorImpl <em>Current State Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.CurrentStateVisitorImpl
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getCurrentStateVisitor()
	 * @generated
	 */
	int CURRENT_STATE_VISITOR = 9;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STATE_VISITOR__CURRENT_STATE = 0;

	/**
	 * The feature id for the '<em><b>Event Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STATE_VISITOR__EVENT_COLLECTION = 1;

	/**
	 * The number of structural features of the '<em>Current State Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STATE_VISITOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.EventCollectionImpl <em>Event Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.EventCollectionImpl
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getEventCollection()
	 * @generated
	 */
	int EVENT_COLLECTION = 10;

	/**
	 * The feature id for the '<em><b>Current State Visitor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COLLECTION__CURRENT_STATE_VISITOR = 0;

	/**
	 * The number of structural features of the '<em>Event Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.TimeConstraintImpl <em>Time Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.TimeConstraintImpl
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getTimeConstraint()
	 * @generated
	 */
	int TIME_CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Expected Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__EXPECTED_LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Start State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__START_STATE = 1;

	/**
	 * The feature id for the '<em><b>Stop State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__STOP_STATE = 2;

	/**
	 * The feature id for the '<em><b>Start Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__START_TIME_STAMP = 3;

	/**
	 * The feature id for the '<em><b>Stop Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__STOP_TIME_STAMP = 4;

	/**
	 * The feature id for the '<em><b>Intermediate State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__INTERMEDIATE_STATE = 5;

	/**
	 * The number of structural features of the '<em>Time Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.NumericCompareOperator <em>Numeric Compare Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.NumericCompareOperator
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getNumericCompareOperator()
	 * @generated
	 */
	int NUMERIC_COMPARE_OPERATOR = 12;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.State#getOutTransitions <em>Out Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Transitions</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.State#getOutTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutTransitions();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.State#getInTransitions <em>In Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Transitions</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.State#getInTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_InTransitions();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Label();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.State#getCurrentVisitors <em>Current Visitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Current Visitors</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.State#getCurrentVisitors()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_CurrentVisitors();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.State#getStartConstraints <em>Start Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Start Constraints</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.State#getStartConstraints()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartConstraints();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.State#getStopConstraints <em>Stop Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stop Constraints</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.State#getStopConstraints()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StopConstraints();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.State#getIntermediateConstraints <em>Intermediate Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Intermediate Constraints</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.State#getIntermediateConstraints()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IntermediateConstraints();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.Transition#getPreState <em>Pre State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pre State</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.Transition#getPreState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_PreState();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.Transition#getPostState <em>Post State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post State</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.Transition#getPostState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_PostState();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.Guard#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.Guard#getEventType()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_EventType();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.Guard#getTimeConstraint <em>Time Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Constraint</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.Guard#getTimeConstraint()
	 * @see #getGuard()
	 * @generated
	 */
	EReference getGuard_TimeConstraint();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.FinalState#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.FinalState#getActions()
	 * @see #getFinalState()
	 * @generated
	 */
	EReference getFinalState_Actions();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.InitState <em>Init State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init State</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.InitState
	 * @generated
	 */
	EClass getInitState();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.TrapState <em>Trap State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trap State</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.TrapState
	 * @generated
	 */
	EClass getTrapState();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.StateMachine#getStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_States();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.StateMachine#getEventPattern <em>Event Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Pattern</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.StateMachine#getEventPattern()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_EventPattern();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel <em>Internal Execution Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Execution Model</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel
	 * @generated
	 */
	EClass getInternalExecutionModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel#getStateMachines <em>State Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Machines</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel#getStateMachines()
	 * @see #getInternalExecutionModel()
	 * @generated
	 */
	EReference getInternalExecutionModel_StateMachines();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel#getLatestEvent <em>Latest Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latest Event</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel#getLatestEvent()
	 * @see #getInternalExecutionModel()
	 * @generated
	 */
	EReference getInternalExecutionModel_LatestEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel#getCurrentStateVisitors <em>Current State Visitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current State Visitors</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel#getCurrentStateVisitors()
	 * @see #getInternalExecutionModel()
	 * @generated
	 */
	EReference getInternalExecutionModel_CurrentStateVisitors();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.Action#getMsgToLog <em>Msg To Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg To Log</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.Action#getMsgToLog()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_MsgToLog();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.CurrentStateVisitor <em>Current State Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current State Visitor</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.CurrentStateVisitor
	 * @generated
	 */
	EClass getCurrentStateVisitor();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.CurrentStateVisitor#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.CurrentStateVisitor#getCurrentState()
	 * @see #getCurrentStateVisitor()
	 * @generated
	 */
	EReference getCurrentStateVisitor_CurrentState();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.CurrentStateVisitor#getEventCollection <em>Event Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Collection</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.CurrentStateVisitor#getEventCollection()
	 * @see #getCurrentStateVisitor()
	 * @generated
	 */
	EReference getCurrentStateVisitor_EventCollection();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.EventCollection <em>Event Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Collection</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.EventCollection
	 * @generated
	 */
	EClass getEventCollection();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.EventCollection#getCurrentStateVisitor <em>Current State Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Current State Visitor</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.EventCollection#getCurrentStateVisitor()
	 * @see #getEventCollection()
	 * @generated
	 */
	EReference getEventCollection_CurrentStateVisitor();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint <em>Time Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Constraint</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint
	 * @generated
	 */
	EClass getTimeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint#getExpectedLength <em>Expected Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Length</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint#getExpectedLength()
	 * @see #getTimeConstraint()
	 * @generated
	 */
	EAttribute getTimeConstraint_ExpectedLength();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint#getStartState <em>Start State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start State</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint#getStartState()
	 * @see #getTimeConstraint()
	 * @generated
	 */
	EReference getTimeConstraint_StartState();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint#getStopState <em>Stop State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stop State</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint#getStopState()
	 * @see #getTimeConstraint()
	 * @generated
	 */
	EReference getTimeConstraint_StopState();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint#getStartTimeStamp <em>Start Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time Stamp</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint#getStartTimeStamp()
	 * @see #getTimeConstraint()
	 * @generated
	 */
	EAttribute getTimeConstraint_StartTimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint#getStopTimeStamp <em>Stop Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Time Stamp</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint#getStopTimeStamp()
	 * @see #getTimeConstraint()
	 * @generated
	 */
	EAttribute getTimeConstraint_StopTimeStamp();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint#getIntermediateState <em>Intermediate State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Intermediate State</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint#getIntermediateState()
	 * @see #getTimeConstraint()
	 * @generated
	 */
	EReference getTimeConstraint_IntermediateState();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.NumericCompareOperator <em>Numeric Compare Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Numeric Compare Operator</em>'.
	 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.NumericCompareOperator
	 * @generated
	 */
	EEnum getNumericCompareOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InternalsmFactory getInternalsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.StateImpl
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Out Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUT_TRANSITIONS = eINSTANCE.getState_OutTransitions();

		/**
		 * The meta object literal for the '<em><b>In Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__IN_TRANSITIONS = eINSTANCE.getState_InTransitions();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Current Visitors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CURRENT_VISITORS = eINSTANCE.getState_CurrentVisitors();

		/**
		 * The meta object literal for the '<em><b>Start Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__START_CONSTRAINTS = eINSTANCE.getState_StartConstraints();

		/**
		 * The meta object literal for the '<em><b>Stop Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STOP_CONSTRAINTS = eINSTANCE.getState_StopConstraints();

		/**
		 * The meta object literal for the '<em><b>Intermediate Constraints</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INTERMEDIATE_CONSTRAINTS = eINSTANCE.getState_IntermediateConstraints();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.TransitionImpl
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Pre State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__PRE_STATE = eINSTANCE.getTransition_PreState();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Post State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__POST_STATE = eINSTANCE.getTransition_PostState();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.GuardImpl
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD__EVENT_TYPE = eINSTANCE.getGuard_EventType();

		/**
		 * The meta object literal for the '<em><b>Time Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD__TIME_CONSTRAINT = eINSTANCE.getGuard_TimeConstraint();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.FinalStateImpl
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_STATE__ACTIONS = eINSTANCE.getFinalState_Actions();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InitStateImpl <em>Init State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InitStateImpl
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getInitState()
		 * @generated
		 */
		EClass INIT_STATE = eINSTANCE.getInitState();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.TrapStateImpl <em>Trap State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.TrapStateImpl
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getTrapState()
		 * @generated
		 */
		EClass TRAP_STATE = eINSTANCE.getTrapState();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.StateMachineImpl
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Event Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__EVENT_PATTERN = eINSTANCE.getStateMachine_EventPattern();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalExecutionModelImpl <em>Internal Execution Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalExecutionModelImpl
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getInternalExecutionModel()
		 * @generated
		 */
		EClass INTERNAL_EXECUTION_MODEL = eINSTANCE.getInternalExecutionModel();

		/**
		 * The meta object literal for the '<em><b>State Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_EXECUTION_MODEL__STATE_MACHINES = eINSTANCE.getInternalExecutionModel_StateMachines();

		/**
		 * The meta object literal for the '<em><b>Latest Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_EXECUTION_MODEL__LATEST_EVENT = eINSTANCE.getInternalExecutionModel_LatestEvent();

		/**
		 * The meta object literal for the '<em><b>Current State Visitors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_EXECUTION_MODEL__CURRENT_STATE_VISITORS = eINSTANCE.getInternalExecutionModel_CurrentStateVisitors();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.ActionImpl
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Msg To Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__MSG_TO_LOG = eINSTANCE.getAction_MsgToLog();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.CurrentStateVisitorImpl <em>Current State Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.CurrentStateVisitorImpl
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getCurrentStateVisitor()
		 * @generated
		 */
		EClass CURRENT_STATE_VISITOR = eINSTANCE.getCurrentStateVisitor();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_STATE_VISITOR__CURRENT_STATE = eINSTANCE.getCurrentStateVisitor_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Event Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_STATE_VISITOR__EVENT_COLLECTION = eINSTANCE.getCurrentStateVisitor_EventCollection();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.EventCollectionImpl <em>Event Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.EventCollectionImpl
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getEventCollection()
		 * @generated
		 */
		EClass EVENT_COLLECTION = eINSTANCE.getEventCollection();

		/**
		 * The meta object literal for the '<em><b>Current State Visitor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_COLLECTION__CURRENT_STATE_VISITOR = eINSTANCE.getEventCollection_CurrentStateVisitor();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.impl.TimeConstraintImpl <em>Time Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.TimeConstraintImpl
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getTimeConstraint()
		 * @generated
		 */
		EClass TIME_CONSTRAINT = eINSTANCE.getTimeConstraint();

		/**
		 * The meta object literal for the '<em><b>Expected Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONSTRAINT__EXPECTED_LENGTH = eINSTANCE.getTimeConstraint_ExpectedLength();

		/**
		 * The meta object literal for the '<em><b>Start State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_CONSTRAINT__START_STATE = eINSTANCE.getTimeConstraint_StartState();

		/**
		 * The meta object literal for the '<em><b>Stop State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_CONSTRAINT__STOP_STATE = eINSTANCE.getTimeConstraint_StopState();

		/**
		 * The meta object literal for the '<em><b>Start Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONSTRAINT__START_TIME_STAMP = eINSTANCE.getTimeConstraint_StartTimeStamp();

		/**
		 * The meta object literal for the '<em><b>Stop Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONSTRAINT__STOP_TIME_STAMP = eINSTANCE.getTimeConstraint_StopTimeStamp();

		/**
		 * The meta object literal for the '<em><b>Intermediate State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_CONSTRAINT__INTERMEDIATE_STATE = eINSTANCE.getTimeConstraint_IntermediateState();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.incquery.cep.metamodels.internalsm.NumericCompareOperator <em>Numeric Compare Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.NumericCompareOperator
		 * @see hu.bme.mit.incquery.cep.metamodels.internalsm.impl.InternalsmPackageImpl#getNumericCompareOperator()
		 * @generated
		 */
		EEnum NUMERIC_COMPARE_OPERATOR = eINSTANCE.getNumericCompareOperator();

	}

} //InternalsmPackage
