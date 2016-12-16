package large3.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_6")
@XmlType(name = "outputDataClassName_6_6", propOrder = { "OutputName_6_6_3",
		"OutputName_6_6_2", "OutputName_6_6_4", "OutputName_6_6_1" })
public class OutputDataClassName_6_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_6_3")
	protected Integer OutputName_6_6_3;
	@XmlElement(name = "OutputName_6_6_2")
	protected Integer OutputName_6_6_2;
	@XmlElement(name = "OutputName_6_6_4")
	protected String OutputName_6_6_4;
	@XmlElement(name = "OutputName_6_6_1")
	protected String OutputName_6_6_1;

	public Integer getOutputName_6_6_3() {
		return OutputName_6_6_3;
	}

	public Integer getOutputName_6_6_2() {
		return OutputName_6_6_2;
	}

	public String getOutputName_6_6_4() {
		return OutputName_6_6_4;
	}

	public String getOutputName_6_6_1() {
		return OutputName_6_6_1;
	}

	public void setOutputName_6_6_3(Integer value) {
		this.OutputName_6_6_3 = value;
	}

	public void setOutputName_6_6_2(Integer value) {
		this.OutputName_6_6_2 = value;
	}

	public void setOutputName_6_6_4(String value) {
		this.OutputName_6_6_4 = value;
	}

	public void setOutputName_6_6_1(String value) {
		this.OutputName_6_6_1 = value;
	}

}
