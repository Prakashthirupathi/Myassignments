package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare an int Input and assign a value 13
	    int input = 13;
	    // Declare a boolean variable flag as true
	    boolean flag = true;
	    // Iterate from 2 to half of the input
	    for (int i=2; i<=input/2; i++) {
	        // Divide the input with each for loop variable and check the remainder
	        if (input % i == 0) {
	            // Set the flag as false when there is no remainder
	            flag = false;
	            // break the iterator
	            break;
	        }
	    }

	    // Check the flag (Provide a condition)
	    if (flag) {

	        // Print 'Prime' when the condition matches
	        System.out.println(input + " is a Prime Number");
	    }

	    else {

	        // Print 'Not a Prime' when the condition doesn't match
	        System.out.println(input + " is not a Prime Number");
	    }
	   }
	}