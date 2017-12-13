package at.ac.tuwien.big.stl.codegen;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class ServerGeneratorSupport extends AbstractGenericResourceSupport {

	@Override
	protected Module createGuiceModule() {
		return new ServerGeneratorModule();
	}
}