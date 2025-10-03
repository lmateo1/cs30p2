/*

Program: TicTacToeGUI.java          Last Revision: October 1, 2025

Purpose: An application that simulates a game of tic-tac-toe on a 3x3 grid

Mateo Luna, CHHS
Computer Programming 30
 
*/

package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TicTacToeGUI 
{

	//Declare variables
	private JFrame frmTictactoe;
	int moves = 0;
	
	//Declare spaces array which determines which letter fills each space
	char[] spaces = new char[9];
	
	//Create a method which checks if a player has won
	private char checkwin() 
	{
		
		//Declare X the winner if three spaces in a row have been filled with X
		if(spaces[0] == spaces[1] && spaces[1] == spaces[2] && spaces[2] == 'X' ||
		   spaces[3] == spaces[4] && spaces[4] == spaces[5] && spaces[5] == 'X' ||
		   spaces[6] == spaces[7] && spaces[7] == spaces[8] && spaces[8] == 'X' ||
		   spaces[0] == spaces[3] && spaces[3] == spaces[6] && spaces[6] == 'X' ||
		   spaces[1] == spaces[4] && spaces[4] == spaces[7] && spaces[7] == 'X' ||
		   spaces[2] == spaces[5] && spaces[5] == spaces[8] && spaces[8] == 'X' ||
		   spaces[0] == spaces[4] && spaces[4] == spaces[8] && spaces[8] == 'X' ||
		   spaces[2] == spaces[4] && spaces[4] == spaces[6] && spaces[6] == 'X' ) 
		   {
		       return 'X';
		   }
		
		//Declare O the winner if three spaces in a row have been filled with O
		else if(spaces[0] == spaces[1] && spaces[1] == spaces[2] && spaces[2] == 'O' ||
				spaces[3] == spaces[4] && spaces[4] == spaces[5] && spaces[5] == 'O' ||
				spaces[6] == spaces[7] && spaces[7] == spaces[8] && spaces[8] == 'O' ||
				spaces[0] == spaces[3] && spaces[3] == spaces[6] && spaces[6] == 'O' ||
			    spaces[1] == spaces[4] && spaces[4] == spaces[7] && spaces[7] == 'O' ||
				spaces[2] == spaces[5] && spaces[5] == spaces[8] && spaces[8] == 'O' ||
				spaces[0] == spaces[4] && spaces[4] == spaces[8] && spaces[8] == 'O' ||
				spaces[2] == spaces[4] && spaces[4] == spaces[6] && spaces[6] == 'O' ) 
				{
		        	return 'O';
				}
		
		//Declare no winner if conditions have not yet been met
		else
		{
			return '-';
			
		}
				
		
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					TicTacToeGUI window = new TicTacToeGUI();
					window.frmTictactoe.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToeGUI() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmTictactoe = new JFrame();
		frmTictactoe.setTitle("TicTacToe");
		frmTictactoe.setBackground(new Color(167, 191, 220));
		frmTictactoe.setBounds(100, 100, 450, 364);
		frmTictactoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTictactoe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 219, 236));
		panel.setBounds(0, 0, 434, 325);
		frmTictactoe.getContentPane().add(panel);
		panel.setLayout(null);
		
		//Display which user is meant to go next
		JTextArea turn = new JTextArea();
		turn.setForeground(new Color(52, 124, 177));
		turn.setBackground(new Color(204, 219, 236));
		turn.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		turn.setText("Your turn, X!");
		turn.setBounds(57, 233, 320, 30);
		panel.add(turn);
		
		//Display the winner, if there is one
		JTextArea result = new JTextArea();
		result.setText("Winner: -");
		result.setForeground(new Color(52, 124, 177));
		result.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		result.setBackground(new Color(204, 219, 236));
		result.setBounds(57, 269, 320, 45);
		panel.add(result);
	
		//Create a tic-tac-toe square to be clicked
		JButton box = new JButton("-");
		box.setForeground(new Color(65, 103, 118));
		box.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//Return if square has already been played, or if the game has been won
				if(!box.getText().equals("-") || checkwin() == 'X' || checkwin() == 'O')
				{
					return;
				}
				
				//Set selected square to "X" if it is X's turn, then switch turns
				else if(moves % 2 == 0) 
				{
					box.setText("X");
					moves++;
					spaces[0] = 'X';
					turn.setText("Your turn, O!");
					result.setText("The winner is: " + checkwin());
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}
				
				//Set selected square to "O" if it is O's turn, then switch turns
				else
				{
					box.setText("O");
					moves++;
					spaces[0] = 'O';
					turn.setText("Your turn, X!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
					
				}
				
			}
		});
		box.setBounds(57, 11, 100, 63);
		panel.add(box);
		
		//Create a tic-tac-toe square to be clicked
		JButton box_1 = new JButton("-");
		box_1.setForeground(new Color(65, 103, 118));
		box_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//Return if square has already been played, or if the game has been won
				if(!box_1.getText().equals("-") || checkwin() == 'X' || checkwin() == 'O')
				{
					return;
				}
				
				//Set selected square to "X" if it is X's turn, then switch turns
				else if(moves % 2 == 0) 
				{
					box_1.setText("X");
					moves++;
					spaces[1] = 'X';
					turn.setText("Your turn, O!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}
				
				//Set selected square to "O" if it is O's turn, then switch turns
				else
				{
					box_1.setText("O");
					moves++;
					spaces[1] = 'O';
					turn.setText("Your turn, X!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}
				
			}
		});
		box_1.setBounds(167, 11, 100, 63);
		panel.add(box_1);
		
		//Create a tic-tac-toe square to be clicked
		JButton box_2 = new JButton("-");
		box_2.setForeground(new Color(65, 103, 118));
		box_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//Return if square has already been played, or if the game has been won
				if(!box_2.getText().equals("-") || checkwin() == 'X' || checkwin() == 'O')
				{
					return;
				}
				
				//Set selected square to "X" if it is X's turn, then switch turns
				else if(moves % 2 == 0) 
				{
					box_2.setText("X");
					moves++;
					spaces[2] = 'X';
					turn.setText("Your turn, O!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}

				//Set selected square to "O" if it is O's turn, then switch turns
				else
				{
					box_2.setText("O");
					moves++;
					spaces[2] = 'O';
					turn.setText("Your turn, X!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}
				
			}
		});
		box_2.setBounds(277, 11, 100, 63);
		panel.add(box_2);
		
		//Create a tic-tac-toe square to be clicked
		JButton box_3 = new JButton("-");
		box_3.setForeground(new Color(65, 103, 118));
		box_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//Return if square has already been played, or if the game has been won
				if(!box_3.getText().equals("-") || checkwin() == 'X' || checkwin() == 'O')
				{
					return;
				}
				
				//Set selected square to "X" if it is X's turn, then switch turns
				else if(moves % 2 == 0) 
				{
					box_3.setText("X");
					moves++;
					spaces[3] = 'X';
					turn.setText("Your turn, O!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}

				//Set selected square to "O" if it is O's turn, then switch turns
				else
				{
					box_3.setText("O");
					moves++;
					spaces[3] = 'O';
					turn.setText("Your turn, X!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}
				
			}
		});
		box_3.setBounds(57, 85, 100, 63);
		panel.add(box_3);
		
		//Create a tic-tac-toe square to be clicked
		JButton box_4 = new JButton("-");
		box_4.setForeground(new Color(65, 103, 118));
		box_4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//Return if square has already been played, or if the game has been won
				if(!box_4.getText().equals("-") || checkwin() == 'X' || checkwin() == 'O')
				{
					return;
				}
				
				//Set selected square to "X" if it is X's turn, then switch turns
				else if(moves % 2 == 0) 
				{
					box_4.setText("X");
					moves++;
					spaces[4] = 'X';
					turn.setText("Your turn, O!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}

				//Set selected square to "O" if it is O's turn, then switch turns
				else
				{
					box_4.setText("O");
					moves++;
					spaces[4] = 'O';
					turn.setText("Your turn, X!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}
				
			}
		});
		box_4.setBounds(167, 85, 100, 63);
		panel.add(box_4);
		
		//Create a tic-tac-toe square to be clicked
		JButton box_5 = new JButton("-");
		box_5.setForeground(new Color(65, 103, 118));
		box_5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//Return if square has already been played, or if the game has been won
				if(!box_5.getText().equals("-") || checkwin() == 'X' || checkwin() == 'O')
				{
					return;
				}
				
				//Set selected square to "X" if it is X's turn, then switch turns
				else if(moves % 2 == 0) 
				{
					box_5.setText("X");
					moves++;
					spaces[5] = 'X';
					turn.setText("Your turn, O!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}

				//Set selected square to "O" if it is O's turn, then switch turns
				else
				{
					box_5.setText("O");
					moves++;
					spaces[5] = 'O';
					turn.setText("Your turn, X!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}
				
			}
		});
		box_5.setBounds(277, 85, 100, 63);
		panel.add(box_5);
		
		//Create a tic-tac-toe square to be clicked
		JButton box_6 = new JButton("-");
		box_6.setForeground(new Color(65, 103, 118));
		box_6.addActionListener(new ActionListener() 
		{
			//Return if square has already been played, or if the game has been won
			public void actionPerformed(ActionEvent e) 
			{
				if(!box_6.getText().equals("-") || checkwin() == 'X' || checkwin() == 'O')
				{
					return;
				}
				
				//Set selected square to "X" if it is X's turn, then switch turns
				else if(moves % 2 == 0) 
				{
					box_6.setText("X");
					moves++;
					spaces[6] = 'X';
					turn.setText("Your turn, O!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}

				//Set selected square to "O" if it is O's turn, then switch turns
				else
				{
					box_6.setText("O");
					moves++;
					spaces[6] = 'O';
					turn.setText("Your turn, X!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}
				
			}
		});
		box_6.setBounds(57, 159, 100, 63);
		panel.add(box_6);
		
		//Create a tic-tac-toe square to be clicked
		JButton box_7 = new JButton("-");
		box_7.setForeground(new Color(65, 103, 118));
		box_7.addActionListener(new ActionListener() 
		{
			//Return if square has already been played, or if the game has been won
			public void actionPerformed(ActionEvent e) 
			{
				
				if(!box_7.getText().equals("-") || checkwin() == 'X' || checkwin() == 'O')
				{
					return;
				}
				
				//Set selected square to "X" if it is X's turn, then switch turns
				else if(moves % 2 == 0) 
				{
					box_7.setText("X");
					moves++;
					spaces[7] = 'X';
					turn.setText("Your turn, O!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}

				//Set selected square to "O" if it is O's turn, then switch turns
				else
				{
					box_7.setText("O");
					moves++;
					spaces[7] = 'O';
					turn.setText("Your turn, X!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}
				
			}
		});
		box_7.setBounds(167, 159, 100, 63);
		panel.add(box_7);
		
		//Create a tic-tac-toe square to be clicked
		JButton box_8 = new JButton("-");
		box_8.setForeground(new Color(65, 103, 118));
		box_8.addActionListener(new ActionListener() 
		{
			//Return if square has already been played, or if the game has been won
			public void actionPerformed(ActionEvent e) 
			{
				if(!box_8.getText().equals("-") || checkwin() == 'X' || checkwin() == 'O')
				{
					return;
				}
				
				//Set selected square to "X" if it is X's turn, then switch turns
				else if(moves % 2 == 0) 
				{
					box_8.setText("X");
					moves++;
					spaces[8] = 'X';
					turn.setText("Your turn, O!");
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}

				//Set selected square to "O" if it is O's turn, then switch turns
				else
				{
					box_8.setText("O");
					moves++;
					spaces[8] = 'O';
					turn.setText("Your turn, X!" + spaces[1]);
					result.setText("The winner is: " + checkwin() );
					
					//Check if game has been won
					if(checkwin() == 'X' || checkwin() == 'O')
					{
						turn.setText(" ");
						return;
					}
				}
				
			}
		});
		box_8.setBounds(277, 159, 100, 63);
		panel.add(box_8);
		

	}
}
