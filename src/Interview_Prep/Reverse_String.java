package Interview_Prep;

public class Reverse_String {
	
	public static void main(String[] args) {

		String str = "Dream big";

		String reverse = "";

		
		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);
		}

		System.out.println("Original string: " + str);
		
		System.out.println("Reverse string: " + reverse);

	}

}
