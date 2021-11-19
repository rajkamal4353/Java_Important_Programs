package Interview_Prep;

public class Recursion {
	
	static int count = 0;

	public static void rec() {

		count++;

		if (count <= 5) {

			System.out.println("Hello");

			rec();
		}

	}

	public static void main(String[] args) {

		rec();

	}
	
}
