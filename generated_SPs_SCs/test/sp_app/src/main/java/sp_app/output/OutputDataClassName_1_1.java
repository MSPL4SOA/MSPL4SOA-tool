package sp_app.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_1")
@XmlType(name = "outputDataClassName_1_1", propOrder = {
        	"OutputName_1_1_1"
    	            , 
                	"OutputName_1_1_2"
    	            , 
                	"OutputName_1_1_3"
    	            , 
                	"OutputName_1_1_4"
    	    })
public class OutputDataClassName_1_1 implements Serializable {
	
	private static final long serialVersionUID = 1L;

    	    		@XmlElement(name = "OutputName_1_1_1")
    		protected Float OutputName_1_1_1;
    	    		@XmlElement(name = "OutputName_1_1_2")
    		protected String OutputName_1_1_2;
    	    		@XmlElement(name = "OutputName_1_1_3")
    		protected String OutputName_1_1_3;
    	    		@XmlElement(name = "OutputName_1_1_4")
    		protected Float OutputName_1_1_4;
    	
		    		public Float getOutputName_1_1_1()
    		{
    			return OutputName_1_1_1;
    		}
    	    		public String getOutputName_1_1_2()
    		{
    			return OutputName_1_1_2;
    		}
    	    		public String getOutputName_1_1_3()
    		{
    			return OutputName_1_1_3;
    		}
    	    		public Float getOutputName_1_1_4()
    		{
    			return OutputName_1_1_4;
    		}
    	    	
    	    		public void setOutputName_1_1_1(Float value)
    		{
    			this.OutputName_1_1_1 = value;
    		}
    	    		public void setOutputName_1_1_2(String value)
    		{
    			this.OutputName_1_1_2 = value;
    		}
    	    		public void setOutputName_1_1_3(String value)
    		{
    			this.OutputName_1_1_3 = value;
    		}
    	    		public void setOutputName_1_1_4(Float value)
    		{
    			this.OutputName_1_1_4 = value;
    		}
    	
}