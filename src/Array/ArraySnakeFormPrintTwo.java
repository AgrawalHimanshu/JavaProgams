package Array;

public class ArraySnakeFormPrintTwo {

	static void spiralPrint(int endingRowIndex, int endColumnIndex, int a[][]) {
		int i;
		int startRowIndex = 0;
		int startColumnIndex = 0;
		/*
		 * k - starting row index 
		 * m - ending row index 
		 * l - starting column index
		 * n - ending column index 
		 * i - iterator
		 */

		while (startRowIndex < endingRowIndex && startColumnIndex < endColumnIndex) {
			// Print the first row from the remaining matrix
			for (i = startColumnIndex; i < endColumnIndex; ++i) {
				System.out.print(a[startRowIndex][i] + " ");
			}
			startRowIndex++;
			System.out.print("\n");
			// Print the last column from the remaining matrix
			for (i = startRowIndex; i <endingRowIndex; ++i) {
				System.out.print(a[i][endingRowIndex - 1] + " ");
			}
			endingRowIndex--;
			System.out.print("\n");
			// Print the last row from the remaining rows
			if (startRowIndex < endingRowIndex) {
				for (i = endColumnIndex - 1; i >= startColumnIndex; --i) {
					System.out.print(a[startColumnIndex - 1][i] + " ");
				}
				endingRowIndex--;
			}
			System.out.print("\n");
			// Print the first column from the remaining columns
			if (startColumnIndex < endColumnIndex) {
				for (i = endingRowIndex - 1; i >= startRowIndex; --i) {
					System.out.print(a[i][startColumnIndex] + " ");
				}
				startColumnIndex++;
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R = 4;
		int C = 6;
		int a[][] = { { 1, 2, 3, 4, 5, 6 }, 
				{ 7, 8, 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16, 18, 18 },
				{ 11, 17, 12, 12, 1, 14 } };
		spiralPrint(R, C, a);
	}

}
