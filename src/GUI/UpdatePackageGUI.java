package GUI;

import java.awt.*;
import javax.swing.*;
import com.github.lgooddatepicker.components.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sat Jan 07 14:51:10 ICT 2023
 */



/**
 * @author talion
 */
public class UpdatePackageGUI extends JFrame{

	public UpdatePackageGUI()
	{
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - hung
		label21 = new JLabel();
		textField14 = new JTextField();
		label22 = new JLabel();
		textField15 = new JTextField();
		label23 = new JLabel();
		label1 = new JLabel();
		scrollPane1 = new JScrollPane();
		textPane1 = new JTextPane();
		label2 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		textField2 = new JTextField();
		label13 = new JLabel();
		textField12 = new JTextField();
		label15 = new JLabel();
		label4 = new JLabel();
		textField3 = new JTextField();
		label14 = new JLabel();
		textField13 = new JTextField();
		label16 = new JLabel();
		label5 = new JLabel();
		textField4 = new JTextField();
		label17 = new JLabel();
		textField9 = new JTextField();
		label19 = new JLabel();
		label6 = new JLabel();
		textField5 = new JTextField();
		label18 = new JLabel();
		textField10 = new JTextField();
		label20 = new JLabel();
		label7 = new JLabel();
		textField6 = new JTextField();
		scrollPane2 = new JScrollPane();
		textPane2 = new JTextPane();
		label8 = new JLabel();
		textField7 = new JTextField();
		label9 = new JLabel();
		textField8 = new JTextField();
		label10 = new JLabel();
		dateTimePicker2 = new DateTimePicker();
		label11 = new JLabel();
		dateTimePicker1 = new DateTimePicker();
		label12 = new JLabel();
		textField11 = new JTextField();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========
		{
			this.setTitle("Update Package");
			this.setPreferredSize(new Dimension(900, 590));
			this.setMinimumSize(new Dimension(900, 590));
			Container thisContentPane = this.getContentPane();
			thisContentPane.setLayout(new MigLayout(
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
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]"));

			//---- label21 ----
			label21.setText("Package ID For Updating");
			thisContentPane.add(label21, "cell 0 0");
			thisContentPane.add(textField14, "cell 1 0");

			//---- label22 ----
			label22.setText("Find package ID by description");
			thisContentPane.add(label22, "cell 2 0");
			thisContentPane.add(textField15, "cell 3 0");

			//---- label23 ----
			label23.setIcon(new ImageIcon("img\\transparency.png"));
			label23.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			thisContentPane.add(label23, "cell 4 0");

			//---- label1 ----
			label1.setText("Description");
			thisContentPane.add(label1, "cell 0 1");

			//======== scrollPane1 ========
			{

				//---- textPane1 ----
				textPane1.setPreferredSize(new Dimension(200, 100));
				scrollPane1.setViewportView(textPane1);
			}
			thisContentPane.add(scrollPane1, "cell 1 1");

			//---- label2 ----
			label2.setText("Weight");
			thisContentPane.add(label2, "cell 0 2");
			thisContentPane.add(textField1, "cell 1 2");

			//---- label3 ----
			label3.setText("Sender ID");
			thisContentPane.add(label3, "cell 0 3");
			thisContentPane.add(textField2, "cell 1 3");

			//---- label13 ----
			label13.setText("Find sender ID by name");
			thisContentPane.add(label13, "cell 2 3");

			//---- textField12 ----
			textField12.setPreferredSize(new Dimension(200, 24));
			thisContentPane.add(textField12, "cell 3 3");

			//---- label15 ----
			label15.setIcon(new ImageIcon("img\\transparency1.png"));
			label15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			thisContentPane.add(label15, "cell 4 3");

			//---- label4 ----
			label4.setText("Receiver ID");
			thisContentPane.add(label4, "cell 0 4");
			thisContentPane.add(textField3, "cell 1 4");

			//---- label14 ----
			label14.setText("Find receiver ID by name");
			thisContentPane.add(label14, "cell 2 4");
			thisContentPane.add(textField13, "cell 3 4");

			//---- label16 ----
			label16.setIcon(new ImageIcon("img\\transparency.png"));
			label16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			thisContentPane.add(label16, "cell 4 4");

			//---- label5 ----
			label5.setText("From ID");
			thisContentPane.add(label5, "cell 0 5");
			thisContentPane.add(textField4, "cell 1 5");

			//---- label17 ----
			label17.setText("Find send location by address");
			thisContentPane.add(label17, "cell 2 5");
			thisContentPane.add(textField9, "cell 3 5");

			//---- label19 ----
			label19.setIcon(new ImageIcon("img\\transparency1.png"));
			label19.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			thisContentPane.add(label19, "cell 4 5");

			//---- label6 ----
			label6.setText("To ID");
			thisContentPane.add(label6, "cell 0 6");
			thisContentPane.add(textField5, "cell 1 6");

			//---- label18 ----
			label18.setText("Find receive location by address");
			thisContentPane.add(label18, "cell 2 6");
			thisContentPane.add(textField10, "cell 3 6");

			//---- label20 ----
			label20.setIcon(new ImageIcon("img\\transparency.png"));
			label20.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			thisContentPane.add(label20, "cell 4 6");

			//---- label7 ----
			label7.setText("Distance");
			thisContentPane.add(label7, "cell 0 7");
			thisContentPane.add(textField6, "cell 1 7");

			//======== scrollPane2 ========
			{
				scrollPane2.setPreferredSize(new Dimension(128, 168));

				//---- textPane2 ----
				textPane2.setPreferredSize(new Dimension(128, 168));
				textPane2.setText("-----------------YOUR FIND RESULT WILL BE HERE-----------------");
				scrollPane2.setViewportView(textPane2);
			}
			thisContentPane.add(scrollPane2, "cell 2 7 3 6");

			//---- label8 ----
			label8.setText("Fee");
			thisContentPane.add(label8, "cell 0 8");
			thisContentPane.add(textField7, "cell 1 8");

			//---- label9 ----
			label9.setText("Transport Type");
			thisContentPane.add(label9, "cell 0 9");
			thisContentPane.add(textField8, "cell 1 9");

			//---- label10 ----
			label10.setText("Send Date");
			thisContentPane.add(label10, "cell 0 10");
			thisContentPane.add(dateTimePicker2, "cell 1 10");

			//---- label11 ----
			label11.setText("Receive Date");
			thisContentPane.add(label11, "cell 0 11");
			thisContentPane.add(dateTimePicker1, "cell 1 11");

			//---- label12 ----
			label12.setText("Status");
			thisContentPane.add(label12, "cell 0 12");
			thisContentPane.add(textField11, "cell 1 12");

			//---- button1 ----
			button1.setText("CANCEL");
			button1.setBackground(Color.red);
			button1.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
			button1.setForeground(Color.white);
			thisContentPane.add(button1, "cell 2 15");

			//---- button2 ----
			button2.setText("UPDATE");
			button2.setBackground(new Color(0x3399ff));
			button2.setForeground(Color.white);
			button2.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
			thisContentPane.add(button2, "cell 3 15");
			this.pack();
			this.setLocationRelativeTo(this.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - hung
	private JLabel label21;
	private JTextField textField14;
	private JLabel label22;
	private JTextField textField15;
	private JLabel label23;
	private JLabel label1;
	private JScrollPane scrollPane1;
	private JTextPane textPane1;
	private JLabel label2;
	private JTextField textField1;
	private JLabel label3;
	private JTextField textField2;
	private JLabel label13;
	private JTextField textField12;
	private JLabel label15;
	private JLabel label4;
	private JTextField textField3;
	private JLabel label14;
	private JTextField textField13;
	private JLabel label16;
	private JLabel label5;
	private JTextField textField4;
	private JLabel label17;
	private JTextField textField9;
	private JLabel label19;
	private JLabel label6;
	private JTextField textField5;
	private JLabel label18;
	private JTextField textField10;
	private JLabel label20;
	private JLabel label7;
	private JTextField textField6;
	private JScrollPane scrollPane2;
	private JTextPane textPane2;
	private JLabel label8;
	private JTextField textField7;
	private JLabel label9;
	private JTextField textField8;
	private JLabel label10;
	private DateTimePicker dateTimePicker2;
	private JLabel label11;
	private DateTimePicker dateTimePicker1;
	private JLabel label12;
	private JTextField textField11;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
