package large11.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_3_5")
@XmlType(name = "outputDataClassName_3_5", propOrder = { "OutputName_3_5_1",
		"OutputName_3_5_2", "OutputName_3_5_3", "OutputName_3_5_4",
		"OutputName_3_5_5", "OutputName_3_5_6" })
public class OutputDataClassName_3_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_3_5_1")
	protected Float OutputName_3_5_1;
	@XmlElement(name = "OutputName_3_5_2")
	protected Integer OutputName_3_5_2;
	@XmlElement(name = "OutputName_3_5_3")
	protected Integer OutputName_3_5_3;
	@XmlElement(name = "OutputName_3_5_4")
	protected Float OutputName_3_5_4;
	@XmlElement(name = "OutputName_3_5_5")
	protected String OutputName_3_5_5;
	@XmlElement(name = "OutputName_3_5_6")
	protected Integer OutputName_3_5_6;

	public Float getOutputName_3_5_1() {
		return OutputName_3_5_1;
	}

	public Integer getOutputName_3_5_2() {
		return OutputName_3_5_2;
	}

	public Integer getOutputName_3_5_3() {
		return OutputName_3_5_3;
	}

	public Float getOutputName_3_5_4() {
		return OutputName_3_5_4;
	}

	public String getOutputName_3_5_5() {
		return OutputName_3_5_5;
	}

	public Integer getOutputName_3_5_6() {
		return OutputName_3_5_6;
	}

	public void setOutputName_3_5_1(Float value) {
		this.OutputName_3_5_1 = value;
	}

	public void setOutputName_3_5_2(Integer value) {
		this.OutputName_3_5_2 = value;
	}

	public void setOutputName_3_5_3(Integer value) {
		this.OutputName_3_5_3 = value;
	}

	public void setOutputName_3_5_4(Float value) {
		this.OutputName_3_5_4 = value;
	}

	public void setOutputName_3_5_5(String value) {
		this.OutputName_3_5_5 = value;
	}

	public void setOutputName_3_5_6(Integer value) {
		this.OutputName_3_5_6 = value;
	}

}
