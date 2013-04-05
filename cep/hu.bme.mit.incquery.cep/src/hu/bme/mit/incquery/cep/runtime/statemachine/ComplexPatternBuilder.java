package hu.bme.mit.incquery.cep.runtime.statemachine;

import java.util.ArrayList;
import java.util.List;

import hu.bme.mit.incquery.cep.runtime.evaluation.SMUtils;
import hu.bme.mit.incquery.cep.metamodels.cep.AtomicEventPattern;
import hu.bme.mit.incquery.cep.metamodels.cep.ComplexEventPattern;
import hu.bme.mit.incquery.cep.metamodels.internalsm.Action;
import hu.bme.mit.incquery.cep.metamodels.internalsm.CurrentStateVisitor;
import hu.bme.mit.incquery.cep.metamodels.internalsm.FinalState;
import hu.bme.mit.incquery.cep.metamodels.internalsm.Guard;
import hu.bme.mit.incquery.cep.metamodels.internalsm.InitState;
import hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel;
import hu.bme.mit.incquery.cep.metamodels.internalsm.State;
import hu.bme.mit.incquery.cep.metamodels.internalsm.StateMachine;
import hu.bme.mit.incquery.cep.metamodels.internalsm.Transition;

public class ComplexPatternBuilder extends AbstractStateMachineBuilder<ComplexEventPattern> {
	
	public ComplexPatternBuilder(InternalExecutionModel model) {
		super(model);
	}
	
	@Override
	public void buildStateMachine(ComplexEventPattern complexEventPattern) {
		StateMachine sm = SM_FACTORY.createStateMachine();
		InitState initState = SM_FACTORY.createInitState();
		FinalState finalState = SM_FACTORY.createFinalState();
		finalState.setLabel("final");
		
		Action action = SM_FACTORY.createAction();
		action.setMsgToLog("\t\tCEP: Event pattern " + complexEventPattern.getId() + " recognized");
		finalState.getActions().add(action);
		
		// only for ORDERED w/o timewin
		List<AtomicEventPattern> atomicEventPatterns = SMUtils.flattenComplexPatterns(complexEventPattern);
		List<State> states = new ArrayList<State>();
		states.add(initState);
		
		for (int i = 0; i < atomicEventPatterns.size(); i++) {
			State latestState = null;
			
			if (!states.isEmpty()) {
				latestState = states.get(states.size() - 1);
			}
			
			if (i == atomicEventPatterns.size() - 1) {
				states.add(finalState);
				createTransition(latestState, finalState, createEventGuard(atomicEventPatterns.get(i)));
			}
			
			else {
				State currentState = createState(atomicEventPatterns.get(i));
				states.add(currentState);
				createTransition(latestState, currentState, createEventGuard(atomicEventPatterns.get(i)));
			}
			
		}
		
		sm.getStates().addAll(states);
		
		CurrentStateVisitor currentStateVisitor = SM_FACTORY.createCurrentStateVisitor();
		currentStateVisitor.setCurrentState(initState);
		sm.setEventPattern(complexEventPattern);
		
		model.getStateMachines().add(sm);
		model.getCurrentStateVisitors().add(currentStateVisitor);
	}
	private Transition createTransition(State preState, State postState, Guard guard) {
		Transition t = SM_FACTORY.createTransition();
		t.setGuard(guard);
		t.setPreState(preState);
		t.setPostState(postState);
		return t;
	}
	
	private State createState(AtomicEventPattern atomicEventPattern) {
		State s = SM_FACTORY.createState();
		return s;
	}
	
	private Guard createEventGuard(AtomicEventPattern atomicEventPattern) {
		Guard g = SM_FACTORY.createGuard();
		g.setEventType(atomicEventPattern.getType());
		return g;
	}
}
