package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StatsPt2of2 {

	private JFrame frame;
	private JTextField fileName;
	private JTextField studentField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatsPt2of2 window = new StatsPt2of2();
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
	public StatsPt2of2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 556, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 540, 417);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		fileName = new JTextField();
		fileName.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(fileName.getText().equals("Enter file name here"))
				{
					fileName.setText("");
				}
			}
		});
		fileName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fileName.setForeground(new Color(128, 128, 128));
		fileName.setText("Enter file name here");
		fileName.setBounds(10, 11, 253, 33);
		panel.add(fileName);
		fileName.setColumns(10);
		
		studentField = new JTextField();
		studentField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(studentField.getText().equals("Enter number of students here"))
				{
					studentField.setText("");
				}
			}
		});
		studentField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		studentField.setForeground(new Color(128, 128, 128));
		studentField.setText("Enter number of students here");
		studentField.setColumns(10);
		studentField.setBounds(10, 55, 253, 33);
		panel.add(studentField);
		
		JButton createData = new JButton("Create data file");
		createData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String filename = fileName.getText().trim();
				String numStudentsText = studentField.getText().trim();
				
				if(filename.isEmpty () || numStudentsText.isEmpty())
				{
					JOptionPane.showMessageDialog(null, 
							"Please put both file name and number of students", 
							"Input Error", JOptionPane.WARNING_MESSAGE);
					
					
				}
				
				
				
			}
		});
		createData.setFont(new Font("Tahoma", Font.PLAIN, 14));
		createData.setForeground(new Color(0, 0, 0));
		createData.setBounds(273, 12, 257, 34);
		panel.add(createData);
		
		JButton analyzeScores = new JButton("Analyze scores");
		analyzeScores.setFont(new Font("Tahoma", Font.PLAIN, 14));
		analyzeScores.setForeground(new Color(0, 0, 0));
		analyzeScores.setBounds(273, 55, 257, 33);
		panel.add(analyzeScores);
		
		JTextArea resultArea = new JTextArea();
		resultArea.setBackground(SystemColor.menu);
		resultArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		resultArea.setBounds(10, 99, 520, 307);
		panel.add(resultArea);
	}
}
