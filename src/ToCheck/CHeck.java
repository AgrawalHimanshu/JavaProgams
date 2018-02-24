package ToCheck;

import java.util.Scanner;

public class CHeck {
	public static void main(String args[]){
		
		int i =4; 
		double d = 4.0;
		String s = "HackerRank ";
		Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        int j;
        double d1;
        String s1;
        j = scan.nextInt();
        d1= scan.nextDouble();
        s1= scan.nextLine();
        s1= scan.nextLine();
        System.out.println(s1);
        System.out.println(i+j);
        System.out.println(d+d1);
        String s2 = s.concat(s1);
        System.out.println(s2);
        
	}

}
