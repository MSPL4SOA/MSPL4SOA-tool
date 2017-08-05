package SP_aircraftcarrier1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_2")
@XmlType(name = "outputDataClassName_5_2", propOrder = { "OutputName_5_2_1" })
public class OutputDataClassName_5_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_2_1")
	protected Integer OutputName_5_2_1;

	public Integer getOutputName_5_2_1() {
		return OutputName_5_2_1;
	}

	public void setOutputName_5_2_1(Integer value) {
		this.OutputName_5_2_1 = value;
	}

}
