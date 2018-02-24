package Array;

public class ArraySpiralFormPrint {

	static void spiralPrint(int m, int n, int a[][], int b[]) {
		int i, k = 0, l = 0;
		/*
		 * k - starting row index m - ending row index l - starting column index
		 * n - ending column index i - iterator
		 */
		int x = 0;

		while (k < m && l < n) {
			// Print the first row from the remaining rows
			for (i = l; i < n; ++i) {
				System.out.print(a[k][i] + " ");
				b[x] = a[k][i];
				x++;
			}
			k++;

			System.out.print("\n");

			// Print the last column from the remaining columns
			for (i = k; i < m; ++i) {
				System.out.print(a[i][n - 1] + " ");
				b[x] = a[i][n - 1];
				x++;
			}
			n--;

			System.out.print("\n");

			// Print the last row from the remaining rows */
			if (k < m) {
				for (i = n - 1; i >= l; --i) {
					System.out.print(a[m - 1][i] + " ");
					b[x] = a[m - 1][i];
					x++;
				}
				m--;
			}

			System.out.print("\n");

			// Print the first column from the remaining columns */
			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					System.out.print(a[i][l] + " ");
					b[x] = a[i][l];
					x++;
				}
				l++;
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R = 4;
		int C = 6;

		int b[] = new int[R * C];
		int a[][] = { { 1, 2, 3, 4, 5, 6 }, 
				{ 7, 8, 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16, 18, 18 },
				{ 11, 17, 12, 12, 1, 14 } };
		spiralPrint(R, C, a, b);
		System.out.print("\n");
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i] + " ");
		}
	}

}
