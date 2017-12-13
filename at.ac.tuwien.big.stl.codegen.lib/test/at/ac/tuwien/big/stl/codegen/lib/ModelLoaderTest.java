package at.ac.tuwien.big.stl.codegen.lib;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.junit.Assert;
import org.junit.Test;

import at.ac.tuwien.big.stl.codegen.lib.util.ModelLoader;
import at.ac.tuwien.big.stl.simulation.SimulationModel;

public class ModelLoaderTest {

	@Test
	public void testModelLoading() {
		// Compute path to STL simulation model
		String absoluteFilePath = "";
		try {
			absoluteFilePath = getAbsoluteFilePath("simpletll.stlsimulation");
		} catch (IOException e) {
			Assert.fail("Couldn't compute absolute file path.");
		}
		
		// Load STL simulation model with ModelLoader
		final SimulationModel simulationModel = ModelLoader.load(absoluteFilePath);
		
		// Check contents of loaded STL simulation model 
		Assert.assertNotNull(simulationModel);
		at.ac.tuwien.big.stl.System system = simulationModel.getSystem();
		Assert.assertNotNull(system);
		Assert.assertEquals("SimpleTransportationLine", system.getName());
	}

	private String getAbsoluteFilePath(String modelFileName) throws IOException {
		File file = new File("../at.ac.tuwien.big.stl.codegen/models/" + modelFileName);
		String canonicalFilePath = file.getCanonicalPath();
		URI fileURI = URI.createFileURI(canonicalFilePath);
		String absoluteFilePath = fileURI.toString();
		return absoluteFilePath;
	}

}
