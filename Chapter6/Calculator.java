package Chapter6;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Calculator { /* Creating class called Calculator */

	JButton button0 = new JButton("0"); /* Declares and Creates the Button 0 */
	JButton button1 = new JButton("1"); /* Declares and Creates the Button 1*/
	JButton button2 = new JButton("2"); /* Declares and Creates the Button 2 */
	JButton button3 = new JButton("3"); /* Declares and Creates the Button 3 */
	JButton button4 = new JButton("4"); /* Declares and Creates the Button 4 */
	JButton button5 = new JButton("5"); /* Declares and Creates the Button 5 */
	JButton button6 = new JButton("6"); /* Declares and Creates the Button 6 */
	JButton button7 = new JButton("7"); /* Declares and Creates the Button 7 */
	JButton button8 = new JButton("8"); /* Declares and Creates the Button 8 */
	JButton button9 = new JButton("9"); /* Declares and Creates the Button 9 */

	JButton buttonPoint = new JButton("."); /* Declares and Creates the Button Decimal */
	JButton buttonEqual = new JButton("="); /* Declares and Creates the Button Equals*/
	JButton buttonPlus = new JButton("+"); /* Declares and Creates the Button Plus */
	JButton buttonMinus = new JButton("-"); /* Declares and Creates the Button Subtract */
	JButton buttonDivide = new JButton("\u00F7"); /* Declares and Creates the Button Divide and uses Unicode */
	JButton buttonMultiply = new JButton("\u00D7"); /* Declares and Creates the Button Multiply and uses Unicode*/
	
	JButton backSpace = new JButton("\u2190"); /* Declares and Creates the Button Backspace and uses Unicode*/
	JButton clearCurrent = new JButton("CE"); /* Declares and Creates the Button CE meaning Clear Entity */
	JButton clearAll = new JButton("C"); /* Declares and Creates the Button C that resets the application */
	JButton squareRoot = new JButton("\u221A"); /* Declares and Creates the Button square root and using Unicode */
	JButton OneOverX = new JButton("1/x"); /* Declares and Creates the Button for 1 over X */
	JButton percentage = new JButton("%"); /* Declares and Creates the Button for Percentage */
	JButton plusMinus = new JButton("+/-"); /* Declares and Creates the Button for Plus and Minus numbers */

	JPanel windowContent = new JPanel(); /* Creates a new JPanel Called windowContent to store everything in */

	JTextField displayField = new JTextField(30); /* Created a Text Field called displayField */

	Calculator() { /* Constructor */
		
		BorderLayout bl = new BorderLayout(); /* Creating a BorderLayout */
		windowContent.setLayout(bl); /* Sets the layout of the windowContent to the borderLayout */

		displayField.setFont(displayField.getFont().deriveFont(20f)); /* Sets the displayFields text to size 20 for easier viewing */
		windowContent.add("North", displayField); /* Adds the displayField to the top of the window */
		
		JPanel panelOne = new JPanel(); /* Another JPanel to store the numbers and decimal and backspace and minus and plus button */
		GridBagConstraints GBC = new GridBagConstraints(); /* Creating the GridBagContraints layout */
		panelOne.setBackground(new Color(25, 150, 225)); /* Sets the background colour to a light blue */
		panelOne.setLayout(new GridBagLayout()); /* Sets the new panels layout to the GridBagLayout */
		GBC.weightx = 1; /* Sets weight to the maximum it can be for X */
		GBC.weighty = 1; /* Sets weight to the maximum it can be for Y */
		GBC.insets = new Insets(3,3,3,3); /* Used to add spaces between the buttons */
		GBC.fill = GridBagConstraints.BOTH; /* Fills the grid with the buttons on the vertical and horizontal axes */
		
		//Row 1
		GBC.gridx = 0; /* Setting the X position to 0 */
		GBC.gridy = 0; /* Setting the Y position to 0 */
		GBC.gridwidth = 2; /* Setting the width of the button to 2 spaces */
		panelOne.add(backSpace, GBC); /* Adds the button to the panel and applies the GridBagConstraints */
		
		//Row2
		GBC.gridx = 0; /* Setting the X position to 0 */
		GBC.gridy = 1; /* Setting the Y position to 1 */
		GBC.gridwidth = 1; /* Setting the width of the button to 1 spaces */
		panelOne.add(button7, GBC); /* Adds button to panelOne */
		GBC.gridx = 1; /* Setting the X position to 1 */
		GBC.gridy = 1; /* Setting the Y position to 1 */
		GBC.gridwidth = 1; /* Setting the width of the button to 2 spaces */
		panelOne.add(button8, GBC); /* Adds button to panelOne */
		GBC.gridx = 2; /* Setting the X position to 2 */
		GBC.gridy = 1; /* Setting the Y position to 1 */
		GBC.gridwidth = 1; /* Setting the width of the button to 2 spaces */
		panelOne.add(button9, GBC); /* Adds button to panelOne */
		
		//Row 3
		GBC.gridx = 0; /* Setting the X position to 0 */
		GBC.gridy = 2; /* Setting the Y position to 2 */
		GBC.gridwidth = 1; /* Setting the width of the button to 2 spaces */
		panelOne.add(button4, GBC); /* Adds button to panelOne */
		GBC.gridx = 1; /* Setting the X position to 1 */
		GBC.gridy = 2; /* Setting the Y position to 2 */
		GBC.gridwidth = 1; /* Setting the width of the button to 2 spaces */
		panelOne.add(button5, GBC); /* Adds button to panelOne */
		GBC.gridx = 2; /* Setting the X position to 2 */
		GBC.gridy = 2; /* Setting the Y position to 2 */
		GBC.gridwidth = 1; /* Setting the width of the button to 2 spaces */
		panelOne.add(button6, GBC); /* Adds button to panelOne */
		
		//Row 4
		GBC.gridx = 0; /* Setting the X position to 0 */
		GBC.gridy = 3; /* Setting the Y position to 3 */
		GBC.gridwidth = 1; /* Setting the width of the button to 2 spaces */
		panelOne.add(button1, GBC); /* Adds button to panelOne */
		GBC.gridx = 1; /* Setting the X position to 1 */
		GBC.gridy = 3; /* Setting the Y position to 3 */
		GBC.gridwidth = 1; /* Setting the width of the button to 2 spaces */
		panelOne.add(button2, GBC); /* Adds button to panelOne */
		GBC.gridx = 2; /* Setting the X position to 2 */
		GBC.gridy = 3; /* Setting the Y position to 3 */
		GBC.gridwidth = 1; /* Setting the width of the button to 2 spaces */
		panelOne.add(button3, GBC); /* Adds button to panelOne */
		
		//Row 5
		GBC.gridx = 0; /* Setting the X position to 0 */
		GBC.gridy = 4; /* Setting the Y position to 4 */
		GBC.gridwidth = 1; /* Setting the width of the button to 2 spaces */
		panelOne.add(button0, GBC); /* Adds button to panelOne */
		GBC.gridx = 1; /* Setting the X position to 1 */
		GBC.gridy = 4; /* Setting the Y position to 4 */
		GBC.gridwidth = 1; /* Setting the width of the button to 2 spaces */
		panelOne.add(plusMinus, GBC); /* Adds button to panelOne */
		GBC.gridx = 2; /* Setting the X position to 2 */
		GBC.gridy = 4; /* Setting the Y position to 4 */
		GBC.gridwidth = 1; /* Setting the width of the button to 2 spaces */
		panelOne.add(buttonPoint, GBC); /* Adds button to panelOne */

		windowContent.add("Center", panelOne); /* Adds panelOne to the centre of the windowContent */

		GridLayout gl = new GridLayout(5, 2, 3, 3); /* Creates a grid panel of 5 by 2 with the padding of 3 on the height and width */
		JPanel panelTwo = new JPanel(); /* Crates a new JPanel called panelTwo */
		panelTwo.setBackground(new Color(25, 150, 225)); /* Sets background colour to a light blue */
		panelTwo.setLayout(gl); /* Sets panelTwo layout to the GridLayout */
		
		//Row 1
		panelTwo.add(clearAll);  /* Adds button to panelTwo */
		panelTwo.add(clearCurrent); /* Adds button to panelTwo */
		
		//Row 2
		panelTwo.add(buttonDivide); /* Adds button to panelTwo */
		panelTwo.add(squareRoot); /* Adds button to panelTwo */

		//Row 3
		panelTwo.add(buttonMultiply); /* Adds button to panelTwo */
		panelTwo.add(OneOverX); /* Adds button to panelTwo */

		//Row 4
		panelTwo.add(buttonMinus); /* Adds button to panelTwo */
		panelTwo.add(percentage); /* Adds button to panelTwo */
		
		//Row 5
		panelTwo.add(buttonPlus); /* Adds button to panelTwo */
		panelTwo.add(buttonEqual); /* Adds button to panelTwo */

		windowContent.add("East", panelTwo); /* This adds the panelTwo to the windowContent in the East direction */

		JFrame frame = new JFrame("Calculator"); /* Sets up the JFrame and adds the name "Calculator" to it */
		frame.setContentPane(windowContent); /* Sets the content pane to the windowContent as we have added everything to the 
		windowsContent so it can just access it from there */
		frame.setPreferredSize(new Dimension(500, 500)); /* Sets the preferred size of the window and it will set it
		to this size of everything fits in the frame*/
		frame.pack(); /* Makes the frame is big enough to fit everything inside */
		frame.setResizable(false); /* Prevents resizing the window and this stops buttons not showing text when to small*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* Sets what the program should do when the x button 
		is pressed and in this case the program will just exit when the x on the window is pressed */
		frame.setVisible(true); /* Sets JFrame to viable so the user can see it */

		CalculatorEngine calcEngine = new CalculatorEngine(this); /* Sets up an object for the 
		CalculatorEngine so we can access it */

		button0.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		button1.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		button2.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		button3.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		button4.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		button5.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		button6.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		button7.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		button8.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		button9.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */

		buttonPoint.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		buttonPlus.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		buttonMinus.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		buttonDivide.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		buttonMultiply.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		buttonEqual.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		
		clearAll.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		clearCurrent.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		squareRoot.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		OneOverX.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		percentage.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		plusMinus.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */
		backSpace.addActionListener(calcEngine); /* Adds actionListener to the button and gets 
		information on what to do when pressed from the CalculatorEngine class */

	}

	public static void main(String[] args) {
		/* Calculator calc = new Calculator(); /* Not required as we don't need to access it */
		new Calculator(); /* Sets up an Instantiate of the class Calculator */
	}
}
