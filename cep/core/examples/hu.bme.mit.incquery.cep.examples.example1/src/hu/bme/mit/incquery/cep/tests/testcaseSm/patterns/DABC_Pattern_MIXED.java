package hu.bme.mit.incquery.cep.tests.testcaseSm.patterns;

import hu.bme.mit.incquery.cep.metamodels.cep.ComplexOperator;
import hu.bme.mit.incquery.cep.metamodels.cep.EventPattern;
import hu.bme.mit.incquery.cep.metamodels.cep.impl.ComplexEventPatternImpl;

import java.util.ArrayList;
import java.util.List;

public class DABC_Pattern_MIXED extends ComplexEventPatternImpl {
	public DABC_Pattern_MIXED() {
		super();
		setOperator(ComplexOperator.ORDERED);
		List<EventPattern> atomicEventPatternsForCP = new ArrayList<EventPattern>();
		atomicEventPatternsForCP.add(new ABC_Pattern_ORDERED());
		atomicEventPatternsForCP.add(new DPattern());
		getCompositionEvents().addAll(atomicEventPatternsForCP);
		setId("DABCPattern");
	}
}