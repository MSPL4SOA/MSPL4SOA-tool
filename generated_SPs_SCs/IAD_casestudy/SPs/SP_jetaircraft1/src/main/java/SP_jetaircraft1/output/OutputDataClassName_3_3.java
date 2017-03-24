package SP_jetaircraft1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_3_3")
@XmlType(name = "outputDataClassName_3_3", propOrder = { "OutputName_3_3_6",
		"OutputName_3_3_4", "OutputName_3_3_5", "OutputName_3_3_2",
		"OutputName_3_3_3", "OutputName_3_3_1" })
public class OutputDataClassName_3_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_3_3_6")
	protected Float OutputName_3_3_6;
	@XmlElement(name = "OutputName_3_3_4")
	protected String OutputName_3_3_4;
	@XmlElement(name = "OutputName_3_3_5")
	protected Float OutputName_3_3_5;
	@XmlElement(name = "OutputName_3_3_2")
	protected Float OutputName_3_3_2;
	@XmlElement(name = "OutputName_3_3_3")
	protected Float OutputName_3_3_3;
	@XmlElement(name = "OutputName_3_3_1")
	protected String OutputName_3_3_1;

	public Float getOutputName_3_3_6() {
		return OutputName_3_3_6;
	}

	public String getOutputName_3_3_4() {
		return OutputName_3_3_4;
	}

	public Float getOutputName_3_3_5() {
		return OutputName_3_3_5;
	}

	public Float getOutputName_3_3_2() {
		return OutputName_3_3_2;
	}

	public Float getOutputName_3_3_3() {
		return OutputName_3_3_3;
	}

	public String getOutputName_3_3_1() {
		return OutputName_3_3_1;
	}

	public void setOutputName_3_3_6(Float value) {
		this.OutputName_3_3_6 = value;
	}

	public void setOutputName_3_3_4(String value) {
		this.OutputName_3_3_4 = value;
	}

	public void setOutputName_3_3_5(Float value) {
		this.OutputName_3_3_5 = value;
	}

	public void setOutputName_3_3_2(Float value) {
		this.OutputName_3_3_2 = value;
	}

	public void setOutputName_3_3_3(Float value) {
		this.OutputName_3_3_3 = value;
	}

	public void setOutputName_3_3_1(String value) {
		this.OutputName_3_3_1 = value;
	}

}
