package Array;

import java.util.Arrays;

public class ArrayFirstLagestFirstSmallest {
	
	public static void main(String arr[]){
		int[] a = { 10, 8, 6, -19, 1, 3, 6, 9, 10, 5, 3, 2,9,12,100,-10,-19,-18,19};
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		Arrays.sort(a);
		
		int max = a.length-1;
		int min = 0;
		System.out.println(a.length);
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<=a.length-1; i++){
			if(max == min){
				b[i] = a[max];
				break;
				
			}
			b[i] = a[max];
			i++;
			b[i] = a[min];
			max--;
			min++;
		}
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));

		System.out.println(max);
		System.out.println(min);
		System.out.println(b.length);
		
		System.out.println(c.length);
	}

}
