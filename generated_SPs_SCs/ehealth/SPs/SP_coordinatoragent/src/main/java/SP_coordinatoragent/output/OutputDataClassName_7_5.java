package SP_command.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_7_5")
@XmlType(name = "outputDataClassName_7_5", propOrder = { "OutputName_7_5_1",
		"OutputName_7_5_5", "OutputName_7_5_4", "OutputName_7_5_3",
		"OutputName_7_5_2" })
public class OutputDataClassName_7_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_7_5_1")
	protected String OutputName_7_5_1;
	@XmlElement(name = "OutputName_7_5_5")
	protected String OutputName_7_5_5;
	@XmlElement(name = "OutputName_7_5_4")
	protected Float OutputName_7_5_4;
	@XmlElement(name = "OutputName_7_5_3")
	protected String OutputName_7_5_3;
	@XmlElement(name = "OutputName_7_5_2")
	protected Integer OutputName_7_5_2;

	public String getOutputName_7_5_1() {
		return OutputName_7_5_1;
	}

	public String getOutputName_7_5_5() {
		return OutputName_7_5_5;
	}

	public Float getOutputName_7_5_4() {
		return OutputName_7_5_4;
	}

	public String getOutputName_7_5_3() {
		return OutputName_7_5_3;
	}

	public Integer getOutputName_7_5_2() {
		return OutputName_7_5_2;
	}

	public void setOutputName_7_5_1(String value) {
		this.OutputName_7_5_1 = value;
	}

	public void setOutputName_7_5_5(String value) {
		this.OutputName_7_5_5 = value;
	}

	public void setOutputName_7_5_4(Float value) {
		this.OutputName_7_5_4 = value;
	}

	public void setOutputName_7_5_3(String value) {
		this.OutputName_7_5_3 = value;
	}

	public void setOutputName_7_5_2(Integer value) {
		this.OutputName_7_5_2 = value;
	}

}
