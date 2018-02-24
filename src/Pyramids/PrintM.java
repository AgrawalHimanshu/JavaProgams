package Pyramids;

public class PrintM {
	public static void main(String args[]) {
		int i, j, k, n = 9;
		for (i = n; i >= 1; i--) {
			// For Space
			for (k = n; k > i; k--) {
				if (k == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// For * Print
			for (j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			// For print last column
			// For Space
			for (k = n - 2; k > i; k--) {
				System.out.print(" ");
			}
			// For * Print
			for (j = 1; j <= i; j++) {
				if (j == n) {
					System.out.print("");
				} else if (j == i) {
					System.out.print("*");
				}
			}

			// To Switch Line
			i--;
			System.out.println();
		}

		/*if (n % 2 == 0) {
			for (i = 4; i <= n; i++) {
				// For Space
				for (k = n; k > i; k--) {
					if (k == n) {
						System.out.print("*");
					}
					else{
					System.out.print(" ");
					}
				}
				for (j = 1; j <= i; j++) {
					if (j == 1 || j == i) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				for (k = n - 2; k > i; k--) {
					System.out.print(" ");
				}
				// For * Print
				for (j = 1; j <= i; j++) {
					if (j == n) {
						System.out.print("");
					} else if (j == i) {
						System.out.print("*");
					}
				}
				i++;
				System.out.println();
			}
		} else {
			for (i = 3; i <= n; i++) {
				for (k = n; k > i; k--) {
					if (k == n) {
						System.out.print("*");
					}
					else{
					System.out.print(" ");
					}
				}
				for (j = 1; j <= i; j++) {
					if (j == 1 || j == i) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				} 
				for (k = n - 2; k > i; k--) {
					System.out.print(" ");
				}
				// For * Print
				for (j = 1; j <= i; j++) {
					if (j == n) {
						System.out.print("");
					} else if (j == i) {
						System.out.print("*");
					}
				}
				// To Switch Line 
				
				i++;
				System.out.println();
			}
		}*/

	}
}
