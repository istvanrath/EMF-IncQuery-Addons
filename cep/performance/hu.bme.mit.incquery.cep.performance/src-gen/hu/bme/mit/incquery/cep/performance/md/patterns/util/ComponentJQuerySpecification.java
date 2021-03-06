package hu.bme.mit.incquery.cep.performance.md.patterns.util;

import hu.bme.mit.incquery.cep.performance.md.patterns.ComponentJMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate ComponentJMatcher in a type-safe way.
 * 
 * @see ComponentJMatcher
 * @see ComponentJMatch
 * 
 */
@SuppressWarnings("all")
public final class ComponentJQuerySpecification extends BaseGeneratedQuerySpecification<ComponentJMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ComponentJQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ComponentJMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ComponentJMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.incquery.cep.performance";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.cep.performance.md.patterns.componentJ";
    
  }
  
  private ComponentJQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<ComponentJQuerySpecification> {
    @Override
    public ComponentJQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static ComponentJQuerySpecification INSTANCE = make();
    
    public static ComponentJQuerySpecification make() {
      try {
      	return new ComponentJQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
