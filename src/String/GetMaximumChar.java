package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class GetMaximumChar {

	static final int a = 256;
	
	// Driver Method
		public static void main(String[] args) {
			String str = "aJAVA jjat is best";
			getMaxOccuringChar(str);
		}
		
		public static void findMaxOChar(String text){
			text = text.toLowerCase();
		    HashMap<Character, Integer> map = new HashMap<Character, Integer>();map.clear();
		    Character maxChar = ' ';
		    long max = Integer.MIN_VALUE;
		    for(int i=0;i<text.length();i++){
		    	 if(text.charAt(i) == ' '){
		    		 i++;
		    	 }
		        Character current = text.charAt(i);
		       
		        if(map.containsKey(current)){
		            map.put(current,map.get(current)+1);
		        }
		        else{
		            map.put(current,1);
		        }
		        if(map.get(current)>max){
		            maxChar = current;
		            max = map.get(current);
		        }
		    }
		    
		    
		    for (Entry<Character, Integer> key: map.entrySet()){
		    	System.out.println(key.getKey() + " = " + key.getValue());
		    }
		    
		    System.out.println(maxChar + " = " +  max);
		}

	public static void getMaxCharacter(String str) {
		char[] ch = str.toCharArray();
		int count = 1;
		int prev = 0;
		int max = 0;

		for (int i = 0; i <= ch.length - 1; i++) {
			if(ch[i] == ' '){
	    		 i++;
	    	 }
			
			if (ch[i] == ch[i+1]) {
				count++;
			
			if(i+1 == ch.length-1){
				break;
			}
			}
			else{
				if (count > prev) {
					max = prev;
					prev = count;
				//	max = prev;
				}
				count = 1;
			}
		}
		System.out.println(max);
	}

	static char getMaxOccuringChar(String str) {
		// Create array to keep the count of individual
		// characters and initialize the array as 0
		int count[] = new int[a];

		// Construct character count array from the input
		// string.
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		for (int i = 0; i < count.length - 1; i++) {
			System.out.println(count[i]);

		}

		int max = -1; // Initialize max count
		char result = ' '; // Initialize result

		// Traversing through the string and maintaining
		// the count of each character
		for (int i = 0; i < len - 1; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;
	}
}
