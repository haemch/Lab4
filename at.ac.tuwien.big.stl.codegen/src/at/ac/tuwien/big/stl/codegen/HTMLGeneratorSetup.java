package at.ac.tuwien.big.stl.codegen;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class HTMLGeneratorSetup implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new HTMLGeneratorModule());
	}

}
