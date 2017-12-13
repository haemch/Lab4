package at.ac.tuwien.big.stl.codegen;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ServerGeneratorSetup implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new ServerGeneratorModule());
	}

}
