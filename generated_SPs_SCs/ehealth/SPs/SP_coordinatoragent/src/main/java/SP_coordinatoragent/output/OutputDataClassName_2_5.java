package SP_command.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_2_5")
@XmlType(name = "outputDataClassName_2_5", propOrder = { "OutputName_2_5_1",
		"OutputName_2_5_2" })
public class OutputDataClassName_2_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_2_5_1")
	protected Float OutputName_2_5_1;
	@XmlElement(name = "OutputName_2_5_2")
	protected Integer OutputName_2_5_2;

	public Float getOutputName_2_5_1() {
		return OutputName_2_5_1;
	}

	public Integer getOutputName_2_5_2() {
		return OutputName_2_5_2;
	}

	public void setOutputName_2_5_1(Float value) {
		this.OutputName_2_5_1 = value;
	}

	public void setOutputName_2_5_2(Integer value) {
		this.OutputName_2_5_2 = value;
	}

}
