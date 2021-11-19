package Interview_Prep;

public class Duplicate_String {
	
	public static void main(String[] args) {

		String str = "big black bug bit a big black dog on his big black nose";
		int count;

		String words[] = str.split(" ");
		
		 //Converts given string into character array  
        //char letter[] = str.toCharArray();

		System.out.println("Duplicate words in a given string : ");

		for (int i = 0; i < words.length; i++) {
			count = 1;
			
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}

			if (count > 1 && words[i] != "0")
				System.out.println(words[i]);

		}
	}
}
