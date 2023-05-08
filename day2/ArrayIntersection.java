package week1.day2;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] arr1 = {3, 2, 11, 4, 6, 7};
        // Declare the second array
        int[] arr2 = {1, 2, 8, 4, 9, 7};
        // Declare a for loop iterator from 0 to array length
        for (int i = 0; i < arr1.length; i++) {
            // Declare a nested for loop for the second array
            for (int j = 0; j < arr2.length; j++) {
                // Compare both arrays using a condition statement
                if (arr1[i] == arr2[j]) {
                    // Print the matching element from the first array
                    System.out.println("Matched item in both arrays: " + arr1[i]);
                }
            }
        }
	}

}
