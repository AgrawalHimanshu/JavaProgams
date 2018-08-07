package Array;
import java.util.Arrays;

public class DuplicateElementInArray {

	public static void main(String arr[]) {
		long startTime = System.nanoTime();

		int[] a = { 11, 12, 11, 12, 13, 13, 13, 13, 13, 12,11, 18,18,12};
		int i;
		Arrays.sort(a);

		System.out.println(Arrays.toString(a));
		int count = 1;
		for (i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				count++;
				// to consider the last element
				if(i+1 ==a.length-1){
					System.out.println(a[i] + "   " + count);
				}
			}
			

			else {
				System.out.println(a[i] + "   " + count);
				count = 1;
			}

		}
		//System.out.println(a[i] + "   " + count);

		long endTime = System.nanoTime();
		long TotoalTime = endTime - startTime;
		System.out.println(TotoalTime);

	}

}
