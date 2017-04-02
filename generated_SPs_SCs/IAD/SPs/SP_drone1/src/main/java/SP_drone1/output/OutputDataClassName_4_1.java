package SP_drone1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_1")
@XmlType(name = "outputDataClassName_4_1", propOrder = { "OutputName_4_1_1",
		"OutputName_4_1_2" })
public class OutputDataClassName_4_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_1_1")
	protected Float OutputName_4_1_1;
	@XmlElement(name = "OutputName_4_1_2")
	protected Float OutputName_4_1_2;

	public Float getOutputName_4_1_1() {
		return OutputName_4_1_1;
	}

	public Float getOutputName_4_1_2() {
		return OutputName_4_1_2;
	}

	public void setOutputName_4_1_1(Float value) {
		this.OutputName_4_1_1 = value;
	}

	public void setOutputName_4_1_2(Float value) {
		this.OutputName_4_1_2 = value;
	}

}
