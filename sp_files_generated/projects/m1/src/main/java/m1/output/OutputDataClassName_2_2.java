package m1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_2_2")
@XmlType(name = "outputDataClassName_2_2", propOrder = { "OutputName_2_2_1" })
public class OutputDataClassName_2_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_2_2_1")
	protected Integer OutputName_2_2_1;

	public Integer getOutputName_2_2_1() {
		return OutputName_2_2_1;
	}

	public void setOutputName_2_2_1(Integer value) {
		this.OutputName_2_2_1 = value;
	}

}
