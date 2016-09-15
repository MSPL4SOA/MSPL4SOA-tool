package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.eclipse.persistence.jaxb.MarshallerProperties;

import features.bean.Capability;
import features.bean.Contract;
import features.bean.Input;
import features.bean.Output;
import features.bean.Service;

public class MockData {
	
	
	public static String projectName = "p1";

	// public static void addServiceXML(ServiceFeature beanFeature) {
	//
	//
	// //service 1
	// Service service = new Service();
	// service.interfaceName = beanFeature.nameInterface;
	// service.beanName = beanFeature.nameBean;
	// // service.pkgName = switchyardProject.pkgSrcMain;
	//
	//// service.broker.queueIn = "in_queue_" + service.interfaceName;
	//// service.broker.queueOut = "out_queue_" + service.interfaceName;
	//// service.broker.topic = "topic_" + service.interfaceName;
	//// service.broker.acknowledgement = true;
	//// service.broker.transactional = false;
	//// service.broker.persistentDelivery = true;
	//
	// //////
	// Input input1 = new Input();
	// input1.name = "id";
	// input1.type = "String";
	// //
	// Input input2 = new Input();
	// input2.name = "qte";
	// input2.type = "Integer";
	// //
	// ArrayList<Input> inputs1 = new ArrayList<Input>();
	// inputs1.add(input1);
	// inputs1.add(input2);
	// ///////
	//
	// ////////
	// Output output1 = new Output();
	// output1.name = "id";
	// output1.type = "String";
	// //
	// Output output2 = new Output();
	// output2.name = "remark";
	// output2.type = "String";
	// ArrayList<Output> outputs1 = new ArrayList<Output>();
	// outputs1.add(output1);
	// outputs1.add(output2);
	// ////////
	//
	// Capability capability1 = new Capability();
	// capability1.name = "getPerson";
	// capability1.outputs = outputs1;
	// capability1.inputs = inputs1;
	// capability1.serviceName = service.interfaceName;
	// capability1.serviceStateFeatureExist = true;
	// capability1.stateMessaging = true;
	// capability1.statefullFeatureExist = true;
	// capability1.stateRepository = true;
	// capability1.soap = true;
	// capability1.rest = true;
	// capability1.restMethod = "Get";
	// capability1.jms = true;
	//// capability1.broker.capability = capability1;
	// capability1.broker.serviceName = service.interfaceName;
	// capability1.broker.capabilityName = capability1.name;
	// capability1.broker.setQueues();
	// capability1.broker.acknowledgement = true;
	// capability1.broker.transactional = false;
	// capability1.broker.persistentDelivery = true;
	// capability1.authentification = true;
	// capability1.setDataInputOutputClassName();
	//
	// Capability capability2 = new Capability();
	// ArrayList<Input> inputs2 = new ArrayList<Input>();
	// ArrayList<Output> outputs2 = new ArrayList<Output>();
	// capability2.name = "sayHello";
	// capability2.outputs = outputs2;
	// capability2.inputs = inputs2;
	// capability2.serviceName = service.interfaceName;
	// capability2.serviceStateFeatureExist = false;
	// capability2.stateMessaging = false;
	// capability2.statefullFeatureExist = false;
	// capability2.stateRepository = false;
	// capability2.soap = false;
	// capability2.rest = true;
	// capability2.restMethod = "Post";
	// capability2.jms = false;
	// capability2.broker.serviceName = service.interfaceName;
	// capability2.broker.capabilityName = capability2.name;
	// capability2.broker.setQueues();
	//// capability2.broker.capability = capability2;
	// capability2.broker.acknowledgement = false;
	// capability2.broker.transactional = true;
	// capability2.broker.persistentDelivery = true;
	// capability2.authentification = false;
	// capability2.setDataInputOutputClassName();
	//
	// ArrayList<Capability> capabilities = new ArrayList<Capability>();
	// capabilities.add(capability1);
	// capabilities.add(capability2);
	//
	// service.capabilities = capabilities;
	//
	// util.JAXBUtil.marshall(service, beanFeature.serviceXmlFileName);
	// }

	// public static void addServiceXML(ServiceFeature beanFeature) {
	//
	//
	// }

