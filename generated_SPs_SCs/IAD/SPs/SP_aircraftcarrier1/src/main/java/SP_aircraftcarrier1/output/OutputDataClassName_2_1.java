package SP_aircraftcarrier1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_2_1")
@XmlType(name = "outputDataClassName_2_1", propOrder = { "OutputName_2_1_7",
		"OutputName_2_1_8", "OutputName_2_1_3", "OutputName_2_1_4",
		"OutputName_2_1_5", "OutputName_2_1_6", "OutputName_2_1_1",
		"OutputName_2_1_2" })
public class OutputDataClassName_2_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_2_1_7")
	protected Integer OutputName_2_1_7;
	@XmlElement(name = "OutputName_2_1_8")
	protected Integer OutputName_2_1_8;
	@XmlElement(name = "OutputName_2_1_3")
	protected String OutputName_2_1_3;
	@XmlElement(name = "OutputName_2_1_4")
	protected Float OutputName_2_1_4;
	@XmlElement(name = "OutputName_2_1_5")
	protected Float OutputName_2_1_5;
	@XmlElement(name = "OutputName_2_1_6")
	protected Float OutputName_2_1_6;
	@XmlElement(name = "OutputName_2_1_1")
	protected String OutputName_2_1_1;
	@XmlElement(name = "OutputName_2_1_2")
	protected String OutputName_2_1_2;

	public Integer getOutputName_2_1_7() {
		return OutputName_2_1_7;
	}

	public Integer getOutputName_2_1_8() {
		return OutputName_2_1_8;
	}

	public String getOutputName_2_1_3() {
		return OutputName_2_1_3;
	}

	public Float getOutputName_2_1_4() {
		return OutputName_2_1_4;
	}

	public Float getOutputName_2_1_5() {
		return OutputName_2_1_5;
	}

	public Float getOutputName_2_1_6() {
		return OutputName_2_1_6;
	}

	public String getOutputName_2_1_1() {
		return OutputName_2_1_1;
	}

	public String getOutputName_2_1_2() {
		return OutputName_2_1_2;
	}

	public void setOutputName_2_1_7(Integer value) {
		this.OutputName_2_1_7 = value;
	}

	public void setOutputName_2_1_8(Integer value) {
		this.OutputName_2_1_8 = value;
	}

	public void setOutputName_2_1_3(String value) {
		this.OutputName_2_1_3 = value;
	}

	public void setOutputName_2_1_4(Float value) {
		this.OutputName_2_1_4 = value;
	}

	public void setOutputName_2_1_5(Float value) {
		this.OutputName_2_1_5 = value;
	}

	public void setOutputName_2_1_6(Float value) {
		this.OutputName_2_1_6 = value;
	}

	public void setOutputName_2_1_1(String value) {
		this.OutputName_2_1_1 = value;
	}

	public void setOutputName_2_1_2(String value) {
		this.OutputName_2_1_2 = value;
	}

}
