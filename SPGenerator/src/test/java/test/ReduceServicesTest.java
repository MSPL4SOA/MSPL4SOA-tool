package test;

import familiar.FMFactory;
import main.MainGui;

public class ReduceServicesTest {

	public static void main(String[] args) throws Exception {
//
//		String projectName = "a1";
//
//		String projectDir = MainGui.projectsFilesGeneratedPath + projectName + "/fm_familiar_generated/";

		String fmSCPath = "/home/akram/Desktop/fm3.fml";
		String fmSCString = util.Functions.fileToString(fmSCPath);

		
		System.out.println(fmSCString);
		
		System.out.println();
		
		System.out.println(FMFactory.buildFMV(FMFactory.extractContractFG(fmSCString),fmSCString));


	}

}
