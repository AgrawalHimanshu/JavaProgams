package Exception;

import java.util.Scanner;

public class CustomeExceptionClasses {

	static void validate() throws QaIncorrectChoiceException, QaNumberValidationException, QaTextValidationException{
		if (!choice.equals("N") && !choice.equals("T")) {
			throw new QaIncorrectChoiceException("QaIncorrectChoiceException.");
		} 
		else{ 
			if (choice.equals("N") && numberOrNot(value)) {
				int number = Integer.parseInt(value);
				int sqrt = (int) Math.sqrt(number);
				if (sqrt * sqrt == number) {
					System.out.println("Number is a perfect square");
				} else {
					System.out.println("Number is not a perfect square");
				}
			}
			if(choice.equals("T") && !numberOrNot(value)){
				int flag =0;
				for(int i=0;i <value.length();i++){
		            if((value.charAt(i) == 'a') || 
		                (value.charAt(i) == 'e')  ||
		                (value.charAt(i) == 'i') || 
		                (value.charAt(i) == 'o') ||
		                (value.charAt(i) == 'u')) {
		            	flag =1;
		         }
				}
		            if(flag ==1){
		            	 System.out.println("Text contain vowels.");
		            }
		            if(flag == 0){
		                System.out.println("Text does not have vowels");
		            }
		        
			}
			if(choice.equals("T") && numberOrNot(value)){
				throw new QaTextValidationException("QaTextValidationException.");
			}
			if(choice.equals("N") && !numberOrNot(value)){
				throw new QaNumberValidationException("QaNumberValidationException.");
			}
		}
	}

	static boolean numberOrNot(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException ex) {
			return false;
		}
		return true;
	}

	static String choice;
	static String value;

	public static void main(String args[]) {

		System.out.println("First input is choice: N or T");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextLine();
		// char ch = s.charAt(0);
		System.out.println("Second input is value: 2 , Luv , 50 , aaa");
		value = sc.nextLine();
		try {
			validate();
		} catch (Exception e) {
			System.out.println(e);

		}

	}

}
