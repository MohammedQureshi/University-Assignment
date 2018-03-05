package Chapter9;

public class Fish { /* Sets up class */
	int currentDepth; /* Creates integer called currentDepth and sets no value */
	final int DEFAULT_DIVING = 5; /* Creates a integer with a final value of 5 called DEFAULT_DIVING */
	
	Fish() { /* Creates constructor for Fish class */
		currentDepth = 10; /* Sets value of currentDepth to 10 */
	}
	
	Fish(int currentDepth) { /* Second constructor for Fish class takes in an integer called currentDepth */
		this.currentDepth = currentDepth; /* Sets value of currentDepth at the top equal to currentDepth 
		gotten from the constructor input */
	}

	public int dive() { /* Creates public method thats returns an integer called dive */
		currentDepth = currentDepth + DEFAULT_DIVING; /* Makes currentDeapth equal to currentDepth plus DEFAULT_DIVING */
		if (currentDepth > 100) { /* Checks if currentDepath is greater then then runs code below */
			System.out.println("I'm a little fish and cant dive below 100 feet"); /* Prints out a string to console */
			currentDepth = currentDepth - DEFAULT_DIVING; /* Makes currentDepth equal to currentDepth minus DEFAULT_DIVING */
		} else { /* Runs when statement above is not met */
			System.out.println("Diving for" + DEFAULT_DIVING + " feet"); /* Prints a string to the console
			 taking in the integer of DEFAULT_DIVING */
			System.out.println("I'm at " + currentDepth + " feet below sea level"); /* Prints a string to the console
			 taking in the integer of currentDepth */
		}
		return currentDepth; /* Returns value of currentDepth */
	}

	public int dive(int howDeep) { /* Creates a method called dive and takes in an integer and stores it as howDeep */
		currentDepth = currentDepth + howDeep; /* Sets the currentDepth value to currentDepth plus howDeep */
		if (currentDepth > 100) { /* Checks if currentDepath is greater then then runs code below */
			System.out.println("I'm a little fish and cant dive below 100 feet"); /* Prints out a string to console */
			currentDepth = currentDepth - howDeep; /* Sets value of currentDepth to currentDepth minus howDeep */
		} else { /* If the above statement is not met this is ran */
			System.out.println("Diving for " + howDeep + " feet"); /* Prints a string to console and takes in howDeep integer */
			System.out.println("I'm at " + currentDepth + " feet below sea level"); /* Prints a string to console and 
			takes in currentDepth integer */
		}
		return currentDepth; /* Returns value of currentDepth */
	}

	public String say(String something) { /* Creates a public method called say and takes in a string */
		return "Dont you know that fish cannot speak!!"; /* Returns a string */
	}
}
