package SP_infantry1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_5")
public class OutputDataClassName_5_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_5_6")
	protected Float OutputName_5_5_6;
	@XmlElement(name = "OutputName_5_5_4")
	protected Float OutputName_5_5_4;
	@XmlElement(name = "OutputName_5_5_5")
	protected Float OutputName_5_5_5;
	@XmlElement(name = "OutputName_5_5_2")
	protected Float OutputName_5_5_2;
	@XmlElement(name = "OutputName_5_5_3")
	protected Float OutputName_5_5_3;
	@XmlElement(name = "OutputName_5_5_1")
	protected String OutputName_5_5_1;

	public Float getOutputName_5_5_6() {
		return OutputName_5_5_6;
	}

	public Float getOutputName_5_5_4() {
		return OutputName_5_5_4;
	}

	public Float getOutputName_5_5_5() {
		return OutputName_5_5_5;
	}

	public Float getOutputName_5_5_2() {
		return OutputName_5_5_2;
	}

	public Float getOutputName_5_5_3() {
		return OutputName_5_5_3;
	}

	public String getOutputName_5_5_1() {
		return OutputName_5_5_1;
	}

	public void setOutputName_5_5_6(Float value) {
		this.OutputName_5_5_6 = value;
	}

	public void setOutputName_5_5_4(Float value) {
		this.OutputName_5_5_4 = value;
	}

	public void setOutputName_5_5_5(Float value) {
		this.OutputName_5_5_5 = value;
	}

	public void setOutputName_5_5_2(Float value) {
		this.OutputName_5_5_2 = value;
	}

	public void setOutputName_5_5_3(Float value) {
		this.OutputName_5_5_3 = value;
	}

	public void setOutputName_5_5_1(String value) {
		this.OutputName_5_5_1 = value;
	}

}
