package Chapter5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator { /* Setting up the class and calling it Calculator */

	JPanel windowContent; /* Created a JPanel to store all my components inside */
	JTextArea textField; /* Creating a text field I can use later on to add text to and store text from */
	JButton zero; /* Setting up a button as the 0 Button */
	JButton one; /* Setting up a button as the 1 Button */
	JButton two; /* Setting up a button as the 2 Button */
	JButton three; /* Setting up a button as the 3 Button */
	JButton four; /* Setting up a button as the 4 Button */
	JButton five; /* Setting up a button as the 5 Button */
	JButton six; /* Setting up a button as the 6 Button */
	JButton seven; /* Setting up a button as the 7 Button */
	JButton eight; /* Setting up a button as the 8 Button */
	JButton nine; /* Setting up a button as the 9 Button */
	JButton plus; /* Creating a button to use as the plus button */
	JButton subtract; /* Creating a button to use as the subtract button */
	JButton times; /* Creating a button to use as the times button */
	JButton divide; /* Creating a button to use as the divide button */
	JButton decimal; /* Creating a button to use as the decimal button */
	JButton equal; /* Creating a button to use as the equals button */
	JButton clear; /* Creating a button that clears the calculator */ 
	JLabel p1; /* Placeholder used for design placemented and later improvements */
	JLabel p2; /* Placeholder used for design placemented and later improvements */
	JLabel p3; /* Placeholder used for design placemented and later improvements */
	JPanel panel; /* Extra panel to use different layout */

	
	boolean adding; /* Creating boolean to check what function we are using such as adding */
	boolean subtracting; /* Creating boolean to check what function we are using such as subtracting */
	boolean timesing; /* Creating boolean to check what function we are using such as timesing */
	boolean dividing; /* Creating boolean to check what function we are using such as dividing */
	
	double num1; /* Creates a double called num1 */
	double num2; /* Creates a double called num2 */
	
	Calculator(){ /* Calling the calculator class */
		windowContent = new JPanel(); /* Declaring a new JPanel called windowContent */
		BorderLayout boarderLayout = new BorderLayout(); /* Creates a new border layout for the JPanel */
		windowContent.setLayout(boarderLayout); /* Adds the border layout to the windowsContent frame */
		textField = new JTextArea(); /* Creates a text area to use to show actions */
		windowContent.add("North", textField); /* Adds the text field to the panel windowsConent and puts it at the top */
		
		zero = new JButton("0"); /* Declares button and adds text called 0 */
		zero.addActionListener( /* Declares an action listener for the button */
				new ActionListener() { /* Declares a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						textField.append("0"); /* Adds text to box showing 0 */
					}	
				}
			);
		
		one = new JButton("1"); /* Declares button and adds text called 1 */
		one.addActionListener( /* Declares an action listener for the button */
				new ActionListener() { /* Declares a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						textField.append("1"); /* Adds text to box showing 1 */
					}	
				}
			);
		
		two = new JButton("2"); /* Declares button and adds text called 2 */
		two.addActionListener( /* Declares an action listener for the button */
				new ActionListener() { /* Declares a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						textField.append("2"); /* Adds text to box showing 2 */
					}	
				}
			);
		
		three = new JButton("3"); /* Declares button and adds text called 3 */
		three.addActionListener( /* Declares an action listener for the button */
				new ActionListener() { /* Declares a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						textField.append("3"); /* Adds text to box showing 3 */
					}	
				}
			);
		
		four = new JButton("4"); /* Declairs button and adds text called 4 */
		four.addActionListener( /* Declairs an action listener for the button */
				new ActionListener() { /* Declairs a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						textField.append("4"); /* Adds text to box showing 4 */
					}	
				}
			);
		
		five = new JButton("5"); /* Declairs button and adds text called 5 */
		five.addActionListener( /* Declairs an action listener for the button */
				new ActionListener() { /* Declairs a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						textField.append("5"); /* Adds text to box showing 5 */
					}	
				}
			);
		six = new JButton("6"); /* Declairs button and adds text called 6 */
		six.addActionListener( /* Declairs an action listener for the button */
				new ActionListener() { /* Declairs a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						textField.append("6"); /* Adds text to box showing 6 */
					}	
				}
			);
		seven = new JButton("7"); /* Declairs button and adds text called 7 */
		seven.addActionListener( /* Declairs an action listener for the button */
				new ActionListener() { /* Declairs a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						textField.append("7"); /* Adds text to box showing 7 */
					}	
				}
			);
		eight = new JButton("8"); /* Declairs button and adds text called 8 */
		eight.addActionListener( /* Declairs an action listener for the button */
				new ActionListener() { /* Declairs a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						textField.append("8"); /* Adds text to box showing 8 */
					}	
				}
			);
		nine = new JButton("9"); /* Declairs button and adds text called 9 */
		nine.addActionListener( /* Declairs an action listener for the button */
				new ActionListener() { /* Declairs a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						textField.append("9"); /* Adds text to box showing 9 */
					}	
				}
			);
		decimal = new JButton("."); /* Declairs button and adds text with decimal sign*/
		decimal.addActionListener( /* Declairs an action listener for the button */
				new ActionListener() { /* Declairs a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						textField.append("."); /* Adds text to box showing decmial point */
					}	
				}
			);
		equal = new JButton("="); /* Declairs button and adds text with equals sign*/
		equal.addActionListener( /* Declairs an action listener for the button */
				new ActionListener() { /* Declairs a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						num2 = Double.parseDouble(textField.getText());/* Converts text in the textField into a 
						Double and stores it under num2 for the second value */
						if(adding) { /* Checks if adding is equal to true */
							String answer = String.valueOf(num1 + num2); /* Converts the result of num1 + num2 into 
							a String to add to the text box */
							textField.setText(answer); /* Sets the textbox to display the result stored */							
						}
						if(subtracting) { /* Checks if subtracting is equal to true */
							String answer = String.valueOf(num1 - num2); /* Converts the result of num1 - num2 into 
							a String to add to the text box */
							textField.setText(answer); /* Sets the textbox to display the result stored */						
						}
						if(timesing) { /* Checks if timesing is equal to true */
							String answer = String.valueOf(num1 * num2); /* Converts the result of num1 * num2 into 
							a String to add to the text box */
							textField.setText(answer); /* Sets the textbox to display the result stored */				
						}
						if(dividing) { /* Checks if dividing is equal to true */
							String answer = String.valueOf(num1 / num2); /* Converts the result of num1 / num2 into 
							a String to add to the text box */
							textField.setText(answer); /* Sets the textbox to display the result stored */				
						}
					}	
				}
			);
		plus = new JButton("+"); /* Declairs button and adds text with add sign*/
		plus.addActionListener( /* Declairs an action listener for the button */
				new ActionListener() { /* Declairs a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						num1 = Double.parseDouble(textField.getText()); /* Converts text in the textField into a 
						Double and stores it under num1 */
						dividing = false; /* Makes dividing equal to false */
						timesing = false; /* Makes timesing equal to false */
						adding = true; /* Makes adding equal to true */
						subtracting = false; /* Makes subtracting equal to false */
						textField.setText(""); /* Sets the text box text to blank */
					}	
				}
			);
		subtract = new JButton("-"); /* Declairs button and adds text with subtract sign*/
		subtract.addActionListener( /* Declairs an action listener for the button */
				new ActionListener() { /* Declairs a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						num1 = Double.parseDouble(textField.getText()); /* Converts text in the textField into a 
						Double and stores it under num1 */
						dividing = false; /* Makes dividing equal to false */
						timesing = false; /* Makes timesing equal to false */
						adding = false; /* Makes adding equal to false */
						subtracting = true; /* Makes subtracting equal to true */
						textField.setText(""); /* Sets the text box text to blank */
					}	
				}
			);
		times = new JButton("\u00D7"); /* Declairs button and adds text with times sign using unicode*/
		times.addActionListener( /* Declairs an action listener for the button */
				new ActionListener() { /* Declairs a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						num1 = Double.parseDouble(textField.getText()); /* Converts text in the textField into a 
						Double and stores it under num1 */
						dividing = false; /* Makes dividing equal to false */
						timesing = true; /* Makes timesing equal to true */
						adding = false; /* Makes adding equal to false */
						subtracting = false; /* Makes subtracting equal to false */
						textField.setText(""); /* Sets the text box text to blank */
					}	
				}
			);
		divide = new JButton("\u00F7"); /* Declairs button and adds text with divide sign using unicode*/
		divide.addActionListener( /* Declairs an action listener for the button */
				new ActionListener() { /* Declairs a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						num1 = Double.parseDouble(textField.getText()); /* Converts text in the textField into a 
						Double and stores it under num1 */
						dividing = true; /* Makes dividing equal to true */
						timesing = false; /* Makes timesing equal to false */
						adding = false; /* Makes adding equal to false */
						subtracting = false; /* Makes subtracting equal to false */
						textField.setText(""); /* Sets the text box text to blank */
					}	
				}
			);
		
		clear = new JButton("AC"); /* Creates Button and adds Text */
		clear.addActionListener( /* Declairs an action listener for the button */
				new ActionListener() { /* Declairs a new action listener is being used */
					public void actionPerformed(ActionEvent arg0) { /* Tell the program the actions performed */
						num1 = 0; /* Makes num1 equal to 0 as its reset */
						num2 = 0; /* Makes num2 equal to 0 as its reset */
						dividing = false; /* Makes dividing equal to false */
						timesing = false; /* Makes timesing equal to false */
						adding = false; /* Makes adding equal to false */
						subtracting = false; /* Makes subtracting equal to false */
						textField.setText(""); /* Sets the text box text to blank */
					}	
				}
			);
		
		p1 = new JLabel(""); /* Blank JLabel used as place holder and gap creator */
		p2 = new JLabel(""); /* Blank JLabel used as place holder and gap creator */
		p3 = new JLabel(""); /* Blank JLabel used as place holder and gap creator */
		
		panel = new JPanel(); /* JPanel is declaired as a new JPanel */
		GridLayout gridLayout = new GridLayout(5,4); /* Creating a grid layout for the panel */
		panel.setLayout(gridLayout); /* Grid layout is applied to panel */
		
		/* Below is the buttons that are stored on the 2nd line of the display */
		panel.add(clear);
		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
		
		/* Below is the button that are stored on the 3rd line of the display */
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(divide);

		/* Below is the button that are stored on the 4th line of the display */
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(times);

		/* Below is the button that are stored on the 5th line of the display */
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(subtract);
		

		/* Below is the button that are stored on the 6th line of the display */
		panel.add(zero);
		panel.add(decimal);
		panel.add(equal);
		panel.add(plus);
		
		windowContent.add("Center", panel); /* This makes sure the panel is added to the windowsContent and is centred */
		JFrame frame = new JFrame("Calculator");  /* Creates the JFrame and gives it a title */ 
		frame.setPreferredSize(new Dimension(400, 400));  /* Sets the preferred size of the window if not small */ 
		frame.setContentPane(windowContent);  /* This creates the overall window and tell it what it needs */ 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  /* This makes sure to exit the program when its closed */ 
		frame.setVisible(true); /* Makes the frame visible to the user */ 
		frame.pack(); /* Makes sure everything fits within the frame and nothing is hidden */
	}
	
	public static void main(String args[]) { /* Main method is called and runs code below */
		new Calculator(); /* Calls to run the Calculator method and no object added as we dont need it for anything else */
	}

}
