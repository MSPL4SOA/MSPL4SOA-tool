package main;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import familiar.CapabilityFG;
import familiar.ContractFG;
import familiar.FMBDD;
import familiar.FMFactory;
import familiar.FeatureInsertForXML;
import familiar.HiddenFeatures;
import familiar.ServiceFG;
import features.SOAP.SOAPFeature;
import features.bean.Contract;
import features.bean.Service;
import features.bean.ServiceFeature;
import features.contract.ContractFeature;
import features.jms.JMSFeature;
import features.rest.RESTFeature;
import fr.unice.polytech.modalis.familiar.fm.converter.S2T2Converter;
import generating.SwitchyardProject;
import util.FileSearch;
import util.JavaCodeFormatter;

public class MainGui {

	private JFrame frame;

	private ContractFG contractFG;

	private ArrayList<JTextField> capabilitiesJTextField;

	public FMFactory fmFactory;

	int xAbs = 0;
	int yAbs = 100;
	private JTextField projectNameTextField;
	private JTextField serviceTextField;
	
	public static String PROJECT_NAME = "";

	public static final String FILES_GENERATED_PATH = "./../sp_files_generated/";

	public static String projectsDirPath = FILES_GENERATED_PATH + "projects/";

	public static String projectsFilesGeneratedPath = FILES_GENERATED_PATH + "fms/";

	private String filesFMLPath = "fm_familiar_generated/";

	private String filesS2T2Path = "fm_s2t2_generated/";

	private String filesContractPath = "contract_generated/";

	public static final String fmSPFileName = "fm_sp";

	public static final String fmSCFileName = "fm_sc";
	public static final String fmSPSpecFileName = "fm_sp_spec";
	public static final String fmSPSpecSyncFileName = "fm_sp_spec_sync";

	public static final String fmSCUpdatedFileName = "fm_sc_sync";

	private JLabel lblScUpdatedFm;

	private JButton scUpdateFamiliarButton;

	private JButton btFMSCUpdateS2T2;

