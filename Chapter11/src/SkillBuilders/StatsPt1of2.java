package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class StatsPt1of2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatsPt1of2 window = new StatsPt1of2();
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
	public StatsPt1of2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea resultArea = new JTextArea();
		resultArea.setRows(15);
		resultArea.setColumns(40);
		resultArea.setEditable(false);
		resultArea.setBorder(new LineBorder(new Color(255, 128, 64)));
		resultArea.setCaretColor(new Color(0, 0, 0));
		resultArea.setBackground(SystemColor.window);
		resultArea.setBounds(10, 78, 414, 153);
		frame.getContentPane().add(resultArea);
		
		JLabel titleLabel = new JLabel("New label");
		titleLabel.setBackground(new Color(255, 128, 0));
		titleLabel.setBounds(64, 11, 265, 35);
		frame.getContentPane().add(titleLabel);
		
		JButton analyzeButton = new JButton("Analyze Scores");
		analyzeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				resultArea.setText("");
				
				File dataFile = new File("..\\Chapter11\\src\\SkillBuilders\\test.txt");
				FileReader in;
				BufferedReader readFile;
				
				String stuName, score;
				double scoreValue;
				
				double lowScore = 100;
				double highScore = 0l;
				double avgScore;
				double totalScore = 0;
				int numScore = 0;
				
				NumberFormat percent = NumberFormat.getPercentInstance();
				
				StringBuilder output = new StringBuilder();
				
				try
				{
					in = new FileReader(dataFile);
					readFile = new BufferedReader(in);
					
					while((stuName = readFile.readLine()) != null)
					{
						score = readFile.readLine();
						numScore += 1;
						scoreValue = Double.parseDouble(score);
						output.append(stuName + " " + percent.format(scoreValue/100) + "\n");
						if(scoreValue < lowScore)
						{
							lowScore = scoreValue;
						}
						if(scoreValue > highScore)
						{
							highScore = scoreValue;
						}
						
					}
					
					avgScore = totalScore / numScore;
					output.append("\n STATISTICS \n");
					output.append("------------------\n");
					
					output.append("Low Score: " + percent.format(lowScore/100)+ "\n");
					output.append("High Score: " + percent.format(highScore/100)+ "\n");
					output.append("Average Score: " + percent.format(avgScore/100)+ "\n");
					output.append("Total Students: " + numScore + "\n");
					
					resultArea.setText(output.toString());
					
					readFile.close();
					in.close();
					
				}
				catch(FileNotFoundException ex)
				{
					System.out.print("File could not be found.");
					System.err.println("FileNotFoundException: " + ex.getMessage());
				}
				catch(IOException ex)
				{
					System.out.print("Problem reading file.");
					System.err.println("IOException: " + ex.getMessage());
				}
				
				
			}
		});
		analyzeButton.setBackground(new Color(255, 128, 64));
		analyzeButton.setBounds(10, 242, 414, 73);
		frame.getContentPane().add(analyzeButton);
	}
}
