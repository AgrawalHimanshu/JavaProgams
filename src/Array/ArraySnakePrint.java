package Array;

public class ArraySnakePrint {
	
	static void snakePrint(int a[][]){
		int flow=0;
		for(int i=0; i<a.length; i++){
			if(flow==0){ //Another way 
		//	if(i%2==0){ // One Way
				for(int j=0; j< a[i].length; j++){
					System.out.print(a[i][j] + " ");
				}
				System.out.print("\n");
				flow=1;
			}
			
			
			else{
				for(int j=a[i].length-1; j>=0; j--){
					System.out.print(a[i][j] + " ");
				}
				System.out.print("\n");
				flow=0;
			}
		}
		
	}
	
	
	public static void main(String args[]){
		
		int a[][]={{2,3,4,5},
				   {3,5,6,7,5,9,67},
				   {5,3,13,4,89,90, (int)18.0},
				   {6,7,9,64}
				   };
		snakePrint(a);
	}

}
