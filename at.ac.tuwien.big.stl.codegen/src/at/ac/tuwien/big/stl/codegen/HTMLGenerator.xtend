package at.ac.tuwien.big.stl.codegen

import at.ac.tuwien.big.stl.System
import java.io.File
import java.io.FileInputStream
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccessExtension3
import org.eclipse.xtext.generator.IGenerator

class HTMLGenerator implements IGenerator {

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val EObject root = input.contents.get(0)
		generateFiles(root, fsa)
	}
	
	def dispatch generateFiles(System system, IFileSystemAccess fsa) {
		// copy static HTML resources: images, JavaScript, CSS
		copyFiles(new File("html"), system.outputDir + "/" + "html" + File.separator, fsa);
		
		// TODO generate index.html; consider the helpers defined below
		
		// TODO generate details pages details_*.html for components; consider the helpers defined below

	}
	
	def dispatch generateFiles(EObject object, IFileSystemAccess access) {
		println("HTMLGenerator: Ignoring model element: " + object)
	}

	private def void copyFiles(File sourceFolder, String targetFolder, IFileSystemAccess fsa) {
		for (File sub : sourceFolder.listFiles) {
			val subName = targetFolder + sub.name;
			if (sub.isDirectory) {
				copyFiles(sub, subName + File.separator, fsa);
			} else {
				val fis = new FileInputStream(sub);
				(fsa as IFileSystemAccessExtension3).generateFile(subName, fis);
				fis.close();
			}
		}
	}

	/**
	 * Formats an Integer by introducing thousands separator.
	 * 
	 * @param i Integer that should be formatted
	 * @return formatted Integer value as String
	 */
	private def formatInteger(int i) {
		var ic = i
		var ret = ""
		while (ic >= 1000) {
			var part = "" + (ic % 1000)
			while (part.length < 3) {
				part = "0" + part
			}
			ret = "." + part + ret
			ic = ic / 1000
		}
		ret = ic + ret
		ret
	}

	/**
	 * Formats a double value by introducing floating point.
	 * 
	 * @param d double value that should be formatted
	 * @return formatted double value as String
	 */
	private def formatDouble(double d) {
		if (d == Math.round(d)) {
			return String.valueOf(d as long)
		}
		val ret = Math.round(d * 10);
		ret / 10 + "," + (ret % 10)
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
	
	/**
	 * Computes the output directory in which the generated HTML files should be places.
	 * 
	 * @param system STL system for which HTML code is generated
	 * @return name of the output directory in which the generated HTML files should be placed
	 */
	private def getOutputDir(System system) {
		val systemName = system?.name
		val systemNameInLowerCase = systemName.toLowerCase
		val systemNameWithoutSpaces = systemNameInLowerCase.replace(" ", "")
		systemNameWithoutSpaces
	}
}
