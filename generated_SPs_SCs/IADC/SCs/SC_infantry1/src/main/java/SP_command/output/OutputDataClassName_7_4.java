package SP_command.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_7_4")
public class OutputDataClassName_7_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_7_4_2")
	protected Float OutputName_7_4_2;
	@XmlElement(name = "OutputName_7_4_1")
	protected Integer OutputName_7_4_1;
	@XmlElement(name = "OutputName_7_4_6")
	protected Integer OutputName_7_4_6;
	@XmlElement(name = "OutputName_7_4_5")
	protected Integer OutputName_7_4_5;
	@XmlElement(name = "OutputName_7_4_4")
	protected Float OutputName_7_4_4;
	@XmlElement(name = "OutputName_7_4_3")
	protected Float OutputName_7_4_3;

	public Float getOutputName_7_4_2() {
		return OutputName_7_4_2;
	}

	public Integer getOutputName_7_4_1() {
		return OutputName_7_4_1;
	}

	public Integer getOutputName_7_4_6() {
		return OutputName_7_4_6;
	}

	public Integer getOutputName_7_4_5() {
		return OutputName_7_4_5;
	}

	public Float getOutputName_7_4_4() {
		return OutputName_7_4_4;
	}

	public Float getOutputName_7_4_3() {
		return OutputName_7_4_3;
	}

	public void setOutputName_7_4_2(Float value) {
		this.OutputName_7_4_2 = value;
	}

	public void setOutputName_7_4_1(Integer value) {
		this.OutputName_7_4_1 = value;
	}

	public void setOutputName_7_4_6(Integer value) {
		this.OutputName_7_4_6 = value;
	}

	public void setOutputName_7_4_5(Integer value) {
		this.OutputName_7_4_5 = value;
	}

	public void setOutputName_7_4_4(Float value) {
		this.OutputName_7_4_4 = value;
	}

	public void setOutputName_7_4_3(Float value) {
		this.OutputName_7_4_3 = value;
	}

}
