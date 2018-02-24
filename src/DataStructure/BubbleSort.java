package DataStructure;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[] = {7,4,3,2,1};
		int a[] = {2,7,4,1,5,3};
		
		int temp;
		
		for(int k=1; k<= a.length-1; k++){
			int flag =0;
			for(int i = 0; i<=a.length-k-1; i++){
				if(a[i]>a[i+1]){
					// Swap the value of ith and i+1 th index
					temp = a[i+1];
					a[i+1] = a[i];
					a[i] = temp;
					flag =1;
					
				}
				System.out.println(Arrays.toString(a));
			}
			if(flag==0){
				break;
			}
			System.out.println("---->");
			System.out.println(Arrays.toString(a));
		}
		
		for(int i=0; i<=a.length-1;i++){
			System.out.print(a[i] + " --> ");
		}
		
	}
}
