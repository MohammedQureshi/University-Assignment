package engine;

import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import screens.GameConstants;
import screens.PingPongGreenTable;

/**
 * 
 * This class is a mouse and keyboard listener. It calculates ball and racket
 * movements, changes their coordinates.
 */

/* Method below is the game engine and it implements Runnable, MouseMotionListener, KeyListener and the GameConstants */
public class PingPongGameEngine implements Runnable, MouseMotionListener, KeyListener, GameConstants {

	private PingPongGreenTable table; /* This is calling an instance of the PingPongGameTable so I can access it in this class */
	
	/* The two integers below are integers that ar equal to values from the GameConstants class */
	private int kidRacket_Y = KID_RACKET_Y_START;
	private int computerRacket_Y = COMPUTER_RACKET_Y_START;
	
	/* The four integers below are seperate integers that are used later on and have no set value and there there to sets the score
	 * for both the kid and computer and to store the balls x and y position*/
	private int kidScore; 
	private int computerScore;
	private int ballX;
	private int ballY;
	
	/* THe two booleans below are to check if the ball is moving left and if it has been served */
	private boolean movingLeft = true;
	private boolean ballServed = false;
	
	/* The integer below is there to set an int value of verticalSlide later on in the code */
	private int verticalSlide;

	public PingPongGameEngine(PingPongGreenTable greenTable) { /* This method is a constructor that 
	takes in an instance of the PingPongGreenTable class */
		table = greenTable; /* This makes the variable table equal to greenTable that we get from the method being called */
		Thread worker = new Thread(this); /* This creates a thread called worker */
		worker.start(); /* This starts the worker thread */
	}

	public void mouseDragged(MouseEvent e) { /* This method checks if the mouse is Dragged and runs code below */
		/* This is in place so I can use it if needed but not required at the moment */
	}

	public void mouseMoved(MouseEvent e) { /* This method checks if the mouse is moved */
		int mouse_Y = e.getY(); /* This stores the mouses y coordinates as an integer */
		if (mouse_Y < kidRacket_Y && kidRacket_Y > TABLE_TOP) {
			kidRacket_Y -= RACKET_INCREMENT;
		} else if (kidRacket_Y < TABLE_BOTTOM) {
			kidRacket_Y += RACKET_INCREMENT;
		}
		table.setKidRacket_Y(kidRacket_Y);
	}

	public void keyPressed(KeyEvent e) {
		char key = e.getKeyChar();
		if ('n' == key || 'N' == key) {
			startNewGame();
		} else if ('q' == key || 'Q' == key) {
			endGame();
		} else if ('s' == key || 'S' == key) {
			kidServe();
		}
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public void startNewGame() {
		computerScore = 0;
		kidScore = 0;
		table.setMessageText("Score Computer: 0 Kid: 0");
		kidServe();
	}

	public void endGame() {
		System.exit(0);
	}

	public void run() {
		boolean canBounce = false;
		while (true) {
			if (ballServed) {
				if (movingLeft && ballX > BALL_MIN_X) {
					canBounce = (ballY >= computerRacket_Y && ballY < (computerRacket_Y + RACKET_LENGTH) ? true : false);
					ballX -= BALL_INCREMENT;
					ballY -= verticalSlide;
					table.setBallPosition(ballX, ballY);
					if (ballX <= COMPUTER_RACKET_X && canBounce) {
						movingLeft = false;
					}
				}
				if (!movingLeft && ballX <= BALL_MAX_X) {
					canBounce = (ballY >= kidRacket_Y && ballY < (kidRacket_Y + RACKET_LENGTH) ? true : false);
					ballX += BALL_INCREMENT;
					table.setBallPosition(ballX, ballY);
					if (ballX >= KID_RACKET_X && canBounce) {
						movingLeft = true;
					}
				}

				if (computerRacket_Y < ballY && computerRacket_Y < TABLE_BOTTOM) {
					computerRacket_Y += RACKET_INCREMENT;

				} else if (computerRacket_Y > TABLE_TOP) {
					computerRacket_Y -= RACKET_INCREMENT;
				}

				table.setComputerRacket_Y(computerRacket_Y);

				try {
					Thread.sleep(SLEEP_TIME);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (isBallOnTheTable()) {

					if (ballX > BALL_MAX_X) {
						computerScore++;
						displayScore();
					} else if (ballX < BALL_MIN_X) {
						kidScore++;
						displayScore();

					}

				}

			}
		}
	}
	
	private void kidServe() { /* This method is ran when the kid is serving such as the player */
		ballServed = true; /* This will equal true to show the ball has been served */
		ballX = KID_RACKET_X; /* This sets the ballX value to the KID_RACKET_X value */
		ballY = kidRacket_Y; /* This sets the ballY value to the KidRacket_Y value */
		if (ballY > TABLE_HEIGHT / 2) { /* This checks if the ballY is greater then TABLE_HEIGHT divided by two */
			verticalSlide = -1; /* If the statement above is true then sets verticalSlide to minus 1 */
		} else { /* This is ran if the above statement is not met */
			verticalSlide = 1; /* If the if statmeent is not met it will set verticalSlide to 1 */
		}
		table.setBallPosition(ballX, ballY); /* This method is ran to set the balls position on the table */
		table.setKidRacket_Y(kidRacket_Y); /* This is ran to set the Y position of the kids racket on the table */
	}

	private void displayScore() { /* This method is desighed to display the score */
		ballServed = false; /* Sets the boolean ballServed to false */
		if (computerScore == WINNING_SCORE) { /* Checks if the computers score is equal to the winning score */
			/* If statement above is true it will set the table to set the messageText as below. */
			table.setMessageText("Computer won! " + computerScore + ":" + kidScore);
		} else if (kidScore == WINNING_SCORE) { /* This will check if the kidScore is equal to the Winnig score */
			/* If the statement above is true it will set the tables message to the one below */
			table.setMessageText("You won! " + kidScore + ":" + computerScore);
		} else { /* This will run if both statements above are not met */
			/* Method below will set the tables message to the current computers and kids scores */
			table.setMessageText("Computer: " + computerScore + " Kid: " + kidScore);
		}
	}

	private boolean isBallOnTheTable() { /* This method is designed to check if the ball is still on the table */
		if (ballY >= BALL_MIN_Y && ballY <= BALL_MAX_Y) { /* This checks if ballY is greater then or equal to BALL_MIN_Y so 
		the minimum value of Y and also it checks if ballY is less then or equal to BALL_MAX_Y and this is basically
		the max Y value of the ball. */
			return true; /* If the method above is true it will return true */
		} else { /* Ran if the first if statment is false */
			return false; /* If the method below is false it will return false */
		}

	}
}
