package sync8.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_6")
@XmlType(name = "outputDataClassName_1_6", propOrder = { "OutputName_1_6_5",
		"OutputName_1_6_3", "OutputName_1_6_4", "OutputName_1_6_1",
		"OutputName_1_6_2" })
public class OutputDataClassName_1_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_6_5")
	protected Integer OutputName_1_6_5;
	@XmlElement(name = "OutputName_1_6_3")
	protected Float OutputName_1_6_3;
	@XmlElement(name = "OutputName_1_6_4")
	protected Float OutputName_1_6_4;
	@XmlElement(name = "OutputName_1_6_1")
	protected Float OutputName_1_6_1;
	@XmlElement(name = "OutputName_1_6_2")
	protected Float OutputName_1_6_2;

	public Integer getOutputName_1_6_5() {
		return OutputName_1_6_5;
	}

	public Float getOutputName_1_6_3() {
		return OutputName_1_6_3;
	}

	public Float getOutputName_1_6_4() {
		return OutputName_1_6_4;
	}

	public Float getOutputName_1_6_1() {
		return OutputName_1_6_1;
	}

	public Float getOutputName_1_6_2() {
		return OutputName_1_6_2;
	}

	public void setOutputName_1_6_5(Integer value) {
		this.OutputName_1_6_5 = value;
	}

	public void setOutputName_1_6_3(Float value) {
		this.OutputName_1_6_3 = value;
	}

	public void setOutputName_1_6_4(Float value) {
		this.OutputName_1_6_4 = value;
	}

	public void setOutputName_1_6_1(Float value) {
		this.OutputName_1_6_1 = value;
	}

	public void setOutputName_1_6_2(Float value) {
		this.OutputName_1_6_2 = value;
	}

}
