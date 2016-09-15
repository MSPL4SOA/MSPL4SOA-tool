package familiar;

import java.util.HashSet;
import java.util.Set;

import org.xtext.example.mydsl.fML.SliceMode;

import fr.unice.polytech.modalis.familiar.operations.FormulaAnalyzer;
import fr.unice.polytech.modalis.familiar.operations.KSynthesisBDD;
import fr.unice.polytech.modalis.familiar.operations.KnowledgeSynthesis;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import gsd.synthesis.Expression;
import gsd.synthesis.ExpressionType;
import gsd.synthesis.FeatureGraph;
import gsd.synthesis.Formula;
import net.sf.javabdd.BDD;

//import fr.familiar.variable.FeatureModelVariable;

public class FMDeleteBDD {

	// public FMLShell _shell;
	// public BDDBuilder<String> _builder;
	// public FMLCommandInterpreter _environment;

	private FMDeleteBDD() {

		// _shell = FMLShell.instantiateStandalone(System.in);
		// _environment = _shell.getCurrentEnv();
		// _builder = FMLCommandInterpreter.getBuilder();
	}

	/**
	 * @throws Exception
	 * 
	 */

	// public static FeatureModelVariable deleteFM(String fmID, String
	// fmSpecification, Set<String> fts) throws Exception {
	// return deleteFM(FMBDD.getInstance().FM(fmID, fmSpecification), fts);
	// }

	public static Formula<String> getDeleteFMFormula(FeatureModelVariable fmToDelete, Set<String> fts)
			throws Exception {
		String ftsiToDeleteFeaturesString = fmToDelete.root().getFtName() + ": ";
		String ftsiToDeleteConstraintsString = "";

		for (String ftsi : fts) {
			ftsiToDeleteFeaturesString += "[" + ftsi + "] ";
			ftsiToDeleteConstraintsString += "!" + ftsi + ";";
		}

		String fmd = ftsiToDeleteFeaturesString + ";" + ftsiToDeleteConstraintsString;
		FeatureModelVariable ftsiToDeleteFMV = FMBDD.getInstance().FM("fmdelete", fmd);

		
		return ftsiToDeleteFMV.getFormula();
	}

	public static FeatureModelVariable deleteFM2(FeatureModelVariable fmToDelete, Set<String> fts) throws Exception {

		if (fts.size() == 0)
			return fmToDelete;

		String ftsiToDeleteFeaturesString = fmToDelete.root().getFtName() + ": ";
		String ftsiToDeleteConstraintsString = "";

		for (String ftsi : fts) {
			ftsiToDeleteFeaturesString += "[" + ftsi + "] ";
			ftsiToDeleteConstraintsString += "!" + ftsi + ";";
		}

		String fmd = ftsiToDeleteFeaturesString + ";" + ftsiToDeleteConstraintsString;
		FeatureModelVariable ftsiToDeleteFMV = FMBDD.getInstance().FM("dsq", fmd);

		Formula<String> fmToDeleteFormula = fmToDelete.getFormula();

		Formula<String> mergedFormula = fmToDeleteFormula.andWith(ftsiToDeleteFMV.getFormula());

//		Formula<String> mergedFormulaWithoutDeadFeatures = new FormulaAnalyzer<String>(mergedFormula,
//				FMBDD.getInstance()._builder).removeDeadFeatures();
//
//		FeatureGraph<String> hierarchy = FMBDD.getSlicerInstance().sliceHierarchy(fmToDelete,
//				fmToDeleteFormula.getDomain(), SliceMode.INCLUDING);
//
//		KSynthesisBDD fdsf = new KSynthesisBDD(mergedFormulaWithoutDeadFeatures, new KnowledgeSynthesis(hierarchy),
//				FMBDD.getInstance()._builder);
//		//
//		// // System.out.println(fmToUpdate.getHierarchy().getDiagram());
//		FeatureModelVariable fmvSliced = fdsf.build();

		return FMBDD.synthesisFM(mergedFormula, fmToDelete);

	}

	// public static FeatureModelVariable deleteFM(FeatureModelVariable
	// fmToDelete, Set<String> fts) {
	//
	// // System.out.println("------------------");
	// //
	// // System.out.println("ftsi" + fts);
	//
	// for (String ftsi : fts) {
	//
	// Expression<String> nf = new Expression<String>(ExpressionType.NOT, new
	// Expression<String>(ftsi), null);
	//
	// fmToDelete.addFreeVariableToRoot(ftsi);
	// fmToDelete.addConstraint(nf);
	//
	// // System.out.println(ftsi);
	//
	// // fmToDelete.getFm().getDiagram().addFreeVariable(ftsi);
	//
	// // System.out.println(ftsi);
	//
	// }
	//
	// // if (fts.size() != 0)
	// fmToDelete.cleanup2();
	//
	// // Formula<String> fla = fmToDelete.getFormula() ;
	// //
	// // Formula<String> delete = new FormulaAnalyzer<String>(fla, _builder)
	// // .removeDeadFeatures();
	// //
	// // KSynthesisBDD fdsf = new KSynthesisBDD(delete, new
	// // KnowledgeSynthesis(fmToDelete.getFm().getDiagram()),
	// // _builder);
	// //
	// // //
	// // System.out.println(fmToUpdate.getHierarchy().getDiagram().features());
	// // fmToDelete = fdsf.build();
	// //
	// //
	// // System.out.println("dead: " + fmToDelete.deads());
	// //
	// //
	// //
	// // System.out.println(fmToDelete.features().names());
	// ////
	// // Scanner sc = new Scanner(System.in);
	// // sc.next();
	//
	// return fmToDelete;
	//
	// }

	public static void test() throws Exception {

		System.out.println("Start");
		FeatureModelVariable fmToDelete;
		Set<String> fts = new HashSet<String>();

		fmToDelete = FMBDD.getInstance().FM("m1", "a: (b|c) [d] [h];b: [f] [g] k; g implies f;d -> k;\n");

		fts.add("k");
		fts.add("h");
		// assertNotNull(fmToPreserve);
		// assertNotNull(fmToUpdate);

		FeatureModelVariable fmUpdated = deleteFM2(fmToDelete, fts);
		System.out.println("Result");
		System.out.println(fmUpdated);
		System.out.println("End");

	}

	public static void main(String[] args) throws Exception {

		test();

	}

	// public FeatureModelVariable FM(String fmID, String fmSpecification)
	// throws Exception {
	//
	// String actualFmSpecification = "";
	// if (!fmSpecification.startsWith("FM (")) {
	// actualFmSpecification = "FM (" + fmSpecification + " )";
	// } else
	// actualFmSpecification = fmSpecification;
	//
	// FMBDD.getInstance()._shell.parse(fmID + " = " + actualFmSpecification +
	// "\n");
	// return getFMVariable(fmID);
	//
	// }
	//
	// public FeatureModelVariable getFMVariable(String id) throws Exception {
	// Variable v = FMBDD.getInstance()._environment.getVariable(id);
	// assertNotNull(v);
	// assertTrue(v instanceof FeatureModelVariable);
	//
	// FeatureModelVariable fmv = (FeatureModelVariable) v;
	//
	// return fmv;
	//
	// }

}
