package large3.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_7_3")
public class OutputDataClassName_7_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_7_3_3")
	protected Integer OutputName_7_3_3;
	@XmlElement(name = "OutputName_7_3_2")
	protected String OutputName_7_3_2;
	@XmlElement(name = "OutputName_7_3_1")
	protected String OutputName_7_3_1;
	@XmlElement(name = "OutputName_7_3_5")
	protected Integer OutputName_7_3_5;
	@XmlElement(name = "OutputName_7_3_4")
	protected Float OutputName_7_3_4;

	public Integer getOutputName_7_3_3() {
		return OutputName_7_3_3;
	}

	public String getOutputName_7_3_2() {
		return OutputName_7_3_2;
	}

	public String getOutputName_7_3_1() {
		return OutputName_7_3_1;
	}

	public Integer getOutputName_7_3_5() {
		return OutputName_7_3_5;
	}

	public Float getOutputName_7_3_4() {
		return OutputName_7_3_4;
	}

	public void setOutputName_7_3_3(Integer value) {
		this.OutputName_7_3_3 = value;
	}

	public void setOutputName_7_3_2(String value) {
		this.OutputName_7_3_2 = value;
	}

	public void setOutputName_7_3_1(String value) {
		this.OutputName_7_3_1 = value;
	}

	public void setOutputName_7_3_5(Integer value) {
		this.OutputName_7_3_5 = value;
	}

	public void setOutputName_7_3_4(Float value) {
		this.OutputName_7_3_4 = value;
	}

}
