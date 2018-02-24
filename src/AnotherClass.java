
public class AnotherClass {
	void convert(int num, int base){
		int rem;
		rem = num%base;
		num /= base;
		if(num>0)
			convert(num,base);
		if(rem<10)
			System.out.printf("%d",rem);
		else
			System.out.printf("%c",rem-10+'A');
	}
	
	void pascalTriangle(int n){
		int a[][] = null;
		for(int i=0;i<=n;i++){
			for(int j=0;j<=i;j++){
				if(j==0||i==j)
					a[i][j]=1;
				else
					a[i][j] = a[i-1][j-1]+a[i-1][j];
			}
		}
	}
	
	void pyramids(int n){
		int p=1,i,j;
		for(i=1;i<=n;i++){
			for(j=1;j<=n-i;j++){
				System.out.printf(" ");
			}
			for(j=1;j<=i;j++){
				System.out.printf("*");
			}
			for(j=1;j<i;j++){
				System.out.printf("*");
			}
			System.out.println();
		}
		for(i=1;i<=n-1;i++){
			for(j=1;j<=i;j++){
				System.out.printf(" ");
			}
			for(j=1;j<=n-i;j++){
				System.out.printf("*");
			}
			for(j=1;j<n-i;j++){
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	void pyramids2(int n){
		int p=1,i,j;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.printf(" ");
			}
			for(j=1;j<=n-i;j++){
				System.out.printf("*");
			}
			for(j=1;j<n-i;j++){
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	void pyramids3(int n){
		int i,j,c=10,k=10,l;
		for(i=1;i<=n;i++){
			c--;
			for(j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(;k>c;k--){
				if(k==c)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			for(j=1;j<=n-i;j++){
				System.out.print(" ");
			}
		System.out.print("\n");	
		}}	
		
		
		void pyramids4(int n){
			int i,j,c=n;
			for(i=1;i<=n;i++){
				c--;
				for(j=c;j>=1;j--){
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++){
					if(k==1)
						System.out.print("* ");
					else	if (k==i)
						System.out.print("*");
					else
						System.out.print("  ");
				}
				System.out.print("\n");	 
				
			
			}	
	}
	
	
}
