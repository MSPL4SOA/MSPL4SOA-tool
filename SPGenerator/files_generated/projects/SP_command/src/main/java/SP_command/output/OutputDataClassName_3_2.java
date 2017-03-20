package SP_command.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_3_2")
@XmlType(name = "outputDataClassName_3_2", propOrder = { "OutputName_3_2_3",
		"OutputName_3_2_4", "OutputName_3_2_1", "OutputName_3_2_2" })
public class OutputDataClassName_3_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_3_2_3")
	protected Integer OutputName_3_2_3;
	@XmlElement(name = "OutputName_3_2_4")
	protected String OutputName_3_2_4;
	@XmlElement(name = "OutputName_3_2_1")
	protected String OutputName_3_2_1;
	@XmlElement(name = "OutputName_3_2_2")
	protected String OutputName_3_2_2;

	public Integer getOutputName_3_2_3() {
		return OutputName_3_2_3;
	}

	public String getOutputName_3_2_4() {
		return OutputName_3_2_4;
	}

	public String getOutputName_3_2_1() {
		return OutputName_3_2_1;
	}

	public String getOutputName_3_2_2() {
		return OutputName_3_2_2;
	}

	public void setOutputName_3_2_3(Integer value) {
		this.OutputName_3_2_3 = value;
	}

	public void setOutputName_3_2_4(String value) {
		this.OutputName_3_2_4 = value;
	}

	public void setOutputName_3_2_1(String value) {
		this.OutputName_3_2_1 = value;
	}

	public void setOutputName_3_2_2(String value) {
		this.OutputName_3_2_2 = value;
	}

}
