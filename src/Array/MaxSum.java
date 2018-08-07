package Array;

public class MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12,4,6,5,17,6,7,19};
		int sum = 0;
		int previous=0;
		
		for(int i = 0; i<a.length-2 ; i++){
			if(sum > previous){
				previous = sum;
			}
			sum  = a[i] + a[i+2];
			System.out.println(a[i] + " + " + a[i+2] + " = " + sum);
		}
		
		if (sum> previous){
			System.out.println("Maximum sum: " + sum);
		}
		else{
			System.out.println("Maximum sum: " + previous);

		}		
	}

}
