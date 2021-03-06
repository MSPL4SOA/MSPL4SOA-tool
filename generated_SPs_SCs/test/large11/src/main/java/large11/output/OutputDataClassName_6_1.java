package large11.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_1")
@XmlType(name = "outputDataClassName_6_1", propOrder = { "OutputName_6_1_1" })
public class OutputDataClassName_6_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_1_1")
	protected Float OutputName_6_1_1;

	public Float getOutputName_6_1_1() {
		return OutputName_6_1_1;
	}

	public void setOutputName_6_1_1(Float value) {
		this.OutputName_6_1_1 = value;
	}

}
