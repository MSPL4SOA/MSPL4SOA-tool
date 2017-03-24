package SP_submarine1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_3")
@XmlType(name = "outputDataClassName_1_3", propOrder = { "OutputName_1_3_4",
		"OutputName_1_3_2", "OutputName_1_3_3", "OutputName_1_3_1" })
public class OutputDataClassName_1_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_3_4")
	protected Integer OutputName_1_3_4;
	@XmlElement(name = "OutputName_1_3_2")
	protected Integer OutputName_1_3_2;
	@XmlElement(name = "OutputName_1_3_3")
	protected Float OutputName_1_3_3;
	@XmlElement(name = "OutputName_1_3_1")
	protected Float OutputName_1_3_1;

	public Integer getOutputName_1_3_4() {
		return OutputName_1_3_4;
	}

	public Integer getOutputName_1_3_2() {
		return OutputName_1_3_2;
	}

	public Float getOutputName_1_3_3() {
		return OutputName_1_3_3;
	}

	public Float getOutputName_1_3_1() {
		return OutputName_1_3_1;
	}

	public void setOutputName_1_3_4(Integer value) {
		this.OutputName_1_3_4 = value;
	}

	public void setOutputName_1_3_2(Integer value) {
		this.OutputName_1_3_2 = value;
	}

	public void setOutputName_1_3_3(Float value) {
		this.OutputName_1_3_3 = value;
	}

	public void setOutputName_1_3_1(Float value) {
		this.OutputName_1_3_1 = value;
	}

}
