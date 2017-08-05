package SP_command.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_2")
@XmlType(name = "outputDataClassName_5_2", propOrder = { "OutputName_5_2_1",
		"OutputName_5_2_2", "OutputName_5_2_9", "OutputName_5_2_7",
		"OutputName_5_2_8", "OutputName_5_2_5", "OutputName_5_2_6",
		"OutputName_5_2_3", "OutputName_5_2_4" })
public class OutputDataClassName_5_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_2_1")
	protected Integer OutputName_5_2_1;
	@XmlElement(name = "OutputName_5_2_2")
	protected String OutputName_5_2_2;
	@XmlElement(name = "OutputName_5_2_9")
	protected Float OutputName_5_2_9;
	@XmlElement(name = "OutputName_5_2_7")
	protected Integer OutputName_5_2_7;
	@XmlElement(name = "OutputName_5_2_8")
	protected Float OutputName_5_2_8;
	@XmlElement(name = "OutputName_5_2_5")
	protected String OutputName_5_2_5;
	@XmlElement(name = "OutputName_5_2_6")
	protected Float OutputName_5_2_6;
	@XmlElement(name = "OutputName_5_2_3")
	protected Float OutputName_5_2_3;
	@XmlElement(name = "OutputName_5_2_4")
	protected Float OutputName_5_2_4;

	public Integer getOutputName_5_2_1() {
		return OutputName_5_2_1;
	}

	public String getOutputName_5_2_2() {
		return OutputName_5_2_2;
	}

	public Float getOutputName_5_2_9() {
		return OutputName_5_2_9;
	}

	public Integer getOutputName_5_2_7() {
		return OutputName_5_2_7;
	}

	public Float getOutputName_5_2_8() {
		return OutputName_5_2_8;
	}

	public String getOutputName_5_2_5() {
		return OutputName_5_2_5;
	}

	public Float getOutputName_5_2_6() {
		return OutputName_5_2_6;
	}

	public Float getOutputName_5_2_3() {
		return OutputName_5_2_3;
	}

	public Float getOutputName_5_2_4() {
		return OutputName_5_2_4;
	}

	public void setOutputName_5_2_1(Integer value) {
		this.OutputName_5_2_1 = value;
	}

	public void setOutputName_5_2_2(String value) {
		this.OutputName_5_2_2 = value;
	}

	public void setOutputName_5_2_9(Float value) {
		this.OutputName_5_2_9 = value;
	}

	public void setOutputName_5_2_7(Integer value) {
		this.OutputName_5_2_7 = value;
	}

	public void setOutputName_5_2_8(Float value) {
		this.OutputName_5_2_8 = value;
	}

	public void setOutputName_5_2_5(String value) {
		this.OutputName_5_2_5 = value;
	}

	public void setOutputName_5_2_6(Float value) {
		this.OutputName_5_2_6 = value;
	}

	public void setOutputName_5_2_3(Float value) {
		this.OutputName_5_2_3 = value;
	}

	public void setOutputName_5_2_4(Float value) {
		this.OutputName_5_2_4 = value;
	}

}
