package Array;

import java.util.Arrays;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello How are you ";
		
		String s2 = "are";
			
		int l=0;
		String[] words = s1.split(" ");
		
	/*	 int numberOfWords = 0;
	        for (int i = 0; i < s1.length(); i++) {
	            char ch = s1.charAt(i);
	            if (ch == ' ') {
	                numberOfWords++;
	            }
	        }
		
		 String[] words = new String[numberOfWords];
	        int startIndex = 0;
	        int currentWord = 0;
	        for (int i = 0; i < s1.length(); i++) {
	            char ch = s1.charAt(i);
	            if (ch == ' ') {
	                String word = s1.substring(startIndex, i);
	                words[currentWord] = word;
	                currentWord++;
	                startIndex = i + 1;
	            }
	        }
			*/
		System.out.println(Arrays.toString(words));
		
		for(int i=0 ; i<=words.length-1; i++){
			
			if(words[i].compareTo(s2) == 0){
				l = i;
				break;
			}
		}
		
		int k=0;
		
		for(int m=0; m<l; m++){
			k= k + words[m].length() +1;
		}
		
		System.out.println(k);

	}

}
