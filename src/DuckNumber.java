import java.util.Scanner;

public class DuckNumber {
	 public static void main(String args[]) {
		 
	        int counter = 0;
	 
	        char ch;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        // Waiting for the user input
	        String n = sc.nextLine();
	        for (int i = 0; i < n.length(); i++) {
	            ch = n.charAt(i);
	            if (ch == '0') {
	                counter++;
	            }
	        }
	 
	        if (counter > 0 && n.charAt(0) != '0') {
	            System.out.println("The number is duck number");
	        } else {
	            System.out.println("The number is not duck number");
	        }
	 
	    } // end method main
}
