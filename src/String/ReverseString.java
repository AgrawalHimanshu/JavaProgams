package String;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReverseString {
	public static void main(String args[]) throws FileNotFoundException, IOException {

        //original string
        String str = "Hello My Name Is Kiran";
        System.out.println("Original String: " + str);

        //iterative method to reverse String in Java
        String reverseStr = reverse(str);
        System.out.println("Reverse String in Java using Iteration: " + reverseStr);

    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        StringBuilder strBuilder2 = new StringBuilder();

        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
        	
        	if(i==0){
        		strBuilder2.append(strChars[i]);
        		strBuilder.append(strBuilder2.reverse());
        	}
        	 
        	if(String.valueOf(strChars[i]).equals(" ")){
        		strBuilder.append(strBuilder2.reverse());
        		strBuilder.append(' ');
        		strBuilder2.setLength(0);
        		i--;
           	}     	
    		

        	strBuilder2.append(strChars[i]);
        	
        	
        	    	
        }

        return strBuilder.toString();
        
    }

    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        System.out.println(str.charAt(0));
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

}
