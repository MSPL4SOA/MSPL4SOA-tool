package SP_aircraftcarrier1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_3")
@XmlType(name = "outputDataClassName_6_3", propOrder = { "OutputName_6_3_2",
		"OutputName_6_3_1", "OutputName_6_3_3" })
public class OutputDataClassName_6_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_3_2")
	protected String OutputName_6_3_2;
	@XmlElement(name = "OutputName_6_3_1")
	protected Float OutputName_6_3_1;
	@XmlElement(name = "OutputName_6_3_3")
	protected Integer OutputName_6_3_3;

	public String getOutputName_6_3_2() {
		return OutputName_6_3_2;
	}

	public Float getOutputName_6_3_1() {
		return OutputName_6_3_1;
	}

	public Integer getOutputName_6_3_3() {
		return OutputName_6_3_3;
	}

	public void setOutputName_6_3_2(String value) {
		this.OutputName_6_3_2 = value;
	}

	public void setOutputName_6_3_1(Float value) {
		this.OutputName_6_3_1 = value;
	}

	public void setOutputName_6_3_3(Integer value) {
		this.OutputName_6_3_3 = value;
	}

}
