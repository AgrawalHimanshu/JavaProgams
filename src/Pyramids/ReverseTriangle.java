/*   	* * * * *
 * 	     * * * *
 *        * * *
 *         * *
 *          *
*/


package Pyramids;

public class ReverseTriangle {

	public static void main(String args[]){
		int i,j, n=5;
		for(i=n; i>=1; i-- ){
			for(j=n; j>i;j--){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			for(j=1; j<i; j++){
				System.out.print("*");
			}
		System.out.print("\n");
		}
	}
}
