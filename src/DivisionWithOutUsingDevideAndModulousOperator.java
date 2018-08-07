
public class DivisionWithOutUsingDevideAndModulousOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Division of two number: " + division(99,7));
		
		System.out.println("Modulous of two number: " + mod(99,7));
		
		System.out.println("Addition of two number: " + add(-89,7));


		System.out.println(negate(18));
		System.out.println(sub(18,9));
		System.out.println(mul(9,9));
		System.out.println(divide(100,10));


	}
	
	static int divide(int x,int y){
	    int c=0,sign=0;
	 
	    if(x<0){
	        x=negate(x);
	        sign^=1;
	    }
	     
	    if(y<0){
	        y=negate(y);
	        sign^=1;
	    }
	 
	    if(y!=0){
	        while(x>=y){
	            x=sub(x,y);
	            ++c;
	        }
	    }
	    if(sign !=0){
	        c=negate(c);
	    }
	    return c;
	}
	
	static int mul(int x, int y){
	    int m=1, z =0;
	    if(x<0){
	        x=negate(x);
	        y=negate(y);
	    }
	 
	    while(x>=m && y!=0) {
	        if ((x &m)!=0) z=add(y,z);
	        y <<= 1; m<<= 1;
	    }
	    return z;
	}
	
	public static int divisionWithBitwise(int i, int j){
		int divisor = i;
		int divider = j;
		int  t = (i-j);
		if(t>0){
			
		}
		return 0;
		
		
	}
	static int negate(int x){
	    return add(~x,1);
	}
	
	static int sub(int x,int y){
	    return add(x,negate(y));
	}
	
	static int add(int x,int y){
	    int a,b;
	    do{
	        a=x&y;
	        b=x^y;
	        x=a<<1;
	        y=b;
	    }while(a!=0);
	    
	    return b;
	}
	
	public static int division(int i, int j){
		int divisor = i;
		int divider = j;
		int k = divider;
		int count =0;
		while (divisor>divider){
			divider = divider + k;
			count++;
		}
		
		if(divisor==divider){
		return((count+1));
		}
		else{
			return(count);
		}

	}
	
	public static int mod(int i, int j){
		int divisor = i;
		int divider = j;
		int k = divider;
		
		while (divisor>divider){
			divider = divider+k;
		}
		
		if(divider==divisor){
		return(0);
		}
		else{
			return(divisor - (divider - k));

		}

	}


}
