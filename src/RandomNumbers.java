import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int n = 10;
		rand(n);
		
	}
	
	public static void rand(int n) throws InterruptedException{
		int count=0;
		
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(44100);
		      System.out.println(randomInt);
		   /* for (int idx = 1; idx <= n; ++idx){
		    	
		      int randomInt = randomGenerator.nextInt(100);
		      System.out.println(randomInt);
		    }    */
	}

}