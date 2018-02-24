package DataConversion;

public class BinaryToDecimal {

	public static void main (String args[]){
		//  Scanner input = new Scanner( System.in );
		int binaryString = 1101;
	      // String binaryString =input.nextLine();
	       System.out.println("Output:" + getDecimalFromBinary(binaryString));
	}
	
	public static int getDecimalFromBinary(int binary){
        
        int decimal = 0;
        int power = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int tmp = binary%10;
                decimal += tmp* Math.pow(2, power);
                binary = binary/10;
                power++;
            }
        }
        return decimal;
    }
}
