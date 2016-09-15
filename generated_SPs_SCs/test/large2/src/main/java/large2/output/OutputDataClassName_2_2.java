package large2.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_2_2")
@XmlType(name = "outputDataClassName_2_2", propOrder = { "OutputName_2_2_2",
		"OutputName_2_2_3", "OutputName_2_2_4", "OutputName_2_2_5",
		"OutputName_2_2_1" })
public class OutputDataClassName_2_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_2_2_2")
	protected Integer OutputName_2_2_2;
	@XmlElement(name = "OutputName_2_2_3")
	protected Integer OutputName_2_2_3;
	@XmlElement(name = "OutputName_2_2_4")
	protected Float OutputName_2_2_4;
	@XmlElement(name = "OutputName_2_2_5")
	protected Float OutputName_2_2_5;
	@XmlElement(name = "OutputName_2_2_1")
	protected Integer OutputName_2_2_1;

	public Integer getOutputName_2_2_2() {
		return OutputName_2_2_2;
	}

	public Integer getOutputName_2_2_3() {
		return OutputName_2_2_3;
	}

	public Float getOutputName_2_2_4() {
		return OutputName_2_2_4;
	}

	public Float getOutputName_2_2_5() {
		return OutputName_2_2_5;
	}

	public Integer getOutputName_2_2_1() {
		return OutputName_2_2_1;
	}

	public void setOutputName_2_2_2(Integer value) {
		this.OutputName_2_2_2 = value;
	}

	public void setOutputName_2_2_3(Integer value) {
		this.OutputName_2_2_3 = value;
	}

	public void setOutputName_2_2_4(Float value) {
		this.OutputName_2_2_4 = value;
	}

	public void setOutputName_2_2_5(Float value) {
		this.OutputName_2_2_5 = value;
	}

	public void setOutputName_2_2_1(Integer value) {
		this.OutputName_2_2_1 = value;
	}

}
