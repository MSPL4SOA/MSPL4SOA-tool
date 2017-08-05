package SP_command.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_3_4")
public class OutputDataClassName_3_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_3_4_1")
	protected Float OutputName_3_4_1;
	@XmlElement(name = "OutputName_3_4_2")
	protected String OutputName_3_4_2;

	public Float getOutputName_3_4_1() {
		return OutputName_3_4_1;
	}

	public String getOutputName_3_4_2() {
		return OutputName_3_4_2;
	}

	public void setOutputName_3_4_1(Float value) {
		this.OutputName_3_4_1 = value;
	}

	public void setOutputName_3_4_2(String value) {
		this.OutputName_3_4_2 = value;
	}

}
