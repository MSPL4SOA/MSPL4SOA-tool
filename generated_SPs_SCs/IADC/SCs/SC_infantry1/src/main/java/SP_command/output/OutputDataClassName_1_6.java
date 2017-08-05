package SP_command.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_6")
public class OutputDataClassName_1_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_6_3")
	protected Integer OutputName_1_6_3;
	@XmlElement(name = "OutputName_1_6_1")
	protected Float OutputName_1_6_1;
	@XmlElement(name = "OutputName_1_6_2")
	protected String OutputName_1_6_2;

	public Integer getOutputName_1_6_3() {
		return OutputName_1_6_3;
	}

	public Float getOutputName_1_6_1() {
		return OutputName_1_6_1;
	}

	public String getOutputName_1_6_2() {
		return OutputName_1_6_2;
	}

	public void setOutputName_1_6_3(Integer value) {
		this.OutputName_1_6_3 = value;
	}

	public void setOutputName_1_6_1(Float value) {
		this.OutputName_1_6_1 = value;
	}

	public void setOutputName_1_6_2(String value) {
		this.OutputName_1_6_2 = value;
	}

}
