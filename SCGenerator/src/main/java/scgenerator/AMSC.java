package scgenerator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.Variable;
import gsd.synthesis.FeatureModel;
import scfactory.SCGenerator;
import scfactory.FMBDD;
import scfactory.SCProject;
import util.Functions;
import util.MockData;

public class AMSC {

	public JLabel lblScAm;
	public JButton scFamiliarBtn;
	public JButton s2t2Btn;
	public JButton generateBtn;

	public JFrame frame;
	public SCProject scProject;

	public FMBDD fmbdd;

	public String amFilePath;
	public boolean valid;

	public String am;
	public String amS2T2FilePath;

	public static int scAMNumber = 1;

	public static int amSCValidNumber = 1;
	public static int yAbs = 100;
	TextEditor textEditor;

	public SCGenerator amGenerator;

	public static final String EQ_ATTRIBUTE = "_eq_";

	// public Capability capability;
	// public String capabilityPath;

	public AMSC(JFrame frame, final SCProject scProject, final FMBDD fmbdd) {

		this.scProject = scProject;
		this.frame = frame;
		this.fmbdd = fmbdd;
		lblScAm = new JLabel("AM SC update " + scAMNumber + " :");
		scFamiliarBtn = new JButton("Familiar");
		generateBtn = new JButton("Generate a random AM SC update");
		s2t2Btn = new JButton("S2T2");

		this.amS2T2FilePath = SCProject.FM_SC_UPDATE_S2T2_PATH;

		final String fmToConfigure;
		if (valid == false)

			fmToConfigure = util.Functions.fileToString(scProject.fmSCUpdateFMLPath)
					.replaceAll("\"", "");
		else
			fmToConfigure = util.Functions.fileToString(amFilePath).replaceAll("\"", "");

		textEditor = new TextEditor();
		textEditor.setTextPane(fmToConfigure);
		textEditor.setTitle("SC FM in " + scProject.fmSCUpdateFMLPath);
		textEditor.scProject = scProject;
		textEditor.amsc = this;

		scAMNumber++;

		//// events

		scFamiliarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textEditor.getFrame().setVisible(true);
			}
		});

		s2t2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				util.Functions.execExtProg("java -jar " + SCProject.S2T2_JAR_PATH + " " + amS2T2FilePath);
			}
		});

		generateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// scProject.

				try {

					// System.out.println(generateRandomSCAM());
					textEditor.setTextPane(generateRandomSCAM());

					JOptionPane.showMessageDialog(null, "A random AM SC update is generated", "OK",
							JOptionPane.OK_OPTION);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}

	public void createSCAM() {
		lblScAm.setBounds(40, yAbs - 5, 130, 35);
		scFamiliarBtn.setBounds(170, yAbs, 100, 25);
		s2t2Btn.setBounds(300, yAbs, 80, 25);
		generateBtn.setBounds(410, yAbs, 280, 25);

		frame.getContentPane().add(lblScAm);
		frame.getContentPane().add(s2t2Btn);
		frame.getContentPane().add(scFamiliarBtn);
		frame.getContentPane().add(generateBtn);

		yAbs += 40;
		frame.getContentPane().validate();
		frame.getContentPane().repaint();
	}

	// faster
	public String generateRandomSCAM() throws Exception {
		int serviceCount = scProject.contract.services.size();
		int serviceNumber = Functions.randInt(0, serviceCount - 1);

		int capabilityCount = scProject.contract.services.get(serviceNumber).capabilities.size();
		int capabilityNumber = Functions.randInt(0, capabilityCount - 1);

		String capabilityName = "Capability_" + (serviceNumber + 1) + "_" + (capabilityNumber + 1);

		FeatureModelVariable fmvFM = fmbdd.FM("fm", scProject.fmSCUpdateFML_eq_);

		FeatureModel<String> capabilityFM = fmvFM.extract(capabilityName);

		FeatureModelVariable fmvCapability = new FeatureModelVariable("capability", capabilityFM);

		ArrayList<Variable> capabilityConfigsList = new ArrayList<Variable>(fmvCapability.configs());
		ArrayList<Variable> capabilityCommunicationConfigsList = new ArrayList<Variable>();

		// choose between soap mom rest

		int rand;
		String communicationFeature = "";

		while (capabilityCommunicationConfigsList.size() == 0) {

			rand = Functions.randInt(1, 30);
			if (rand <= 10)
				communicationFeature = "SOAP";
			else if (rand <= 20)
				communicationFeature = "REST";
			else
				communicationFeature = "MOM";

			for (Variable variable : capabilityConfigsList) {

				if (variable.getValue().contains(communicationFeature))
					capabilityCommunicationConfigsList.add(variable);
			}
			// System.out.println("max : " +
			// capabilityCommunicationConfigsList.size());
		}

		int capabilityCommunicationConfigsCount = capabilityCommunicationConfigsList.size();

		int capabilityCommunicationConfigsNumber = Functions.randInt(0, capabilityCommunicationConfigsCount - 1);
		Variable confVariable = capabilityCommunicationConfigsList.get(capabilityCommunicationConfigsNumber);

		String conf = confVariable.getValue().replaceAll(";", " ").replaceFirst("\\{", "").replaceFirst("\\}", "");

		String serviceId = "Service_" + (serviceNumber + 1);

		String serviceFeature = "ServiceName_" + (serviceNumber + 1) + "_eq_"
				+ scProject.contract.services.get(serviceNumber).interfaceName;

		// String capabilityFeature = capabilityName + "_eq_"
		// +
		// scProject.contract.services.get(serviceNumber).capabilities.get(capabilityNumber).name;

		// remane capability
		// conf = conf.replaceFirst(capabilityName, capabilityFeature);

		conf = conf.replaceFirst(capabilityName, "");

		conf = "Root : " + serviceId + " " + serviceFeature + " " + capabilityName + ";" + capabilityName + ":" + conf
				+ ";";

		String confResult = MockData.setAttributes(conf, fmbdd);

		confResult = confResult.replaceAll("_eq_", "=");

		return confResult;
	}

	// public static void generateAllAMSC() throws Exception {
	//
	// FeatureModelVariable fmvSC;
	// try {
	// fmvSC = FMBDD.getInstance().FM("fm",
	// Functions.fileToString(SCProject.FM_SC_UPDATE_FML_PATH).replaceAll("=",
	// "_eq_"));
	// // System.out.println("GO!!");
	//
	// ArrayList<Variable> configsList = new
	// ArrayList<Variable>(fmvSC.configs());
	//
	// for (Variable confVariable : configsList) {
	//
	// String conf = "RootSynthetis : "
	// + confVariable.getValue().replaceAll(";", " ").replaceFirst("\\{",
	// "").replaceFirst("\\}", "")
	// + ";";
	//
	// String confResult = MockData.setAttributes(conf, FMBDD.getInstance());
	//
	// // confResult = confResult.replaceAll(EQ_ATTRIBUTE, "=");
	//
	// AMSC amsc = new AMSC(null, null, FMBDD.getInstance());
	//
	// amsc.valid = true;
	// amsc.am = confResult;
	//
	// FeatureModelVariable fmvAM = amsc.fmbdd.FM("am", confResult);
	//
	// // FeatureModelVariable fmvAM = amsc.fmbdd.FM("am",
	// // confResult.replaceAll("=", EQ_ATTRIBUTE));
	//
	// String amID = AMGenerator.getFeatureValue(fmvAM, "ServiceName") + "_"
	// + AMGenerator.getFeatureValue(fmvAM, "CapabilityName") + "_" +
	// AMSC.amSCValidNumber++;
	//
	// amsc.amFilePath = SCProject.AM_DIR + amID + ".fml";
	// util.Functions.stringToFile(confResult, amsc.amFilePath, false);
	//
	// // amsc.capabilityPath = SCProject.CAPABILITY_Dir +
	// // "capability_" + amID + ".xml";
	//
	// amsc.amGenerator = new AMGenerator(amsc.amFilePath);
	//
	// amsc.amGenerator.fmlToObject(fmvAM);
	//
	// }
	//
	// } catch (Exception ex) {
	// // TODO Auto-generated catch block
	// ex.printStackTrace();
	// }
	// }

	// @Deprecated
	// public String generateRandomSCAM2() throws Exception {
	// FeatureModelVariable fmvFM = fmbdd.FM("fm", scProject.fmSCUpdateFML_eq_);
	//
	// ArrayList<Variable> configsList = new
	// ArrayList<Variable>(fmvFM.configs());
	//
	// int confNumber = randInt(1, configsList.size());
	//
	// String conf = configsList.get(confNumber - 1).getValue();
	//
	// conf = conf.replaceAll(";", " ").replaceFirst("\\{",
	// "").replaceFirst("\\}", "");
	//
	// conf = "RootRandom: " + conf + ";";
	//
	// return conf;
	// }

	public String getAmFilePath() {
		return amFilePath;
	}

	public SCGenerator getAmGenerator() {
		return amGenerator;
	}
}