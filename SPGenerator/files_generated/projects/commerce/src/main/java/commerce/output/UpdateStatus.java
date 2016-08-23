package commerce.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "UpdateStatus")
@XmlType(name = "updateStatus", propOrder = { "status" })
public class UpdateStatus implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "status")
	protected Integer status;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer value) {
		this.status = value;
	}

}
