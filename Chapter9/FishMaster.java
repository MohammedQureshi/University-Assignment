package Chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FishMaster { /* Creates a class called FishMaster */
	public static void main(String[] args) { /* Sets up the main method */
		
		Fish myFish = new Fish(); /* Creates an Object for the Fish class */
		
		@SuppressWarnings("unused") /* This just shows the method is ready to use but I am 
		currently unsung it and to withhold the error. */
		Fish myFish2 = new Fish(20); /* This creates a new Instance of the Fish class and 
		uses the constructor that takes in an integer */
		
		String feetInString = ""; /* Creates a string called feetInString */
		int feets; /* Creates an integer called feets */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); /* Creates a BufferedReader
		 that takes in an input*/
		
		while (true) { /* Runs while true */
			System.out.println("Ready to dive, how deep?"); /* Prints out a string to the console  */
			try {
				feetInString = reader.readLine();
				if (feetInString.equals("Q")) {
					System.out.println("Goodbye!"); /* Prints out a string to the console  */
					System.exit(0); /* Exits the program */
				} else { /* Runs if the statement above is not met */
					feets = Integer.parseInt(feetInString); /* Converts feetInString to an Integer and stores it in feet */
					myFish.dive(feets); /* Runs dive method from Fish class and sets parameter equal to feets */
				}
			} catch (IOException e) { /* Catches IOException */
				e.printStackTrace(); /* Prints IOException stack trace */
			}
		} 
	} 
}