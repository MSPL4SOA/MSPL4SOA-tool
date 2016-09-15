package features.bean;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import features.jms.Broker;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "contract")
public class Contract {

	@XmlElement(name = "service", type = Service.class)
	public ArrayList<Service> services;

	public String projectName;

	public String hostName;

	public String dataInputPkg;
	public String dataOutputPkg;

	public Contract() {
		services = new ArrayList<Service>();
	}

	public ArrayList<Service> getServices() {
		return services;
	}

	public String getHostName() {
		return hostName;
	}

	public String getDataInputPkg() {
		return dataInputPkg;
	}

	public String getDataOutputPkg() {
		return dataOutputPkg;
	}

	public String getProjectName() {
		return projectName;
	}

//	public Contract getOnlyConfigurationContract() {
//
//		Contract contractResult = new Contract();
//
//		contractResult.projectName = this.projectName;
//		contractResult.host = this.host;
//		contractResult.dataInputPkg = this.dataInputPkg;
//		contractResult.dataOutputPkg = this.dataOutputPkg;
//
//		for (Service service : services) {
//
//			Service ServiceResult = new Service();
//
//			ServiceResult.interfaceName = service.interfaceName;
//			// ServiceResult.number = service.number;
//
//			for (Capability capability : service.capabilities) {
//
//				Capability capabilityResult = new Capability();
//
//				capabilityResult.name = capability.name;
//				// capabilityResult.number = capability.number;
//
//				if (capability.broker != null)
//				{
//					capabilityResult.broker = new Broker();
//					capabilityResult.broker.queueIn = capability.broker.queueIn;
//					capabilityResult.broker.queueOut = capability.broker.queueOut;
//					capabilityResult.broker.topic = capability.broker.topic;
//				}
//
//				ServiceResult.capabilities.add(capabilityResult);
//			}
//
//			contractResult.services.add(ServiceResult);
//		}
//
//		return contractResult;
//	}
}
