package SP_aircraftcarrier1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_2_4")
@XmlType(name = "outputDataClassName_2_4", propOrder = { "OutputName_2_4_4",
		"OutputName_2_4_5", "OutputName_2_4_6", "OutputName_2_4_1",
		"OutputName_2_4_2", "OutputName_2_4_3" })
public class OutputDataClassName_2_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_2_4_4")
	protected String OutputName_2_4_4;
	@XmlElement(name = "OutputName_2_4_5")
	protected String OutputName_2_4_5;
	@XmlElement(name = "OutputName_2_4_6")
	protected Integer OutputName_2_4_6;
	@XmlElement(name = "OutputName_2_4_1")
	protected Integer OutputName_2_4_1;
	@XmlElement(name = "OutputName_2_4_2")
	protected Float OutputName_2_4_2;
	@XmlElement(name = "OutputName_2_4_3")
	protected Float OutputName_2_4_3;

	public String getOutputName_2_4_4() {
		return OutputName_2_4_4;
	}

	public String getOutputName_2_4_5() {
		return OutputName_2_4_5;
	}

	public Integer getOutputName_2_4_6() {
		return OutputName_2_4_6;
	}

	public Integer getOutputName_2_4_1() {
		return OutputName_2_4_1;
	}

	public Float getOutputName_2_4_2() {
		return OutputName_2_4_2;
	}

	public Float getOutputName_2_4_3() {
		return OutputName_2_4_3;
	}

	public void setOutputName_2_4_4(String value) {
		this.OutputName_2_4_4 = value;
	}

	public void setOutputName_2_4_5(String value) {
		this.OutputName_2_4_5 = value;
	}

	public void setOutputName_2_4_6(Integer value) {
		this.OutputName_2_4_6 = value;
	}

	public void setOutputName_2_4_1(Integer value) {
		this.OutputName_2_4_1 = value;
	}

	public void setOutputName_2_4_2(Float value) {
		this.OutputName_2_4_2 = value;
	}

	public void setOutputName_2_4_3(Float value) {
		this.OutputName_2_4_3 = value;
	}

}
