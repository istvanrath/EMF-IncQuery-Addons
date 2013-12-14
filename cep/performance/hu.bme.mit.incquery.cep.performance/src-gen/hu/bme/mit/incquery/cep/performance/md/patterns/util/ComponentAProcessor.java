package hu.bme.mit.incquery.cep.performance.md.patterns.util;

import hu.bme.mit.incquery.cep.performance.md.metamodels.performancetransaction.TransactionComponentA;
import hu.bme.mit.incquery.cep.performance.md.patterns.ComponentAMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.cep.performance.md.patterns.componentA pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ComponentAProcessor implements IMatchProcessor<ComponentAMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTe the value of pattern parameter te in the currently processed match 
   * 
   */
  public abstract void process(final TransactionComponentA pTe);
  
  @Override
  public void process(final ComponentAMatch match) {
    process(match.getTe());
    
  }
}
