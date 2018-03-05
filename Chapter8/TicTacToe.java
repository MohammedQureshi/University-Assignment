package Chapter8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToe extends JApplet implements ActionListener {

	/**
	 * Mohammed Faisal Qureshi
	 */
	private static final long serialVersionUID = 1L; /* Declares the serial version UID*/
	
	JButton squares[]; /* Creating an Array of JButtons stored under the name squares */
	JButton newGameButton; /* Creating a Button to start a new game */
	
	JLabel score; /* Creating a JLabel to store if you won the round or lost the round */
	JLabel wins; /* Shows the user number of games won on a JLabel */
	JLabel loses; /* Shows the user number of games lost on a JLabel */

	int emptySquaresLeft = 9; /* This sets it so there is 9 empty squares left on the grid at
	the start as non would of been clicked*/
	int gamesWon; /* This will store the number of games won in an integer */
	int gamesLost; /* This will store the number of games lost in an integer */

	public static void main(String args[]) { /* This is setting up the main Method */

		JApplet theApplet = new TicTacToe(); /* Declaring the applet for the program */
		theApplet.init(); /* This initiolizes the applet */
		theApplet.start(); /* This starts the applet up */

		JFrame window = new JFrame("Tic Tac Toe Applet and Application"); /* This is setting up a JFrame called
		window and giving it a name */
		window.setContentPane(theApplet); /* This sets the JFrames content pane as the applet we declared at the start */
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* This sets the program to exit when the close button is pressed */
		window.setPreferredSize(new Dimension(400, 400)); /* This sets the prefered dimentions I would like the JFrame to be */
		window.pack(); /* This will make sure everything fits within the JFrame */
		window.setVisible(true); /* This will make sure the JFrame is visiable */
	}

	public TicTacToe() { /* This is setting up a applet constructor */
		add(new JLabel("This is an Applet and Application")); /* This is adding and creating a JLabel */
	}

	public void init() { /* Setting up the init method */
		
		Container appletContent = this.getContentPane(); /* Creating a Container for the applets content */
		resize(300, 300); /* Setting the size of the applet */
		appletContent.setLayout(new BorderLayout()); /* Set the layout to borderlayout for the applet */
		appletContent.setBackground(Color.CYAN); /* Setting the background colour of the applet to Cyan */

		newGameButton = new JButton("New Game"); /* Creating a new button and adding text displaying New Game */
		newGameButton.addActionListener(this); /* This is adding an action listener to the button */
		wins = new JLabel("Won: " + gamesWon); /* Updating the value of the current JLabel */
		loses = new JLabel("Lost: " + gamesLost); /* Updating the value of the current JLabel */
		JPanel topPanel = new JPanel(); /* Creating a new panel */
		topPanel.setLayout(new GridLayout()); /* Adding the GridLayout to the top panel */
		topPanel.add(wins); /* Adding the JLabel called wins to the topPanel */
		topPanel.add(newGameButton); /* Adding the newGameButton to the topPanel */
		newGameButton.setHorizontalAlignment(JButton.CENTER); /* Setting the newGameButton in the centre of the top */
		newGameButton.setSize(3, 3); /* Setting the size of the newGameButton */
		topPanel.add(loses); /* This is adding the JLabel loses to the topPanel */

		appletContent.add(topPanel, "North"); /* This is adding the topPanel to the main panel I created at the 
		start and positioning it in the top */

		JPanel centerPanel = new JPanel(); /* This is creating another JPanel */
		centerPanel.setLayout(new GridLayout(3, 3)); /* This is setting the grid layout for the new panel I 
		created called centrePanel */
		appletContent.add(centerPanel, "Center"); /* This is adding the new panel I 
		created centerPanel to the main appletContent and positioned in Centre */

		score = new JLabel("Your Turn!"); /* This is changing the value of the score label */
		appletContent.add(score, "South"); /* This is adding the score label to the appletContent 
		and positioning it at the bottom */

		squares = new JButton[9]; /* This is setting the value of squares JButton to an array of 9 Buttons */

		for (int i = 0; i < 9; i++) { /* For loop will run while i is less then i and will increase by 1 each time ran */
			squares[i] = new JButton();  /* Stores a new button in each array */
			squares[i].setBackground(Color.ORANGE); /* Sets the colour of each button to orange */
			centerPanel.add(squares[i]); /* Adds each button to the centerPanel JPanel */
			squares[i].addActionListener(this); /* Adds an action listener to every button */
			newGameButton.setEnabled(false); /* This is it so non of the buttons are useable at this point */
		}
	}

	public void actionPerformed(ActionEvent e) { /* Sets up the action listener */
	
		JButton selectedButton = (JButton) e.getSource(); /* Stores what button has been pressed */

		if (selectedButton == newGameButton) { /* Checks if newGameButton has been pressed and runs code below*/
			for (int i = 0; i < 9; i++) { /* For loop will run while i is less then i and will increase by 1 each time ran */
				squares[i].setEnabled(true); /* Enables all the buttons in the array to use */
				squares[i].setText(""); /* Sets the text of all buttons to blank */
				squares[i].setBackground(Color.ORANGE); /* Sets all buttons back to orange */
			}
			emptySquaresLeft = 9; /* Sets value of emptySquaresLeft to 9 */
			score.setText("Your Turn!"); /* Sets JLabel score to update text */
			newGameButton.setEnabled(false); /* Disables the newGameButton */
			return; /* Returns void  to the method */
		}

		String winner = ""; /* Stores the winner of the game  */
		
		for (int i = 0; i < 9; i++) { /* For loop will run while i is less then i and will increase by 1 each time ran */
			if (selectedButton == squares[i]) { /* Looks if selectedButton is equal to the current button in 
			the array and if is runs code below */
				squares[i].setText("X"); /* Sets value of current square to X */
				squares[i].setEnabled(false); /* Disables the current square  */
				winner = lookForWinner(); /* Runs method lookForWinner and makes it equal to variable winner */

				if (!"".equals(winner)) { /* Checks if not equal to winner */
					endTheGame(); /* Runs method endTheGame to end game */
				} else { /* This happens if the above statement is not ran */
					computerMove(); /* Runs computerMove method */
					winner = lookForWinner(); /* Runs lookForWinner method and stores it under winner variable */
					/* Below the first if statement is ran again to keep checking if theres not a winner */
					if (!"".equals(winner)) { /* Checks if not equal to winner */
						endTheGame(); /* Runs method endTheGame to end game */
					}
				}
				break; /* Stops the method running */
			}
		}
		if (winner.equals("X")) { /* Checks if variable winner is equal to X */
			score.setText("You Won!"); /* updates text of the JLabel score */
			gamesWon++; /* gamesWon integer will be increased by 1  */
			wins.setText("Won: " + gamesWon); /* Updates JLabel wins */
		} else if (winner.equals("O")) {  /* Checks if variable winner is equal to O */
			gamesLost++; /* gamesLost integer will be increased by 1  */
			score.setText("You Lost!"); /* updates text of the JLabel score */
			loses.setText("Lost: " + gamesLost); /* Updates JLabel loses */
		} else if (winner.equals("T")) { /* Checks if variable winner is equal to T */
			score.setText("Its A Tie"); /* updates text of the JLabel score */
		}
	}

	String lookForWinner() { /* New method called lookForWinner and stored as a String */
		
		String theWinner = ""; /* creates string called theWinner and sets text to blank */
		emptySquaresLeft--; /* Reduces emptySquaresLeft by 1 */
		
		/* Checks if square 0 is not equal to blank and square 0 grabs the text and checks if its 
		 * not equal to the text in square 1 and it grabs the text again 
		 * from square 0 and checks if its equal to square 2 and this method is repeated for all other methods of winning*/
		if (!squares[0].getText().equals("") && squares[0].getText().equals(squares[1].getText())
				&& squares[0].getText().equals(squares[2].getText())) {

			theWinner = squares[0].getText(); /* Updates string theWinner to text value of square 0 */
			highlightWinner(0, 1, 2); /* Heights the squares 0 and 1 and 2 and this is repeated for the rest of the methods */
		}

		if (!squares[3].getText().equals("") && squares[3].getText().equals(squares[4].getText())
				&& squares[3].getText().equals(squares[5].getText())) {

			theWinner = squares[3].getText();
			highlightWinner(3, 4, 5);
		}

		if (!squares[6].getText().equals("") && squares[6].getText().equals(squares[7].getText())
				&& squares[6].getText().equals(squares[8].getText())) {

			theWinner = squares[6].getText();
			highlightWinner(6, 7, 8);
		}

		if (!squares[0].getText().equals("") && squares[0].getText().equals(squares[3].getText())
				&& squares[0].getText().equals(squares[6].getText())) {

			theWinner = squares[0].getText();
			highlightWinner(0, 3, 6);
		}

		if (!squares[1].getText().equals("") && squares[1].getText().equals(squares[4].getText())
				&& squares[1].getText().equals(squares[7].getText())) {

			theWinner = squares[1].getText();
			highlightWinner(1, 4, 7);
		}

		if (!squares[2].getText().equals("") && squares[2].getText().equals(squares[5].getText())
				&& squares[2].getText().equals(squares[8].getText())) {

			theWinner = squares[2].getText();
			highlightWinner(2, 5, 8);
		}

		if (!squares[0].getText().equals("") && squares[0].getText().equals(squares[4].getText())
				&& squares[0].getText().equals(squares[8].getText())) {

			theWinner = squares[0].getText();
			highlightWinner(0, 4, 8);
		}

		if (!squares[2].getText().equals("") && squares[2].getText().equals(squares[4].getText())
				&& squares[2].getText().equals(squares[6].getText())) {

			theWinner = squares[2].getText();
			highlightWinner(2, 4, 6);
		}
		
		if ((emptySquaresLeft == 0)&&(theWinner.equals(""))){ /* Checks if empty squares are equal to 0 and theWinner is equal to blank */
			return "T"; /* Returns string */
		}


		return theWinner; /* Returns string theWinner */
	}

	void computerMove() { /* New method returns void */
		int selectedSquare; /* Creates integer called selectedSquare */
		selectedSquare = findEmptySquare("O"); /* Makes findEmprtySquare to value O equal to selectedSquare */
		
		if (selectedSquare == -1) { /* Sets selectedSquare equal to minus 1 */
			selectedSquare = findEmptySquare("X"); /* Makes findEmprtySquare to value X equal to selectedSquare */
		}
		if ((selectedSquare == -1) && (squares[4].getText().equals(""))) { /* Checks if selected square is equal to 
		minus 1 and square 4 in array is equal to blank then code below is ran */
			selectedSquare = 4; /* Sets selectedSquare to 4 */
		}
		if (selectedSquare == -1) { /* Checks if selected square is equal to minus 1 */
			selectedSquare = getRandomSquare(); /* Runs getRandomSquare and makes it equal to selectedSquare */
		}
		
		squares[selectedSquare].setText("O"); /* Sets text of current square in array selected as O */
		squares[selectedSquare].setEnabled(false); /* Sets current square in array to disabeld so can't click again */
	}

	int findEmptySquare(String player) { /* New method returns integer and stores a string parameter */
		int weight[] = new int[9];
		for (int i = 0; i < 9; i++) { /* For loop will run while i is less then i and will increase by 1 each time ran */
			if (squares[i].getText().equals("O")) { /* Checks if current squares are equal to O and if so runs code below */
				weight[i] = -1; /* Sets weight value to minus 1 */
			} else if (squares[i].getText().equals("X")) { /* Checks if current squares are equal to X and if so runs code below */
				weight[i] = 1; /* Sets weight value to 1 */
			} else { /* If non of the code above is ran */
				weight[i] = 0; /* Sets weight value to 0 */
			}
		}
		
		/* Method below checks if player is equal to O and if it is then value of 
		 * twoWeights is set to minus 2 and if not its set to 2 */
		int twoWeights = player.equals("O") ? -2 : 2;
		
		/* Checks if weight stored in array 0 and weight stored in array 1 and weight 
		 * stored in array 2 is equal to twoWeights value and if it is code below is ran */
		if (weight[0] + weight[1] + weight[2] == twoWeights) {
			if (weight[0] == 0) { /* Checks if weight array 0 is equal to 0 and if it is runs code below */
				return 0; /* Returns value 0 */
			} else if (weight[1] == 0) { /* Checks if weight array 1 is equal to 0 and if it is runs code below */
				return 1;  /* Returns value 1 */
			} else if (weight[2] == 0) { /* Checks if weight array 2 is equal to 0 and if it is runs code below */
				return 2; /* Returns value 2 */
			}
			/* Same method is ran but checking the differnt values in the array list weights */

		}

		if (weight[3] + weight[4] + weight[5] == twoWeights) {
			if (weight[3] == 0) {
				return 3;
			} else if (weight[4] == 0) {
				return 4;
			} else if (weight[5] == 0) {
				return 5;
			}
		}

		if (weight[6] + weight[7] + weight[8] == twoWeights) {
			if (weight[6] == 0) {
				return 6;
			} else if (weight[7] == 0) {
				return 7;
			} else if (weight[8] == 0) {
				return 8;
			}
		}

		if (weight[0] + weight[3] + weight[6] == twoWeights) {
			if (weight[0] == 0) {
				return 0;
			} else if (weight[3] == 0) {
				return 3;
			} else if (weight[6] == 0) {
				return 6;
			}
		}
		if (weight[1] + weight[4] + weight[7] == twoWeights) {
			if (weight[1] == 0) {
				return 1;
			} else if (weight[4] == 0) {
				return 4;
			} else {
				return 7;
			}
		}

		if (weight[2] + weight[5] + weight[8] == twoWeights) {
			if (weight[2] == 0) {
				return 2;
			} else if (weight[5] == 0) {
				return 5;
			} else {
				return 8;
			}
		}
		return -1; /* Returns value of minus 1 */
	}

	int getRandomSquare() { /* New method that returns an integer called getRandomSquare */
		boolean gotEmptySquare = false; /* creates boolean and sets value to false */
		int selectedSquare = -1; /* Creates integer and sets value to minus 1 */

		do { /* Created a do loop and this checks the condition after the code is ran so 
		one instance is ran before checking the while condition */
			selectedSquare = (int) (Math.random() * 9); /* Generates a random number and times it by 9 and 
			converts into an integer and stores in under selectedSquare */
			if (squares[selectedSquare].getText().equals("")) { /* Checks if the selected squares text is blank */
				gotEmptySquare = true; /* Sets value of gotEmptySquares to true */
			}
		} while (!gotEmptySquare); /* while loop runs code above with condition of if there is not  equal to gotEmptySquare*/

		return selectedSquare; /* Returns integer value of selectedSquare */
	}

	void highlightWinner(int win1, int win2, int win3) { /* New method called heightlightWinner takes in 3 integer as parameters */
		squares[win1].setBackground(Color.CYAN); /* Checks what square was selected and sets colour to Cyan */
		squares[win2].setBackground(Color.CYAN); /* Checks what square was selected and sets colour to Cyan */
		squares[win3].setBackground(Color.CYAN); /* Checks what square was selected and sets colour to Cyan */
	}

	void endTheGame() { /* New method to end the game */
		for (int i = 0; i < 9; i++) { /* For loop will run while i is less then i and will increase by 1 each time ran */
			squares[i].setEnabled(false); /* Disables all buttons */
		}
		newGameButton.setEnabled(true); /* Enables the newGameButton */
	}
}
