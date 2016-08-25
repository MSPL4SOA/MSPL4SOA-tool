package generating;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Node;

import util.CustomDOMParser;

public class POMParser {

	private CustomDOMParser customDOMParser;
	
	public POMParser(String pomPath) {
		
		this.customDOMParser = new CustomDOMParser(pomPath);
	}


	public void addDependency(String groupId, String artifactId, String version) {

		Node dependenciesElement = this.customDOMParser.getDocument().getElementsByTagName(
				"dependencies").item(0);
		
		// add dependency tag
		Node dependencyElement = this.customDOMParser.addNode(dependenciesElement, "dependency");

		// add the three tag groupId, artifactId, version
		Map<String, String> elementMap = new HashMap<String, String>();
		elementMap.put("groupId", groupId);
		elementMap.put("artifactId", artifactId);
		elementMap.put("version", version);
		//
		// access via new for-loop
		for (String key : elementMap.keySet()) {
			String value = elementMap.get(key);
			
			this.customDOMParser.addNode(dependencyElement, key, value);
		}
		
		this.customDOMParser.writeXML();
		System.out.println("Dependency is added");
	}

	public CustomDOMParser getCustomDOMParser() {
		return customDOMParser;
	}


	public void setCustomDOMParser(CustomDOMParser customDOMParser) {
		this.customDOMParser = customDOMParser;
	}

	
}

