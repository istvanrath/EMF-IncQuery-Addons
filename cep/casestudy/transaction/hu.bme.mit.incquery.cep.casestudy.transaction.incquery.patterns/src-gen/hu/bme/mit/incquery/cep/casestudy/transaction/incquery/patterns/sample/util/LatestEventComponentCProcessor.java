package hu.bme.mit.incquery.cep.casestudy.transaction.incquery.patterns.sample.util;

import hu.bme.mit.incquery.cep.casestudy.transaction.TransactionComponentC;
import hu.bme.mit.incquery.cep.casestudy.transaction.incquery.patterns.sample.LatestEventComponentCMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.cep.casestudy.transaction.incquery.patterns.sample.latestEventComponentC pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class LatestEventComponentCProcessor implements IMatchProcessor<LatestEventComponentCMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTe the value of pattern parameter te in the currently processed match 
   * 
   */
  public abstract void process(final TransactionComponentC pTe);
  
  @Override
  public void process(final LatestEventComponentCMatch match) {
    process(match.getTe());
    
  }
}
