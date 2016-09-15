package large2.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_2_6")
@XmlType(name = "outputDataClassName_2_6", propOrder = { "OutputName_2_6_2",
		"OutputName_2_6_3", "OutputName_2_6_4", "OutputName_2_6_5",
		"OutputName_2_6_1" })
public class OutputDataClassName_2_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_2_6_2")
	protected Integer OutputName_2_6_2;
	@XmlElement(name = "OutputName_2_6_3")
	protected Float OutputName_2_6_3;
	@XmlElement(name = "OutputName_2_6_4")
	protected Float OutputName_2_6_4;
	@XmlElement(name = "OutputName_2_6_5")
	protected String OutputName_2_6_5;
	@XmlElement(name = "OutputName_2_6_1")
	protected Float OutputName_2_6_1;

	public Integer getOutputName_2_6_2() {
		return OutputName_2_6_2;
	}

	public Float getOutputName_2_6_3() {
		return OutputName_2_6_3;
	}

	public Float getOutputName_2_6_4() {
		return OutputName_2_6_4;
	}

	public String getOutputName_2_6_5() {
		return OutputName_2_6_5;
	}

	public Float getOutputName_2_6_1() {
		return OutputName_2_6_1;
	}

	public void setOutputName_2_6_2(Integer value) {
		this.OutputName_2_6_2 = value;
	}

	public void setOutputName_2_6_3(Float value) {
		this.OutputName_2_6_3 = value;
	}

	public void setOutputName_2_6_4(Float value) {
		this.OutputName_2_6_4 = value;
	}

	public void setOutputName_2_6_5(String value) {
		this.OutputName_2_6_5 = value;
	}

	public void setOutputName_2_6_1(Float value) {
		this.OutputName_2_6_1 = value;
	}

}