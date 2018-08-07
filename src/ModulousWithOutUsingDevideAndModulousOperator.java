
public class ModulousWithOutUsingDevideAndModulousOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 25;
		int j = 4;
		int divider =j;
		
		while (i>j){
			j = j+divider;
		}
		
		if(i==j){
		System.out.println("Result of Modulous: " + 0);
		}
		else{
			System.out.println("Result of Modulous: " + (i - (j - divider)));

		}
	}
	
	public int division(int i, int j){
		
		
		 return 0;
	}

}
