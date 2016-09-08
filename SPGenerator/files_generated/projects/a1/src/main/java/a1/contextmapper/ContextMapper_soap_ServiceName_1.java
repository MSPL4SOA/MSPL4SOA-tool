package a1.contextmapper;


import org.switchyard.Context;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPContextMapper;

public class ContextMapper_soap_ServiceName_1 extends SOAPContextMapper {
	
	@Override
	public void mapFrom(SOAPBindingData source, Context context) throws Exception {
		
		System.out.println("MapFrom");
		// TODO Auto-generated method stub
		super.mapFrom(source, context);
	}
	
	@Override
	public void mapTo(Context context, SOAPBindingData target) throws Exception {
		
		System.out.println("MapTo");
		// TODO Auto-generated method stub
		super.mapTo(context, target);
	}
	

}
