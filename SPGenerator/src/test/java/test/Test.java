package test;

import org.apache.velocity.runtime.RuntimeConstants;

import familiar.FMBDD;
import familiar.FMFactory;
import familiar.FMUpdateBDD;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import generating.SwitchyardProject;

public class Test {

	public static void main(String[] args) throws Exception {
		
		
		
		
		FMBDD.getInstance().FM("fm_sc_update",
				util.Functions.fileToString("/home/akram/Desktop/fm2.fml").replaceAll("_eq_", "="));

		
		System.exit(-1);
		
		// VelocityEngine ve = new VelocityEngine();
		// ve.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH,
		// SwitchyardProject.getVelocityResourcePath(""));
		// ve.init();
		//
		// /* add that list to a VelocityContext */
		// VelocityContext context = new VelocityContext();
		// StringWriter writer = new StringWriter();
		//
		// /* get the Template */
		// Template t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR +
		// "bean_impl.vm");
		// context.put("math", new MathTool());
		// /* now render the template into a Writer */
		// t.merge(context, writer);
		// System.out.println(writer);

		// FMUpdateBDD fmbdd = new FMUpdateBDD();
		//
		// FeatureModelVariable fmvSC = fmbdd.FM("fm", "R: [a] [b]; a: (c|d)+; b
		// implies !c; R implies (b or c);");
		//
		// ;
		//
		//
		// KSynthesisBDD fdsf = new KSynthesisBDD(new
		// FormulaAnalyzer<String>(fmvSC.getFormula(),
		// fmbdd._builder).removeDeadFeatures(),
		// new KnowledgeSynthesis(fmvSC.getHierarchy().getDiagram()),
		// fmbdd._builder);
		//
		// FeatureModelVariable fmvSC0 = fdsf.build();
		//
		// System.out.println(fmvSC0.toString());
		//
		//// System.out.println("----------------");
		////
		//// KSynthesisSAT kSynthesisSAT = new KSynthesisSAT(fmvSC,
		//// new KnowledgeSynthesis(fmvSC.getHierarchy().getDiagram()));
		////
		//// System.out.println(kSynthesisSAT.build());
		//
		//
		// System.out.println("----------------");
		//
		// FeatureModelVariable fmvSC2 = fmbdd.FM("fm2", fmvSC0.toString());
		//
		// System.out.println(fmvSC0.getSyntacticalRepresentationWithoutCst());
		//
		// for (Variable string : fmvSC0.configs()) {
		// System.out.println(string.getValue());
		// }
		//
		// System.out.println("_____________");
		//
		// for (Variable string : fmvSC2.configs()) {
		// System.out.println(string.getValue());
		// }

		FMFactory fmFactory = new FMFactory();
		fmFactory.Init();

		FeatureModelVariable fmvSC = FMBDD.getInstance().FM("fm",
				"Root:Service_1;Service_1: ServiceName_1 Capability_1_1;Capability_1_1:   OutputData_1_1_1 CommunicationTechnologie_1_1 [Authentification_1_1] [StateMessaging_1_1] CapabilityName_1_1;CommunicationTechnologie_1_1: ResponseHandler_1_1 (SOAP_1_1|REST_1_1|MOM_1_1);ResponseHandler_1_1: (Synchronous_1_1|Asynchronous_1_1);REST_1_1: (Post_1_1|Get_1_1|Put_1_1|Delete_1_1);MOM_1_1: AsynchronousQueue_1_1 [PublishSubscribe_1_1];PublishSubscribe_1_1: [Durable_1_1];StateMessaging_1_1: (TwoWayState_1_1|StateRepository_1_1|TemporaryMemory_1_1)+;Authentification_1_1: Username_1_1 Password_1_1;OutputData_1_1_1: OutputName_1_1_1 OutputType_1_1_1;");
		// Root:Service_1;Service_1: ServiceName_1
		// Capability_1_1;Capability_1_1: OutputData_1_1_1
		// CommunicationTechnologie_1_1 [Authentification_1_1]
		// [StateMessaging_1_1] CapabilityName_1_1;CommunicationTechnologie_1_1:
		// ResponseHandler_1_1 (SOAP_1_1|REST_1_1|MOM_1_1);ResponseHandler_1_1:
		// (Synchronous_1_1|Asynchronous_1_1);REST_1_1:
		// (Post_1_1|Get_1_1|Put_1_1|Delete_1_1);MOM_1_1: AsynchronousQueue_1_1
		// [PublishSubscribe_1_1];PublishSubscribe_1_1:
		// [Durable_1_1];StateMessaging_1_1:
		// (TwoWayState_1_1|StateRepository_1_1|TemporaryMemory_1_1)+;Authentification_1_1:
		// Username_1_1 Password_1_1;OutputData_1_1_1: OutputName_1_1_1
		// OutputType_1_1_1;
		FeatureModelVariable fmvSPSpec = FMBDD.getInstance().FM("fm",
				"Root:Service_1;Service_1: ServiceName_1 Capability_1_1;Capability_1_1:   OutputData_1_1_1 CommunicationTechnologie_1_1 ServiceState_1_1 CapabilityName_1_1;CommunicationTechnologie_1_1: (SOAP_1_1|REST_1_1|MOM_1_1);REST_1_1: Get_1_1;MOM_1_1: AsynchronousQueue_1_1 [PublishSubscribe_1_1] Reliability_1_1;PublishSubscribe_1_1: [Durable_1_1];Reliability_1_1: PersistentDelivery_1_1 Acknowledgement_1_1;ServiceState_1_1: StateMessaging_1_1 StatefulService_1_1;StateMessaging_1_1: TwoWayState_1_1;StatefulService_1_1: StateRepository_1_1;OutputData_1_1_1: OutputName_1_1_1 OutputType_1_1_1;");

		// System.out.println(fmvSC);
		// System.out.println("-------------------");
		// System.out.println(fmvSPSpec);
		System.out.println("-------------------");

//		String fmSCUpdate = fmFactory.updateAndDelete(fmvSPSpec.toString(), fmvSC.toString());
//
//		System.out.println(FMBDD.getInstance().FM("fm", fmSCUpdate).toString());
	}

}
