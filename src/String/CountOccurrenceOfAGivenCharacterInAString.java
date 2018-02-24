package String;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountOccurrenceOfAGivenCharacterInAString {
	public static void main(String args[]) throws FileNotFoundException, IOException {

        //original string
        String str = "HELLO BROTHER";
        System.out.println("Original String: " + str);
            
        char  ch = 'O';

        int count = countOccurrenceOfChar(str,ch);
        System.out.println("Total count of character: " + count);
        }
	
	public static int countOccurrenceOfChar(String str, char ch){
		char[] strchar = str.toCharArray();
		int count = 0;
		for(int i=0; i<str.length();i++){
			if (String.valueOf(strchar[i]).equals(String.valueOf(ch))){
				System.out.println("Character " + ch + " has Occurred");
				count++;
			}	
		}
    	return count;
	}
    
}
