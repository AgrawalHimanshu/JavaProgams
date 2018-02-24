package TechMentroAssignment2;

import java.util.Scanner;

public class BinaryLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		  System.out.println("Enter Value for the ladder");
		  int n = scan.nextInt();
		
		for(int i = 1 ; i<=n; i++){
			
			
				System.out.print( Integer.toBinaryString(i) + " ");
			
			
			
			
			System.out.print("\n");
			
		}
		scan.close();
	}
}


