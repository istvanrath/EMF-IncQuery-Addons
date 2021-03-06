package hu.bme.mit.incquery.cep.casestudy.transaction.patterns.complex;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import hu.bme.mit.incquery.cep.api.ParameterizableComplexEventPattern;
import hu.bme.mit.incquery.cep.api.ParameterizableEventInstance;
import hu.bme.mit.incquery.cep.metamodels.cep.CepFactory;
import hu.bme.mit.incquery.cep.metamodels.cep.ComplexOperator;
import hu.bme.mit.incquery.cep.metamodels.cep.Event;
import hu.bme.mit.incquery.cep.metamodels.cep.EventPattern;
import hu.bme.mit.incquery.cep.metamodels.cep.GlobalTimewindow;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class CompoundTransactionEvent_Pattern extends ParameterizableComplexEventPattern {
  public CompoundTransactionEvent_Pattern() {
    super();
    setOperator(ComplexOperator.ORDERED);
    
    // composition events
    List<EventPattern> compositionEventPatternsForCP = Lists.newArrayList();
    compositionEventPatternsForCP.add(new hu.bme.mit.incquery.cep.casestudy.transaction.patterns.atomic.incquery.ComponentA_Appeared_IQPattern());
    compositionEventPatternsForCP.add(new hu.bme.mit.incquery.cep.casestudy.transaction.patterns.atomic.incquery.ComponentB_Appeared_IQPattern());
    compositionEventPatternsForCP.add(new hu.bme.mit.incquery.cep.casestudy.transaction.patterns.atomic.incquery.ComponentC_Appeared_IQPattern());
    getCompositionEvents().addAll(compositionEventPatternsForCP);
    
    // timewindows
    GlobalTimewindow timewindow = CepFactory.eINSTANCE.createGlobalTimewindow();
    timewindow.setLength(5000l);
    setGlobalTimewindow(timewindow);
    
    setId("CompoundTransactionEvent_Pattern");
  }
  
  @Override
  public boolean evaluateParameterBindigs(final Event event) {
    if(event instanceof ParameterizableEventInstance){
    	return evaluateParameterBindigs((ParameterizableEventInstance) event);
    }
    return true;
  }
  
  public boolean evaluateParameterBindigs(final ParameterizableEventInstance event) {
    if(event instanceof hu.bme.mit.incquery.cep.casestudy.transaction.events.incquery.ComponentA_Appeared_IQEvent){
    Map<String,Object> params = Maps.newHashMap();
    	Object value0 = ((hu.bme.mit.incquery.cep.casestudy.transaction.events.incquery.ComponentA_Appeared_IQEvent) event).getParameter(0);
    	params.put("tId", value0);
    	Object value1 = ((hu.bme.mit.incquery.cep.casestudy.transaction.events.incquery.ComponentA_Appeared_IQEvent) event).getParameter(1);
    	params.put("cId", value1);
    	return evaluateParamBinding(params, event);
    }
    if(event instanceof hu.bme.mit.incquery.cep.casestudy.transaction.events.incquery.ComponentB_Appeared_IQEvent){
    Map<String,Object> params = Maps.newHashMap();
    	Object value0 = ((hu.bme.mit.incquery.cep.casestudy.transaction.events.incquery.ComponentB_Appeared_IQEvent) event).getParameter(0);
    	params.put("tId", value0);
    	return evaluateParamBinding(params, event);
    }
    if(event instanceof hu.bme.mit.incquery.cep.casestudy.transaction.events.incquery.ComponentC_Appeared_IQEvent){
    Map<String,Object> params = Maps.newHashMap();
    	Object value0 = ((hu.bme.mit.incquery.cep.casestudy.transaction.events.incquery.ComponentC_Appeared_IQEvent) event).getParameter(0);
    	params.put("tId", value0);
    	Object value1 = ((hu.bme.mit.incquery.cep.casestudy.transaction.events.incquery.ComponentC_Appeared_IQEvent) event).getParameter(1);
    	params.put("sId", value1);
    	return evaluateParamBinding(params, event);
    }
    return true;
  }
}
