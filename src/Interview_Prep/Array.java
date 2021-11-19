package Interview_Prep;

public class Array {
	
	public static void main(String[] args) {   
	
	int a[] = new int[3];

	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
	
	// a[3] = 40;

	System.out.println(a[2]);

	// ------------------------------------

	int b[] = { 1, 2, 3 };
	
	for (int i : b) {
		System.out.println(i);
	}
	System.out.println(b[2]);

    }
}

