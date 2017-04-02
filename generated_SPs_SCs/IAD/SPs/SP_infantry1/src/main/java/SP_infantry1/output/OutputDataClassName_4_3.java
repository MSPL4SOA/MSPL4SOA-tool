package SP_infantry1.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_3")
@XmlType(name = "outputDataClassName_4_3", propOrder = { "OutputName_4_3_1" })
public class OutputDataClassName_4_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_3_1")
	protected String OutputName_4_3_1;

	public String getOutputName_4_3_1() {
		return OutputName_4_3_1;
	}

	public void setOutputName_4_3_1(String value) {
		this.OutputName_4_3_1 = value;
	}

}
