package hu.bme.mit.incquery.cep.performance.rules;

import com.google.common.collect.Lists;
import hu.bme.mit.incquery.cep.api.ICepRule;
import hu.bme.mit.incquery.cep.api.evm.CepActivationStates;
import hu.bme.mit.incquery.cep.api.evm.IObservableComplexEventPattern;
import hu.bme.mit.incquery.cep.metamodels.cep.EventPattern;
import java.util.List;
import org.eclipse.incquery.runtime.evm.api.Job;

@SuppressWarnings("all")
public class R1 implements ICepRule {
  private List<EventPattern> eventPatterns = Lists.newArrayList();
  
  private Job<IObservableComplexEventPattern> job = new hu.bme.mit.incquery.cep.performance.jobs.R1_Job(CepActivationStates.ACTIVE);
  
  public R1() {
    eventPatterns.add(new hu.bme.mit.incquery.cep.performance.patterns.complex.CompoundTransactionEvent1_Pattern());
    eventPatterns.add(new hu.bme.mit.incquery.cep.performance.patterns.complex.CompoundTransactionEvent2_Pattern());
    eventPatterns.add(new hu.bme.mit.incquery.cep.performance.patterns.complex.CompoundTransactionEvent3_Pattern());
    eventPatterns.add(new hu.bme.mit.incquery.cep.performance.patterns.complex.CompoundTransactionEvent4_Pattern());
    eventPatterns.add(new hu.bme.mit.incquery.cep.performance.patterns.complex.CompoundTransactionEvent5_Pattern());
    eventPatterns.add(new hu.bme.mit.incquery.cep.performance.patterns.complex.CompoundTransactionEvent6_Pattern());
    eventPatterns.add(new hu.bme.mit.incquery.cep.performance.patterns.complex.CompoundTransactionEvent7_Pattern());
    eventPatterns.add(new hu.bme.mit.incquery.cep.performance.patterns.complex.CompoundTransactionEvent8_Pattern());
    eventPatterns.add(new hu.bme.mit.incquery.cep.performance.patterns.complex.CompoundTransactionEvent9_Pattern());
    eventPatterns.add(new hu.bme.mit.incquery.cep.performance.patterns.complex.CompoundTransactionEvent10_Pattern());
    
  }
  
  @Override
  public List<EventPattern> getEventPatterns() {
    return this.eventPatterns;
  }
  
  @Override
  public Job<IObservableComplexEventPattern> getJob() {
    return this.job;
  }
}
