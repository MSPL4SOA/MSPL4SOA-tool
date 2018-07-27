package SP_command.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_5")
@XmlType(name = "outputDataClassName_5_5", propOrder = { "OutputName_5_5_2",
		"OutputName_5_5_1" })
public class OutputDataClassName_5_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_5_2")
	protected String OutputName_5_5_2;
	@XmlElement(name = "OutputName_5_5_1")
	protected Float OutputName_5_5_1;

	public String getOutputName_5_5_2() {
		return OutputName_5_5_2;
	}

	public Float getOutputName_5_5_1() {
		return OutputName_5_5_1;
	}

	public void setOutputName_5_5_2(String value) {
		this.OutputName_5_5_2 = value;
	}

	public void setOutputName_5_5_1(Float value) {
		this.OutputName_5_5_1 = value;
	}

}
