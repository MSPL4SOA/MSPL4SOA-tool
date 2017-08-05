package SP_infantry1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_3_3")
@XmlType(name = "outputDataClassName_3_3", propOrder = { "OutputName_3_3_2",
		"OutputName_3_3_3", "OutputName_3_3_1" })
public class OutputDataClassName_3_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_3_3_2")
	protected Float OutputName_3_3_2;
	@XmlElement(name = "OutputName_3_3_3")
	protected Integer OutputName_3_3_3;
	@XmlElement(name = "OutputName_3_3_1")
	protected String OutputName_3_3_1;

	public Float getOutputName_3_3_2() {
		return OutputName_3_3_2;
	}

	public Integer getOutputName_3_3_3() {
		return OutputName_3_3_3;
	}

	public String getOutputName_3_3_1() {
		return OutputName_3_3_1;
	}

	public void setOutputName_3_3_2(Float value) {
		this.OutputName_3_3_2 = value;
	}

	public void setOutputName_3_3_3(Integer value) {
		this.OutputName_3_3_3 = value;
	}

	public void setOutputName_3_3_1(String value) {
		this.OutputName_3_3_1 = value;
	}

}
