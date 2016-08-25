package familiar;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.xtext.example.mydsl.fML.SliceMode;

import fr.unice.polytech.modalis.familiar.interpreter.FMLShell;
import fr.unice.polytech.modalis.familiar.operations.FMSlicer;
import fr.unice.polytech.modalis.familiar.operations.FMSlicerBDD;
import fr.unice.polytech.modalis.familiar.operations.FormulaAnalyzer;
import fr.unice.polytech.modalis.familiar.operations.KSynthesisBDD;
import fr.unice.polytech.modalis.familiar.operations.KnowledgeSynthesis;
import fr.unice.polytech.modalis.familiar.parser.FMLCommandInterpreter;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.Variable;
import gsd.synthesis.BDDBuilder;
import gsd.synthesis.FeatureGraph;
import gsd.synthesis.FeatureModel;
import gsd.synthesis.Formula;

public class FMUpdateBDD {

	public FMLShell _shell;
	public BDDBuilder<String> _builder;
	public FMLCommandInterpreter _environment;
	FMSlicer fmSlicerBDD;

	/**
	 * 
	 */
	public FMUpdateBDD() {
		_shell = FMLShell.instantiateStandalone(System.in);
		_environment = _shell.getCurrentEnv();
		_builder = FMLCommandInterpreter.getBuilder();
		fmSlicerBDD = new FMSlicerBDD(_builder);
	}

	public FeatureModelVariable updateFM(String fmID1, String fmSpecification1, String fmID2, String fmSpecification2,
			SliceMode sliceMode) throws Exception {
		return updateFM(FM(fmID1, fmSpecification1), FM(fmID2, fmSpecification2), sliceMode);
	}

	public FeatureModelVariable updateFM(FeatureModelVariable fmToUpdate, FeatureModelVariable fmToPreserve,
			SliceMode sliceMode) {

		Set<String> fmToUpdateFeatures = fmToUpdate.getFm().features();
		Set<String> fmToPreserveFeatures = fmToPreserve.getFm().features();

		Set<String> intersectionFeatures = new HashSet<String>(fmToUpdateFeatures);
		intersectionFeatures.retainAll(fmToPreserveFeatures);

		return updateFM(fmToUpdate, fmToPreserve, intersectionFeatures, sliceMode);

	}

	// method used
	public FeatureModelVariable updateFM(FeatureModelVariable fmToUpdate, FeatureModelVariable fmToPreserve,
			Set<String> fts, SliceMode sliceMode) {

		System.out.println("Slice in update");
		FeatureModelVariable slicedfmToPreserve = fmToPreserve.slice(sliceMode, fts);

		System.out.println("Update");

		Formula<String> mergedFormula = fmToUpdate.getFormula().andWith(slicedfmToPreserve.getFormula());

		Formula<String> mergedFormulaWithoutDeadFeatures = new FormulaAnalyzer<String>(mergedFormula, _builder)
				.removeDeadFeatures();

		System.out.println(mergedFormulaWithoutDeadFeatures.getDomain());

		FeatureGraph<String> hierarchy = fmSlicerBDD.sliceHierarchy(fmToUpdate,
				mergedFormulaWithoutDeadFeatures.getDomain(), SliceMode.INCLUDING);

		// FeatureModel<String> fmHierarchy = new
		// FeatureModel<String>(hierarchy) ;
		// System.exit(-1);

		// return new FeatureModelLazyVariable(fmv.getIdentifier(),
		// fmv.getFm(), diffFormula, builder);

		KSynthesisBDD fdsf = new KSynthesisBDD(mergedFormulaWithoutDeadFeatures, new KnowledgeSynthesis(hierarchy),
				_builder);

		// System.out.println(fmToUpdate.getHierarchy().getDiagram().features());
		FeatureModelVariable fmvSliced = fdsf.build();
		return fmvSliced;
	}

