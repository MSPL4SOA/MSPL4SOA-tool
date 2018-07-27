package familiar;

import java.io.File;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.io.IFeatureModelWriter;
import de.ovgu.featureide.fm.core.io.xml.XmlFeatureModelReader;
import de.ovgu.featureide.fm.core.io.xml.XmlFeatureModelWriter;
import fr.unice.polytech.modalis.familiar.fm.featureide.FMLtoFeatureIDE;
import fr.unice.polytech.modalis.familiar.fm.featureide.FeatureIDEtoFML;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import util.Functions;

public class TrasnformToFeatureIDE {
	
	public static void main(String[] args) throws Exception {
		
		String fm = "a: [b] [c] d; b -> c; c -> b; ";
		
		fm = Functions.fileToString("/home/akram/Desktop/fm_sp.fml");
		
		FeatureModelVariable fmv = FMBDD.getInstance().FM("aez", fm);
		
		FMLtoFeatureIDE fmLtoFeatureIDE = new FMLtoFeatureIDE(fmv);
		FeatureModel fmFeatureIDE = fmLtoFeatureIDE.convert();
		System.out.println(fmFeatureIDE);
		
		IFeatureModelWriter fmWriter  = new XmlFeatureModelWriter(fmFeatureIDE); 
		
		fmWriter.writeToFile(new File("/home/akram/Desktop/fm.xml"));
		
		System.out.println("=============================");
		
		
		de.ovgu.featureide.fm.core.FeatureModel featureModel = new FeatureModel();
		
		XmlFeatureModelReader featureModelReader = new XmlFeatureModelReader(featureModel);
		featureModelReader.readFromFile(new File("/home/akram/Desktop/fm.xml"));
		
		FeatureIDEtoFML featureIDEtoFML = new FeatureIDEtoFML(featureModel);
		System.out.println(featureIDEtoFML.writeToString());
		
	}

}
