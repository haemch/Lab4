package at.ac.tuwien.big.stl.codegen.lib.util;

import java.util.Map;
import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import at.ac.tuwien.big.stl.STLPackage;
import at.ac.tuwien.big.stl.impl.STLPackageImpl;
import at.ac.tuwien.big.stl.simulation.STLSimulationPackage;
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
		// register XMI resource factory for .xmi extension
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("stlsimulation", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("stl", new XMIResourceFactoryImpl());
		
		// create resource set
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// register STL metamodel
		resourceSet.getPackageRegistry().put(STLPackage.eINSTANCE.getNsURI(),
				STLPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(STLSimulationPackage.eINSTANCE.getNsURI(),
				STLSimulationPackage.eINSTANCE);
		
		// create file URI
		URI fileUri = ModelLoader.createURI(path);
		
		// load resource
		Resource resource = resourceSet.getResource(fileUri, true);
		
		// retrieve first EObject in the resource
		return (SimulationModel)(resource.getContents().get(0));
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
