package TechMentroAssignment1;

import java.util.Scanner;

public class LeapYearFinder{
	public static void main(String[] arr){
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a Year: ");
	int year = scan.nextInt();
	if(((year % 4 == 0) && (year % 100 != 0) )){
		System.out.println(year+" is a leap year");
}
	else if (year % 400 == 0){
		System.out.println(year+" is a leap year");
	}
	else
		System.out.println(year + " is not a leap year.");
}

}
