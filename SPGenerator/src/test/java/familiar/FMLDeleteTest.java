package familiar;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import fr.unice.polytech.modalis.familiar.test.FMLTest;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;


public class FMLDeleteTest extends FMLTest {

	@Test
	public void testIdea() throws Exception {

		System.out.println("Start");
		fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable fmToDelete;
		Set<String> fts = new HashSet<String>();
		fts.add("Authentification_1_1");


//		fmToDelete = FM("m1", "a: (b|c) d;b: [f] [g] k; g implies f;\n");
		
		//prime
		
		String fm = "Capability_1_1: StateMessaging_1_1 CapabilityName_1_1 CommunicationTechnologie_1_1 [Authentification_1_1] OutputData_1_1_1 ;StateMessaging_1_1: TwoWayState_1_1 [StateRepository_1_1] [TemporaryMemory_1_1] ;CommunicationTechnologie_1_1: (SOAP_1_1|REST_1_1|MOM_1_1) ResponseHandler_1_1 ;Authentification_1_1: Username_1_1 Password_1_1 ;OutputData_1_1_1: OutputType_1_1_1 OutputName_1_1_1 ;ResponseHandler_1_1: (Synchronous_1_1|Asynchronous_1_1) ;REST_1_1: Get_1_1 ;MOM_1_1: AsynchronousQueue_1_1 [PublishSubscribe_1_1] ;PublishSubscribe_1_1: [Durable_1_1] ;";
		fmToDelete = FM("m1",fm);

		
//		fts.add("Authentification_1_2");
		// assertNotNull(fmToPreserve);
		// assertNotNull(fmToUpdate);

		FeatureModelVariable fmUpdated = FMDeleteBDD.deleteFM2(fmToDelete, fts);
		System.out.println("Result");
		System.out.println(fmUpdated);
		System.out.println("End");

//		Root: "Service_1" ; 
//		"Service_1": ("Capability_1_1"|"Capability_1_2") "ServiceName_1_eq_ServiceName_1" ; 
//		"Capability_1_1": "InputData_1_1_2" "StateMessaging_1_1" "OutputData_1_1_2" "InputData_1_1_1" "CommunicationTechnologie_1_1" "InputDataClassName_1_1_eq_InputDataClassName_1_1" "OutputDataClassName_1_1_eq_OutputDataClassName_1_1" "CapabilityName_1_1_eq_CapabilityName_1_1" "OutputData_1_1_1" ; 
//		"Capability_1_2": "InputDataClassName_1_2_eq_InputDataClassName_1_2" "InputData_1_2_1" "CommunicationTechnologie_1_2" "CapabilityName_1_2_eq_CapabilityName_1_2" ; 
//		"InputData_1_1_2": "InputValue_1_1_2" "InputName_1_1_2_eq_InputName_1_1_2" "InputType_1_1_2_eq_Integer" ; 
//		"StateMessaging_1_1": "TwoWayState_1_1" ["StateRepository_1_1"] ["TemporaryMemory_1_1"] ; 
//		"OutputData_1_1_2": "OutputType_1_1_2_eq_Integer" "OutputName_1_1_2_eq_OutputName_1_1_2" ; 
//		"InputData_1_1_1": "InputType_1_1_1_eq_String" "InputName_1_1_1_eq_InputName_1_1_1" "InputValue_1_1_1" ; 
//		"CommunicationTechnologie_1_1": ("SOAP_1_1"|"REST_1_1"|"MOM_1_1") "ResponseHandler_1_1" ; 
//		"OutputData_1_1_1": "OutputType_1_1_1_eq_Float" "OutputName_1_1_1_eq_OutputName_1_1_1" ; 
//		"InputData_1_2_1": "InputType_1_2_1_eq_Float" "InputName_1_2_1_eq_InputName_1_2_1" "InputValue_1_2_1" ; 
//		"CommunicationTechnologie_1_2": ("REST_1_2"|"MOM_1_2"|"SOAP_1_2") ; 
//		"ResponseHandler_1_1": ("Synchronous_1_1"|"Asynchronous_1_1") ; 
//		"REST_1_1": "Get_1_1" ; 
//		"MOM_1_1": ("Reliability_1_1"|"Transactional_1_1")+ "AsynchronousQueue_1_1" ["PublishSubscribe_1_1"] ; 
//		"REST_1_2": "Post_1_2" ; 
//		"MOM_1_2": ("Transactional_1_2"|"Reliability_1_2")+ "AsynchronousQueue_1_2" ; 
//		"PublishSubscribe_1_1": ["Durable_1_1"] ; 
//		"Reliability_1_1": ("Acknowledgement_1_1"|"PersistentDelivery_1_1")+ ; 
//		"Reliability_1_2": ("PersistentDelivery_1_2"|"Acknowledgement_1_2")+ ; 
//		("MOM_1_1" -> ("Transactional_1_1" | "Acknowledgement_1_1"));
//		("MOM_1_2" -> ("Transactional_1_2" | "Acknowledgement_1_2"));
//		("Transactional_1_1" -> !"Acknowledgement_1_1");
//		("Transactional_1_2" -> !"Acknowledgement_1_2");
	}
}
