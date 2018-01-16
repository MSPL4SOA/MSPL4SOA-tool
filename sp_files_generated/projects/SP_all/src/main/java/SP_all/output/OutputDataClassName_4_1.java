package SP_all.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_1")
@XmlType(name = "outputDataClassName_4_1", propOrder = { "OutputName_4_1_1",
		"OutputName_4_1_2", "OutputName_4_1_3" })
public class OutputDataClassName_4_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_1_1")
	protected String OutputName_4_1_1;
	@XmlElement(name = "OutputName_4_1_2")
	protected Integer OutputName_4_1_2;
	@XmlElement(name = "OutputName_4_1_3")
	protected Float OutputName_4_1_3;

	public String getOutputName_4_1_1() {
		return OutputName_4_1_1;
	}

	public Integer getOutputName_4_1_2() {
		return OutputName_4_1_2;
	}

	public Float getOutputName_4_1_3() {
		return OutputName_4_1_3;
	}

	public void setOutputName_4_1_1(String value) {
		this.OutputName_4_1_1 = value;
	}

	public void setOutputName_4_1_2(Integer value) {
		this.OutputName_4_1_2 = value;
	}

	public void setOutputName_4_1_3(Float value) {
		this.OutputName_4_1_3 = value;
	}

}
