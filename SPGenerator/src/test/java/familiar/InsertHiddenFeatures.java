package familiar;

import org.xtext.example.mydsl.fML.FeatureEdgeKind;

import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import gsd.synthesis.FeatureModel;
import main.MainGui;

public class InsertHiddenFeatures {

	public static void main(String[] args) throws Exception {

		// String projectName = "sp_manager";
		//
		// String projectDir = MainGui.projectsFilesGeneratedPath + projectName
		// + "/fm_familiar_generated/";
		//
		// String fmSCPath = projectDir + "fm_sc.fml";
		// String fmSCString =
		// util.Functions.fileToString(fmSCPath);
		//
		// FeatureModelVariable fmSCFMV = FMBDD.getInstance().FM("fmsc",
		// fmSCString);

		HiddenFeatures hiddenFeatures = new HiddenFeatures();

		// FeatureModelVariable fmvToinsert = FMBDD.getInstance().FM("fmsc",
		// "TopicConfiguration: TopicJNDI;");

		FeatureInsertForXML featureInsert1 = new FeatureInsertForXML("TopicConfiguration", "PublishSubscribe@@1",
				FeatureEdgeKind.MANDATORY.toString(), "TopicConfiguration@@1: TopicJNDI@@1;");
		
		featureInsert1.attributes.add(new FeatureAttribute("TopicJNDI@@1","@@2"
				 + "_topic@@1"));
		
//		this.queueIn = artifactId + "_in_queue_" + serviceName + "_" + capabilityName;
//		this.queueOut = artifactId + "_out_queue_" + serviceName + "_" + capabilityName;
//		this.topic = artifactId + "_topic_" + serviceName + "_" + capabilityName;

		FeatureInsertForXML featureInsert2 = new FeatureInsertForXML("QueueConfiguration", "AsynchronousQueue@@1",
				FeatureEdgeKind.MANDATORY.toString(), "QueueConfiguration@@1: QueueInJNDI@@1 QueueOutJNDI@@1;");

		featureInsert2.attributes.add(new FeatureAttribute("QueueInJNDI@@1","@@2"
				 + "_in_queue@@1"));
		
		featureInsert2.attributes.add(new FeatureAttribute("QueueOutJNDI@@1","@@2"
				 + "_out_queue@@1"));
		
		FeatureInsertForXML featureInsert3 = new FeatureInsertForXML("MOMConfiguration", "MOM@@1",
				FeatureEdgeKind.MANDATORY.toString(),
				"MOMConfiguration@@1: InitialContextFactory@@1 ProviderUrl@@1 SecurityPrincipal@@1 "
						+ "SecurityCredentials@@1 ConnectionConsumerFactory@@1;");

		featureInsert3.attributes.add(
				new FeatureAttribute("InitialContextFactory@@1", 
						"org.jboss.naming.remote.client.InitialContextFactory"));
		featureInsert3.attributes.add(
				new FeatureAttribute("ProviderUrl@@1", "remote://localhost:4447"));
		featureInsert3.attributes.add(
				new FeatureAttribute("SecurityPrincipal@@1", "guest"));
		featureInsert3.attributes.add(
				new FeatureAttribute("SecurityCredentials@@1", "jboss@dmin88"));
		featureInsert3.attributes.add(
				new FeatureAttribute("ConnectionConsumerFactory@@1", "jms/RemoteConnectionFactory"));

		
		FeatureInsertForXML featureInsert4 = new FeatureInsertForXML("ProjectName", "ServiceContract",
				FeatureEdgeKind.MANDATORY.toString(), "ProjectName;");
		featureInsert4.attributes.add(new FeatureAttribute("ProjectName","@@2"));

		
		hiddenFeatures.featureInserts.add(featureInsert1);
		hiddenFeatures.featureInserts.add(featureInsert2);
		hiddenFeatures.featureInserts.add(featureInsert3);
		hiddenFeatures.featureInserts.add(featureInsert4);

		util.JAXBUtil.marshall(hiddenFeatures, "/home/akram/Desktop/hiddensharedfeatures.xml");

	}

}
