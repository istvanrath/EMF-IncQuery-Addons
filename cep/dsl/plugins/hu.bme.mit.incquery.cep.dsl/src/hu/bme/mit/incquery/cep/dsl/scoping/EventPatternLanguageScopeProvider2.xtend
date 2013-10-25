/*
 * generated by Xtext
 */
package hu.bme.mit.incquery.cep.dsl.scoping

import hu.bme.mit.incquery.cep.dsl.eventPatternLanguage.AtomicEventPattern
import hu.bme.mit.incquery.cep.dsl.eventPatternLanguage.impl.AtomicEventPatternImpl
import hu.bme.mit.incquery.cep.dsl.eventPatternLanguage.impl.EventModelImpl
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider

class EventPatternLanguageScopeProvider2 extends XbaseScopeProvider {

	override IScope createLocalVarScope(IScope parentScope, LocalVariableScopeContext scopeContext) {
		if (scopeContext != null && scopeContext.getContext() != null) {
			var context = scopeContext.getContext();
			if (context.eContainer instanceof AtomicEventPattern) {
					return Scopes.scopeFor((context.eContainer as AtomicEventPattern).parameters.parameters);
			}
		}

		return super.createLocalVarScope(parentScope, scopeContext);

	}
}
