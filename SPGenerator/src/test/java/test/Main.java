package test;

import features.SOAP.SOAPFeature;
import features.bean.Capability;
import features.bean.Contract;
import features.bean.Service;
import features.bean.ServiceFeature;
import features.jms.JMSFeature;
import features.rest.RESTFeature;
import generating.SwitchyardProject;

public class Main {

	public static void main(String[] args) {

	//		String[] args = new String[] {"-wsdl", "-o", wsdlFile.getAbsolutePath(), "-s", output.getPath(),
	//      "-client", "-server", "org.apache.hello_world_soap12_http.Greeter"};
	
	
	//File wsdlFile = new File("./test.wsdl");
	//File output = new File("./gen");
	//
	//
	//String[] args2 = new String[] {"-wsdl", "-o", wsdlFile.getAbsolutePath(), "-s", output.getPath(),
	//		"test.MockData" };

		
//		java2ws -cp ./projects/ffggv/target/classes -o ./projects/ffggv/src/main/resources/ServiceName_1.wsdl 
//		-verbose -t urn:ffggv:ffggv:1.0 -wsdl ffggv.service.ServiceName_1

		
//		String[] args2 = new String[] {"-o", "./test.wsdl", "-v",
//				"test.MockData" };
//		
//		JavaToWSDL.main(args2);
//		System.exit(61);
		
		Contract contract0 = (Contract) util.JAXBUtil.unmarshall("./contract_generated/commerce11_contract.xml", Contract.class);
		
		for (Service serviceT : contract0.services) {
			
			for (Capability capabilityT : serviceT.getServiceCapabilityOnlyJMS().capabilities) {
				System.out.println(capabilityT);
			}
			
		}

		System.exit(-1);
		
		
		SwitchyardProject switchyardProject = new SwitchyardProject("/home/akram/Bureau/projects/", "grp38", "art38");

		switchyardProject.generateMavenProject();
		switchyardProject.configureSwitchyardProject();// mandatory
		// switchyardProject.writeConfFiles();// only for test not
		// switchyardProject.mkdirProjectDirs();// only for test not
		switchyardProject.mkdirUtilFiles();
		//

		Contract contract = MockData.getServices();

//		util.JAXBUtil.marshall(contract, switchyardProject.servicesXmlFileName);
//		contract = (Contract) util.JAXBUtil.unmarshall(switchyardProject.servicesXmlFileName, Contract.class);

		for (Service service : contract.services) {

			ServiceFeature serviceFeature = new ServiceFeature(switchyardProject, service);

			System.out.println(serviceFeature.service.interfaceName);

			//
			// mockdata.MockData.addServiceXML(serviceFeature);
			//
			// Service service = (Service)
			// util.JAXBUtil.unmarshall(serviceFeature.serviceXmlFileName,
			// Service.class);
			// serviceFeature.setService(service);// mandatory

			serviceFeature.addInputData();
			serviceFeature.addOutputData();
			// //
			serviceFeature.addSCA();
			serviceFeature.addInterface();
			serviceFeature.addState();
			// //

			if (service.soapExist()) {
				switchyardProject.compileProjectMvn();
				SOAPFeature soapFeature = new SOAPFeature(serviceFeature);
				soapFeature.generateWSDL();
				soapFeature.deleteVoidResponseWSDL();
				soapFeature.addSCA();
				soapFeature.addTransformers();
				soapFeature.addComposer();
			}

			if (service.restExist()) {
				RESTFeature restFeature = new RESTFeature(serviceFeature);
				restFeature.addSCA();
				restFeature.addComposer();
				restFeature.addResource();
			}

			if (service.jmsExist()) {
				JMSFeature jmsFeature = new JMSFeature(serviceFeature);
				jmsFeature.addCamelSCA();
				jmsFeature.addCamelRouterJava();
				jmsFeature.addJMSInterface();
				jmsFeature.addJMSSCA();
				jmsFeature.addJMSXML();
			}
		}
	}

}
