package hu.bme.mit.incquery.cep.runtime.evaluation.strategy;

import hu.bme.mit.incquery.cep.metamodels.internalsm.InternalExecutionModel;
import hu.bme.mit.incquery.cep.metamodels.internalsm.InternalsmFactory;
import hu.bme.mit.incquery.cep.metamodels.internalsm.Transition;

public interface IEventProcessingStrategy {
	void fireTransition(Transition t);
	void handleVisitorCreation(InternalExecutionModel model, InternalsmFactory SM_FACTORY);
}