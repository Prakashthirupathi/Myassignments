package week1.day2;

public class FindDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {22,66,22,66,44,89};
for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr.length; j++) {
		if(arr[i]==arr[j]) {
			System.out.println(arr[i]);
		}
	}
}
	}

}
