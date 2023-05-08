package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 40;

	    // Check if the number is negative
	    if (number < 0) {
	        // Convert the number to a positive number
	    	 number =number*-1;
	    	System.out.println(number + " The given number is Negative");
	       
	        System.out.println("The number " + (-number) + " is converted to Positive" + number);
	    }
	    else {
	        System.out.println("The number is already positive");
	    }
	}

}
