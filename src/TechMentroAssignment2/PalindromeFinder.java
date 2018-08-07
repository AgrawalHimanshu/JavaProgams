package TechMentroAssignment2;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PalindromeFinder {
	public static void main(String args[]) throws FileNotFoundException, IOException {

        //original string
        String str = "NAMAN NAMAN";
        System.out.println("Original String: " + str);

        //reversed string using Stringbuffer
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);

        if (str.equalsIgnoreCase(reverseStr)){
        	System.out.println("String is a Palindrome");
        }
        
        else{
        	System.out.println("String is not a Palindrome");
        }
        
    }

}
