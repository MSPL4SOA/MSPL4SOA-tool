package sp_manager.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_2")
public class OutputDataClassName_1_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_2_1")
	protected String OutputName_1_2_1;
	@XmlElement(name = "OutputName_1_2_2")
	protected String OutputName_1_2_2;
	@XmlElement(name = "OutputName_1_2_3")
	protected Float OutputName_1_2_3;

	public String getOutputName_1_2_1() {
		return OutputName_1_2_1;
	}

	public String getOutputName_1_2_2() {
		return OutputName_1_2_2;
	}

	public Float getOutputName_1_2_3() {
		return OutputName_1_2_3;
	}

	public void setOutputName_1_2_1(String value) {
		this.OutputName_1_2_1 = value;
	}

	public void setOutputName_1_2_2(String value) {
		this.OutputName_1_2_2 = value;
	}

	public void setOutputName_1_2_3(Float value) {
		this.OutputName_1_2_3 = value;
	}

}
