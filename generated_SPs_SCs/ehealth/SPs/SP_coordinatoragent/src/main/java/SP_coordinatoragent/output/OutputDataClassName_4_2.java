package SP_command.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_2")
@XmlType(name = "outputDataClassName_4_2", propOrder = { "OutputName_4_2_4",
		"OutputName_4_2_5", "OutputName_4_2_6", "OutputName_4_2_1",
		"OutputName_4_2_2", "OutputName_4_2_3" })
public class OutputDataClassName_4_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_2_4")
	protected Integer OutputName_4_2_4;
	@XmlElement(name = "OutputName_4_2_5")
	protected Integer OutputName_4_2_5;
	@XmlElement(name = "OutputName_4_2_6")
	protected Float OutputName_4_2_6;
	@XmlElement(name = "OutputName_4_2_1")
	protected String OutputName_4_2_1;
	@XmlElement(name = "OutputName_4_2_2")
	protected Integer OutputName_4_2_2;
	@XmlElement(name = "OutputName_4_2_3")
	protected Float OutputName_4_2_3;

	public Integer getOutputName_4_2_4() {
		return OutputName_4_2_4;
	}

	public Integer getOutputName_4_2_5() {
		return OutputName_4_2_5;
	}

	public Float getOutputName_4_2_6() {
		return OutputName_4_2_6;
	}

	public String getOutputName_4_2_1() {
		return OutputName_4_2_1;
	}

	public Integer getOutputName_4_2_2() {
		return OutputName_4_2_2;
	}

	public Float getOutputName_4_2_3() {
		return OutputName_4_2_3;
	}

	public void setOutputName_4_2_4(Integer value) {
		this.OutputName_4_2_4 = value;
	}

	public void setOutputName_4_2_5(Integer value) {
		this.OutputName_4_2_5 = value;
	}

	public void setOutputName_4_2_6(Float value) {
		this.OutputName_4_2_6 = value;
	}

	public void setOutputName_4_2_1(String value) {
		this.OutputName_4_2_1 = value;
	}

	public void setOutputName_4_2_2(Integer value) {
		this.OutputName_4_2_2 = value;
	}

	public void setOutputName_4_2_3(Float value) {
		this.OutputName_4_2_3 = value;
	}

}
