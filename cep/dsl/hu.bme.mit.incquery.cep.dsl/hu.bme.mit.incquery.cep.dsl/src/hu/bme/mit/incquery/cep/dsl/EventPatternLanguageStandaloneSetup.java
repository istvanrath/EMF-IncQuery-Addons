/*
* generated by Xtext
*/
package hu.bme.mit.incquery.cep.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EventPatternLanguageStandaloneSetup extends EventPatternLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new EventPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

