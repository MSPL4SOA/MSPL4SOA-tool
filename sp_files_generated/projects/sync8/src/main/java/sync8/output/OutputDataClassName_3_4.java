package sync8.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_3_4")
@XmlType(name = "outputDataClassName_3_4", propOrder = { "OutputName_3_4_3",
		"OutputName_3_4_4", "OutputName_3_4_1", "OutputName_3_4_2" })
public class OutputDataClassName_3_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_3_4_3")
	protected String OutputName_3_4_3;
	@XmlElement(name = "OutputName_3_4_4")
	protected Float OutputName_3_4_4;
	@XmlElement(name = "OutputName_3_4_1")
	protected String OutputName_3_4_1;
	@XmlElement(name = "OutputName_3_4_2")
	protected Float OutputName_3_4_2;

	public String getOutputName_3_4_3() {
		return OutputName_3_4_3;
	}

	public Float getOutputName_3_4_4() {
		return OutputName_3_4_4;
	}

	public String getOutputName_3_4_1() {
		return OutputName_3_4_1;
	}

	public Float getOutputName_3_4_2() {
		return OutputName_3_4_2;
	}

	public void setOutputName_3_4_3(String value) {
		this.OutputName_3_4_3 = value;
	}

	public void setOutputName_3_4_4(Float value) {
		this.OutputName_3_4_4 = value;
	}

	public void setOutputName_3_4_1(String value) {
		this.OutputName_3_4_1 = value;
	}

	public void setOutputName_3_4_2(Float value) {
		this.OutputName_3_4_2 = value;
	}

}
