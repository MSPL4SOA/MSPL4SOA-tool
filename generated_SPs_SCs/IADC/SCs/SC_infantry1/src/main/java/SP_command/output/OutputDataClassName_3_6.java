package SP_command.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_3_6")
public class OutputDataClassName_3_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_3_6_3")
	protected Integer OutputName_3_6_3;
	@XmlElement(name = "OutputName_3_6_4")
	protected Float OutputName_3_6_4;
	@XmlElement(name = "OutputName_3_6_1")
	protected Float OutputName_3_6_1;
	@XmlElement(name = "OutputName_3_6_2")
	protected Integer OutputName_3_6_2;
	@XmlElement(name = "OutputName_3_6_7")
	protected Integer OutputName_3_6_7;
	@XmlElement(name = "OutputName_3_6_5")
	protected Float OutputName_3_6_5;
	@XmlElement(name = "OutputName_3_6_6")
	protected String OutputName_3_6_6;

	public Integer getOutputName_3_6_3() {
		return OutputName_3_6_3;
	}

	public Float getOutputName_3_6_4() {
		return OutputName_3_6_4;
	}

	public Float getOutputName_3_6_1() {
		return OutputName_3_6_1;
	}

	public Integer getOutputName_3_6_2() {
		return OutputName_3_6_2;
	}

	public Integer getOutputName_3_6_7() {
		return OutputName_3_6_7;
	}

	public Float getOutputName_3_6_5() {
		return OutputName_3_6_5;
	}

	public String getOutputName_3_6_6() {
		return OutputName_3_6_6;
	}

	public void setOutputName_3_6_3(Integer value) {
		this.OutputName_3_6_3 = value;
	}

	public void setOutputName_3_6_4(Float value) {
		this.OutputName_3_6_4 = value;
	}

	public void setOutputName_3_6_1(Float value) {
		this.OutputName_3_6_1 = value;
	}

	public void setOutputName_3_6_2(Integer value) {
		this.OutputName_3_6_2 = value;
	}

	public void setOutputName_3_6_7(Integer value) {
		this.OutputName_3_6_7 = value;
	}

	public void setOutputName_3_6_5(Float value) {
		this.OutputName_3_6_5 = value;
	}

	public void setOutputName_3_6_6(String value) {
		this.OutputName_3_6_6 = value;
	}

}
