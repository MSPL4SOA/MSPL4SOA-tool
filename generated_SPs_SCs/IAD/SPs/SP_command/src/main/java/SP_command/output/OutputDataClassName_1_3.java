package SP_command.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_3")
@XmlType(name = "outputDataClassName_1_3", propOrder = { "OutputName_1_3_8",
		"OutputName_1_3_9", "OutputName_1_3_6", "OutputName_1_3_7",
		"OutputName_1_3_4", "OutputName_1_3_5", "OutputName_1_3_2",
		"OutputName_1_3_3", "OutputName_1_3_1" })
public class OutputDataClassName_1_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_3_8")
	protected String OutputName_1_3_8;
	@XmlElement(name = "OutputName_1_3_9")
	protected Float OutputName_1_3_9;
	@XmlElement(name = "OutputName_1_3_6")
	protected String OutputName_1_3_6;
	@XmlElement(name = "OutputName_1_3_7")
	protected Integer OutputName_1_3_7;
	@XmlElement(name = "OutputName_1_3_4")
	protected Float OutputName_1_3_4;
	@XmlElement(name = "OutputName_1_3_5")
	protected Integer OutputName_1_3_5;
	@XmlElement(name = "OutputName_1_3_2")
	protected Float OutputName_1_3_2;
	@XmlElement(name = "OutputName_1_3_3")
	protected String OutputName_1_3_3;
	@XmlElement(name = "OutputName_1_3_1")
	protected Integer OutputName_1_3_1;

	public String getOutputName_1_3_8() {
		return OutputName_1_3_8;
	}

	public Float getOutputName_1_3_9() {
		return OutputName_1_3_9;
	}

	public String getOutputName_1_3_6() {
		return OutputName_1_3_6;
	}

	public Integer getOutputName_1_3_7() {
		return OutputName_1_3_7;
	}

	public Float getOutputName_1_3_4() {
		return OutputName_1_3_4;
	}

	public Integer getOutputName_1_3_5() {
		return OutputName_1_3_5;
	}

	public Float getOutputName_1_3_2() {
		return OutputName_1_3_2;
	}

	public String getOutputName_1_3_3() {
		return OutputName_1_3_3;
	}

	public Integer getOutputName_1_3_1() {
		return OutputName_1_3_1;
	}

	public void setOutputName_1_3_8(String value) {
		this.OutputName_1_3_8 = value;
	}

	public void setOutputName_1_3_9(Float value) {
		this.OutputName_1_3_9 = value;
	}

	public void setOutputName_1_3_6(String value) {
		this.OutputName_1_3_6 = value;
	}

	public void setOutputName_1_3_7(Integer value) {
		this.OutputName_1_3_7 = value;
	}

	public void setOutputName_1_3_4(Float value) {
		this.OutputName_1_3_4 = value;
	}

	public void setOutputName_1_3_5(Integer value) {
		this.OutputName_1_3_5 = value;
	}

	public void setOutputName_1_3_2(Float value) {
		this.OutputName_1_3_2 = value;
	}

	public void setOutputName_1_3_3(String value) {
		this.OutputName_1_3_3 = value;
	}

	public void setOutputName_1_3_1(Integer value) {
		this.OutputName_1_3_1 = value;
	}

}
