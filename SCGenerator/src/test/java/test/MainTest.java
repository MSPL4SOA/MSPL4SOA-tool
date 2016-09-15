package test;

import java.util.Random;
import java.util.Set;
import java.util.logging.Logger;

import features.bean.Capability;
import fr.unice.polytech.modalis.familiar.operations.CountingStrategy;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.Variable;
import jms.JMSFactory;
import scfactory.FMBDD;
import util.Functions;

public class MainTest {

	// Mondatory
	private static final Logger log = Logger.getLogger(MainTest.class.getName());

	public static void main(String[] args) throws Exception {

		// FMBDD fmbdd = FMBDD.getInstance();

		log.info("Found destination \"");

		// FeatureModelVariable fmvSC = fmbdd.FM("fm",
		// "Root:Service_1;Service_1: ServiceName_1
		// Capability_1_1;Capability_1_1: OutputData_1_1_1
		// CommunicationTechnologie_1_1 [Authentification_1_1]
		// [StateMessaging_1_1] CapabilityName_1_1;CommunicationTechnologie_1_1:
		// ResponseHandler_1_1 (SOAP_1_1|REST_1_1|MOM_1_1);ResponseHandler_1_1:
		// (Synchronous_1_1|Asynchronous_1_1);REST_1_1:
		// (Post_1_1|Get_1_1|Put_1_1|Delete_1_1);MOM_1_1: AsynchronousQueue_1_1
		// [PublishSubscribe_1_1] [Transactional_1_1]
		// [Reliability_1_1];PublishSubscribe_1_1:
		// [Durable_1_1];Reliability_1_1:
		// (PersistentDelivery_1_1|Acknowledgement_1_1)+;StateMessaging_1_1:
		// (TwoWayState_1_1|StateRepository_1_1|TemporaryMemory_1_1)+;Authentification_1_1:
		// Username_1_1 Password_1_1;OutputData_1_1_1: OutputName_1_1_1
		// OutputType_1_1_1;MOM_1_1 implies (Transactional_1_1 or
		// Acknowledgement_1_1);Transactional_1_1 implies
		// !Acknowledgement_1_1;");
		//
		// FeatureModelVariable fmvSPSpec = fmbdd.FM("fm",
		// "Root:Service_1;Service_1: ServiceName_1
		// Capability_1_1;Capability_1_1: OutputData_1_1_1
		// CommunicationTechnologie_1_1 [Authentification_1_1] ServiceState_1_1
		// CapabilityName_1_1;CommunicationTechnologie_1_1:
		// (SOAP_1_1|REST_1_1|MOM_1_1);REST_1_1: Get_1_1;MOM_1_1:
		// AsynchronousQueue_1_1 [PublishSubscribe_1_1]
		// Reliability_1_1;PublishSubscribe_1_1: [Durable_1_1];Reliability_1_1:
		// PersistentDelivery_1_1 Acknowledgement_1_1;ServiceState_1_1:
		// StateMessaging_1_1 StatefulService_1_1;StateMessaging_1_1:
		// TwoWayState_1_1;StatefulService_1_1:
		// StateRepository_1_1;OutputData_1_1_1: OutputName_1_1_1
		// OutputType_1_1_1;");
		//
		// System.out.println(fmvSC);
		// System.out.println("-------------------");
		// System.out.println(fmvSPSpec);

		// FeatureModelVariable fmvSC =
		// fmbdd.FM("fm",Functions.fileToString("./files/fm_sc_update.fml"));
		//
		// System.out.println("GO!!");
		// System.out.println(fmvSC.configsBDD().size());

		// fmvFM = fmbdd.FM("fm", "R: a [b] [c]; a implies (b or c); b implies
		// !c;");
		//
		// Set<Variable> vars = fmvFM.configs();
		// //
		// for (Variable variable : vars) {
		// System.out.println(variable.getValue());
		// }

		// Capability c1 = new Capability();
		// c1.asynchronousResponseHandlerExist = true;
		//
		// Capability c2 = c1.clone();
		// c2.asynchronousResponseHandlerExist = false;
		//
		// System.out.println(c2.asynchronousResponseHandlerExist);
		//
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		// String in = util.Functions.fileToString("/home/akram/Bureau/am");
		//
		// FeatureModelVariable fmvFM = fmbdd.FM("fm", "Root: Service_1
		// ;Service_1: Capability_1_1 ServiceName_1_eq_ServiceName_1
		// ;Capability_1_1: StateMessaging_1_1 InputData_1_1_2 OutputData_1_1_2
		// InputData_1_1_1 CommunicationTechnologie_1_1 Authentification_1_1
		// OutputData_1_1_1 CapabilityName_1_1_eq_CapabilityName_1_1
		// ;StateMessaging_1_1: TwoWayState_1_1 StateRepository_1_1
		// TemporaryMemory_1_1 ;InputData_1_1_2: InputValue_1_1_2_eq_1
		// InputName_1_1_2_eq_InputName_1_1_2 InputType_1_1_2_eq_Integer
		// ;OutputData_1_1_2: OutputType_1_1_2_eq_String ResponseHandler_1_1_2
		// OutputName_1_1_2_eq_OutputName_1_1_2 ;InputData_1_1_1:
		// InputName_1_1_1_eq_InputName_1_1_1 InputValue_1_1_1_eq_2
		// InputType_1_1_1_eq_Float ;CommunicationTechnologie_1_1: MOM_1_1
		// ;Authentification_1_1: Username_1_1_eq_admin Password_1_1_eq_pass
		// ;OutputData_1_1_1: ResponseHandler_1_1_1
		// OutputName_1_1_1_eq_OutputName_1_1_1 OutputType_1_1_1_eq_Integer
		// ;ResponseHandler_1_1_2: Asynchronous_1_1_2 ;MOM_1_1:
		// AsynchronousQueue_1_1 PublishSubscribe_1_1 Reliability_1_1
		// ;ResponseHandler_1_1_1: Asynchronous_1_1_1;PublishSubscribe_1_1:
		// Durable_1_1 ;Reliability_1_1: Acknowledgement_1_1
		// PersistentDelivery_1_1 ;");
		//
		//// fmvFM = fmbdd.FM("fm",in);
		//
		//// System.out.println(fmvFM.extract("Capability_1_1"));
		//
		//// TextEditor.checkAttributesValue(fmvFM);
		//
		// System.out.println(new FeatureModelVariable("eza",
		// fmvFM.extract("Capability_1_1")));

		// System.out.println(RandomStringUtils.random(16, 0, 20, true, true,
		// "abcdefghijklmnopqrstuvwxyz".toCharArray()));
	}

	public static int randInt(int min, int max) {

		// Usually this can be a field rather than a method variable
		Random rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}
}
