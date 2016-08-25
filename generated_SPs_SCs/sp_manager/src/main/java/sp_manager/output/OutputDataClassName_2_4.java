package sp_manager.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_2_4")
@XmlType(name = "outputDataClassName_2_4", propOrder = { "OutputName_2_4_1",
		"OutputName_2_4_2" })
public class OutputDataClassName_2_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_2_4_1")
	protected Integer OutputName_2_4_1;
	@XmlElement(name = "OutputName_2_4_2")
	protected Integer OutputName_2_4_2;

	public Integer getOutputName_2_4_1() {
		return OutputName_2_4_1;
	}

	public Integer getOutputName_2_4_2() {
		return OutputName_2_4_2;
	}

	public void setOutputName_2_4_1(Integer value) {
		this.OutputName_2_4_1 = value;
	}

	public void setOutputName_2_4_2(Integer value) {
		this.OutputName_2_4_2 = value;
	}

}
