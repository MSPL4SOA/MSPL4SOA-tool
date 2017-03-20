package SP_command.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_6")
@XmlType(name = "outputDataClassName_5_6", propOrder = { "OutputName_5_6_3",
		"OutputName_5_6_4", "OutputName_5_6_1", "OutputName_5_6_2" })
public class OutputDataClassName_5_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_6_3")
	protected Float OutputName_5_6_3;
	@XmlElement(name = "OutputName_5_6_4")
	protected Integer OutputName_5_6_4;
	@XmlElement(name = "OutputName_5_6_1")
	protected String OutputName_5_6_1;
	@XmlElement(name = "OutputName_5_6_2")
	protected Float OutputName_5_6_2;

	public Float getOutputName_5_6_3() {
		return OutputName_5_6_3;
	}

	public Integer getOutputName_5_6_4() {
		return OutputName_5_6_4;
	}

	public String getOutputName_5_6_1() {
		return OutputName_5_6_1;
	}

	public Float getOutputName_5_6_2() {
		return OutputName_5_6_2;
	}

	public void setOutputName_5_6_3(Float value) {
		this.OutputName_5_6_3 = value;
	}

	public void setOutputName_5_6_4(Integer value) {
		this.OutputName_5_6_4 = value;
	}

	public void setOutputName_5_6_1(String value) {
		this.OutputName_5_6_1 = value;
	}

	public void setOutputName_5_6_2(Float value) {
		this.OutputName_5_6_2 = value;
	}

}
