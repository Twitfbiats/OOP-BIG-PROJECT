package GUI;

import java.awt.*;
import javax.swing.*;
import com.github.lgooddatepicker.components.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sat Jan 07 11:53:26 ICT 2023
 */



/**
 * @author talion
 */
public class AddPackageGUI extends JFrame {
	public AddPackageGUI() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - hung
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
		setTitle("Add package");
		setPreferredSize(new Dimension(850, 530));
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

		//---- label1 ----
		label1.setText("Description");
		label1.setName("descriptionLabel");
		contentPane.add(label1, "cell 0 0");

		//======== scrollPane1 ========
		{
			scrollPane1.setName("descriptionScrollPane");

			//---- textPane1 ----
			textPane1.setPreferredSize(new Dimension(200, 100));
			textPane1.setName("descriptionTextPane");
			scrollPane1.setViewportView(textPane1);
		}
		contentPane.add(scrollPane1, "cell 1 0");

		//---- label2 ----
		label2.setText("Weight");
		label2.setName("weightLabel");
		contentPane.add(label2, "cell 0 1");

		//---- textField1 ----
		textField1.setName("weightTextField");
		contentPane.add(textField1, "cell 1 1");

		//---- label3 ----
		label3.setText("Sender ID");
		label3.setName("senderIDLabel");
		contentPane.add(label3, "cell 0 2");

		//---- textField2 ----
		textField2.setName("senderIDTextField");
		contentPane.add(textField2, "cell 1 2");

		//---- label13 ----
		label13.setText("Find sender ID by name");
		label13.setName("findSenderIDByNameLabel");
		contentPane.add(label13, "cell 2 2");

		//---- textField12 ----
		textField12.setPreferredSize(new Dimension(200, 24));
		textField12.setName("findSenderIDByNameTextField");
		contentPane.add(textField12, "cell 3 2");

		//---- label15 ----
		label15.setIcon(new ImageIcon("img\\transparency1.png"));
		label15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(label15, "cell 4 2");

		//---- label4 ----
		label4.setText("Receiver ID");
		label4.setName("receiverIDLabel");
		contentPane.add(label4, "cell 0 3");

		//---- textField3 ----
		textField3.setName("receiverIDTextField");
		contentPane.add(textField3, "cell 1 3");

		//---- label14 ----
		label14.setText("Find receiver ID by name");
		label14.setName("findReceiverIDByNameLabel");
		contentPane.add(label14, "cell 2 3");

		//---- textField13 ----
		textField13.setName("findReceiverIDByNameTextField");
		contentPane.add(textField13, "cell 3 3");

		//---- label16 ----
		label16.setIcon(new ImageIcon("img\\transparency.png"));
		label16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(label16, "cell 4 3");

		//---- label5 ----
		label5.setText("From ID");
		label5.setName("FromIDLabel");
		contentPane.add(label5, "cell 0 4");

		//---- textField4 ----
		textField4.setName("fromIDTextField");
		contentPane.add(textField4, "cell 1 4");

		//---- label17 ----
		label17.setText("Find send location by address");
		label17.setName("findSendLocationByAddressLabel");
		contentPane.add(label17, "cell 2 4");

		//---- textField9 ----
		textField9.setName("findSendLocationByAddressTextField");
		contentPane.add(textField9, "cell 3 4");

		//---- label19 ----
		label19.setIcon(new ImageIcon("img\\transparency1.png"));
		label19.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(label19, "cell 4 4");

		//---- label6 ----
		label6.setText("To ID");
		label6.setName("ToIDLabel");
		contentPane.add(label6, "cell 0 5");

		//---- textField5 ----
		textField5.setName("toIDTextField");
		contentPane.add(textField5, "cell 1 5");

		//---- label18 ----
		label18.setText("Find receive location by address");
		label18.setName("FindReceiveLocationByAddressLabel");
		contentPane.add(label18, "cell 2 5");

		//---- textField10 ----
		textField10.setName("FindReceiveLocationByAddressTextField");
		contentPane.add(textField10, "cell 3 5");

		//---- label20 ----
		label20.setIcon(new ImageIcon("img\\transparency.png"));
		label20.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(label20, "cell 4 5");

		//---- label7 ----
		label7.setText("Distance");
		label7.setName("distanceLabel");
		contentPane.add(label7, "cell 0 6");

		//---- textField6 ----
		textField6.setName("distanceTextField");
		contentPane.add(textField6, "cell 1 6");

		//======== scrollPane2 ========
		{
			scrollPane2.setPreferredSize(new Dimension(128, 168));

			//---- textPane2 ----
			textPane2.setPreferredSize(new Dimension(128, 168));
			textPane2.setText("-----------------YOUR FIND RESULT WILL BE HERE-----------------");
			scrollPane2.setViewportView(textPane2);
		}
		contentPane.add(scrollPane2, "cell 2 6 3 6");

		//---- label8 ----
		label8.setText("Fee");
		label8.setName("feeLabel");
		contentPane.add(label8, "cell 0 7");

		//---- textField7 ----
		textField7.setName("feeTextField");
		contentPane.add(textField7, "cell 1 7");

		//---- label9 ----
		label9.setText("Transport Type");
		label9.setName("transportTypeLabel");
		contentPane.add(label9, "cell 0 8");

		//---- textField8 ----
		textField8.setName("transportTypeTextField");
		contentPane.add(textField8, "cell 1 8");

		//---- label10 ----
		label10.setText("Send Date");
		label10.setName("sendDateLabel");
		contentPane.add(label10, "cell 0 9");

		//---- dateTimePicker2 ----
		dateTimePicker2.setName("sendDatePicker");
		contentPane.add(dateTimePicker2, "cell 1 9");

		//---- label11 ----
		label11.setText("Receive Date");
		label11.setName("receiveDateLabel");
		contentPane.add(label11, "cell 0 10");

		//---- dateTimePicker1 ----
		dateTimePicker1.setName("receiveDatePicker");
		contentPane.add(dateTimePicker1, "cell 1 10");

		//---- label12 ----
		label12.setText("Status");
		label12.setName("statusLabel");
		contentPane.add(label12, "cell 0 11");

		//---- textField11 ----
		textField11.setName("statusTextField");
		contentPane.add(textField11, "cell 1 11");

		//---- button1 ----
		button1.setText("CANCEL");
		button1.setBackground(Color.red);
		button1.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		button1.setForeground(Color.white);
		contentPane.add(button1, "cell 2 13");

		//---- button2 ----
		button2.setText("SUBMIT");
		button2.setBackground(new Color(0x3399ff));
		button2.setForeground(Color.white);
		button2.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		contentPane.add(button2, "cell 3 13");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - hung
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
