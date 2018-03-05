package Chapter3; /* Sets the package the class is located */

import java.util.*; /* Importing the java util library*/

public class Christmas { /* Setting up class name */

	public static void main(String args[]) { /* This is to make it the main loop. */

		Scanner input = new Scanner(System.in); /* This is creating a Scanner to read input. */

		System.out.println("Enter number:"); /* This is printing a string of text */
		/*
		 * This is asking for the user to enter an Integer and storing it under as an
		 * Integer in a variable called number
		 */
		int number = input.nextInt(); 

		/*
		 * Checking if the variable number is greater then or equal to 13 or less then
		 * or equal to 0 and if it is then runs code below.
		 */
		while (number >= 13 || number <= 0) {
			System.out.println("Sorry only the 1 to 12 days of Christmas!"); /* Prints string of text; */
			System.out.println("Enter another day!"); /* Prints string of text; */
			number = input.nextInt(); /* Gets the user input again to store as number as previous one doesn't repeat*/
		}
		
		input.close(); /* Scanner is no longer used so it is closed for memory efficiency */
		
		int counter = 1; /* Created an Int to loop though while loops */
		int decreaseNum; /* Created an Int to loop though while loops and made it equal to number*/

		while (counter <= number) { /* While loop created to run though every number until the number entered in reached */
			System.out.print("On the "); /* Print line of String */
			if (counter == 1) { /* Checks if number variable is equal to 1 then runs code below */
				System.out.print("1st"); /* Print line of String */

			} else if (counter == 2) { /* Checks if number variable is equal to 2 then runs code below */
				System.out.print("2nd"); /* Print line of String */
			} else if (counter == 3) { /* Checks if number variable is equal to 3 then runs code below */
				System.out.print("3rd"); /* Print line of String */
			} else if (counter >= 4) { /* Checks if number variable is equal to 4 or more then runs code below */
				System.out.print(counter + "th"); /* Get data from the counter and Print line of String */
			}
			decreaseNum = counter; /* Make decreaseNum equal to counter */
 
			counter = counter + 1; /* Make counter equal counter plus 1*/

			System.out.println(" day of Christmas my true love gave to me"); /* Prints string of Text */

			while (decreaseNum > 0) { /* Run while decreaseNum is greater then 0 */
				if (decreaseNum == 12) { /* Checks if number is equal to 12 */
					System.out.print("twelve drummers drumming, "); /* Prints string of Text */
				}
				if (decreaseNum == 11) { /* Checks if number is equal to 11 */
					System.out.println("eleven pipers piping, "); /* Prints string of Text on a new line */
				}
				if (decreaseNum == 10) { /* Checks if number is equal to 10 */
					System.out.print("ten lords a-leping, "); /* Prints string of Text */
				}
				if (decreaseNum == 9) { /* Checks if number is equal to 9 */
					System.out.print("nine ladies dancing, "); /* Prints string of Text */
				}
				if (decreaseNum == 8) { /* Checks if number is equal to 8 */
					System.out.println("eight maids a-milking, "); /* Prints string of Text on a new line */
				}
				if (decreaseNum == 7) { /* Checks if number is equal to 7 */
					System.out.print("seven swans a-swimming, "); /* Prints string of Text */
				}
				if (decreaseNum == 6) { /* Checks if number is equal to 6 */
					System.out.print("six geese a-laying, "); /* Prints string of Text */
				}
				if (decreaseNum == 5) { /* Checks if number is equal to 5 */
					System.out.println("five gold rings,"); /* Prints string of Text on a new line */
				}
				if (decreaseNum == 4) { /* Checks if number is equal to 4 */
					System.out.print("four calling birds, "); /* Prints string of Text */
				}
				if (decreaseNum == 3) { /* Checks if number is equal to 3 */
					System.out.print("three french hens, "); /* Prints string of Text */
				}
				if (decreaseNum == 2) { /* Checks if number is equal to 2 */
					System.out.print("two turtle doves and "); /* Prints string of Text */
				}
				if (decreaseNum == 1) { /* Checks if number is equal to 1 */
					System.out.println("a partridge in a pear tree."); /* Prints string of Text on a new line */
				}
				decreaseNum = decreaseNum - 1; /* This is making decreaseNum equal to decreaseNum minus 1 */
			}
			System.out.println(" "); /* Printing blank line for spacing */
		}
	}
}
