package at.ac.tuwien.big.stl.codegen.lib;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import at.ac.tuwien.big.stl.codegen.lib.util.ModelLoader;
import at.ac.tuwien.big.stl.codegen.lib.util.ModelStore;
import at.ac.tuwien.big.stl.simulation.STLSimulationFactory;
import at.ac.tuwien.big.stl.simulation.SimConfiguration;
import at.ac.tuwien.big.stl.simulation.SimulationModel;

public class ModelStoreTest {

	private static final STLSimulationFactory FACTORY = STLSimulationFactory.eINSTANCE;
	private static final int SIMULATION_TIME = 288000;

	@Test
	public void testModelStoreFileCreation() {
		// Create STL simulation model
		SimulationModel simModel = createSimulationModel();
		
		// Compute file path where the STL simulation model should be stored
		String simModelPath = computeSimulationModelFilePath();
		
		// Store the model with the ModelStore
		ModelStore.store(simModel, simModelPath);
		
		// Check whether the file was created
		try {
			FileReader fileReader = new FileReader(simModelPath);
			fileReader.close();
		} catch (FileNotFoundException e) {
			Assert.fail("File " + simModelPath + " was not created.");
		} catch (IOException e) {
			Assert.fail("Failed to close the file stream for the file " + simModelPath + ".");
		}
		
		// Load model using ModelLoader and check its content
		SimulationModel simModelLoaded = ModelLoader.load(simModelPath);
		Assert.assertNotNull(simModelLoaded);
		
		SimConfiguration simConfigLoaded = simModelLoaded.getConfiguration();
		Assert.assertNotNull(simConfigLoaded);
		
		Assert.assertEquals(SIMULATION_TIME, simConfigLoaded.getSimulationTime());
	}

	private SimulationModel createSimulationModel() {
		SimulationModel simModel = FACTORY.createSimulationModel();
		SimConfiguration simConfiguration = FACTORY.createSimConfiguration();
		simConfiguration.setSimulationTime(SIMULATION_TIME);
		simModel.setConfiguration(simConfiguration);
		return simModel;
	}
	
	private String computeSimulationModelFilePath() {
		return "temp/simulationmodel_" + System.currentTimeMillis() + ".stlsimulation";
	}

}
