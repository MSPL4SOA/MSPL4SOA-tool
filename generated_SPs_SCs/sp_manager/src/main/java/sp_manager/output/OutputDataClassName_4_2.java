package sp_manager.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_2")
@XmlType(name = "outputDataClassName_4_2", propOrder = { "OutputName_4_2_1" })
public class OutputDataClassName_4_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_2_1")
	protected Float OutputName_4_2_1;

	public Float getOutputName_4_2_1() {
		return OutputName_4_2_1;
	}

	public void setOutputName_4_2_1(Float value) {
		this.OutputName_4_2_1 = value;
	}

}
