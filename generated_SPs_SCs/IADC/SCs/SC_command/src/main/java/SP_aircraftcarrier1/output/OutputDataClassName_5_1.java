package SP_aircraftcarrier1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_1")
public class OutputDataClassName_5_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_1_2")
	protected Float OutputName_5_1_2;
	@XmlElement(name = "OutputName_5_1_3")
	protected Float OutputName_5_1_3;
	@XmlElement(name = "OutputName_5_1_1")
	protected Float OutputName_5_1_1;
	@XmlElement(name = "OutputName_5_1_6")
	protected Integer OutputName_5_1_6;
	@XmlElement(name = "OutputName_5_1_4")
	protected Float OutputName_5_1_4;
	@XmlElement(name = "OutputName_5_1_5")
	protected Float OutputName_5_1_5;

	public Float getOutputName_5_1_2() {
		return OutputName_5_1_2;
	}

	public Float getOutputName_5_1_3() {
		return OutputName_5_1_3;
	}

	public Float getOutputName_5_1_1() {
		return OutputName_5_1_1;
	}

	public Integer getOutputName_5_1_6() {
		return OutputName_5_1_6;
	}

	public Float getOutputName_5_1_4() {
		return OutputName_5_1_4;
	}

	public Float getOutputName_5_1_5() {
		return OutputName_5_1_5;
	}

	public void setOutputName_5_1_2(Float value) {
		this.OutputName_5_1_2 = value;
	}

	public void setOutputName_5_1_3(Float value) {
		this.OutputName_5_1_3 = value;
	}

	public void setOutputName_5_1_1(Float value) {
		this.OutputName_5_1_1 = value;
	}

	public void setOutputName_5_1_6(Integer value) {
		this.OutputName_5_1_6 = value;
	}

	public void setOutputName_5_1_4(Float value) {
		this.OutputName_5_1_4 = value;
	}

	public void setOutputName_5_1_5(Float value) {
		this.OutputName_5_1_5 = value;
	}

}
