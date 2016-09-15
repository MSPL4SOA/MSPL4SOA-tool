package features.bean;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import features.jms.Broker;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "capability")
public class Capability {
	public String name;
	public int number;
	
//	public String dataInputPkg;
//	public String dataOutputPkg;
	
	public String serviceName;
	public String dataInputClassName;
	public String dataOutputClassName;
	public String stateClassName;

	public boolean serviceState;
	public boolean stateMessaging;
	public boolean statefullService;
	public boolean stateRepository;
	
	public boolean twoWayState;

	// rest
	public boolean rest;
	public String restMethod;

	// soap
	public boolean soap;

	@XmlElement(name = "broker", type = Broker.class)
	public Broker broker;

	public boolean authentification;

	// jms
	public boolean jms;

	@XmlElement(name = "input", type = Input.class)
	public ArrayList<Input> inputs;

	@XmlElement(name = "output", type = Output.class)
	public ArrayList<Output> outputs;
	
	//SC
	public boolean temporaryMemory;
	public boolean synchronous;
	public boolean asynchronous;
	public String username;
	public String password;

	public Capability() {
		this.inputs = new ArrayList<Input>();
		this.outputs = new ArrayList<Output>();
		this.broker = new Broker();
	}

	public void setConfigurations() {
//		dataInputClassName = "InputData" + "_" + serviceName + "_" + name;
//		dataInputClassName = dataInputClassName.replaceAll("_", "");
		
//		dataOutputClassName = "OutputData" + "_" + serviceName + "_" + name;
//		dataOutputClassName = dataOutputClassName.replaceAll("_", "");
		
		stateClassName = "State" + "_" + serviceName + "_" + name;
//		stateClassName = stateClassName.replaceAll("_", "");
	}

	public ArrayList<Input> getInputs() {
		return inputs;
	}

	public ArrayList<Output> getOutputs() {
		return outputs;
	}
	
	@Override
	public Capability clone() {
		try {
			return (Capability) super.clone();
		} catch (CloneNotSupportedException e) {
			// This should never happen
			throw new InternalError(e.toString());
		}
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getServiceName() {
		return serviceName;
	}

	public String getDataInputClassName() {
		return dataInputClassName;
	}

	public String getDataOutputClassName() {
		return dataOutputClassName;
	}

	public String getStateClassName() {
		return stateClassName;
	}

	public boolean isServiceState() {
		return serviceState;
	}

	public boolean isStateMessaging() {
		return stateMessaging;
	}

	public boolean isStatefullService() {
		return statefullService;
	}

	public boolean isStateRepository() {
		return stateRepository;
	}

	public boolean isTwoWayState() {
		return twoWayState;
	}

	public boolean isRest() {
		return rest;
	}

	public String getRestMethod() {
		return restMethod;
	}

	public boolean isSoap() {
		return soap;
	}

	public Broker getBroker() {
		return broker;
	}

	public boolean isAuthentification() {
		return authentification;
	}

	public boolean isJms() {
		return jms;
	}

	public boolean isTemporaryMemory() {
		return temporaryMemory;
	}

	public boolean isSynchronous() {
		return synchronous;
	}

	public boolean isAsynchronous() {
		return asynchronous;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	
	
}