package Array;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		
		int arr[] = {798,897,78,867,76,900,-1,0,899};
		
		/*Arrays.sort(arr);
		
		System.out.println(arr[]);*/
		
		int first_largest = arr[0];
		int second_largest = arr[0];
		
		for(int i = 1; i<= arr.length-1; i++){
			
			if(arr[i]>first_largest){
				second_largest = first_largest;
				first_largest = arr[i];
			}
			else if (arr[i]>second_largest){
				second_largest = arr[i];
			}
		}
		
		System.out.println(second_largest);
	/*	System.out.println(true != false);
		
		String s1 = "NAMAN";*/
		

	}

}
