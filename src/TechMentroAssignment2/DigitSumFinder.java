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
		
		while(true){
			sum = sum + number%10;
			number = number/10;
			if(number/10 == 0){
				break;
			}
		}
		
		sum = sum+number;

		System.out.println("Sum of the digits of " + k + " is " + sum +".");
	}

}
