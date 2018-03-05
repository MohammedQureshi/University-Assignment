package Chapter2;

public class Dog { /* Sets up the class name */
	
	private int Legs; /* Creates an Int called Legs */
	private boolean Tail; /* Creates a boolean called Tail */
	private String Fur; /* Creates a string called Fur */
	
	public int getLegs() {
		return Legs; /* Gets the Int value of Legs so how many legs the dog has. */
	}
	public void setLegs(int legs) {
		Legs = legs; /* Sets the number of legs the dog has */
	}
	public boolean getTail() {
		return Tail; /* Gets the true or false value of the variable Tail */
	}
	public void hasTail(boolean tail) {
		Tail = tail; /* Sets if the Dog has a tail by setting the value to true or false */
	}
	public String getFur() {
		return Fur; /* Gets a string to say the type of Fur the Dog has */
	}
	public void setFur(String fur) {
		Fur = fur; /* Sets a string to describe the dogs Fur */
	}
	
	
	
}
