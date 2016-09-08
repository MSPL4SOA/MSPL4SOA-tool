package a1.validator;

import javax.inject.Named;
import org.w3c.dom.Element;
import org.switchyard.annotations.Validator;
import org.switchyard.validate.ValidationResult;

@Named("MyValidatorBean")
public class Validators_soap_ServiceName_1 {
	
	
    @Validator(name = "{urn:a1:a1:1.0}CapabilityName_1_1")
    public ValidationResult validate(Element from) {
    	
    	System.out.println("Validator");
		return null;
       // handle validation here
    }
}