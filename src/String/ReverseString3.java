package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class ReverseString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc$b&c!d#e@f";
		//fed$c&b!c#b@a
		
		char[] strChars = str.toCharArray();
		 StringBuilder strBuilder = new StringBuilder();
	     char[] specialChar = new char[str.length()];
	     char[] normalChar = new char[str.length()];
	     
		for(int i = 0; i<=strChars.length-1; i++){
			if(Pattern.matches("[^a-z^A-Z^ ]", String.valueOf(strChars[i]))){
				specialChar[i] = strChars[i];
			}	
			else{
			normalChar[i] = strChars[i];
			}
		}
		
		 for (int i = 0; i < normalChar.length; i++)
	        {
	            if( normalChar[i] == '\0' )
	            {
	                i++;
	            }
	            strBuilder.append(normalChar[i]);
	        }
		 strBuilder.reverse();
		 
		System.out.println(String.valueOf(normalChar));
		System.out.println(String.valueOf(specialChar));


		 
		normalChar = strBuilder.toString().toCharArray();
		int j=0;
		for(int i = 0; i<=specialChar.length-1; i++){
			if(specialChar[i] == '\0'){
				specialChar[i] = normalChar[j];
				j++;
			}
		}
		System.out.println(String.valueOf(specialChar));

	}

}
