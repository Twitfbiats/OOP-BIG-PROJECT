package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sat Jan 07 15:45:59 ICT 2023
 */



/**
 * @author talion
 */
public class MainMenuGUI extends JFrame {
	public MainMenuGUI() {
		initComponents();
		addActionListener();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - hung
		panel2 = new JPanel();
		label1 = new JLabel();
		label5 = new JLabel();
		label2 = new JLabel();
		label6 = new JLabel();
		label3 = new JLabel();
		panel1 = new JPanel();
		scrollPane1 = new JScrollPane();
		textPane1 = new JTextPane();
		label4 = new JLabel();

		//======== this ========
		setTitle("MAIN MENU");
		setPreferredSize(new Dimension(665, 515));
		setMinimumSize(new Dimension(665, 515));
		Container contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//======== panel2 ========
		{
			panel2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
			javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "", javax
			. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
			.awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
			. Color. red) ,panel2. getBorder( )) ); panel2. addPropertyChangeListener (new java. beans.
			PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .
			equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
			panel2.setLayout(new MigLayout(
				"hidemode 3",
				// columns
				"[fill]",
				// rows
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]"));

			//---- label1 ----
			label1.setText("ADMINISTRATION");
			label1.setHorizontalAlignment(SwingConstants.CENTER);
			label1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			panel2.add(label1, "cell 0 0");

			//---- label5 ----
			label5.setPreferredSize(new Dimension(0, 18));
			panel2.add(label5, "cell 0 1");

			//---- label2 ----
			label2.setText("CUSTOMER");
			label2.setHorizontalAlignment(SwingConstants.CENTER);
			label2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			panel2.add(label2, "cell 0 2");

			//---- label6 ----
			label6.setPreferredSize(new Dimension(0, 18));
			panel2.add(label6, "cell 0 3");

			//---- label3 ----
			label3.setText("PACKAGE");
			label3.setHorizontalAlignment(SwingConstants.CENTER);
			label3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			panel2.add(label3, "cell 0 4");
		}
		contentPane.add(panel2, "cell 0 0");

		//======== panel1 ========
		{
			panel1.setPreferredSize(new Dimension(500, 200));
			panel1.setBorder(LineBorder.createBlackLineBorder());
			panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

			//======== scrollPane1 ========
			{
				scrollPane1.setPreferredSize(new Dimension(488, 87));

				//---- textPane1 ----
				textPane1.setPreferredSize(new Dimension(230, 96));
				textPane1.setText("BUY ONE RECEIVE ONE JUST FOR TODAY BUY NOW !!!");
				scrollPane1.setViewportView(textPane1);
			}
			panel1.add(scrollPane1);
		}
		contentPane.add(panel1, "cell 1 0");

		//---- label4 ----
		label4.setIcon(new ImageIcon("img\\HelloAdmin.png"));
		label4.setBorder(LineBorder.createBlackLineBorder());
		contentPane.add(label4, "cell 1 1");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	//Add Action Listener For Components
	public void addActionListener()
	{
		label1.addMouseListener(new MouseListener() 
		{

			@Override
			public void mouseClicked(MouseEvent e) {
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});

		label2.addMouseListener(new MouseListener()
		{

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});

		label3.addMouseListener(new MouseListener()
		{

			@Override
			public void mouseClicked(MouseEvent e) {
				packageMainGUI = new PackageMainGUI();
				packageMainGUI.setVisible(true);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - hung
	private JPanel panel2;
	private JLabel label1;
	private JLabel label5;
	private JLabel label2;
	private JLabel label6;
	private JLabel label3;
	private JPanel panel1;
	private JScrollPane scrollPane1;
	private JTextPane textPane1;
	private JLabel label4;
	private PackageMainGUI packageMainGUI;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
