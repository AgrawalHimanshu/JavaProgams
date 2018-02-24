package TechMentroAssignment1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FareCalculator {
	@SuppressWarnings("resource")
	public static void main(String[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Distance Covered: ");
		float distance = scan.nextFloat();
		int firstFivePrice = 50;
		DecimalFormat df = new DecimalFormat("#.##");
		if (distance>0 && distance <= 5) {
			System.out.println("First 5 KM	: " + firstFivePrice + " Rs.");
			System.out.println("=================================");
			System.out.println("Total "+ distance +" KM	:" + firstFivePrice + " Rs.");
		} else if (distance>0 && (distance - 5) <= 15) {
			System.out.println("First 5 KM	: " + firstFivePrice + " Rs.");
			System.out.println("Next " + (distance - 5)+" KM @ 12 Rs.	: " + df.format((distance - 5)*12)+ " Rs.");
			System.out.println("=================================");
			System.out.println("Total "+ distance +" KM	:" + df.format(firstFivePrice + (distance - 5)*12) + " Rs.");
		} else  { 
			System.out.println("First 5 KM	: " + firstFivePrice + " Rs.");
			System.out.println("Next 15 KM @ 12 Rs.	: " + (15*12) + " Rs.");
			System.out.println("Next " + df.format(distance - 20) + " KM @ 14 Rs.: " + df.format((distance - 20) * 14) + " Rs.");
			System.out.println("=================================");
			System.out.println("Total "+ distance +" KM	:" + df.format((firstFivePrice +(15*12) + (distance - 20) * 14)) + " Rs.");
		}
		
		scan.close();
	}

}