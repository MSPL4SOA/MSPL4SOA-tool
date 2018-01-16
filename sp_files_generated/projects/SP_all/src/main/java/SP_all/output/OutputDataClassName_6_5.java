package SP_all.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_5")
@XmlType(name = "outputDataClassName_6_5", propOrder = { "OutputName_6_5_4",
		"OutputName_6_5_3", "OutputName_6_5_5", "OutputName_6_5_2",
		"OutputName_6_5_1" })
public class OutputDataClassName_6_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_5_4")
	protected Integer OutputName_6_5_4;
	@XmlElement(name = "OutputName_6_5_3")
	protected Float OutputName_6_5_3;
	@XmlElement(name = "OutputName_6_5_5")
	protected Float OutputName_6_5_5;
	@XmlElement(name = "OutputName_6_5_2")
	protected Float OutputName_6_5_2;
	@XmlElement(name = "OutputName_6_5_1")
	protected String OutputName_6_5_1;

	public Integer getOutputName_6_5_4() {
		return OutputName_6_5_4;
	}

	public Float getOutputName_6_5_3() {
		return OutputName_6_5_3;
	}

	public Float getOutputName_6_5_5() {
		return OutputName_6_5_5;
	}

	public Float getOutputName_6_5_2() {
		return OutputName_6_5_2;
	}

	public String getOutputName_6_5_1() {
		return OutputName_6_5_1;
	}

	public void setOutputName_6_5_4(Integer value) {
		this.OutputName_6_5_4 = value;
	}

	public void setOutputName_6_5_3(Float value) {
		this.OutputName_6_5_3 = value;
	}

	public void setOutputName_6_5_5(Float value) {
		this.OutputName_6_5_5 = value;
	}

	public void setOutputName_6_5_2(Float value) {
		this.OutputName_6_5_2 = value;
	}

	public void setOutputName_6_5_1(String value) {
		this.OutputName_6_5_1 = value;
	}

}
