package SP_aircraftcarrier1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_3_4")
@XmlType(name = "outputDataClassName_3_4", propOrder = { "OutputName_3_4_1" })
public class OutputDataClassName_3_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_3_4_1")
	protected Integer OutputName_3_4_1;

	public Integer getOutputName_3_4_1() {
		return OutputName_3_4_1;
	}

	public void setOutputName_3_4_1(Integer value) {
		this.OutputName_3_4_1 = value;
	}

}
