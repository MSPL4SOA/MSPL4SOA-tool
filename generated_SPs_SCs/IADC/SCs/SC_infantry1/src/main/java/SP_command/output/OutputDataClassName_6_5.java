package SP_command.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_5")
public class OutputDataClassName_6_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_5_3")
	protected String OutputName_6_5_3;
	@XmlElement(name = "OutputName_6_5_2")
	protected Float OutputName_6_5_2;
	@XmlElement(name = "OutputName_6_5_1")
	protected String OutputName_6_5_1;

	public String getOutputName_6_5_3() {
		return OutputName_6_5_3;
	}

	public Float getOutputName_6_5_2() {
		return OutputName_6_5_2;
	}

	public String getOutputName_6_5_1() {
		return OutputName_6_5_1;
	}

	public void setOutputName_6_5_3(String value) {
		this.OutputName_6_5_3 = value;
	}

	public void setOutputName_6_5_2(Float value) {
		this.OutputName_6_5_2 = value;
	}

	public void setOutputName_6_5_1(String value) {
		this.OutputName_6_5_1 = value;
	}

}
