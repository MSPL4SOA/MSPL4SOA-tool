package test;

import java.util.Set;

import familiar.FMBDD;
import fr.unice.polytech.modalis.familiar.fm.FMLUtils;
import fr.unice.polytech.modalis.familiar.fm.featureide.AllConfigsSAT;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;

public class GenerateConfigTest {

	public static void main(String[] args) throws Exception {

		String fmSCPath = "/home/akram/Desktop/fm3.fml";
		String fmSCString = util.Functions.fileToString(fmSCPath).replaceAll("=", "_eq_");

		
		FeatureModelVariable fm1 = FMBDD.getInstance().FM("fm1",fmSCString);
		
//		Set<Set<String>> sfm1 = FMLUtils.setConfigToSetStr(fm1.configs());
//
//		for (Set<String> set : sfm1) {
//			
//			for (String string : set) {
//				
//				System.out.print(string + " ");
//			}
//			
//			break;
//		}
//		
		
		AllConfigsSAT allConfigsSAT = AllConfigsSAT.make(fm1);
		

	}

}
