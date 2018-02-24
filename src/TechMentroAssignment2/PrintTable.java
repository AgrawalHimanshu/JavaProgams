package TechMentroAssignment2;
import java.util.Scanner;

public class PrintTable {
	
	
	public void printTable(){
		
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		
		for(int k=1; k<=10; k++){
			System.out.println(i + " X " + k + " = " + i*k);
		}
		sc.close();
	}

	public static void main (String args[]){
		
		System.out.println("Please Enter the Number for which you want to print table: ");

		PrintTable pt = new PrintTable();
		pt.printTable();
		
			
		
		
	}
}
