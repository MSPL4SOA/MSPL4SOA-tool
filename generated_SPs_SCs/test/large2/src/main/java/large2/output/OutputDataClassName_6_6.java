package large2.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_6")
@XmlType(name = "outputDataClassName_6_6", propOrder = { "OutputName_6_6_3",
		"OutputName_6_6_2", "OutputName_6_6_5", "OutputName_6_6_4",
		"OutputName_6_6_1", "OutputName_6_6_7", "OutputName_6_6_6" })
public class OutputDataClassName_6_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_6_3")
	protected Integer OutputName_6_6_3;
	@XmlElement(name = "OutputName_6_6_2")
	protected Float OutputName_6_6_2;
	@XmlElement(name = "OutputName_6_6_5")
	protected Integer OutputName_6_6_5;
	@XmlElement(name = "OutputName_6_6_4")
	protected String OutputName_6_6_4;
	@XmlElement(name = "OutputName_6_6_1")
	protected Float OutputName_6_6_1;
	@XmlElement(name = "OutputName_6_6_7")
	protected Float OutputName_6_6_7;
	@XmlElement(name = "OutputName_6_6_6")
	protected Float OutputName_6_6_6;

	public Integer getOutputName_6_6_3() {
		return OutputName_6_6_3;
	}

	public Float getOutputName_6_6_2() {
		return OutputName_6_6_2;
	}

	public Integer getOutputName_6_6_5() {
		return OutputName_6_6_5;
	}

	public String getOutputName_6_6_4() {
		return OutputName_6_6_4;
	}

	public Float getOutputName_6_6_1() {
		return OutputName_6_6_1;
	}

	public Float getOutputName_6_6_7() {
		return OutputName_6_6_7;
	}

	public Float getOutputName_6_6_6() {
		return OutputName_6_6_6;
	}

	public void setOutputName_6_6_3(Integer value) {
		this.OutputName_6_6_3 = value;
	}

	public void setOutputName_6_6_2(Float value) {
		this.OutputName_6_6_2 = value;
	}

	public void setOutputName_6_6_5(Integer value) {
		this.OutputName_6_6_5 = value;
	}

	public void setOutputName_6_6_4(String value) {
		this.OutputName_6_6_4 = value;
	}

	public void setOutputName_6_6_1(Float value) {
		this.OutputName_6_6_1 = value;
	}

	public void setOutputName_6_6_7(Float value) {
		this.OutputName_6_6_7 = value;
	}

	public void setOutputName_6_6_6(Float value) {
		this.OutputName_6_6_6 = value;
	}

}
