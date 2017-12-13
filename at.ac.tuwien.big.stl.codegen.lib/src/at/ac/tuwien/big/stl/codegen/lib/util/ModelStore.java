package at.ac.tuwien.big.stl.codegen.lib.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;

import at.ac.tuwien.big.stl.simulation.SimulationModel;

public class ModelStore {

	/**
	 * Stores the provided SimulationModel element in an STL simulation model at the
	 * provided path
	 * 
	 * @param simModel
	 *            SimulationModel element that should be stored
	 * @param path
	 *            Path at which the STL simulation model should be stored
	 */
	public static void store(SimulationModel simModel, String path) {
		// TODO
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
