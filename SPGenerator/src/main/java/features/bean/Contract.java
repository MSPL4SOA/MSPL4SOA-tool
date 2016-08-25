package features.bean;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlNamedAttributeNode;
import org.eclipse.persistence.oxm.annotations.XmlNamedObjectGraph;
import org.eclipse.persistence.oxm.annotations.XmlNamedSubgraph;

import features.jms.Broker;


@XmlNamedObjectGraph(
	    name="configuration",
	    attributeNodes={
	        @XmlNamedAttributeNode(value="projectName"),
	        @XmlNamedAttributeNode(value="host"),
	        @XmlNamedAttributeNode(value="dataInputPkg"),
	        @XmlNamedAttributeNode(value="dataOutputPkg"),
	        @XmlNamedAttributeNode(value="services", subgraph="service")
	    },
	    subgraphs={
	        @XmlNamedSubgraph(
	            name="service",
	            attributeNodes = { 
	                @XmlNamedAttributeNode(value="interfaceName"),
	                @XmlNamedAttributeNode(value="number"),
	                @XmlNamedAttributeNode(value="capabilities", subgraph="capability")
	            }
	        ),
	        @XmlNamedSubgraph(
		            name="capability",
		            attributeNodes = { 
		                @XmlNamedAttributeNode(value="name"),
		                @XmlNamedAttributeNode(value="number"),
		                @XmlNamedAttributeNode(value="dataInputClassName"),
		                @XmlNamedAttributeNode(value="dataOutputClassName"),
		                @XmlNamedAttributeNode(value="stateMessaging"),
		                @XmlNamedAttributeNode(value="twoWayState"),
		                @XmlNamedAttributeNode(value="rest"),
		                @XmlNamedAttributeNode(value="restMethod"),
		                @XmlNamedAttributeNode(value="soap"),
		                @XmlNamedAttributeNode(value="authentification"),
		                @XmlNamedAttributeNode(value="jms"),
		                @XmlNamedAttributeNode(value="broker", subgraph="broker"),
		                @XmlNamedAttributeNode(value="inputs", subgraph="input"),
		                @XmlNamedAttributeNode(value="outputs", subgraph="output")
		        }
		    ),
	        @XmlNamedSubgraph(
		            name="broker",
		            attributeNodes = { 
		                @XmlNamedAttributeNode(value="brokerName"),
		                @XmlNamedAttributeNode(value="initialContextFactory"),
		                @XmlNamedAttributeNode(value="providerUrl"),
		                @XmlNamedAttributeNode(value="securityPrincipal"),
		                @XmlNamedAttributeNode(value="securityCredentials"),
		                @XmlNamedAttributeNode(value="connectionConsumerFactory"),
		                @XmlNamedAttributeNode(value="queueIn"),
		                @XmlNamedAttributeNode(value="queueOut"),
		                @XmlNamedAttributeNode(value="topic"),
		                @XmlNamedAttributeNode(value="publishSubscribe"),
		                @XmlNamedAttributeNode(value="durable"),
		            }
		        ),
	        @XmlNamedSubgraph(
		            name="input",
		            attributeNodes = { 
		            	@XmlNamedAttributeNode(value="name"),
				        @XmlNamedAttributeNode(value="type"),
				        @XmlNamedAttributeNode(value="number"),
		            }
		        )
	        ,
	        @XmlNamedSubgraph(
		            name="output",
		            attributeNodes = { 
		                @XmlNamedAttributeNode(value="name"),
		                @XmlNamedAttributeNode(value="type"),
		                @XmlNamedAttributeNode(value="number"),
		            }
		        )
	    }
	)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "contract")
public class Contract {

	@XmlElement(name = "service", type = Service.class)
	public ArrayList<Service> services;

	public String projectName;

	public String host;

	public String dataInputPkg;
	public String dataOutputPkg;

	public Contract() {
		services = new ArrayList<Service>();
	}

	public ArrayList<Service> getServices() {
		return services;
	}

	public String getHost() {
		return host;
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
