package abc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MyFilePt2of2 {

	
	
	private JFrame frame;
	
	private static final String FILE_PATH = "C:\\Users\\38329006\\git\\cs30p2\\abc\\src\\abc\\zzz.txt";
	private File textFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFilePt2of2 window = new MyFilePt2of2();
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
	public MyFilePt2of2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
	    textFile = new File(FILE_PATH);
		frame = new JFrame();
		frame.setBounds(100, 100, 533, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel disp = new JLabel("");
		disp.setHorizontalAlignment(SwingConstants.CENTER);
		disp.setBounds(70, 11, 367, 65);
		panel.add(disp);
		
		JButton keepfile = new JButton("Keep File");
		keepfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(textFile.exists())
				{
					disp.setText("The file already exists");
				}
				else
				{
					try
					{
						if(textFile.createNewFile()) 
						{
							disp.setText("File has been created");
						}
						else
						{
							disp.setText("File could not be created");
						}
					}
					catch(IOException ex)
					{
						disp.setText("Error: " + ex.getMessage());
						System.err.println("IOException" + ex.getMessage());
					}
				}
				
			}
		});
		keepfile.setBounds(70, 121, 172, 87);
		panel.add(keepfile);
		
		JButton dltfile = new JButton("Delete File");
		dltfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(textFile.delete())
				{
				    disp.setText("The file has been DELETED");
				}
				else 
				{
					disp.setText("Failed to delete the file");
				}
			}
		});
		dltfile.setBounds(265, 121, 172, 87);
		panel.add(dltfile);
	}
}
