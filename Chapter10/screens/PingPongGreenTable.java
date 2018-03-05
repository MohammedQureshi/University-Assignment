package screens;

import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

import javax.swing.WindowConstants;
import java.awt.Dimension;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Color;

import engine.PingPongGameEngine;

/**
 * This class paints the green ping pong table, ball, rackets and displays the
 * score
 */
public class PingPongGreenTable extends JPanel implements GameConstants {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel label; /* Creating a JLabel called label with no value */

	private int computerRacket_Y = COMPUTER_RACKET_Y_START; /* Creating private integer to be equal to values from GameConstants class */
	private int kidRacket_Y = KID_RACKET_Y_START; /* Creating private integer to be equal to values from GameConstants class */
	private int ballX = BALL_START_X; /* Creating private integer to be equal to values from GameConstants class */
	private int ballY = BALL_START_Y; /* Creating private integer to be equal to values from GameConstants class */

	Dimension preferredSize = new Dimension(TABLE_WIDTH, TABLE_HEIGHT); /* Creating new dimensions that can be 
	used to create a frame size */
	
	public Dimension getPreferredSize() { /* This method is designed to get the value of the preferredSize */
		return preferredSize; /* This will return the value of the preferedSize */
	}

	PingPongGreenTable(){ /* This is called when an instance of the object is created its called a consturctor*/
		PingPongGameEngine gameEngine = new PingPongGameEngine(this); /* Creates an object for the PingPongGameEngine class */
		addMouseMotionListener(gameEngine); /* Adds a MuseMotionListener to listen for when the mouse moves */
		addKeyListener(gameEngine); /* Adds a KeyListener to listen when keys are pressed on the keyboard. */
	}

	/* The method below is used to add panels you have created to the main frame called container */
	void addPaneltoFrame(Container container) {
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS)); /* Setting the layout of the container to boxLayout */
		container.add(this); /* This add the methods container to the main container such as when the method is called */
		label = new JLabel("Press N for a new game, S to serve or Q to quit"); /* This adds a string into the JLabel label */
		container.add(label); /* This adds the label to the container */
	}

	public void paintComponent(Graphics g) { /* This method is used to draw graphics */
		super.paintComponent(g);  /* This paints the components */
		g.setColor(Color.GREEN); /* Sets the grapic colour of g to green */
		g.fillRect(0, 0, TABLE_WIDTH, TABLE_HEIGHT); /* Sets how much of the rectangle shoudl be filled */

		g.setColor(Color.YELLOW); /* Sets the colour of g to yellow */
		g.fillRect(KID_RACKET_X, kidRacket_Y, RACKET_WIDTH, RACKET_LENGTH); /* Fills the whole racket from left top to bottom right */

		g.setColor(Color.BLUE); /* This sets the colour of g to blue */
		g.fillRect(COMPUTER_RACKET_X, computerRacket_Y, RACKET_WIDTH, RACKET_LENGTH); /* This fill in the computers racket colour */

		g.setColor(Color.RED); /* This sets the colour of g to red */
		g.fillOval(ballX, ballY, 10, 10); /* This fills an oval such as the ball and sets 
		the size 10 by 10 and fikll the ball left top to bottom right */
		
		g.setColor(Color.WHITE); /* This sets the colour of g to white */
		g.drawRect(10, 10, 300, 200); /* This draws a rectangle at the set size and set location */
		g.drawLine(160, 10, 160, 210); /* This draws a line at set location with set height and width */

		requestFocus(); /* Runs the requestFocus build in method to focus the application */
	}

	public void setKidRacket_Y(int yCoordinate) { /* Sets the coordinates of the kids racket in the y position */
		this.kidRacket_Y = yCoordinate; /* Makes kidRacketY equal to yCoordiantes that were given by the method */
		repaint(); /* Runs built in repaint method to update the display */
	}

	public int getKidRacket_Y() { /* Gets the Y value of the kids racket */
		return kidRacket_Y; /* Returns the kidRacket_Y when the method is called  */
	}

	public void setComputerRacket_Y(int yCoordinate) { /* Setter method that takes in an integer */
		this.computerRacket_Y = yCoordinate; /* Makes computerRacket_Y equal to the yCoordinate it gets from the method */
		repaint(); /* Runs repaint built in method */

	}
	
	public void setMessageText(String text) { /* This method is designed to update the 
	text in the label and update it using the users input */
		label.setText(text); /* This line sets the JLabel label text to the text the user has inputted */
		repaint(); /* This runs the repaint method to update the display. */
	}

	public void setBallPosition(int xPos, int yPos) { /* This method sets the ball position and takes in two integer for x and y */
		ballX = xPos; /* This sets the ballX value to the xPos integer it got from the method being called */
		ballY = yPos; /* This sets the ballY value to the yPos integer it got from the method being called */
		repaint(); /* Runs built in repaint method */
	}

	public static void main(String[] args) { /* Main method that is ran first */
		JFrame f = new JFrame("Ping Pong Green Table"); /* Creates an instance of a JFrame and gives it a title */
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); /* Sets the application to close when the exit button is pressed */
		PingPongGreenTable table = new PingPongGreenTable(); /* Creates an object for the PingPongGreenTable class the one were in */
		table.addPaneltoFrame(f.getContentPane()); /* Runs the addPaneltoFrame method for the table above */
		f.setBounds(0, 0, TABLE_WIDTH + 5, TABLE_HEIGHT + 40); /* Sets the bounds of the JFrame */
		f.setVisible(true); /* Sets the frame to be visiable when ran */

	}

}
