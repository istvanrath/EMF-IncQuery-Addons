/*
 * generated by Xtext
 */
package hu.bme.mit.incquery.cep.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import hu.bme.mit.incquery.cep.dsl.ui.internal.EventPatternLanguageActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EventPatternLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EventPatternLanguageActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EventPatternLanguageActivator.getInstance().getInjector(EventPatternLanguageActivator.HU_BME_MIT_INCQUERY_CEP_DSL_EVENTPATTERNLANGUAGE);
	}
	
}