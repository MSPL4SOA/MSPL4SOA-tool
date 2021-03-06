package test;

import familiar.FMBDD;
import familiar.FMFactory;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;

public class GetFeatureTest {

	public static void main(String[] args) throws Exception {

		String fm = "ServiceContract: \"Service_1\" ;\"Service_1\": \"Capability_1_1\" \"ServiceName_1=ServiceName_1\" ;\"Capability_1_1\": \"InputData_1_1_1\" \"ServiceState_1_1\" \"CommunicationTechnologie_1_1\" [\"Authentification_1_1\"] \"CapabilityName_1_1=CapabilityName_1_1\" \"InputDataClassName_1_1=InputDataClassName_1_1\" \"OutputData_1_1_1\" \"OutputDataClassName_1_1=OutputDataClassName_1_1\" ;\"InputData_1_1_1\": \"InputType_1_1_1=Float\" \"InputName_1_1_1=InputName_1_1_1\" ;\"ServiceState_1_1\": \"StateMessaging_1_1\" \"StatefulService_1_1\" ;\"CommunicationTechnologie_1_1\": (\"SOAP_1_1\"|\"REST_1_1\"|\"MOM_1_1\") ;\"OutputData_1_1_1\": \"OutputName_1_1_1=OutputName_1_1_1\" \"OutputType_1_1_1=Float\" ;\"StateMessaging_1_1\": \"TwoWayState_1_1\" ;\"StatefulService_1_1\": \"StateRepository_1_1\" ;\"REST_1_1\": \"Get_1_1\" ;\"MOM_1_1\": \"AsynchronousQueue_1_1\" [\"PublishSubscribe_1_1\"] \"Reliability_1_1\" ;\"PublishSubscribe_1_1\": [\"Durable_1_1\"] ;\"Reliability_1_1\": \"Acknowledgement_1_1\" \"PersistentDelivery_1_1\" ;";

		FeatureModelVariable fmv = FMBDD.getInstance().FM("aez", fm);
		
		String result = "";
		
		for (String feature : fmv.getFeature("Service_1").children().names()) {

			if (!feature.matches("Capability_.*"))
				result += FMFactory.addQuote(feature) + " ";

		}
		
		System.out.println(result);
		
	}
}
