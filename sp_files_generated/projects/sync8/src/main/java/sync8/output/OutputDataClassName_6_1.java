package sync8.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_1")
@XmlType(name = "outputDataClassName_6_1", propOrder = { "OutputName_6_1_1",
		"OutputName_6_1_2", "OutputName_6_1_3", "OutputName_6_1_4",
		"OutputName_6_1_5" })
public class OutputDataClassName_6_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_1_1")
	protected String OutputName_6_1_1;
	@XmlElement(name = "OutputName_6_1_2")
	protected Integer OutputName_6_1_2;
	@XmlElement(name = "OutputName_6_1_3")
	protected String OutputName_6_1_3;
	@XmlElement(name = "OutputName_6_1_4")
	protected Float OutputName_6_1_4;
	@XmlElement(name = "OutputName_6_1_5")
	protected String OutputName_6_1_5;

	public String getOutputName_6_1_1() {
		return OutputName_6_1_1;
	}

	public Integer getOutputName_6_1_2() {
		return OutputName_6_1_2;
	}

	public String getOutputName_6_1_3() {
		return OutputName_6_1_3;
	}

	public Float getOutputName_6_1_4() {
		return OutputName_6_1_4;
	}

	public String getOutputName_6_1_5() {
		return OutputName_6_1_5;
	}

	public void setOutputName_6_1_1(String value) {
		this.OutputName_6_1_1 = value;
	}

	public void setOutputName_6_1_2(Integer value) {
		this.OutputName_6_1_2 = value;
	}

	public void setOutputName_6_1_3(String value) {
		this.OutputName_6_1_3 = value;
	}

	public void setOutputName_6_1_4(Float value) {
		this.OutputName_6_1_4 = value;
	}

	public void setOutputName_6_1_5(String value) {
		this.OutputName_6_1_5 = value;
	}

}
