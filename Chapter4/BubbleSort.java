package Chapter4;

public class BubbleSort { /*Creating class and setting name*/

	/**
	 * Mohammed Faisal Qureshi
	 */
	public static void main(String[] args) { /* This is setting up the main method */
		int number[] = { 8, 5, 3, 2, 9 }; /* This is creating an array of integers and 
		storing them in the variable numbers  */
		boolean swap = true; /* This is creating a boolean called swop and 
		setting its value to true */
		int temp; /* This is creating a variable called temp and not setting any value to it yet */
		while (swap == true) { /* This will run while the value of swap is equal to true and when it 
		goes false it will stop the while loop and carry on the code below. */
			swap = false; /* This is setting the value of swap to false */
			for (int i = 0; i < number.length - 1; i++) { /* This is creating a for loop that
			creates an int called i that has a value of 0 and also checks if i is less then
			the length and this is basically the size of the array of the variable numbers
			minus 1 also its consistently adds 1 to i. until the length is met so when the 
			last number in the array is used*/
				if (number[i] > number[i + 1]) { /* This looks at the current value of i such as if the value
				of i was 1 then this would check the second value in the numbers array so 5 and then it
				would go onto checking if that value is greater then the current value plus 1 and if it is
				then the code below is ran and if not it will look though all numbers.*/
					temp = number[i + 1]; /* This is storing the value we get from the number array when 1 is
					added in a temp variable so we can get access to it later */
					number[i + 1] = number[i]; /* This is is setting the numbers array plus 1 to be equal to just
					the numbers array */
					number[i] = temp; /* This will now let the value swap places with the one that was larger */
					swap = true; /* This is setting the value of swap to true */
				}
			}
		}
		for (int i = 0; i < number.length; i++) { /* This loop would serve the same purpose as the one
		above as it takes in the same arguments in the brackets. */
			System.out.println(number[i]); /* This would print all the values of the array in the orded way */
		}
	}

}
