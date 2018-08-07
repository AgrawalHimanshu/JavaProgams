package TechMentroAssignment2;

import java.util.Scanner;

public class DigitsCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Number:");
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		int number = i;
		int digitCount = 0;
		
		while(i%10 !=0){
			i = i/10;
			digitCount++;
		}
		
		System.out.println(number + " is a " + digitCount + " Digit Number");

	}

}
