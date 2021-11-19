package Interview_Prep;

import java.util.Arrays;
import java.util.Collections;

public class Descending_Numbers {
	
	public static void main(String[] args) {

		Integer arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		
		//String arr[] = {"Apple" , "Banana" , "Mango" };

		Arrays.sort(arr, Collections.reverseOrder());

		System.out.println("Elements in descending order: " + Arrays.toString(arr));
	}
}
