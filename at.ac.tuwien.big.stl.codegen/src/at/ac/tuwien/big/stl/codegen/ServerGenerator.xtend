package at.ac.tuwien.big.stl.codegen

import at.ac.tuwien.big.stl.simulation.SimulationModel
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class ServerGenerator implements IGenerator {

	val port = 8888;
	val mweOutputDir = "src-gen";

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val EObject root = input.contents.get(0)
		generateFiles(root, fsa)
	}

	private def dispatch generateFiles(SimulationModel simModel, IFileSystemAccess fsa) {
		val system = simModel.system
		if (system !== null) {
			fsa.generateFile(getOutputDir(simModel) + "/server/" + toAlphaNumerical(system.name) +  "Server.java", 
				generateCode(simModel)
			);
		}
	}
	
	def generateCode(SimulationModel simModel){
		val system = simModel.system
		'''
			package «toAlphaNumerical(system.name.toLowerCase)».server;
			
			import java.io.File;
			import java.io.IOException;
			
			import at.ac.tuwien.big.stl.codegen.lib.server.Server.SimpleServer;
			import at.ac.tuwien.big.stl.codegen.lib.util.ModelLoader;
			import at.ac.tuwien.big.stl.simulation.SimulationModel;
			
			public class «toAlphaNumerical(system.name)»Server {
			
				public static void main(String[] args) throws IOException {
					SimulationModel simModel = ModelLoader.load("«getPath(simModel)»");
					File outputDir = new File("src-gen/«toAlphaNumerical(system.name.toLowerCase)»/html");
					SimpleServer server = new SimpleServer(simModel, null, «port», outputDir, false);
					server.configSimulatorAndRun();
					server.start();
				}
			}	
		'''
	}
		

	private def dispatch generateFiles(EObject object, IFileSystemAccess access) {
		println("ServerGenerator: Ignoring model element: " + object)
	}

	/**
	 * Computes the output directory in which the generated server class should be places.
	 * 
	 * @param simModel STL simulation model for which a server class is generated
	 * @return name of the output directory in which the generated server class should be placed
	 */
	private def getOutputDir(SimulationModel simModel) {
		val systemName = simModel.system?.name;
		val systemNameInLowerCase = systemName.toLowerCase
		val systemNameWithoutSpaces = systemNameInLowerCase.replace(" ", "")
		systemNameWithoutSpaces
	}
	
	/**
	 * Retrieves the file path to the provided STL simulation model.
	 * 
	 * @param simModel STL simulation model for which the file path should be retrieved
	 * @return file path of the provided STL simulation model
	 */
	private def getPath(SimulationModel simModel) {
		simModel.eResource.getURI
	}
	
	/**
	 * Returns a String which is stripped of all non alpha-numerical values. 
	 * This is needed for computing the identifiers (id) of HTML elements as well as 
	 * the file names for details pages.
	 * 
	 * @param string String for which non alpha-numerical values should be removed
	 * @return String with removed non alpha-numerical values
	 */
	private def toAlphaNumerical(String string) {
		string.replaceAll("[^A-Za-z0-9]", "")
	}
}
