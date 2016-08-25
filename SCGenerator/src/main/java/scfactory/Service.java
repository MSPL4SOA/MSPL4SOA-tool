package scfactory;


import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "service")
public class Service {
	public String interfaceName;
	public String beanName;
	public int number;


	@XmlElement(name = "capability", type = Capability.class)
	public ArrayList<Capability> capabilities;


	public Service() {
		this.capabilities = new ArrayList<Capability>();
	}

	@XmlTransient
	private Service serviceCapabilityOnlySOAP;
	@XmlTransient
	private Service serviceCapabilityOnlyREST;
	@XmlTransient
	private Service serviceCapabilityOnlyJMS;

	public ArrayList<Capability> getCapabilities() {
		return capabilities;
	}



	public String getBeanName() {
		return beanName;
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public int getNumber() {
		return number;
	}

	public boolean soapExist() {

		for (Capability capability : capabilities) {

			if (capability.soap == true) {
				return true;
			}
		}

		return false;
	}

	public boolean restExist() {

		for (Capability capability : capabilities) {

			if (capability.rest == true) {
				return true;
			}
		}

		return false;
	}

	public boolean jmsExist() {

		for (Capability capability : capabilities) {

			if (capability.jms == true) {
				return true;
			}
		}

		return false;
	}

	public Service getServiceCapabilityOnlySOAP() {

		if (serviceCapabilityOnlySOAP == null) {
			serviceCapabilityOnlySOAP = new Service();
			serviceCapabilityOnlySOAP.beanName = this.beanName;
			serviceCapabilityOnlySOAP.interfaceName = this.interfaceName;
			serviceCapabilityOnlySOAP.number = this.number;
			// serviceCapabilityOnlySOAP = this.clone();
			for (Capability capability : this.capabilities) {

				if (capability.soap == true)
					serviceCapabilityOnlySOAP.capabilities.add(capability);
			}
		}

		return serviceCapabilityOnlySOAP;
	}

	public Service getServiceCapabilityOnlyREST() {

		if (serviceCapabilityOnlyREST == null) {
			serviceCapabilityOnlyREST = new Service();
			serviceCapabilityOnlyREST.beanName = this.beanName;
			serviceCapabilityOnlyREST.interfaceName = this.interfaceName;
			serviceCapabilityOnlyREST.number = this.number;
			// serviceCapabilityOnlyREST = this.clone();
			for (Capability capability : this.capabilities) {

				if (capability.rest == true)
					serviceCapabilityOnlyREST.capabilities.add(capability);
			}
		}

		return serviceCapabilityOnlyREST;
	}

	public Service getServiceCapabilityOnlyJMS() {

		if (serviceCapabilityOnlyJMS == null) {
			serviceCapabilityOnlyJMS = new Service();
			serviceCapabilityOnlyJMS.beanName = this.beanName;
			serviceCapabilityOnlyJMS.interfaceName = this.interfaceName;
			serviceCapabilityOnlyJMS.number = this.number;
			// serviceCapabilityOnlyJMS = this.clone();
			for (Capability capability : this.capabilities) {

				if (capability.jms == true)
					serviceCapabilityOnlyJMS.capabilities.add(capability);
			}
		}

		return serviceCapabilityOnlyJMS;
	}

	// @Override
	// public Service clone() {
	// try {
	// return (Service) super.clone();
	// } catch (CloneNotSupportedException e) {
	// // This should never happen
	// throw new InternalError(e.toString());
	// }
	// }

}