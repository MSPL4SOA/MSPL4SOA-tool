package SP_command.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_1")
public class OutputDataClassName_4_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_1_5")
	protected String OutputName_4_1_5;
	@XmlElement(name = "OutputName_4_1_6")
	protected String OutputName_4_1_6;
	@XmlElement(name = "OutputName_4_1_7")
	protected String OutputName_4_1_7;
	@XmlElement(name = "OutputName_4_1_1")
	protected Integer OutputName_4_1_1;
	@XmlElement(name = "OutputName_4_1_2")
	protected Integer OutputName_4_1_2;
	@XmlElement(name = "OutputName_4_1_3")
	protected String OutputName_4_1_3;
	@XmlElement(name = "OutputName_4_1_4")
	protected Float OutputName_4_1_4;

	public String getOutputName_4_1_5() {
		return OutputName_4_1_5;
	}

	public String getOutputName_4_1_6() {
		return OutputName_4_1_6;
	}

	public String getOutputName_4_1_7() {
		return OutputName_4_1_7;
	}

	public Integer getOutputName_4_1_1() {
		return OutputName_4_1_1;
	}

	public Integer getOutputName_4_1_2() {
		return OutputName_4_1_2;
	}

	public String getOutputName_4_1_3() {
		return OutputName_4_1_3;
	}

	public Float getOutputName_4_1_4() {
		return OutputName_4_1_4;
	}

	public void setOutputName_4_1_5(String value) {
		this.OutputName_4_1_5 = value;
	}

	public void setOutputName_4_1_6(String value) {
		this.OutputName_4_1_6 = value;
	}

	public void setOutputName_4_1_7(String value) {
		this.OutputName_4_1_7 = value;
	}

	public void setOutputName_4_1_1(Integer value) {
		this.OutputName_4_1_1 = value;
	}

	public void setOutputName_4_1_2(Integer value) {
		this.OutputName_4_1_2 = value;
	}

	public void setOutputName_4_1_3(String value) {
		this.OutputName_4_1_3 = value;
	}

	public void setOutputName_4_1_4(Float value) {
		this.OutputName_4_1_4 = value;
	}

}
