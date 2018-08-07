import java.util.Scanner;

public class SolutionIFElse {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N%2 != 0){
            System.out.println("Weird");
        }
        else if(inRange(N,2,5) ){
            System.out.println("Not Weird");
        }
        else if(inRange(N,6,20)){
            System.out.println("Weird");
        }
        else if(N>20){
            System.out.println("Not Weird");
        }
        

        scanner.close();
    }
    
    public static boolean inRange(int i, int left, int right){
    	Boolean value = false;
        while(left<=right)
        {
            if(i == left){
            	value = true;
                break;
            }
            left++;
        }
        return value;
    }

}
