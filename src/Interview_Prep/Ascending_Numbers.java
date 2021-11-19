package Interview_Prep;

import java.util.Arrays;

public class Ascending_Numbers {
	
	public static void main(String[] args) {

		int arr[] = { 9,8,5,3,4,6,2 };
		Arrays.sort(arr);

		System.out.println("Elements in ascending order: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
