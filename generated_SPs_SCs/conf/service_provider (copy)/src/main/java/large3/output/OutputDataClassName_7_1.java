package large3.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_7_1")
@XmlType(name = "outputDataClassName_7_1", propOrder = { "OutputName_7_1_1",
		"OutputName_7_1_5", "OutputName_7_1_4", "OutputName_7_1_3",
		"OutputName_7_1_2", "OutputName_7_1_8", "OutputName_7_1_7",
		"OutputName_7_1_6" })
public class OutputDataClassName_7_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_7_1_1")
	protected Float OutputName_7_1_1;
	@XmlElement(name = "OutputName_7_1_5")
	protected Integer OutputName_7_1_5;
	@XmlElement(name = "OutputName_7_1_4")
	protected Float OutputName_7_1_4;
	@XmlElement(name = "OutputName_7_1_3")
	protected Float OutputName_7_1_3;
	@XmlElement(name = "OutputName_7_1_2")
	protected Float OutputName_7_1_2;
	@XmlElement(name = "OutputName_7_1_8")
	protected Float OutputName_7_1_8;
	@XmlElement(name = "OutputName_7_1_7")
	protected String OutputName_7_1_7;
	@XmlElement(name = "OutputName_7_1_6")
	protected String OutputName_7_1_6;

	public Float getOutputName_7_1_1() {
		return OutputName_7_1_1;
	}

	public Integer getOutputName_7_1_5() {
		return OutputName_7_1_5;
	}

	public Float getOutputName_7_1_4() {
		return OutputName_7_1_4;
	}

	public Float getOutputName_7_1_3() {
		return OutputName_7_1_3;
	}

	public Float getOutputName_7_1_2() {
		return OutputName_7_1_2;
	}

	public Float getOutputName_7_1_8() {
		return OutputName_7_1_8;
	}

	public String getOutputName_7_1_7() {
		return OutputName_7_1_7;
	}

	public String getOutputName_7_1_6() {
		return OutputName_7_1_6;
	}

	public void setOutputName_7_1_1(Float value) {
		this.OutputName_7_1_1 = value;
	}

	public void setOutputName_7_1_5(Integer value) {
		this.OutputName_7_1_5 = value;
	}

	public void setOutputName_7_1_4(Float value) {
		this.OutputName_7_1_4 = value;
	}

	public void setOutputName_7_1_3(Float value) {
		this.OutputName_7_1_3 = value;
	}

	public void setOutputName_7_1_2(Float value) {
		this.OutputName_7_1_2 = value;
	}

	public void setOutputName_7_1_8(Float value) {
		this.OutputName_7_1_8 = value;
	}

	public void setOutputName_7_1_7(String value) {
		this.OutputName_7_1_7 = value;
	}

	public void setOutputName_7_1_6(String value) {
		this.OutputName_7_1_6 = value;
	}

}
