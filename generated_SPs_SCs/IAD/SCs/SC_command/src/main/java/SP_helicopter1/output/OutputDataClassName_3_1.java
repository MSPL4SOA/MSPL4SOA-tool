package SP_helicopter1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_3_1")
public class OutputDataClassName_3_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_3_1_1")
	protected Integer OutputName_3_1_1;
	@XmlElement(name = "OutputName_3_1_4")
	protected Integer OutputName_3_1_4;
	@XmlElement(name = "OutputName_3_1_5")
	protected Float OutputName_3_1_5;
	@XmlElement(name = "OutputName_3_1_2")
	protected String OutputName_3_1_2;
	@XmlElement(name = "OutputName_3_1_3")
	protected String OutputName_3_1_3;

	public Integer getOutputName_3_1_1() {
		return OutputName_3_1_1;
	}

	public Integer getOutputName_3_1_4() {
		return OutputName_3_1_4;
	}

	public Float getOutputName_3_1_5() {
		return OutputName_3_1_5;
	}

	public String getOutputName_3_1_2() {
		return OutputName_3_1_2;
	}

	public String getOutputName_3_1_3() {
		return OutputName_3_1_3;
	}

	public void setOutputName_3_1_1(Integer value) {
		this.OutputName_3_1_1 = value;
	}

	public void setOutputName_3_1_4(Integer value) {
		this.OutputName_3_1_4 = value;
	}

	public void setOutputName_3_1_5(Float value) {
		this.OutputName_3_1_5 = value;
	}

	public void setOutputName_3_1_2(String value) {
		this.OutputName_3_1_2 = value;
	}

	public void setOutputName_3_1_3(String value) {
		this.OutputName_3_1_3 = value;
	}

}
