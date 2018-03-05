package Chapter9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ScoreWriter3 { /* This sets up the class */

	public static void main(String[] args) { /* Sets up the main method */

		FileWriter myFile = null; /* Created a FileWriter called myFile sets it to null */
		BufferedWriter buff = null; /* Created a BufferdWriter thats called buff and sets it to null */
		Date today = new Date(); /* Creates a Date and stores it under today and is equal to a new Date */
		Score scores[] = new Score[3]; /* Stores Scores as an array called scores */
		
		// The player #1
		scores[0] = new Score(); /* Gets a new instance of the class Score and stores it under array 0 in scores */
		scores[0].setFirstName("John"); /* Sets the first name in score array 0 */
		scores[0].setLastName("Smith"); /* Sets the last name in score array 0 */
		scores[0].setScore(250); /* Sets the score of the current array */
		scores[0].setPlayDate(today); /* Sets the playDate to the variable today */
		// The player #2
		scores[1] = new Score(); /* Gets a new instance of the class Score and stores it under array 1 in scores */
		scores[1].setFirstName("Anna"); /* Sets the first name in score array 1 */
		scores[1].setLastName("Lee"); /* Sets the last name in score array 1 */
		scores[1].setScore(300); /* Sets the score of the current array */
		scores[1].setPlayDate(today); /* Sets the playDate to the variable today */
		// The player #3
		scores[2] = new Score(); /* Gets a new instance of the class Score and stores it under array 2 in scores */
		scores[2].setFirstName("David"); /* Sets the first name in score array 2 */
		scores[2].setLastName("Dolittle"); /* Sets the last name in score array 2 */
		scores[2].setScore(190); /* Sets the score of the current array */
		scores[2].setPlayDate(today); /* Sets the playDate to the variable today */
		
		try { /* Tries to run the method below */
			myFile = new FileWriter("C:/score.txt"); /* Tries to load up file called score.txt */
			buff = new BufferedWriter(myFile); /* Stores files above in a BufferedWriter */
			for (int i = 0; i < scores.length; i++) { /* Runs a loop while I is less then score.length and consistatly adds one */
				buff.write(scores[i].toString()); /* This writes to the buffer */
				System.out.println("Writing " + scores[i].getLastName()); /* Print a string to the console and 
				gets the value of getLastName is the current array selected of score */
			}
			System.out.println("File writing is complete"); /* Prints a string of text */
		} catch (IOException e) { /* This catches the IOExcpetion */
			e.printStackTrace(); /* Prints the stack trace of the IOException */
		} finally { /* This runs at the end of all of the above */
			try { /* Runs a try method */
				buff.flush(); /* Flush out the buffered reader */
				buff.close(); /* Closes the buffered reader */
				myFile.close(); /* closes the file reader */
			} catch (IOException e1) { /* Catches the IOException if one thrown */
				e1.printStackTrace(); /* Prints the stack trace of the IOException */
			}
		}

		Score aScore = new Score("John", "Smith", 250, today); /* Sets up an object for the Score class with parameter */
		Score bScore = new Score("Anna", "Lee", 300, today); /* Sets up an object for the Score class with parameter */
		Score cScore = new Score("David", "Dolittle", 190, today); /* Sets up an object for the Score class with parameter */

		System.out.println(aScore.toString()); /* Prints a line to the console and convert the aScore value above to a string */
		System.out.println(bScore.toString()); /* Prints a line to the console and convert the bScore value above to a string */
		System.out.println(cScore.toString()); /* Prints a line to the console and convert the cScore value above to a string */

	}
}
