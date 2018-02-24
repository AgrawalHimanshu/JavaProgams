package Pyramids;

public class PintX {
	public static void main(String args[]) {
		int i, j, k, n = 9;
		for (i = n; i >= 1; i--) {
			// For Space
			for (k = n; k > i; k--) {
					System.out.print(" ");
			}
			// For * Print
			for (j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			// To Switch Line
			i--;
			System.out.println();
		}

		if (n % 2 == 0) {
			for (i = 4; i <= n; i++) {
				// For Space
				for (k = n; k > i; k--) {
					System.out.print(" ");
				}
				for (j = 1; j <= i; j++) {
					if (j == 1 || j == i) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				
				}
				i++;
				System.out.println();
			}
		} else {
			for (i = 3; i <= n; i++) {
				for (k = n; k > i; k--) {		
					System.out.print(" ");
				}
				for (j = 1; j <= i; j++) {
					if (j == 1 || j == i) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				} 
				// To Switch Line 
				i++;
				System.out.println();
			}
		}

	}
}
