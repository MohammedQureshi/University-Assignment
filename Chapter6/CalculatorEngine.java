package Chapter6;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener { /* Creating class and implementing action listener */
	
	Calculator parent; /* Reference to Calculator Window */
	char selectedAction = ' '; /* +, -, /, or * or % */
	double currentResult = 0; /* Stores the current results */

	/* Constructor stores the reference to the Calculator
	 * window in the member variable parent */
	CalculatorEngine(Calculator parent) { /* Takes in reference to Calculator */
		this.parent = parent; /* Stores reference in variable parent */
	}

	public void actionPerformed(ActionEvent e) { /* Setting up action Listener and taking an event in */

		JButton clickedButton = (JButton) e.getSource(); /* Storing the button that was clicked */
		String dispFieldText = parent.displayField.getText(); /* Stores the current text in the displayField in a string */
		double displayValue = 0; /* Stores the display value within a double called displayValue */

		if (!"".equals(dispFieldText)) { /* Checks if not blank string is equal to the display Field Text */
			displayValue = Double.parseDouble(dispFieldText); /* Makes the dispFieldText from a string to a double */
		}
		
		Object src = e.getSource(); /* Stores the e.getSource in an object called src and we get 
		the source so we know whats pressed */

		if (src == parent.buttonPlus) { /* Checks if the plus button is pressed */
			selectedAction = '+'; /* Sets the selected action to the plus symbol */
			currentResult = displayValue; /* stores the displayValue under current Result */
			parent.displayField.setText(""); /* Sets the textbox to blank so another number can be entered */

		} else if (src == parent.buttonMinus) { /* Checks if a minus button is pressed */
			selectedAction = '-'; /* Sets the selected action to the minus symbol */
			currentResult = displayValue; /* stores the displayValue under current Result */
			parent.displayField.setText(""); /* Sets the textbox to blank so another number can be entered */

		} else if (src == parent.buttonDivide) { /* Checks if the divide button is pressed */
			selectedAction = '/'; /* Sets the selected action to the divide symbol */
			currentResult = displayValue; /* stores the displayValue under current Result */
			parent.displayField.setText(""); /* Sets the textbox to blank so another number can be entered */

		} else if (src == parent.buttonMultiply) { /* Checks if multiply button is pressed */
			selectedAction = '*'; /* Sets the selected action to the multiply symbol */
			currentResult = displayValue; /* stores the displayValue under current Result */
			parent.displayField.setText(""); /* Sets the textbox to blank so another number can be entered */

		} else if (src == parent.buttonEqual) { /* Checks if equals button is pressed */
			
			/* This will look at what action was selected and then perform the calculation that is 
			 * required and update the display field */

			if (selectedAction == '+') { /* This checks if the selected action was a plus */
				currentResult += displayValue; /* Makes currentResult equal to currentResult + displayValue */
				parent.displayField.setText("" + currentResult); /* Converts result into string by concatenating to 
				an empty string and then displaying it */

			} else if (selectedAction == '-') { /* This checks if the selected action was a minus */
				currentResult -= displayValue; /* This makes current result equal to current result minus displayValue */
				parent.displayField.setText("" + currentResult);/* Converts result into string by concatenating to 
				an empty string and then displaying it */
				
			} else if (selectedAction == '/') { /* This checks if the selected action was a divide */
				currentResult /= displayValue; /* This makes current result equal to current result divided by displayValue */
				parent.displayField.setText("" + currentResult);/* Converts result into string by concatenating to 
				an empty string and then displaying it */
				
			} else if (selectedAction == '*') { /* This checks if the selected action was a multiply */
				currentResult *= displayValue; /* This makes current result equal to current result times displayValue */
				parent.displayField.setText("" + currentResult);/* Converts result into string by concatenating to 
				an empty string and then displaying it */
				
			} else if (selectedAction == '%') { /* This checks if the selected action was a percentage */
				currentResult = (currentResult * displayValue) / 100; /* This makes currentResult equal 
				to currentResult times display value and then thats value to be divided by 100 to get to overall percentage */
				parent.displayField.setText("" + currentResult); /* Sets the text box to the result */

			}

		} else if (src == parent.clearCurrent) { /* This checks if the clearCurrent button is pressed meaning the CE button */
			parent.displayField.setText(""); /* If it is then the current value in the text box is cleared */
		} else if (src == parent.clearAll) { /* This checks if the clear all button is pressed such as the C button */
			parent.displayField.setText(""); /* Sets the display field to blank */
			currentResult = 0; /* Sets the stored value to 0 so its starts fresh */
			
		} else if (src == parent.squareRoot) { /* This checks if the square root button is pressed */
			currentResult = Math.sqrt(displayValue); /* This sets current result equal to the square root
			of the displayValue and does this using the Maths.sqrt functions that java already has */
			parent.displayField.setText("" + currentResult); /* This displays the result */
		} else if (src == parent.OneOverX) { /* Checks if OneOverX button is pressed */
			currentResult = 1 / displayValue; /* Sets currentResult equal to 1 divided by display 
			Value so you can get 1 over X */
			parent.displayField.setText("" + currentResult); /* This displays the result */
		} else if (src == parent.percentage) { /* Checks if percentage button is pressed */
			selectedAction = '%'; /* Sets the selectedAction to % so it works with the equals button */
			currentResult = displayValue; /* Makes the currentResult equal to the displayValue to use later */
			parent.displayField.setText(""); /* Sets the text box to blank for next number */
		}else if(src == parent.backSpace) { /* Checks if backspace button is pressed */
			if(!parent.displayField.getText().isEmpty()) { /* Checks if text box is not empty */
				parent.displayField.setText(""+parent.displayField.getText().substring(0, parent.displayField.getText ().length() - 1));				
			}else{ /* If it is empty it will run the following */
				parent.displayField.setText(""); /* It just sets the text box to blank and 
				this is done to prevent an error occurring as it wouldest of knew what to do*/
			}
		} else if (src == parent.plusMinus) { /* This checks if the plus and minus button is pressed */
			/* The method below does not run the method when the 0 is in the box as having minus 0 and 0 is the same value */
			if (displayValue > 0) { /* This checks if the value is larger then 0 */
				parent.displayField.setText("-" + displayValue); /* Adds a minus to the result by adding it in the text box */
			} else if (displayValue < 0) { /* Checks if the value of less then 0 */
				displayValue = Math.abs(displayValue); /* Converts the number into a positive value */
				parent.displayField.setText("" + displayValue); /* Sets the text box to the result */
			}
		} else { /* Runs this is non of the above is ran */
			String clickedButtonLabel = clickedButton.getText(); /* Stores the text from clickedButton in a String called
			clickedButtonLabel */
			parent.displayField.setText(dispFieldText + clickedButtonLabel); /* Sets the text to the 
			dispFieldText plus the clickedButtonLabel */
		}
	
	}
}
