package SP_infantry1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_4")
@XmlType(name = "outputDataClassName_1_4", propOrder = { "OutputName_1_4_7",
		"OutputName_1_4_5", "OutputName_1_4_6", "OutputName_1_4_3",
		"OutputName_1_4_4", "OutputName_1_4_1", "OutputName_1_4_2" })
public class OutputDataClassName_1_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_4_7")
	protected Integer OutputName_1_4_7;
	@XmlElement(name = "OutputName_1_4_5")
	protected Integer OutputName_1_4_5;
	@XmlElement(name = "OutputName_1_4_6")
	protected Integer OutputName_1_4_6;
	@XmlElement(name = "OutputName_1_4_3")
	protected Integer OutputName_1_4_3;
	@XmlElement(name = "OutputName_1_4_4")
	protected Integer OutputName_1_4_4;
	@XmlElement(name = "OutputName_1_4_1")
	protected Float OutputName_1_4_1;
	@XmlElement(name = "OutputName_1_4_2")
	protected Float OutputName_1_4_2;

	public Integer getOutputName_1_4_7() {
		return OutputName_1_4_7;
	}

	public Integer getOutputName_1_4_5() {
		return OutputName_1_4_5;
	}

	public Integer getOutputName_1_4_6() {
		return OutputName_1_4_6;
	}

	public Integer getOutputName_1_4_3() {
		return OutputName_1_4_3;
	}

	public Integer getOutputName_1_4_4() {
		return OutputName_1_4_4;
	}

	public Float getOutputName_1_4_1() {
		return OutputName_1_4_1;
	}

	public Float getOutputName_1_4_2() {
		return OutputName_1_4_2;
	}

	public void setOutputName_1_4_7(Integer value) {
		this.OutputName_1_4_7 = value;
	}

	public void setOutputName_1_4_5(Integer value) {
		this.OutputName_1_4_5 = value;
	}

	public void setOutputName_1_4_6(Integer value) {
		this.OutputName_1_4_6 = value;
	}

	public void setOutputName_1_4_3(Integer value) {
		this.OutputName_1_4_3 = value;
	}

	public void setOutputName_1_4_4(Integer value) {
		this.OutputName_1_4_4 = value;
	}

	public void setOutputName_1_4_1(Float value) {
		this.OutputName_1_4_1 = value;
	}

	public void setOutputName_1_4_2(Float value) {
		this.OutputName_1_4_2 = value;
	}

}
