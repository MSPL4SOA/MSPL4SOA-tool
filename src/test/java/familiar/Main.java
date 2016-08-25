package familiar;

import java.util.ArrayList;
import java.util.List;

import be.ac.fundp.info.TVLParser.Util.FeatureModel;
import fr.unice.polytech.modalis.familiar.fm.converter.S2T2Converter;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import gsd.synthesis.Expression;
import gsd.synthesis.ExpressionType;
import gsd.synthesis.FeatureGraphFactory;

public class Main {

	public static void main(String[] args) throws Exception {

		// // auto-formatting java code
		// FileSearch fileSearch = new FileSearch();
		// fileSearch.searchDirectory(new
		// File("/home/akram/Bureau/projects/dd1Artifact"), "^.*\\.java$");
		// for (String filePath : fileSearch.getResult()) {
		// JavaCodeFormatter.formattingCode(new File(filePath));
		// }
		//
		// System.exit(-1);

		// String fakeRootName = "root";
		// FeatureModel<String> aggregatedFM =
		// FMBuilder.getInternalFM(fakeRootName + " ;");
		//
		// FeatureGraph<String> aggregatedGraph = aggregatedFM.getDiagram();
		// FeatureNode<String> root = aggregatedGraph.findVertex(fakeRootName);
		//
		// String fakeRootName2 = "root";
		// FeatureModel<String> aggregatedFM2 =
		// FMBuilder.getInternalFM(fakeRootName2 + " ;");
		//
		// FeatureGraph<String> aggregatedGraph2 = aggregatedFM2.getDiagram();
		// FeatureNode<String> root2 =
		// aggregatedGraph2.findVertex(fakeRootName2);
		//
		// aggregatedGraph.addEdge(root, root2,FeatureEdge.OR);
		//
		// System.out.println(aggregatedGraph);
		// gsd.synthesis.FeatureModel<String> irFM =
		// FeatureGraphFactory.mkStringFactory().mkTopModel() ;
		//
		// irFM.features().add("a");
		// irFM.features().add("b");
		//
		// FeatureGraphFactory<String> fgf = new
		// FeatureGraphFactory<String>("top", "bottom");
		//
		//
		// List<Expression<String>> iExprs = new ArrayList<Expression<String>>()
		// ;
		// Expression<String> exp = new Expression<String>(ExpressionType.OR,
		// "a: f", "b: [r]");
		//
		// iExprs.add(exp);
		//
		// irFM.addAllConstraints(iExprs);
		//
		// System.out.println(exp);
		// FeatureGraph<String> fg = new FeatureGraph<String>("top", "bottom");

		// FeatureGraph<String> fg = FeatureGraph.mkStringFeatureGraph();
		//
		//
		// FeatureNode<String> fn = new FeatureNode<String>("feature");
		// FeatureNode<String> fn2 = new FeatureNode<String>("feature2");
		//
		// fg.addVertex(fn);
		// fg.addVertex(fn2);
		// fg.addEdge(fn, fn2, FeatureEdge.OR);
		//
		// System.out.println(fg);

		// System.exit(-1);
		//
		FMFactory fmFactory = new FMFactory();
		
		fmFactory.Init();
		fmFactory.buildFMs();
		//
//		  FMDeleteBDD fmDeleteBDD = new FMDeleteBDD();
//		//
//		FMUpdateBDD fmUpdateBDD = new FMUpdateBDD();

//		FeatureModelVariable spec = fmUpdateBDD.FM("tst","Root:(Service_1|Service_2|Service_3|Service_4|Service_5);Service_1: ServiceName_1_eq_ServiceName_1_5bb44168f4704fff9ad252eb63eb5985 Capability_1_1;Capability_1_1:  InputData_1_1_1 InputData_1_1_2  OutputData_1_1_1 OutputData_1_1_2 OutputData_1_1_3 OutputData_1_1_4 OutputData_1_1_5 CommunicationTechnologie_1_1 [Authentification_1_1] ServiceState_1_1 _eq__1_1_eq__eq__1_1_6fef3742aacf4eb6a0ab419126b53ef5;CommunicationTechnologie_1_1: (SOAP_1_1|REST_1_1|MOM_1_1);REST_1_1: Get_1_1;MOM_1_1: AsynchronousQueue_1_1 [PublishSubscribe_1_1] Reliability_1_1;PublishSubscribe_1_1: [Durable_1_1];Reliability_1_1: PersistentDelivery_1_1 Acknowledgement_1_1;ServiceState_1_1: StateMessaging_1_1 StatefulService_1_1;StateMessaging_1_1: TwoWayState_1_1;StatefulService_1_1: StateRepository_1_1;InputData_1_1_1: InputName_1_1_1_eq_InputName_1_1_1_034e647f62b84a029f5193e2d47ef835 InputType_1_1_1_eq_String;InputData_1_1_2: InputName_1_1_2_eq_InputName_1_1_2_c6677a92f66c40a8a5cccb6ba5ad361a InputType_1_1_2_eq_Integer;OutputData_1_1_1: OutputName_1_1_1_eq_OutputName_1_1_1_2ee8a611510c48c98a98a248b30373e9 OutputType_1_1_1_eq_Float;OutputData_1_1_2: OutputName_1_1_2_eq_OutputName_1_1_2_5da73f834a644634b716185bfc224cb7 OutputType_1_1_2_eq_Float;OutputData_1_1_3: OutputName_1_1_3_eq_OutputName_1_1_3_a7c78f6db5ad4c13ae9417ee2fcc5a8a OutputType_1_1_3_eq_Float;OutputData_1_1_4: OutputName_1_1_4_eq_OutputName_1_1_4_9404dba48c754feb8d8fd01a78764916 OutputType_1_1_4_eq_Integer;OutputData_1_1_5: OutputName_1_1_5_eq_OutputName_1_1_5_a6879ff8ef9f45faa9abc30ef7343f86 OutputType_1_1_5_eq_Integer;Service_2: ServiceName_2_eq_ServiceName_2_c7d41cc205504fe7bb3f8147fe598268 (Capability_2_1|Capability_2_2);Capability_2_1:  InputData_2_1_1 InputData_2_1_2  OutputData_2_1_1 CommunicationTechnologie_2_1 [Authentification_2_1] ServiceState_2_1 _eq__2_1_eq__eq__2_1_3140621337ca43538802d480d91b463d;CommunicationTechnologie_2_1: (SOAP_2_1|REST_2_1|MOM_2_1);REST_2_1: Get_2_1;MOM_2_1: AsynchronousQueue_2_1 [PublishSubscribe_2_1] Reliability_2_1;PublishSubscribe_2_1: [Durable_2_1];Reliability_2_1: PersistentDelivery_2_1 Acknowledgement_2_1;ServiceState_2_1: StateMessaging_2_1 StatefulService_2_1;StateMessaging_2_1: TwoWayState_2_1;StatefulService_2_1: StateRepository_2_1;InputData_2_1_1: InputName_2_1_1_eq_InputName_2_1_1_7aca485a4f374db4be7ae7812bb03edd InputType_2_1_1_eq_Float;InputData_2_1_2: InputName_2_1_2_eq_InputName_2_1_2_63ce34386f224871993f0c06dbef6441 InputType_2_1_2_eq_Float;OutputData_2_1_1: OutputName_2_1_1_eq_OutputName_2_1_1_b72c4e01c7b9489eb8fab7a4d63d6b83 OutputType_2_1_1_eq_Integer;Capability_2_2:  InputData_2_2_1 InputData_2_2_2  OutputData_2_2_1 OutputData_2_2_2 CommunicationTechnologie_2_2 [Authentification_2_2] ServiceState_2_2 _eq__2_2_eq__eq__2_2_7d14d8d34f00489f976c72e23bebdf23;CommunicationTechnologie_2_2: (SOAP_2_2|REST_2_2|MOM_2_2);REST_2_2: Get_2_2;MOM_2_2: AsynchronousQueue_2_2 [PublishSubscribe_2_2] Reliability_2_2;PublishSubscribe_2_2: [Durable_2_2];Reliability_2_2: PersistentDelivery_2_2 Acknowledgement_2_2;ServiceState_2_2: StateMessaging_2_2 StatefulService_2_2;StateMessaging_2_2: TwoWayState_2_2;StatefulService_2_2: StateRepository_2_2;InputData_2_2_1: InputName_2_2_1_eq_InputName_2_2_1_5b303408679747749853ce721b751b72 InputType_2_2_1_eq_Float;InputData_2_2_2: InputName_2_2_2_eq_InputName_2_2_2_0d831152369e427baf9e60c7bc72f51c InputType_2_2_2_eq_Integer;OutputData_2_2_1: OutputName_2_2_1_eq_OutputName_2_2_1_891c1fad3a264f64a8b2252ea541a618 OutputType_2_2_1_eq_Integer;OutputData_2_2_2: OutputName_2_2_2_eq_OutputName_2_2_2_efb5c78bf1864a24a6fe0efd6325f344 OutputType_2_2_2_eq_Float;Service_3: ServiceName_3_eq_ServiceName_3_14132b60429f4b7fad99095126bffc44 (Capability_3_1|Capability_3_2|Capability_3_3|Capability_3_4);Capability_3_1:   CommunicationTechnologie_3_1 [Authentification_3_1] ServiceState_3_1 _eq__3_1_eq__eq__3_1_dfaca4a5ccca49a0856cf61a2f5b011a;CommunicationTechnologie_3_1: (SOAP_3_1|REST_3_1|MOM_3_1);REST_3_1: Post_3_1;MOM_3_1: AsynchronousQueue_3_1 ;ServiceState_3_1: StatefulService_3_1;StatefulService_3_1: TemporaryMemory_3_1;Capability_3_2:   CommunicationTechnologie_3_2 [Authentification_3_2] ServiceState_3_2 _eq__3_2_eq__eq__3_2_86b63028b1d942ef8e6bb64d8b2679c5;CommunicationTechnologie_3_2: (SOAP_3_2|REST_3_2|MOM_3_2);REST_3_2: Post_3_2;MOM_3_2: AsynchronousQueue_3_2 ;ServiceState_3_2: StatefulService_3_2;StatefulService_3_2: TemporaryMemory_3_2;Capability_3_3:  InputData_3_3_1 InputData_3_3_2  OutputData_3_3_1 OutputData_3_3_2 OutputData_3_3_3 CommunicationTechnologie_3_3 [Authentification_3_3] ServiceState_3_3 _eq__3_3_eq__eq__3_3_f6cd24e7ef1d4b2fbe35c56d83c7c349;CommunicationTechnologie_3_3: (SOAP_3_3|REST_3_3|MOM_3_3);REST_3_3: Get_3_3;MOM_3_3: AsynchronousQueue_3_3 [PublishSubscribe_3_3] Reliability_3_3;PublishSubscribe_3_3: [Durable_3_3];Reliability_3_3: PersistentDelivery_3_3 Acknowledgement_3_3;ServiceState_3_3: StateMessaging_3_3 StatefulService_3_3;StateMessaging_3_3: TwoWayState_3_3;StatefulService_3_3: StateRepository_3_3;InputData_3_3_1: InputName_3_3_1_eq_InputName_3_3_1_d08a895fb8914741b58af80a95380245 InputType_3_3_1_eq_Float;InputData_3_3_2: InputName_3_3_2_eq_InputName_3_3_2_d6e001c056e241e9ae53310f86cbe2fd InputType_3_3_2_eq_Integer;OutputData_3_3_1: OutputName_3_3_1_eq_OutputName_3_3_1_f8ad446e820f4de398869668aaef975a OutputType_3_3_1_eq_Integer;OutputData_3_3_2: OutputName_3_3_2_eq_OutputName_3_3_2_2b73b25f5ccd483ea95c65a49545e733 OutputType_3_3_2_eq_Integer;OutputData_3_3_3: OutputName_3_3_3_eq_OutputName_3_3_3_4bfa7c90663f480d8e78a447ffc5d6de OutputType_3_3_3_eq_Integer;Capability_3_4:  InputData_3_4_1 InputData_3_4_2 InputData_3_4_3 InputData_3_4_4 InputData_3_4_5  OutputData_3_4_1 OutputData_3_4_2 OutputData_3_4_3 OutputData_3_4_4 CommunicationTechnologie_3_4 [Authentification_3_4] ServiceState_3_4 _eq__3_4_eq__eq__3_4_55831e0e0d6a4fd5bcd1ab0b2c45dd0c;CommunicationTechnologie_3_4: (SOAP_3_4|REST_3_4|MOM_3_4);REST_3_4: Get_3_4;MOM_3_4: AsynchronousQueue_3_4 [PublishSubscribe_3_4] Reliability_3_4;PublishSubscribe_3_4: [Durable_3_4];Reliability_3_4: PersistentDelivery_3_4 Acknowledgement_3_4;ServiceState_3_4: StateMessaging_3_4 StatefulService_3_4;StateMessaging_3_4: TwoWayState_3_4;StatefulService_3_4: StateRepository_3_4;InputData_3_4_1: InputName_3_4_1_eq_InputName_3_4_1_0e7b8c6520194097a4c3d12d75c0f8af InputType_3_4_1_eq_Integer;InputData_3_4_2: InputName_3_4_2_eq_InputName_3_4_2_9b55d33abfdd4ddc86b1a01b797dc2e9 InputType_3_4_2_eq_Float;InputData_3_4_3: InputName_3_4_3_eq_InputName_3_4_3_8d1f647c6f8d42dcaf4d7b0922ea8673 InputType_3_4_3_eq_Float;InputData_3_4_4: InputName_3_4_4_eq_InputName_3_4_4_c598da8abdda4e1592b857d1cad0c4de InputType_3_4_4_eq_Integer;InputData_3_4_5: InputName_3_4_5_eq_InputName_3_4_5_8f2fa680480e45afbec4ee6010d2fe7d InputType_3_4_5_eq_Float;OutputData_3_4_1: OutputName_3_4_1_eq_OutputName_3_4_1_c1606e6e2bfd47d68fb015170d8a5de3 OutputType_3_4_1_eq_String;OutputData_3_4_2: OutputName_3_4_2_eq_OutputName_3_4_2_c837f5fd0a89467a98d0d5adb7a3c733 OutputType_3_4_2_eq_String;OutputData_3_4_3: OutputName_3_4_3_eq_OutputName_3_4_3_02c4ea7081514502b98d2f68315507f0 OutputType_3_4_3_eq_Float;OutputData_3_4_4: OutputName_3_4_4_eq_OutputName_3_4_4_d789ae49f7154a6b84a62af4d60a85ea OutputType_3_4_4_eq_Float;Service_4: ServiceName_4_eq_ServiceName_4_e450faf90568438bace1d802a2530b70 (Capability_4_1|Capability_4_2);Capability_4_1:  InputData_4_1_1 InputData_4_1_2 InputData_4_1_3  OutputData_4_1_1 OutputData_4_1_2 CommunicationTechnologie_4_1 [Authentification_4_1] ServiceState_4_1 _eq__4_1_eq__eq__4_1_33354bb97a904dafa6c5268111839bcb;CommunicationTechnologie_4_1: (SOAP_4_1|REST_4_1|MOM_4_1);REST_4_1: Get_4_1;MOM_4_1: AsynchronousQueue_4_1 [PublishSubscribe_4_1] Reliability_4_1;PublishSubscribe_4_1: [Durable_4_1];Reliability_4_1: PersistentDelivery_4_1 Acknowledgement_4_1;ServiceState_4_1: StateMessaging_4_1 StatefulService_4_1;StateMessaging_4_1: TwoWayState_4_1;StatefulService_4_1: StateRepository_4_1;InputData_4_1_1: InputName_4_1_1_eq_InputName_4_1_1_ccbb90ca6d8e49209dc3e3307f2075dc InputType_4_1_1_eq_String;InputData_4_1_2: InputName_4_1_2_eq_InputName_4_1_2_e2f89f7af8c647f589bdfbe9624f1164 InputType_4_1_2_eq_Float;InputData_4_1_3: InputName_4_1_3_eq_InputName_4_1_3_1f9e2b3ea48f499a8002e5b384b31205 InputType_4_1_3_eq_String;OutputData_4_1_1: OutputName_4_1_1_eq_OutputName_4_1_1_9cb88fbf7d044739818c32476a7b07dc OutputType_4_1_1_eq_String;OutputData_4_1_2: OutputName_4_1_2_eq_OutputName_4_1_2_ef86b06f0ad447b4b8ec852810c95d0c OutputType_4_1_2_eq_Float;Capability_4_2:  InputData_4_2_1  OutputData_4_2_1 OutputData_4_2_2 OutputData_4_2_3 OutputData_4_2_4 OutputData_4_2_5 CommunicationTechnologie_4_2 [Authentification_4_2] ServiceState_4_2 _eq__4_2_eq__eq__4_2_f7cdbc16b14f4fedbbddda02992f33ca;CommunicationTechnologie_4_2: (SOAP_4_2|REST_4_2|MOM_4_2);REST_4_2: Get_4_2;MOM_4_2: AsynchronousQueue_4_2 [PublishSubscribe_4_2] Reliability_4_2;PublishSubscribe_4_2: [Durable_4_2];Reliability_4_2: PersistentDelivery_4_2 Acknowledgement_4_2;ServiceState_4_2: StateMessaging_4_2 StatefulService_4_2;StateMessaging_4_2: TwoWayState_4_2;StatefulService_4_2: StateRepository_4_2;InputData_4_2_1: InputName_4_2_1_eq_InputName_4_2_1_3a4b9f655d564f3baee1f50c2d61cfd2 InputType_4_2_1_eq_String;OutputData_4_2_1: OutputName_4_2_1_eq_OutputName_4_2_1_efde8ab47a3a4f4aba5849cd3f0f7f74 OutputType_4_2_1_eq_Float;OutputData_4_2_2: OutputName_4_2_2_eq_OutputName_4_2_2_444d7a3f292e4e109e3fe1091fa85161 OutputType_4_2_2_eq_String;OutputData_4_2_3: OutputName_4_2_3_eq_OutputName_4_2_3_e4a323c6e0534fd49bc0627c4128a1ad OutputType_4_2_3_eq_Float;OutputData_4_2_4: OutputName_4_2_4_eq_OutputName_4_2_4_f44dc8f28d6a46c4b360ca8f349fea42 OutputType_4_2_4_eq_Float;OutputData_4_2_5: OutputName_4_2_5_eq_OutputName_4_2_5_bac79ab1652d44ddb66a16c5428c02bc OutputType_4_2_5_eq_String;Service_5: ServiceName_5_eq_ServiceName_5_1befb8c5e4c94c76b082d5e2ff14973a (Capability_5_1|Capability_5_2|Capability_5_3|Capability_5_4|Capability_5_5);Capability_5_1:  InputData_5_1_1 InputData_5_1_2  OutputData_5_1_1 OutputData_5_1_2 OutputData_5_1_3 OutputData_5_1_4 CommunicationTechnologie_5_1 [Authentification_5_1] ServiceState_5_1 _eq__5_1_eq__eq__5_1_dd48a76ddeea48cfa6f116dbb9430431;CommunicationTechnologie_5_1: (SOAP_5_1|REST_5_1|MOM_5_1);REST_5_1: Get_5_1;MOM_5_1: AsynchronousQueue_5_1 [PublishSubscribe_5_1] Reliability_5_1;PublishSubscribe_5_1: [Durable_5_1];Reliability_5_1: PersistentDelivery_5_1 Acknowledgement_5_1;ServiceState_5_1: StateMessaging_5_1 StatefulService_5_1;StateMessaging_5_1: TwoWayState_5_1;StatefulService_5_1: StateRepository_5_1;InputData_5_1_1: InputName_5_1_1_eq_InputName_5_1_1_28ae6a6920d04b7a84400ee451188fdb InputType_5_1_1_eq_String;InputData_5_1_2: InputName_5_1_2_eq_InputName_5_1_2_4e7c8d2ddb97410897796f87f94dcdb7 InputType_5_1_2_eq_String;OutputData_5_1_1: OutputName_5_1_1_eq_OutputName_5_1_1_c7e6f0a1054b4e959501fa03ba6f2db4 OutputType_5_1_1_eq_Float;OutputData_5_1_2: OutputName_5_1_2_eq_OutputName_5_1_2_39a55bded858418daac2796cf1a1a8a3 OutputType_5_1_2_eq_Float;OutputData_5_1_3: OutputName_5_1_3_eq_OutputName_5_1_3_ce1a72aa5dd54e5e878aa71a66030f41 OutputType_5_1_3_eq_Float;OutputData_5_1_4: OutputName_5_1_4_eq_OutputName_5_1_4_9344fa345f144a079f125919e92271c6 OutputType_5_1_4_eq_Integer;Capability_5_2:  InputData_5_2_1 InputData_5_2_2 InputData_5_2_3 InputData_5_2_4 InputData_5_2_5  OutputData_5_2_1 OutputData_5_2_2 CommunicationTechnologie_5_2 [Authentification_5_2] ServiceState_5_2 _eq__5_2_eq__eq__5_2_abee6ea77c0444e49c641bae2195a0bf;CommunicationTechnologie_5_2: (SOAP_5_2|REST_5_2|MOM_5_2);REST_5_2: Get_5_2;MOM_5_2: AsynchronousQueue_5_2 [PublishSubscribe_5_2] Reliability_5_2;PublishSubscribe_5_2: [Durable_5_2];Reliability_5_2: PersistentDelivery_5_2 Acknowledgement_5_2;ServiceState_5_2: StateMessaging_5_2 StatefulService_5_2;StateMessaging_5_2: TwoWayState_5_2;StatefulService_5_2: StateRepository_5_2;InputData_5_2_1: InputName_5_2_1_eq_InputName_5_2_1_a383ee0da7074fc2b9a49d7799012430 InputType_5_2_1_eq_Float;InputData_5_2_2: InputName_5_2_2_eq_InputName_5_2_2_af65d1b3c7ad463784636405fbd43169 InputType_5_2_2_eq_Integer;InputData_5_2_3: InputName_5_2_3_eq_InputName_5_2_3_26d284132c454e99b97899a709197382 InputType_5_2_3_eq_Float;InputData_5_2_4: InputName_5_2_4_eq_InputName_5_2_4_01873a61c33b42eeaf7f6916b043e1c7 InputType_5_2_4_eq_String;InputData_5_2_5: InputName_5_2_5_eq_InputName_5_2_5_2ae7062e3a014793b33f75428d082278 InputType_5_2_5_eq_Integer;OutputData_5_2_1: OutputName_5_2_1_eq_OutputName_5_2_1_752532d667e646dfb67c8b8586656765 OutputType_5_2_1_eq_Integer;OutputData_5_2_2: OutputName_5_2_2_eq_OutputName_5_2_2_3ab6952d3a0241dda0cc21a2c71bc7a3 OutputType_5_2_2_eq_Float;Capability_5_3:  InputData_5_3_1 InputData_5_3_2 InputData_5_3_3 InputData_5_3_4 InputData_5_3_5 InputData_5_3_6  OutputData_5_3_1 OutputData_5_3_2 CommunicationTechnologie_5_3 [Authentification_5_3] ServiceState_5_3 _eq__5_3_eq__eq__5_3_4da727a2994b4abcbfc38777e0f22b93;CommunicationTechnologie_5_3: (SOAP_5_3|REST_5_3|MOM_5_3);REST_5_3: Get_5_3;MOM_5_3: AsynchronousQueue_5_3 [PublishSubscribe_5_3] Reliability_5_3;PublishSubscribe_5_3: [Durable_5_3];Reliability_5_3: PersistentDelivery_5_3 Acknowledgement_5_3;ServiceState_5_3: StateMessaging_5_3 StatefulService_5_3;StateMessaging_5_3: TwoWayState_5_3;StatefulService_5_3: StateRepository_5_3;InputData_5_3_1: InputName_5_3_1_eq_InputName_5_3_1_03e4e9fdd2d74a7ab0513124040efded InputType_5_3_1_eq_Float;InputData_5_3_2: InputName_5_3_2_eq_InputName_5_3_2_d2362f215814410b9abea2ce04045965 InputType_5_3_2_eq_String;InputData_5_3_3: InputName_5_3_3_eq_InputName_5_3_3_5340b7320c234b4196ec6e5c6f4c2095 InputType_5_3_3_eq_String;InputData_5_3_4: InputName_5_3_4_eq_InputName_5_3_4_790b7756e52d41f890cdc9a0d8cccb64 InputType_5_3_4_eq_Float;InputData_5_3_5: InputName_5_3_5_eq_InputName_5_3_5_1587270dd53a431e8180c66c91bc2222 InputType_5_3_5_eq_Float;InputData_5_3_6: InputName_5_3_6_eq_InputName_5_3_6_e5b39f792d7a429da189f0e60a252e16 InputType_5_3_6_eq_Integer;OutputData_5_3_1: OutputName_5_3_1_eq_OutputName_5_3_1_33e87adbc2244273a9338e7ac38ccc0e OutputType_5_3_1_eq_Float;OutputData_5_3_2: OutputName_5_3_2_eq_OutputName_5_3_2_a717c063440c4b4ca702a8391f81f873 OutputType_5_3_2_eq_String;Capability_5_4:  InputData_5_4_1 InputData_5_4_2  OutputData_5_4_1 CommunicationTechnologie_5_4 [Authentification_5_4] ServiceState_5_4 _eq__5_4_eq__eq__5_4_cd4863ae0fb342ed9b2ba379c230f5be;CommunicationTechnologie_5_4: (SOAP_5_4|REST_5_4|MOM_5_4);REST_5_4: Get_5_4;MOM_5_4: AsynchronousQueue_5_4 [PublishSubscribe_5_4] Reliability_5_4;PublishSubscribe_5_4: [Durable_5_4];Reliability_5_4: PersistentDelivery_5_4 Acknowledgement_5_4;ServiceState_5_4: StateMessaging_5_4 StatefulService_5_4;StateMessaging_5_4: TwoWayState_5_4;StatefulService_5_4: StateRepository_5_4;InputData_5_4_1: InputName_5_4_1_eq_InputName_5_4_1_2fffd4946fc3459ebbdfdf056665af93 InputType_5_4_1_eq_Float;InputData_5_4_2: InputName_5_4_2_eq_InputName_5_4_2_c17574b86e164987bdb1f3231a5482f5 InputType_5_4_2_eq_Integer;OutputData_5_4_1: OutputName_5_4_1_eq_OutputName_5_4_1_4b06f267456d43eb82b7427744623541 OutputType_5_4_1_eq_String;Capability_5_5:  InputData_5_5_1 InputData_5_5_2 InputData_5_5_3 InputData_5_5_4  OutputData_5_5_1 OutputData_5_5_2 OutputData_5_5_3 OutputData_5_5_4 OutputData_5_5_5 CommunicationTechnologie_5_5 [Authentification_5_5] ServiceState_5_5 _eq__5_5_eq__eq__5_5_d2cb9207371e4d9eb1fd7beacae17689;CommunicationTechnologie_5_5: (SOAP_5_5|REST_5_5|MOM_5_5);REST_5_5: Get_5_5;MOM_5_5: AsynchronousQueue_5_5 [PublishSubscribe_5_5] Reliability_5_5;PublishSubscribe_5_5: [Durable_5_5];Reliability_5_5: PersistentDelivery_5_5 Acknowledgement_5_5;ServiceState_5_5: StateMessaging_5_5 StatefulService_5_5;StateMessaging_5_5: TwoWayState_5_5;StatefulService_5_5: StateRepository_5_5;InputData_5_5_1: InputName_5_5_1_eq_InputName_5_5_1_6d7f9565654f470495d5b7cc2fbcae37 InputType_5_5_1_eq_Float;InputData_5_5_2: InputName_5_5_2_eq_InputName_5_5_2_484e0760780f4996a6b9fc0f944510a4 InputType_5_5_2_eq_Float;InputData_5_5_3: InputName_5_5_3_eq_InputName_5_5_3_460bb7f06317480a80e9b7efc200b880 InputType_5_5_3_eq_String;InputData_5_5_4: InputName_5_5_4_eq_InputName_5_5_4_87a3a9fa02594aa58a6dec64c9ce8fcd InputType_5_5_4_eq_String;OutputData_5_5_1: OutputName_5_5_1_eq_OutputName_5_5_1_7f8de49a9cff4f98819463d9aef0aba1 OutputType_5_5_1_eq_Integer;OutputData_5_5_2: OutputName_5_5_2_eq_OutputName_5_5_2_79c0a4c1dfee40dc984045fdcb2a93fa OutputType_5_5_2_eq_Integer;OutputData_5_5_3: OutputName_5_5_3_eq_OutputName_5_5_3_b170c56451564aafa65bdedbb66f462a OutputType_5_5_3_eq_Float;OutputData_5_5_4: OutputName_5_5_4_eq_OutputName_5_5_4_4d60daee867d4a3bb030792cedca47df OutputType_5_5_4_eq_String;OutputData_5_5_5: OutputName_5_5_5_eq_OutputName_5_5_5_74151bc7b76d49afb86a625f20ba38b8 OutputType_5_5_5_eq_Float;");
//		FeatureModelVariable sp = fmUpdateBDD.FM("tst","Root:(Service_1|Service_2|Service_3|Service_4|Service_5);Service_1: ServiceName_1 Capability_1_1;Capability_1_1:  InputData_1_1_1 InputData_1_1_2  OutputData_1_1_1 OutputData_1_1_2 OutputData_1_1_3 OutputData_1_1_4 OutputData_1_1_5 CommunicationTechnologie_1_1 [Authentification_1_1] [ServiceState_1_1] CapabilityName_1_1;CommunicationTechnologie_1_1: (SOAP_1_1|REST_1_1|MOM_1_1);REST_1_1: (Post_1_1|Get_1_1|Put_1_1|Delete_1_1);MOM_1_1: AsynchronousQueue_1_1 [PublishSubscribe_1_1] [Transactional_1_1] [Reliability_1_1];PublishSubscribe_1_1: [Durable_1_1];Reliability_1_1: (PersistentDelivery_1_1|Acknowledgement_1_1)+;ServiceState_1_1: (StateMessaging_1_1|StatefulService_1_1)+;StateMessaging_1_1: [TwoWayState_1_1];StatefulService_1_1: (StateRepository_1_1|TemporaryMemory_1_1);InputData_1_1_1: InputName_1_1_1 InputType_1_1_1;InputData_1_1_2: InputName_1_1_2 InputType_1_1_2;OutputData_1_1_1: OutputName_1_1_1 OutputType_1_1_1;OutputData_1_1_2: OutputName_1_1_2 OutputType_1_1_2;OutputData_1_1_3: OutputName_1_1_3 OutputType_1_1_3;OutputData_1_1_4: OutputName_1_1_4 OutputType_1_1_4;OutputData_1_1_5: OutputName_1_1_5 OutputType_1_1_5;Service_2: ServiceName_2 (Capability_2_1|Capability_2_2);Capability_2_1:  InputData_2_1_1 InputData_2_1_2  OutputData_2_1_1 CommunicationTechnologie_2_1 [Authentification_2_1] [ServiceState_2_1] CapabilityName_2_1;CommunicationTechnologie_2_1: (SOAP_2_1|REST_2_1|MOM_2_1);REST_2_1: (Post_2_1|Get_2_1|Put_2_1|Delete_2_1);MOM_2_1: AsynchronousQueue_2_1 [PublishSubscribe_2_1] [Transactional_2_1] [Reliability_2_1];PublishSubscribe_2_1: [Durable_2_1];Reliability_2_1: (PersistentDelivery_2_1|Acknowledgement_2_1)+;ServiceState_2_1: (StateMessaging_2_1|StatefulService_2_1)+;StateMessaging_2_1: [TwoWayState_2_1];StatefulService_2_1: (StateRepository_2_1|TemporaryMemory_2_1);InputData_2_1_1: InputName_2_1_1 InputType_2_1_1;InputData_2_1_2: InputName_2_1_2 InputType_2_1_2;OutputData_2_1_1: OutputName_2_1_1 OutputType_2_1_1;Capability_2_2:  InputData_2_2_1 InputData_2_2_2  OutputData_2_2_1 OutputData_2_2_2 CommunicationTechnologie_2_2 [Authentification_2_2] [ServiceState_2_2] CapabilityName_2_2;CommunicationTechnologie_2_2: (SOAP_2_2|REST_2_2|MOM_2_2);REST_2_2: (Post_2_2|Get_2_2|Put_2_2|Delete_2_2);MOM_2_2: AsynchronousQueue_2_2 [PublishSubscribe_2_2] [Transactional_2_2] [Reliability_2_2];PublishSubscribe_2_2: [Durable_2_2];Reliability_2_2: (PersistentDelivery_2_2|Acknowledgement_2_2)+;ServiceState_2_2: (StateMessaging_2_2|StatefulService_2_2)+;StateMessaging_2_2: [TwoWayState_2_2];StatefulService_2_2: (StateRepository_2_2|TemporaryMemory_2_2);InputData_2_2_1: InputName_2_2_1 InputType_2_2_1;InputData_2_2_2: InputName_2_2_2 InputType_2_2_2;OutputData_2_2_1: OutputName_2_2_1 OutputType_2_2_1;OutputData_2_2_2: OutputName_2_2_2 OutputType_2_2_2;Service_3: ServiceName_3 (Capability_3_1|Capability_3_2|Capability_3_3|Capability_3_4);Capability_3_1:   CommunicationTechnologie_3_1 [Authentification_3_1] [ServiceState_3_1] CapabilityName_3_1;CommunicationTechnologie_3_1: (SOAP_3_1|REST_3_1|MOM_3_1);REST_3_1: (Post_3_1|Get_3_1|Put_3_1|Delete_3_1);MOM_3_1: AsynchronousQueue_3_1 ;ServiceState_3_1: StatefulService_3_1;StatefulService_3_1: (StateRepository_3_1|TemporaryMemory_3_1);Capability_3_2:   CommunicationTechnologie_3_2 [Authentification_3_2] [ServiceState_3_2] CapabilityName_3_2;CommunicationTechnologie_3_2: (SOAP_3_2|REST_3_2|MOM_3_2);REST_3_2: (Post_3_2|Get_3_2|Put_3_2|Delete_3_2);MOM_3_2: AsynchronousQueue_3_2 ;ServiceState_3_2: StatefulService_3_2;StatefulService_3_2: (StateRepository_3_2|TemporaryMemory_3_2);Capability_3_3:  InputData_3_3_1 InputData_3_3_2  OutputData_3_3_1 OutputData_3_3_2 OutputData_3_3_3 CommunicationTechnologie_3_3 [Authentification_3_3] [ServiceState_3_3] CapabilityName_3_3;CommunicationTechnologie_3_3: (SOAP_3_3|REST_3_3|MOM_3_3);REST_3_3: (Post_3_3|Get_3_3|Put_3_3|Delete_3_3);MOM_3_3: AsynchronousQueue_3_3 [PublishSubscribe_3_3] [Transactional_3_3] [Reliability_3_3];PublishSubscribe_3_3: [Durable_3_3];Reliability_3_3: (PersistentDelivery_3_3|Acknowledgement_3_3)+;ServiceState_3_3: (StateMessaging_3_3|StatefulService_3_3)+;StateMessaging_3_3: [TwoWayState_3_3];StatefulService_3_3: (StateRepository_3_3|TemporaryMemory_3_3);InputData_3_3_1: InputName_3_3_1 InputType_3_3_1;InputData_3_3_2: InputName_3_3_2 InputType_3_3_2;OutputData_3_3_1: OutputName_3_3_1 OutputType_3_3_1;OutputData_3_3_2: OutputName_3_3_2 OutputType_3_3_2;OutputData_3_3_3: OutputName_3_3_3 OutputType_3_3_3;Capability_3_4:  InputData_3_4_1 InputData_3_4_2 InputData_3_4_3 InputData_3_4_4 InputData_3_4_5  OutputData_3_4_1 OutputData_3_4_2 OutputData_3_4_3 OutputData_3_4_4 CommunicationTechnologie_3_4 [Authentification_3_4] [ServiceState_3_4] CapabilityName_3_4;CommunicationTechnologie_3_4: (SOAP_3_4|REST_3_4|MOM_3_4);REST_3_4: (Post_3_4|Get_3_4|Put_3_4|Delete_3_4);MOM_3_4: AsynchronousQueue_3_4 [PublishSubscribe_3_4] [Transactional_3_4] [Reliability_3_4];PublishSubscribe_3_4: [Durable_3_4];Reliability_3_4: (PersistentDelivery_3_4|Acknowledgement_3_4)+;ServiceState_3_4: (StateMessaging_3_4|StatefulService_3_4)+;StateMessaging_3_4: [TwoWayState_3_4];StatefulService_3_4: (StateRepository_3_4|TemporaryMemory_3_4);InputData_3_4_1: InputName_3_4_1 InputType_3_4_1;InputData_3_4_2: InputName_3_4_2 InputType_3_4_2;InputData_3_4_3: InputName_3_4_3 InputType_3_4_3;InputData_3_4_4: InputName_3_4_4 InputType_3_4_4;InputData_3_4_5: InputName_3_4_5 InputType_3_4_5;OutputData_3_4_1: OutputName_3_4_1 OutputType_3_4_1;OutputData_3_4_2: OutputName_3_4_2 OutputType_3_4_2;OutputData_3_4_3: OutputName_3_4_3 OutputType_3_4_3;OutputData_3_4_4: OutputName_3_4_4 OutputType_3_4_4;Service_4: ServiceName_4 (Capability_4_1|Capability_4_2);Capability_4_1:  InputData_4_1_1 InputData_4_1_2 InputData_4_1_3  OutputData_4_1_1 OutputData_4_1_2 CommunicationTechnologie_4_1 [Authentification_4_1] [ServiceState_4_1] CapabilityName_4_1;CommunicationTechnologie_4_1: (SOAP_4_1|REST_4_1|MOM_4_1);REST_4_1: (Post_4_1|Get_4_1|Put_4_1|Delete_4_1);MOM_4_1: AsynchronousQueue_4_1 [PublishSubscribe_4_1] [Transactional_4_1] [Reliability_4_1];PublishSubscribe_4_1: [Durable_4_1];Reliability_4_1: (PersistentDelivery_4_1|Acknowledgement_4_1)+;ServiceState_4_1: (StateMessaging_4_1|StatefulService_4_1)+;StateMessaging_4_1: [TwoWayState_4_1];StatefulService_4_1: (StateRepository_4_1|TemporaryMemory_4_1);InputData_4_1_1: InputName_4_1_1 InputType_4_1_1;InputData_4_1_2: InputName_4_1_2 InputType_4_1_2;InputData_4_1_3: InputName_4_1_3 InputType_4_1_3;OutputData_4_1_1: OutputName_4_1_1 OutputType_4_1_1;OutputData_4_1_2: OutputName_4_1_2 OutputType_4_1_2;Capability_4_2:  InputData_4_2_1  OutputData_4_2_1 OutputData_4_2_2 OutputData_4_2_3 OutputData_4_2_4 OutputData_4_2_5 CommunicationTechnologie_4_2 [Authentification_4_2] [ServiceState_4_2] CapabilityName_4_2;CommunicationTechnologie_4_2: (SOAP_4_2|REST_4_2|MOM_4_2);REST_4_2: (Post_4_2|Get_4_2|Put_4_2|Delete_4_2);MOM_4_2: AsynchronousQueue_4_2 [PublishSubscribe_4_2] [Transactional_4_2] [Reliability_4_2];PublishSubscribe_4_2: [Durable_4_2];Reliability_4_2: (PersistentDelivery_4_2|Acknowledgement_4_2)+;ServiceState_4_2: (StateMessaging_4_2|StatefulService_4_2)+;StateMessaging_4_2: [TwoWayState_4_2];StatefulService_4_2: (StateRepository_4_2|TemporaryMemory_4_2);InputData_4_2_1: InputName_4_2_1 InputType_4_2_1;OutputData_4_2_1: OutputName_4_2_1 OutputType_4_2_1;OutputData_4_2_2: OutputName_4_2_2 OutputType_4_2_2;OutputData_4_2_3: OutputName_4_2_3 OutputType_4_2_3;OutputData_4_2_4: OutputName_4_2_4 OutputType_4_2_4;OutputData_4_2_5: OutputName_4_2_5 OutputType_4_2_5;Service_5: ServiceName_5 (Capability_5_1|Capability_5_2|Capability_5_3|Capability_5_4|Capability_5_5);Capability_5_1:  InputData_5_1_1 InputData_5_1_2  OutputData_5_1_1 OutputData_5_1_2 OutputData_5_1_3 OutputData_5_1_4 CommunicationTechnologie_5_1 [Authentification_5_1] [ServiceState_5_1] CapabilityName_5_1;CommunicationTechnologie_5_1: (SOAP_5_1|REST_5_1|MOM_5_1);REST_5_1: (Post_5_1|Get_5_1|Put_5_1|Delete_5_1);MOM_5_1: AsynchronousQueue_5_1 [PublishSubscribe_5_1] [Transactional_5_1] [Reliability_5_1];PublishSubscribe_5_1: [Durable_5_1];Reliability_5_1: (PersistentDelivery_5_1|Acknowledgement_5_1)+;ServiceState_5_1: (StateMessaging_5_1|StatefulService_5_1)+;StateMessaging_5_1: [TwoWayState_5_1];StatefulService_5_1: (StateRepository_5_1|TemporaryMemory_5_1);InputData_5_1_1: InputName_5_1_1 InputType_5_1_1;InputData_5_1_2: InputName_5_1_2 InputType_5_1_2;OutputData_5_1_1: OutputName_5_1_1 OutputType_5_1_1;OutputData_5_1_2: OutputName_5_1_2 OutputType_5_1_2;OutputData_5_1_3: OutputName_5_1_3 OutputType_5_1_3;OutputData_5_1_4: OutputName_5_1_4 OutputType_5_1_4;Capability_5_2:  InputData_5_2_1 InputData_5_2_2 InputData_5_2_3 InputData_5_2_4 InputData_5_2_5  OutputData_5_2_1 OutputData_5_2_2 CommunicationTechnologie_5_2 [Authentification_5_2] [ServiceState_5_2] CapabilityName_5_2;CommunicationTechnologie_5_2: (SOAP_5_2|REST_5_2|MOM_5_2);REST_5_2: (Post_5_2|Get_5_2|Put_5_2|Delete_5_2);MOM_5_2: AsynchronousQueue_5_2 [PublishSubscribe_5_2] [Transactional_5_2] [Reliability_5_2];PublishSubscribe_5_2: [Durable_5_2];Reliability_5_2: (PersistentDelivery_5_2|Acknowledgement_5_2)+;ServiceState_5_2: (StateMessaging_5_2|StatefulService_5_2)+;StateMessaging_5_2: [TwoWayState_5_2];StatefulService_5_2: (StateRepository_5_2|TemporaryMemory_5_2);InputData_5_2_1: InputName_5_2_1 InputType_5_2_1;InputData_5_2_2: InputName_5_2_2 InputType_5_2_2;InputData_5_2_3: InputName_5_2_3 InputType_5_2_3;InputData_5_2_4: InputName_5_2_4 InputType_5_2_4;InputData_5_2_5: InputName_5_2_5 InputType_5_2_5;OutputData_5_2_1: OutputName_5_2_1 OutputType_5_2_1;OutputData_5_2_2: OutputName_5_2_2 OutputType_5_2_2;Capability_5_3:  InputData_5_3_1 InputData_5_3_2 InputData_5_3_3 InputData_5_3_4 InputData_5_3_5 InputData_5_3_6  OutputData_5_3_1 OutputData_5_3_2 CommunicationTechnologie_5_3 [Authentification_5_3] [ServiceState_5_3] CapabilityName_5_3;CommunicationTechnologie_5_3: (SOAP_5_3|REST_5_3|MOM_5_3);REST_5_3: (Post_5_3|Get_5_3|Put_5_3|Delete_5_3);MOM_5_3: AsynchronousQueue_5_3 [PublishSubscribe_5_3] [Transactional_5_3] [Reliability_5_3];PublishSubscribe_5_3: [Durable_5_3];Reliability_5_3: (PersistentDelivery_5_3|Acknowledgement_5_3)+;ServiceState_5_3: (StateMessaging_5_3|StatefulService_5_3)+;StateMessaging_5_3: [TwoWayState_5_3];StatefulService_5_3: (StateRepository_5_3|TemporaryMemory_5_3);InputData_5_3_1: InputName_5_3_1 InputType_5_3_1;InputData_5_3_2: InputName_5_3_2 InputType_5_3_2;InputData_5_3_3: InputName_5_3_3 InputType_5_3_3;InputData_5_3_4: InputName_5_3_4 InputType_5_3_4;InputData_5_3_5: InputName_5_3_5 InputType_5_3_5;InputData_5_3_6: InputName_5_3_6 InputType_5_3_6;OutputData_5_3_1: OutputName_5_3_1 OutputType_5_3_1;OutputData_5_3_2: OutputName_5_3_2 OutputType_5_3_2;Capability_5_4:  InputData_5_4_1 InputData_5_4_2  OutputData_5_4_1 CommunicationTechnologie_5_4 [Authentification_5_4] [ServiceState_5_4] CapabilityName_5_4;CommunicationTechnologie_5_4: (SOAP_5_4|REST_5_4|MOM_5_4);REST_5_4: (Post_5_4|Get_5_4|Put_5_4|Delete_5_4);MOM_5_4: AsynchronousQueue_5_4 [PublishSubscribe_5_4] [Transactional_5_4] [Reliability_5_4];PublishSubscribe_5_4: [Durable_5_4];Reliability_5_4: (PersistentDelivery_5_4|Acknowledgement_5_4)+;ServiceState_5_4: (StateMessaging_5_4|StatefulService_5_4)+;StateMessaging_5_4: [TwoWayState_5_4];StatefulService_5_4: (StateRepository_5_4|TemporaryMemory_5_4);InputData_5_4_1: InputName_5_4_1 InputType_5_4_1;InputData_5_4_2: InputName_5_4_2 InputType_5_4_2;OutputData_5_4_1: OutputName_5_4_1 OutputType_5_4_1;Capability_5_5:  InputData_5_5_1 InputData_5_5_2 InputData_5_5_3 InputData_5_5_4  OutputData_5_5_1 OutputData_5_5_2 OutputData_5_5_3 OutputData_5_5_4 OutputData_5_5_5 CommunicationTechnologie_5_5 [Authentification_5_5] [ServiceState_5_5] CapabilityName_5_5;CommunicationTechnologie_5_5: (SOAP_5_5|REST_5_5|MOM_5_5);REST_5_5: (Post_5_5|Get_5_5|Put_5_5|Delete_5_5);MOM_5_5: AsynchronousQueue_5_5 [PublishSubscribe_5_5] [Transactional_5_5] [Reliability_5_5];PublishSubscribe_5_5: [Durable_5_5];Reliability_5_5: (PersistentDelivery_5_5|Acknowledgement_5_5)+;ServiceState_5_5: (StateMessaging_5_5|StatefulService_5_5)+;StateMessaging_5_5: [TwoWayState_5_5];StatefulService_5_5: (StateRepository_5_5|TemporaryMemory_5_5);InputData_5_5_1: InputName_5_5_1 InputType_5_5_1;InputData_5_5_2: InputName_5_5_2 InputType_5_5_2;InputData_5_5_3: InputName_5_5_3 InputType_5_5_3;InputData_5_5_4: InputName_5_5_4 InputType_5_5_4;OutputData_5_5_1: OutputName_5_5_1 OutputType_5_5_1;OutputData_5_5_2: OutputName_5_5_2 OutputType_5_5_2;OutputData_5_5_3: OutputName_5_5_3 OutputType_5_5_3;OutputData_5_5_4: OutputName_5_5_4 OutputType_5_5_4;OutputData_5_5_5: OutputName_5_5_5 OutputType_5_5_5;Transactional_1_1 implies !Acknowledgement_1_1;Transactional_2_1 implies !Acknowledgement_2_1;Transactional_2_2 implies !Acknowledgement_2_2;Transactional_3_3 implies !Acknowledgement_3_3;Transactional_3_4 implies !Acknowledgement_3_4;Transactional_4_1 implies !Acknowledgement_4_1;Transactional_4_2 implies !Acknowledgement_4_2;Transactional_5_1 implies !Acknowledgement_5_1;Transactional_5_2 implies !Acknowledgement_5_2;Transactional_5_3 implies !Acknowledgement_5_3;Transactional_5_4 implies !Acknowledgement_5_4;Transactional_5_5 implies !Acknowledgement_5_5;");

		
//		String spec = MockData.setAttributes(fmFactory.mockSPSpec, fmFactory.fmUpdateBDD);
		
		
		System.out.println(fmFactory.checkSpecialization2(fmFactory._fmSP, fmFactory.mockSPSpec));
		
		System.exit(-1);
		
		//
		//
		// System.out.println(doubleRoot.root().getShell().);

		// FeatureModelChecker featureModelChecker = new FeatureModelChecker(
		// (FeatureModel) doubleRoot);

		// featureModelChecker.isSyntacticallyValid();

		// System.exit(-1);

//		FeatureModelVariable fmToDelete = fmUpdateBDD.FM("tst",
//				"Root:(Service_1|Service_2|Service_3);Service_1: ServiceName_1 (Capability_1_1|Capability_1_2);Capability_1_1:  InputData_1_1_1 InputData_1_1_2  OutputData_1_1_1 OutputData_1_1_2 OutputData_1_1_3 CommunicationTechnologie_1_1 [Authentification_1_1] [ServiceState_1_1] CapabilityName_1_1;CommunicationTechnologie_1_1: (SOAP_1_1|REST_1_1|MOM_1_1);REST_1_1: (Post_1_1|Get_1_1|Put_1_1|Delete_1_1);MOM_1_1: AsynchronousQueue_1_1 [PublishSubscribe_1_1] [Transactional_1_1] [Reliability_1_1];PublishSubscribe_1_1: [Durable_1_1];Reliability_1_1: (PersistentDelivery_1_1|Acknowledgement_1_1)+;ServiceState_1_1: (StateMessaging_1_1|StatefulService_1_1)+;StateMessaging_1_1: [TwoWayState_1_1];StatefulService_1_1: (StateRepository_1_1|TemporaryMemory_1_1);InputData_1_1_1: InputName_1_1_1 InputType_1_1_1;InputData_1_1_2: InputName_1_1_2 InputType_1_1_2;OutputData_1_1_1: OutputName_1_1_1 OutputType_1_1_1;OutputData_1_1_2: OutputName_1_1_2 OutputType_1_1_2;OutputData_1_1_3: OutputName_1_1_3 OutputType_1_1_3;Capability_1_2:   CommunicationTechnologie_1_2 [Authentification_1_2] [ServiceState_1_2] CapabilityName_1_2;CommunicationTechnologie_1_2: (SOAP_1_2|REST_1_2|MOM_1_2);REST_1_2: (Post_1_2|Get_1_2|Put_1_2|Delete_1_2);MOM_1_2: AsynchronousQueue_1_2 [Reliability_1_2];PublishSubscribe_1_2: [Durable_1_2];ServiceState_1_2: StatefulService_1_2;StatefulService_1_2: (StateRepository_1_2|TemporaryMemory_1_2);Service_2: ServiceName_2 Capability_2_1;Capability_2_1:  InputData_2_1_1  OutputData_2_1_1 OutputData_2_1_2 CommunicationTechnologie_2_1 [Authentification_2_1] [ServiceState_2_1] CapabilityName_2_1;CommunicationTechnologie_2_1: (SOAP_2_1|REST_2_1|MOM_2_1);REST_2_1: (Post_2_1|Get_2_1|Put_2_1|Delete_2_1);MOM_2_1: AsynchronousQueue_2_1 [PublishSubscribe_2_1] [Transactional_2_1] [Reliability_2_1];PublishSubscribe_2_1: [Durable_2_1];Reliability_2_1: (PersistentDelivery_2_1|Acknowledgement_2_1)+;ServiceState_2_1: (StateMessaging_2_1|StatefulService_2_1)+;StateMessaging_2_1: [TwoWayState_2_1];StatefulService_2_1: (StateRepository_2_1|TemporaryMemory_2_1);InputData_2_1_1: InputName_2_1_1 InputType_2_1_1;OutputData_2_1_1: OutputName_2_1_1 OutputType_2_1_1;OutputData_2_1_2: OutputName_2_1_2 OutputType_2_1_2;Service_3: ServiceName_3 (Capability_3_1|Capability_3_2|Capability_3_3);Capability_3_1:   OutputData_3_1_1 CommunicationTechnologie_3_1 [Authentification_3_1] [ServiceState_3_1] CapabilityName_3_1;CommunicationTechnologie_3_1: (SOAP_3_1|REST_3_1|MOM_3_1);REST_3_1: (Post_3_1|Get_3_1|Put_3_1|Delete_3_1);MOM_3_1: AsynchronousQueue_3_1 [PublishSubscribe_3_1] [Transactional_3_1] [Reliability_3_1];PublishSubscribe_3_1: [Durable_3_1];Reliability_3_1: (PersistentDelivery_3_1|Acknowledgement_3_1)+;ServiceState_3_1: (StateMessaging_3_1|StatefulService_3_1)+;StateMessaging_3_1: [TwoWayState_3_1];StatefulService_3_1: (StateRepository_3_1|TemporaryMemory_3_1);OutputData_3_1_1: OutputName_3_1_1 OutputType_3_1_1;Capability_3_2:  InputData_3_2_1 InputData_3_2_2  CommunicationTechnologie_3_2 [Authentification_3_2] [ServiceState_3_2] CapabilityName_3_2;CommunicationTechnologie_3_2: (SOAP_3_2|REST_3_2|MOM_3_2);REST_3_2: (Post_3_2|Get_3_2|Put_3_2|Delete_3_2);MOM_3_2: AsynchronousQueue_3_2 [Reliability_3_2];PublishSubscribe_3_2: [Durable_3_2];ServiceState_3_2: StatefulService_3_2;StatefulService_3_2: (StateRepository_3_2|TemporaryMemory_3_2);InputData_3_2_1: InputName_3_2_1 InputType_3_2_1;InputData_3_2_2: InputName_3_2_2 InputType_3_2_2;Capability_3_3:  InputData_3_3_1  OutputData_3_3_1 OutputData_3_3_2 OutputData_3_3_3 OutputData_3_3_4 OutputData_3_3_5 OutputData_3_3_6 OutputData_3_3_7 OutputData_3_3_8 OutputData_3_3_9 OutputData_3_3_10 OutputData_3_3_11 OutputData_3_3_12 OutputData_3_3_13 OutputData_3_3_14 OutputData_3_3_15 OutputData_3_3_16 OutputData_3_3_17 OutputData_3_3_18 OutputData_3_3_19 OutputData_3_3_20 OutputData_3_3_21 CommunicationTechnologie_3_3 [Authentification_3_3] [ServiceState_3_3] CapabilityName_3_3;CommunicationTechnologie_3_3: (SOAP_3_3|REST_3_3|MOM_3_3);REST_3_3: (Post_3_3|Get_3_3|Put_3_3|Delete_3_3);MOM_3_3: AsynchronousQueue_3_3 [PublishSubscribe_3_3] [Transactional_3_3] [Reliability_3_3];PublishSubscribe_3_3: [Durable_3_3];Reliability_3_3: (PersistentDelivery_3_3|Acknowledgement_3_3)+;ServiceState_3_3: (StateMessaging_3_3|StatefulService_3_3)+;StateMessaging_3_3: [TwoWayState_3_3];StatefulService_3_3: (StateRepository_3_3|TemporaryMemory_3_3);InputData_3_3_1: InputName_3_3_1 InputType_3_3_1;OutputData_3_3_1: OutputName_3_3_1 OutputType_3_3_1;OutputData_3_3_2: OutputName_3_3_2 OutputType_3_3_2;OutputData_3_3_3: OutputName_3_3_3 OutputType_3_3_3;OutputData_3_3_4: OutputName_3_3_4 OutputType_3_3_4;OutputData_3_3_5: OutputName_3_3_5 OutputType_3_3_5;OutputData_3_3_6: OutputName_3_3_6 OutputType_3_3_6;OutputData_3_3_7: OutputName_3_3_7 OutputType_3_3_7;OutputData_3_3_8: OutputName_3_3_8 OutputType_3_3_8;OutputData_3_3_9: OutputName_3_3_9 OutputType_3_3_9;OutputData_3_3_10: OutputName_3_3_10 OutputType_3_3_10;OutputData_3_3_11: OutputName_3_3_11 OutputType_3_3_11;OutputData_3_3_12: OutputName_3_3_12 OutputType_3_3_12;OutputData_3_3_13: OutputName_3_3_13 OutputType_3_3_13;OutputData_3_3_14: OutputName_3_3_14 OutputType_3_3_14;OutputData_3_3_15: OutputName_3_3_15 OutputType_3_3_15;OutputData_3_3_16: OutputName_3_3_16 OutputType_3_3_16;OutputData_3_3_17: OutputName_3_3_17 OutputType_3_3_17;OutputData_3_3_18: OutputName_3_3_18 OutputType_3_3_18;OutputData_3_3_19: OutputName_3_3_19 OutputType_3_3_19;OutputData_3_3_20: OutputName_3_3_20 OutputType_3_3_20;OutputData_3_3_21: OutputName_3_3_21 OutputType_3_3_21;Transactional_1_1 implies !Acknowledgement_1_1;Transactional_2_1 implies !Acknowledgement_2_1;Transactional_3_1 implies !Acknowledgement_3_1;Transactional_3_3 implies !Acknowledgement_3_3;");
		// "Root: Service_1 ; Service_1: Capability_1_1 ServiceName_1=helo ;
		// Capability_1_1: ServiceState_1_1 CapabilityName_1_1=getHelo
		// CommunicationTechnologie_1_1 [Authentification_1_1] ;
		// ServiceState_1_1: StatefulService_1_1 ; CommunicationTechnologie_1_1:
		// MOM_1_1 ; StatefulService_1_1: TemporaryMemory_1_1 ; REST_1_1:
		// (Get_1_1|Delete_1_1|Put_1_1|Post_1_1) ; MOM_1_1:
		// AsynchronousQueue_1_1 ;");

//		gsd.synthesis.FeatureModel<String> fm = fmToDelete.extract("Capability_1_1");
//
//		System.out.println(fm.toString().substring(fm.toString().indexOf('\n')+1) + "\n-----------------\n");
//
//		System.out.println(fm.getConstraints() + "\n-----------------");
//
//		// for (Expression<String> string : fm.getConstraints()) {
//		// System.out.println(fm.removeConstraint(string) +
//		// "\n-----------------");
//		// }
//
//		fm.removeAllConstraints();
//		System.out.println(fm + "\n-----------------");
//
		
		fmFactory.Init();

		// System.out.println(fmFactory.contractFG.serviceFGs.size());

		fmFactory.buildFMs();
		
		System.out.println(fmFactory.mockSPSpec);
		
		
//		String clean = "Root:(Service_1|Service_2|Service_3|Service_4|Service_5);Service_1: ServiceName_1 (Capability_1_1|Capability_1_2);Capability_1_1:  InputData_1_1_1 InputData_1_1_2 InputData_1_1_3 InputData_1_1_4 InputData_1_1_5  OutputData_1_1_1 OutputData_1_1_2 OutputData_1_1_3 OutputData_1_1_4 OutputData_1_1_5 CommunicationTechnologie_1_1 [Authentification_1_1] [ServiceState_1_1] CapabilityName_1_1;CommunicationTechnologie_1_1: (SOAP_1_1|REST_1_1|MOM_1_1);REST_1_1: (Post_1_1|Get_1_1|Put_1_1|Delete_1_1);MOM_1_1: AsynchronousQueue_1_1 [PublishSubscribe_1_1] [Transactional_1_1] [Reliability_1_1];PublishSubscribe_1_1: [Durable_1_1];Reliability_1_1: (PersistentDelivery_1_1|Acknowledgement_1_1)+;ServiceState_1_1: (StateMessaging_1_1|StatefulService_1_1)+;StateMessaging_1_1: [TwoWayState_1_1];StatefulService_1_1: (StateRepository_1_1|TemporaryMemory_1_1);InputData_1_1_1: InputName_1_1_1 InputType_1_1_1;InputData_1_1_2: InputName_1_1_2 InputType_1_1_2;InputData_1_1_3: InputName_1_1_3 InputType_1_1_3;InputData_1_1_4: InputName_1_1_4 InputType_1_1_4;InputData_1_1_5: InputName_1_1_5 InputType_1_1_5;OutputData_1_1_1: OutputName_1_1_1 OutputType_1_1_1;OutputData_1_1_2: OutputName_1_1_2 OutputType_1_1_2;OutputData_1_1_3: OutputName_1_1_3 OutputType_1_1_3;OutputData_1_1_4: OutputName_1_1_4 OutputType_1_1_4;OutputData_1_1_5: OutputName_1_1_5 OutputType_1_1_5;Capability_1_2:  InputData_1_2_1 InputData_1_2_2  CommunicationTechnologie_1_2 [Authentification_1_2] [ServiceState_1_2] CapabilityName_1_2;CommunicationTechnologie_1_2: (SOAP_1_2|REST_1_2|MOM_1_2);REST_1_2: (Post_1_2|Get_1_2|Put_1_2|Delete_1_2);MOM_1_2: AsynchronousQueue_1_2 ;ServiceState_1_2: StatefulService_1_2;StatefulService_1_2: (StateRepository_1_2|TemporaryMemory_1_2);InputData_1_2_1: InputName_1_2_1 InputType_1_2_1;InputData_1_2_2: InputName_1_2_2 InputType_1_2_2;Service_2: ServiceName_2 (Capability_2_1|Capability_2_2);Capability_2_1:  InputData_2_1_1 InputData_2_1_2  OutputData_2_1_1 CommunicationTechnologie_2_1 [Authentification_2_1] [ServiceState_2_1] CapabilityName_2_1;CommunicationTechnologie_2_1: (SOAP_2_1|REST_2_1|MOM_2_1);REST_2_1: (Post_2_1|Get_2_1|Put_2_1|Delete_2_1);MOM_2_1: AsynchronousQueue_2_1 [PublishSubscribe_2_1] [Transactional_2_1] [Reliability_2_1];PublishSubscribe_2_1: [Durable_2_1];Reliability_2_1: (PersistentDelivery_2_1|Acknowledgement_2_1)+;ServiceState_2_1: (StateMessaging_2_1|StatefulService_2_1)+;StateMessaging_2_1: [TwoWayState_2_1];StatefulService_2_1: (StateRepository_2_1|TemporaryMemory_2_1);InputData_2_1_1: InputName_2_1_1 InputType_2_1_1;InputData_2_1_2: InputName_2_1_2 InputType_2_1_2;OutputData_2_1_1: OutputName_2_1_1 OutputType_2_1_1;Capability_2_2:   CommunicationTechnologie_2_2 [Authentification_2_2] [ServiceState_2_2] CapabilityName_2_2;CommunicationTechnologie_2_2: (SOAP_2_2|REST_2_2|MOM_2_2);REST_2_2: (Post_2_2|Get_2_2|Put_2_2|Delete_2_2);MOM_2_2: AsynchronousQueue_2_2 ;ServiceState_2_2: StatefulService_2_2;StatefulService_2_2: (StateRepository_2_2|TemporaryMemory_2_2);Service_3: ServiceName_3 (Capability_3_1|Capability_3_2);Capability_3_1:  InputData_3_1_1 InputData_3_1_2  OutputData_3_1_1 CommunicationTechnologie_3_1 [Authentification_3_1] [ServiceState_3_1] CapabilityName_3_1;CommunicationTechnologie_3_1: (SOAP_3_1|REST_3_1|MOM_3_1);REST_3_1: (Post_3_1|Get_3_1|Put_3_1|Delete_3_1);MOM_3_1: AsynchronousQueue_3_1 [PublishSubscribe_3_1] [Transactional_3_1] [Reliability_3_1];PublishSubscribe_3_1: [Durable_3_1];Reliability_3_1: (PersistentDelivery_3_1|Acknowledgement_3_1)+;ServiceState_3_1: (StateMessaging_3_1|StatefulService_3_1)+;StateMessaging_3_1: [TwoWayState_3_1];StatefulService_3_1: (StateRepository_3_1|TemporaryMemory_3_1);InputData_3_1_1: InputName_3_1_1 InputType_3_1_1;InputData_3_1_2: InputName_3_1_2 InputType_3_1_2;OutputData_3_1_1: OutputName_3_1_1 OutputType_3_1_1;Capability_3_2:  InputData_3_2_1 InputData_3_2_2 InputData_3_2_3 InputData_3_2_4 InputData_3_2_5  OutputData_3_2_1 OutputData_3_2_2 CommunicationTechnologie_3_2 [Authentification_3_2] [ServiceState_3_2] CapabilityName_3_2;CommunicationTechnologie_3_2: (SOAP_3_2|REST_3_2|MOM_3_2);REST_3_2: (Post_3_2|Get_3_2|Put_3_2|Delete_3_2);MOM_3_2: AsynchronousQueue_3_2 [PublishSubscribe_3_2] [Transactional_3_2] [Reliability_3_2];PublishSubscribe_3_2: [Durable_3_2];Reliability_3_2: (PersistentDelivery_3_2|Acknowledgement_3_2)+;ServiceState_3_2: (StateMessaging_3_2|StatefulService_3_2)+;StateMessaging_3_2: [TwoWayState_3_2];StatefulService_3_2: (StateRepository_3_2|TemporaryMemory_3_2);InputData_3_2_1: InputName_3_2_1 InputType_3_2_1;InputData_3_2_2: InputName_3_2_2 InputType_3_2_2;InputData_3_2_3: InputName_3_2_3 InputType_3_2_3;InputData_3_2_4: InputName_3_2_4 InputType_3_2_4;InputData_3_2_5: InputName_3_2_5 InputType_3_2_5;OutputData_3_2_1: OutputName_3_2_1 OutputType_3_2_1;OutputData_3_2_2: OutputName_3_2_2 OutputType_3_2_2;Service_4: ServiceName_4 (Capability_4_1|Capability_4_2);Capability_4_1:   CommunicationTechnologie_4_1 [Authentification_4_1] [ServiceState_4_1] CapabilityName_4_1;CommunicationTechnologie_4_1: (SOAP_4_1|REST_4_1|MOM_4_1);REST_4_1: (Post_4_1|Get_4_1|Put_4_1|Delete_4_1);MOM_4_1: AsynchronousQueue_4_1 ;ServiceState_4_1: StatefulService_4_1;StatefulService_4_1: (StateRepository_4_1|TemporaryMemory_4_1);Capability_4_2:   CommunicationTechnologie_4_2 [Authentification_4_2] [ServiceState_4_2] CapabilityName_4_2;CommunicationTechnologie_4_2: (SOAP_4_2|REST_4_2|MOM_4_2);REST_4_2: (Post_4_2|Get_4_2|Put_4_2|Delete_4_2);MOM_4_2: AsynchronousQueue_4_2 ;ServiceState_4_2: StatefulService_4_2;StatefulService_4_2: (StateRepository_4_2|TemporaryMemory_4_2);Service_5: ServiceName_5 Capability_5_1;Capability_5_1:  InputData_5_1_1 InputData_5_1_2  CommunicationTechnologie_5_1 [Authentification_5_1] [ServiceState_5_1] CapabilityName_5_1;CommunicationTechnologie_5_1: (SOAP_5_1|REST_5_1|MOM_5_1);REST_5_1: (Post_5_1|Get_5_1|Put_5_1|Delete_5_1);MOM_5_1: AsynchronousQueue_5_1 ;ServiceState_5_1: StatefulService_5_1;StatefulService_5_1: (StateRepository_5_1|TemporaryMemory_5_1);InputData_5_1_1: InputName_5_1_1 InputType_5_1_1;InputData_5_1_2: InputName_5_1_2 InputType_5_1_2;Transactional_1_1 implies !Acknowledgement_1_1;Transactional_2_1 implies !Acknowledgement_2_1;Transactional_3_1 implies !Acknowledgement_3_1;Transactional_3_2 implies !Acknowledgement_3_2;";
//		
////		String ff = fmFactory.deleteAttributesValues(clean);
//		
//		FeatureModelVariable fmToDelete = fmDeleteBDD.FM("d", clean);
//		
//		System.out.println("go");
//		fmToDelete.cleanup();
//		
//		System.out.println(fmToDelete);
//		
//		
////		System.out.println(fmFactory._fmSC);
////		
////		
////		System.exit(-1);
//		
////		System.exit(-1);
//		String sp = "Root:(Service_1|Service_2|Service_3|Service_4);Service_1: ServiceName_1 (Capability_1_1|Capability_1_2|Capability_1_3);Capability_1_1:  InputData_1_1_1  OutputData_1_1_1 OutputData_1_1_2 CommunicationTechnologie_1_1 [Authentification_1_1] [ServiceState_1_1] CapabilityName_1_1;CommunicationTechnologie_1_1: (SOAP_1_1|REST_1_1|MOM_1_1);REST_1_1: (Post_1_1|Get_1_1|Put_1_1|Delete_1_1);MOM_1_1: AsynchronousQueue_1_1 [PublishSubscribe_1_1] [Transactional_1_1] [Reliability_1_1];PublishSubscribe_1_1: [Durable_1_1];Reliability_1_1: (PersistentDelivery_1_1|Acknowledgement_1_1)+;ServiceState_1_1: (StateMessaging_1_1|StatefulService_1_1)+;StateMessaging_1_1: [TwoWayState_1_1];StatefulService_1_1: (StateRepository_1_1|TemporaryMemory_1_1);InputData_1_1_1: InputName_1_1_1 InputType_1_1_1;OutputData_1_1_1: OutputName_1_1_1 OutputType_1_1_1;OutputData_1_1_2: OutputName_1_1_2 OutputType_1_1_2;Capability_1_2:  InputData_1_2_1 InputData_1_2_2  OutputData_1_2_1 CommunicationTechnologie_1_2 [Authentification_1_2] [ServiceState_1_2] CapabilityName_1_2;CommunicationTechnologie_1_2: (SOAP_1_2|REST_1_2|MOM_1_2);REST_1_2: (Post_1_2|Get_1_2|Put_1_2|Delete_1_2);MOM_1_2: AsynchronousQueue_1_2 [PublishSubscribe_1_2] [Transactional_1_2] [Reliability_1_2];PublishSubscribe_1_2: [Durable_1_2];Reliability_1_2: (PersistentDelivery_1_2|Acknowledgement_1_2)+;ServiceState_1_2: (StateMessaging_1_2|StatefulService_1_2)+;StateMessaging_1_2: [TwoWayState_1_2];StatefulService_1_2: (StateRepository_1_2|TemporaryMemory_1_2);InputData_1_2_1: InputName_1_2_1 InputType_1_2_1;InputData_1_2_2: InputName_1_2_2 InputType_1_2_2;OutputData_1_2_1: OutputName_1_2_1 OutputType_1_2_1;Capability_1_3:   CommunicationTechnologie_1_3 [Authentification_1_3] [ServiceState_1_3] CapabilityName_1_3;CommunicationTechnologie_1_3: (SOAP_1_3|REST_1_3|MOM_1_3);REST_1_3: (Post_1_3|Get_1_3|Put_1_3|Delete_1_3);MOM_1_3: AsynchronousQueue_1_3 [Reliability_1_3];PublishSubscribe_1_3: [Durable_1_3];ServiceState_1_3: StatefulService_1_3;StatefulService_1_3: (StateRepository_1_3|TemporaryMemory_1_3);Service_2: ServiceName_2 (Capability_2_1|Capability_2_2|Capability_2_3);Capability_2_1:   OutputData_2_1_1 OutputData_2_1_2 CommunicationTechnologie_2_1 [Authentification_2_1] [ServiceState_2_1] CapabilityName_2_1;CommunicationTechnologie_2_1: (SOAP_2_1|REST_2_1|MOM_2_1);REST_2_1: (Post_2_1|Get_2_1|Put_2_1|Delete_2_1);MOM_2_1: AsynchronousQueue_2_1 [PublishSubscribe_2_1] [Transactional_2_1] [Reliability_2_1];PublishSubscribe_2_1: [Durable_2_1];Reliability_2_1: (PersistentDelivery_2_1|Acknowledgement_2_1)+;ServiceState_2_1: (StateMessaging_2_1|StatefulService_2_1)+;StateMessaging_2_1: [TwoWayState_2_1];StatefulService_2_1: (StateRepository_2_1|TemporaryMemory_2_1);OutputData_2_1_1: OutputName_2_1_1 OutputType_2_1_1;OutputData_2_1_2: OutputName_2_1_2 OutputType_2_1_2;Capability_2_2:   OutputData_2_2_1 OutputData_2_2_2 CommunicationTechnologie_2_2 [Authentification_2_2] [ServiceState_2_2] CapabilityName_2_2;CommunicationTechnologie_2_2: (SOAP_2_2|REST_2_2|MOM_2_2);REST_2_2: (Post_2_2|Get_2_2|Put_2_2|Delete_2_2);MOM_2_2: AsynchronousQueue_2_2 [PublishSubscribe_2_2] [Transactional_2_2] [Reliability_2_2];PublishSubscribe_2_2: [Durable_2_2];Reliability_2_2: (PersistentDelivery_2_2|Acknowledgement_2_2)+;ServiceState_2_2: (StateMessaging_2_2|StatefulService_2_2)+;StateMessaging_2_2: [TwoWayState_2_2];StatefulService_2_2: (StateRepository_2_2|TemporaryMemory_2_2);OutputData_2_2_1: OutputName_2_2_1 OutputType_2_2_1;OutputData_2_2_2: OutputName_2_2_2 OutputType_2_2_2;Capability_2_3:  InputData_2_3_1 InputData_2_3_2  CommunicationTechnologie_2_3 [Authentification_2_3] [ServiceState_2_3] CapabilityName_2_3;CommunicationTechnologie_2_3: (SOAP_2_3|REST_2_3|MOM_2_3);REST_2_3: (Post_2_3|Get_2_3|Put_2_3|Delete_2_3);MOM_2_3: AsynchronousQueue_2_3 [Reliability_2_3];PublishSubscribe_2_3: [Durable_2_3];ServiceState_2_3: StatefulService_2_3;StatefulService_2_3: (StateRepository_2_3|TemporaryMemory_2_3);InputData_2_3_1: InputName_2_3_1 InputType_2_3_1;InputData_2_3_2: InputName_2_3_2 InputType_2_3_2;Service_3: ServiceName_3 (Capability_3_1|Capability_3_2);Capability_3_1:  InputData_3_1_1  OutputData_3_1_1 OutputData_3_1_2 OutputData_3_1_3 OutputData_3_1_4 CommunicationTechnologie_3_1 [Authentification_3_1] [ServiceState_3_1] CapabilityName_3_1;CommunicationTechnologie_3_1: (SOAP_3_1|REST_3_1|MOM_3_1);REST_3_1: (Post_3_1|Get_3_1|Put_3_1|Delete_3_1);MOM_3_1: AsynchronousQueue_3_1 [PublishSubscribe_3_1] [Transactional_3_1] [Reliability_3_1];PublishSubscribe_3_1: [Durable_3_1];Reliability_3_1: (PersistentDelivery_3_1|Acknowledgement_3_1)+;ServiceState_3_1: (StateMessaging_3_1|StatefulService_3_1)+;StateMessaging_3_1: [TwoWayState_3_1];StatefulService_3_1: (StateRepository_3_1|TemporaryMemory_3_1);InputData_3_1_1: InputName_3_1_1 InputType_3_1_1;OutputData_3_1_1: OutputName_3_1_1 OutputType_3_1_1;OutputData_3_1_2: OutputName_3_1_2 OutputType_3_1_2;OutputData_3_1_3: OutputName_3_1_3 OutputType_3_1_3;OutputData_3_1_4: OutputName_3_1_4 OutputType_3_1_4;Capability_3_2:  InputData_3_2_1 InputData_3_2_2  CommunicationTechnologie_3_2 [Authentification_3_2] [ServiceState_3_2] CapabilityName_3_2;CommunicationTechnologie_3_2: (SOAP_3_2|REST_3_2|MOM_3_2);REST_3_2: (Post_3_2|Get_3_2|Put_3_2|Delete_3_2);MOM_3_2: AsynchronousQueue_3_2 [Reliability_3_2];PublishSubscribe_3_2: [Durable_3_2];ServiceState_3_2: StatefulService_3_2;StatefulService_3_2: (StateRepository_3_2|TemporaryMemory_3_2);InputData_3_2_1: InputName_3_2_1 InputType_3_2_1;InputData_3_2_2: InputName_3_2_2 InputType_3_2_2;Service_4: ServiceName_4 (Capability_4_1|Capability_4_2|Capability_4_3|Capability_4_4);Capability_4_1:  InputData_4_1_1 InputData_4_1_2 InputData_4_1_3  OutputData_4_1_1 OutputData_4_1_2 OutputData_4_1_3 CommunicationTechnologie_4_1 [Authentification_4_1] [ServiceState_4_1] CapabilityName_4_1;CommunicationTechnologie_4_1: (SOAP_4_1|REST_4_1|MOM_4_1);REST_4_1: (Post_4_1|Get_4_1|Put_4_1|Delete_4_1);MOM_4_1: AsynchronousQueue_4_1 [PublishSubscribe_4_1] [Transactional_4_1] [Reliability_4_1];PublishSubscribe_4_1: [Durable_4_1];Reliability_4_1: (PersistentDelivery_4_1|Acknowledgement_4_1)+;ServiceState_4_1: (StateMessaging_4_1|StatefulService_4_1)+;StateMessaging_4_1: [TwoWayState_4_1];StatefulService_4_1: (StateRepository_4_1|TemporaryMemory_4_1);InputData_4_1_1: InputName_4_1_1 InputType_4_1_1;InputData_4_1_2: InputName_4_1_2 InputType_4_1_2;InputData_4_1_3: InputName_4_1_3 InputType_4_1_3;OutputData_4_1_1: OutputName_4_1_1 OutputType_4_1_1;OutputData_4_1_2: OutputName_4_1_2 OutputType_4_1_2;OutputData_4_1_3: OutputName_4_1_3 OutputType_4_1_3;Capability_4_2:  InputData_4_2_1 InputData_4_2_2  CommunicationTechnologie_4_2 [Authentification_4_2] [ServiceState_4_2] CapabilityName_4_2;CommunicationTechnologie_4_2: (SOAP_4_2|REST_4_2|MOM_4_2);REST_4_2: (Post_4_2|Get_4_2|Put_4_2|Delete_4_2);MOM_4_2: AsynchronousQueue_4_2 [Reliability_4_2];PublishSubscribe_4_2: [Durable_4_2];ServiceState_4_2: StatefulService_4_2;StatefulService_4_2: (StateRepository_4_2|TemporaryMemory_4_2);InputData_4_2_1: InputName_4_2_1 InputType_4_2_1;InputData_4_2_2: InputName_4_2_2 InputType_4_2_2;Capability_4_3:  InputData_4_3_1 InputData_4_3_2  OutputData_4_3_1 CommunicationTechnologie_4_3 [Authentification_4_3] [ServiceState_4_3] CapabilityName_4_3;CommunicationTechnologie_4_3: (SOAP_4_3|REST_4_3|MOM_4_3);REST_4_3: (Post_4_3|Get_4_3|Put_4_3|Delete_4_3);MOM_4_3: AsynchronousQueue_4_3 [PublishSubscribe_4_3] [Transactional_4_3] [Reliability_4_3];PublishSubscribe_4_3: [Durable_4_3];Reliability_4_3: (PersistentDelivery_4_3|Acknowledgement_4_3)+;ServiceState_4_3: (StateMessaging_4_3|StatefulService_4_3)+;StateMessaging_4_3: [TwoWayState_4_3];StatefulService_4_3: (StateRepository_4_3|TemporaryMemory_4_3);InputData_4_3_1: InputName_4_3_1 InputType_4_3_1;InputData_4_3_2: InputName_4_3_2 InputType_4_3_2;OutputData_4_3_1: OutputName_4_3_1 OutputType_4_3_1;Capability_4_4:  InputData_4_4_1 InputData_4_4_2 InputData_4_4_3 InputData_4_4_4 InputData_4_4_5  OutputData_4_4_1 OutputData_4_4_2 CommunicationTechnologie_4_4 [Authentification_4_4] [ServiceState_4_4] CapabilityName_4_4;CommunicationTechnologie_4_4: (SOAP_4_4|REST_4_4|MOM_4_4);REST_4_4: (Post_4_4|Get_4_4|Put_4_4|Delete_4_4);MOM_4_4: AsynchronousQueue_4_4 [PublishSubscribe_4_4] [Transactional_4_4] [Reliability_4_4];PublishSubscribe_4_4: [Durable_4_4];Reliability_4_4: (PersistentDelivery_4_4|Acknowledgement_4_4)+;ServiceState_4_4: (StateMessaging_4_4|StatefulService_4_4)+;StateMessaging_4_4: [TwoWayState_4_4];StatefulService_4_4: (StateRepository_4_4|TemporaryMemory_4_4);InputData_4_4_1: InputName_4_4_1 InputType_4_4_1;InputData_4_4_2: InputName_4_4_2 InputType_4_4_2;InputData_4_4_3: InputName_4_4_3 InputType_4_4_3;InputData_4_4_4: InputName_4_4_4 InputType_4_4_4;InputData_4_4_5: InputName_4_4_5 InputType_4_4_5;OutputData_4_4_1: OutputName_4_4_1 OutputType_4_4_1;OutputData_4_4_2: OutputName_4_4_2 OutputType_4_4_2;Transactional_1_1 implies !Acknowledgement_1_1;Transactional_1_2 implies !Acknowledgement_1_2;Transactional_2_1 implies !Acknowledgement_2_1;Transactional_2_2 implies !Acknowledgement_2_2;Transactional_3_1 implies !Acknowledgement_3_1;Transactional_4_1 implies !Acknowledgement_4_1;Transactional_4_3 implies !Acknowledgement_4_3;Transactional_4_4 implies !Acknowledgement_4_4;";
//
//		System.out.println(MockData.setAttributes(sp, fmUpdateBDD));
//		
//		System.exit(-1);
		
		//
//		// System.out.println(fmUpdateBDD.FM("tst",ff.reduceComplexitySP2(sp)));
//		// System.exit(-1);
//
//		FeatureModelVariable fmToPreserve = fmUpdateBDD.FM("ea", sp);
//
//		String sc = "Root:(Service_1|Service_2|Service_3|Service_4);Service_1: ServiceName_1 (Capability_1_1|Capability_1_2|Capability_1_3);Capability_1_1:  InputData_1_1_1  OutputData_1_1_1 OutputData_1_1_2 CommunicationTechnologie_1_1 [Authentification_1_1] [StateMessaging_1_1] CapabilityName_1_1;CommunicationTechnologie_1_1: (SOAP_1_1|REST_1_1|MOM_1_1);REST_1_1: (Post_1_1|Get_1_1|Put_1_1|Delete_1_1);MOM_1_1: AsynchronousQueue_1_1 [PublishSubscribe_1_1] [Transactional_1_1] [Reliability_1_1];PublishSubscribe_1_1: [Durable_1_1];Reliability_1_1: (PersistentDelivery_1_1|Acknowledgement_1_1)+;StateMessaging_1_1: (TwoWayState_1_1|StateRepository_1_1|TemporaryMemory_1_1)+;Authentification_1_1: Username_1_1 Password_1_1;InputData_1_1_1: InputName_1_1_1 InputType_1_1_1 InputValue_1_1_1;OutputData_1_1_1: OutputName_1_1_1 OutputType_1_1_1 ResponseHandler_1_1_1;ResponseHandler_1_1_1: (Synchronous_1_1_1|Asynchronous_1_1_1);OutputData_1_1_2: OutputName_1_1_2 OutputType_1_1_2 ResponseHandler_1_1_2;ResponseHandler_1_1_2: (Synchronous_1_1_2|Asynchronous_1_1_2);Capability_1_2:  InputData_1_2_1 InputData_1_2_2  OutputData_1_2_1 CommunicationTechnologie_1_2 [Authentification_1_2] [StateMessaging_1_2] CapabilityName_1_2;CommunicationTechnologie_1_2: (SOAP_1_2|REST_1_2|MOM_1_2);REST_1_2: (Post_1_2|Get_1_2|Put_1_2|Delete_1_2);MOM_1_2: AsynchronousQueue_1_2 [PublishSubscribe_1_2] [Transactional_1_2] [Reliability_1_2];PublishSubscribe_1_2: [Durable_1_2];Reliability_1_2: (PersistentDelivery_1_2|Acknowledgement_1_2)+;StateMessaging_1_2: (TwoWayState_1_2|StateRepository_1_2|TemporaryMemory_1_2)+;Authentification_1_2: Username_1_2 Password_1_2;InputData_1_2_1: InputName_1_2_1 InputType_1_2_1 InputValue_1_2_1;InputData_1_2_2: InputName_1_2_2 InputType_1_2_2 InputValue_1_2_2;OutputData_1_2_1: OutputName_1_2_1 OutputType_1_2_1 ResponseHandler_1_2_1;ResponseHandler_1_2_1: (Synchronous_1_2_1|Asynchronous_1_2_1);Capability_1_3:   CommunicationTechnologie_1_3 [Authentification_1_3] CapabilityName_1_3;CommunicationTechnologie_1_3: (SOAP_1_3|REST_1_3|MOM_1_3);REST_1_3: (Post_1_3|Get_1_3|Put_1_3|Delete_1_3);MOM_1_3: AsynchronousQueue_1_3 [Transactional_1_3] [Reliability_1_3];PublishSubscribe_1_3: [Durable_1_3];Reliability_1_3: (PersistentDelivery_1_3|Acknowledgement_1_3)+;Authentification_1_3: Username_1_3 Password_1_3;Service_2: ServiceName_2 (Capability_2_1|Capability_2_2|Capability_2_3);Capability_2_1:   OutputData_2_1_1 OutputData_2_1_2 CommunicationTechnologie_2_1 [Authentification_2_1] [StateMessaging_2_1] CapabilityName_2_1;CommunicationTechnologie_2_1: (SOAP_2_1|REST_2_1|MOM_2_1);REST_2_1: (Post_2_1|Get_2_1|Put_2_1|Delete_2_1);MOM_2_1: AsynchronousQueue_2_1 [PublishSubscribe_2_1] [Transactional_2_1] [Reliability_2_1];PublishSubscribe_2_1: [Durable_2_1];Reliability_2_1: (PersistentDelivery_2_1|Acknowledgement_2_1)+;StateMessaging_2_1: (TwoWayState_2_1|StateRepository_2_1|TemporaryMemory_2_1)+;Authentification_2_1: Username_2_1 Password_2_1;OutputData_2_1_1: OutputName_2_1_1 OutputType_2_1_1 ResponseHandler_2_1_1;ResponseHandler_2_1_1: (Synchronous_2_1_1|Asynchronous_2_1_1);OutputData_2_1_2: OutputName_2_1_2 OutputType_2_1_2 ResponseHandler_2_1_2;ResponseHandler_2_1_2: (Synchronous_2_1_2|Asynchronous_2_1_2);Capability_2_2:   OutputData_2_2_1 OutputData_2_2_2 CommunicationTechnologie_2_2 [Authentification_2_2] [StateMessaging_2_2] CapabilityName_2_2;CommunicationTechnologie_2_2: (SOAP_2_2|REST_2_2|MOM_2_2);REST_2_2: (Post_2_2|Get_2_2|Put_2_2|Delete_2_2);MOM_2_2: AsynchronousQueue_2_2 [PublishSubscribe_2_2] [Transactional_2_2] [Reliability_2_2];PublishSubscribe_2_2: [Durable_2_2];Reliability_2_2: (PersistentDelivery_2_2|Acknowledgement_2_2)+;StateMessaging_2_2: (TwoWayState_2_2|StateRepository_2_2|TemporaryMemory_2_2)+;Authentification_2_2: Username_2_2 Password_2_2;OutputData_2_2_1: OutputName_2_2_1 OutputType_2_2_1 ResponseHandler_2_2_1;ResponseHandler_2_2_1: (Synchronous_2_2_1|Asynchronous_2_2_1);OutputData_2_2_2: OutputName_2_2_2 OutputType_2_2_2 ResponseHandler_2_2_2;ResponseHandler_2_2_2: (Synchronous_2_2_2|Asynchronous_2_2_2);Capability_2_3:  InputData_2_3_1 InputData_2_3_2  CommunicationTechnologie_2_3 [Authentification_2_3] CapabilityName_2_3;CommunicationTechnologie_2_3: (SOAP_2_3|REST_2_3|MOM_2_3);REST_2_3: (Post_2_3|Get_2_3|Put_2_3|Delete_2_3);MOM_2_3: AsynchronousQueue_2_3 [Transactional_2_3] [Reliability_2_3];PublishSubscribe_2_3: [Durable_2_3];Reliability_2_3: (PersistentDelivery_2_3|Acknowledgement_2_3)+;Authentification_2_3: Username_2_3 Password_2_3;InputData_2_3_1: InputName_2_3_1 InputType_2_3_1 InputValue_2_3_1;InputData_2_3_2: InputName_2_3_2 InputType_2_3_2 InputValue_2_3_2;Service_3: ServiceName_3 (Capability_3_1|Capability_3_2);Capability_3_1:  InputData_3_1_1  OutputData_3_1_1 OutputData_3_1_2 OutputData_3_1_3 OutputData_3_1_4 CommunicationTechnologie_3_1 [Authentification_3_1] [StateMessaging_3_1] CapabilityName_3_1;CommunicationTechnologie_3_1: (SOAP_3_1|REST_3_1|MOM_3_1);REST_3_1: (Post_3_1|Get_3_1|Put_3_1|Delete_3_1);MOM_3_1: AsynchronousQueue_3_1 [PublishSubscribe_3_1] [Transactional_3_1] [Reliability_3_1];PublishSubscribe_3_1: [Durable_3_1];Reliability_3_1: (PersistentDelivery_3_1|Acknowledgement_3_1)+;StateMessaging_3_1: (TwoWayState_3_1|StateRepository_3_1|TemporaryMemory_3_1)+;Authentification_3_1: Username_3_1 Password_3_1;InputData_3_1_1: InputName_3_1_1 InputType_3_1_1 InputValue_3_1_1;OutputData_3_1_1: OutputName_3_1_1 OutputType_3_1_1 ResponseHandler_3_1_1;ResponseHandler_3_1_1: (Synchronous_3_1_1|Asynchronous_3_1_1);OutputData_3_1_2: OutputName_3_1_2 OutputType_3_1_2 ResponseHandler_3_1_2;ResponseHandler_3_1_2: (Synchronous_3_1_2|Asynchronous_3_1_2);OutputData_3_1_3: OutputName_3_1_3 OutputType_3_1_3 ResponseHandler_3_1_3;ResponseHandler_3_1_3: (Synchronous_3_1_3|Asynchronous_3_1_3);OutputData_3_1_4: OutputName_3_1_4 OutputType_3_1_4 ResponseHandler_3_1_4;ResponseHandler_3_1_4: (Synchronous_3_1_4|Asynchronous_3_1_4);Capability_3_2:  InputData_3_2_1 InputData_3_2_2  CommunicationTechnologie_3_2 [Authentification_3_2] CapabilityName_3_2;CommunicationTechnologie_3_2: (SOAP_3_2|REST_3_2|MOM_3_2);REST_3_2: (Post_3_2|Get_3_2|Put_3_2|Delete_3_2);MOM_3_2: AsynchronousQueue_3_2 [Transactional_3_2] [Reliability_3_2];PublishSubscribe_3_2: [Durable_3_2];Reliability_3_2: (PersistentDelivery_3_2|Acknowledgement_3_2)+;Authentification_3_2: Username_3_2 Password_3_2;InputData_3_2_1: InputName_3_2_1 InputType_3_2_1 InputValue_3_2_1;InputData_3_2_2: InputName_3_2_2 InputType_3_2_2 InputValue_3_2_2;Service_4: ServiceName_4 (Capability_4_1|Capability_4_2|Capability_4_3|Capability_4_4);Capability_4_1:  InputData_4_1_1 InputData_4_1_2 InputData_4_1_3  OutputData_4_1_1 OutputData_4_1_2 OutputData_4_1_3 CommunicationTechnologie_4_1 [Authentification_4_1] [StateMessaging_4_1] CapabilityName_4_1;CommunicationTechnologie_4_1: (SOAP_4_1|REST_4_1|MOM_4_1);REST_4_1: (Post_4_1|Get_4_1|Put_4_1|Delete_4_1);MOM_4_1: AsynchronousQueue_4_1 [PublishSubscribe_4_1] [Transactional_4_1] [Reliability_4_1];PublishSubscribe_4_1: [Durable_4_1];Reliability_4_1: (PersistentDelivery_4_1|Acknowledgement_4_1)+;StateMessaging_4_1: (TwoWayState_4_1|StateRepository_4_1|TemporaryMemory_4_1)+;Authentification_4_1: Username_4_1 Password_4_1;InputData_4_1_1: InputName_4_1_1 InputType_4_1_1 InputValue_4_1_1;InputData_4_1_2: InputName_4_1_2 InputType_4_1_2 InputValue_4_1_2;InputData_4_1_3: InputName_4_1_3 InputType_4_1_3 InputValue_4_1_3;OutputData_4_1_1: OutputName_4_1_1 OutputType_4_1_1 ResponseHandler_4_1_1;ResponseHandler_4_1_1: (Synchronous_4_1_1|Asynchronous_4_1_1);OutputData_4_1_2: OutputName_4_1_2 OutputType_4_1_2 ResponseHandler_4_1_2;ResponseHandler_4_1_2: (Synchronous_4_1_2|Asynchronous_4_1_2);OutputData_4_1_3: OutputName_4_1_3 OutputType_4_1_3 ResponseHandler_4_1_3;ResponseHandler_4_1_3: (Synchronous_4_1_3|Asynchronous_4_1_3);Capability_4_2:  InputData_4_2_1 InputData_4_2_2  CommunicationTechnologie_4_2 [Authentification_4_2] CapabilityName_4_2;CommunicationTechnologie_4_2: (SOAP_4_2|REST_4_2|MOM_4_2);REST_4_2: (Post_4_2|Get_4_2|Put_4_2|Delete_4_2);MOM_4_2: AsynchronousQueue_4_2 [Transactional_4_2] [Reliability_4_2];PublishSubscribe_4_2: [Durable_4_2];Reliability_4_2: (PersistentDelivery_4_2|Acknowledgement_4_2)+;Authentification_4_2: Username_4_2 Password_4_2;InputData_4_2_1: InputName_4_2_1 InputType_4_2_1 InputValue_4_2_1;InputData_4_2_2: InputName_4_2_2 InputType_4_2_2 InputValue_4_2_2;Capability_4_3:  InputData_4_3_1 InputData_4_3_2  OutputData_4_3_1 CommunicationTechnologie_4_3 [Authentification_4_3] [StateMessaging_4_3] CapabilityName_4_3;CommunicationTechnologie_4_3: (SOAP_4_3|REST_4_3|MOM_4_3);REST_4_3: (Post_4_3|Get_4_3|Put_4_3|Delete_4_3);MOM_4_3: AsynchronousQueue_4_3 [PublishSubscribe_4_3] [Transactional_4_3] [Reliability_4_3];PublishSubscribe_4_3: [Durable_4_3];Reliability_4_3: (PersistentDelivery_4_3|Acknowledgement_4_3)+;StateMessaging_4_3: (TwoWayState_4_3|StateRepository_4_3|TemporaryMemory_4_3)+;Authentification_4_3: Username_4_3 Password_4_3;InputData_4_3_1: InputName_4_3_1 InputType_4_3_1 InputValue_4_3_1;InputData_4_3_2: InputName_4_3_2 InputType_4_3_2 InputValue_4_3_2;OutputData_4_3_1: OutputName_4_3_1 OutputType_4_3_1 ResponseHandler_4_3_1;ResponseHandler_4_3_1: (Synchronous_4_3_1|Asynchronous_4_3_1);Capability_4_4:  InputData_4_4_1 InputData_4_4_2 InputData_4_4_3 InputData_4_4_4 InputData_4_4_5  OutputData_4_4_1 OutputData_4_4_2 CommunicationTechnologie_4_4 [Authentification_4_4] [StateMessaging_4_4] CapabilityName_4_4;CommunicationTechnologie_4_4: (SOAP_4_4|REST_4_4|MOM_4_4);REST_4_4: (Post_4_4|Get_4_4|Put_4_4|Delete_4_4);MOM_4_4: AsynchronousQueue_4_4 [PublishSubscribe_4_4] [Transactional_4_4] [Reliability_4_4];PublishSubscribe_4_4: [Durable_4_4];Reliability_4_4: (PersistentDelivery_4_4|Acknowledgement_4_4)+;StateMessaging_4_4: (TwoWayState_4_4|StateRepository_4_4|TemporaryMemory_4_4)+;Authentification_4_4: Username_4_4 Password_4_4;InputData_4_4_1: InputName_4_4_1 InputType_4_4_1 InputValue_4_4_1;InputData_4_4_2: InputName_4_4_2 InputType_4_4_2 InputValue_4_4_2;InputData_4_4_3: InputName_4_4_3 InputType_4_4_3 InputValue_4_4_3;InputData_4_4_4: InputName_4_4_4 InputType_4_4_4 InputValue_4_4_4;InputData_4_4_5: InputName_4_4_5 InputType_4_4_5 InputValue_4_4_5;OutputData_4_4_1: OutputName_4_4_1 OutputType_4_4_1 ResponseHandler_4_4_1;ResponseHandler_4_4_1: (Synchronous_4_4_1|Asynchronous_4_4_1);OutputData_4_4_2: OutputName_4_4_2 OutputType_4_4_2 ResponseHandler_4_4_2;ResponseHandler_4_4_2: (Synchronous_4_4_2|Asynchronous_4_4_2);Transactional_1_1 implies !Acknowledgement_1_1;Transactional_1_2 implies !Acknowledgement_1_2;Transactional_1_3 implies !Acknowledgement_1_3;Transactional_2_1 implies !Acknowledgement_2_1;Transactional_2_2 implies !Acknowledgement_2_2;Transactional_2_3 implies !Acknowledgement_2_3;Transactional_3_1 implies !Acknowledgement_3_1;Transactional_3_2 implies !Acknowledgement_3_2;Transactional_4_1 implies !Acknowledgement_4_1;Transactional_4_2 implies !Acknowledgement_4_2;Transactional_4_3 implies !Acknowledgement_4_3;Transactional_4_4 implies !Acknowledgement_4_4;";
//
//		FeatureModelVariable fmToUpdate = fmUpdateBDD.FM("ea2", sc);

		
//		System.out.println(fmToDelete.extract("Capability_1_1"));
		
		fmFactory.specializedAttributedFMSP = "Root:Service_1; Service_1: ServiceName_1_eq_myService1 Capability_1_1;Capability_1_1:  InputData_1_1_1  OutputData_1_1_1 CommunicationTechnologie_1_1 Authentification_1_1 ServiceState_1_1 CapabilityName_1_1_eq_myCap1;CommunicationTechnologie_1_1: (SOAP_1_1|REST_1_1);REST_1_1: Post_1_1;ServiceState_1_1: StateMessaging_1_1;StateMessaging_1_1: TwoWayState_1_1;InputData_1_1_1: InputName_1_1_1_eq_myinname1 InputType_1_1_1_eq_myintype1;OutputData_1_1_1: OutputName_1_1_1_eq_myoutname1 OutputType_1_1_1_eq_myouttype1;";

		fmFactory.specializedFMSP = fmFactory.deleteAttributesValues(fmFactory.specializedAttributedFMSP);
		
//		fmFactory.specializedFMSP = fmFactory._fmSP;
		
//		System.out.println(fmFactory.specializedFMSP);
		
//		String result = fmFactory.deleteAndUpdate2(fmFactory._fmSP, fmFactory._fmSC);
//
//		System.out.println(fmUpdateBDD.FM("ea2", result));
//		System.exit(-1);

//		String result = fmFactory.deleteAndUpdate(fmToPreserve.toString(), fmToUpdate.toString());

		// ff.reduceComplexitySP(fmToDelete.toString());

//		System.out.println(result + "\n");

		// FMSlicerSAT d = new FMSlicerSAT();
		// FeatureModelVariable re = d.sliceFM(fmToDelete, new
		// HashSet<String>(), SliceMode.EXCLUDING);
		//
		// System.out.println(re);

		// fmToDelete.hasRedundantConstraints();

		// System.out.println(fmToDelete.);
//		if (fmToDelete.getHierarchy().getDiagram().isBottom())
//			System.out.println("ok");
//		else
//			System.out.println("false");

		System.exit(-1);
		//
		// Set<String> fts = new HashSet<String>();
		//
		// fts.add("b");
		// //
		// FeatureModelVariable fmToDelete = fmDeleteBDD.deleteFM("m1", "a:
		// (b|c) d;b: [f] [g] k; g implies f;\n", fts);
		//
		// System.out.println(fmToDelete);
		//
		// fts.add("a");

		// fmDeleteBDD.FM("m1", "a: (b|c) d;c: [f] [g] k; g implies f;\n"),

		// String fm_sp_capability = "Capability: CommunicationTechnologie
		// [Authentification] [ServiceState] [CapabilityName];"
		// + "CommunicationTechnologie: (SOAP|REST|MOM);" + "REST:
		// (Post|Get|Put|Delete);"
		// + "MOM: (AsynchronousQueue|PublishSubscribe)+ [Transactional]
		// [Reliability];"
		// + "PublishSubscribe: [Durable];" + "Reliability:
		// (PersistentDelivery|Acknowledgement)+;"
		// + "ServiceState: (StateMessaging|StatefulService)+;" +
		// "StateMessaging: [TwoWayState];"
		// + "StatefulService: (StateRepository|TemporaryMemory);"
		// + "PublishSubscribe implies AsynchronousQueue;\n";
		//
		// String fm_sc_capability = "Capability: CommunicationTechnologie
		// [Authentification] [StateMessaging] [CapabilityName];"
		// + "CommunicationTechnologie: (SOAP|REST|MOM);" + "REST:
		// (Post|Get|Put|Delete);"
		// + "MOM: (AsynchronousQueue|PublishSubscribe)+ [Transactional]
		// [Reliability];"
		// + "PublishSubscribe: [Durable];" + "Reliability:
		// (PersistentDelivery|Acknowledgement)+;"
		// + "StateMessaging: (TwoWayState|StateRepository|TemporaryMemory)+;"
		// + "Authentification: Username Password;" + "PublishSubscribe implies
		// AsynchronousQueue;\n";
		//


		// fmFactory.getOmmitedSharedFeaturesSP("a: (b|c) [d]", "a: b");

		// for (String string : fmFactory.getOmmitedSharedFeaturesSP("a: (b|c)
		// [d] [ServiceState];", "a: b;")) {
		//
		// System.out.println(string);
		//
		// }
		//
		// System.exit(-1);

		fmFactory.Init();

		// System.out.println(fmFactory.contractFG.serviceFGs.size());

		fmFactory.buildFMs();

		// FMUpdateBDD fmUpdateBDD = new FMUpdateBDD();
		// fmUpdateBDD.test();
		//
		// System.exit(-1);

		// System.out.println("FM_SC:\n" + fmFactory._fmSC);
		// System.out.println("FM_SP:\n" + fmFactory._fmSP);
		//
		// System.exit(-1);

		// fmFactory._fmSC = "Root:Service_1; Service_1: ServiceName_1
		// Capability_1_1;Capability_1_1: InputData_1_1_1 OutputData_1_1_1
		// CommunicationTechnologie_1_1 [Authentification_1_1]
		// [StateMessaging_1_1] CapabilityName_1_1;CommunicationTechnologie_1_1:
		// (SOAP_1_1|REST_1_1|MOM_1_1);REST_1_1:
		// (Post_1_1|Get_1_1|Put_1_1|Delete_1_1);MOM_1_1: AsynchronousQueue_1_1
		// [PublishSubscribe_1_1] [Transactional_1_1]
		// [Reliability_1_1];PublishSubscribe_1_1:
		// [Durable_1_1];Reliability_1_1:
		// (PersistentDelivery_1_1|Acknowledgement_1_1)+;StateMessaging_1_1:
		// (TwoWayState_1_1|StateRepository_1_1|TemporaryMemory_1_1)+;Authentification_1_1:
		// Username_1_1 Password_1_1;InputData_1_1_1: InputName_1_1_1
		// InputType_1_1_1 InputValue_1_1_1;OutputData_1_1_1: OutputName_1_1_1
		// OutputType_1_1_1 ResponseHandler_1_1_1; ResponseHandler_1_1_1:
		// (Synchronous_1_1_1|Asynchronous_1_1_1);";
		//
		// fmFactory._fmSP = "Root:Service_1; Service_1: ServiceName_1
		// Capability_1_1;Capability_1_1: InputData_1_1_1 OutputData_1_1_1
		// CommunicationTechnologie_1_1 [Authentification_1_1]
		// [ServiceState_1_1] CapabilityName_1_1;CommunicationTechnologie_1_1:
		// (SOAP_1_1|REST_1_1|MOM_1_1);REST_1_1:
		// (Post_1_1|Get_1_1|Put_1_1|Delete_1_1);MOM_1_1: AsynchronousQueue_1_1
		// [PublishSubscribe_1_1] [Transactional_1_1]
		// [Reliability_1_1];PublishSubscribe_1_1:
		// [Durable_1_1];Reliability_1_1:
		// (PersistentDelivery_1_1|Acknowledgement_1_1)+;ServiceState_1_1:
		// (StateMessaging_1_1|StatefulService_1_1)+;StateMessaging_1_1:
		// [TwoWayState_1_1];StatefulService_1_1:
		// (StateRepository_1_1|TemporaryMemory_1_1);InputData_1_1_1:
		// InputName_1_1_1 InputType_1_1_1;OutputData_1_1_1: OutputName_1_1_1
		// OutputType_1_1_1;";

		boolean ok = false;

		fmFactory.contractFG.projectName = "pro1";

		// while (ok == false) {

		// Scanner sc = new Scanner(System.in);
		fmFactory.specializedAttributedFMSP = "Root:Service_1; Service_1: ServiceName_1_eq_myService1 Capability_1_1;Capability_1_1:  InputData_1_1_1  OutputData_1_1_1 CommunicationTechnologie_1_1 Authentification_1_1 ServiceState_1_1 CapabilityName_1_1_eq_myCap1;CommunicationTechnologie_1_1: (SOAP_1_1|REST_1_1);REST_1_1: Post_1_1;ServiceState_1_1: StateMessaging_1_1;StateMessaging_1_1: TwoWayState_1_1;InputData_1_1_1: InputName_1_1_1_eq_myinname1 InputType_1_1_1_eq_myintype1;OutputData_1_1_1: OutputName_1_1_1_eq_myoutname1 OutputType_1_1_1_eq_myouttype1;";

		fmFactory.specializedFMSP = fmFactory.deleteAttributesValues(fmFactory.specializedAttributedFMSP);

		fmFactory.extractAttributesValues(fmFactory.specializedAttributedFMSP);// mandatory
		// System.out.println(fmFactory.getAttributesValues(fmFactory.specializedAttributedFMSP));

		// System.exit(-1);

		boolean checkSpec = fmFactory.checkSpecialization2(fmFactory._fmSP, fmFactory.specializedFMSP);

		boolean checkEss = fmFactory.checkEssentialAndInternalVariability(fmFactory.specializedFMSP);

		boolean checkAtt = fmFactory.checkAttributesValue(fmFactory.specializedAttributedFMSP);

		if (checkSpec == true && checkEss == true && checkAtt == true) {
			ok = true;

			fmFactory.updateAndDelete(fmFactory.specializedFMSP, fmFactory._fmSC);
		} else {
			System.out.println(fmFactory.error);
			fmFactory.error = "";
		}
		// }

		///// put fms familiar in files ///////
		util.Functions.stringToFile(fmFactory.fmUpdateBDD.FM("fm_sc", fmFactory._fmSC).toString(),
				"./fm_familiar_generated/fm_sc.fml", false);
		util.Functions.stringToFile(fmFactory.fmUpdateBDD.FM("fm_sp", fmFactory._fmSP).toString(),
				"./fm_familiar_generated/fm_sp.fml", false);
		util.Functions.stringToFile(
				fmFactory.fmUpdateBDD.FM("fm_sp_spec", fmFactory.specializedAttributedFMSP).toString(),
				"./fm_familiar_generated/fm_sp_spec.fml", false);
		util.Functions.stringToFile(
				fmFactory.fmUpdateBDD.FM("fm_sc_update", fmFactory.updatedAttributedFMSC).toString(),
				"./fm_familiar_generated/fm_sc_update.fml", false);

		///// put fms s2t2 in files ///////
		S2T2Converter s2t2Converter = new S2T2Converter();
		String xmiS2T2;

		xmiS2T2 = s2t2Converter.fmlToS2T2XMI(fmFactory.fmUpdateBDD.FM("fm_sc", fmFactory._fmSC));
		util.Functions.stringToFile(xmiS2T2, "./fm_s2t2_generated/fm_sc.fmprimitives", false);

		xmiS2T2 = s2t2Converter.fmlToS2T2XMI(fmFactory.fmUpdateBDD.FM("fm_sp", fmFactory._fmSP));
		util.Functions.stringToFile(xmiS2T2, "./fm_s2t2_generated/fm_sp.fmprimitives", false);

		xmiS2T2 = s2t2Converter
				.fmlToS2T2XMI(fmFactory.fmUpdateBDD.FM("fm_sp_spec", fmFactory.specializedAttributedFMSP));
		util.Functions.stringToFile(xmiS2T2, "./fm_s2t2_generated/fm_sp_spec.fmprimitives", false);

		xmiS2T2 = s2t2Converter.fmlToS2T2XMI(fmFactory.fmUpdateBDD.FM("fm_sc_update", fmFactory.updatedAttributedFMSC));
		util.Functions.stringToFile(xmiS2T2, "./fm_s2t2_generated/fm_sc_update.fmprimitives", false);

		// System.exit(-1);

		// fmFactory.reduceComplexitySP();

		// System.out.println("FM_SP reduce:\n" +
		// fmFactory.fmSPReduceComplexity);

		//
		// fr.unice.polytech.modalis.familiar.variable.Comparison p =
		// fmUpdateBDD.FM("fm_sp_capability1", "a: (b|c);\n")
		// .compare(fmUpdateBDD.FM("fm_sp_capability2", "a: (b|c)+ d;\n"));
		//
		// System.out.println(p);

		//

		// fmFactory.checkEssentialAndInternalVariability();

		// fmFactory.updateFMSC();
		//
		// System.exit(-1);
		//
		// FeatureModelVariable fmUpdate =
		// fmUpdateBDD.updateFM(fmUpdateBDD.FM("fm_sc_capability",
		// fmFactory._fmSC),
		// fmUpdateBDD.FM("fm_sp_capability", fmFactory.fmSPReduceComplexity),
		// fmFactory.getInternalFeaturesSP(fmFactory.fmSPReduceComplexity),
		// SliceMode.INCLUDING);
		// System.out.println("FM_Update:\n" + fmUpdate);
		//
		// System.exit(-1);

		// FMLtoS2T2 fmLtoS2T2 = new
		// FMLtoS2T2(fmUpdateBDD.FM("fm_sc_capability", fmFactory.fmSC));
		// FeatureModel d= fmLtoS2T2.process();

		// System.exit(-1);

	}

}
