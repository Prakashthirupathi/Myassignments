package week1.day2;

import java.util.Arrays;

public class SecondSmallestNum {

	public static void main(String[] args) {
		int []arr= {23,45,67,32,89,22};

		for(int i=0;i<arr.length;i++) {
			Arrays.sort(arr);
			System.out.println(arr[i]);
		}
		if(arr[0]<arr[1]) {
			System.out.println("The Second Smallest Number is "+arr[1]);
		}
			}

		}