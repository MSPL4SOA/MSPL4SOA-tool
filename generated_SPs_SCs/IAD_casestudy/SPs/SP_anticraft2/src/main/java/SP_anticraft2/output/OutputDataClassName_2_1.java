package SP_anticraft2.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_2_1")
@XmlType(name = "outputDataClassName_2_1", propOrder = { "OutputName_2_1_3",
		"OutputName_2_1_4", "OutputName_2_1_5", "OutputName_2_1_6",
		"OutputName_2_1_1", "OutputName_2_1_2" })
public class OutputDataClassName_2_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_2_1_3")
	protected Integer OutputName_2_1_3;
	@XmlElement(name = "OutputName_2_1_4")
	protected String OutputName_2_1_4;
	@XmlElement(name = "OutputName_2_1_5")
	protected Float OutputName_2_1_5;
	@XmlElement(name = "OutputName_2_1_6")
	protected Integer OutputName_2_1_6;
	@XmlElement(name = "OutputName_2_1_1")
	protected Float OutputName_2_1_1;
	@XmlElement(name = "OutputName_2_1_2")
	protected String OutputName_2_1_2;

	public Integer getOutputName_2_1_3() {
		return OutputName_2_1_3;
	}

	public String getOutputName_2_1_4() {
		return OutputName_2_1_4;
	}

	public Float getOutputName_2_1_5() {
		return OutputName_2_1_5;
	}

	public Integer getOutputName_2_1_6() {
		return OutputName_2_1_6;
	}

	public Float getOutputName_2_1_1() {
		return OutputName_2_1_1;
	}

	public String getOutputName_2_1_2() {
		return OutputName_2_1_2;
	}

	public void setOutputName_2_1_3(Integer value) {
		this.OutputName_2_1_3 = value;
	}

	public void setOutputName_2_1_4(String value) {
		this.OutputName_2_1_4 = value;
	}

	public void setOutputName_2_1_5(Float value) {
		this.OutputName_2_1_5 = value;
	}

	public void setOutputName_2_1_6(Integer value) {
		this.OutputName_2_1_6 = value;
	}

	public void setOutputName_2_1_1(Float value) {
		this.OutputName_2_1_1 = value;
	}

	public void setOutputName_2_1_2(String value) {
		this.OutputName_2_1_2 = value;
	}

}
