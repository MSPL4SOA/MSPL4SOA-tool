package SP_command.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_5")
public class OutputDataClassName_1_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_5_4")
	protected Integer OutputName_1_5_4;
	@XmlElement(name = "OutputName_1_5_5")
	protected Float OutputName_1_5_5;
	@XmlElement(name = "OutputName_1_5_2")
	protected String OutputName_1_5_2;
	@XmlElement(name = "OutputName_1_5_3")
	protected Float OutputName_1_5_3;
	@XmlElement(name = "OutputName_1_5_1")
	protected Integer OutputName_1_5_1;

	public Integer getOutputName_1_5_4() {
		return OutputName_1_5_4;
	}

	public Float getOutputName_1_5_5() {
		return OutputName_1_5_5;
	}

	public String getOutputName_1_5_2() {
		return OutputName_1_5_2;
	}

	public Float getOutputName_1_5_3() {
		return OutputName_1_5_3;
	}

	public Integer getOutputName_1_5_1() {
		return OutputName_1_5_1;
	}

	public void setOutputName_1_5_4(Integer value) {
		this.OutputName_1_5_4 = value;
	}

	public void setOutputName_1_5_5(Float value) {
		this.OutputName_1_5_5 = value;
	}

	public void setOutputName_1_5_2(String value) {
		this.OutputName_1_5_2 = value;
	}

	public void setOutputName_1_5_3(Float value) {
		this.OutputName_1_5_3 = value;
	}

	public void setOutputName_1_5_1(Integer value) {
		this.OutputName_1_5_1 = value;
	}

}
