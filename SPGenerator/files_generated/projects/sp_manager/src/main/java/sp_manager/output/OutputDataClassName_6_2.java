package sp_manager.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_2")
@XmlType(name = "outputDataClassName_6_2", propOrder = { "OutputName_6_2_1",
		"OutputName_6_2_2" })
public class OutputDataClassName_6_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_2_1")
	protected Float OutputName_6_2_1;
	@XmlElement(name = "OutputName_6_2_2")
	protected Float OutputName_6_2_2;

	public Float getOutputName_6_2_1() {
		return OutputName_6_2_1;
	}

	public Float getOutputName_6_2_2() {
		return OutputName_6_2_2;
	}

	public void setOutputName_6_2_1(Float value) {
		this.OutputName_6_2_1 = value;
	}

	public void setOutputName_6_2_2(Float value) {
		this.OutputName_6_2_2 = value;
	}

}
