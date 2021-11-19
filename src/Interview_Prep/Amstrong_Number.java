package Interview_Prep;

import java.util.Scanner;

public class Amstrong_Number {
	
	public static void main(String[] args) {

		int rem = 0, ans = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();

		int a = num;

		while (num > 0) {

			rem = num % 10;
			ans = ans + (rem * rem * rem);
			num = num / 10;

		}

		if (a == ans) {
			System.out.println("Armstrong number");
		} 
		else {
			System.out.println("Not armstrong number");
		}
	}

}
