package large3.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_5")
public class OutputDataClassName_4_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_5_1")
	protected String OutputName_4_5_1;
	@XmlElement(name = "OutputName_4_5_2")
	protected Float OutputName_4_5_2;
	@XmlElement(name = "OutputName_4_5_3")
	protected Float OutputName_4_5_3;
	@XmlElement(name = "OutputName_4_5_4")
	protected Float OutputName_4_5_4;
	@XmlElement(name = "OutputName_4_5_5")
	protected Float OutputName_4_5_5;

	public String getOutputName_4_5_1() {
		return OutputName_4_5_1;
	}

	public Float getOutputName_4_5_2() {
		return OutputName_4_5_2;
	}

	public Float getOutputName_4_5_3() {
		return OutputName_4_5_3;
	}

	public Float getOutputName_4_5_4() {
		return OutputName_4_5_4;
	}

	public Float getOutputName_4_5_5() {
		return OutputName_4_5_5;
	}

	public void setOutputName_4_5_1(String value) {
		this.OutputName_4_5_1 = value;
	}

	public void setOutputName_4_5_2(Float value) {
		this.OutputName_4_5_2 = value;
	}

	public void setOutputName_4_5_3(Float value) {
		this.OutputName_4_5_3 = value;
	}

	public void setOutputName_4_5_4(Float value) {
		this.OutputName_4_5_4 = value;
	}

	public void setOutputName_4_5_5(Float value) {
		this.OutputName_4_5_5 = value;
	}

}
