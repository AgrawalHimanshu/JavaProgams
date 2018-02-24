package TechMentroAssignment2;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PalindromeFinder {
	public static void main(String args[]) throws FileNotFoundException, IOException {

        //original string
        String str = "NAMAN";
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
        /*//iterative method to reverse String in Java
        reverseStr = reverse(str);
        System.out.println("Reverse String in Java using Iteration: " + reverseStr);

        //recursive method to reverse String in Java
        System.out.println(str.length());
        System.out.println(str.substring(1));
      //  System.out.println(str.charAt(0));
        reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " + reverseStr);

    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
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
*/
    }

}
