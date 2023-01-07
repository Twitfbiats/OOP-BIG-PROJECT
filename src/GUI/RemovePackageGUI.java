package GUI;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sat Jan 07 15:22:02 ICT 2023
 */



/**
 * @author talion
 */
public class RemovePackageGUI extends JFrame {
	public RemovePackageGUI() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - hung
		label1 = new JLabel();
		textField1 = new JTextField();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========
		setPreferredSize(new Dimension(400, 125));
		setTitle("Remove Package");
		setMinimumSize(new Dimension(400, 125));
		Container contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("Package ID");
		contentPane.add(label1, "cell 0 0");

		//---- textField1 ----
		textField1.setPreferredSize(new Dimension(200, 24));
		contentPane.add(textField1, "cell 1 0 2 1");

		//---- button1 ----
		button1.setText("CANCEL");
		button1.setBackground(Color.red);
		button1.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		button1.setForeground(Color.white);
		contentPane.add(button1, "cell 3 2");

		//---- button2 ----
		button2.setText("REMOVE");
		button2.setBackground(new Color(0x3399ff));
		button2.setForeground(Color.white);
		button2.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		contentPane.add(button2, "cell 4 2");
		pack();
		setLocationRelativeTo(null);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - hung
	private JLabel label1;
	private JTextField textField1;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
