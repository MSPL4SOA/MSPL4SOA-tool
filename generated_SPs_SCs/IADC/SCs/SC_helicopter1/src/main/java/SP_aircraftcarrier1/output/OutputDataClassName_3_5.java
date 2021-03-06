package SP_aircraftcarrier1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_3_5")
public class OutputDataClassName_3_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_3_5_4")
	protected Float OutputName_3_5_4;
	@XmlElement(name = "OutputName_3_5_2")
	protected String OutputName_3_5_2;
	@XmlElement(name = "OutputName_3_5_3")
	protected String OutputName_3_5_3;
	@XmlElement(name = "OutputName_3_5_1")
	protected Integer OutputName_3_5_1;

	public Float getOutputName_3_5_4() {
		return OutputName_3_5_4;
	}

	public String getOutputName_3_5_2() {
		return OutputName_3_5_2;
	}

	public String getOutputName_3_5_3() {
		return OutputName_3_5_3;
	}

	public Integer getOutputName_3_5_1() {
		return OutputName_3_5_1;
	}

	public void setOutputName_3_5_4(Float value) {
		this.OutputName_3_5_4 = value;
	}

	public void setOutputName_3_5_2(String value) {
		this.OutputName_3_5_2 = value;
	}

	public void setOutputName_3_5_3(String value) {
		this.OutputName_3_5_3 = value;
	}

	public void setOutputName_3_5_1(Integer value) {
		this.OutputName_3_5_1 = value;
	}

}