	// public FeatureModelVariable updateFMSAT(FeatureModelVariable fmToUpdate,
	// FeatureModelVariable fmToPreserve) {
	//
	// Set<String> fmToUpdateFeatures = fmToUpdate.getFm().features();
	// Set<String> fmToPreserveFeatures = fmToPreserve.getFm().features();
	//
	// Set<String> intersectionFeatures = new
	// HashSet<String>(fmToUpdateFeatures);
	// intersectionFeatures.retainAll(fmToPreserveFeatures);
	//
	//// FMSlicerSAT slicerSATFormula = new FMSlicerSAT();
	//// FeatureModelVariable slicedFM =slicerSATFormula.sliceFM(fmToPreserve,
	// intersectionFeatures,
	//// SliceMode.INCLUDING);
	//
	//
	// SlicerSATFormula slicerSATFormula = new SlicerSATFormula();
	// SATFormula slicedfmToPreserve = (SATFormula)
	// slicerSATFormula.sliceFormula(fmToPreserve, intersectionFeatures,
	// SliceMode.INCLUDING);
	//
	//
	//
	//// Formula<String> mergedFormula =
	// slicedFM.getFormula().andWith(fmToUpdate.getFormula());
	//
	//// fmToUpdate.getFormula().andWith(slicerSATFormula);
	//
	//
	//// FeatureModelVariable slicedfmToPreserve =
	// fmToPreserve.slice(SliceMode.INCLUDING, fts);
	//
	//// SATFormula mergedFormula = fmToUpdate.getDF
	//
	//
	// Formula<String> mergedFormulaWithoutDeadFeatures = new
	// FormulaAnalyzer<String>(mergedFormula,
	// fmToUpdate.getBuilder()).removeDeadFeatures();
	//
	// KSynthesisSAT kSynthesisSAT = new
	// KSynthesisSAT(mergedFormulaWithoutDeadFeatures,
	// new KnowledgeSynthesis(fmToUpdate.getHierarchy().getDiagram()));
	//
	//
	// // System.out.println(fmToUpdate.getHierarchy().getDiagram().features());
	// FeatureModelVariable fmvSliced = kSynthesisSAT.build();
	// return fmvSliced;
	// }

	public void test() throws Exception {

		System.out.println("Begin");
		FeatureModelVariable fmToUpdate;
		FeatureModelVariable fmToPreserve;

		fmToUpdate = FM("m1", "a: (b|c)+ d;b: [f] [g];\n");

		fmToPreserve = FM("m2", "a2: b e; e:f;b: (c|g|d);\n");

		FeatureModelVariable fmUpdated = updateFM(fmToUpdate, fmToPreserve, SliceMode.INCLUDING);
		System.out.println("Result");
		System.out.println(fmUpdated);

		System.out.println("End");
	}

	public FeatureModelVariable updateFM(String fmToUpdateString, String fmToPreserveString, Set<String> fts,
			SliceMode sliceMode) throws Exception {

		FeatureModelVariable fmToUpdate;
		FeatureModelVariable fmToPreserve;

		fmToUpdate = FM("m1", fmToUpdateString + ";\n");

		fmToPreserve = FM("m2", fmToPreserveString + ";\n");

		return updateFM(fmToUpdate, fmToPreserve, fts, sliceMode);

	}

	public FeatureModelVariable FM(String fmID, String fmSpecification) throws Exception {

		String actualFmSpecification = "";
		if (!fmSpecification.startsWith("FM (")) {
			actualFmSpecification = "FM (" + fmSpecification + " )";
		} else
			actualFmSpecification = fmSpecification;

		_shell.parse(fmID + " = " + actualFmSpecification + "\n");
		return getFMVariable(fmID);

	}

	public FeatureModelVariable getFMVariable(String id) throws Exception {
		Variable v = _environment.getVariable(id);
		assertNotNull(v);
		assertTrue(v instanceof FeatureModelVariable);

		FeatureModelVariable fmv = (FeatureModelVariable) v;

		return fmv;

	}
}

//
// public String updateFM(String fmToUpdateString, String fmToPreserveString)
// throws Exception {
//
// FeatureModelVariable fmToUpdate;
// FeatureModelVariable fmToPreserve;
//
// FMLFeatureModelReader featureModelReader = new FMLFeatureModelReader();
//
// FeatureModel f = featureModelReader.parseString(fmToUpdateString);
//
// fmToUpdate = new FeatureModelVariable("e", f);
//
// gsd.synthesis.FeatureModel<String> f2 = (gsd.synthesis.FeatureModel<String>)
// featureModelReader
// .parseString(fmToUpdateString);
//
// fmToUpdate = new FeatureModelVariable("e", f);
// // fmToUpdate = FM("m1", fmToUpdateString + ";\n");
// //
// // fmToPreserve = FM("m2", fmToPreserveString + ";\n");
//
// return updateFM(fmToUpdate, fmToPreserve).toString();
//
// }
