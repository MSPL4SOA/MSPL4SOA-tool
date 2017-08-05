package features.SOAP;

import java.io.FileInputStream;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.apache.cxf.tools.java2ws.JavaToWS;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import features.bean.Capability;
import features.bean.ServiceFeature;
import features.util.UtilStateFeature;
import features.util.UtilTransformerFeature;
import generating.SwitchyardProject;
import util.Functions;

//TODO create in wsdl only capabilities that support SOAP
//this.serviceFeature.service -> this.serviceFeature.service.getServiceCapabilityOnlySOAP()

public class SOAPFeature {

	// <sca:service name="TestPortType" promote="TestBean/Test">
	// <sca:interface.wsdl interface="Test.wsdl#wsdl.porttype(TestPortType)"/>
	// <soap:binding.soap name="soap1">
	// <soap:contextMapper soapHeadersType="VALUE"/>
	// <soap:wsdl>Test.wsdl</soap:wsdl>
	// </soap:binding.soap>
	// </sca:service>

	public ServiceFeature serviceFeature;

	public String composerFileName;

	public static boolean ADD_SCA = false;

	public SOAPFeature(ServiceFeature serviceFeature) {

		this.serviceFeature = serviceFeature;

		composerFileName = "Composers_soap_" + serviceFeature.nameInterface;

	}

	public void addSCA() {

		// add namespace
		Document document = this.serviceFeature.switchyardXMLDOMParser.getDocument();

		if (ADD_SCA == false) {
			Element namespaceElement = (Element) document.getElementsByTagName("sy:switchyard").item(0);
			namespaceElement.setAttribute("xmlns:soap", "urn:switchyard-component-soap:config:2.0");
			ADD_SCA = true;
		}
		// namespaceElement.setAttribute("xmlns:transform",
		// "urn:switchyard-config:transform:2.0");

		// <sy:switchyard
		// xmlns:soap="urn:switchyard-component-soap:config:2.0"
		// xmlns:transform="urn:switchyard-config:transform:2.0"

		Node compositeElement = document.getElementsByTagName("sca:composite").item(0);

		// add sca
		Element componentElement = (Element) document.createElement("sca:service");
		componentElement.setAttribute("name", this.serviceFeature.nameInterface + "PortType");
		componentElement.setAttribute("promote",
				this.serviceFeature.nameBean + "/" + this.serviceFeature.nameInterface);
		compositeElement.appendChild(componentElement);

		// add interface
		Element beanElement = (Element) document.createElement("sca:interface.wsdl");
		beanElement.setAttribute("interface", this.serviceFeature.nameInterface + ".wsdl#wsdl.porttype("
				+ this.serviceFeature.nameInterface + "PortType)");
		componentElement.appendChild(beanElement);

		// add binding
		Element serviceElement = (Element) document.createElement("soap:binding.soap");
		serviceElement.setAttribute("name", "soap" + this.serviceFeature.nameInterface);
		componentElement.appendChild(serviceElement);

		// add soap:wsdl
		Element interfaceElement = (Element) document.createElement("soap:contextMapper");
		interfaceElement.setAttribute("soapHeadersType", "VALUE");
		interfaceElement.setAttribute("includes", ".*");
		serviceElement.appendChild(interfaceElement);

		Element composerlement = (Element) document.createElement("soap:messageComposer");
		composerlement.setAttribute("class",
				this.serviceFeature.switchyardProject.composerPkg + "." + composerFileName);
		serviceElement.appendChild(composerlement);

		// add soap:contextMapper
		Element contextMapper = (Element) document.createElement("soap:wsdl");
		contextMapper.appendChild(document.createTextNode(this.serviceFeature.nameInterface + ".wsdl"));
		serviceElement.appendChild(contextMapper);
		
		
		// add soap:contextPath
		Element contextPathElement = (Element) document.createElement("soap:contextPath");
		contextPathElement.appendChild(document.createTextNode
				(this.serviceFeature.switchyardProject.artifactId
						+ "/" + this.serviceFeature.nameInterface));
		serviceElement.appendChild(contextPathElement);

		this.serviceFeature.switchyardXMLDOMParser.writeXML();
		System.out.println("SOAP SCA is added");
	}

	// <sy:switchyard
	// xmlns:soap="urn:switchyard-component-soap:config:2.0"
	// xmlns:transform="urn:switchyard-config:transform:2.0"

