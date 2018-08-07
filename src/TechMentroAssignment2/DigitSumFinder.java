package TechMentroAssignment2;

import java.util.Scanner;

public class DigitSumFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Number: ");
		
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int k = number;
		int sum=0;
		
		while(number/10 != 0){
			number = number/10;
			sum = sum + number%10;
			
		}
		
		sum = sum+number;

		System.out.println("Sum of the digits of " + k + " is " + sum +".");
	}

}
