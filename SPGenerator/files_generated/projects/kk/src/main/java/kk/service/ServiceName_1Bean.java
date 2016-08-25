package kk.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import kk.input.InputDataClassName_1_1;

import kk.output.OutputDataClassName_1_1;


import kk.state.State_ServiceName_1_CapabilityName_1_1;

import kk.util.ConsumerHeader;


@Service(ServiceName_1.class)
public class ServiceName_1Bean implements ServiceName_1 {

	@Inject
	private Context context;


	@Inject
	State_ServiceName_1_CapabilityName_1_1 instanceState_ServiceName_1_CapabilityName_1_1;



	@Override
    public  OutputDataClassName_1_1  CapabilityName_1_1 (
    	                   InputDataClassName_1_1 inputDataClassName_1_1
                ){ 
    // TODO Auto-generated stub
    
    System.out.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_1 : ********//");
    
        	System.out.println("InputName_1_1_1 : " + inputDataClassName_1_1.getInputName_1_1_1());
        	System.out.println("InputName_1_1_2 : " + inputDataClassName_1_1.getInputName_1_1_2());
        
    
        OutputDataClassName_1_1 out = new OutputDataClassName_1_1();
    
        	    	    	
    	out.setOutputName_1_1_1(Float.valueOf("894"));
        	    	    	
    	out.setOutputName_1_1_2(Integer.valueOf("312"));
        	    	    	
    	out.setOutputName_1_1_3(Integer.valueOf("917"));
        
         
     
          boolean checkAuth = ConsumerHeader.checkAuthentification(context);  
     if(checkAuth == true){
   	 	// TODO Auto-generated stub
   	 	System.out.println("Correct authentification");
   	 }
   	 else{
   	 // TODO Auto-generated stub
   	 	System.out.println("Incorrect authentification");
   	 }
   	    	 
   	   	// TODO Auto-generated stub
		System.out.println("State header in: " + ConsumerHeader.getConsumerState(context));
	   	 
        	instanceState_ServiceName_1_CapabilityName_1_1.setState(instanceState_ServiceName_1_CapabilityName_1_1.getState() + " ServiceName_1 CapabilityName_1_1");
        
        return out; 
        }

}
