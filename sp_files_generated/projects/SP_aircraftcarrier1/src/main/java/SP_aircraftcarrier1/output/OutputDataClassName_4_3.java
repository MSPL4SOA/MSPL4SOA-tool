package SP_aircraftcarrier1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_3")
@XmlType(name = "outputDataClassName_4_3", propOrder = { "OutputName_4_3_1",
		"OutputName_4_3_2" })
public class OutputDataClassName_4_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_3_1")
	protected Integer OutputName_4_3_1;
	@XmlElement(name = "OutputName_4_3_2")
	protected Integer OutputName_4_3_2;

	public Integer getOutputName_4_3_1() {
		return OutputName_4_3_1;
	}

	public Integer getOutputName_4_3_2() {
		return OutputName_4_3_2;
	}

	public void setOutputName_4_3_1(Integer value) {
		this.OutputName_4_3_1 = value;
	}

	public void setOutputName_4_3_2(Integer value) {
		this.OutputName_4_3_2 = value;
	}

}
