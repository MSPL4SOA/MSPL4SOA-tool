package large2.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_1")
@XmlType(name = "outputDataClassName_6_1", propOrder = { "OutputName_6_1_1",
		"OutputName_6_1_2", "OutputName_6_1_7", "OutputName_6_1_8",
		"OutputName_6_1_3", "OutputName_6_1_4", "OutputName_6_1_5",
		"OutputName_6_1_6" })
public class OutputDataClassName_6_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_1_1")
	protected Integer OutputName_6_1_1;
	@XmlElement(name = "OutputName_6_1_2")
	protected Float OutputName_6_1_2;
	@XmlElement(name = "OutputName_6_1_7")
	protected String OutputName_6_1_7;
	@XmlElement(name = "OutputName_6_1_8")
	protected Integer OutputName_6_1_8;
	@XmlElement(name = "OutputName_6_1_3")
	protected String OutputName_6_1_3;
	@XmlElement(name = "OutputName_6_1_4")
	protected Integer OutputName_6_1_4;
	@XmlElement(name = "OutputName_6_1_5")
	protected Float OutputName_6_1_5;
	@XmlElement(name = "OutputName_6_1_6")
	protected String OutputName_6_1_6;

	public Integer getOutputName_6_1_1() {
		return OutputName_6_1_1;
	}

	public Float getOutputName_6_1_2() {
		return OutputName_6_1_2;
	}

	public String getOutputName_6_1_7() {
		return OutputName_6_1_7;
	}

	public Integer getOutputName_6_1_8() {
		return OutputName_6_1_8;
	}

	public String getOutputName_6_1_3() {
		return OutputName_6_1_3;
	}

	public Integer getOutputName_6_1_4() {
		return OutputName_6_1_4;
	}

	public Float getOutputName_6_1_5() {
		return OutputName_6_1_5;
	}

	public String getOutputName_6_1_6() {
		return OutputName_6_1_6;
	}

	public void setOutputName_6_1_1(Integer value) {
		this.OutputName_6_1_1 = value;
	}

	public void setOutputName_6_1_2(Float value) {
		this.OutputName_6_1_2 = value;
	}

	public void setOutputName_6_1_7(String value) {
		this.OutputName_6_1_7 = value;
	}

	public void setOutputName_6_1_8(Integer value) {
		this.OutputName_6_1_8 = value;
	}

	public void setOutputName_6_1_3(String value) {
		this.OutputName_6_1_3 = value;
	}

	public void setOutputName_6_1_4(Integer value) {
		this.OutputName_6_1_4 = value;
	}

	public void setOutputName_6_1_5(Float value) {
		this.OutputName_6_1_5 = value;
	}

	public void setOutputName_6_1_6(String value) {
		this.OutputName_6_1_6 = value;
	}

}
