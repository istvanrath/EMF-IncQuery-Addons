package hu.bme.mit.incquery.cep.runtime.evaluation.queries;

import hu.bme.mit.incquery.cep.metamodels.internalsm.State;
import hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint;
import hu.bme.mit.incquery.cep.runtime.evaluation.queries.StateWithSTOPTimeconstraintMatch;
import hu.bme.mit.incquery.cep.runtime.evaluation.queries.util.StateWithSTOPTimeconstraintQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.incquery.cep.runtime.evaluation.queries.stateWithSTOPTimeconstraint pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link StateWithSTOPTimeconstraintMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern stateWithSTOPTimeconstraint(s : State, tc : TimeConstraint) {
 * 	State.timeConstraints(s, tc);
 * 	TimeConstraint.type(tc, ::STOP);
 * }
 * </pre></code>
 * 
 * @see StateWithSTOPTimeconstraintMatch
 * @see StateWithSTOPTimeconstraintProcessor
 * @see StateWithSTOPTimeconstraintQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class StateWithSTOPTimeconstraintMatcher extends BaseMatcher<StateWithSTOPTimeconstraintMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<StateWithSTOPTimeconstraintMatcher> querySpecification() throws IncQueryException {
    return StateWithSTOPTimeconstraintQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static StateWithSTOPTimeconstraintMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    StateWithSTOPTimeconstraintMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new StateWithSTOPTimeconstraintMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_S = 0;
  
  private final static int POSITION_TC = 1;
  
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
  public StateWithSTOPTimeconstraintMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public StateWithSTOPTimeconstraintMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @param pTc the fixed value of pattern parameter tc, or null if not bound.
   * @return matches represented as a StateWithSTOPTimeconstraintMatch object.
   * 
   */
  public Collection<StateWithSTOPTimeconstraintMatch> getAllMatches(final State pS, final TimeConstraint pTc) {
    return rawGetAllMatches(new Object[]{pS, pTc});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @param pTc the fixed value of pattern parameter tc, or null if not bound.
   * @return a match represented as a StateWithSTOPTimeconstraintMatch object, or null if no match is found.
   * 
   */
  public StateWithSTOPTimeconstraintMatch getOneArbitraryMatch(final State pS, final TimeConstraint pTc) {
    return rawGetOneArbitraryMatch(new Object[]{pS, pTc});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @param pTc the fixed value of pattern parameter tc, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final State pS, final TimeConstraint pTc) {
    return rawHasMatch(new Object[]{pS, pTc});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @param pTc the fixed value of pattern parameter tc, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final State pS, final TimeConstraint pTc) {
    return rawCountMatches(new Object[]{pS, pTc});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @param pTc the fixed value of pattern parameter tc, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final State pS, final TimeConstraint pTc, final IMatchProcessor<? super StateWithSTOPTimeconstraintMatch> processor) {
    rawForEachMatch(new Object[]{pS, pTc}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @param pTc the fixed value of pattern parameter tc, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final State pS, final TimeConstraint pTc, final IMatchProcessor<? super StateWithSTOPTimeconstraintMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS, pTc}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @param pTc the fixed value of pattern parameter tc, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<StateWithSTOPTimeconstraintMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final State pS, final TimeConstraint pTc) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pS, pTc});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @param pTc the fixed value of pattern parameter tc, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public StateWithSTOPTimeconstraintMatch newMatch(final State pS, final TimeConstraint pTc) {
    return new StateWithSTOPTimeconstraintMatch.Immutable(pS, pTc);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for s.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<State> rawAccumulateAllValuesOfs(final Object[] parameters) {
    Set<State> results = new HashSet<State>();
    rawAccumulateAllValues(POSITION_S, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for s.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfs() {
    return rawAccumulateAllValuesOfs(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfs(final StateWithSTOPTimeconstraintMatch partialMatch) {
    return rawAccumulateAllValuesOfs(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfs(final TimeConstraint pTc) {
    return rawAccumulateAllValuesOfs(new Object[]{null, pTc});
  }
  
  /**
   * Retrieve the set of values that occur in matches for tc.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TimeConstraint> rawAccumulateAllValuesOftc(final Object[] parameters) {
    Set<TimeConstraint> results = new HashSet<TimeConstraint>();
    rawAccumulateAllValues(POSITION_TC, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for tc.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TimeConstraint> getAllValuesOftc() {
    return rawAccumulateAllValuesOftc(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for tc.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TimeConstraint> getAllValuesOftc(final StateWithSTOPTimeconstraintMatch partialMatch) {
    return rawAccumulateAllValuesOftc(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for tc.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TimeConstraint> getAllValuesOftc(final State pS) {
    return rawAccumulateAllValuesOftc(new Object[]{pS, null});
  }
  
  @Override
  protected StateWithSTOPTimeconstraintMatch tupleToMatch(final Tuple t) {
    try {
    	return new StateWithSTOPTimeconstraintMatch.Immutable((hu.bme.mit.incquery.cep.metamodels.internalsm.State) t.get(POSITION_S), (hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint) t.get(POSITION_TC));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected StateWithSTOPTimeconstraintMatch arrayToMatch(final Object[] match) {
    try {
    	return new StateWithSTOPTimeconstraintMatch.Immutable((hu.bme.mit.incquery.cep.metamodels.internalsm.State) match[POSITION_S], (hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint) match[POSITION_TC]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected StateWithSTOPTimeconstraintMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new StateWithSTOPTimeconstraintMatch.Mutable((hu.bme.mit.incquery.cep.metamodels.internalsm.State) match[POSITION_S], (hu.bme.mit.incquery.cep.metamodels.internalsm.TimeConstraint) match[POSITION_TC]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
}
