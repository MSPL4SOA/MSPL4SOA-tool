package test;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Gui {

	public static void main(String[] args) {

		Gui gui = new Gui();
		gui.show();
	}

	public void show() {
		
		File fileIconOk = new File(getClass().getClassLoader().getResource("./files/images/ok.png").getFile());

		// show a joptionpane dialog using showMessageDialog
		JOptionPane.showMessageDialog(null, "Your RSS feed has been published", "RSS Feed Published",
				JOptionPane.INFORMATION_MESSAGE, new ImageIcon(fileIconOk.getAbsolutePath()));
	}

}
