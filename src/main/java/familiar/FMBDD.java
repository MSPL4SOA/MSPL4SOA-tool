package familiar;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import fr.unice.polytech.modalis.familiar.interpreter.FMLShell;
import fr.unice.polytech.modalis.familiar.parser.FMLCommandInterpreter;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.Variable;
import gsd.synthesis.BDDBuilder;

public class FMBDD {

	public FMLShell _shell;
	public BDDBuilder<String> _builder;
	public FMLCommandInterpreter _environment;
	
	private static FMBDD fmbdd;

	/**
	 * 
	 */
	private FMBDD() {
		_shell = FMLShell.instantiateStandalone(System.in);
		_environment = _shell.getCurrentEnv();
		_builder = FMLCommandInterpreter.getBuilder();
	}
	
	public static FMBDD getInstance()
	{
		if(fmbdd == null)
		{
			System.out.println("Begin loading FAMILIAR resources");
			fmbdd = new FMBDD();
//			fmbdd._shell = FMLShell.instantiateStandalone(System.in);
//			fmbdd._environment =fmbdd._shell.getCurrentEnv();
//			fmbdd._builder = FMLCommandInterpreter.getBuilder();
			
			System.out.println("Terminate loading FAMILIAR resources");
		}
		
		return fmbdd;
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
