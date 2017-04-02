package SP_command.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_1")
public class OutputDataClassName_6_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_1_1")
	protected Integer OutputName_6_1_1;
	@XmlElement(name = "OutputName_6_1_2")
	protected String OutputName_6_1_2;
	@XmlElement(name = "OutputName_6_1_3")
	protected Integer OutputName_6_1_3;

	public Integer getOutputName_6_1_1() {
		return OutputName_6_1_1;
	}

	public String getOutputName_6_1_2() {
		return OutputName_6_1_2;
	}

	public Integer getOutputName_6_1_3() {
		return OutputName_6_1_3;
	}

	public void setOutputName_6_1_1(Integer value) {
		this.OutputName_6_1_1 = value;
	}

	public void setOutputName_6_1_2(String value) {
		this.OutputName_6_1_2 = value;
	}

	public void setOutputName_6_1_3(Integer value) {
		this.OutputName_6_1_3 = value;
	}

}
