package features.jms;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import features.bean.Capability;
import features.bean.ServiceFeature;
import features.util.UtilStateFeature;
import generating.SwitchyardProject;
import util.Functions;

public class JMSFeature {

	public ServiceFeature serviceFeature;

	public static boolean ADD_CAMEL_SCA = false;

	public static boolean ADD_JMS_SCA = false;

	public String jmsCamelRouterName;
	public String jmsInterfaceName;
	public String jmsXML;

	public final static String INVOKE_METHOD = "invokeMethod";

	public JMSFeature(ServiceFeature serviceFeature) {

		this.serviceFeature = serviceFeature;

		this.jmsCamelRouterName = serviceFeature.nameInterface + "JMSCamelRouter";
		this.jmsInterfaceName = serviceFeature.nameInterface + "JMSInterface";
		// must end with hornetq-jms
		this.jmsXML = serviceFeature.switchyardProject.metaInf + serviceFeature.nameInterface + "-hornetq-jms.xml";

	}

	public void addCamelSCA() {

		// add namespace
		Document document = this.serviceFeature.switchyardXMLDOMParser.getDocument();

		if (ADD_CAMEL_SCA == false) {
			// xmlns:resteasy="urn:switchyard-component-resteasy:config:2.0"
			Element namespaceElement = (Element) document.getElementsByTagName("sy:switchyard").item(0);
			namespaceElement.setAttribute("xmlns:camel", "urn:switchyard-component-camel:config:2.0");
			ADD_CAMEL_SCA = true;
		}

		Node compositeElement = document.getElementsByTagName("sca:composite").item(0);

		// add sca:component
		Element componentElement = (Element) document.createElement("sca:component");
		componentElement.setAttribute("name", this.jmsCamelRouterName);
		compositeElement.appendChild(componentElement);

		// add implementation
		Element implementationElement = (Element) document.createElement("camel:implementation.camel");
		componentElement.appendChild(implementationElement);

		// add java
		Element javaElement = (Element) document.createElement("camel:java");
		javaElement.setAttribute("class",
				this.serviceFeature.switchyardProject.javaCamelRouterPkg + "." + this.jmsCamelRouterName);
		implementationElement.appendChild(javaElement);

		///////////////

		// add sca:service
		Element serviceElement = (Element) document.createElement("sca:service");
		serviceElement.setAttribute("name", this.jmsInterfaceName);
		componentElement.appendChild(serviceElement);

		// add sca:interface.java
		Element interfaceElement = (Element) document.createElement("sca:interface.java");
		interfaceElement.setAttribute("interface",
				this.serviceFeature.switchyardProject.servicePkg + "." + this.jmsInterfaceName);
		serviceElement.appendChild(interfaceElement);

		/////////////

		// add sca:reference
		Element referenceElement = (Element) document.createElement("sca:reference");
		referenceElement.setAttribute("name", this.serviceFeature.nameInterface);
		componentElement.appendChild(referenceElement);

		// add sca:interface.java
		Element interfaceReferenceElement = (Element) document.createElement("sca:interface.java");
		interfaceReferenceElement.setAttribute("interface",
				this.serviceFeature.switchyardProject.servicePkg + "." + this.serviceFeature.nameInterface);
		referenceElement.appendChild(interfaceReferenceElement);

		///////////////////
		// add service

		// add sca:component
		// Element servicePromoteElement = (Element)
		// document.createElement("sca:service");
		// servicePromoteElement.setAttribute("name", this.jmsInterfaceName);
		// servicePromoteElement.setAttribute("promote", this.jmsCamelRouterName
		// + "/" + this.jmsInterfaceName);
		// compositeElement.appendChild(servicePromoteElement);

		// // add sca:interface.java
		// Element interfacePromoteElement = (Element)
		// document.createElement("sca:interface.java");
		// interfacePromoteElement.setAttribute("interface",
		// this.serviceFeature.switchyardProject.servicePkg + "." +
		// this.jmsInterfaceName);
		// servicePromoteElement.appendChild(interfacePromoteElement);

		///////////////////////

		this.serviceFeature.switchyardXMLDOMParser.writeXML();
		System.out.println("Camel SCA is added");

	}

