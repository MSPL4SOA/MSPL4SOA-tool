package sp_manager.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_7_3")
@XmlType(name = "outputDataClassName_7_3", propOrder = { "OutputName_7_3_1" })
public class OutputDataClassName_7_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_7_3_1")
	protected Float OutputName_7_3_1;

	public Float getOutputName_7_3_1() {
		return OutputName_7_3_1;
	}

	public void setOutputName_7_3_1(Float value) {
		this.OutputName_7_3_1 = value;
	}

}
