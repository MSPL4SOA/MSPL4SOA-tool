package SP_command.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_2")
public class OutputDataClassName_6_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_2_1")
	protected Float OutputName_6_2_1;
	@XmlElement(name = "OutputName_6_2_3")
	protected String OutputName_6_2_3;
	@XmlElement(name = "OutputName_6_2_2")
	protected String OutputName_6_2_2;
	@XmlElement(name = "OutputName_6_2_4")
	protected Float OutputName_6_2_4;

	public Float getOutputName_6_2_1() {
		return OutputName_6_2_1;
	}

	public String getOutputName_6_2_3() {
		return OutputName_6_2_3;
	}

	public String getOutputName_6_2_2() {
		return OutputName_6_2_2;
	}

	public Float getOutputName_6_2_4() {
		return OutputName_6_2_4;
	}

	public void setOutputName_6_2_1(Float value) {
		this.OutputName_6_2_1 = value;
	}

	public void setOutputName_6_2_3(String value) {
		this.OutputName_6_2_3 = value;
	}

	public void setOutputName_6_2_2(String value) {
		this.OutputName_6_2_2 = value;
	}

	public void setOutputName_6_2_4(Float value) {
		this.OutputName_6_2_4 = value;
	}

}
