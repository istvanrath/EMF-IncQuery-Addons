/**
 */
package hu.bme.mit.incquery.cep.dsl.eventPatternLanguage.util;

import hu.bme.mit.incquery.cep.dsl.eventPatternLanguage.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.incquery.cep.dsl.eventPatternLanguage.EventPatternLanguagePackage
 * @generated
 */
public class EventPatternLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EventPatternLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventPatternLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EventPatternLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EventPatternLanguagePackage.EVENT_MODEL:
      {
        EventModel eventModel = (EventModel)theEObject;
        T result = caseEventModel(eventModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.USAGE:
      {
        Usage usage = (Usage)theEObject;
        T result = caseUsage(usage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.IQ_USAGE:
      {
        IQUsage iqUsage = (IQUsage)theEObject;
        T result = caseIQUsage(iqUsage);
        if (result == null) result = caseUsage(iqUsage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.EVENT_SOURCE_USAGE:
      {
        EventSourceUsage eventSourceUsage = (EventSourceUsage)theEObject;
        T result = caseEventSourceUsage(eventSourceUsage);
        if (result == null) result = caseUsage(eventSourceUsage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.MODEL_ELEMENTS:
      {
        ModelElements modelElements = (ModelElements)theEObject;
        T result = caseModelElements(modelElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = caseModelElements(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.ABSTRACT_ATOMIC_EVENT:
      {
        AbstractAtomicEvent abstractAtomicEvent = (AbstractAtomicEvent)theEObject;
        T result = caseAbstractAtomicEvent(abstractAtomicEvent);
        if (result == null) result = caseEvent(abstractAtomicEvent);
        if (result == null) result = caseModelElements(abstractAtomicEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.ATOMIC_EVENT:
      {
        AtomicEvent atomicEvent = (AtomicEvent)theEObject;
        T result = caseAtomicEvent(atomicEvent);
        if (result == null) result = caseAbstractAtomicEvent(atomicEvent);
        if (result == null) result = caseEvent(atomicEvent);
        if (result == null) result = caseModelElements(atomicEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.IQ_PATTERN_EVENT:
      {
        IQPatternEvent iqPatternEvent = (IQPatternEvent)theEObject;
        T result = caseIQPatternEvent(iqPatternEvent);
        if (result == null) result = caseAbstractAtomicEvent(iqPatternEvent);
        if (result == null) result = caseEvent(iqPatternEvent);
        if (result == null) result = caseModelElements(iqPatternEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.COMPLEX_EVENT:
      {
        ComplexEvent complexEvent = (ComplexEvent)theEObject;
        T result = caseComplexEvent(complexEvent);
        if (result == null) result = caseEvent(complexEvent);
        if (result == null) result = caseModelElements(complexEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = caseModelElements(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.TYPED_PARAMETER_LIST:
      {
        TypedParameterList typedParameterList = (TypedParameterList)theEObject;
        T result = caseTypedParameterList(typedParameterList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.TYPED_PARAMETER:
      {
        TypedParameter typedParameter = (TypedParameter)theEObject;
        T result = caseTypedParameter(typedParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.EVENT_PARAMETER_LIST:
      {
        EventParameterList eventParameterList = (EventParameterList)theEObject;
        T result = caseEventParameterList(eventParameterList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.EVENT_TYPED_PARAMETER:
      {
        EventTypedParameter eventTypedParameter = (EventTypedParameter)theEObject;
        T result = caseEventTypedParameter(eventTypedParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.STATIC_BINDING:
      {
        StaticBinding staticBinding = (StaticBinding)theEObject;
        T result = caseStaticBinding(staticBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.STATIC_BINDING_RULE:
      {
        StaticBindingRule staticBindingRule = (StaticBindingRule)theEObject;
        T result = caseStaticBindingRule(staticBindingRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.RANGE_FILTER:
      {
        RangeFilter rangeFilter = (RangeFilter)theEObject;
        T result = caseRangeFilter(rangeFilter);
        if (result == null) result = caseStaticBindingRule(rangeFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.RANGE:
      {
        Range range = (Range)theEObject;
        T result = caseRange(range);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.OPEN_OPEN:
      {
        OpenOpen openOpen = (OpenOpen)theEObject;
        T result = caseOpenOpen(openOpen);
        if (result == null) result = caseRange(openOpen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.OPEN_CLOSED:
      {
        OpenClosed openClosed = (OpenClosed)theEObject;
        T result = caseOpenClosed(openClosed);
        if (result == null) result = caseRange(openClosed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.CLOSED_CLOSED:
      {
        ClosedClosed closedClosed = (ClosedClosed)theEObject;
        T result = caseClosedClosed(closedClosed);
        if (result == null) result = caseRange(closedClosed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.CLOSED_OPEN:
      {
        ClosedOpen closedOpen = (ClosedOpen)theEObject;
        T result = caseClosedOpen(closedOpen);
        if (result == null) result = caseRange(closedOpen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.NUMERIC_FILTER:
      {
        NumericFilter numericFilter = (NumericFilter)theEObject;
        T result = caseNumericFilter(numericFilter);
        if (result == null) result = caseStaticBindingRule(numericFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.LITERAL_FILTER:
      {
        LiteralFilter literalFilter = (LiteralFilter)theEObject;
        T result = caseLiteralFilter(literalFilter);
        if (result == null) result = caseStaticBindingRule(literalFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.COMPLEX_EVENT_EXPRESSION:
      {
        ComplexEventExpression complexEventExpression = (ComplexEventExpression)theEObject;
        T result = caseComplexEventExpression(complexEventExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.FOLLOWS_EXPRESSION:
      {
        FollowsExpression followsExpression = (FollowsExpression)theEObject;
        T result = caseFollowsExpression(followsExpression);
        if (result == null) result = caseComplexEventExpression(followsExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.EVENT_WITH_FOLLOWS_OPERATOR:
      {
        EventWithFollowsOperator eventWithFollowsOperator = (EventWithFollowsOperator)theEObject;
        T result = caseEventWithFollowsOperator(eventWithFollowsOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.FOLLOWS_OPERATOR:
      {
        FollowsOperator followsOperator = (FollowsOperator)theEObject;
        T result = caseFollowsOperator(followsOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.FOLLOWS_OPERATOR_NO_TW:
      {
        FollowsOperatorNoTW followsOperatorNoTW = (FollowsOperatorNoTW)theEObject;
        T result = caseFollowsOperatorNoTW(followsOperatorNoTW);
        if (result == null) result = caseFollowsOperator(followsOperatorNoTW);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.FOLLOWS_OPERATOR_VIA_TW:
      {
        FollowsOperatorViaTW followsOperatorViaTW = (FollowsOperatorViaTW)theEObject;
        T result = caseFollowsOperatorViaTW(followsOperatorViaTW);
        if (result == null) result = caseFollowsOperator(followsOperatorViaTW);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.FOLLOWER_EVENT_STRUCTURE:
      {
        FollowerEventStructure followerEventStructure = (FollowerEventStructure)theEObject;
        T result = caseFollowerEventStructure(followerEventStructure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.BRANCH_EXPRESSION:
      {
        BranchExpression branchExpression = (BranchExpression)theEObject;
        T result = caseBranchExpression(branchExpression);
        if (result == null) result = caseFollowerEventStructure(branchExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.EVENT_TYPED_PARAMETER_WITH_MULTIPLICITY:
      {
        EventTypedParameterWithMultiplicity eventTypedParameterWithMultiplicity = (EventTypedParameterWithMultiplicity)theEObject;
        T result = caseEventTypedParameterWithMultiplicity(eventTypedParameterWithMultiplicity);
        if (result == null) result = caseFollowerEventStructure(eventTypedParameterWithMultiplicity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.PATTERN_CALL_PARAMETER_LIST:
      {
        PatternCallParameterList patternCallParameterList = (PatternCallParameterList)theEObject;
        T result = casePatternCallParameterList(patternCallParameterList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.PATTERN_CALL_PARAMETER:
      {
        PatternCallParameter patternCallParameter = (PatternCallParameter)theEObject;
        T result = casePatternCallParameter(patternCallParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.SOURCE:
      {
        Source source = (Source)theEObject;
        T result = caseSource(source);
        if (result == null) result = caseModelElements(source);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventPatternLanguagePackage.ADAPTER:
      {
        Adapter adapter = (Adapter)theEObject;
        T result = caseAdapter(adapter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventModel(EventModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Usage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Usage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsage(Usage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IQ Usage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IQ Usage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIQUsage(IQUsage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Source Usage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Source Usage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventSourceUsage(EventSourceUsage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelElements(ModelElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Atomic Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Atomic Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractAtomicEvent(AbstractAtomicEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicEvent(AtomicEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IQ Pattern Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IQ Pattern Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIQPatternEvent(IQPatternEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexEvent(ComplexEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Parameter List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Parameter List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedParameterList(TypedParameterList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedParameter(TypedParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Parameter List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Parameter List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventParameterList(EventParameterList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Typed Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Typed Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventTypedParameter(EventTypedParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStaticBinding(StaticBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static Binding Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static Binding Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStaticBindingRule(StaticBindingRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeFilter(RangeFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRange(Range object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Open Open</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Open Open</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpenOpen(OpenOpen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Open Closed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Open Closed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpenClosed(OpenClosed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Closed Closed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Closed Closed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClosedClosed(ClosedClosed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Closed Open</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Closed Open</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClosedOpen(ClosedOpen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericFilter(NumericFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralFilter(LiteralFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Event Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Event Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexEventExpression(ComplexEventExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Follows Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Follows Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFollowsExpression(FollowsExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event With Follows Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event With Follows Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventWithFollowsOperator(EventWithFollowsOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Follows Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Follows Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFollowsOperator(FollowsOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Follows Operator No TW</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Follows Operator No TW</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFollowsOperatorNoTW(FollowsOperatorNoTW object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Follows Operator Via TW</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Follows Operator Via TW</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFollowsOperatorViaTW(FollowsOperatorViaTW object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Follower Event Structure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Follower Event Structure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFollowerEventStructure(FollowerEventStructure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Branch Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Branch Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBranchExpression(BranchExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Typed Parameter With Multiplicity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Typed Parameter With Multiplicity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventTypedParameterWithMultiplicity(EventTypedParameterWithMultiplicity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern Call Parameter List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern Call Parameter List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatternCallParameterList(PatternCallParameterList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern Call Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern Call Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatternCallParameter(PatternCallParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSource(Source object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adapter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adapter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdapter(Adapter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EventPatternLanguageSwitch
