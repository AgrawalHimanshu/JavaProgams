package TechMentroAssignment1;

import java.util.Scanner;

public class MaxFinder {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int firstNum = scan.nextInt();
		System.out.print("Enter Second Number: ");
		int secondNum = scan.nextInt();
		if (firstNum > secondNum) {
			System.out.println(firstNum + " is max number");
		} else {
			System.out.println(secondNum + " is max number");
		}

	}

}