package String;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DeleteCharacterFromString {
	public static void main(String args[]) throws FileNotFoundException, IOException {

        //original string
        String str = "KIRAN NN HELLO";
        System.out.println("Original String: " + str);
            
        char  ch = 'N';

       
        String newStr = removeChar(str,ch);
        System.out.println("Reverse String in Java using Iteration: " + newStr);
        }
	
	public static String removeChar(String str, char ch){
		StringBuilder strb = new StringBuilder();
		char[] strchar = str.toCharArray();
		for(int i=0; i<str.length();i++){
			if (String.valueOf(strchar[i]).equals(String.valueOf(ch))){
				System.out.println("Character " + ch + " has been removed");
			}
			else{
			strb.append(strchar[i]);
			}
		}
    	return strb.toString();
	}
    
}
