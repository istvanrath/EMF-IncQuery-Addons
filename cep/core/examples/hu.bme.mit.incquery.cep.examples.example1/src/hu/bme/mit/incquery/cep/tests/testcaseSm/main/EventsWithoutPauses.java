package hu.bme.mit.incquery.cep.tests.testcaseSm.main;

import hu.bme.mit.incquery.cep.api.CepJobs;
import hu.bme.mit.incquery.cep.api.CepRule;
import hu.bme.mit.incquery.cep.api.runtime.EventModelManager;
import hu.bme.mit.incquery.cep.api.runtime.EventQueue;
import hu.bme.mit.incquery.cep.metamodels.cep.EventPattern;
import hu.bme.mit.incquery.cep.metamodels.cep.IEventSource;
import hu.bme.mit.incquery.cep.tests.testcaseSm.events.A;
import hu.bme.mit.incquery.cep.tests.testcaseSm.events.B;
import hu.bme.mit.incquery.cep.tests.testcaseSm.events.C;
import hu.bme.mit.incquery.cep.tests.testcaseSm.events.D;
import hu.bme.mit.incquery.cep.tests.testcaseSm.patterns.DABC_Pattern_MIXED;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EventsWithoutPauses {
	DefaultRealm realm;
	EventQueue eventQueue;
	IEventSource source;
	DABC_Pattern_MIXED dabcPattern;
	EventModelManager manager;
	
	@Before
	public void setUp() {
		realm = new DefaultRealm();
		eventQueue = EventQueue.getInstance();
		dabcPattern = new DABC_Pattern_MIXED();
	}
	
	@After
	public void tearDown() {
		realm.dispose();
		eventQueue = null;
		dabcPattern = null;
		manager = null;
	}
	
	@Test
	public void test() throws InterruptedException, IncQueryException {
		
		List<EventPattern> eventPatterns = new ArrayList<EventPattern>();
		eventPatterns.add(dabcPattern);
		
		manager = new EventModelManager();
		//manager.assignEventPatterns(eventPatterns);
        CepRule rule = new CepRule(eventPatterns, CepJobs.getDefaultJob()); 
        manager.addRule(rule);
		
		System.err.println("DIAG: Test starting.\n");
		
		eventQueue.push(new D(source));
		eventQueue.push(new B(source));
		eventQueue.push(new C(source));
		eventQueue.push(new B(source));
		eventQueue.push(new C(source));
		eventQueue.push(new B(source));
		eventQueue.push(new C(source));
		eventQueue.push(new A(source));
		
		System.err.println("\nDIAG: Test finished.");
	}
}