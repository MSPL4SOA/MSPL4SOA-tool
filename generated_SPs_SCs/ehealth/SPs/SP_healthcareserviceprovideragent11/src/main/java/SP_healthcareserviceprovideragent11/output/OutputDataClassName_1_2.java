package SP_submarine1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_2")
@XmlType(name = "outputDataClassName_1_2", propOrder = { "OutputName_1_2_3",
		"OutputName_1_2_1", "OutputName_1_2_2" })
public class OutputDataClassName_1_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_2_3")
	protected Float OutputName_1_2_3;
	@XmlElement(name = "OutputName_1_2_1")
	protected Float OutputName_1_2_1;
	@XmlElement(name = "OutputName_1_2_2")
	protected Integer OutputName_1_2_2;

	public Float getOutputName_1_2_3() {
		return OutputName_1_2_3;
	}

	public Float getOutputName_1_2_1() {
		return OutputName_1_2_1;
	}

	public Integer getOutputName_1_2_2() {
		return OutputName_1_2_2;
	}

	public void setOutputName_1_2_3(Float value) {
		this.OutputName_1_2_3 = value;
	}

	public void setOutputName_1_2_1(Float value) {
		this.OutputName_1_2_1 = value;
	}

	public void setOutputName_1_2_2(Integer value) {
		this.OutputName_1_2_2 = value;
	}

}
