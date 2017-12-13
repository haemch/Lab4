package at.ac.tuwien.big.stl.codegen.lib.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;

import at.ac.tuwien.big.stl.simulation.SimulationModel;

public class ModelLoader {

	/**
	 * Loads the STL simulation model located in the specified path.
	 * 
	 * @param path
	 *            Path of the STL simulation model that should be loaded
	 * @return the SimulationModel element defined in the STL simulation model
	 *         located in the specified path
	 */
	public static SimulationModel load(String path) {
		// TODO
		return null;
	}

	/**
	 * Use this method to create an URI.
	 * 
	 * @param path
	 *            Path for which an URI should be created
	 * @return returns URI for the provided path
	 */
	private static URI createURI(String path) {
		return URIConverter.INSTANCE.normalize(URI.createURI(path));
	}

}
