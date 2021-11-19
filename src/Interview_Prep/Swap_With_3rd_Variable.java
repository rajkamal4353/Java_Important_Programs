package Interview_Prep;

import java.util.Scanner;

public class Swap_With_3rd_Variable {

	public static void main(String[] args) {

		int x, y, z;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of X and Y");

		x = scan.nextInt();
		y = scan.nextInt();

		System.out.println("Before Swapping: " + x + "  " + y);

		z = x;
		x = y;
		y = z;

		System.out.println("After Swapping: " + x + "  " + y);

	}
}
