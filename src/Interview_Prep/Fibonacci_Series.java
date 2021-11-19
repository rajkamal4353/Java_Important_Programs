package Interview_Prep;

public class Fibonacci_Series {
	
	public static void main(String[] args) {

		int a = 0, b = 1, c;
		
		System.out.println(a);
		
		System.out.println(b);

		for (int i = 0; i < 6; i++) {
			c = a + b;
			
			System.out.println(c);

			a = b;
			b = c;
			
		}
	}
}
