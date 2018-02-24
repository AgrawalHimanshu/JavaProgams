
public class NewProgram {

	public static void main(String args[]) {
		int row, column1, column2;
		// Total number of rows it will iterate
		for (row = 1; row <= 5; row++) {
			// used for printing spaces
			for (column1 = 1; column1 <= 5 - row; column1++) {
				System.out.print(" ");
			}
			// used for printing numbers
			for (column2 = 1; column2 <= row; column2++) {
				//System.out.print((char) (column2 + 64) + " ");
				System.out.print(column2 + " ");
			}
			System.out.println("");
		}
		
		for (row = 1; row <= 4; row++) {
            // used for printing spaces
            for (column1 = 1; column1 <= row; column1++) {
                // single space
                System.out.print(" ");
            }
            // used for printing numbers
            for (column2 = 1; column2 <= 5 - row; column2++) {
                System.out.print(column2 + " ");
            }
            System.out.println();
        }
	}

}
