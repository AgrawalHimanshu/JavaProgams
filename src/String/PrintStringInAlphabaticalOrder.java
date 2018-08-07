package String;

import java.util.Arrays;

//String str = "Hello My Name Is Kiran";
//Reverse String = Hello Is Kiran My Name


/*To solve such questions, divide the question into smaller parts and solve each one of them separately.

This problem can be solving using the following steps.

Split the sentence into words and store those words in an array.
Sort the array of words alphabetically using insertion sort or bubble sort.

Let the input String be str. Add a space at the end of str so that there will be uniformity in the structure of the sentence i.e. we will have a space after every word.

Find the number of spaces in str using a simple for loop. This will tell you the number of words present in the String. Store that number in a variable numberOfWords.

Create a String[] array, words of size numberOfWords to store the words.

Initialize a variable currentWord to zero. This variable tells you the index in the array where the next word should be stored.

Create a variable startIndex and set it to zero. This variable tells us the index at which the current word starts.

Using a for loop with loop variable i, iterate through the characters of the String. When a space is encountered, it means that a word had ended. You have the index from where the word starts (startIndex)  and the index where the word ends (i). So, you can extract the word using substring() method and store it in the array words at index currentWord. Increment currentWord and also startIndex to (i+1).

At the end of the loop, you will be having the list of the words in words[] array. Sort the array. Sorting a String array is similar to sorting an integer array. Two see if int num1 is less than int num2, you write num1 < num2, for Strings, you write string1.compareTo(string2) < 0.

Finally, print the contents of words[] array.*/
public class PrintStringInAlphabaticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi How Are You";//"Hello My Name Is Kiran ZEX ABC";
		System.out.println("Original String: " + str);

		// iterative method to reverse String in Java
		String reverseStr = reverse(str);
		System.out.println("Reverse String: " + reverseStr);
	}

	public static String reverse(String str) {
		str = str + " ";
	        // Find number of words
	        int numberOfWords = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == ' ') {
	                numberOfWords++;
	            }
	        }
	        // Extract words and store in array
	        String[] words = new String[numberOfWords];
	        int startIndex = 0;
	        int currentWord = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == ' ') {
	                String word = str.substring(startIndex, i);
	                words[currentWord] = word;
	                currentWord++;
	                startIndex = i + 1;
	            }
	        }
	        // Sort words
	        for (int i = 0; i < words.length - 1; i++) {
	            for (int j = 0; j < words.length - i - 1; j++) {
	                if (words[j].compareTo(words[j + 1]) > 0) {
	                    String temp = words[j];
	                    words[j] = words[j + 1];
	                    words[j + 1] = temp;
	                }
	            }
	        }
	        StringBuilder strBuilder = new StringBuilder();
	        // Print words
	        for (int i = 0; i < words.length; i++) {
	        	        	
	            strBuilder.append(words[i]);
	            strBuilder.append(" ");
	        }
	        
	        return strBuilder.toString();
	}
}
