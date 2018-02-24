package TechMentroAssignment2;

import java.util.Scanner;

public class NumberLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		  System.out.println("Enter Value for the ladder");
		  int n = scan.nextInt();
		
		for(int i = 1 ; i<=n; i++){
			
			for(int j=1; j<=i ; j++ ){
				System.out.print( j + " ");
			}
			
			for(int j=i; j>1 ; j-- ){
				System.out.print( j-1 + " ");
			}
			
			
			System.out.print("\n");
			
		}
		scan.close();
	}
}


