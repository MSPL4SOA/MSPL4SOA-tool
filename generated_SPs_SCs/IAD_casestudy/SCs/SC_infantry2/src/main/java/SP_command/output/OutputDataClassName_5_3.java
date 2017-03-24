package SP_command.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_3")
public class OutputDataClassName_5_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_3_1")
	protected Integer OutputName_5_3_1;
	@XmlElement(name = "OutputName_5_3_2")
	protected String OutputName_5_3_2;
	@XmlElement(name = "OutputName_5_3_3")
	protected Float OutputName_5_3_3;

	public Integer getOutputName_5_3_1() {
		return OutputName_5_3_1;
	}

	public String getOutputName_5_3_2() {
		return OutputName_5_3_2;
	}

	public Float getOutputName_5_3_3() {
		return OutputName_5_3_3;
	}

	public void setOutputName_5_3_1(Integer value) {
		this.OutputName_5_3_1 = value;
	}

	public void setOutputName_5_3_2(String value) {
		this.OutputName_5_3_2 = value;
	}

	public void setOutputName_5_3_3(Float value) {
		this.OutputName_5_3_3 = value;
	}

}
