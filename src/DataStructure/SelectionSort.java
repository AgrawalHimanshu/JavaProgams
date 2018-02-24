package DataStructure;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,4,3,2,1};
		
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(a));
		System.out.print("\n");

		int temp;
		
		for (int i =0; i<a.length-1; i++){
			
			int min = i;
			for(int j=i+1; j<a.length; j++){
				if(a[j] < a[min]){
					min = j;
				}
				
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
				System.out.println(Arrays.toString(a));
			}
			
			System.out.println("---->");
			System.out.println(Arrays.toString(a));
			
		}
		
		System.out.print("\n");
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a));
	}

}
