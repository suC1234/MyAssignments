package week1.day2;

public class FindVowels {
	
	public static void main(String[] args) {
		String name = "google";
		//vowels --> a,e,i,o,u
		/*
		 * Break the word in to charactes
		 * Check the vowel
		 * It match print it
		 */
		
		char[] charArray=name.toCharArray();
		
		for (int i=0;i<charArray.length;i++) {
			if (charArray[i] == 'a'
							|| (charArray[i] == 'e'
							|| (charArray[i] == 'i'
							|| (charArray[i] == 'o'
							|| (charArray[i] == 'u')))));
							{
							System.out.println(charArray[i]);
		}
	}


	}}
