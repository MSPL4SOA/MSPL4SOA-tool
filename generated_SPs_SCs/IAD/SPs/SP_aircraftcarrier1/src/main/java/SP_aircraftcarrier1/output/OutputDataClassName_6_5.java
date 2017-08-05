package SP_aircraftcarrier1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_5")
@XmlType(name = "outputDataClassName_6_5", propOrder = { "OutputName_6_5_4",
		"OutputName_6_5_3", "OutputName_6_5_6", "OutputName_6_5_5",
		"OutputName_6_5_2", "OutputName_6_5_1", "OutputName_6_5_7" })
public class OutputDataClassName_6_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_5_4")
	protected Float OutputName_6_5_4;
	@XmlElement(name = "OutputName_6_5_3")
	protected Float OutputName_6_5_3;
	@XmlElement(name = "OutputName_6_5_6")
	protected String OutputName_6_5_6;
	@XmlElement(name = "OutputName_6_5_5")
	protected Float OutputName_6_5_5;
	@XmlElement(name = "OutputName_6_5_2")
	protected String OutputName_6_5_2;
	@XmlElement(name = "OutputName_6_5_1")
	protected Float OutputName_6_5_1;
	@XmlElement(name = "OutputName_6_5_7")
	protected String OutputName_6_5_7;

	public Float getOutputName_6_5_4() {
		return OutputName_6_5_4;
	}

	public Float getOutputName_6_5_3() {
		return OutputName_6_5_3;
	}

	public String getOutputName_6_5_6() {
		return OutputName_6_5_6;
	}

	public Float getOutputName_6_5_5() {
		return OutputName_6_5_5;
	}

	public String getOutputName_6_5_2() {
		return OutputName_6_5_2;
	}

	public Float getOutputName_6_5_1() {
		return OutputName_6_5_1;
	}

	public String getOutputName_6_5_7() {
		return OutputName_6_5_7;
	}

	public void setOutputName_6_5_4(Float value) {
		this.OutputName_6_5_4 = value;
	}

	public void setOutputName_6_5_3(Float value) {
		this.OutputName_6_5_3 = value;
	}

	public void setOutputName_6_5_6(String value) {
		this.OutputName_6_5_6 = value;
	}

	public void setOutputName_6_5_5(Float value) {
		this.OutputName_6_5_5 = value;
	}

	public void setOutputName_6_5_2(String value) {
		this.OutputName_6_5_2 = value;
	}

	public void setOutputName_6_5_1(Float value) {
		this.OutputName_6_5_1 = value;
	}

	public void setOutputName_6_5_7(String value) {
		this.OutputName_6_5_7 = value;
	}

}
