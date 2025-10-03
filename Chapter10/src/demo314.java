import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class demo314 {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JTextField Fn;
	private JTextField Ln;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo314 window = new demo314();
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
	public demo314() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon chhs = new ImageIcon("../Chapter10/src/chhs.png");
		//Image icon takes care of images  ^ found in properties of image (path), add two dots    hover over ImageIcon to remove error
		
		frame = new JFrame();
		frame.setBounds(100, 100, 619, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setBackground(new Color(240, 240, 240));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Fn = new JTextField();
		Fn.setBackground(new Color(0, 128, 128));
		Fn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(Fn.getText().equals("first name"))
					Fn.setText("");
			}
		});
		Fn.setForeground(new Color(255, 215, 0));
		Fn.setFont(new Font("Papyrus", Font.PLAIN, 17));
		Fn.setText("first name");
		Fn.setBounds(10, 23, 234, 65);
		panel.add(Fn);
		Fn.setColumns(10);
		
		Ln = new JTextField();
		Ln.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(Ln.getText().equals("last name"))
					Ln.setText("");
			
			}
		});
		Ln.setBackground(Color.LIGHT_GRAY);
		Ln.setForeground(Color.WHITE);
		Ln.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Ln.setText("last name");
		Ln.setColumns(10);
		Ln.setBounds(265, 23, 244, 65);
		panel.add(Ln);
		
		JComboBox Grades = new JComboBox();
		Grades.setForeground(new Color(0, 128, 128));
		Grades.setBackground(new Color(255, 215, 0));
		Grades.setBounds(10, 99, 234, 22);
		panel.add(Grades);
		Grades.setFont(new Font("Papyrus", Font.PLAIN, 15));
		Grades.setModel(new DefaultComboBoxModel(new String[] {"Select grade:", "10", "11", "12"}));
		
		JComboBox School = new JComboBox();
		School.setBackground(Color.WHITE);
		School.setForeground(new Color(0, 0, 0));
		School.setModel(new DefaultComboBoxModel(new String[] {"Select school:", "Crescent Heights", "L.B. Pearson", "James Fowler", "Western"}));
		School.setBounds(265, 99, 244, 25);
		panel.add(School);
		School.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JTextArea disp = new JTextArea();
		disp.setText("...");
		disp.setFont(new Font("Calibri", Font.PLAIN, 15));
		disp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				
			}
		});
		disp.setBackground(UIManager.getColor("Button.background"));
		disp.setBounds(10, 171, 583, 83);
		panel.add(disp);
		
		JLabel imga = new JLabel("");
		imga.setBounds(10, 193, 290, 281);
		panel.add(imga);
		//MOVE THIS ABOVE CODE
		
		JButton sbmt = new JButton("submit!!");
		sbmt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		sbmt.setForeground(SystemColor.desktop);
		sbmt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sbmt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String fn = Fn.getText();
				String ln = Ln.getText();
				String grade = "";
				String school = "";
				
				if(Grades.getSelectedItem().equals("12"))
				{
				    grade = "12";
				}
				
				else if(Grades.getSelectedItem().equals("11")) 
				{
					grade = "11";
				}
				
				else
				{
					grade = "10";
				}
				
				if(School.getSelectedItem().equals("James Fowler"))
				{
				    school = "James Fowler";
				}
				
				else if(School.getSelectedItem().equals("L.B. Pearson")) 
				{
					school = "L.B. Pearson";
				}
				
				else if(School.getSelectedItem().equals("Western")) 
				{
					school = "Western";
				}
				
				else
				{
					school = "Crescent Heights";
					imga.setIcon(chhs);
				}
				disp.setText(fn + " " + ln + " is in the " + grade + "th grade, at " + school + " High School");
				
			}
		});
		sbmt.setBounds(10, 138, 583, 22);
		panel.add(sbmt);
		
		
		
	}
}