	public void generateWSDL() {

		String srcDir = serviceFeature.switchyardProject.classesDir;
		String wsdlName = serviceFeature.nameInterface;
		String wsdlFile = serviceFeature.switchyardProject.resourcesDirPath + wsdlName + ".wsdl";
		String namespace = serviceFeature.switchyardProject.namespace;
		String className = serviceFeature.switchyardProject.servicePkg + "." + serviceFeature.nameInterface;

		try {

			// delete @ annotation from className

			System.out.println("Generate WSDLs");
			// "-soap12",
			String[] args = new String[] { "-cp", srcDir, "-o", wsdlFile, "-verbose", "-t", namespace, "-wsdl",
					className };
			JavaToWS.main(args);
			
//			JavaToWS javaToWS = new JavaToWS(args);
//			javaToWS.run();
			
//			String[] args = new String[] {"-o", wsdlFile, "-cp", srcDir, "-t", namespace, 
//					className };
//			org.apache.cxf.tools.java2wsdl.JavaToWSDL.main(args);


			// "-createxsdimports",
			// "-portname", "http://localhost:8080/MiddleWare2/Hello"
			System.out.println("WSDLs generated");
			
//			java2wsdl -o <output-file> -d <output-directory> -s <source-directory> -
//			classdir <compile-classes-directory> -cp <class-path> -soap12 -t <target-namespace> 
//			-servicename <service-name> -portname <port-name> -createxsdimports -h -v -verbose -quiet <classname> 

//			for (String string : args) {
//				System.out.println(string);
//			}

			String wsdlNew = Functions.fileToString(wsdlFile)
					.replaceAll("http://" + SwitchyardProject.SERVICE_DIR + "."
							+ this.serviceFeature.switchyardProject.groupId + "/", namespace)
					.replaceAll("http://localhost:9090/" + serviceFeature.nameInterface + "Port",
							serviceFeature.switchyardProject.host + serviceFeature.nameInterface + "/"
									+ serviceFeature.nameInterface);
			Functions.stringToFile(wsdlNew, wsdlFile, false);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteVoidResponseWSDL() {
		String wsdlName = serviceFeature.nameInterface;
		String wsdlFile = serviceFeature.switchyardProject.resourcesDirPath + wsdlName + ".wsdl";

		try {

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new FileInputStream(wsdlFile));

			for (Capability capability : this.serviceFeature.service.capabilities) {

				if (capability.getOutputs().size() == 0) {

					XPath xPath = XPathFactory.newInstance().newXPath();

					String expression = "//*[@name='" + capability.getName() + "Response']";
					NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);

					for (int i = 0; i < nodeList.getLength(); i++) {
						Node nNode = nodeList.item(i);

						nNode.getParentNode().removeChild(nNode);
					}
				}
			}

			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();
			t.transform(new DOMSource(doc), new StreamResult(wsdlFile));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void addTransformers() {

		VelocityEngine ve = new VelocityEngine();
//		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
//		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		Template t;

		context.put("inputDataPkg", this.serviceFeature.switchyardProject.inputDataPkg);
		context.put("outputDataPkg", this.serviceFeature.switchyardProject.outputDataPkg);
		context.put("transfromerPkg", this.serviceFeature.switchyardProject.transfromerPkg);
		context.put("utilPkg", this.serviceFeature.switchyardProject.utilPkg);
		context.put("XMLSOAPTransformersFilePkg",
				this.serviceFeature.switchyardProject.utilTransformerFeature.XMLSOAPTransformersFilePkg);
		context.put("XMLSOAPTransformersFilePath",
				this.serviceFeature.switchyardProject.utilTransformerFeature.XMLSOAPTransformersFilePath);
		context.put("XMLSOAPTransformersFileName", UtilTransformerFeature.XMLSOAPTransformersFileName);
		context.put("service", this.serviceFeature.service);
		context.put("namespace", this.serviceFeature.switchyardProject.namespace);

		// /* get the Template */
		// t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "util_soap_transformer.vm");
		// /* now render the template into a Writer */
		// writer = new StringWriter();
		// t.merge(context, writer);
		// // System.out.println(writer);
		// Functions.stringToFile(writer.toString(),
		// this.serviceFeature.switchyardProject.utilTransformerFeature.XMLSOAPTransformersFilePath
		// + ".java",
		// false);
		// ///////

		// add transformers
		//
		/* get the Template */
		t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "transformer.vm");
		/* now render the template into a Writer */
		writer = new StringWriter();
		t.merge(context, writer);
		System.out.println(writer);
		Functions.stringToFile(writer.toString(), this.serviceFeature.switchyardProject.transfromerDir + "Transformers"
				+ this.serviceFeature.service.interfaceName + ".java", false);

		// this.serviceFeature.service.capabilities.get(0).dataInputClassName

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
		context.put("artifactId", this.serviceFeature.switchyardProject.artifactId);

		context.put("service", this.serviceFeature.service.getServiceCapabilityOnlySOAP());

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
			t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "soap_composer.vm");
			/* now render the template into a Writer */
			writer = new StringWriter();
			t.merge(context, writer);
			System.out.println(writer);
			System.out.println(composerFilePath);
			Functions.stringToFile(writer.toString(), composerFilePath, false);
			///////
//		}
	}

//	public void addComposerSCA() {
//
//		String xmlFile = serviceFeature.switchyardProject.switchyardFilePath;
//
//		try {
//
//			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder builder = factory.newDocumentBuilder();
//			Document doc = builder.parse(new FileInputStream(xmlFile));
//
//			// <soap:binding.soap name="soap1">
//
//			XPath xPath = XPathFactory.newInstance().newXPath();
//
//			/// soap:binding.soap
//			String expression = "//*[@name='soap" + this.serviceFeature.nameInterface + "']";
//			NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
//
//			Node serviceElement = nodeList.item(0);
//
//			// add <soap:messageComposer
//			// class="com.example.switchyard.MiddleWare2.HelloSOAPMessageComposer"/>
//			Element componentElement = (Element) doc.createElement("soap:messageComposer");
//			componentElement.setAttribute("class",
//					this.serviceFeature.switchyardProject.composerPkg + "." + composerFileName);
//
//			System.out.println(serviceElement.getLastChild().getPreviousSibling().getNodeName());
//
//			// ToDo not sure is working all times: insert <soap:messageComposer>
//			// before <soap:wsdl> to avoid warning
//			serviceElement.insertBefore(componentElement, serviceElement.getLastChild().getPreviousSibling());
//
//			TransformerFactory tf = TransformerFactory.newInstance();
//			Transformer t = tf.newTransformer();
//			t.transform(new DOMSource(doc), new StreamResult(xmlFile));
//			// this.serviceFeature.switchyardXMLDOMParser.writeXML();
//
//			System.out.println("azezaeazezae");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}
