package large2.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_7_4")
@XmlType(name = "outputDataClassName_7_4", propOrder = { "OutputName_7_4_2",
		"OutputName_7_4_1", "OutputName_7_4_4", "OutputName_7_4_3" })
public class OutputDataClassName_7_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_7_4_2")
	protected String OutputName_7_4_2;
	@XmlElement(name = "OutputName_7_4_1")
	protected Integer OutputName_7_4_1;
	@XmlElement(name = "OutputName_7_4_4")
	protected Integer OutputName_7_4_4;
	@XmlElement(name = "OutputName_7_4_3")
	protected String OutputName_7_4_3;

	public String getOutputName_7_4_2() {
		return OutputName_7_4_2;
	}

	public Integer getOutputName_7_4_1() {
		return OutputName_7_4_1;
	}

	public Integer getOutputName_7_4_4() {
		return OutputName_7_4_4;
	}

	public String getOutputName_7_4_3() {
		return OutputName_7_4_3;
	}

	public void setOutputName_7_4_2(String value) {
		this.OutputName_7_4_2 = value;
	}

	public void setOutputName_7_4_1(Integer value) {
		this.OutputName_7_4_1 = value;
	}

	public void setOutputName_7_4_4(Integer value) {
		this.OutputName_7_4_4 = value;
	}

	public void setOutputName_7_4_3(String value) {
		this.OutputName_7_4_3 = value;
	}

}
