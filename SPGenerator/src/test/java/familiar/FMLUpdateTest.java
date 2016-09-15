package familiar;


import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.xtext.example.mydsl.fML.SliceMode;

import fr.unice.polytech.modalis.familiar.test.FMLTest;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;

public class FMLUpdateTest extends FMLTest {

	@Test
	public void testIdea() throws Exception {

		System.out.println("Begin");
		FeatureModelVariable fmToUpdate;
		FeatureModelVariable fmToPreserve;
		Set<String> fts = new HashSet<String>();


		fmToUpdate = FM("m1", "a: (b|c)+ d;b: [f] [g];\n");

		fmToPreserve = FM("m2", "a2: b e; e:f;b: (c|g|d);\n");

		// fts.add("a");
		// fts.add("b");
		// fts.add("c");
		// fts.add("f");
		// fts.add("g");
		// assertNotNull(fmToPreserve);
		// assertNotNull(fmToUpdate);

		FeatureModelVariable fmUpdated = FMUpdateBDD.updateFM(fmToUpdate, fmToPreserve, SliceMode.INCLUDING);
		System.out.println("Result");
		System.out.println(fmUpdated);

		System.out.println("End");
	}

}
