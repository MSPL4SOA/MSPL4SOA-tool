package scgenerator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import familiar.FMFactory;
import features.bean.Capability;
import features.bean.Input;
import features.bean.Service;
import fr.unice.polytech.modalis.familiar.fm.converter.S2T2Converter;
import fr.unice.polytech.modalis.familiar.operations.Mode;
import fr.unice.polytech.modalis.familiar.variable.Comparison;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.SetVariable;
import gsd.synthesis.FeatureModel;
import scfactory.SCGenerator;
import scfactory.SCGeneratorException;
import scfactory.FMBDD;
import scfactory.SCProject;

public class TextEditor {

	private JFrame frame;
	private JTextPane textPane;
	private JButton btnSaveSpSpecialized;

	private JPanel panel;

	JButton generateSPButton;

	public SCProject scProject;

	String error = "";
	public AMSC amsc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextEditor window = new TextEditor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TextEditor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

		textPane = new JTextPane();
		scrollPane.setViewportView(textPane);

		btnSaveSpSpecialized = new JButton("Check the consistency of AM SC update");

		btnSaveSpSpecialized.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String am = textPane.getText();

				error = "";
				amsc.valid = false;

				// System.out.println(am);
				try {

//					System.out.println(scProject.fmSCUpdateFML + "\n");
//					System.out.println(am);
					
					FeatureModelVariable fmvFM = FMBDD.getInstance().FM("fm",
							scProject.fmSCUpdateFML);

					FeatureModelVariable fmvAM = FMBDD.getInstance().FM("am", am);

					error += checkAttributesValue(fmvAM);
					error += checkConformConfiguration(fmvAM, fmvFM);
					// boolean checkConform = true;

					if ("".equals(error)) {

						System.out.println("valid");
						amsc.valid = true;
						amsc.am = am;

						String amID = SCGenerator.getFeatureValue(fmvAM, "ServiceName") + "_"
								+ SCGenerator.getFeatureValue(fmvAM, "CapabilityName") + "_" + AMSC.amSCValidNumber++;

						amsc.amFilePath = SCProject.AM_DIR + amID + ".fml";
						util.Functions.stringToFile(am, amsc.amFilePath, false);

						// amsc.capabilityPath = SCProject.CAPABILITY_Dir +
						// "capability_" + amID + ".xml";

						S2T2Converter s2t2Converter = new S2T2Converter();

						System.out.println(amsc.am);
						String xmiS2T2 = s2t2Converter
								.fmlToS2T2XMI(FMBDD.getInstance().FM("am_sc_update", amsc.am));
						

						amsc.amS2T2FilePath = SCProject.AM_S2T2_DIR + amID + ".fmprimitives";

						util.Functions.stringToFile(xmiS2T2, amsc.amS2T2FilePath, false);

						amsc.amGenerator = new SCGenerator(scProject.fmSCUpdateFMLPath);
						amsc.amGenerator.setAmFilePath(amsc.amFilePath);

						amsc.amGenerator.convertAMToContractXML(fmvAM);

						JOptionPane.showMessageDialog(null, "The AM SC update is valid", "OK", JOptionPane.OK_OPTION,
								new ImageIcon(SCProject.FILE_ICON_OK_PATH));

					} else {

						System.out.println("not valid1");
						JOptionPane optionPane = new JOptionPane(error);
						optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);

						Object[] options = {};
						optionPane.setOptions(options);

						JDialog dialog1 = new JDialog(frame, "error");
						dialog1.setBounds(200, 200, 300, 200);
						dialog1.getContentPane().add(optionPane);
						dialog1.pack();
						dialog1.setVisible(true); // Shows the dialog
						dialog1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

						// JOptionPane.showMessageDialog(null, fmFactory.error,
						// "Error Massage",
						// JOptionPane.ERROR_MESSAGE);

						// System.out.println(fmFactory.error);
					}
				} catch (Exception e1) {

					System.out.println("not valid2");

					StringWriter errors = new StringWriter();
					e1.printStackTrace(new PrintWriter(errors));

					// e1.printStackTrace();
					System.out.println("Syntax problem");

					error += "The syntax of the AM SC update is incorrect.\n";

					JOptionPane optionPane = new JOptionPane(error);
					optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);

					Object[] options = {};
					optionPane.setOptions(options);
					JDialog dialog1 = new JDialog(frame, "error");
					dialog1.setBounds(200, 200, 300, 200);
					dialog1.getContentPane().add(optionPane);
					dialog1.pack();
					dialog1.setVisible(true); // Shows the dialog
					dialog1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

					// JOptionPane.showMessageDialog(null, fmFactory.error,
					// "Error Massage",
					// JOptionPane.ERROR_MESSAGE);

					// System.out.println(fmFactory.error);

				}

			}
		});
		scrollPane.setColumnHeaderView(btnSaveSpSpecialized);

		panel = new JPanel();
		scrollPane.setRowHeaderView(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setTextPane(String text) {
		textPane.setText(text);
	}

	public void setTitle(String text) {
		frame.setTitle(text);
	}

	public JTextPane getTextPane() {
		return textPane;
	}

	public JButton getBtnSaveSpSpecialized() {
		return btnSaveSpSpecialized;
	}

	public void setGenerateSPButton(JButton generateSPButton) {
		this.generateSPButton = generateSPButton;
	}

	public static String checkAttributesValue(FeatureModelVariable fmv) throws Exception {

		String error = "";
//		boolean result = true;

		ArrayList<String> attributeFeaturesStringList = util.Functions.StringToList(SCProject.SC_ATTRIBUTES_CONTENT,
				"\n");
		String regexFeaturesString = FMFactory.regexFeatures(attributeFeaturesStringList);

		for (String feature : fmv.features().names()) {

			if (feature.matches(regexFeaturesString) && !feature.contains(FMFactory.EQ_ATTRIBUTE)) {
//				result = false;
				error += "The feature " + feature + " is an attribute and must be valued by =.\n";
			}
		}

		return error;
	}

	public static String checkConformConfiguration(FeatureModelVariable am, FeatureModelVariable fm) {

		String error = "";
		
		try {
			FeatureModelVariable amTemp = FMBDD.getInstance().FM("am", am.toString());
			FeatureModelVariable fmTemp = FMBDD.getInstance().FM("fm", fm.toString());

			if (!(amTemp.getMandatory().size() == amTemp.features().size())) {
				error += "All features of AM SC update must be mandatory.\n";

			} else {
				amTemp = FMBDD.getInstance().FM("am", FMFactory.deleteAttributesValues(am.toString()));
				fmTemp = FMBDD.getInstance().FM("fm1", FMFactory.deleteAttributesValues(fm.toString()));

				String capabilityName = getFeatureName(amTemp, "Capability_.*");

				FeatureModel<String> amFM = amTemp.extract(capabilityName);
				FeatureModel<String> fmFM = fmTemp.extract(capabilityName);

				amTemp = new FeatureModelVariable("am3", amFM);
				//
				fmTemp = new FeatureModelVariable("fm2", fmFM);

				Comparison comparison = amTemp.compare(fmTemp);
				if (comparison != Comparison.SPECIALIZATION) {
					error += "The AM SC update must be comform to FM SC update.\n";
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return error;
	}

	public static String getFeatureName(FeatureModelVariable fmv, String featureToSearch) {

		for (String feature : fmv.features().names()) {

			if (feature.matches(".*" + featureToSearch + ".*")) {

				return feature.split(FMFactory.EQ_ATTRIBUTE)[0];
			}
		}
		return "";

	}

	public String getFeature(FeatureModelVariable fmv, String regex) {

		for (String feature : fmv.features().names()) {

			if (feature.matches(regex)) {
				return feature;
			}
		}
		return "";

	}

//	public static String deleteAttributesValues(String fm) {
//
//		FeatureModelVariable fmFMV = null;
//		try {
//			fmFMV = FMBDD.getInstance().FM("fm", fm);
//
//			SetVariable fmSPFMVFeatures = fmFMV.features();
//
//			for (String featureName : fmSPFMVFeatures.names()) {
//
//				if (featureName.matches(".+" + FMFactory.EQ_ATTRIBUTE + ".*")) {
//
//					fmFMV.renameFeature(featureName, featureName.substring(0, featureName.indexOf(FMFactory.EQ_ATTRIBUTE)));
//
//				}
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return fmFMV.toString();
//	}
//	
//
//	public static String regexFeatures(ArrayList<String> inFeatures) {
//
//		// a
//		// b
//		// => (a|b).*
//
//		String result = "(";
//
//		if (inFeatures.size() == 1)
//			return inFeatures.get(0) + ".*";
//
//		for (int i = 0; i < inFeatures.size(); i++) {
//
//			result += inFeatures.get(i);
//
//			if (inFeatures.size() - 1 != i)
//				result += "|";
//
//		}
//
//		result += ").*";
//
//		return result;
//	}

}
