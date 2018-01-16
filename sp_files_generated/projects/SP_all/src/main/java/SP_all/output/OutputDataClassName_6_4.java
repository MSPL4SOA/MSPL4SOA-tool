package SP_all.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_4")
@XmlType(name = "outputDataClassName_6_4", propOrder = { "OutputName_6_4_5",
		"OutputName_6_4_4", "OutputName_6_4_7", "OutputName_6_4_6",
		"OutputName_6_4_1", "OutputName_6_4_3", "OutputName_6_4_2" })
public class OutputDataClassName_6_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_4_5")
	protected Integer OutputName_6_4_5;
	@XmlElement(name = "OutputName_6_4_4")
	protected Float OutputName_6_4_4;
	@XmlElement(name = "OutputName_6_4_7")
	protected Float OutputName_6_4_7;
	@XmlElement(name = "OutputName_6_4_6")
	protected String OutputName_6_4_6;
	@XmlElement(name = "OutputName_6_4_1")
	protected Float OutputName_6_4_1;
	@XmlElement(name = "OutputName_6_4_3")
	protected Integer OutputName_6_4_3;
	@XmlElement(name = "OutputName_6_4_2")
	protected Float OutputName_6_4_2;

	public Integer getOutputName_6_4_5() {
		return OutputName_6_4_5;
	}

	public Float getOutputName_6_4_4() {
		return OutputName_6_4_4;
	}

	public Float getOutputName_6_4_7() {
		return OutputName_6_4_7;
	}

	public String getOutputName_6_4_6() {
		return OutputName_6_4_6;
	}

	public Float getOutputName_6_4_1() {
		return OutputName_6_4_1;
	}

	public Integer getOutputName_6_4_3() {
		return OutputName_6_4_3;
	}

	public Float getOutputName_6_4_2() {
		return OutputName_6_4_2;
	}

	public void setOutputName_6_4_5(Integer value) {
		this.OutputName_6_4_5 = value;
	}

	public void setOutputName_6_4_4(Float value) {
		this.OutputName_6_4_4 = value;
	}

	public void setOutputName_6_4_7(Float value) {
		this.OutputName_6_4_7 = value;
	}

	public void setOutputName_6_4_6(String value) {
		this.OutputName_6_4_6 = value;
	}

	public void setOutputName_6_4_1(Float value) {
		this.OutputName_6_4_1 = value;
	}

	public void setOutputName_6_4_3(Integer value) {
		this.OutputName_6_4_3 = value;
	}

	public void setOutputName_6_4_2(Float value) {
		this.OutputName_6_4_2 = value;
	}

}
