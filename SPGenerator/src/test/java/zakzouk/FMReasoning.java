package zakzouk;

import familiar.FMBDD;
import fr.unice.polytech.modalis.familiar.fm.converter.ExclusionGraph;
import fr.unice.polytech.modalis.familiar.fm.converter.S2T2Converter;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import generating.SwitchyardProject;
import gsd.graph.ImplicationGraph;
import main.MainGui;

public class FMReasoning {
	
	
	String fm;
	FeatureModelVariable fmv;
	String filesS2T2Path;
	String fileName;
	String fileS2T2CompletPath;
	S2T2Converter s2t2Converter;
	String xmiS2T2;
	
	//"a: (b|c)+ [d];b: [f] [g];f -> d;\n"
	
	public FMReasoning(String fm) throws Exception {
		
		this.fm = fm;
		fmv = FMBDD.getInstance().FM("dsq", fm);
		
		filesS2T2Path = MainGui.FILES_GENERATED_PATH + "/zakzouk/";
		util.Functions.mkdirIfExist(filesS2T2Path);
		
		fileName = "test.fmprimitives";
		fileS2T2CompletPath = filesS2T2Path + fileName;
		
		
		s2t2Converter = new S2T2Converter();
	}
	
	public void showFM() throws Exception
	{
		xmiS2T2 = s2t2Converter.fmlToS2T2XMI(
				FMBDD.getInstance().FM("fm_sp_spec", fm));
		util.Functions.stringToFile(xmiS2T2, fileS2T2CompletPath, false);
				
		util.Functions.execExtProg("java -jar " + SwitchyardProject.S2T2_JAR_PATH + " " + fileS2T2CompletPath);
		
	}
	
	
	public ImplicationGraph<String> getRequiresConstraints()
	{
	//rq.fmv.getBiImplicationConstraints()	
//		return fmv.getImplicationGraphFromPCEdges(FMBDD.getInstance()._builder);
		
		return fmv.getImplicationGraphFromFeatureHierarchy(FMBDD.getInstance()._builder);
	}
	
	public ExclusionGraph<String> getExcludesConstraints()
	{
		
		return fmv.getExclusionGraphFromFeatureHierarchy(FMBDD.getInstance()._builder);
	}
	
//	public static void main(String[] args) {
//	
//		try {
//			ImplicationGraph<String> ig = fmv.getImplicationGraphFromFeatureHierarchy(FMBDD.getInstance()._builder);
//			
//			System.out.println(ig);
//			
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
