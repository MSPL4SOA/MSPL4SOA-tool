package large3.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_7_2")
@XmlType(name = "outputDataClassName_7_2", propOrder = { "OutputName_7_2_4",
		"OutputName_7_2_3", "OutputName_7_2_2", "OutputName_7_2_1",
		"OutputName_7_2_7", "OutputName_7_2_6", "OutputName_7_2_5" })
public class OutputDataClassName_7_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_7_2_4")
	protected Integer OutputName_7_2_4;
	@XmlElement(name = "OutputName_7_2_3")
	protected Integer OutputName_7_2_3;
	@XmlElement(name = "OutputName_7_2_2")
	protected Float OutputName_7_2_2;
	@XmlElement(name = "OutputName_7_2_1")
	protected Float OutputName_7_2_1;
	@XmlElement(name = "OutputName_7_2_7")
	protected Integer OutputName_7_2_7;
	@XmlElement(name = "OutputName_7_2_6")
	protected Float OutputName_7_2_6;
	@XmlElement(name = "OutputName_7_2_5")
	protected String OutputName_7_2_5;

	public Integer getOutputName_7_2_4() {
		return OutputName_7_2_4;
	}

	public Integer getOutputName_7_2_3() {
		return OutputName_7_2_3;
	}

	public Float getOutputName_7_2_2() {
		return OutputName_7_2_2;
	}

	public Float getOutputName_7_2_1() {
		return OutputName_7_2_1;
	}

	public Integer getOutputName_7_2_7() {
		return OutputName_7_2_7;
	}

	public Float getOutputName_7_2_6() {
		return OutputName_7_2_6;
	}

	public String getOutputName_7_2_5() {
		return OutputName_7_2_5;
	}

	public void setOutputName_7_2_4(Integer value) {
		this.OutputName_7_2_4 = value;
	}

	public void setOutputName_7_2_3(Integer value) {
		this.OutputName_7_2_3 = value;
	}

	public void setOutputName_7_2_2(Float value) {
		this.OutputName_7_2_2 = value;
	}

	public void setOutputName_7_2_1(Float value) {
		this.OutputName_7_2_1 = value;
	}

	public void setOutputName_7_2_7(Integer value) {
		this.OutputName_7_2_7 = value;
	}

	public void setOutputName_7_2_6(Float value) {
		this.OutputName_7_2_6 = value;
	}

	public void setOutputName_7_2_5(String value) {
		this.OutputName_7_2_5 = value;
	}

}
