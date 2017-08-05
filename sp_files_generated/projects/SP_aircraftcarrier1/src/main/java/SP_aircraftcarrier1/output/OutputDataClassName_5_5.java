package SP_aircraftcarrier1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_5")
@XmlType(name = "outputDataClassName_5_5", propOrder = { "OutputName_5_5_8",
		"OutputName_5_5_6", "OutputName_5_5_7", "OutputName_5_5_4",
		"OutputName_5_5_5", "OutputName_5_5_2", "OutputName_5_5_3",
		"OutputName_5_5_1" })
public class OutputDataClassName_5_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_5_8")
	protected Float OutputName_5_5_8;
	@XmlElement(name = "OutputName_5_5_6")
	protected Float OutputName_5_5_6;
	@XmlElement(name = "OutputName_5_5_7")
	protected Float OutputName_5_5_7;
	@XmlElement(name = "OutputName_5_5_4")
	protected Integer OutputName_5_5_4;
	@XmlElement(name = "OutputName_5_5_5")
	protected String OutputName_5_5_5;
	@XmlElement(name = "OutputName_5_5_2")
	protected String OutputName_5_5_2;
	@XmlElement(name = "OutputName_5_5_3")
	protected Float OutputName_5_5_3;
	@XmlElement(name = "OutputName_5_5_1")
	protected String OutputName_5_5_1;

	public Float getOutputName_5_5_8() {
		return OutputName_5_5_8;
	}

	public Float getOutputName_5_5_6() {
		return OutputName_5_5_6;
	}

	public Float getOutputName_5_5_7() {
		return OutputName_5_5_7;
	}

	public Integer getOutputName_5_5_4() {
		return OutputName_5_5_4;
	}

	public String getOutputName_5_5_5() {
		return OutputName_5_5_5;
	}

	public String getOutputName_5_5_2() {
		return OutputName_5_5_2;
	}

	public Float getOutputName_5_5_3() {
		return OutputName_5_5_3;
	}

	public String getOutputName_5_5_1() {
		return OutputName_5_5_1;
	}

	public void setOutputName_5_5_8(Float value) {
		this.OutputName_5_5_8 = value;
	}

	public void setOutputName_5_5_6(Float value) {
		this.OutputName_5_5_6 = value;
	}

	public void setOutputName_5_5_7(Float value) {
		this.OutputName_5_5_7 = value;
	}

	public void setOutputName_5_5_4(Integer value) {
		this.OutputName_5_5_4 = value;
	}

	public void setOutputName_5_5_5(String value) {
		this.OutputName_5_5_5 = value;
	}

	public void setOutputName_5_5_2(String value) {
		this.OutputName_5_5_2 = value;
	}

	public void setOutputName_5_5_3(Float value) {
		this.OutputName_5_5_3 = value;
	}

	public void setOutputName_5_5_1(String value) {
		this.OutputName_5_5_1 = value;
	}

}
