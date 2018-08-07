
package ToCheck;

import java.awt.*;
import static java.lang.Long.MAX_VALUE;

import static java.lang.System.*;
//import static java.lang.Integer.MAX_VALUE;

public class Check4 {
	
	public static void main(String args[]){
		
		/*int ms = 50;
		for ( int frequency = 100; frequency < 1000; frequency += 10 ) {
			System.out.println(frequency);
	        Console.Beep( frequency, ms );
	    }*/
		Toolkit.getDefaultToolkit().beep();
		
		out.println(Integer.MAX_VALUE);
		out.println(Integer.MIN_VALUE);
		//exit(1);
	
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		
		System.out.println(MAX_VALUE);
	}

}
