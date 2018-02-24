import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();
		System.out.println("The number is: " + number);

		int i, flag = 0;
		for (i = 2; i <= number / 2; i++) {
			System.out.println("==========" + i);
			if (number % i == 0) {
				flag = 1;
				break;
			}
		}

		if (flag == 1) {
			System.out.println("Number is not prime");
		}
		if (flag == 0)
			System.out.println("Number is prime");
	}
}
