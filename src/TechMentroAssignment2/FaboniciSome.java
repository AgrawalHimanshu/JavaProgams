package TechMentroAssignment2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FaboniciSome {
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	  System.out.println("Enter Value for the series");
	  int number = scan.nextInt();
	  int i=0;;
	  int j=1;
	  int k;
	  long sum = 1;
	  System.out.print(i + " " + j);
	  for(int l=2;l<number;l++) 
	  {
	   k=i+j;
	   System.out.print(" " +k);
	   sum = sum+k;
	   i=j;
	   j=k;
	  }
	  System.out.println("");
	  System.out.println(sum);
}
}