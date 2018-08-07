import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factorial {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = scanner.nextInt();
		int result = Fact(number);

		System.out.println(result);

	}

	public static int Fact(int num) {
		while(num>0){
            return num*(Fact(num-1));
        }
		
		return 1;
	}
}
