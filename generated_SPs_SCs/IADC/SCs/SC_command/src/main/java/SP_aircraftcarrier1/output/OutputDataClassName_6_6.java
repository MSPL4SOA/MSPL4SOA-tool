package SP_aircraftcarrier1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_6")
public class OutputDataClassName_6_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_6_3")
	protected Integer OutputName_6_6_3;
	@XmlElement(name = "OutputName_6_6_2")
	protected Integer OutputName_6_6_2;
	@XmlElement(name = "OutputName_6_6_5")
	protected Integer OutputName_6_6_5;
	@XmlElement(name = "OutputName_6_6_4")
	protected Float OutputName_6_6_4;
	@XmlElement(name = "OutputName_6_6_1")
	protected Float OutputName_6_6_1;

	public Integer getOutputName_6_6_3() {
		return OutputName_6_6_3;
	}

	public Integer getOutputName_6_6_2() {
		return OutputName_6_6_2;
	}

	public Integer getOutputName_6_6_5() {
		return OutputName_6_6_5;
	}

	public Float getOutputName_6_6_4() {
		return OutputName_6_6_4;
	}

	public Float getOutputName_6_6_1() {
		return OutputName_6_6_1;
	}

	public void setOutputName_6_6_3(Integer value) {
		this.OutputName_6_6_3 = value;
	}

	public void setOutputName_6_6_2(Integer value) {
		this.OutputName_6_6_2 = value;
	}

	public void setOutputName_6_6_5(Integer value) {
		this.OutputName_6_6_5 = value;
	}

	public void setOutputName_6_6_4(Float value) {
		this.OutputName_6_6_4 = value;
	}

	public void setOutputName_6_6_1(Float value) {
		this.OutputName_6_6_1 = value;
	}

}
