package TechMentroAssignment2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Check if it is prime numbe:");
		
		int i = sc.nextInt();
		int flag=0;
		if(i==0||i==1){  
			   System.out.println(i+" is not prime number");      
			  }
		else{
		for(int k=2 ; k<=i/2; k++){
			if(i%k == 0){
				flag = 1;
				break;			
			}
		
		}
		
		if(flag == 0){
			System.out.println("Number is a prime number");
		}
		
		else{
			System.out.println("Number is not a prime number");
		}
		}
		
	}

}
