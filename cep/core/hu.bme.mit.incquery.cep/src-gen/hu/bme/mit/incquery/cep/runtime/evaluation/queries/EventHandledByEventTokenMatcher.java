package hu.bme.mit.incquery.cep.runtime.evaluation.queries;

import hu.bme.mit.incquery.cep.metamodels.cep.Event;
import hu.bme.mit.incquery.cep.metamodels.internalsm.EventToken;
import hu.bme.mit.incquery.cep.runtime.evaluation.queries.EventHandledByEventTokenMatch;
import hu.bme.mit.incquery.cep.runtime.evaluation.queries.util.EventHandledByEventTokenQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * Generated pattern matcher API of the hu.bme.mit.incquery.cep.runtime.evaluation.queries.eventHandledByEventToken pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EventHandledByEventTokenMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern eventHandledByEventToken(et : EventToken, e : Event) {
 * 	EventToken.recordedEvents(et, e);
 * }
 * </pre></code>
 * 
 * @see EventHandledByEventTokenMatch
 * @see EventHandledByEventTokenProcessor
 * @see EventHandledByEventTokenQuerySpecification
 * 
 */
public class EventHandledByEventTokenMatcher extends BaseMatcher<EventHandledByEventTokenMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EventHandledByEventTokenMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    EventHandledByEventTokenMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new EventHandledByEventTokenMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_ET = 0;
  
  private final static int POSITION_E = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so 
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public EventHandledByEventTokenMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public EventHandledByEventTokenMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEt the fixed value of pattern parameter et, or null if not bound.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @return matches represented as a EventHandledByEventTokenMatch object.
   * 
   */
  public Collection<EventHandledByEventTokenMatch> getAllMatches(final EventToken pEt, final Event pE) {
    return rawGetAllMatches(new Object[]{pEt, pE});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEt the fixed value of pattern parameter et, or null if not bound.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @return a match represented as a EventHandledByEventTokenMatch object, or null if no match is found.
   * 
   */
  public EventHandledByEventTokenMatch getOneArbitraryMatch(final EventToken pEt, final Event pE) {
    return rawGetOneArbitraryMatch(new Object[]{pEt, pE});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEt the fixed value of pattern parameter et, or null if not bound.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EventToken pEt, final Event pE) {
    return rawHasMatch(new Object[]{pEt, pE});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEt the fixed value of pattern parameter et, or null if not bound.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EventToken pEt, final Event pE) {
    return rawCountMatches(new Object[]{pEt, pE});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEt the fixed value of pattern parameter et, or null if not bound.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EventToken pEt, final Event pE, final IMatchProcessor<? super EventHandledByEventTokenMatch> processor) {
    rawForEachMatch(new Object[]{pEt, pE}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEt the fixed value of pattern parameter et, or null if not bound.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EventToken pEt, final Event pE, final IMatchProcessor<? super EventHandledByEventTokenMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pEt, pE}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pEt the fixed value of pattern parameter et, or null if not bound.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<EventHandledByEventTokenMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final EventToken pEt, final Event pE) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pEt, pE});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEt the fixed value of pattern parameter et, or null if not bound.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EventHandledByEventTokenMatch newMatch(final EventToken pEt, final Event pE) {
    return new EventHandledByEventTokenMatch.Immutable(pEt, pE);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for et.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EventToken> rawAccumulateAllValuesOfet(final Object[] parameters) {
    Set<EventToken> results = new HashSet<EventToken>();
    rawAccumulateAllValues(POSITION_ET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for et.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EventToken> getAllValuesOfet() {
    return rawAccumulateAllValuesOfet(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for et.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EventToken> getAllValuesOfet(final EventHandledByEventTokenMatch partialMatch) {
    return rawAccumulateAllValuesOfet(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for et.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EventToken> getAllValuesOfet(final Event pE) {
    return rawAccumulateAllValuesOfet(new Object[]{null, pE});
  }
  
  /**
   * Retrieve the set of values that occur in matches for e.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Event> rawAccumulateAllValuesOfe(final Object[] parameters) {
    Set<Event> results = new HashSet<Event>();
    rawAccumulateAllValues(POSITION_E, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for e.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Event> getAllValuesOfe() {
    return rawAccumulateAllValuesOfe(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for e.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Event> getAllValuesOfe(final EventHandledByEventTokenMatch partialMatch) {
    return rawAccumulateAllValuesOfe(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for e.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Event> getAllValuesOfe(final EventToken pEt) {
    return rawAccumulateAllValuesOfe(new Object[]{pEt, null});
  }
  
  @Override
  protected EventHandledByEventTokenMatch tupleToMatch(final Tuple t) {
    try {
    	return new EventHandledByEventTokenMatch.Immutable((hu.bme.mit.incquery.cep.metamodels.internalsm.EventToken) t.get(POSITION_ET), (hu.bme.mit.incquery.cep.metamodels.cep.Event) t.get(POSITION_E));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected EventHandledByEventTokenMatch arrayToMatch(final Object[] match) {
    try {
    	return new EventHandledByEventTokenMatch.Immutable((hu.bme.mit.incquery.cep.metamodels.internalsm.EventToken) match[POSITION_ET], (hu.bme.mit.incquery.cep.metamodels.cep.Event) match[POSITION_E]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected EventHandledByEventTokenMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new EventHandledByEventTokenMatch.Mutable((hu.bme.mit.incquery.cep.metamodels.internalsm.EventToken) match[POSITION_ET], (hu.bme.mit.incquery.cep.metamodels.cep.Event) match[POSITION_E]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<EventHandledByEventTokenMatcher> querySpecification() throws IncQueryException {
    return EventHandledByEventTokenQuerySpecification.instance();
  }
}
