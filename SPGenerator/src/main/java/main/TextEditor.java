package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import familiar.FMBDD;
import familiar.FMFactory;
import familiar.FeatureInsertForXML;
import familiar.HiddenFeatures;
import fr.unice.polytech.modalis.familiar.fm.converter.S2T2Converter;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import generating.SwitchyardProject;

public class TextEditor {

	private JFrame frame;
	private JTextPane textPane;
	private JButton btnSaveSpSpecialized;

	private String spSpecializedFMFamiliarFilePath;
	private String spSpecializedFMS2T2FilePath;

	private String scUpdatedFMFamiliarFilePath;
	private String scUpdatedFMS2T2FilePath;
	private JPanel panel;

	private FMFactory fmFactory;

	private JLabel lblScUpdatedFm;

	private JButton scUpdateFamiliarButton;

	private JButton scUpdateS2T2Button;

	JButton generateSPButton;

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

		btnSaveSpSpecialized = new JButton("Check the consistency of FM SP specialize and generate FM SC update");

		btnSaveSpSpecialized.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String error = "";

				try {

					System.out.println("begin");

					textPane.setText(textPane.getText());

					fmFactory.specializedAttributedFMSP = textPane.getText();

					// System.out.println(fmFactory.specializedAttributedFMSP);

					fmFactory.specializedFMSP = FMFactory.deleteAttributesValues(fmFactory.specializedAttributedFMSP);

					// fmFactory.attributes =
					// FMFactory.extractAttributesValues(fmFactory.specializedAttributedFMSP);//
					// mandatory

					// boolean checkSpec = true;
					error += FMFactory.checkSpecialization2(fmFactory._fmSP, fmFactory.specializedFMSP);

					error += FMFactory.checkEssentialAndInternalVariability(fmFactory.specializedFMSP);

					error += FMFactory.checkAttributesValue(fmFactory.specializedAttributedFMSP);

					if ("".equals(error)) {

						S2T2Converter s2t2Converter = new S2T2Converter();
						String xmiS2T2;

						Set<String> fmSCFMVSharedFeatureSet = FMFactory
								.getSharedFeatures(FMBDD.getInstance().FM("fmc", fmFactory._fmSC));

						FeatureModelVariable fmSPSpecDeleteAttributeFMV = FMBDD.getInstance().FM("fmspd",
								FMFactory.deleteAttributesValues(fmFactory.specializedFMSP.toString()));

						Set<String> omittedSharedFeatures = com.google.common.collect.Sets
								.difference(fmSCFMVSharedFeatureSet, fmSPSpecDeleteAttributeFMV.features().names());

						Set<String> featureSetToSlice = FMFactory.getCorrespondingFeatures(
								fmSPSpecDeleteAttributeFMV.features().names(),
								SwitchyardProject.INTERNAL_FEATURES_SP_CONTENT);

						fmFactory.updatedAttributedFMSC = FMFactory.updateAndDelete2(fmFactory._fmSC,
								fmFactory.specializedAttributedFMSP, omittedSharedFeatures, true, featureSetToSlice);

						fmFactory.updatedFMSC = FMFactory.deleteAttributesValues(fmFactory.updatedAttributedFMSC);

						// insert hidden features to fm_sp_spec and fm_sc_update
						//
						HiddenFeatures hiddenSharedFeatures = (HiddenFeatures) util.JAXBUtil
								.unmarshall(SwitchyardProject.HIDDEN_SHARED_FEATURES, HiddenFeatures.class);

						HiddenFeatures hiddenSPInternalFeatures = (HiddenFeatures) util.JAXBUtil
								.unmarshall(SwitchyardProject.HIDDEN_SP_FEATURES, HiddenFeatures.class);

						ArrayList<FeatureInsertForXML> featureHiddenSharedSP = new ArrayList<FeatureInsertForXML>();
						featureHiddenSharedSP.addAll(hiddenSharedFeatures.featureInserts);
						featureHiddenSharedSP.addAll(hiddenSPInternalFeatures.featureInserts);

						ArrayList<String> options = new ArrayList<String>();
						options.add(MainGui.PROJECT_NAME);
						options.add(SwitchyardProject.HOST_NAME);

						fmFactory.specializedAttributedFMSP = FMFactory.insertFeatureFromXML(
								fmFactory.specializedAttributedFMSP, featureHiddenSharedSP, options);

						fmFactory.updatedAttributedFMSC = FMFactory.insertFeatureFromXML(
								fmFactory.updatedAttributedFMSC, hiddenSharedFeatures.featureInserts, options);
						//
						//////////////////////////

						// fmFactory.updateAndDelete(fmFactory.specializedFMSP,
						// fmFactory._fmSC);

						// specialized
						util.Functions.stringToFile(fmFactory.specializedAttributedFMSP,
								spSpecializedFMFamiliarFilePath, false);
						// util.Functions.stringToFile(
						// fmFactory.specializedAttributedFMSP,
						// spSpecializedFMS2T2FilePath, false);

						xmiS2T2 = s2t2Converter.fmlToS2T2XMI(
								FMBDD.getInstance().FM("fm_sp_spec", fmFactory.specializedAttributedFMSP));
						util.Functions.stringToFile(xmiS2T2, spSpecializedFMS2T2FilePath, false);

						// util.Functions.stringToFile(
						// fmFactory.fmUpdateBDD.FM("fm_sp_spec",
						// fmFactory.specializedAttributedFMSP).toString(),
						// "./fm_familiar_generated/fm_sp_spec.fml", false);
						util.Functions.stringToFile(fmFactory.updatedAttributedFMSC, scUpdatedFMFamiliarFilePath,
								false);

						System.out.println();

						System.out.println(fmFactory.updatedAttributedFMSC);

						System.out.println();

						xmiS2T2 = s2t2Converter
								.fmlToS2T2XMI(FMBDD.getInstance().FM("fm_sc_update", fmFactory.updatedAttributedFMSC));
						util.Functions.stringToFile(xmiS2T2, scUpdatedFMS2T2FilePath, false);

						lblScUpdatedFm.setVisible(true);
						scUpdateFamiliarButton.setVisible(true);
						scUpdateS2T2Button.setVisible(true);
						generateSPButton.setVisible(true);

						JOptionPane.showMessageDialog(null,
								"The FM SP specialize is correct and the FM SC update is generated", "OK",
								JOptionPane.OK_OPTION, new ImageIcon(SwitchyardProject.FILE_ICON_OK_PATH_CONTENT));

					} else {

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
						error = "";
					}
				} catch (Exception e1) {

					e1.printStackTrace();
					System.out.println("Syntax problem");

					JOptionPane optionPane = new JOptionPane("The syntax of the FM is incorrect.\n" + error);
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
					error = "";

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

	public void setSpSpecializedFMFamiliarFilePath(String spSpecializedFMFilePath) {
		this.spSpecializedFMFamiliarFilePath = spSpecializedFMFilePath;
	}

	public void setSpSpecializedFMS2T2FilePath(String spSpecializedFMS2T2FilePath) {
		this.spSpecializedFMS2T2FilePath = spSpecializedFMS2T2FilePath;
	}

	public void setFmFactory(FMFactory fmFactory) {
		this.fmFactory = fmFactory;
	}

	public void setScUpdatedFMFamiliarFilePath(String scUpdatedFMFamiliarFilePath) {
		this.scUpdatedFMFamiliarFilePath = scUpdatedFMFamiliarFilePath;
	}

	public void setScUpdatedFMS2T2FilePath(String scUpdatedFMS2T2FilePath) {
		this.scUpdatedFMS2T2FilePath = scUpdatedFMS2T2FilePath;
	}

	public void setLblScUpdatedFm(JLabel lblScUpdatedFm) {
		this.lblScUpdatedFm = lblScUpdatedFm;
	}

	public void setScUpdateFamiliarButton(JButton scUpdateFamiliarButton) {
		this.scUpdateFamiliarButton = scUpdateFamiliarButton;
	}

	public void setScUpdateS2T2Button(JButton scUpdateS2T2Button) {
		this.scUpdateS2T2Button = scUpdateS2T2Button;
	}

	public void setGenerateSPButton(JButton generateSPButton) {
		this.generateSPButton = generateSPButton;
	}
}
