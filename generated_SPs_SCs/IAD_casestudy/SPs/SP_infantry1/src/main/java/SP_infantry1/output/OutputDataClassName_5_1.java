package SP_infantry1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_1")
@XmlType(name = "outputDataClassName_5_1", propOrder = { "OutputName_5_1_2",
		"OutputName_5_1_3", "OutputName_5_1_1", "OutputName_5_1_8",
		"OutputName_5_1_6", "OutputName_5_1_7", "OutputName_5_1_4",
		"OutputName_5_1_5" })
public class OutputDataClassName_5_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_1_2")
	protected String OutputName_5_1_2;
	@XmlElement(name = "OutputName_5_1_3")
	protected Integer OutputName_5_1_3;
	@XmlElement(name = "OutputName_5_1_1")
	protected Float OutputName_5_1_1;
	@XmlElement(name = "OutputName_5_1_8")
	protected Float OutputName_5_1_8;
	@XmlElement(name = "OutputName_5_1_6")
	protected Float OutputName_5_1_6;
	@XmlElement(name = "OutputName_5_1_7")
	protected String OutputName_5_1_7;
	@XmlElement(name = "OutputName_5_1_4")
	protected String OutputName_5_1_4;
	@XmlElement(name = "OutputName_5_1_5")
	protected String OutputName_5_1_5;

	public String getOutputName_5_1_2() {
		return OutputName_5_1_2;
	}

	public Integer getOutputName_5_1_3() {
		return OutputName_5_1_3;
	}

	public Float getOutputName_5_1_1() {
		return OutputName_5_1_1;
	}

	public Float getOutputName_5_1_8() {
		return OutputName_5_1_8;
	}

	public Float getOutputName_5_1_6() {
		return OutputName_5_1_6;
	}

	public String getOutputName_5_1_7() {
		return OutputName_5_1_7;
	}

	public String getOutputName_5_1_4() {
		return OutputName_5_1_4;
	}

	public String getOutputName_5_1_5() {
		return OutputName_5_1_5;
	}

	public void setOutputName_5_1_2(String value) {
		this.OutputName_5_1_2 = value;
	}

	public void setOutputName_5_1_3(Integer value) {
		this.OutputName_5_1_3 = value;
	}

	public void setOutputName_5_1_1(Float value) {
		this.OutputName_5_1_1 = value;
	}

	public void setOutputName_5_1_8(Float value) {
		this.OutputName_5_1_8 = value;
	}

	public void setOutputName_5_1_6(Float value) {
		this.OutputName_5_1_6 = value;
	}

	public void setOutputName_5_1_7(String value) {
		this.OutputName_5_1_7 = value;
	}

	public void setOutputName_5_1_4(String value) {
		this.OutputName_5_1_4 = value;
	}

	public void setOutputName_5_1_5(String value) {
		this.OutputName_5_1_5 = value;
	}

}
