package SP_command.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_7_3")
@XmlType(name = "outputDataClassName_7_3", propOrder = { "OutputName_7_3_3",
		"OutputName_7_3_2", "OutputName_7_3_1", "OutputName_7_3_4" })
public class OutputDataClassName_7_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_7_3_3")
	protected Float OutputName_7_3_3;
	@XmlElement(name = "OutputName_7_3_2")
	protected Integer OutputName_7_3_2;
	@XmlElement(name = "OutputName_7_3_1")
	protected Integer OutputName_7_3_1;
	@XmlElement(name = "OutputName_7_3_4")
	protected Integer OutputName_7_3_4;

	public Float getOutputName_7_3_3() {
		return OutputName_7_3_3;
	}

	public Integer getOutputName_7_3_2() {
		return OutputName_7_3_2;
	}

	public Integer getOutputName_7_3_1() {
		return OutputName_7_3_1;
	}

	public Integer getOutputName_7_3_4() {
		return OutputName_7_3_4;
	}

	public void setOutputName_7_3_3(Float value) {
		this.OutputName_7_3_3 = value;
	}

	public void setOutputName_7_3_2(Integer value) {
		this.OutputName_7_3_2 = value;
	}

	public void setOutputName_7_3_1(Integer value) {
		this.OutputName_7_3_1 = value;
	}

	public void setOutputName_7_3_4(Integer value) {
		this.OutputName_7_3_4 = value;
	}

}
