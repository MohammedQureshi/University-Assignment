package Chapter2;

public class DogOwner extends Dog{ /* Setting up DogOwner class to work with Dog Class */
	
	public static void main(String args[]) {
		
		Dog dog = new Dog(); /* Setting up an object to access the Dog class */
		dog.setLegs(4); /* Setting the number of legs for the Dog so 4*/
		dog.hasTail(true); /* Setting if the dog has a tail or not and we set
		it to true as it does have a tail*/
		dog.setFur("Fluffy"); /* Setting the type of Fur the Dog has by
		entering a String in the box */
		
		/* Line below prints a String and gets the current value of Legs variable from the Dog class */
		System.out.println("This Dog has "+dog.getLegs()+" Legs");
		/* Line below prints a String and gets the value of true or false for tail from Dog class */
		System.out.println("Does the Dog Have a Tail? "+dog.getTail());
		/* Line below prints a String that gets a the variable getFur to print out the Dogs fur type */
		System.out.println("This Dog has "+dog.getFur()+" Fur");
		
	}
	
}
