package hu.bme.mit.incquery.cep.casestudy.transaction.patterns.complex;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import hu.bme.mit.incquery.cep.metamodels.cep.CepFactory;
import hu.bme.mit.incquery.cep.metamodels.cep.ComplexOperator;
import hu.bme.mit.incquery.cep.metamodels.cep.EventPattern;
import hu.bme.mit.incquery.cep.metamodels.cep.GlobalTimewindow;
import hu.bme.mit.incquery.cep.metamodels.cep.impl.ComplexEventPatternImpl;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class CompoundTransactionEvent1Pattern extends ComplexEventPatternImpl {
  private Map<String,Object> paramValues = Maps.newHashMap();
  
  public CompoundTransactionEvent1Pattern() {
    super();
    setOperator(ComplexOperator.ORDERED);
    
    // composition events
    List<EventPattern> atomicEventPatternsForCP = Lists.newArrayList();
    atomicEventPatternsForCP.add(new hu.bme.mit.incquery.cep.casestudy.transaction.patterns.atomic.ComponentAPattern());
    atomicEventPatternsForCP.add(new hu.bme.mit.incquery.cep.casestudy.transaction.patterns.atomic.ComponentBPattern());
    getCompositionEvents().addAll(atomicEventPatternsForCP);
    
    // timewindows
    GlobalTimewindow timewindow = CepFactory.eINSTANCE.createGlobalTimewindow();
    timewindow.setLength(1500l);
    setGlobalTimewindow(timewindow);
    
    setId("CompoundTransactionEvent1Pattern");
  }
}