	public static Contract getServices() {
		Contract conract = new Contract();
		
		conract.projectName = MockData.projectName;
		conract.hostName = "h1";

		conract.services.add(getService1());
		conract.services.add(getService2());

		return conract;
	}

	public static Service getService1() {
		// service 1
		Service service = new Service();
		service.interfaceName = "Buy";
		service.beanName = service.interfaceName + "Bean";
		// service.pkgName = switchyardProject.pkgSrcMain;

		// service.broker.queueIn = "in_queue_" + service.interfaceName;
		// service.broker.queueOut = "out_queue_" + service.interfaceName;
		// service.broker.topic = "topic_" + service.interfaceName;
		// service.broker.acknowledgement = true;
		// service.broker.transactional = false;
		// service.broker.persistentDelivery = true;

		//////
		Input input1 = new Input();
		input1.name = "name";
		input1.type = "String";
		//
		Input input2 = new Input();
		input2.name = "age";
		input2.type = "Integer";
		//
		ArrayList<Input> inputs1 = new ArrayList<Input>();
		inputs1.add(input1);
		inputs1.add(input2);
		///////

		////////
		Output output1 = new Output();
		output1.name = "id";
		output1.type = "String";
		//
		Output output2 = new Output();
		output2.name = "cin";
		output2.type = "Integer";
		ArrayList<Output> outputs1 = new ArrayList<Output>();
		outputs1.add(output1);
		outputs1.add(output2);
		////////

		Capability capability1 = new Capability();
		capability1.name = "getOrder";
		capability1.outputs = outputs1;
		capability1.inputs = inputs1;
		capability1.serviceName = service.interfaceName;
		capability1.serviceState = true;
		capability1.stateMessaging = true;
		capability1.statefullService = true;
		capability1.stateRepository = true;
		capability1.soap = true;
		capability1.rest = true;
		capability1.restMethod = "Put";
		capability1.jms = false;
		// capability1.broker.capability = capability1;
		capability1.broker.serviceName = service.interfaceName;
		capability1.broker.capabilityName = capability1.name;
		capability1.broker.setQueues(MockData.projectName);
		capability1.broker.acknowledgement = true;
		capability1.broker.transactional = false;
		capability1.broker.persistentDelivery = true;
		capability1.authentification = true;
		capability1.setConfigurations();

		Capability capability2 = new Capability();
		Input input3 = new Input();
		input3.name = "name";
		input3.type = "String";
		ArrayList<Input> inputs2 = new ArrayList<Input>();
		inputs2.add(input3);
		ArrayList<Output> outputs2 = new ArrayList<Output>();
		capability2.name = "validOrder";
		capability2.outputs = outputs2;
		capability2.inputs = inputs2;
		capability2.serviceName = service.interfaceName;
		capability2.serviceState = true;
		capability2.stateMessaging = false;
		capability2.statefullService = true;
		capability2.stateRepository = false;
		capability2.soap = true;
		capability2.rest = true;
		capability2.restMethod = "Post";
		capability2.jms = false;
		capability2.broker.serviceName = service.interfaceName;
		capability2.broker.capabilityName = capability2.name;
		capability2.broker.setQueues(MockData.projectName);
		// capability2.broker.capability = capability2;
		capability2.broker.acknowledgement = false;
		capability2.broker.transactional = true;
		capability2.broker.persistentDelivery = true;
		capability2.authentification = false;
		capability2.setConfigurations();

		ArrayList<Capability> capabilities = new ArrayList<Capability>();
		capabilities.add(capability1);
		capabilities.add(capability2);

		service.capabilities = capabilities;

		return service;

	}

