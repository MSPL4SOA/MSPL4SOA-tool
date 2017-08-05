package test;

public class GenerateSCs {

	public static void main(String[] args) {

//		try {
//			
//			String fmFilePath = "files_generated/sync3/fm_sc_update.fml";
//			FeatureModelVariable fmvSC = FMBDD.getInstance().FM("fm",
//					Functions.fileToString(fmFilePath));
//			ArrayList<Variable> configsList = new ArrayList<Variable>(fmvSC.configs());
//
//			ArrayList<AMSC> amscList = new ArrayList<AMSC>();
//
//			for (Variable variable : configsList) {
//
//				Set<String> features = AMSC.variableToSet(variable);
//
//				String conf = "rootd:";
//
//				for (String feature : features) {
//					conf += " " + FMFactory.addQuote(feature);
//				}
//
//				conf += ";";
//				
//				System.out.println(conf);
//
//
////				AMSC amsc = new AMSC();
////
////				amsc.amGenerator = new SCGenerator(fmFilePath);
////				
////				String amFilePath = "files_generated/sync3/test.fml";
////				
////				Functions.stringToFile(conf, amFilePath, false);
////				amsc.amGenerator.setAmFilePath(amFilePath);
////				amsc.amGenerator.convertAMToContractXML(FMBDD.getInstance().FM("fm", conf));
////
////				amscList.add(amsc);
//			}
//
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

	}

}
