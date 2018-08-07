package DataStructure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = {2,7,4,1,5,3};
	//	int a[] = {13,19,9,5,12,8,7,4,11};
	//	int a[] = {5,8,7,9};
		String a[] = {"H", "T", "Y"};
		quickSort(a, 0, a.length-1);
		
		//quickSort(a,0,a.length-1);
		
		/*for(int i=0; i<=a.length-1;i++){
			System.out.print(a[i] + " --> ");
		}*/
	}


	private static void quickSort(int a[], int p, int r) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(a));
		if (p < r ){
			int q = partition(a, p, r);
			quickSort(a, p, q-1);	
			quickSort(a, q+1, r);	
		}
	}
	
	private static void quickSort(String a[], int p, int r) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(a));
		if (p < r ){
			int q = partition(a, p, r);
			quickSort(a, p, q-1);	
			quickSort(a, q+1, r);	
		}
	}
	
	private static int partition(String a[], int p, int r){
		int n = Integer.parseInt(a[r]);
		int i = p-1;
		System.out.println("Pivot Element = " + n);
		for(int j = p; j<=r-1; j++){
			if(Integer.parseInt(a[j]) <= n){
				i = i+1;
				int temp = Integer.parseInt(a[i]);
				a[i]=a[j];
				a[j]= String.valueOf(temp);
			}
		}
		
		int temp =  Integer.parseInt(a[i+1]);
		a[i+1] = a[r];
		a[r]=String.valueOf(temp);
		
		return i+1;
		
	}
	
	private static int partition(int a[], int p, int r){
		int n = a[r];
		int i = p-1;
		System.out.println("Pivot Element = " + n);
		for(int j = p; j<=r-1; j++){
			if(a[j] <= n){
				i = i+1;
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		int temp = a[i+1];
		a[i+1] = a[r];
		a[r]=temp;
		
		return i+1;
		
	}

}
