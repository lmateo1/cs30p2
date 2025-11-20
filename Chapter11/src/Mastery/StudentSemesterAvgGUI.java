package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class StudentSemesterAvgGUI {

	private JFrame frmStudentsemesteravggui;

	
	private JTextField studentName;
	private JTextField gradeLevel;
	private JTextField semNum;
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;
	private JTextField grade4;
	private JTextArea disp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSemesterAvgGUI window = new StudentSemesterAvgGUI();
					window.frmStudentsemesteravggui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentSemesterAvgGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		
		File studentFile;
		studentFile = new File("C:\\Users\\38329006\\git\\cs30p2\\Chapter11\\src\\Mastery\\student.txt");
		
		frmStudentsemesteravggui = new JFrame();
		frmStudentsemesteravggui.setTitle("StudentSemesterAvgGUI");
		frmStudentsemesteravggui.setBounds(100, 100, 450, 631);
		frmStudentsemesteravggui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentsemesteravggui.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 592);
		frmStudentsemesteravggui.getContentPane().add(panel);
		panel.setLayout(null);
		
		//Create a space in which the user can enter a student name
		studentName = new JTextField();
		studentName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(studentName.getText().equals("Enter Student Name..."))
				{
					studentName.setText("");
				}
			}
		});
		studentName.setForeground(new Color(127, 127, 127));
		studentName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		studentName.setText("Enter Student Name...");
		studentName.setBounds(10, 11, 414, 26);
		panel.add(studentName);
		studentName.setColumns(10);
		
		//Create a space in which the user can enter a grade level
		gradeLevel = new JTextField();
		gradeLevel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(gradeLevel.getText().equals("Enter Grade Level..."))
				{
					gradeLevel.setText("");
				}
			}
		});
		gradeLevel.setText("Enter Grade Level...");
		gradeLevel.setForeground(new Color(127, 127, 127));
		gradeLevel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		gradeLevel.setColumns(10);
		gradeLevel.setBounds(10, 48, 414, 26);
		panel.add(gradeLevel);
		
		//Create a space in which the user can enter a semester number
		semNum = new JTextField();
		semNum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(semNum.getText().equals("Enter Semester Number..."))
				{
					semNum.setText("");
				}
			}
		});
		semNum.setText("Enter Semester Number...");
		semNum.setForeground(new Color(127, 127, 127));
		semNum.setFont(new Font("Tahoma", Font.PLAIN, 13));
		semNum.setColumns(10);
		semNum.setBounds(10, 85, 414, 26);
		panel.add(semNum);
		
		//Create a space in which the user can their first grade
		grade1 = new JTextField();
		grade1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(grade1.getText().equals("Enter Grade #1..."))
				{
					grade1.setText("");
				}
			}
		});
		grade1.setText("Enter Grade #1...");
		grade1.setForeground(new Color(127, 127, 127));
		grade1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		grade1.setColumns(10);
		grade1.setBounds(10, 122, 414, 26);
		panel.add(grade1);
		
		//Create a space in which the user can their second grade
		grade2 = new JTextField();
		grade2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(grade2.getText().equals("Enter Grade #2..."))
				{
					grade2.setText("");
				}
			}
		});
		grade2.setText("Enter Grade #2...");
		grade2.setForeground(new Color(127, 127, 127));
		grade2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		grade2.setColumns(10);
		grade2.setBounds(10, 159, 414, 26);
		panel.add(grade2);
		
		//Create a space in which the user can their third grade
		grade3 = new JTextField();
		grade3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(grade3.getText().equals("Enter Grade #3..."))
				{
					grade3.setText("");
				}
			}
		});
		grade3.setText("Enter Grade #3...");
		grade3.setForeground(new Color(127, 127, 127));
		grade3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		grade3.setColumns(10);
		grade3.setBounds(10, 196, 414, 26);
		panel.add(grade3);
		
		//Create a space in which the user can their fourth grade
		grade4 = new JTextField();
		grade4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(grade4.getText().equals("Enter Grade #4..."))
				{
					grade4.setText("");
				}
			}
		});
		grade4.setText("Enter Grade #4...");
		grade4.setForeground(new Color(127, 127, 127));
		grade4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		grade4.setColumns(10);
		grade4.setBounds(10, 233, 414, 26);
		panel.add(grade4);
		
		//Create a text area which displays the results
		JTextArea result = new JTextArea();
		result.setFont(new Font("Tahoma", Font.PLAIN, 11));
		result.setBorder(new LineBorder(new Color(0, 0, 0)));
		result.setBounds(10, 270, 414, 214);
		panel.add(result);
		
		//Create a button which saves the information to the student file
		JButton saveFile = new JButton("Save to File");
		saveFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Declare file writers
				FileWriter out;
				BufferedWriter writeFile;
				
				//Declare grade variables
				double g1, g2, g3, g4;
				
				//Save information entered by user
				String StudentName = studentName.getText().trim();
				String GradeLevel = gradeLevel.getText().trim();
				String SemNum = semNum.getText().trim();
				String Grade1 = grade1.getText().trim();
				g1 = Double.parseDouble(Grade1);
				String Grade2 = grade2.getText().trim();
				g2 = Double.parseDouble(Grade2);
				String Grade3 = grade3.getText().trim();
				g3 = Double.parseDouble(Grade3);
				String Grade4 = grade4.getText().trim();
				g4 = Double.parseDouble(Grade4);
				
				//Output an error message if information is missing
				if(StudentName.isEmpty() || GradeLevel.isEmpty() || SemNum.isEmpty() || Grade1.isEmpty() || Grade2.isEmpty() || Grade3.isEmpty() || Grade4.isEmpty())
				{
					JOptionPane.showMessageDialog(null, 
							"Please input all information", 
							"Input Error", JOptionPane.WARNING_MESSAGE);
				}

				//Write the saved information to the student file
				try
				{
					out = new FileWriter(studentFile, true);
					writeFile = new BufferedWriter(out);
					
					writeFile.write("Name: " + StudentName
							+ ", Grade Level: " + GradeLevel
							+ ", Semester: " + SemNum);
					writeFile.newLine();
					writeFile.write("Grades: " + g1 + ", " + g2 + ", " + g3 + ", " + g4 
							+ " Average: " + (g1 + g2 + g3 + g4) / 4 );
					writeFile.newLine();
					
					writeFile.close();
					out.close();
					
				}
				catch(IOException ex)
				{

					disp.setText("Error: " + ex.getMessage());
					System.err.println("IOException" + ex.getMessage());
				
				}
				
				
			}
		
			
		});
		saveFile.setBounds(10, 499, 192, 26);
		panel.add(saveFile);
		
		//Create a button which allows you to view the student file contents
		JButton viewFile = new JButton("View File Contents");
		viewFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				//Declare file reader
				FileReader in = null;
				BufferedReader readFile = null;
				
				//Output the file contents to the result area
				try 
				{
					in = new FileReader(studentFile);
					readFile = new BufferedReader(in);
					
					StringBuilder sb = new StringBuilder();
			        String line;

			        while ((line = readFile.readLine()) != null) 
			        {
			            sb.append(line).append("\n");
			        }
			         
			        result.setText(sb.toString());
				}
				catch (FileNotFoundException ex) 
				{   
					disp.setText("Problem writing to file.");   
					System.err.println("IOException: " + ex.getMessage());  
				}
				catch(IOException ex)
				{
					disp.setText("Error: " + ex.getMessage());
					System.err.println("IOException" + ex.getMessage());
				}
				
			}
		});
		viewFile.setBounds(232, 499, 192, 26);
		panel.add(viewFile);
		
		//Create an area to display error messages
		disp = new JTextArea();
		disp.setBackground(SystemColor.menu);
		disp.setBorder(null);
		disp.setBounds(10, 536, 414, 37);
		panel.add(disp);
	}
}
