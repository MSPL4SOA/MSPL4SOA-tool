package scgenerator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;

import familiar.FMFactory;
import fr.unice.polytech.modalis.familiar.fm.converter.S2T2Converter;
import fr.unice.polytech.modalis.familiar.operations.CountingStrategy;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.Variable;
import gsd.synthesis.FeatureModel;
import mock.MockData;
import scfactory.SCGenerator;
import scfactory.FMBDD;
import scfactory.SCProject;
import util.Functions;

public class MainGui {

	private JFrame frame;
	private JTextField hostTextField;

	private SCProject scProject;

	private FMBDD fmbdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui window = new MainGui();
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
	public MainGui() {

		fmbdd = FMBDD.getInstance();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	public ArrayList<AMSC> scamArray = new ArrayList<AMSC>();
	private JTextField textMaxField;

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1086, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblHostName = new JLabel("Host name :");

		hostTextField = new JTextField();
		hostTextField.setText("http://localhost:8080");
		hostTextField.setColumns(10);

		final JButton scAMbtnButton = new JButton("New AM SC sync");
		scAMbtnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AMSC scam = new AMSC(frame, scProject, fmbdd);
				scam.createSCAM();
				scamArray.add(scam);

			}
		});
		scAMbtnButton.setVisible(false);

		final JLabel scAttributeFeaturesLbl = new JLabel("FM SC sync attribute features");

		scAttributeFeaturesLbl.setVisible(false);

		final JTextArea attributeSCextArea = new JTextArea();
		attributeSCextArea.setEditable(false);
		attributeSCextArea.setText(SCProject.SC_ATTRIBUTES_CONTENT);

		// try {
		// attributeSCextArea
		// .setText(new
		// String(Files.readAllBytes(Paths.get(getClass().getResource(SCProject.SC_ATTRIBUTES_PATH).toURI()))));
		// } catch (IOException | URISyntaxException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }

		// new
		// String(Files.readAllBytes(Paths.get(getClass().getResource(SCProject.SC_ATTRIBUTES_PATH).toURI())))

		attributeSCextArea.setVisible(false);

		final JButton generateSCAMsBtn = new JButton("Generate SC artifacts");
		generateSCAMsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// verify at least one scam is valid
				ArrayList<AMSC> amscList = new ArrayList<AMSC>();
				boolean atLeastOnResponseHandlerAsynchonous = false;

				for (AMSC amsc : scamArray) {
					if (amsc.valid == true) {

						if (atLeastOnResponseHandlerAsynchonous == false
								&& amsc.amGenerator.extractCapabilityFromContract().asynchronous == true)
							atLeastOnResponseHandlerAsynchonous = true;

						amscList.add(amsc);
						// util.Functions.stringToFile(scam.am, scam.amFilePath,
						// false);
						// util.JAXBUtil.marshall(scam.capability,
						// scam.capabilityPath);
					}
				}

				if (amscList.size() != 0) {

					String className = "SC";
					String scPkg = scProject.contract.projectName + ".main";
					String scDir = SCProject.SRC_Dir + scPkg.replaceAll("\\.", "/") + "/";
//					String projectName = scProject.contract.projectName;

					Functions.mkdirIfExist(scDir);

					// scProject.contract.dataOutputPkg
					VelocityEngine ve = new VelocityEngine();
					ve.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, SCProject.VELOCITY_DIR);
					ve.init();

					/* add that list to a VelocityContext */
					VelocityContext context = new VelocityContext();
					StringWriter writer = new StringWriter();
					context.put("amscList", amscList);
					context.put("className", className);
					context.put("scPkg", scPkg);
					context.put("dataOutputPkg", scProject.contract.dataOutputPkg);
					context.put("atLeastOnResponseHandlerAsynchonous", atLeastOnResponseHandlerAsynchonous);
					context.put("projectName", scProject.contract.projectName);

					/* get the Template */
					Template t = ve.getTemplate("sc.vm");
					/* now render the template into a Writer */
					t.merge(context, writer);
					System.out.println(writer);
					String classSCPath = scDir + className + ".java";
					Functions.stringToFile(writer.toString(), classSCPath, false);

					util.JavaCodeFormatter.formattingCode(new File(classSCPath));

					JOptionPane.showMessageDialog(null, "The AMs SC sync artifacts have been generated", "OK",
							JOptionPane.OK_OPTION, new ImageIcon(SCProject.FILE_ICON_OK_PATH));

				} else {
					JOptionPane.showMessageDialog(null, "A one valid AM SC sync must at least be defined", "Error",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		generateSCAMsBtn.setVisible(false);

		final JButton btnFmScUpdate = new JButton("View FM SC sync (S2T2)");
		btnFmScUpdate.setVisible(false);

		final JLabel amsCountLbl = new JLabel("AM SC sync count: Loading...");
		amsCountLbl.setForeground(Color.RED);
		amsCountLbl.setFont(new Font("Dialog", Font.BOLD, 16));
		amsCountLbl.setVisible(false);

		final JButton btnGenerateAllAmscupdate = new JButton("Generate all AM SC sync");
		final JLabel lblMax = new JLabel("Max:");

		btnGenerateAllAmscupdate.setVisible(false);

		JButton btnNewButton = new JButton("Download FM SP spec-sync and configure the SC generator");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					scProject = new SCProject(hostTextField.getText());
					// scProject.mkdirProject();
					scProject.downloadFiles();
					scProject.configureSC();

					scAMbtnButton.setVisible(true);
					scAttributeFeaturesLbl.setVisible(true);
					attributeSCextArea.setVisible(true);
					generateSCAMsBtn.setVisible(true);
					btnFmScUpdate.setVisible(true);
					amsCountLbl.setVisible(true);
					btnGenerateAllAmscupdate.setVisible(true);

					lblMax.setVisible(true);
					textMaxField.setVisible(true);

					JOptionPane.showMessageDialog(null, "The SC generator have been configured", "OK",
							JOptionPane.OK_OPTION, new ImageIcon(SCProject.FILE_ICON_OK_PATH));

					Thread thread = new Thread("New Thread") {
						public void run() {
							FeatureModelVariable fmvSC;
							try {
								fmvSC = FMBDD.getInstance().FM("fm",
										util.Functions.fileToString(scProject.fmSCUpdateFMLPath));
								// System.out.println("GO!!");
								// int amsCount = fmvSC.configsBDD().size();

								FeatureModelVariable fmvSCReduce = FMBDD.getInstance().FM("fm",
										FMFactory.reduceComplexitySP(fmvSC.toString()));

								int amsCount = (int) fmvSCReduce.counting(CountingStrategy.SAT_FML) / 2;
								// System.out.println(amsCount);
								amsCountLbl.setText("AM SC sync count: " + amsCount);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

						}
					};

					thread.start();

				} catch (Exception ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "Problem occured: " + ex.getMessage(), "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnFmScUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				util.Functions
						.execExtProg("java -jar " + SCProject.S2T2_JAR_PATH + " " + SCProject.FM_SC_UPDATE_S2T2_PATH);
			}
		});

		btnGenerateAllAmscupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FeatureModelVariable fmvSC;
				try {
					fmvSC = FMBDD.getInstance().FM("fm", util.Functions.fileToString(scProject.fmSCUpdateFMLPath));
					// System.out.println("GO!!");

					ArrayList<Variable> configsList = new ArrayList<Variable>(fmvSC.configs());

					int maxAMs = Integer.valueOf(textMaxField.getText());

					for (Variable confVariable : configsList) {
						if (maxAMs-- == 0)
							break;
						// String conf = "RootSynthetis : " +
						// confVariable.getValue().replaceAll(";", " ")
						// .replaceFirst("\\{", "").replaceFirst("\\}", "") +
						// ";";

						String serviceFeature = AMSC.searchFeatureIntoVariable(confVariable, "Service_");
						String capabilityFeature = AMSC.searchFeatureIntoVariable(confVariable, "Capability_");

						FeatureModelVariable fmvSCCapability = new FeatureModelVariable("fm",
								fmvSC.extract(capabilityFeature));

						Set<String> capabilityFeatures = com.google.common.collect.Sets
								.intersection(AMSC.variableToSet(confVariable), fmvSCCapability.features().names());

						String conf = AMSC.variableToFMStr(fmvSC, capabilityFeatures, serviceFeature,
								capabilityFeature);

						String confResult = MockData.setAttributes(conf);

						AMSC amsc = new AMSC(frame, scProject, FMBDD.getInstance());
						amsc.createSCAM();

						amsc.valid = true;
						amsc.am = confResult;

						// FeatureModelVariable fmvAM = amsc.fmbdd.FM("am",
						// confResult);

						FeatureModelVariable fmvAM = amsc.fmbdd.FM("am", confResult);

						String amID = SCGenerator.getFeatureValue(fmvAM, "ServiceName") + "_"
								+ SCGenerator.getFeatureValue(fmvAM, "CapabilityName") + "_" + AMSC.amSCValidNumber++;

						amsc.amFilePath = SCProject.AM_DIR + amID + ".fml";
						util.Functions.stringToFile(confResult, amsc.amFilePath, false);

						// amsc.capabilityPath = SCProject.CAPABILITY_Dir +
						// "capability_" + amID + ".xml";

						S2T2Converter s2t2Converter = new S2T2Converter();

						String xmiS2T2 = s2t2Converter.fmlToS2T2XMI(FMBDD.getInstance().FM("am_sc_update", amsc.am));

						amsc.amS2T2FilePath = SCProject.AM_S2T2_DIR + amID + ".fmprimitives";

						util.Functions.stringToFile(xmiS2T2, amsc.amS2T2FilePath, false);

						amsc.amGenerator = new SCGenerator(scProject.fmSCUpdateFMLPath);
						amsc.amGenerator.setAmFilePath(amsc.amFilePath);

						amsc.amGenerator.convertAMToContractXML(fmvAM);

						amsc.textEditor.amsc = amsc;
						amsc.textEditor.setTextPane(amsc.am);

						scamArray.add(amsc);

						System.out.println(amsc.amFilePath);
						System.out.println(confResult);
					}

					JOptionPane.showMessageDialog(null, "All the AM SC sync have been generated", "OK",
							JOptionPane.OK_OPTION, new ImageIcon(SCProject.FILE_ICON_OK_PATH));

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}

			}
		});

		lblMax.setVisible(false);

		textMaxField = new JTextField();
		textMaxField.setText("-1");
		textMaxField.setColumns(10);
		textMaxField.setVisible(false);

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(lblHostName)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(hostTextField,
										GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup().addGap(26).addComponent(scAMbtnButton).addGap(33)
								.addComponent(btnFmScUpdate)))
				.addGap(18)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(btnNewButton)
						.addGroup(groupLayout.createSequentialGroup().addComponent(btnGenerateAllAmscupdate).addGap(18)
								.addComponent(lblMax).addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(generateSCAMsBtn, GroupLayout.PREFERRED_SIZE, 319,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(textMaxField, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(amsCountLbl)))))
				.addContainerGap(2,
						Short.MAX_VALUE))
				.addGroup(
						groupLayout.createSequentialGroup().addContainerGap(790, Short.MAX_VALUE)
								.addGroup(
										groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(scAttributeFeaturesLbl)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(attributeSCextArea, GroupLayout.PREFERRED_SIZE,
																102, GroupLayout.PREFERRED_SIZE)
														.addGap(58)))
								.addGap(66)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblHostName)
								.addComponent(hostTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(
								groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(scAMbtnButton).addComponent(btnFmScUpdate)
												.addComponent(btnGenerateAllAmscupdate))
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(textMaxField, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblMax).addComponent(amsCountLbl)))
						.addGap(96).addComponent(scAttributeFeaturesLbl).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(attributeSCextArea, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(generateSCAMsBtn, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(202, Short.MAX_VALUE)));
		frame.getContentPane().setLayout(groupLayout);
	}
}
