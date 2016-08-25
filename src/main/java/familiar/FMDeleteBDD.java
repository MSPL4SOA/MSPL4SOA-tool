package familiar;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import fr.unice.polytech.modalis.familiar.interpreter.FMLShell;
import fr.unice.polytech.modalis.familiar.parser.FMLCommandInterpreter;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.Variable;
import gsd.synthesis.BDDBuilder;
import gsd.synthesis.Expression;
import gsd.synthesis.ExpressionType;

//import fr.familiar.variable.FeatureModelVariable;

public class FMDeleteBDD {

	public FMLShell _shell;
	public BDDBuilder<String> _builder;
	public FMLCommandInterpreter _environment;

	public FMDeleteBDD() {

		_shell = FMLShell.instantiateStandalone(System.in);
		_environment = _shell.getCurrentEnv();
		_builder = FMLCommandInterpreter.getBuilder();
	}

	/**
	 * 
	 */

	public FeatureModelVariable deleteFM(String fmID, String fmSpecification, Set<String> fts) throws Exception {
		return deleteFM(FM(fmID, fmSpecification), fts);
	}

	public FeatureModelVariable deleteFM(FeatureModelVariable fmToDelete, Set<String> fts) {

//		System.out.println("------------------");
//		
//		System.out.println("ftsi" + fts);
		
		
		for (String ftsi : fts) {
			
			Expression<String> nf = new Expression<String>(
					ExpressionType.NOT, new Expression<String>(
							ftsi), null);

			fmToDelete.addFreeVariableToRoot(ftsi);
			fmToDelete.addConstraint(nf);
			
//			System.out.println(ftsi);
			
//			fmToDelete.getFm().getDiagram().addFreeVariable(ftsi); 
			
//			System.out.println(ftsi);

		}
		if (fts.size() != 0)
			fmToDelete.cleanup2();
		
//		Formula<String> fla = fmToDelete.getFormula() ; 
//		
//		Formula<String> delete = new FormulaAnalyzer<String>(fla, _builder)
//				.removeDeadFeatures();
//		
//		KSynthesisBDD fdsf = new KSynthesisBDD(delete, new KnowledgeSynthesis(fmToDelete.getFm().getDiagram()),
//				_builder);
//
//		// System.out.println(fmToUpdate.getHierarchy().getDiagram().features());
//		fmToDelete = fdsf.build();
//		
//		
//		System.out.println("dead: " + fmToDelete.deads());
//		
//		
//		
//		System.out.println(fmToDelete.features().names());
////		
//		Scanner sc = new Scanner(System.in);
//		sc.next();

		return fmToDelete;

	}

	public void test() throws Exception {

		System.out.println("Start");
		FeatureModelVariable fmToDelete;
		Set<String> fts = new HashSet<String>();

		fmToDelete = FM("m1", "a: (b|c) d;b: [f] [g] k; g implies f;\n");

		fts.add("k");
		// assertNotNull(fmToPreserve);
		// assertNotNull(fmToUpdate);

		FeatureModelVariable fmUpdated = deleteFM(fmToDelete, fts);
		System.out.println("Result");
		System.out.println(fmUpdated);
		System.out.println("End");

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
