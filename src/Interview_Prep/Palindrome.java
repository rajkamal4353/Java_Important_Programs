package Interview_Prep;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {

		int rem = 0, ans = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = scan.nextInt();

		int a = num;

		while (num > 0) {

			rem = num % 10;
			ans = ans * 10 + rem;
			num = num / 10;
		}

		if (a == ans) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not palindrome number");
		}
	}
}
