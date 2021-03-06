package sync8.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_2")
@XmlType(name = "outputDataClassName_6_2", propOrder = { "OutputName_6_2_1",
		"OutputName_6_2_3", "OutputName_6_2_2", "OutputName_6_2_4" })
public class OutputDataClassName_6_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_2_1")
	protected String OutputName_6_2_1;
	@XmlElement(name = "OutputName_6_2_3")
	protected Integer OutputName_6_2_3;
	@XmlElement(name = "OutputName_6_2_2")
	protected Integer OutputName_6_2_2;
	@XmlElement(name = "OutputName_6_2_4")
	protected Float OutputName_6_2_4;

	public String getOutputName_6_2_1() {
		return OutputName_6_2_1;
	}

	public Integer getOutputName_6_2_3() {
		return OutputName_6_2_3;
	}

	public Integer getOutputName_6_2_2() {
		return OutputName_6_2_2;
	}

	public Float getOutputName_6_2_4() {
		return OutputName_6_2_4;
	}

	public void setOutputName_6_2_1(String value) {
		this.OutputName_6_2_1 = value;
	}

	public void setOutputName_6_2_3(Integer value) {
		this.OutputName_6_2_3 = value;
	}

	public void setOutputName_6_2_2(Integer value) {
		this.OutputName_6_2_2 = value;
	}

	public void setOutputName_6_2_4(Float value) {
		this.OutputName_6_2_4 = value;
	}

}
