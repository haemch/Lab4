package at.ac.tuwien.big.stl.codegen;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class ServerGeneratorModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "stl";
	}

	@Override
	protected String getFileExtensions() {
		return "stlsimulation";
	}

	public Class<? extends IGenerator> bindIGenerator() {
		return ServerGenerator.class;
	}

	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}

	public Class<? extends IEncodingProvider> bindIEncodingProvider() {
		return Utf8EncodingProvider.class;
	}

}
