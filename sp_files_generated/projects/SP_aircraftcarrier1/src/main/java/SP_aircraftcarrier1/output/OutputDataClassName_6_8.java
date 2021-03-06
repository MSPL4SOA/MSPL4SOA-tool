package SP_aircraftcarrier1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_8")
@XmlType(name = "outputDataClassName_6_8", propOrder = { "OutputName_6_8_1",
		"OutputName_6_8_3", "OutputName_6_8_2", "OutputName_6_8_5",
		"OutputName_6_8_4" })
public class OutputDataClassName_6_8 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_8_1")
	protected Float OutputName_6_8_1;
	@XmlElement(name = "OutputName_6_8_3")
	protected String OutputName_6_8_3;
	@XmlElement(name = "OutputName_6_8_2")
	protected String OutputName_6_8_2;
	@XmlElement(name = "OutputName_6_8_5")
	protected Integer OutputName_6_8_5;
	@XmlElement(name = "OutputName_6_8_4")
	protected String OutputName_6_8_4;

	public Float getOutputName_6_8_1() {
		return OutputName_6_8_1;
	}

	public String getOutputName_6_8_3() {
		return OutputName_6_8_3;
	}

	public String getOutputName_6_8_2() {
		return OutputName_6_8_2;
	}

	public Integer getOutputName_6_8_5() {
		return OutputName_6_8_5;
	}

	public String getOutputName_6_8_4() {
		return OutputName_6_8_4;
	}

	public void setOutputName_6_8_1(Float value) {
		this.OutputName_6_8_1 = value;
	}

	public void setOutputName_6_8_3(String value) {
		this.OutputName_6_8_3 = value;
	}

	public void setOutputName_6_8_2(String value) {
		this.OutputName_6_8_2 = value;
	}

	public void setOutputName_6_8_5(Integer value) {
		this.OutputName_6_8_5 = value;
	}

	public void setOutputName_6_8_4(String value) {
		this.OutputName_6_8_4 = value;
	}

}
