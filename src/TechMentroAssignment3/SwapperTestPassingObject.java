package TechMentroAssignment3;

public class SwapperTestPassingObject {
	
	public static void main(String arr[]){
	Number a = new Number(5);
	Number b = new Number(6);
	
	System.out.println("Value of a = " + a.value );
	System.out.println("Value of b = " + b.value );
	
	Swapper.swap(a, b);
	
	System.out.println("After Swapping... ");
	
	System.out.println("Value of a = " + a.value );
	System.out.println("Value of b = " + b.value );
	
	}
	
}
