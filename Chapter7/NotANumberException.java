package Chapter7;

import javax.swing.JOptionPane;

public class NotANumberException extends Exception {

	/**
	 * Mohammed Faisal Qureshi
	 */
	private static final long serialVersionUID = 1L; /* This just add a custom serial version to the program to identify it */

	NotANumberException() { /* This is the exception constructor that is ran */
		super("Sorry Not A Number!"); /* This will print off custom text to the console */
		JOptionPane.showMessageDialog(null, "Sorry, Not a Number!", "Wrong Input", JOptionPane.ERROR_MESSAGE);
		/* Above line of code will show a text box with the message "Sorry, Not a Number" */
	}

}


