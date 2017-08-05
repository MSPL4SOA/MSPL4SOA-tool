package SP_infantry1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_2")
@XmlType(name = "outputDataClassName_1_2", propOrder = { "OutputName_1_2_7",
		"OutputName_1_2_5", "OutputName_1_2_6", "OutputName_1_2_3",
		"OutputName_1_2_4", "OutputName_1_2_1", "OutputName_1_2_2" })
public class OutputDataClassName_1_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_2_7")
	protected String OutputName_1_2_7;
	@XmlElement(name = "OutputName_1_2_5")
	protected Float OutputName_1_2_5;
	@XmlElement(name = "OutputName_1_2_6")
	protected Integer OutputName_1_2_6;
	@XmlElement(name = "OutputName_1_2_3")
	protected Integer OutputName_1_2_3;
	@XmlElement(name = "OutputName_1_2_4")
	protected Integer OutputName_1_2_4;
	@XmlElement(name = "OutputName_1_2_1")
	protected Integer OutputName_1_2_1;
	@XmlElement(name = "OutputName_1_2_2")
	protected Float OutputName_1_2_2;

	public String getOutputName_1_2_7() {
		return OutputName_1_2_7;
	}

	public Float getOutputName_1_2_5() {
		return OutputName_1_2_5;
	}

	public Integer getOutputName_1_2_6() {
		return OutputName_1_2_6;
	}

	public Integer getOutputName_1_2_3() {
		return OutputName_1_2_3;
	}

	public Integer getOutputName_1_2_4() {
		return OutputName_1_2_4;
	}

	public Integer getOutputName_1_2_1() {
		return OutputName_1_2_1;
	}

	public Float getOutputName_1_2_2() {
		return OutputName_1_2_2;
	}

	public void setOutputName_1_2_7(String value) {
		this.OutputName_1_2_7 = value;
	}

	public void setOutputName_1_2_5(Float value) {
		this.OutputName_1_2_5 = value;
	}

	public void setOutputName_1_2_6(Integer value) {
		this.OutputName_1_2_6 = value;
	}

	public void setOutputName_1_2_3(Integer value) {
		this.OutputName_1_2_3 = value;
	}

	public void setOutputName_1_2_4(Integer value) {
		this.OutputName_1_2_4 = value;
	}

	public void setOutputName_1_2_1(Integer value) {
		this.OutputName_1_2_1 = value;
	}

	public void setOutputName_1_2_2(Float value) {
		this.OutputName_1_2_2 = value;
	}

}