	public static Service getService2() {
		// service 1
		Service service = new Service();
		service.interfaceName = "Sell";
		service.beanName = service.interfaceName + "Bean";
		// service.pkgName = switchyardProject.pkgSrcMain;

		// service.broker.queueIn = "in_queue_" + service.interfaceName;
		// service.broker.queueOut = "out_queue_" + service.interfaceName;
		// service.broker.topic = "topic_" + service.interfaceName;
		// service.broker.acknowledgement = true;
		// service.broker.transactional = false;
		// service.broker.persistentDelivery = true;

		//////
		Input input1 = new Input();
		input1.name = "id";
		input1.type = "String";
		//
		Input input2 = new Input();
		input2.name = "qte";
		input2.type = "Integer";

		Input input3 = new Input();
		input3.name = "Society";
		input3.type = "String";
		//
		ArrayList<Input> inputs1 = new ArrayList<Input>();
		inputs1.add(input1);
		inputs1.add(input2);
		///////

		////////
		Output output1 = new Output();
		output1.name = "id";
		output1.type = "String";
		//
		ArrayList<Output> outputs1 = new ArrayList<Output>();
		outputs1.add(output1);
		////////

		Capability capability1 = new Capability();
		capability1.name = "getPerson";
		capability1.outputs = outputs1;
		capability1.inputs = inputs1;
		capability1.serviceName = service.interfaceName;
		capability1.serviceState = true;
		capability1.stateMessaging = true;
		capability1.statefullService = false;
		capability1.stateRepository = false;
		capability1.soap = false;
		capability1.rest = false;
		capability1.restMethod = "Post";
		capability1.jms = true;
		// capability1.broker.capability = capability1;
		capability1.broker.serviceName = service.interfaceName;
		capability1.broker.capabilityName = capability1.name;
		capability1.broker.setQueues(MockData.projectName);
		capability1.broker.acknowledgement = true;
		capability1.broker.transactional = false;
		capability1.broker.persistentDelivery = true;
		capability1.authentification = true;
		capability1.setConfigurations();

		Capability capability2 = new Capability();
		ArrayList<Input> inputs2 = new ArrayList<Input>();
		Output output2 = new Output();
		output2.name = "cin";
		output2.type = "Integer";
		ArrayList<Output> outputs2 = new ArrayList<Output>();
		outputs2.add(output2);

		capability2.name = "sayHello";
		capability2.outputs = outputs2;
		capability2.inputs = inputs2;
		capability2.serviceName = service.interfaceName;
		capability2.serviceState = true;
		capability2.stateMessaging = true;
		capability2.statefullService = true;
		capability2.stateRepository = true;
		capability2.soap = false;
		capability2.rest = false;
		capability2.restMethod = "Post";
		capability2.jms = true;
		capability2.broker.serviceName = service.interfaceName;
		capability2.broker.capabilityName = capability2.name;
		capability2.broker.setQueues(MockData.projectName);
		// capability2.broker.capability = capability2;
		capability2.broker.acknowledgement = false;
		capability2.broker.transactional = true;
		capability2.broker.persistentDelivery = true;
		capability2.authentification = false;
		capability2.setConfigurations();

		ArrayList<Capability> capabilities = new ArrayList<Capability>();
		capabilities.add(capability1);
		capabilities.add(capability2);

		service.capabilities = capabilities;

		return service;

	}

	public static void main(String[] args) throws JAXBException {

//		javax.xml.bind.context.factory=org.eclipse.persistence.jaxb.JAXBContextFactory
		
		Contract contract = getServices();
		
		util.JAXBUtil.marshall(contract, "/home/akram/Bureau/conf.xml","configuration");

//		JAXBContext jc = JAXBContext.newInstance(Contract.class);
//
//		// Unmarshaller unmarshaller = jc.createUnmarshaller();
//		// File xml = new File("src/blog/objectgraphs/metadata/input.xml");
//		// Contract customer = (Contract) unmarshaller.unmarshal(xml);
//
//		// Output XML
//		Marshaller marshaller = jc.createMarshaller();
//		// marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//		// marshaller.marshal(contract, System.out);
//
//		// Output XML - Based on Object Graph
//		marshaller.setProperty(MarshallerProperties.OBJECT_GRAPH, "configuration");
//		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//		marshaller.marshal(contract, System.out);

		// // Output JSON - Based on Object Graph
		// marshaller.setProperty(MarshallerProperties.MEDIA_TYPE,
		// "application/json");
		// marshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT,
		// false);
		// marshaller.setProperty(MarshallerProperties.JSON_WRAPPER_AS_ARRAY_NAME,
		// true);
		// marshaller.marshal(customer, System.out);

		// util.JAXBUtil.marshall(contract,
		// "/home/akram/Bureau/contract.xml");
	}
}
