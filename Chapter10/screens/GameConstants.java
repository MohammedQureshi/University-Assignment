package screens;

public interface GameConstants {

	/* The 4 intergers below are to sets the width and 
	 * height of the frame and the top and the bottom of the 
	 * table and they are all final as you are not able to change them */
	public final int TABLE_WIDTH = 320;
	public final int TABLE_HEIGHT = 220;
	public final int TABLE_TOP = 12;
	public final int TABLE_BOTTOM = 180;

	/* The final integer below sets the balls movement such as how fast it moves */
	public final int BALL_INCREMENT = 4;

	/* The final integers below makes the balls min of y and x equal to 1 plus the balls increment */
	public final int BALL_MIN_X = 1 + BALL_INCREMENT;
	public final int BALL_MIN_Y = 1 + BALL_INCREMENT;
	
	/* The final integers below makes the balls max of y and x equal to the tables width and height minus the balls increment */
	public final int BALL_MAX_X = TABLE_WIDTH - BALL_INCREMENT;
	public final int BALL_MAX_Y = TABLE_HEIGHT - BALL_INCREMENT;

	/* The two final intergers below sets the x and y start position of the ball 
	 * and sets it by diving the tables width and height by two */
	public final int BALL_START_X = TABLE_WIDTH / 2;
	public final int BALL_START_Y = TABLE_HEIGHT / 2;
	
	/* Method below sets the KID_RACKET_X to 300 */
	public final int KID_RACKET_X = 300;
	
	/* The method below sets the y starting position of the kids racket */
	public final int KID_RACKET_Y_START = 100;
	
	/* method below sets the COMPUTER_RACKET_X equal to 15 */
	public final int COMPUTER_RACKET_X = 15;

	/* The integer below sets the y starting position to 100 */
	public final int COMPUTER_RACKET_Y_START = 100;
	
	/* The two final integers below set the racke to increment to 2 and also the length of the racket to 30 */
	public final int RACKET_INCREMENT = 2;
	public final int RACKET_LENGTH = 30;

	public final int RACKET_WIDTH = 5;
	
	/* The integer below sets the winning score to 21 */
	public final int WINNING_SCORE = 21;

	/* The integer below sets the Sleep time to 10 */
	public final int SLEEP_TIME = 10;
}
