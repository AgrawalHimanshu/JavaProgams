
public class FindPerson {

	
	
	public static void main(String args[]) {
		
		int count=0,j = 0, k = 0, l=0;
		
		int number = 2000;
		
		int n;
		
		n= number;
		
		while(n%2==0){
			n=n/2;
			count++;
		}
		
		System.out.println(count);
		
		int[] a = new int[number];

		int[] b = new int[number/2];

		int[] c = new int[number/4];
		
		int[] d = new int[number/8];
		

		for (int i = 0; i < number; i++) {
			a[i] = i + 1;
		}
		
		for (int i = 0; i < number; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
			if (i % 2 == 0) {
				b[j] = a[i];
				j=j+1;
			}
		}
		System.out.println();

		for (int i = 0; i < number/2; i++) {
			System.out.print(b[i]);
			System.out.print(" ");
			if (i % 2 == 0) {
				c[k] = b[i];
				k = k + 1;
			}
		}
		
		for (int i=0; i<c.length-1;i++){
			if (i % 2 == 0) {
				d[l] = c[i];
				l = l + 1;
			}
		}
		System.out.println();

		
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println(c[c.length-1]);

		/*
		 * for(int i =0 ; i<c.length; i++){ System.out.println(c[i]); }
		 */

	}

}
