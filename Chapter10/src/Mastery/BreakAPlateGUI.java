package Mastery;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;

public class BreakAPlateGUI {

	private JFrame frame;
	int play, play1, play2;
	int plays, broken;
	boolean end = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlateGUI window = new BreakAPlateGUI();
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
	public BreakAPlateGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon plates = new ImageIcon("../Chapter10/src/plates.gif");
		ImageIcon twobroken = new ImageIcon("../Chapter10/src/plates_two_broken.gif");
		ImageIcon allbroken = new ImageIcon("../Chapter10/src/plates_all_broken.gif");
		ImageIcon sticker = new ImageIcon("../Chapter10/src/sticker.gif");
		ImageIcon tiger = new ImageIcon("../Chapter10/src/tiger_plush.gif");
		ImageIcon placeholder = new ImageIcon("../Chapter10/src/placeholder.gif");
				
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 355);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 316);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea playcount = new JTextArea();
		playcount.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		playcount.setText("Plays: 0");
		playcount.setBounds(240, 128, 114, 39);
		panel.add(playcount);
		
		JTextArea result = new JTextArea();
		result.setText("You win:\r\n");
		result.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		result.setBounds(110, 197, 106, 57);
		panel.add(result);
		
		JLabel plateboard = new JLabel("");
		plateboard.setBounds(72, 5, 309, 97);
		panel.add(plateboard);
		plateboard.setIcon(plates);
		
		JLabel prize = new JLabel("");
		prize.setBounds(226, 178, 103, 97);
		panel.add(prize);
		prize.setIcon(placeholder);
		
		JButton playbutton = new JButton("Play");
		playbutton.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		playbutton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				if(end == true)
				{
					return;
				}
				
				plays++;
				broken+= 2;
				playcount.setText("Plays: " + plays + "\r\nPlates Broken: " + broken);
				
				play = (int) (Math.random() * 2);
				play1 = (int) (Math.random() * 2);
				play2 = (int) (Math.random() * 2);
				
				if(play == play1 && play1 == play2 && play == 1) 
				{
					result.setText("You win:\r\nTiger plush\r\nCongrats!");
					plateboard.setIcon(allbroken);
					prize.setIcon(tiger);
					broken++;
					playcount.setText("Plays: " + plays + "\r\nPlates Broken: " + broken);
				    end = true;
				}
				
				else 
				{
					result.setText("You win:\r\nSticker");
					plateboard.setIcon(twobroken);
					prize.setIcon(sticker);
				}
				
			}
		});
		playbutton.setBounds(110, 128, 89, 23);
		panel.add(playbutton);
		
		
		
		
	}
}
