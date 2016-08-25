package sp_manager.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_4")
@XmlType(name = "outputDataClassName_5_4", propOrder = { "OutputName_5_4_1" })
public class OutputDataClassName_5_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_4_1")
	protected String OutputName_5_4_1;

	public String getOutputName_5_4_1() {
		return OutputName_5_4_1;
	}

	public void setOutputName_5_4_1(String value) {
		this.OutputName_5_4_1 = value;
	}

}
