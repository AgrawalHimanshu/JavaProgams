package UnderstandList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateAnotherList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ArrayList <int> A = new ArrayList<int>();*/
		
		int[] A = {1,2,4,7};
		
		int B[] = new int[3];
		
		Arrays.sort(A);
		
		for(int i = 0; i<A.length-1 ; i++){
			B[i] = A[i];
		}
		
		System.out.println(Arrays.toString(B));
		for(int k=0 ; k< B.length; k++){
			System.out.print(B[k]);

		}
		
	}

}
