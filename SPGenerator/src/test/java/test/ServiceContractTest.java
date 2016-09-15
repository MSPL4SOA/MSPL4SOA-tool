package test;

import familiar.FMFactory;
import features.bean.Contract;
import main.MainGui;

public class ServiceContractTest {

	public static void main(String[] args) throws Exception {
	

		String projectName = "upda1";

		String projectDir = MainGui.projectsFilesGeneratedPath + projectName + "/fm_familiar_generated/";

		String fmSCPath = projectDir + "fm_sc_update.fml";
		String fmSCString = util.Functions.fileToString(fmSCPath).replaceAll("=", "_eq_");
		
		
		Contract contract = FMFactory.convertFMSCUpdateToContractXML(fmSCString);
		
		util.JAXBUtil.marshall(contract, "/home/akram/Desktop/contract.xml");

	}

}
