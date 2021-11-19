package Interview_Prep;

import java.util.Scanner;

public class Swap_Without_3rd_Variable {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x and y");

		int x = scan.nextInt();
		int y = scan.nextInt();

		System.out.println("Before swapping: " + x + " " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After swapping: " + x + " " + y);

	}
}
