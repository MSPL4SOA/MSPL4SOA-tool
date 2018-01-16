package SP_all.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_5")
@XmlType(name = "outputDataClassName_4_5", propOrder = { "OutputName_4_5_1",
		"OutputName_4_5_2", "OutputName_4_5_3" })
public class OutputDataClassName_4_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_5_1")
	protected Integer OutputName_4_5_1;
	@XmlElement(name = "OutputName_4_5_2")
	protected Float OutputName_4_5_2;
	@XmlElement(name = "OutputName_4_5_3")
	protected Integer OutputName_4_5_3;

	public Integer getOutputName_4_5_1() {
		return OutputName_4_5_1;
	}

	public Float getOutputName_4_5_2() {
		return OutputName_4_5_2;
	}

	public Integer getOutputName_4_5_3() {
		return OutputName_4_5_3;
	}

	public void setOutputName_4_5_1(Integer value) {
		this.OutputName_4_5_1 = value;
	}

	public void setOutputName_4_5_2(Float value) {
		this.OutputName_4_5_2 = value;
	}

	public void setOutputName_4_5_3(Integer value) {
		this.OutputName_4_5_3 = value;
	}

}
