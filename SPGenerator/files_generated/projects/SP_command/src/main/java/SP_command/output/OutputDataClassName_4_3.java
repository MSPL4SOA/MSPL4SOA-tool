package SP_command.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_3")
@XmlType(name = "outputDataClassName_4_3", propOrder = { "OutputName_4_3_3",
		"OutputName_4_3_4", "OutputName_4_3_5", "OutputName_4_3_1",
		"OutputName_4_3_2" })
public class OutputDataClassName_4_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_3_3")
	protected Integer OutputName_4_3_3;
	@XmlElement(name = "OutputName_4_3_4")
	protected Float OutputName_4_3_4;
	@XmlElement(name = "OutputName_4_3_5")
	protected Float OutputName_4_3_5;
	@XmlElement(name = "OutputName_4_3_1")
	protected Float OutputName_4_3_1;
	@XmlElement(name = "OutputName_4_3_2")
	protected String OutputName_4_3_2;

	public Integer getOutputName_4_3_3() {
		return OutputName_4_3_3;
	}

	public Float getOutputName_4_3_4() {
		return OutputName_4_3_4;
	}

	public Float getOutputName_4_3_5() {
		return OutputName_4_3_5;
	}

	public Float getOutputName_4_3_1() {
		return OutputName_4_3_1;
	}

	public String getOutputName_4_3_2() {
		return OutputName_4_3_2;
	}

	public void setOutputName_4_3_3(Integer value) {
		this.OutputName_4_3_3 = value;
	}

	public void setOutputName_4_3_4(Float value) {
		this.OutputName_4_3_4 = value;
	}

	public void setOutputName_4_3_5(Float value) {
		this.OutputName_4_3_5 = value;
	}

	public void setOutputName_4_3_1(Float value) {
		this.OutputName_4_3_1 = value;
	}

	public void setOutputName_4_3_2(String value) {
		this.OutputName_4_3_2 = value;
	}

}
