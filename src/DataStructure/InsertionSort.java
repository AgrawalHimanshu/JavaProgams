package DataStructure;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {7,4,3,2,1};
		String Str[] = {"Kishan", "Raman", "Kiran"};
		int value, index;
		
		
		for(int i=1; i<=a.length-1;i++){
			value = a[i];
			index = i;
			while(index>0 && a[index-1]>value){
				a[index] = a[index-1] ;
				index = index-1;
			}

			a[index] = value;
			System.out.println(Arrays.toString(a));

		}
		

		for(int i=0; i<=a.length-1;i++){
			System.out.print(a[i] + " --> ");
		}
		
	}

}
