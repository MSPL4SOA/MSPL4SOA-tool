package SP_infantry1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_2")
public class OutputDataClassName_5_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_2_1")
	protected Float OutputName_5_2_1;
	@XmlElement(name = "OutputName_5_2_2")
	protected Integer OutputName_5_2_2;
	@XmlElement(name = "OutputName_5_2_5")
	protected Float OutputName_5_2_5;
	@XmlElement(name = "OutputName_5_2_3")
	protected Float OutputName_5_2_3;
	@XmlElement(name = "OutputName_5_2_4")
	protected Integer OutputName_5_2_4;

	public Float getOutputName_5_2_1() {
		return OutputName_5_2_1;
	}

	public Integer getOutputName_5_2_2() {
		return OutputName_5_2_2;
	}

	public Float getOutputName_5_2_5() {
		return OutputName_5_2_5;
	}

	public Float getOutputName_5_2_3() {
		return OutputName_5_2_3;
	}

	public Integer getOutputName_5_2_4() {
		return OutputName_5_2_4;
	}

	public void setOutputName_5_2_1(Float value) {
		this.OutputName_5_2_1 = value;
	}

	public void setOutputName_5_2_2(Integer value) {
		this.OutputName_5_2_2 = value;
	}

	public void setOutputName_5_2_5(Float value) {
		this.OutputName_5_2_5 = value;
	}

	public void setOutputName_5_2_3(Float value) {
		this.OutputName_5_2_3 = value;
	}

	public void setOutputName_5_2_4(Integer value) {
		this.OutputName_5_2_4 = value;
	}

}
