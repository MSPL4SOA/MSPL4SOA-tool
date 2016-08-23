package scfactory;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import jms.Broker;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "capability")
public class Capability implements Cloneable {
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
	public boolean temporaryMemory;

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

	// response handler
	public boolean synchronous;
	public boolean asynchronous;

	// authentification
	public String usernameValue;
	public String passwordValue;

	@XmlElement(name = "input", type = Input.class)
	public ArrayList<Input> inputs;

	@XmlElement(name = "output", type = Output.class)
	public ArrayList<Output> outputs;

	public Capability() {
		this.inputs = new ArrayList<Input>();
		this.outputs = new ArrayList<Output>();
		this.broker = new Broker();
	}

	public void setDataInputOutputClassName() {
		dataInputClassName = "InputData" + "_" + serviceName + "_" + name;
		dataOutputClassName = "OutputData" + "_" + serviceName + "_" + name;
		stateClassName = "State" + "_" + serviceName + "_" + name;
	}

	public ArrayList<Input> getInputs() {
		return inputs;
	}

	public ArrayList<Output> getOutputs() {
		return outputs;
	}

	public String getName() {
		return name;
	}

	public String getDataInputClassName() {
		return dataInputClassName;
	}

	public String getServiceName() {
		return serviceName;
	}

	public String getDataOutputClassName() {
		return dataOutputClassName;
	}

	public String getStateClassName() {
		return stateClassName;
	}

	public boolean isServiceStateFeatureExist() {
		return serviceState;
	}

	public boolean isStateMessaging() {
		return stateMessaging;
	}

	public boolean isStatefullFeatureExist() {
		return statefullService;
	}

	public boolean isStateRepository() {
		return stateRepository;
	}

	public boolean isSoap() {
		return soap;
	}

	public boolean isRest() {
		return rest;
	}

	public String getRestMethod() {
		return restMethod;
	}

	public boolean isJms() {
		return jms;
	}

	public boolean isAuthentification() {
		return authentification;
	}

	public boolean isTwoWayState() {
		return twoWayState;
	}

	public Broker getBroker() {
		return broker;
	}

	public String getPasswordValue() {
		return passwordValue;
	}

	public String getUsernameValue() {
		return usernameValue;
	}

	public boolean isAsynchronous() {
		return asynchronous;
	}

	public boolean isSynchronous() {
		return synchronous;
	}

	public boolean isTemporaryMemory() {
		return temporaryMemory;
	}
	
	public int getNumber() {
		return number;
	}
	
//	public String getDataInputPkg() {
//		return dataInputPkg;
//	}
//	
//	public String getDataOutputPkg() {
//		return dataOutputPkg;
//	}

	@Override
	public Capability clone() {
		try {
			return (Capability) super.clone();
		} catch (CloneNotSupportedException e) {
			// This should never happen
			throw new InternalError(e.toString());
		}
	}
}