package hu.bme.mit.incquery.cep.performance.md.patterns;

import hu.bme.mit.incquery.cep.performance.md.metamodels.performancetransaction.TransactionComponentC;
import hu.bme.mit.incquery.cep.performance.md.patterns.ComponentCMatch;
import hu.bme.mit.incquery.cep.performance.md.patterns.util.ComponentCQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.incquery.cep.performance.md.patterns.componentC pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ComponentCMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern componentC(te){
 * 	TransactionModel.latestComponentEvent(_, te);
 * 	TransactionComponentC(te);
 * }
 * </pre></code>
 * 
 * @see ComponentCMatch
 * @see ComponentCProcessor
 * @see ComponentCQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ComponentCMatcher extends BaseMatcher<ComponentCMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<ComponentCMatcher> querySpecification() throws IncQueryException {
    return ComponentCQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ComponentCMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ComponentCMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ComponentCMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_TE = 0;
  
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
  public ComponentCMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ComponentCMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTe the fixed value of pattern parameter te, or null if not bound.
   * @return matches represented as a ComponentCMatch object.
   * 
   */
  public Collection<ComponentCMatch> getAllMatches(final TransactionComponentC pTe) {
    return rawGetAllMatches(new Object[]{pTe});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTe the fixed value of pattern parameter te, or null if not bound.
   * @return a match represented as a ComponentCMatch object, or null if no match is found.
   * 
   */
  public ComponentCMatch getOneArbitraryMatch(final TransactionComponentC pTe) {
    return rawGetOneArbitraryMatch(new Object[]{pTe});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTe the fixed value of pattern parameter te, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TransactionComponentC pTe) {
    return rawHasMatch(new Object[]{pTe});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTe the fixed value of pattern parameter te, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TransactionComponentC pTe) {
    return rawCountMatches(new Object[]{pTe});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTe the fixed value of pattern parameter te, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TransactionComponentC pTe, final IMatchProcessor<? super ComponentCMatch> processor) {
    rawForEachMatch(new Object[]{pTe}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTe the fixed value of pattern parameter te, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TransactionComponentC pTe, final IMatchProcessor<? super ComponentCMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTe}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pTe the fixed value of pattern parameter te, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<ComponentCMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final TransactionComponentC pTe) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTe});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTe the fixed value of pattern parameter te, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ComponentCMatch newMatch(final TransactionComponentC pTe) {
    return new ComponentCMatch.Immutable(pTe);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for te.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TransactionComponentC> rawAccumulateAllValuesOfte(final Object[] parameters) {
    Set<TransactionComponentC> results = new HashSet<TransactionComponentC>();
    rawAccumulateAllValues(POSITION_TE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for te.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TransactionComponentC> getAllValuesOfte() {
    return rawAccumulateAllValuesOfte(emptyArray());
  }
  
  @Override
  protected ComponentCMatch tupleToMatch(final Tuple t) {
    try {
    	return new ComponentCMatch.Immutable((hu.bme.mit.incquery.cep.performance.md.metamodels.performancetransaction.TransactionComponentC) t.get(POSITION_TE));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected ComponentCMatch arrayToMatch(final Object[] match) {
    try {
    	return new ComponentCMatch.Immutable((hu.bme.mit.incquery.cep.performance.md.metamodels.performancetransaction.TransactionComponentC) match[POSITION_TE]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected ComponentCMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new ComponentCMatch.Mutable((hu.bme.mit.incquery.cep.performance.md.metamodels.performancetransaction.TransactionComponentC) match[POSITION_TE]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
}
