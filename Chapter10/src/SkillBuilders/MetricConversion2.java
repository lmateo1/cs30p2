package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetricConversion2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion2 frame = new MetricConversion2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MetricConversion2() {
		setTitle("stickynote");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 196));
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		

		JTextArea disp = new JTextArea();
		disp.setForeground(new Color(0, 0, 128));
		disp.setText("CHOOSE SOMETHING");
		disp.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 25));
		disp.setBackground(new Color(255, 228, 196));
		disp.setBounds(29, 150, 371, 100);
		panel.add(disp);
		
		JComboBox conversion = new JComboBox();
		conversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(conversion.getSelectedItem().equals("feet to meters"))
				{
				    disp.setText("1 foot = 0.305 meters");
				}
				else {
					 disp.setText("1 meter = idk bro");
				}
			}
		});
		conversion.setForeground(new Color(218, 112, 214));
		conversion.setFont(new Font("Impact", Font.ITALIC, 14));
		conversion.setBackground(new Color(255, 222, 173));
		conversion.setModel(new DefaultComboBoxModel(new String[] {"meters to feet", "feet to meters"}));
		conversion.setBounds(88, 90, 244, 30);
		panel.add(conversion);
		
		
		
		JTextArea ask = new JTextArea();
		ask.setBackground(new Color(255, 228, 196));
		ask.setForeground(new Color(0, 0, 128));
		ask.setFont(new Font("Ink Free", Font.PLAIN, 18));
		ask.setText("SELECT CONVERSION TYPE");
		ask.setBounds(88, 51, 244, 28);
		panel.add(ask);
		

	}
}
