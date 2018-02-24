package TechMentroAssignment1;

import java.util.Scanner;

public class ProfitLossFinder {
	public static void main(String[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Cost Price: ");
		int costPrice = scan.nextInt();
		System.out.print("Enter Selling Price: ");
		int sellPrice = scan.nextInt();
		if (costPrice > sellPrice) {
			System.out.println("Loss of Rs." + (costPrice - sellPrice) + " is incurred");
		} else {
			System.out.println("Benifit of Rs." + (sellPrice - costPrice) + " is incurred");
		}
	}

}
