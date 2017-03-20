package zakzouk;

import java.util.ArrayList;
import java.util.Set;

import fr.unice.polytech.modalis.familiar.variable.SetVariable;
import gsd.graph.ImplicationGraph;

public class TestMain {

	public static void main(String[] args) throws Exception {

		// String fm = "a: (b|c)+ [d];b: [f] [g];f -> d;\n";

		String fm = "a: [b];b: (f|c) ; c : h; f -> c;\n";
		FMReasoning rq = new FMReasoning(fm);

		// System.out.println(rq.getRequiresConstraints());

		Set<String> features = rq.fmv.features().names();

		ArrayList<String> requiresConstraints = new ArrayList<String>();

		ImplicationGraph<String> ds = new ImplicationGraph<String>();

		//
		for (String feature : features) {
			if (rq.fmv.getFeature(feature).parent() != null)
				requiresConstraints.add(feature + " -> " + rq.fmv.getFeature(feature).parent().name());
		}

		System.out.println(requiresConstraints);

		// rq.showFM();

	}

}
