package SP_aircraftcarrier1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_4")
public class OutputDataClassName_1_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_4_5")
	protected Integer OutputName_1_4_5;
	@XmlElement(name = "OutputName_1_4_6")
	protected String OutputName_1_4_6;
	@XmlElement(name = "OutputName_1_4_3")
	protected String OutputName_1_4_3;
	@XmlElement(name = "OutputName_1_4_4")
	protected Integer OutputName_1_4_4;
	@XmlElement(name = "OutputName_1_4_1")
	protected Float OutputName_1_4_1;
	@XmlElement(name = "OutputName_1_4_2")
	protected String OutputName_1_4_2;

	public Integer getOutputName_1_4_5() {
		return OutputName_1_4_5;
	}

	public String getOutputName_1_4_6() {
		return OutputName_1_4_6;
	}

	public String getOutputName_1_4_3() {
		return OutputName_1_4_3;
	}

	public Integer getOutputName_1_4_4() {
		return OutputName_1_4_4;
	}

	public Float getOutputName_1_4_1() {
		return OutputName_1_4_1;
	}

	public String getOutputName_1_4_2() {
		return OutputName_1_4_2;
	}

	public void setOutputName_1_4_5(Integer value) {
		this.OutputName_1_4_5 = value;
	}

	public void setOutputName_1_4_6(String value) {
		this.OutputName_1_4_6 = value;
	}

	public void setOutputName_1_4_3(String value) {
		this.OutputName_1_4_3 = value;
	}

	public void setOutputName_1_4_4(Integer value) {
		this.OutputName_1_4_4 = value;
	}

	public void setOutputName_1_4_1(Float value) {
		this.OutputName_1_4_1 = value;
	}

	public void setOutputName_1_4_2(String value) {
		this.OutputName_1_4_2 = value;
	}

}
