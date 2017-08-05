package features.bean;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.apache.velocity.tools.generic.MathTool;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import features.util.UtilAuthenticationFeature;
import features.util.UtilStateFeature;
import generating.SwitchyardProject;
import util.CustomDOMParser;
import util.Functions;

public class ServiceFeature {

	public SwitchyardProject switchyardProject;
	public String nameInterface;
	public String nameBean;
	public CustomDOMParser switchyardXMLDOMParser;

	// public String serviceXmlFileName;
	public Service service;

	public final static String SERVICE_NAME = "service_name";
	public final static String METHOD_NAME = "method_name";

	public ServiceFeature(SwitchyardProject switchyardProject, Service service) {
		this.switchyardProject = switchyardProject;

		this.switchyardXMLDOMParser = switchyardProject.switchyardXMLDOMParser;

		this.service = service;
		this.nameInterface = service.interfaceName;
		this.nameBean = service.interfaceName + "Bean";

		// this.serviceXmlFileName = switchyardProject.tmpDir + nameInterface +
		// ".xml";
	}

	public void addSCA() {

		Document document = this.switchyardXMLDOMParser.getDocument();
		Node compositeElement = document.getElementsByTagName("sca:composite").item(0);

		// add sca
		Element componentElement = (Element) document.createElement("sca:component");
		componentElement.setAttribute("name", this.nameBean);
		compositeElement.appendChild(componentElement);

		// add bean
		Element beanElement = (Element) document.createElement("bean:implementation.bean");
		beanElement.setAttribute("class", this.switchyardProject.servicePkg + "." + this.nameBean);
		componentElement.appendChild(beanElement);

		// add service
		Element serviceElement = (Element) document.createElement("sca:service");
		serviceElement.setAttribute("name", this.nameInterface);
		componentElement.appendChild(serviceElement);

		// add interface
		Element interfaceElement = (Element) document.createElement("sca:interface.java");
		interfaceElement.setAttribute("interface", this.switchyardProject.servicePkg + "." + this.nameInterface);
		serviceElement.appendChild(interfaceElement);

		this.switchyardXMLDOMParser.writeXML();
		System.out.println("Bean SCA is added");
	}

	public void addInterface() {

		VelocityEngine ve = new VelocityEngine();
//		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
//		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer = new StringWriter();
		context.put("service", service);
		context.put("servicePkg", this.switchyardProject.servicePkg);
		context.put("inputDataPkg", this.switchyardProject.inputDataPkg);
		context.put("outputDataPkg", this.switchyardProject.outputDataPkg);
		context.put("utilPkg", this.switchyardProject.utilPkg);
		context.put("authFilePkg", this.switchyardProject.utilAuthenticationFeature.authFilePkg);
		context.put("utilAuthenticationFeature", this.switchyardProject.utilAuthenticationFeature);
		context.put("AUTH_FILE_NAME", UtilAuthenticationFeature.AUTH_FILE_NAME);
		context.put("statePkg", this.switchyardProject.statePkg);
		context.put("math", new MathTool());
		/* get the Template */
		Template t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "bean_interface.vm");
		/* now render the template into a Writer */
		t.merge(context, writer);
		System.out.println(writer);
		Functions.stringToFile(writer.toString(), this.switchyardProject.serviceDir + nameInterface + ".java", false);
		System.out.println("-------------------------------------------");
		t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "bean_impl.vm");
		/* now render the template into a Writer */
		writer = new StringWriter();
		t.merge(context, writer);
		System.out.println(writer.toString());

		Functions.stringToFile(writer.toString(), this.switchyardProject.serviceDir + nameBean + ".java", false);
	}

	public void addInputData() {
		VelocityEngine ve = new VelocityEngine();
//		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
//		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		Template t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "input_data.vm");
		context.put("inputDataPkg", switchyardProject.inputDataPkg);

		for (Capability capability : service.getCapabilities()) {

			if (capability.getInputs() != null && capability.getInputs().size() != 0) {

				context.put("service", service);
				context.put("capability", capability);

				/* get the Template */

				/* now render the template into a Writer */
				writer = new StringWriter();
				t.merge(context, writer);
				System.out.println(writer);
				Functions.stringToFile(writer.toString(),
						this.switchyardProject.inputDataDir + capability.dataInputClassName + ".java", false);

			}
		}
	}

	public void addOutputData() {
		VelocityEngine ve = new VelocityEngine();
//		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
//		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		Template t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "output_data.vm");
		context.put("outputDataPkg", switchyardProject.outputDataPkg);

		for (Capability capability : service.getCapabilities()) {

			if (capability.getOutputs() != null && capability.getOutputs().size() != 0) {

				context.put("service", service);
				context.put("capability", capability);

				/* get the Template */

				/* now render the template into a Writer */
				writer = new StringWriter();
				t.merge(context, writer);
				System.out.println(writer);
				Functions.stringToFile(writer.toString(),
						this.switchyardProject.outputDataDir + capability.dataOutputClassName + ".java", false);

			}
		}
	}

	public void addState() {
		VelocityEngine ve = new VelocityEngine();
//		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
//		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		Template t;

		context.put("statePkg", this.switchyardProject.statePkg);
		context.put("utilPkg", this.switchyardProject.utilPkg);
		context.put("service", this.service);
		context.put("namespace", this.switchyardProject.namespace);

		context.put("stateFilePkg", this.switchyardProject.utilStateFeature.stateFilePkg);
		context.put("stateFilePath", this.switchyardProject.utilStateFeature.stateFilePath);
		context.put("STATE_FILE_NAME", UtilStateFeature.STATE_FILE_NAME);
		context.put("STATE_HEADER_NAME", UtilStateFeature.STATE_HEADER_NAME);

		for (Capability capability : this.service.capabilities) {

			if (capability.isServiceState()) {
				context.put("capability", capability);
				/* get the Template */
				t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "state_capability.vm");
				/* now render the template into a Writer */
				writer = new StringWriter();
				t.merge(context, writer);
				System.out.println(writer);

				String stateFilePath = this.switchyardProject.stateDir + capability.stateClassName + ".java";

				System.out.println(stateFilePath);
				Functions.stringToFile(writer.toString(), stateFilePath, false);
				///////
			}
		}
	}

	public void setService(Service service) {
		this.service = service;
	}
}
