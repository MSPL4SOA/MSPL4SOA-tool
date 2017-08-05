package SP_command.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_7_1")
public class OutputDataClassName_7_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_7_1_1")
	protected String OutputName_7_1_1;
	@XmlElement(name = "OutputName_7_1_4")
	protected String OutputName_7_1_4;
	@XmlElement(name = "OutputName_7_1_3")
	protected String OutputName_7_1_3;
	@XmlElement(name = "OutputName_7_1_2")
	protected Float OutputName_7_1_2;

	public String getOutputName_7_1_1() {
		return OutputName_7_1_1;
	}

	public String getOutputName_7_1_4() {
		return OutputName_7_1_4;
	}

	public String getOutputName_7_1_3() {
		return OutputName_7_1_3;
	}

	public Float getOutputName_7_1_2() {
		return OutputName_7_1_2;
	}

	public void setOutputName_7_1_1(String value) {
		this.OutputName_7_1_1 = value;
	}

	public void setOutputName_7_1_4(String value) {
		this.OutputName_7_1_4 = value;
	}

	public void setOutputName_7_1_3(String value) {
		this.OutputName_7_1_3 = value;
	}

	public void setOutputName_7_1_2(Float value) {
		this.OutputName_7_1_2 = value;
	}

}
