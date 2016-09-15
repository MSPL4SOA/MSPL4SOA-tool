package large2.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_5")
@XmlType(name = "outputDataClassName_5_5", propOrder = { "OutputName_5_5_4",
		"OutputName_5_5_2", "OutputName_5_5_3", "OutputName_5_5_1" })
public class OutputDataClassName_5_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_5_4")
	protected String OutputName_5_5_4;
	@XmlElement(name = "OutputName_5_5_2")
	protected Integer OutputName_5_5_2;
	@XmlElement(name = "OutputName_5_5_3")
	protected Integer OutputName_5_5_3;
	@XmlElement(name = "OutputName_5_5_1")
	protected Integer OutputName_5_5_1;

	public String getOutputName_5_5_4() {
		return OutputName_5_5_4;
	}

	public Integer getOutputName_5_5_2() {
		return OutputName_5_5_2;
	}

	public Integer getOutputName_5_5_3() {
		return OutputName_5_5_3;
	}

	public Integer getOutputName_5_5_1() {
		return OutputName_5_5_1;
	}

	public void setOutputName_5_5_4(String value) {
		this.OutputName_5_5_4 = value;
	}

	public void setOutputName_5_5_2(Integer value) {
		this.OutputName_5_5_2 = value;
	}

	public void setOutputName_5_5_3(Integer value) {
		this.OutputName_5_5_3 = value;
	}

	public void setOutputName_5_5_1(Integer value) {
		this.OutputName_5_5_1 = value;
	}

}
