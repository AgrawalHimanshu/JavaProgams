package String;

import java.util.Arrays;

public class StringAnagram {
	public static boolean iAnagram(String word, String anagram) {
		char[] charFromWord = word.toUpperCase().toCharArray();
		char[] charFromAnagram = anagram.toUpperCase().toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);
	}

	
	public static void main(String args[]){
		System.out.println(iAnagram("Hello Brother", "BRO THEROLLEH"));
	}
}
