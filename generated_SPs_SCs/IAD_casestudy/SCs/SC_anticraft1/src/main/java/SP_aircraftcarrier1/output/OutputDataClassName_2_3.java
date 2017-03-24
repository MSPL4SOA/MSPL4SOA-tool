package SP_aircraftcarrier1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_2_3")
public class OutputDataClassName_2_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_2_3_5")
	protected Float OutputName_2_3_5;
	@XmlElement(name = "OutputName_2_3_6")
	protected String OutputName_2_3_6;
	@XmlElement(name = "OutputName_2_3_1")
	protected Float OutputName_2_3_1;
	@XmlElement(name = "OutputName_2_3_2")
	protected Integer OutputName_2_3_2;
	@XmlElement(name = "OutputName_2_3_3")
	protected String OutputName_2_3_3;
	@XmlElement(name = "OutputName_2_3_4")
	protected Float OutputName_2_3_4;

	public Float getOutputName_2_3_5() {
		return OutputName_2_3_5;
	}

	public String getOutputName_2_3_6() {
		return OutputName_2_3_6;
	}

	public Float getOutputName_2_3_1() {
		return OutputName_2_3_1;
	}

	public Integer getOutputName_2_3_2() {
		return OutputName_2_3_2;
	}

	public String getOutputName_2_3_3() {
		return OutputName_2_3_3;
	}

	public Float getOutputName_2_3_4() {
		return OutputName_2_3_4;
	}

	public void setOutputName_2_3_5(Float value) {
		this.OutputName_2_3_5 = value;
	}

	public void setOutputName_2_3_6(String value) {
		this.OutputName_2_3_6 = value;
	}

	public void setOutputName_2_3_1(Float value) {
		this.OutputName_2_3_1 = value;
	}

	public void setOutputName_2_3_2(Integer value) {
		this.OutputName_2_3_2 = value;
	}

	public void setOutputName_2_3_3(String value) {
		this.OutputName_2_3_3 = value;
	}

	public void setOutputName_2_3_4(Float value) {
		this.OutputName_2_3_4 = value;
	}

}
