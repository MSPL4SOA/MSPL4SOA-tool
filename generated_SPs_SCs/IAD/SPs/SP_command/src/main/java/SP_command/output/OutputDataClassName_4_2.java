package SP_command.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_2")
@XmlType(name = "outputDataClassName_4_2", propOrder = { "OutputName_4_2_1",
		"OutputName_4_2_2", "OutputName_4_2_3" })
public class OutputDataClassName_4_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_2_1")
	protected String OutputName_4_2_1;
	@XmlElement(name = "OutputName_4_2_2")
	protected Float OutputName_4_2_2;
	@XmlElement(name = "OutputName_4_2_3")
	protected String OutputName_4_2_3;

	public String getOutputName_4_2_1() {
		return OutputName_4_2_1;
	}

	public Float getOutputName_4_2_2() {
		return OutputName_4_2_2;
	}

	public String getOutputName_4_2_3() {
		return OutputName_4_2_3;
	}

	public void setOutputName_4_2_1(String value) {
		this.OutputName_4_2_1 = value;
	}

	public void setOutputName_4_2_2(Float value) {
		this.OutputName_4_2_2 = value;
	}

	public void setOutputName_4_2_3(String value) {
		this.OutputName_4_2_3 = value;
	}

}
