/*
 * generated by Xtext 2.27.0
 */
package se.gu.cse.idxse.bomi.text.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import se.gu.cse.idxse.bomi.text.BomiRuntimeModule;
import se.gu.cse.idxse.bomi.text.BomiStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class BomiIdeSetup extends BomiStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new BomiRuntimeModule(), new BomiIdeModule()));
	}
	
}
