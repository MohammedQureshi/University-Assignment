package Chapter7;

import javax.swing.JOptionPane;

public class ZeroDivisionException extends Exception{
	
	/**
	 * Mohammed Faisal Qureshi
	 */
	private static final long serialVersionUID = 1L; /* This just add a custom serial version to the program to identify it */

	ZeroDivisionException(String ErrorMessage){ /* This is the exception constructor that is ran and takes in a 
	String called ErrorMessage for a custom message*/
		super(ErrorMessage); /* This will read the error message taken in and print it to the console */ 
		JOptionPane.showMessageDialog(null, "Can't Divide by 0", "Zero Division Error", JOptionPane.ERROR_MESSAGE);
		/* Above line of code will show a text box with the message "Zero Division Error" */
	}

}


