package SP_radar1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_3_1")
@XmlType(name = "outputDataClassName_3_1", propOrder = { "OutputName_3_1_1",
		"OutputName_3_1_4", "OutputName_3_1_5", "OutputName_3_1_2",
		"OutputName_3_1_3" })
public class OutputDataClassName_3_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_3_1_1")
	protected Float OutputName_3_1_1;
	@XmlElement(name = "OutputName_3_1_4")
	protected Integer OutputName_3_1_4;
	@XmlElement(name = "OutputName_3_1_5")
	protected Integer OutputName_3_1_5;
	@XmlElement(name = "OutputName_3_1_2")
	protected Float OutputName_3_1_2;
	@XmlElement(name = "OutputName_3_1_3")
	protected Float OutputName_3_1_3;

	public Float getOutputName_3_1_1() {
		return OutputName_3_1_1;
	}

	public Integer getOutputName_3_1_4() {
		return OutputName_3_1_4;
	}

	public Integer getOutputName_3_1_5() {
		return OutputName_3_1_5;
	}

	public Float getOutputName_3_1_2() {
		return OutputName_3_1_2;
	}

	public Float getOutputName_3_1_3() {
		return OutputName_3_1_3;
	}

	public void setOutputName_3_1_1(Float value) {
		this.OutputName_3_1_1 = value;
	}

	public void setOutputName_3_1_4(Integer value) {
		this.OutputName_3_1_4 = value;
	}

	public void setOutputName_3_1_5(Integer value) {
		this.OutputName_3_1_5 = value;
	}

	public void setOutputName_3_1_2(Float value) {
		this.OutputName_3_1_2 = value;
	}

	public void setOutputName_3_1_3(Float value) {
		this.OutputName_3_1_3 = value;
	}

}
