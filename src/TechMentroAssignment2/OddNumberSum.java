package TechMentroAssignment2;

import java.util.Scanner;

public class OddNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Number: ");
		
		Scanner sc = new Scanner(System.in);

		long i = sc.nextLong();
		long sum=0;
		
		for(long k=1; k<=i ; k++){
			if(k%2!=0){
				sum = sum + k;
			}
		}
		System.out.println("Sum of odd numbers b/w 1 to " +i+ " is " + sum +".");
	}

}
