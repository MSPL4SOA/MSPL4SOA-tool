package SP_all.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_4")
@XmlType(name = "outputDataClassName_5_4", propOrder = { "OutputName_5_4_3",
		"OutputName_5_4_1", "OutputName_5_4_2" })
public class OutputDataClassName_5_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_4_3")
	protected Float OutputName_5_4_3;
	@XmlElement(name = "OutputName_5_4_1")
	protected Integer OutputName_5_4_1;
	@XmlElement(name = "OutputName_5_4_2")
	protected Float OutputName_5_4_2;

	public Float getOutputName_5_4_3() {
		return OutputName_5_4_3;
	}

	public Integer getOutputName_5_4_1() {
		return OutputName_5_4_1;
	}

	public Float getOutputName_5_4_2() {
		return OutputName_5_4_2;
	}

	public void setOutputName_5_4_3(Float value) {
		this.OutputName_5_4_3 = value;
	}

	public void setOutputName_5_4_1(Integer value) {
		this.OutputName_5_4_1 = value;
	}

	public void setOutputName_5_4_2(Float value) {
		this.OutputName_5_4_2 = value;
	}

}
