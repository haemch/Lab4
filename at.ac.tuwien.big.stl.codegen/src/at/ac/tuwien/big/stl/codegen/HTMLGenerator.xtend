package at.ac.tuwien.big.stl.codegen

import at.ac.tuwien.big.stl.System
import java.io.File
import java.io.FileInputStream
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccessExtension3
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.common.util.EList
import at.ac.tuwien.big.stl.Area
import at.ac.tuwien.big.stl.Component
import at.ac.tuwien.big.stl.Buffer
import at.ac.tuwien.big.stl.Store
import at.ac.tuwien.big.stl.Service

class HTMLGenerator implements IGenerator {

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val EObject root = input.contents.get(0)
		generateFiles(root, fsa)
	}
	
	def dispatch generateFiles(System system, IFileSystemAccess fsa) {
		// copy static HTML resources: images, JavaScript, CSS
		copyFiles(new File("html"), system.outputDir + "/" + "html" + File.separator, fsa);
		
		// generate index.html; consider the helpers defined below
		fsa.generateFile(system.outputDir + "/" + "html" + "/"+"index.html", generateSystemCode(system));
		
		// TODO generate details pages details_*.html for components; consider the helpers defined below
		for(Area a: system.areas){
			for(Component c: a.components){
				fsa.generateFile(system.outputDir + "/" + "html" + "/"+"details_" + toAlphaNumerical(c.name) + ".html", generateComponentsDetail(c))
			}
		}

	}
	
	
	
	// Functions to create index.html
	def generateSystemCode(System system) '''
	<!doctype html>
	<html lang="de">
	<head>
		<meta charset="utf-8">
		<title>BIG Smart Production Control Panel - Components</title>
		<link rel="stylesheet" href="styles/style.css">
		<script src="script/jquery-3.2.1.js" ></script>
		<script src="script/connect.js" ></script>
		<script type="text/javascript">
			$(function() {
				getTotalStatus();
				webSocket(null);
			});
		</script>
	</head>
	<body>
		<header aria-labelledby="bannerheadline">
			<a href="index.html"><img class="title-image" src="images/big-logo-small.png" alt="BIG Smart Production logo"></a>
			<h1 class="header-title" id="bannerheadline">BIG Smart Production Control Panel</h1>  
			<nav>
		    	<ul class="navigation-list">
		    		<li class="nav-items">
		        		<ul>
		        			<li><a href="#" onclick="restartSimulation()" class="button" accesskey="2">Start</a></li>
		        		</ul>
		      		</li>
		      	</ul>
			</nav>  
		</header>
		<div class="main-container">
			<aside class="sidebar" aria-labelledby="serverinfoheadline">
				<div class="production-info-container">
					<h2 class="accessibility" id="serverinfoheadline">Production Status</h2>
					<dl class="production-data properties">
						<dt class="accessibility">Production status:</dt>
						<dd class="production-status">Production status:</dd>
						<dt>System Costs</dt>
						<dd>
							<span>«returnTotalCost(system)» €</span>
						</dd>
						<dt>Finished Products</dt>
						<dd>
							<span id="status_produced">0</span>
						</dd>
					</dl>
				</div>
			</aside>
			
			<main aria-labelledby="devicesheadline">
				<h2 class="main-headline" id="devicesheadline">Components</h2>
				«generateAreaCode(system.areas)»
			</main>
		</div>
		<footer>
		© 2017 BIG Smart Production
		</footer>
	</body>
	'''
	def generateAreaCode(EList<Area> list) '''
		«FOR Area a: list»
			<h3>«a.name»</h3>
				<div class="devices">
					«generateComponentsCode(a.components)»
				</div>
		«ENDFOR»
	'''
	def generateComponentsCode(EList<Component> list) '''
		«FOR Component c: list»
			«generateComponentCode(c)»
		«ENDFOR»
	'''
	def dispatch generateComponentCode(Component c) '''
		<div class="device-outer">
			<a href="details_«toAlphaNumerical(c.name)».html" class="device" title="More information about this component">
				<div class="device-image-container">
					<img class="device-image" width="180" height="180" src="images/«formatComponentName(c.class.simpleName).toLowerCase ».png" alt="Component image">
				</div>
				<dl class="device-properties">
					<dt>Name</dt>
					<dd class="device-displayname">«c.name»</dd>
					<dt>Type</dt>
					<dd class="visible device-type">«formatComponentName(c.class.simpleName)»</dd>
					<dt class="visible">Utilization</dt>
					<dd id="device_«toAlphaNumerical(c.name)»_utilisation" class="visible device-utilisation">0<dd>
				</dl>
			</a>
		</div>
	'''
	def dispatch generateComponentCode(Buffer b) '''
		<div class="device-outer">
			<a href="details_«toAlphaNumerical(b.name)».html" class="device" title="More information about this component">
				<div class="device-image-container">
					<img class="device-image" width="180" height="180" src="images/«formatComponentName(b.class.simpleName).toLowerCase ».png" alt="Component image">
				</div>
				<dl class="device-properties">
					<dt>Name</dt>
					<dd class="device-displayname">«b.name»</dd>
					<dt>Type</dt>
					<dd class="visible device-type">«formatComponentName(b.class.simpleName)»</dd>
					<dt class="visible">Utilization</dt>
					<dd id="device_«toAlphaNumerical(b.name)»_utilisation" class="visible device-utilisation">0<dd>
					<dt class="visible">Elements</dt>
					<dd id="device_«toAlphaNumerical(b.name)»_elements" class="visible device-utilisation">0<dd>
				</dl>
			</a>
		</div>
	'''
	def dispatch generateComponentCode(Store s) '''
		<div class="device-outer">
			<a href="details_«toAlphaNumerical(s.name)».html" class="device" title="More information about this component">
				<div class="device-image-container">
					<img class="device-image" width="180" height="180" src="images/«formatComponentName(s.class.simpleName).toLowerCase ».png" alt="Component image">
				</div>
				<dl class="device-properties">
					<dt>Name</dt>
					<dd class="device-displayname">«s.name»</dd>
					<dt>Type</dt>
					<dd class="visible device-type">«formatComponentName(s.class.simpleName)»</dd>
					<dt class="visible">Utilization</dt>
					<dd id="device_«toAlphaNumerical(s.name)»_utilisation" class="visible device-utilisation">0<dd>
					<dt class="visible">Elements</dt>
					<dd id="device_«toAlphaNumerical(s.name)»_elements" class="visible device-utilisation">0<dd>
				</dl>
			</a>
		</div>
	'''
	def returnTotalCost(System system){

		var sum=0;
		
		for(Area a:system.areas){
			for(Component c: a.components){
				sum+= c.cost;
			}
		}
		formatInteger(sum)
	}
	private def String formatComponentName(String s){
		s.substring(0, s.length-4);
	}
	// End functions to create index.html

	// Functions to create detail pages
	def generateComponentsDetail(Component c) '''
	<!doctype html>
	<html lang="de">
	<head>
		<meta charset="utf-8">
		<title>BIG Smart Production Control Panel - Details «c.name»</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="styles/style.css">
		<script src="script/chart.bundle.js"></script>
		<script src="script/moment.min.js" ></script>
		<script src="script/jquery-3.2.1.js" ></script>
		<script src="script/connect.js" ></script>
		<script type="text/javascript">
			$(function() {
				createChart();
				getTotalStatus();
				webSocket("«c.name»","«toAlphaNumerical(c.name)»");
			});
		</script>
	</head>
	<body>
		<header aria-labelledby="bannerheadline">
			<a href="index.html"><img class="title-image" src="images/big-logo-small.png" alt="BIG Smart Production logo"></a>
			<h1 class="header-title" id="bannerheadline">BIG Smart Production Control Panel</h1>
			<nav aria-labelledby="navigationheadline">
				<h2 class="accessibility" id="navigationheadline">Navigation</h2>
				<ul class="navigation-list">
					<li class="nav-items">
						<ul>
							<li><a href="#" onclick="restartSimulation()" class="button" accesskey="2">Start</a></li>
						</ul>
					</li>
		 		</ul>
			</nav>
		</header>
		<div class="main-container">
			<main aria-labelledby="deviceheadline" class="details-container">
				<div class="details-headline">
					<h2 class="main-headline" id="deviceheadline">«c.name»</h2>
				</div>
				«generateComponentDetail(c)»
			</main>
		</div>
		<footer>
			© 2017 BIG Smart Home
		</footer>
	</body>
	</html>
	'''
	def dispatch generateComponentDetail(Component c) '''
	<div class="details-holder">
						<div class="details-outer">
							<div class="details-image-container">
								<canvas id="utilisationChart" width="500" height="200" />
							</div>
							<div class="device-kpi">
								<dl class="properties">
									<dd>Cost: </dd>
									<dt>«formatInteger(c.cost)» €</dt>
									<dd>Production time: </dd>
									<dt>«getProductionTime(c.services)» s</dt>
									<dd>Error-rate: </dd>
									<dt>«getErrorRate(c.services)» %</dt>
									<dd>Average Utilization: </dd>
									<dt id="device_«toAlphaNumerical(c.name)»_utilisation">0 %</dt>
								</dl>
							</div>
						</div>
					</div>
	'''
	def dispatch generateComponentDetail(Buffer b) '''
	<div class="details-holder">
					<div class="details-outer">
						<div class="details-image-container">
							<canvas id="utilisationChart" width="500" height="200" />
						</div>
		        		<div class="details-image-container">
		        			<canvas id="storeChart" width="500" height="200" />
		        		</div>
						<div class="device-kpi">
							<dl class="properties">
								<dd>Cost: </dd>
								<dt>«formatInteger(b.cost)» €</dt>
								<dd>Production time: </dd>
								<dt>«getProductionTime(b.services)» s</dt>
								<dd>Error-rate: </dd>
								<dt>«getErrorRate(b.services)» %</dt>
								<dd>Average Utilization: </dd>
								<dt id="device_«toAlphaNumerical(b.name)»_utilisation">0 %</dt>
				        		<dd>Stored Elements: </dd>
				        		<dt id="device_«toAlphaNumerical(b.name)»_elements" class="device-utilisation">0<dt>
							</dl>
						</div>
					</div>
				</div>
	'''
	def dispatch generateComponentDetail(Store s) '''
	<div class="details-holder">
					<div class="details-outer">
						<div class="details-image-container">
							<canvas id="utilisationChart" width="500" height="200" />
						</div>
		        		<div class="details-image-container">
		        			<canvas id="storeChart" width="500" height="200" />
		        		</div>
						<div class="device-kpi">
							<dl class="properties">
								<dd>Cost: </dd>
								<dt>«formatInteger(s.cost)» €</dt>
								<dd>Production time: </dd>
								<dt>«getProductionTime(s.services)» s</dt>
								<dd>Error-rate: </dd>
								<dt>«getErrorRate(s.services)» %</dt>
								<dd>Average Utilization: </dd>
								<dt id="device_«toAlphaNumerical(s.name)»_utilisation">0 %</dt>
				        		<dd>Stored Elements: </dd>
				        		<dt id="device_«toAlphaNumerical(s.name)»_elements" class="device-utilisation">0<dt>
							</dl>
						</div>
					</div>
				</div>
	'''
	def private getErrorRate(EList<Service> list) {
		var rel =1.0; 
		for(Service s: list){
			rel= rel * (s.reliability);
		}
		
		return formatDouble((1.0 - rel)*100);
	}
	def private getProductionTime(EList<Service> list) {
		var sum=0.0; 
		for(Service s: list){
			sum += s.processingTime;
		}
		return formatDouble(sum/1000);
	}
	// End functions to create detail pages

	// Helper functions
	def dispatch generateFiles(EObject object, IFileSystemAccess access) {
		println("HTMLGenerator: Ignoring model element: " + object)
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
	// End helper functions
}
