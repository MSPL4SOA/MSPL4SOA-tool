package SP_infantry1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_2_4")
@XmlType(name = "outputDataClassName_2_4", propOrder = { "OutputName_2_4_8",
		"OutputName_2_4_9", "OutputName_2_4_4", "OutputName_2_4_5",
		"OutputName_2_4_6", "OutputName_2_4_7", "OutputName_2_4_1",
		"OutputName_2_4_2", "OutputName_2_4_3" })
public class OutputDataClassName_2_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_2_4_8")
	protected Float OutputName_2_4_8;
	@XmlElement(name = "OutputName_2_4_9")
	protected Integer OutputName_2_4_9;
	@XmlElement(name = "OutputName_2_4_4")
	protected Float OutputName_2_4_4;
	@XmlElement(name = "OutputName_2_4_5")
	protected String OutputName_2_4_5;
	@XmlElement(name = "OutputName_2_4_6")
	protected Float OutputName_2_4_6;
	@XmlElement(name = "OutputName_2_4_7")
	protected Float OutputName_2_4_7;
	@XmlElement(name = "OutputName_2_4_1")
	protected String OutputName_2_4_1;
	@XmlElement(name = "OutputName_2_4_2")
	protected Integer OutputName_2_4_2;
	@XmlElement(name = "OutputName_2_4_3")
	protected String OutputName_2_4_3;

	public Float getOutputName_2_4_8() {
		return OutputName_2_4_8;
	}

	public Integer getOutputName_2_4_9() {
		return OutputName_2_4_9;
	}

	public Float getOutputName_2_4_4() {
		return OutputName_2_4_4;
	}

	public String getOutputName_2_4_5() {
		return OutputName_2_4_5;
	}

	public Float getOutputName_2_4_6() {
		return OutputName_2_4_6;
	}

	public Float getOutputName_2_4_7() {
		return OutputName_2_4_7;
	}

	public String getOutputName_2_4_1() {
		return OutputName_2_4_1;
	}

	public Integer getOutputName_2_4_2() {
		return OutputName_2_4_2;
	}

	public String getOutputName_2_4_3() {
		return OutputName_2_4_3;
	}

	public void setOutputName_2_4_8(Float value) {
		this.OutputName_2_4_8 = value;
	}

	public void setOutputName_2_4_9(Integer value) {
		this.OutputName_2_4_9 = value;
	}

	public void setOutputName_2_4_4(Float value) {
		this.OutputName_2_4_4 = value;
	}

	public void setOutputName_2_4_5(String value) {
		this.OutputName_2_4_5 = value;
	}

	public void setOutputName_2_4_6(Float value) {
		this.OutputName_2_4_6 = value;
	}

	public void setOutputName_2_4_7(Float value) {
		this.OutputName_2_4_7 = value;
	}

	public void setOutputName_2_4_1(String value) {
		this.OutputName_2_4_1 = value;
	}

	public void setOutputName_2_4_2(Integer value) {
		this.OutputName_2_4_2 = value;
	}

	public void setOutputName_2_4_3(String value) {
		this.OutputName_2_4_3 = value;
	}

}
