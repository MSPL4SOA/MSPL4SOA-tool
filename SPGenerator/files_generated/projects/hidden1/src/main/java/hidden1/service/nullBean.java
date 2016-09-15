package hidden1.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import hidden1.input.InputDataClassName_1_1;
import hidden1.input.InputDataClassName_1_2;

import hidden1.output.OutputDataClassName_1_1;
import hidden1.output.OutputDataClassName_1_2;


import hidden1.state.State_null_CapabilityName_1_1;
import hidden1.state.State_null_CapabilityName_1_2;

import hidden1.util.ConsumerHeader;


@Service($service.interfaceName.class)
public class nullBean implements $service.interfaceName {

	@Inject
	private Context context;


	@Inject
	State_null_CapabilityName_1_1 instanceState_null_CapabilityName_1_1;
	@Inject
	State_null_CapabilityName_1_2 instanceState_null_CapabilityName_1_2;



	@Override
    public  OutputDataClassName_1_1  CapabilityName_1_1 (
    	                   InputDataClassName_1_1 inputDataClassName_1_1
                ){ 
    // TODO Auto-generated stub
    
    System.out.println("\\\\******* The output of $service.interfaceName : CapabilityName_1_1 : ********//");
    
        	System.out.println("InputName_1_1_1 : " + inputDataClassName_1_1.getInputName_1_1_1());
        	System.out.println("InputName_1_1_2 : " + inputDataClassName_1_1.getInputName_1_1_2());
        
    
        OutputDataClassName_1_1 out = new OutputDataClassName_1_1();
    
        	    	    	
    	out.setOutputName_1_1_2(Integer.valueOf("250"));
        	    	    	
    	out.setOutputName_1_1_3(Float.valueOf("397"));
        	    	    	
    	out.setOutputName_1_1_1(Float.valueOf("130"));
        
         
     
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
	   	 
        	instanceState_null_CapabilityName_1_1.setState(instanceState_null_CapabilityName_1_1.getState() + " $service.interfaceName CapabilityName_1_1");
        
        return out; 
        }

	@Override
    public  OutputDataClassName_1_2  CapabilityName_1_2 (
    	                   InputDataClassName_1_2 inputDataClassName_1_2
                ){ 
    // TODO Auto-generated stub
    
    System.out.println("\\\\******* The output of $service.interfaceName : CapabilityName_1_2 : ********//");
    
        	System.out.println("InputName_1_2_1 : " + inputDataClassName_1_2.getInputName_1_2_1());
        
    
        OutputDataClassName_1_2 out = new OutputDataClassName_1_2();
    
        	    	    	
    	out.setOutputName_1_2_1("CapabilityName_1_2");
        	    	    	
    	out.setOutputName_1_2_2(Float.valueOf("730"));
        
         
     
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
	   	 
        	instanceState_null_CapabilityName_1_2.setState(instanceState_null_CapabilityName_1_2.getState() + " $service.interfaceName CapabilityName_1_2");
        
        return out; 
        }

}
