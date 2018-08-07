package String;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;

public class ReverseString2 {
	public static void main(String args[]) throws FileNotFoundException, IOException {

        //original string
        String str = "$Hello My Na$$me Ku.$$ Is Kiran. Singh....";
        System.out.println("Original String: " + str);

        //iterative method to reverse String in Java
        String reverseStr = reverse(str);
        System.out.println("Reverse String in Java using Iteration: " + reverseStr);

    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        StringBuilder strBuilder2 = new StringBuilder();

        char[] strChars = str.toCharArray();

        for (int i = 0; i<strChars.length; i++) {
        	
        	if(i==strChars.length-1 && !Pattern.matches("[^a-z^A-Z^ ]", String.valueOf(strChars[i]))){
        		strBuilder2.append(strChars[i]);
        		strBuilder.append(strBuilder2.reverse());
        	}
        	
        	if(i==0 && Pattern.matches("[^a-z^A-Z^ ]", String.valueOf(strChars[i]))){
        		strBuilder.append(strChars[i]);
        		i++;
        	}
        	
                	
        	if(Pattern.matches("[^a-z^A-Z^ ]", String.valueOf(strChars[i]))){
        		
        		strBuilder.append(strBuilder2.reverse());
        		strBuilder2.setLength(0);
        		if(i==strChars.length-1){
        			strBuilder.append(strChars[strChars.length-1]);
        		}
        	
        	}
        	 
        	if(String.valueOf(strChars[i]).equals(" ")){
        		strBuilder.append(strBuilder2.reverse());
        		strBuilder.append(' ');
        		strBuilder2.setLength(0);
        		i++;
           	}     	
    		

        	strBuilder2.append(strChars[i]);
        	
        	
        	    	
        }

        return strBuilder.toString();
        
    }


}