	public void addCamelRouterJava() {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		Template t;

		context.put("javaCamelRouterPkg", this.serviceFeature.switchyardProject.javaCamelRouterPkg);
		context.put("camelRouterJMSName", this.jmsCamelRouterName);
		context.put("camelRouterInterfaceName", this.jmsInterfaceName);
		context.put("SERVICE_NAME", ServiceFeature.SERVICE_NAME);
		context.put("METHOD_NAME", ServiceFeature.METHOD_NAME);
		context.put("STATE_FILE_NAME", UtilStateFeature.STATE_FILE_NAME);
		context.put("STATE_HEADER_NAME", UtilStateFeature.STATE_HEADER_NAME);
		context.put("service", this.serviceFeature.service.getServiceCapabilityOnlyJMS());
		context.put("statePkg", this.serviceFeature.switchyardProject.statePkg);

		String resourceFilePath = this.serviceFeature.switchyardProject.javaCamelRouterDir + jmsCamelRouterName
				+ ".java";

		/* get the Template */
		t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "camel_java.vm");
		/* now render the template into a Writer */
		writer = new StringWriter();
		t.merge(context, writer);
		System.out.println(writer);
		System.out.println(resourceFilePath);
		Functions.stringToFile(writer.toString(), resourceFilePath, false);
		///////
	}

	public void addJMSInterface() {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		Template t;

		context.put("servicePkg", this.serviceFeature.switchyardProject.servicePkg);
		context.put("camelRouterInterfaceName", this.jmsInterfaceName);
		context.put("INVOKE_METHOD", INVOKE_METHOD);

		String resourceFilePath = this.serviceFeature.switchyardProject.serviceDir + jmsInterfaceName + ".java";

		/* get the Template */
		t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "jms_interface.vm");
		/* now render the template into a Writer */
		writer = new StringWriter();
		t.merge(context, writer);
		System.out.println(writer);
		System.out.println(resourceFilePath);
		Functions.stringToFile(writer.toString(), resourceFilePath, false);
		///////
	}

	public void addJMSSCA() {
		// add namespace
		Document document = this.serviceFeature.switchyardXMLDOMParser.getDocument();

		if (ADD_JMS_SCA == false) {
			Element namespaceElement = (Element) document.getElementsByTagName("sy:switchyard").item(0);
			namespaceElement.setAttribute("xmlns:jms", "urn:switchyard-component-camel-jms:config:2.0");
			ADD_JMS_SCA = true;
		}

		// namespaceElement.setAttribute("xmlns:transform",
		// "urn:switchyard-config:transform:2.0");

		// <sy:switchyard
		// xmlns:soap="urn:switchyard-component-soap:config:2.0"
		// xmlns:transform="urn:switchyard-config:transform:2.0"

		Node compositeElement = document.getElementsByTagName("sca:composite").item(0);

		// add sca
		Element componentElement = (Element) document.createElement("sca:service");
		componentElement.setAttribute("name", this.jmsInterfaceName );
		componentElement.setAttribute("promote", this.jmsCamelRouterName + "/" + this.jmsInterfaceName);
		compositeElement.appendChild(componentElement);

		// add interface
		Element beanElement = (Element) document.createElement("sca:interface.java");
		beanElement.setAttribute("interface",
				this.serviceFeature.switchyardProject.servicePkg + "." + this.jmsInterfaceName);
		componentElement.appendChild(beanElement);

		for (Capability capability : this.serviceFeature.service.getServiceCapabilityOnlyJMS().capabilities) {
			// add binding
			Element serviceElement = (Element) document.createElement("jms:binding.jms");
			serviceElement.setAttribute("name",
					this.serviceFeature.switchyardProject.artifactId
					+"_hornetq_queue_" + this.serviceFeature.nameInterface + "_" + capability.name);
			componentElement.appendChild(serviceElement);

			// add soap:wsdl <sy:operationSelector
			// operationName="invokeMethod"/>
			Element operationElement = (Element) document.createElement("sy:operationSelector");
			operationElement.setAttribute("operationName", INVOKE_METHOD);
			serviceElement.appendChild(operationElement);

			// add contextmapper <jms:contextMapper includes=".*"/>
			Element contextMapperElement = (Element) document.createElement("jms:contextMapper");
			contextMapperElement.setAttribute("includes", ".*");
			serviceElement.appendChild(contextMapperElement);

			// add soap:contextMapper <jms:queue>inQueue</jms:queue>
			Element jmsElement = (Element) document.createElement("jms:queue");
			jmsElement.appendChild(document.createTextNode(capability.broker.queueIn));
			serviceElement.appendChild(jmsElement);

			// add soap:contextMapper
			// <jms:connectionFactory>#ConnectionFactory</jms:connectionFactory>
			Element connectionFactoryElement = (Element) document.createElement("jms:connectionFactory");
			connectionFactoryElement.appendChild(document.createTextNode(capability.broker.connectionFactory));
			serviceElement.appendChild(connectionFactoryElement);
			
			// <jms:deliveryPersistent>false</jms:deliveryPersistent>
			if (capability.broker.persistentDelivery == true) {
				Element persistentDeliverElement = (Element) document.createElement("jms:deliveryPersistent");
				persistentDeliverElement.appendChild(document.createTextNode("true"));
				serviceElement.appendChild(persistentDeliverElement);
			}

			// transcated
			if (capability.broker.transactional == true) {
				Element transactedconnectionElement = (Element) document.createElement("jms:transacted");
				transactedconnectionElement.appendChild(document.createTextNode("true"));
				serviceElement.appendChild(transactedconnectionElement);
			}

			// ack
			// <jms:acknowledgementModeName>AUTO_ACKNOWLEDGE</jms:acknowledgementModeName>
			if (capability.broker.acknowledgement == true) {
				Element acknowledgementElement = (Element) document
						.createElement("jms:acknowledgementModeName");
				acknowledgementElement.appendChild(document.createTextNode("AUTO_ACKNOWLEDGE"));
				serviceElement.appendChild(acknowledgementElement);
			}
			
		}

		this.serviceFeature.switchyardXMLDOMParser.writeXML();
		System.out.println("JMS SCA is added");
	}

	public void addJMSXML() {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		Template t;

		context.put("service", this.serviceFeature.service.getServiceCapabilityOnlyJMS());// to do this.serviceFeature.service.broker

		/* get the Template */
		t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "hornetq_jms.vm");
		/* now render the template into a Writer */
		writer = new StringWriter();
		t.merge(context, writer);
		System.out.println(writer);
		System.out.println(jmsXML);
		Functions.stringToFile(writer.toString(), jmsXML, false);
		///////
	}
}

// <sca:service name="MiddleWareService"
// promote="ContentBasedRouter/MiddleWareService">
// <sca:interface.java
// interface="com.example.switchyard.MiddleWare2.MiddleWareService"/>
// <jms:binding.jms name="hornetq_queue">
// <sy:operationSelector operationName="invokeMethod"/>
// <jms:contextMapper includeNamespaces=".*" includes=".*"/>
// <jms:queue>inQueue</jms:queue>
// <jms:connectionFactory>#ConnectionFactory</jms:connectionFactory>
// </jms:binding.jms>
// </sca:service>
