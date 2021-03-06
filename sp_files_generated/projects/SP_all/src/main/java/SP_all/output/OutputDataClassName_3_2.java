package SP_all.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_3_2")
@XmlType(name = "outputDataClassName_3_2", propOrder = { "OutputName_3_2_1",
		"OutputName_3_2_2" })
public class OutputDataClassName_3_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_3_2_1")
	protected Integer OutputName_3_2_1;
	@XmlElement(name = "OutputName_3_2_2")
	protected Float OutputName_3_2_2;

	public Integer getOutputName_3_2_1() {
		return OutputName_3_2_1;
	}

	public Float getOutputName_3_2_2() {
		return OutputName_3_2_2;
	}

	public void setOutputName_3_2_1(Integer value) {
		this.OutputName_3_2_1 = value;
	}

	public void setOutputName_3_2_2(Float value) {
		this.OutputName_3_2_2 = value;
	}

}
