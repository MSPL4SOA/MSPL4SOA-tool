package SP_drone2.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_1")
@XmlType(name = "outputDataClassName_1_1", propOrder = { "OutputName_1_1_4",
		"OutputName_1_1_5", "OutputName_1_1_2", "OutputName_1_1_3",
		"OutputName_1_1_1" })
public class OutputDataClassName_1_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_1_4")
	protected Float OutputName_1_1_4;
	@XmlElement(name = "OutputName_1_1_5")
	protected Integer OutputName_1_1_5;
	@XmlElement(name = "OutputName_1_1_2")
	protected Integer OutputName_1_1_2;
	@XmlElement(name = "OutputName_1_1_3")
	protected String OutputName_1_1_3;
	@XmlElement(name = "OutputName_1_1_1")
	protected String OutputName_1_1_1;

	public Float getOutputName_1_1_4() {
		return OutputName_1_1_4;
	}

	public Integer getOutputName_1_1_5() {
		return OutputName_1_1_5;
	}

	public Integer getOutputName_1_1_2() {
		return OutputName_1_1_2;
	}

	public String getOutputName_1_1_3() {
		return OutputName_1_1_3;
	}

	public String getOutputName_1_1_1() {
		return OutputName_1_1_1;
	}

	public void setOutputName_1_1_4(Float value) {
		this.OutputName_1_1_4 = value;
	}

	public void setOutputName_1_1_5(Integer value) {
		this.OutputName_1_1_5 = value;
	}

	public void setOutputName_1_1_2(Integer value) {
		this.OutputName_1_1_2 = value;
	}

	public void setOutputName_1_1_3(String value) {
		this.OutputName_1_1_3 = value;
	}

	public void setOutputName_1_1_1(String value) {
		this.OutputName_1_1_1 = value;
	}

}
