package large3.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_3")
@XmlType(name = "outputDataClassName_5_3", propOrder = { "OutputName_5_3_1",
		"OutputName_5_3_8", "OutputName_5_3_6", "OutputName_5_3_7",
		"OutputName_5_3_4", "OutputName_5_3_5", "OutputName_5_3_2",
		"OutputName_5_3_3" })
public class OutputDataClassName_5_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_3_1")
	protected Integer OutputName_5_3_1;
	@XmlElement(name = "OutputName_5_3_8")
	protected Integer OutputName_5_3_8;
	@XmlElement(name = "OutputName_5_3_6")
	protected Float OutputName_5_3_6;
	@XmlElement(name = "OutputName_5_3_7")
	protected String OutputName_5_3_7;
	@XmlElement(name = "OutputName_5_3_4")
	protected Float OutputName_5_3_4;
	@XmlElement(name = "OutputName_5_3_5")
	protected Integer OutputName_5_3_5;
	@XmlElement(name = "OutputName_5_3_2")
	protected String OutputName_5_3_2;
	@XmlElement(name = "OutputName_5_3_3")
	protected Float OutputName_5_3_3;

	public Integer getOutputName_5_3_1() {
		return OutputName_5_3_1;
	}

	public Integer getOutputName_5_3_8() {
		return OutputName_5_3_8;
	}

	public Float getOutputName_5_3_6() {
		return OutputName_5_3_6;
	}

	public String getOutputName_5_3_7() {
		return OutputName_5_3_7;
	}

	public Float getOutputName_5_3_4() {
		return OutputName_5_3_4;
	}

	public Integer getOutputName_5_3_5() {
		return OutputName_5_3_5;
	}

	public String getOutputName_5_3_2() {
		return OutputName_5_3_2;
	}

	public Float getOutputName_5_3_3() {
		return OutputName_5_3_3;
	}

	public void setOutputName_5_3_1(Integer value) {
		this.OutputName_5_3_1 = value;
	}

	public void setOutputName_5_3_8(Integer value) {
		this.OutputName_5_3_8 = value;
	}

	public void setOutputName_5_3_6(Float value) {
		this.OutputName_5_3_6 = value;
	}

	public void setOutputName_5_3_7(String value) {
		this.OutputName_5_3_7 = value;
	}

	public void setOutputName_5_3_4(Float value) {
		this.OutputName_5_3_4 = value;
	}

	public void setOutputName_5_3_5(Integer value) {
		this.OutputName_5_3_5 = value;
	}

	public void setOutputName_5_3_2(String value) {
		this.OutputName_5_3_2 = value;
	}

	public void setOutputName_5_3_3(Float value) {
		this.OutputName_5_3_3 = value;
	}

}
