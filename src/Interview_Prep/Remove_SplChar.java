package Interview_Prep;

public class Remove_SplChar {
	
	public static void main(String[] args) {

		 String str = "This@is#a$string";

		 String all = str.replaceAll("[^a-zA-Z0-9]", "");

		 System.out.println(all);
	}

}
