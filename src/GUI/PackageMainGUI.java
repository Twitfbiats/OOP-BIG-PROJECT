package GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.*;

import javax.swing.*;

import Test.TestJdbc;
import Package.Package;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Mon Jan 02 19:34:27 ICT 2023
 */



/**
 * @author talion
 */
public class PackageMainGUI extends JFrame {
		
	TestJdbc testJdbc = new TestJdbc();
	
	public PackageMainGUI() {
		initComponents();
		addActionListener();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - hung
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menuItem1 = new JMenuItem();
		menuItem2 = new JMenuItem();
		menuItem3 = new JMenuItem();
		menu2 = new JMenu();
		menuItem4 = new JMenuItem();
		menuItem5 = new JMenuItem();
		menu3 = new JMenu();
		menuItem6 = new JMenuItem();
		menu4 = new JMenu();
		menuItem7 = new JMenuItem();
		panel2 = new JPanel();
		label2 = new JLabel();
		panel1 = new JPanel();
		textArea1 = new JTextArea();
		textField1 = new JTextField();
		panel3 = new JPanel();
		textArea2 = new JTextArea();
		label1 = new JLabel();
		scrollPane1 = new JScrollPane();
		table1 = new JTable();

		//======== this ========
		setPreferredSize(new Dimension(1470, 900));
		setMaximumSize(new Dimension(1550, 950));
		setMinimumSize(new Dimension(640, 310));
		setTitle("Package Management");
		Container contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
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

		//======== menuBar1 ========
		{

			//======== menu1 ========
			{
				menu1.setText("Functionality");

				//---- menuItem1 ----
				menuItem1.setText("Add");
				menu1.add(menuItem1);

				//---- menuItem2 ----
				menuItem2.setText("Update");
				menu1.add(menuItem2);

				//---- menuItem3 ----
				menuItem3.setText("Remove");
				menu1.add(menuItem3);
			}
			menuBar1.add(menu1);

			//======== menu2 ========
			{
				menu2.setText("Information");

				//---- menuItem4 ----
				menuItem4.setText("Some Shit here");
				menu2.add(menuItem4);

				//---- menuItem5 ----
				menuItem5.setText("Another Shit here");
				menu2.add(menuItem5);
			}
			menuBar1.add(menu2);

			//======== menu3 ========
			{
				menu3.setText("Misc");

				//---- menuItem6 ----
				menuItem6.setText("Not available yet");
				menu3.add(menuItem6);
			}
			menuBar1.add(menu3);

			//======== menu4 ========
			{
				menu4.setText("Statistic");

				//---- menuItem7 ----
				menuItem7.setText("Profit");
				menu4.add(menuItem7);
			}
			menuBar1.add(menu4);

			//======== panel2 ========
			{
				panel2.setPreferredSize(new Dimension(400, 18));
				panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));

				//---- label2 ----
				label2.setText("Created by group 8");
				label2.setHorizontalAlignment(SwingConstants.CENTER);
				label2.setFont(new Font("Liberation Sans", Font.BOLD, 15));
				panel2.add(label2);
			}
			menuBar1.add(panel2);
		}
		setJMenuBar(menuBar1);

		//======== panel1 ========
		{
			panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder (
			0, 0 ,0 , 0) ,  "" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder
			. BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .
			red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java .
			beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
			panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

			//---- textArea1 ----
			textArea1.setText("Search");
			textArea1.setEditable(false);
			textArea1.setToolTipText("Fast search for packages");
			textArea1.setFont(new Font("Liberation Sans", Font.BOLD, 15));
			textArea1.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			panel1.add(textArea1);

			//---- textField1 ----
			textField1.setPreferredSize(new Dimension(200, 24));
			panel1.add(textField1);
		}
		contentPane.add(panel1, "cell 0 0");

		//======== panel3 ========
		{
			panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));

			//---- textArea2 ----
			textArea2.setText("Filter");
			textArea2.setEditable(false);
			textArea2.setToolTipText("Click the filter to filter to your heart content");
			textArea2.setFont(new Font("Liberation Sans", Font.BOLD, 15));
			textArea2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
			textArea2.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			panel3.add(textArea2);

			//---- label1 ----
			label1.setIcon(new ImageIcon("img\\filterGifResize.gif"));
			panel3.add(label1);
		}
		contentPane.add(panel3, "cell 36 1");

		//======== scrollPane1 ========
		{
			scrollPane1.setPreferredSize(new Dimension(1430, 700));

			//---- table1 ----
			List<Object[]> list1 = new ArrayList<>();
			table1 = new JTable(initializeTestData(list1), new Object[]{"ID","Description","Weight","Sender","Receiver","From","To","Distance","Fee","Transport Type","Send Date", "Date Receive Estimation", "Status"});
			table1.setPreferredSize(new Dimension(1430, 700));
			table1.setFocusTraversalPolicyProvider(true);
			table1.getColumn("Description").setPreferredWidth(300);
			scrollPane1.setViewportView(table1);
		}
		contentPane.add(scrollPane1, "cell 0 2 37 1");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	public Object[][] initializeTestData(List<Object[]> list1)
	{
		List<Package> packages = testJdbc.testSelect();
		Object[][] objects = new Object[packages.size()][];
		Object[] object;
		int i = 0;
		for (Package packageTemp : packages)
		{
			object = new Object[13];
			object[0] = packageTemp.getId();
			object[1] = packageTemp.getDescription();
			object[2] = packageTemp.getWeight();
			object[3] = packageTemp.getSenderName();
			object[4] = packageTemp.getReceiverName();
			object[5] = packageTemp.getFrom().getLocation();
			object[6] = packageTemp.getTo().getLocation();
			object[7] = packageTemp.getDistance();
			object[8] = packageTemp.getFee();
			object[9] = packageTemp.getTransportType();
			object[10] = packageTemp.getSendDate().getTime();
			object[11] = packageTemp.getReceiveDateEstimation().getTime();
			object[12] = packageTemp.getStatus();
			objects[i++] = object;
		}
		return objects;
	}

	public void addActionListener()
	{
		menuItem1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				addPackageGUI = new AddPackageGUI();
				addPackageGUI.setVisible(true);
			}
		});

		menuItem2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				updatePackageGUI = new UpdatePackageGUI();
				updatePackageGUI.setVisible(true);
			}
		});
		
		menuItem3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				removePackageGUI = new RemovePackageGUI();
				removePackageGUI.setVisible(true);
			}
		});
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - hung
	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenuItem menuItem1;
	private JMenuItem menuItem2;
	private JMenuItem menuItem3;
	private JMenu menu2;
	private JMenuItem menuItem4;
	private JMenuItem menuItem5;
	private JMenu menu3;
	private JMenuItem menuItem6;
	private JMenu menu4;
	private JMenuItem menuItem7;
	private JPanel panel2;
	private JLabel label2;
	private JPanel panel1;
	private JTextArea textArea1;
	private JTextField textField1;
	private JPanel panel3;
	private JTextArea textArea2;
	private JLabel label1;
	private JScrollPane scrollPane1;
	private JTable table1;
	private AddPackageGUI addPackageGUI;
	private UpdatePackageGUI updatePackageGUI;
	private RemovePackageGUI removePackageGUI;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
