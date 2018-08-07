package Array;

public class ArraySnakePrintThree {

	static void snakePrint(int a[][]) {
		for (int i = 0; i < a.length; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.print("\n");

			}

			else {
				for (int j = a[i].length - 1; j >= 0; j--) {
					System.out.print(a[i][j] + " ");
				}
				System.out.print("\n");

			}
		}

	}

	public static void main(String args[]) {

		int a[][] = { { 2, 3, 4, 5 }, 
				{ 3, 5, 6, 7, 5, 9, 67 }, 
				{ 5, 3, 13, 4, 89, 90, 67 },
				{ 6, 7, 9, 64 } };
		snakePrint(a);
	}
}
