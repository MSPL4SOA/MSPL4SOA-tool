package SP_infantry1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_2_1")
public class OutputDataClassName_2_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_2_1_3")
	protected Float OutputName_2_1_3;
	@XmlElement(name = "OutputName_2_1_4")
	protected Float OutputName_2_1_4;
	@XmlElement(name = "OutputName_2_1_5")
	protected String OutputName_2_1_5;
	@XmlElement(name = "OutputName_2_1_6")
	protected String OutputName_2_1_6;
	@XmlElement(name = "OutputName_2_1_1")
	protected String OutputName_2_1_1;
	@XmlElement(name = "OutputName_2_1_2")
	protected Float OutputName_2_1_2;

	public Float getOutputName_2_1_3() {
		return OutputName_2_1_3;
	}

	public Float getOutputName_2_1_4() {
		return OutputName_2_1_4;
	}

	public String getOutputName_2_1_5() {
		return OutputName_2_1_5;
	}

	public String getOutputName_2_1_6() {
		return OutputName_2_1_6;
	}

	public String getOutputName_2_1_1() {
		return OutputName_2_1_1;
	}

	public Float getOutputName_2_1_2() {
		return OutputName_2_1_2;
	}

	public void setOutputName_2_1_3(Float value) {
		this.OutputName_2_1_3 = value;
	}

	public void setOutputName_2_1_4(Float value) {
		this.OutputName_2_1_4 = value;
	}

	public void setOutputName_2_1_5(String value) {
		this.OutputName_2_1_5 = value;
	}

	public void setOutputName_2_1_6(String value) {
		this.OutputName_2_1_6 = value;
	}

	public void setOutputName_2_1_1(String value) {
		this.OutputName_2_1_1 = value;
	}

	public void setOutputName_2_1_2(Float value) {
		this.OutputName_2_1_2 = value;
	}

}
