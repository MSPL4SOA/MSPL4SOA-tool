package large2.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_5")
@XmlType(name = "outputDataClassName_1_5", propOrder = { "OutputName_1_5_6",
		"OutputName_1_5_7", "OutputName_1_5_4", "OutputName_1_5_5",
		"OutputName_1_5_2", "OutputName_1_5_3", "OutputName_1_5_1" })
public class OutputDataClassName_1_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_5_6")
	protected String OutputName_1_5_6;
	@XmlElement(name = "OutputName_1_5_7")
	protected Float OutputName_1_5_7;
	@XmlElement(name = "OutputName_1_5_4")
	protected Float OutputName_1_5_4;
	@XmlElement(name = "OutputName_1_5_5")
	protected Integer OutputName_1_5_5;
	@XmlElement(name = "OutputName_1_5_2")
	protected Integer OutputName_1_5_2;
	@XmlElement(name = "OutputName_1_5_3")
	protected Float OutputName_1_5_3;
	@XmlElement(name = "OutputName_1_5_1")
	protected String OutputName_1_5_1;

	public String getOutputName_1_5_6() {
		return OutputName_1_5_6;
	}

	public Float getOutputName_1_5_7() {
		return OutputName_1_5_7;
	}

	public Float getOutputName_1_5_4() {
		return OutputName_1_5_4;
	}

	public Integer getOutputName_1_5_5() {
		return OutputName_1_5_5;
	}

	public Integer getOutputName_1_5_2() {
		return OutputName_1_5_2;
	}

	public Float getOutputName_1_5_3() {
		return OutputName_1_5_3;
	}

	public String getOutputName_1_5_1() {
		return OutputName_1_5_1;
	}

	public void setOutputName_1_5_6(String value) {
		this.OutputName_1_5_6 = value;
	}

	public void setOutputName_1_5_7(Float value) {
		this.OutputName_1_5_7 = value;
	}

	public void setOutputName_1_5_4(Float value) {
		this.OutputName_1_5_4 = value;
	}

	public void setOutputName_1_5_5(Integer value) {
		this.OutputName_1_5_5 = value;
	}

	public void setOutputName_1_5_2(Integer value) {
		this.OutputName_1_5_2 = value;
	}

	public void setOutputName_1_5_3(Float value) {
		this.OutputName_1_5_3 = value;
	}

	public void setOutputName_1_5_1(String value) {
		this.OutputName_1_5_1 = value;
	}

}
