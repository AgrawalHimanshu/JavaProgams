package TechMentroAssignment2;

import java.util.Scanner;

public class OddNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Number: ");
		
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int sum=0;
		
		for(int k=1; k<=i ; k++){
			if(k%2!=0){
				sum = sum + k;
			}
		}
		System.out.println("Sum of odd numbers b/w 1 to " +i+ " is " + sum +".");
	}

}
