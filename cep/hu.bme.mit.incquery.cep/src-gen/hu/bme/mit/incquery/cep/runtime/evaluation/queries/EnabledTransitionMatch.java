package hu.bme.mit.incquery.cep.runtime.evaluation.queries;

import hu.bme.mit.incquery.cep.metamodels.internalsm.CurrentStateVisitor;
import hu.bme.mit.incquery.cep.metamodels.internalsm.Transition;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.cep.runtime.evaluation.queries.enabledTransition pattern, 
 * to be used in conjunction with {@link EnabledTransitionMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EnabledTransitionMatcher
 * @see EnabledTransitionProcessor
 * 
 */
public abstract class EnabledTransitionMatch extends BasePatternMatch {
  private Transition fT;
  
  private CurrentStateVisitor fCv;
  
  private static List<String> parameterNames = makeImmutableList("t", "cv");
  
  private EnabledTransitionMatch(final Transition pT, final CurrentStateVisitor pCv) {
    this.fT = pT;
    this.fCv = pCv;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("t".equals(parameterName)) return this.fT;
    if ("cv".equals(parameterName)) return this.fCv;
    return null;
    
  }
  
  public Transition getT() {
    return this.fT;
    
  }
  
  public CurrentStateVisitor getCv() {
    return this.fCv;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("t".equals(parameterName) ) {
    	this.fT = (hu.bme.mit.incquery.cep.metamodels.internalsm.Transition) newValue;
    	return true;
    }
    if ("cv".equals(parameterName) ) {
    	this.fCv = (hu.bme.mit.incquery.cep.metamodels.internalsm.CurrentStateVisitor) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setT(final Transition pT) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fT = pT;
    
  }
  
  public void setCv(final CurrentStateVisitor pCv) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCv = pCv;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.cep.runtime.evaluation.queries.enabledTransition";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return EnabledTransitionMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT, fCv};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"t\"=" + prettyPrintValue(fT) + ", ");
    result.append("\"cv\"=" + prettyPrintValue(fCv));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode()); 
    result = prime * result + ((fCv == null) ? 0 : fCv.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof EnabledTransitionMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    EnabledTransitionMatch other = (EnabledTransitionMatch) obj;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    if (fCv == null) {if (other.fCv != null) return false;}
    else if (!fCv.equals(other.fCv)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return EnabledTransitionMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends EnabledTransitionMatch {
    Mutable(final Transition pT, final CurrentStateVisitor pCv) {
      super(pT, pCv);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends EnabledTransitionMatch {
    Immutable(final Transition pT, final CurrentStateVisitor pCv) {
      super(pT, pCv);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}