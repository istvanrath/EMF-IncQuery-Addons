package hu.bme.mit.incquery.cep.api.evm;


import java.util.Set;

import org.eclipse.incquery.runtime.evm.api.event.EventRealm;

import com.google.common.collect.Sets;

public class CepRealm implements EventRealm {
	
	private Set<CepEventSource> sources = Sets.newHashSet();
	
	public void addSource(CepEventSource cepEventSource) {
		sources.add(cepEventSource);
	}
	
	public void forwardObservedEventPattern(ObservedComplexEventPattern op) {
        for (CepEventSource source : sources) {
            if (source.getStateMachine().getEventPattern().getId()
                    .equalsIgnoreCase(op.getObservableEventPattern().getId())) {
                source.pushEvent(CepEventType.APPEARED, op);
                break;
            }
        }
    }
	
	public void forwardFailedEventPattern(InTrapComplexEventPattern op) {
        for (CepEventSource source : sources) {
            if (source.getStateMachine().getEventPattern().getId()
                    .equalsIgnoreCase(op.getObservableEventPattern().getId())) {
                source.pushEvent(CepEventType.APPEARED, op);
                break;
            }
        }
    }

	public Set<CepEventSource> getSources() {
		return sources;
	}
}