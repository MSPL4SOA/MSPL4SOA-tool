package zakzouk;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.xtext.example.mydsl.fML.SliceMode;

import familiar.FMBDD;
import familiar.FMUpdateBDD;
import fr.unice.polytech.modalis.familiar.parser.FMBuilder;
import fr.unice.polytech.modalis.familiar.test.FMLTest;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import gsd.graph.ImplicationGraph;
import gsd.graph.SimpleEdge;
import main.MainGui;

public class MyImplicationGraph{


	public void testIdea() throws Exception {
		
		String projectName = "large2";

		String projectDir = MainGui.projectsFilesGeneratedPath + projectName + "/fm_familiar_generated/";

		String fmSCPath = projectDir + "fm_sc.fml";
		String fmSCString = util.Functions.fileToString(fmSCPath);

		System.out.println("Begin");
		FeatureModelVariable fmv;
		
//		fmv = FM("m1", fmSCString);
		
		fmv =  FMBDD.getInstance().FM("m1", "a: (b|c)+ d;b: [f] [g];\n");
		
		
		ImplicationGraph<String> ig = fmv.getImplicationGraphFromFeatureHierarchy(FMBDD.getInstance()._builder);
		
		System.out.println(ig);
		
//		ig.getAllEdges("", "");
//		
//		for (SimpleEdge edge : ig.edges()) {
//			
//			System.out.println();
//		}
		
		


		System.out.println("End");
	}

}
