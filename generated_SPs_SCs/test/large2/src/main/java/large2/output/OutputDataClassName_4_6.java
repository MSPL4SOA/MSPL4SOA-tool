package large2.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_6")
@XmlType(name = "outputDataClassName_4_6", propOrder = { "OutputName_4_6_1",
		"OutputName_4_6_2", "OutputName_4_6_3", "OutputName_4_6_4" })
public class OutputDataClassName_4_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_6_1")
	protected Float OutputName_4_6_1;
	@XmlElement(name = "OutputName_4_6_2")
	protected String OutputName_4_6_2;
	@XmlElement(name = "OutputName_4_6_3")
	protected Integer OutputName_4_6_3;
	@XmlElement(name = "OutputName_4_6_4")
	protected Float OutputName_4_6_4;

	public Float getOutputName_4_6_1() {
		return OutputName_4_6_1;
	}

	public String getOutputName_4_6_2() {
		return OutputName_4_6_2;
	}

	public Integer getOutputName_4_6_3() {
		return OutputName_4_6_3;
	}

	public Float getOutputName_4_6_4() {
		return OutputName_4_6_4;
	}

	public void setOutputName_4_6_1(Float value) {
		this.OutputName_4_6_1 = value;
	}

	public void setOutputName_4_6_2(String value) {
		this.OutputName_4_6_2 = value;
	}

	public void setOutputName_4_6_3(Integer value) {
		this.OutputName_4_6_3 = value;
	}

	public void setOutputName_4_6_4(Float value) {
		this.OutputName_4_6_4 = value;
	}

}
