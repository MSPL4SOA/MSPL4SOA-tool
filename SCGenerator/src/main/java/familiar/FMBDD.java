package familiar;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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
import gsd.synthesis.Formula;

public class FMBDD {

	public FMLShell _shell;
	public BDDBuilder<String> _builder;
	public FMLCommandInterpreter _environment;

	private static FMBDD FMBDD_INSTANCE;

	private static FMSlicer FM_SLICER_INSTANCE;

	public static FMSlicer getSlicerInstance() {
		if (FM_SLICER_INSTANCE == null) {
			FM_SLICER_INSTANCE = new FMSlicerBDD(FMBDD.getInstance()._builder);
		}

		return FM_SLICER_INSTANCE;
	}

	/**
	 * 
	 */
	private FMBDD() {
		_shell = FMLShell.instantiateStandalone(System.in);
		_environment = _shell.getCurrentEnv();
		_builder = FMLCommandInterpreter.getBuilder();
	}

	public static FMBDD getInstance() {
		if (FMBDD_INSTANCE == null) {
			System.out.println("Begin loading FAMILIAR resources");
			FMBDD_INSTANCE = new FMBDD();
			// fmbdd._shell = FMLShell.instantiateStandalone(System.in);
			// fmbdd._environment =fmbdd._shell.getCurrentEnv();
			// fmbdd._builder = FMLCommandInterpreter.getBuilder();

			System.out.println("Terminate loading FAMILIAR resources");
		}

		return FMBDD_INSTANCE;
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

	public static FeatureModelVariable synthesisFM(Formula<String> formula, FeatureModelVariable fmv) {

		Formula<String> formulaWithoutDeadFeatures = new FormulaAnalyzer<String>(formula, FMBDD.getInstance()._builder)
				.removeDeadFeatures();

		FeatureGraph<String> hierarchy = FMBDD.getSlicerInstance().sliceHierarchy(fmv,
				formulaWithoutDeadFeatures.getDomain(), SliceMode.INCLUDING);

		// FeatureModel<String> fmHierarchy = new
		// FeatureModel<String>(hierarchy) ;
		// System.exit(-1);

		// return new FeatureModelLazyVariable(fmv.getIdentifier(),
		// fmv.getFm(), diffFormula, builder);

		//
		KSynthesisBDD fdsf = new KSynthesisBDD(formulaWithoutDeadFeatures, new KnowledgeSynthesis(hierarchy),
				FMBDD.getInstance()._builder);
		//
		// // System.out.println(fmToUpdate.getHierarchy().getDiagram());
		FeatureModelVariable fmvSliced = fdsf.build();
		fmvSliced.cleanup2();
		return fmvSliced;

	}

}
