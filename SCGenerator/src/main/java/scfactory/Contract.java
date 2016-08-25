package scfactory;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

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

}
