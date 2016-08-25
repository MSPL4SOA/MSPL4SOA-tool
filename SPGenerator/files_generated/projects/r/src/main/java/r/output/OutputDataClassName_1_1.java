package r.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_1")
@XmlType(name = "outputDataClassName_1_1", propOrder = { "OutputName_1_1_1",
		"OutputName_1_1_2" })
public class OutputDataClassName_1_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_1_1")
	protected Float OutputName_1_1_1;
	@XmlElement(name = "OutputName_1_1_2")
	protected Integer OutputName_1_1_2;

	public Float getOutputName_1_1_1() {
		return OutputName_1_1_1;
	}

	public Integer getOutputName_1_1_2() {
		return OutputName_1_1_2;
	}

	public void setOutputName_1_1_1(Float value) {
		this.OutputName_1_1_1 = value;
	}

	public void setOutputName_1_1_2(Integer value) {
		this.OutputName_1_1_2 = value;
	}

}
