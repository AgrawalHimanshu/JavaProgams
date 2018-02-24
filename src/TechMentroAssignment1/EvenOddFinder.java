package TechMentroAssignment1;

import java.util.Scanner;

public class EvenOddFinder{
	public static void main(String[] arr){
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the no: ");
	int number = scan.nextInt();
	if(number%2==0){
		System.out.println(number+" is even");
}
	else{
		System.out.println(number+" is odd");
}
}

}
