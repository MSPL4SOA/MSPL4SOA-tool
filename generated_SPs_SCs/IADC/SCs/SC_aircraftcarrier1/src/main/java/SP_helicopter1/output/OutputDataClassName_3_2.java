package SP_helicopter1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_3_2")
public class OutputDataClassName_3_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_3_2_5")
	protected Float OutputName_3_2_5;
	@XmlElement(name = "OutputName_3_2_3")
	protected String OutputName_3_2_3;
	@XmlElement(name = "OutputName_3_2_4")
	protected Float OutputName_3_2_4;
	@XmlElement(name = "OutputName_3_2_1")
	protected Float OutputName_3_2_1;
	@XmlElement(name = "OutputName_3_2_2")
	protected Float OutputName_3_2_2;

	public Float getOutputName_3_2_5() {
		return OutputName_3_2_5;
	}

	public String getOutputName_3_2_3() {
		return OutputName_3_2_3;
	}

	public Float getOutputName_3_2_4() {
		return OutputName_3_2_4;
	}

	public Float getOutputName_3_2_1() {
		return OutputName_3_2_1;
	}

	public Float getOutputName_3_2_2() {
		return OutputName_3_2_2;
	}

	public void setOutputName_3_2_5(Float value) {
		this.OutputName_3_2_5 = value;
	}

	public void setOutputName_3_2_3(String value) {
		this.OutputName_3_2_3 = value;
	}

	public void setOutputName_3_2_4(Float value) {
		this.OutputName_3_2_4 = value;
	}

	public void setOutputName_3_2_1(Float value) {
		this.OutputName_3_2_1 = value;
	}

	public void setOutputName_3_2_2(Float value) {
		this.OutputName_3_2_2 = value;
	}

}