	private JButton generateSPButton;
	private JTextField projectPathTextField;

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
		contractFG = new ContractFG();
		fmFactory = new FMFactory();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 995, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 995, 0 };
		gridBagLayout.rowHeights = new int[] { 580, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 0);
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 0;
		frame.getContentPane().add(tabbedPane, gbc_tabbedPane);

		final JPanel panel1 = new JPanel();
		tabbedPane.addTab("Generating FM SP and FM SC", null, panel1, null);

		JLabel label = new JLabel("Project name :");

		projectNameTextField = new JTextField();
		projectNameTextField.setColumns(10);

		JLabel label_1 = new JLabel("Service count :");

		serviceTextField = new JTextField();
		serviceTextField.setColumns(10);

		final JButton btnServiceOk = new JButton("Service Ok");

		projectPathTextField = new JTextField();
		projectPathTextField.setText(projectsDirPath);
		projectPathTextField.setColumns(10);

		JLabel lblProjectPath = new JLabel("Workspace :");
		GroupLayout gl_panel1 = new GroupLayout(panel1);
		gl_panel1.setHorizontalGroup(
				gl_panel1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel1.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel1
								.createSequentialGroup()
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
								.addGap(30)
								.addComponent(serviceTextField, GroupLayout.PREFERRED_SIZE,
										29, GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(btnServiceOk, GroupLayout.PREFERRED_SIZE, 108,
										GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel1.createSequentialGroup()
										.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
												.addComponent(label, GroupLayout.PREFERRED_SIZE, 102,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblProjectPath))
										.addGap(42)
										.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
												.addComponent(projectPathTextField, GroupLayout.PREFERRED_SIZE, 500,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(projectNameTextField, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(334, Short.MAX_VALUE)));
		gl_panel1.setVerticalGroup(gl_panel1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel1
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(projectPathTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProjectPath))
				.addGap(9)
				.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel1.createSequentialGroup().addGap(2).addComponent(label))
						.addComponent(projectNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(6)
				.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel1.createSequentialGroup().addGap(5).addComponent(label_1))
						.addGroup(gl_panel1.createSequentialGroup().addGap(3).addComponent(serviceTextField,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnServiceOk))
				.addContainerGap(457, Short.MAX_VALUE)));
		panel1.setLayout(gl_panel1);

		JPanel panel2 = new JPanel();
		tabbedPane.addTab("Generating SP artifacts", null, panel2, null);

		JTextArea specializedTextArea = new JTextArea();
		specializedTextArea.setEditable(false);

		// JLabel lblSpecializedFeatures = new JLabel("Specialized features");
		//
		// JLabel lblSharedFeatures = new JLabel("Essential features");

		JLabel lblSpecializedFeatures = new JLabel("(Can be specialized)");

		JLabel lblSharedFeatures = new JLabel("(Variability must be resolved)");

		JTextArea essentialTextArea = new JTextArea();
		essentialTextArea.setEditable(false);

		JTextArea internalSPTextArea = new JTextArea();
		internalSPTextArea.setEditable(false);

		JLabel lblInternalSpFeatures = new JLabel("SP Internal features");

		JTextArea AttributeSPTextArea = new JTextArea();
		AttributeSPTextArea.setEditable(false);

		JLabel lblInternalScFeatures = new JLabel("SP Attribute features");

		JTextArea internalSCTextArea = new JTextArea();
		internalSCTextArea.setEditable(false);

		//
		specializedTextArea.setText(SwitchyardProject.SPECIALIZED_FEATURES_CONTENT);

		essentialTextArea.setText(SwitchyardProject.ESSENTIAL_FEATURES_CONTENT);

		internalSPTextArea.setText(SwitchyardProject.INTERNAL_FEATURES_SP_CONTENT);

		internalSCTextArea.setText(SwitchyardProject.INTERNAL_FEATURES_SC_CONTENT);
		internalSCTextArea.setVisible(false);

		AttributeSPTextArea.setText(SwitchyardProject.ATTRIBUTES_SP_CONTENT);

		JLabel lblInternalScFeatures_1 = new JLabel("SC Internal features");
		lblInternalScFeatures_1.setVisible(false);

		JLabel lblSpFm = new JLabel("FM SP :");

		JButton btnFamiliar = new JButton("Familiar");
		btnFamiliar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextEditor textEditor = new TextEditor();

				// System.out.println(filesFMLPath + fmSPFileName + ".fml");
				textEditor.setTextPane(
						util.Functions.fileToString(filesFMLPath + fmSPFileName + ".fml"));
				textEditor.setTitle("FM SP in " + filesFMLPath + fmSPFileName + ".fml");
				textEditor.getTextPane().setEditable(false);
				textEditor.getBtnSaveSpSpecialized().setVisible(false);
				textEditor.getFrame().setVisible(true);
			}
		});

		JButton btFMSPS2T2 = new JButton("S2T2");
		btFMSPS2T2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ie.lero.spl.vizconfig.swingapp.ConfiguratorStarter.main(new
				// String[]{filesS2T2Path + fmSPFileName + ".fmprimitives"});

				util.Functions.execExtProg("java -jar " + SwitchyardProject.S2T2_JAR_PATH + " " + filesS2T2Path
						+ fmSPFileName + ".fmprimitives");
			}
		});

		JButton btFMSCS2T2 = new JButton("S2T2");
		
		//TODO invisible in thesis report
		btFMSCS2T2.setVisible(false);
		
		btFMSCS2T2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				util.Functions.execExtProg("java -jar " + SwitchyardProject.S2T2_JAR_PATH + " " + filesS2T2Path
						+ fmSCFileName + ".fmprimitives");
			}
		});

		JButton button_1 = new JButton("Familiar");
		
		//TODO invisible in thesis report
		button_1.setVisible(false);
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TextEditor textEditor = new TextEditor();

				System.out.println(filesFMLPath + fmSCFileName + ".fml");
				textEditor.setTextPane(
						util.Functions.fileToString(filesFMLPath + fmSCFileName + ".fml"));
				textEditor.setTitle("FM SC in " + filesFMLPath + fmSCFileName + ".fml");
				textEditor.getTextPane().setEditable(false);
				textEditor.getBtnSaveSpSpecialized().setVisible(false);
				textEditor.getFrame().setVisible(true);
			}
		});

		JLabel lblScFm = new JLabel("FM SC :");
		
		//TODO invisible in thesis report
		lblScFm.setVisible(false);
		

		JLabel lblSpecializedSpFm = new JLabel("FM SP spec :");

		JButton button_2 = new JButton("Familiar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TextEditor textEditor = new TextEditor();

				// System.out.println(filesFMLPath + fmSPSpecFileName + ".fml");
				textEditor.setTextPane(
						util.Functions.fileToString(filesFMLPath + fmSPSpecFileName + ".fml"));
				textEditor.setTitle("FM SP spec in " + filesFMLPath + fmSPSpecFileName + ".fml");

				textEditor.setFmFactory(fmFactory);

				textEditor.setSpSpecializedFMFamiliarFilePath(filesFMLPath + fmSPSpecFileName + ".fml");
				textEditor.setSpSpecializedFMS2T2FilePath(filesS2T2Path + fmSPSpecFileName + ".fmprimitives");

				textEditor.setFmSPSpecSyncFamiliarFilePath(filesFMLPath + fmSPSpecSyncFileName + ".fml");
				textEditor.setFmSPSpecSyncS2T2FilePath(filesS2T2Path + fmSPSpecSyncFileName + ".fmprimitives");
				
				textEditor.setScUpdatedFMFamiliarFilePath(filesFMLPath + fmSCUpdatedFileName + ".fml");
				textEditor.setScUpdatedFMS2T2FilePath(filesS2T2Path + fmSCUpdatedFileName + ".fmprimitives");

				textEditor.setLblScUpdatedFm(lblScUpdatedFm);
				textEditor.setScUpdateFamiliarButton(scUpdateFamiliarButton);
				textEditor.setScUpdateS2T2Button(btFMSCUpdateS2T2);
				textEditor.setGenerateSPButton(generateSPButton);

				textEditor.getFrame().setVisible(true);
			}
		});

		JButton btFMSPSpecS2T2 = new JButton("S2T2");
		btFMSPSpecS2T2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				util.Functions.execExtProg("java -jar " + SwitchyardProject.S2T2_JAR_PATH + " " + filesS2T2Path
						+ fmSPSpecFileName + ".fmprimitives");
			}
		});

		btFMSCUpdateS2T2 = new JButton("S2T2");
		btFMSCUpdateS2T2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				util.Functions.execExtProg("java -jar " + SwitchyardProject.S2T2_JAR_PATH + " " + filesS2T2Path
						+ fmSPSpecSyncFileName + ".fmprimitives");
			}
		});

		scUpdateFamiliarButton = new JButton("Familiar");
		scUpdateFamiliarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TextEditor textEditor = new TextEditor();

				System.out.println(filesFMLPath + fmSPSpecSyncFileName + ".fml");
				textEditor.setTextPane(
						util.Functions.fileToString(filesFMLPath + fmSPSpecSyncFileName + ".fml"));
				textEditor.setTitle("FM SP spec-sync in " + filesFMLPath + fmSPSpecSyncFileName + ".fml");
				textEditor.getTextPane().setEditable(false);
				textEditor.getBtnSaveSpSpecialized().setVisible(false);
				textEditor.getFrame().setVisible(true);
			}
		});

		lblScUpdatedFm = new JLabel("FM SP spec-sync :");

		lblScUpdatedFm.setVisible(false);
		scUpdateFamiliarButton.setVisible(false);
		btFMSCUpdateS2T2.setVisible(false);

		generateSPButton = new JButton("Generate SP artifacts");
		generateSPButton.setVisible(false);

		generateSPButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Contract contract;
				try {

					

					contract = FMFactory.convertFMSCUpdateToContractXML(fmFactory.specializedAttributedFMSP);

					SwitchyardProject switchyardProject = new SwitchyardProject(projectsDirPath, contract.projectName,
							contract.projectName);

//					contract.dataInputPkg = switchyardProject.inputDataPkg;
//					contract.dataOutputPkg = switchyardProject.outputDataPkg;

					switchyardProject.generateMavenProject();
					switchyardProject.configureSwitchyardProject();// mandatory
					// switchyardProject.writeConfFiles();// only for test not
					// switchyardProject.mkdirProjectDirs();// only for test not
					switchyardProject.mkdirUtilFiles();

					ContractFeature contractFeature = new ContractFeature(switchyardProject);
					contractFeature.addContractFeature();
					//

					// Contract contract = MockData.getServices();

					// util.JAXBUtil.marshall(contract,
					// switchyardProject.servicesXmlFileName);

					// contract = (Contract)
					// util.JAXBUtil.unmarshall(switchyardProject.servicesXmlFileName,
					// Contract.class);

					for (Service service : contract.services) {

						// for (Capability capability : service.capabilities) {
						//
						// capability.dataInputPkg =
						// switchyardProject.inputDataPkg;
						// capability.dataOutputPkg =
						// switchyardProject.outputDataPkg;
						//
						// }

						ServiceFeature serviceFeature = new ServiceFeature(switchyardProject, service);

						System.out.println(serviceFeature.service.interfaceName);

						//
						// mockdata.MockData.addServiceXML(serviceFeature);
						//
						// Service service = (Service)
						// util.JAXBUtil.unmarshall(serviceFeature.serviceXmlFileName,
						// Service.class);
						// serviceFeature.setService(service);// mandatory

						serviceFeature.addInputData();
						serviceFeature.addOutputData();
						// //
						serviceFeature.addSCA();
						serviceFeature.addInterface();
						serviceFeature.addState();

						// //

					}

					switchyardProject.compileProjectMvn();

					for (Service service : contract.services) {
						ServiceFeature serviceFeature = new ServiceFeature(switchyardProject, service);

						if (service.soapExist()) {

							SOAPFeature soapFeature = new SOAPFeature(serviceFeature);
							soapFeature.generateWSDL();
							soapFeature.deleteVoidResponseWSDL();
							soapFeature.addSCA();
							soapFeature.addTransformers();
							soapFeature.addComposer();
						}

						if (service.restExist()) {
							RESTFeature restFeature = new RESTFeature(serviceFeature);
							restFeature.addSCA();
							restFeature.addComposer();
							restFeature.addResource();
						}

						if (service.jmsExist()) {
							JMSFeature jmsFeature = new JMSFeature(serviceFeature);
							jmsFeature.addCamelSCA();
							jmsFeature.addCamelRouterJava();
							jmsFeature.addJMSInterface();
							jmsFeature.addJMSSCA();
							jmsFeature.addJMSXML();
						}
					}

					// auto-formatting java code
					FileSearch fileSearch = new FileSearch();
					fileSearch.searchDirectory(new File(switchyardProject.projectPath), "^.*\\.java$");
					for (String filePath : fileSearch.getResult()) {
						JavaCodeFormatter.formattingCode(new File(filePath));
					}

					// trace
					util.JAXBUtil.marshall(contract, filesContractPath + contract.projectName + "_contract.xml");

					// export
					// delete not configurable attributes
					util.JAXBUtil.marshall(contract, switchyardProject.contractDirPath + "contract.xml",
							"configuration");
					//
					// Contract is exported above
					util.Functions.stringToFile(fmFactory.updatedAttributedFMSC,
							switchyardProject.contractDirPath + fmSCUpdatedFileName + ".fml", false);
					//
					util.Functions.stringToFile(fmFactory.fmSPSpecSync,
							switchyardProject.contractDirPath + fmSPSpecSyncFileName + ".fml", false);
					//
					util.Functions.stringToFile(fmFactory.specializedAttributedFMSP,
							switchyardProject.contractDirPath + fmSPSpecFileName + ".fml", false);
					//
					util.Functions.stringToFile(fmFactory._fmSP,
							switchyardProject.contractDirPath + fmSPFileName + ".fml", false);
					//
					util.Functions.stringToFile(fmFactory._fmSC,
							switchyardProject.contractDirPath + fmSCFileName + ".fml", false);
					
					S2T2Converter s2t2Converter = new S2T2Converter();
					
					//fm_sc_update
					String xmiS2T2 = s2t2Converter.fmlToS2T2XMI(FMBDD.getInstance().FM("updatedAttributedFMSC",
							fmFactory.updatedAttributedFMSC));
					util.Functions.stringToFile(xmiS2T2,
							switchyardProject.contractDirPath + fmSCUpdatedFileName + ".fmprimitives", false);

					//fm_sp_spec_sync
					s2t2Converter.fmlToS2T2XMI(FMBDD.getInstance().FM("fm_sp_spec_sync",
							fmFactory.fmSPSpecSync));
					util.Functions.stringToFile(xmiS2T2,
							switchyardProject.contractDirPath + fmSPSpecSyncFileName + ".fmprimitives", false);
					
					// ok dialog
					System.out.println("The SP artifacts are generated");
					JOptionPane.showMessageDialog(null, "The SP artifacts have been generated", "OK",
							JOptionPane.OK_OPTION, new ImageIcon(SwitchyardProject.FILE_ICON_OK_PATH_CONTENT));

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		JButton mockDataButton = new JButton("Generate a random FM SP spec");
		mockDataButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					fmFactory.specializedAttributedFMSP = fmFactory.specializedFMSP = mock.MockData
							.setAttributes(fmFactory.mockSPSpec);

					util.Functions.stringToFile(fmFactory.specializedAttributedFMSP,
							filesFMLPath + fmSPSpecFileName + ".fml", false);

					///// put fms s2t2 in files
					///// ///////
					S2T2Converter s2t2Converter = new S2T2Converter();
					String xmiS2T2;
					xmiS2T2 = s2t2Converter
							.fmlToS2T2XMI(FMBDD.getInstance().FM(fmSPSpecFileName,
									fmFactory.specializedAttributedFMSP));

					util.Functions.stringToFile(xmiS2T2, filesS2T2Path + fmSPSpecFileName + ".fmprimitives", false);

					JOptionPane.showMessageDialog(null, "A FM SP spec have been generated", "OK",
							JOptionPane.OK_OPTION, new ImageIcon(SwitchyardProject.FILE_ICON_OK_PATH_CONTENT));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		JLabel label_2 = new JLabel("Shared features (Essential)");

		JLabel label_3 = new JLabel("Shared features (Specialized)");

		GroupLayout gl_panel2 = new GroupLayout(panel2);
		gl_panel2.setHorizontalGroup(gl_panel2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel2
				.createSequentialGroup().addGap(28)
				.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel2.createSequentialGroup()
						.addComponent(lblScUpdatedFm, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addGap(47)
						.addComponent(scUpdateFamiliarButton, GroupLayout.PREFERRED_SIZE, 90,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btFMSCUpdateS2T2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel2.createSequentialGroup()
								.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING)
										.addComponent(lblSpecializedFeatures, GroupLayout.PREFERRED_SIZE, 152,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(specializedTextArea, GroupLayout.PREFERRED_SIZE, 143,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel2.createSequentialGroup().addGap(0).addComponent(label_3,
												GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))
								.addGap(6)
								.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel2
										.createSequentialGroup()
										.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING, false)
												.addGroup(gl_panel2.createSequentialGroup().addGap(25)
														.addComponent(essentialTextArea, GroupLayout.PREFERRED_SIZE,
																176, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(internalSPTextArea, GroupLayout.PREFERRED_SIZE,
																146, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel2.createSequentialGroup().addGap(12)
														.addComponent(lblSharedFeatures, GroupLayout.PREFERRED_SIZE,
																213, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(lblInternalSpFeatures, GroupLayout.PREFERRED_SIZE,
																146, GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel2.createSequentialGroup()
														.addComponent(lblInternalScFeatures).addGap(13).addComponent(
																lblInternalScFeatures_1, GroupLayout.PREFERRED_SIZE,
																146, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel2.createSequentialGroup().addGap(6)
														.addComponent(AttributeSPTextArea, GroupLayout.PREFERRED_SIZE,
																146, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(internalSCTextArea, GroupLayout.PREFERRED_SIZE,
																146, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_panel2.createSequentialGroup().addGap(18).addComponent(label_2,
												GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel2.createSequentialGroup().addGroup(gl_panel2
								.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel2.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel2.createSequentialGroup().addComponent(lblSpFm)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btnFamiliar))
										.addGroup(gl_panel2.createSequentialGroup()
												.addComponent(lblScFm, GroupLayout.PREFERRED_SIZE, 51,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(button_1,
														GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblSpecializedSpFm, GroupLayout.PREFERRED_SIZE, 164,
										GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel2.createSequentialGroup()
												.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 90,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btFMSPSpecS2T2, GroupLayout.PREFERRED_SIZE, 90,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(mockDataButton))
										.addComponent(btFMSCS2T2, GroupLayout.PREFERRED_SIZE, 90,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btFMSPS2T2, GroupLayout.PREFERRED_SIZE, 90,
												GroupLayout.PREFERRED_SIZE)))))
				.addGroup(gl_panel2.createSequentialGroup().addGap(113).addComponent(generateSPButton,
						GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE)));
		gl_panel2.setVerticalGroup(gl_panel2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel2
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel2.createParallelGroup(Alignment.BASELINE).addComponent(label_2).addComponent(label_3))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel2.createParallelGroup(Alignment.BASELINE).addComponent(lblInternalSpFeatures)
								.addComponent(lblSpecializedFeatures).addComponent(lblSharedFeatures))
						.addComponent(lblInternalScFeatures_1).addComponent(lblInternalScFeatures))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel2.createParallelGroup(Alignment.BASELINE)
								.addComponent(internalSCTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(AttributeSPTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addComponent(internalSPTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(essentialTextArea, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
						.addComponent(specializedTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel2.createParallelGroup(Alignment.TRAILING).addComponent(lblSpFm)
						.addGroup(gl_panel2.createParallelGroup(Alignment.BASELINE).addComponent(btnFamiliar)
								.addComponent(btFMSPS2T2)))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel2.createParallelGroup(Alignment.BASELINE).addComponent(btFMSCS2T2)
						.addComponent(button_1).addComponent(lblScFm))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel2.createParallelGroup(Alignment.BASELINE).addComponent(lblSpecializedSpFm)
						.addComponent(button_2).addComponent(btFMSPSpecS2T2).addComponent(mockDataButton))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel2.createParallelGroup(Alignment.BASELINE).addComponent(btFMSCUpdateS2T2)
								.addComponent(scUpdateFamiliarButton))
						.addComponent(lblScUpdatedFm))
				.addGap(33).addComponent(generateSPButton, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
				.addContainerGap()));
		panel2.setLayout(gl_panel2);

		btnServiceOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String in = serviceTextField.getText();

				// boolean ok = false;
				// String errorMessage = "";
				//
				// boolean errorProjectName = false;
				// boolean errorServiceCount = false;
				//
				// if
				// (!projectNameTextField.getText().matches("^\\w(\\w|\\d|_|-)*$"))
				// {
				// errorMessage += "The project must begin by respect this regex
				// (^\\w(\\w|\\d|_|-)*$)";
				// }

				if (!in.matches("^\\d+$$") || Integer.parseInt(in) <= 0
						|| !projectNameTextField.getText().matches("^[a-zA-Z_]\\w*$")
						|| projectPathTextField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Error: The project name must respect this regex (^[a-zA-Z_]\\w*$).\n"
									+ "The project path must not be empty.\n" + "Please enter number bigger than 0.",
							"Error Massage", JOptionPane.ERROR_MESSAGE);

				} else {

					contractFG.projectName = projectNameTextField.getText();

					projectsDirPath = projectPathTextField.getText();
					
					PROJECT_NAME = projectNameTextField.getText();
					SwitchyardProject.HOST_NAME += PROJECT_NAME;

					// util.Functions.mkdirIfExist(projectsDirPath);

					projectsFilesGeneratedPath = projectsFilesGeneratedPath + contractFG.projectName + "/";

					filesFMLPath = projectsFilesGeneratedPath + filesFMLPath;
					filesS2T2Path = projectsFilesGeneratedPath + filesS2T2Path;
					filesContractPath = projectsFilesGeneratedPath + filesContractPath;

					new File(filesFMLPath).mkdirs();
					new File(filesS2T2Path).mkdirs();
					new File(filesContractPath).mkdirs();

					int serviceCount = Integer.parseInt(in);
					// System.out.println(serviceCount);

					btnServiceOk.setEnabled(false);
					capabilitiesJTextField = new ArrayList<JTextField>();

					for (int serviceNumber = 1; serviceNumber <= serviceCount; serviceNumber++) {

						JLabel lblNewLabel_1 = new JLabel("Service " + serviceNumber + " :");
						lblNewLabel_1.setBounds(25 + xAbs, yAbs, 140, 15);
						panel1.add(lblNewLabel_1);
						//

						JLabel lblNewLabel_2 = new JLabel("Capability count :");
						lblNewLabel_2.setBounds(25 + xAbs, yAbs + 20, 140, 15);
						panel1.add(lblNewLabel_2);
						//

						JTextField capbilityJTextField = new JTextField();
						capbilityJTextField.setBounds(150 + xAbs, yAbs + 20, 29, 19);
						panel1.add(capbilityJTextField);
						capbilityJTextField.setColumns(10);

						capabilitiesJTextField.add(capbilityJTextField);

						xAbs += 170;

						ServiceFG serviceFG = new ServiceFG();
						serviceFG.name = "Service_" + serviceNumber;

						contractFG.serviceFGs.add(serviceFG);
					}

					final JButton capabilityJButton = new JButton("Capability Ok");
					capabilityJButton.setBounds(25 + xAbs, yAbs, 140, 25);
					// (189, 244, 117, 25);

					yAbs += 40;

					capabilityJButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {

							boolean ok = true;

							for (JTextField capabilityJTextField : capabilitiesJTextField) {

								String in = capabilityJTextField.getText();

								if (!in.matches("^\\d+$$") || Integer.parseInt(in) <= 0) {
									ok = false;
								}
							}

							if (ok == false) {
								JOptionPane.showMessageDialog(null, "Error: Please enter number bigger than 0",
										"Error Massage", JOptionPane.ERROR_MESSAGE);
							} else {
								
								
//								final JButton autoFillInputOutputJButton = new JButton("Auto fill input output");
//								autoFillInputOutputJButton.setBounds(25 + xAbs, yAbs, 140, 25);
//								autoFillInputOutputJButton.setEnabled(true);
//								panel1.add(autoFillInputOutputJButton);

								// int serviceCount = Integer.parseInt(in);

								capabilityJButton.setEnabled(false);
								int xAbsCapability = 30;

								final ArrayList<ArrayList<JTextField>> inputCountJTextField = new ArrayList<ArrayList<JTextField>>();

								final ArrayList<ArrayList<JTextField>> outputCountJTextField = new ArrayList<ArrayList<JTextField>>();

								for (int serviceNumber = 0; serviceNumber < contractFG.serviceFGs
										.size(); serviceNumber++) {

									int yAbsCapability = yAbs + 10;

									ArrayList<JTextField> inputCountTempJTextField = new ArrayList<JTextField>();
									ArrayList<JTextField> outputCountTempJTextField = new ArrayList<JTextField>();

									int in = Integer.parseInt(capabilitiesJTextField.get(serviceNumber).getText());

									for (int capabilityNumber = 0; capabilityNumber < in; capabilityNumber++) {

										CapabilityFG capabilityFG = new CapabilityFG();
										capabilityFG.name = "Capability_" + (capabilityNumber + 1);

										contractFG.serviceFGs.get(serviceNumber).capabilityFGs.add(capabilityFG);

										// inputs
										// outputs

										JLabel lblNewLabel_3 = new JLabel(
												"Capability " + (capabilityNumber + 1) + " :");
										lblNewLabel_3.setBounds(xAbsCapability, yAbsCapability, 140, 15);
										panel1.add(lblNewLabel_3);

										JLabel lblNewLabel_2 = new JLabel("Input count :");
										lblNewLabel_2.setBounds(5 + xAbsCapability, yAbsCapability + 20, 140, 15);
										panel1.add(lblNewLabel_2);
										//

										JTextField inputJTextField = new JTextField();
										inputJTextField.setBounds(110 + xAbsCapability, yAbsCapability + 20, 29, 19);
										panel1.add(inputJTextField);
										inputJTextField.setColumns(10);
//										inputJTextField.setText("" + (int) (Math.random()*10));
										
										

										inputCountTempJTextField.add(inputJTextField);

										JLabel outputLabel = new JLabel("Output count :");
										outputLabel.setBounds(5 + xAbsCapability, yAbsCapability + 50, 140, 15);
										panel1.add(outputLabel);
										//

										JTextField outputJTextField = new JTextField();
										outputJTextField.setBounds(110 + xAbsCapability, yAbsCapability + 50, 29, 19);
										panel1.add(outputJTextField);
										outputJTextField.setColumns(10);
//										outputJTextField.setText("" + (int) (Math.random()*10));

										outputCountTempJTextField.add(outputJTextField);

										yAbsCapability += 80;
									}

									xAbsCapability += 170;

									inputCountJTextField.add(inputCountTempJTextField);

									outputCountJTextField.add(outputCountTempJTextField);

								}

								final JButton generateJButton = new JButton("Generate FM SP and FM SC");
								generateJButton.setBounds(400, 37, 400, 50);

								panel1.add(generateJButton);
								panel1.validate();
								panel1.repaint();

								generateJButton.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {

										// System.out.println("okez");

										boolean ok = true;

										for (int serviceNumber = 0; serviceNumber < contractFG.serviceFGs
												.size(); serviceNumber++) {

											for (int capabilityNumber = 0; capabilityNumber < contractFG.serviceFGs
													.get(serviceNumber).capabilityFGs.size(); capabilityNumber++) {

												String inputCount = inputCountJTextField.get(serviceNumber)
														.get(capabilityNumber).getText();

												String outputCount = outputCountJTextField.get(serviceNumber)
														.get(capabilityNumber).getText();

												if (!inputCount.matches("^\\d+$$")
														|| Integer.parseInt(inputCount) < 0) {
													ok = false;
												}

												if (!outputCount.matches("^\\d+$$")
														|| Integer.parseInt(inputCount) < 0) {
													ok = false;
												}
											}
										}

										if (ok == false) {
											JOptionPane.showMessageDialog(null,
													"Error: Please enter number equals or bigger than 0",
													"Error Massage", JOptionPane.ERROR_MESSAGE);
										} else {

											for (int serviceNumber = 0; serviceNumber < contractFG.serviceFGs
													.size(); serviceNumber++) {

												for (int capabilityNumber = 0; capabilityNumber < contractFG.serviceFGs
														.get(serviceNumber).capabilityFGs.size(); capabilityNumber++) {

													int inputCount = Integer.parseInt(inputCountJTextField
															.get(serviceNumber).get(capabilityNumber).getText());

													int outputCount = Integer.parseInt(outputCountJTextField
															.get(serviceNumber).get(capabilityNumber).getText());

													contractFG.serviceFGs.get(serviceNumber).capabilityFGs
															.get(capabilityNumber).inputDataCount = inputCount;

													contractFG.serviceFGs.get(serviceNumber).capabilityFGs
															.get(capabilityNumber).outputDataCount = outputCount;

												}
											}

											// Execute main program

											fmFactory.contractFG = contractFG;

											try {
												fmFactory.buildFMs();

												fmFactory.specializedFMSP = fmFactory._fmSP;

												// System.out.println(fmFactory._fmSP
												// + "\n-------\n" +
												// fmFactory._fmSC);

												util.Functions.stringToFile(fmFactory._fmSC,
														filesFMLPath + fmSCFileName + ".fml", false);

												util.Functions.stringToFile(fmFactory._fmSP,
														filesFMLPath + fmSPFileName + ".fml", false);

												util.Functions.stringToFile(fmFactory.specializedFMSP,
														filesFMLPath + fmSPSpecFileName + ".fml", false);

												///// put fms s2t2 in files
												///// ///////
												S2T2Converter s2t2Converter = new S2T2Converter();
												String xmiS2T2;

												xmiS2T2 = s2t2Converter.fmlToS2T2XMI(
														FMBDD.getInstance().FM(fmSCFileName, fmFactory._fmSC));
												util.Functions.stringToFile(xmiS2T2,
														filesS2T2Path + fmSCFileName + ".fmprimitives", false);

												xmiS2T2 = s2t2Converter.fmlToS2T2XMI(
														FMBDD.getInstance().FM(fmSPFileName, fmFactory._fmSP));
												util.Functions.stringToFile(xmiS2T2,
														filesS2T2Path + fmSPFileName + ".fmprimitives", false);

												xmiS2T2 = s2t2Converter.fmlToS2T2XMI(FMBDD.getInstance()
														.FM(fmSPSpecFileName, fmFactory.specializedFMSP));
												util.Functions.stringToFile(xmiS2T2,
														filesS2T2Path + fmSPSpecFileName + ".fmprimitives", false);

												JOptionPane.showMessageDialog(null,
														"The FM SP and FM SC have been generated. Go to Generating SP panel.",
														"OK", JOptionPane.INFORMATION_MESSAGE,
														new ImageIcon(SwitchyardProject.FILE_ICON_OK_PATH_CONTENT));

												generateJButton.setEnabled(false);

											} catch (Exception e1) {
												// TODO Auto-generated catch
												// block
												e1.printStackTrace();
											}

										}
									}
								});
							}
						}
					});
					panel1.add(capabilityJButton);

					panel1.validate();
					panel1.repaint();
				}
			}
		});
	}
}
