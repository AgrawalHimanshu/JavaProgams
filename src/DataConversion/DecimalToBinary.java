package DataConversion;

import java.util.Arrays;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13;
	      // String binaryString =input.nextLine();
	       System.out.println("Output:" + getBinaryFromNumber(number));
	}



public static String getBinaryFromNumber(int number){
        
	 int binary[] = new int[40];    
     int index = 0;   
      
     while(number > 0){    
         binary[index++] = number%2;    
         number = number/2;    
       }    
        return String.valueOf(binary);
        
    }
}
