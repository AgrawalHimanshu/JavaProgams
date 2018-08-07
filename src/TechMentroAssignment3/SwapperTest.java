package TechMentroAssignment3;

public class SwapperTest {

	public static void main(String arr[]){
		int a = 5,  b = 6;
		System.out.println("Before Swapping: Value of a and b is " + a + " and " + b);
		Swapper.swap(a, b);
		System.out.println("After Swapping: Value of a and b is " + a + " and " + b);
	}

}


class Swapper{
	
	public static void swap(int x, int y){
		int z = y;
		y = x;
		x=z;
	}
	
	public static void swap(Number x, Number y){
		int z = x.value;
		x.value = y.value;
		y.value = z;
	}
}

class Number{
	int value;
	float valueTwo;
		
	public Number(int x){
		 value = x;
	}
	
	public Number(float y){
		valueTwo = (float) y;
	}
	
	public Number add(Number x){
		int z = value + x.value;
		Number n = new Number(z);
		return n;
	}
}
