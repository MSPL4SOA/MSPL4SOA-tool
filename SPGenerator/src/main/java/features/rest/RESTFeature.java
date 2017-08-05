package features.rest;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import features.bean.ServiceFeature;
import features.util.UtilStateFeature;
import generating.SwitchyardProject;
import util.Functions;

public class RESTFeature {

	public ServiceFeature serviceFeature;

	public String composerFileName;
	public String resourceFileName;

	public static boolean ADD_SCA = false;

	public RESTFeature(ServiceFeature serviceFeature) {

		this.serviceFeature = serviceFeature;

		composerFileName = "Composers_rest_" + serviceFeature.nameInterface;
		resourceFileName = "Resource_rest" + serviceFeature.nameInterface;

	}

	public void addSCA() {

		// add namespace
		Document document = this.serviceFeature.switchyardXMLDOMParser.getDocument();

		//is already defined
//		if (ADD_SCA == false) {
//			// xmlns:resteasy="urn:switchyard-component-resteasy:config:2.0"
//			Element namespaceElement = (Element) document.getElementsByTagName("sy:switchyard").item(0);
//			namespaceElement.setAttribute("xmlns:resteasy", "urn:switchyard-component-resteasy:config:2.0");
//			ADD_SCA = true;
//		}

		Node compositeElement = document.getElementsByTagName("sca:composite").item(0);

		// add sca
		Element componentElement = (Element) document.createElement("sca:service");
		componentElement.setAttribute("name", this.serviceFeature.nameInterface);
		componentElement.setAttribute("promote",
				this.serviceFeature.nameBean + "/" + this.serviceFeature.nameInterface);
		compositeElement.appendChild(componentElement);

		// add interface
//		Element beanElement = (Element) document.createElement("sca:interface.java");
//		beanElement.setAttribute("interface",
//				this.serviceFeature.switchyardProject.servicePkg + "." + this.serviceFeature.nameInterface);
//		componentElement.appendChild(beanElement);

		// add binding
		Element serviceElement = (Element) document.createElement("resteasy:binding.rest");
		serviceElement.setAttribute("name", "rest" + this.serviceFeature.nameInterface);
		componentElement.appendChild(serviceElement);

		// add resteasy:contextMapper
		Element mapperElement = (Element) document.createElement("resteasy:contextMapper");
		mapperElement.setAttribute("includes", ".*");
		serviceElement.appendChild(mapperElement);

		// add resteasy:messageComposer
		Element composerElement = (Element) document.createElement("resteasy:messageComposer");
		composerElement.setAttribute("class",
				this.serviceFeature.switchyardProject.composerPkg + "." + composerFileName);
		serviceElement.appendChild(composerElement);

		// interfaces
		Element resourceElement = (Element) document.createElement("resteasy:interfaces");
		resourceElement.appendChild(
				document.createTextNode(this.serviceFeature.switchyardProject.resourcePkg + "." + resourceFileName));
		serviceElement.appendChild(resourceElement);

		// resteasy:contextPath
		Element contextPathElement = (Element) document.createElement("resteasy:contextPath");
		contextPathElement.appendChild(document.createTextNode
				(this.serviceFeature.switchyardProject.artifactId + "/rest"));
		serviceElement.appendChild(contextPathElement);

		this.serviceFeature.switchyardXMLDOMParser.writeXML();
		System.out.println("REST SCA is added");

	}

	public void addComposer() {
		VelocityEngine ve = new VelocityEngine();
//		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
//		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		Template t;

		context.put("statePkg", this.serviceFeature.switchyardProject.statePkg);
		context.put("composerPkg", this.serviceFeature.switchyardProject.composerPkg);
		context.put("utilPkg", this.serviceFeature.switchyardProject.utilPkg);
		context.put("inputDataPkg", this.serviceFeature.switchyardProject.inputDataPkg);
		context.put("artifactId", this.serviceFeature.switchyardProject.artifactId);

		context.put("service", this.serviceFeature.service.getServiceCapabilityOnlyREST());

		// context.put("stateFilePkg",
		// this.serviceFeature.switchyardProject.utilStateFeature.stateFilePkg);
		// context.put("stateFilePath",
		// this.serviceFeature.switchyardProject.utilStateFeature.stateFilePath);
		context.put("STATE_FILE_NAME", UtilStateFeature.STATE_FILE_NAME);
		context.put("STATE_HEADER_NAME", UtilStateFeature.STATE_HEADER_NAME);

		String composerFilePath = this.serviceFeature.switchyardProject.composerDir + composerFileName + ".java";

		context.put("composerFileName", composerFileName);

//		for (Capability capability : this.serviceFeature.service.capabilities) {
//
//			context.put("capability", capability);
			/* get the Template */
			t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "rest_composer.vm");
			/* now render the template into a Writer */
			writer = new StringWriter();
			t.merge(context, writer);
			System.out.println(writer);
			System.out.println(composerFilePath);
			Functions.stringToFile(writer.toString(), composerFilePath, false);
			///////
//		}
	}

	public void addResource() {
		VelocityEngine ve = new VelocityEngine();
//		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
//		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		Template t;

		context.put("resourcePkg", this.serviceFeature.switchyardProject.resourcePkg);
		context.put("inputDataPkg", this.serviceFeature.switchyardProject.inputDataPkg);
		context.put("outputDataPkg", this.serviceFeature.switchyardProject.outputDataPkg);
		context.put("service", this.serviceFeature.service.getServiceCapabilityOnlyREST());
		context.put("resourceFileName", resourceFileName);

		// context.put("stateFilePkg",
		// this.serviceFeature.switchyardProject.utilStateFeature.stateFilePkg);
		// context.put("stateFilePath",
		// this.serviceFeature.switchyardProject.utilStateFeature.stateFilePath);
		context.put("STATE_FILE_NAME", UtilStateFeature.STATE_FILE_NAME);
		context.put("STATE_HEADER_NAME", UtilStateFeature.STATE_HEADER_NAME);

		String resourceFilePath = this.serviceFeature.switchyardProject.resourceDir + resourceFileName + ".java";

		/* get the Template */
		t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "rest_resource.vm");
		/* now render the template into a Writer */
		writer = new StringWriter();
		t.merge(context, writer);
		System.out.println(writer);
		System.out.println(resourceFilePath);
		Functions.stringToFile(writer.toString(), resourceFilePath, false);
		///////

	}
}
