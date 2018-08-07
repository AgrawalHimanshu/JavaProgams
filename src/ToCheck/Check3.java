package ToCheck;

import java.awt.AWTException;
import java.awt.MultipleGradientPaint.ColorSpaceType;
import java.awt.Robot;

public class Check3 {
	
	static int i,j;
	
	static{
		System.out.println("Hello2 ");
		j=20;
	}
	static{
		System.out.println("Hello ");
		i=10;
	}
	
	
	
	/*private Check3(){
		
	}*/
	
	/*public static void main(String args[]){
		int j=0;
		for(int i=0; i<100 ; i++){
			//System.out.println(j);
			j++;
			//System.out.println(j);
		}
		
		System.out.println(j);
	}*/
	
	 public static void main (String[] args) throws AWTException 
	 { 
		 /*int b;
		int a=b=10; 
		 System.out.println("a="+a);
		 System.out.println("b="+b);*/
		 
		 int a=10,b=5; 
		 boolean x = a++ > 10 && ++b > 5;
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		 System.out.println(x);

		 /*int a=10,b; 
		 b=~a; 
		 System.out.println("a="+a);
		 System.out.println("b="+b);*/
		 
		/* int a=5,b; 
		 b= a << 2; 
		 System.out.println("a="+a);
		 System.out.println("b="+b);*/
		 
		/* float a = 12.45f;
		 float c = 13.56f;
		 float b = c%a;
		 System.out.println(b);*/
		 //System.out.printf("hello");
		 
		 //Manager c1 = Manager.Blue;
		// System.out.println(c1);
		 
		
	/*	 
		 Robot rb = new Robot();
		 
		 rb.keyPress(69);
		 
		 rb.keyRelease(69);
		 */
	 } 
	
	static{
		System.out.println("Hello at the end");
	}

}
