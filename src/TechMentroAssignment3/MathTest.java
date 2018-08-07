package TechMentroAssignment3;

public class MathTest {

	public static void main(String[] args) {
		
		Number a = new Number(5);
		Number b = new Number(6);
		
		System.out.println("Value of a=" + a.value);
		System.out.println("Value of b=" + b.value);
		
		Number c;
		c = Math.add(a, b);
		
		System.out.println("Sum of value a and b: " + c.value);
		
		c = a.add(b); // Here we are passing two argument, One is in form of object and another is in form of parameter
		
		System.out.println("Now the Sum is: " + c.value);
		
		c = Math.substraction(a, b);
		
		System.out.println("Substraction of a and b is: " + c.value);
		
		c = Math.dividation(a, b);
		
		System.out.println("Dividation of a and b is: " + c.valueTwo);
		
		c = Math.multiplication(a, b);
		
		System.out.println("Multiplication of a and b is: " + c.value);
		
		
	}

}

class Math{
	public static Number add(Number x, Number y){
		int z = x.value+y.value;
		return new Number(z);	
	}
	
	public static Number substraction(Number x, Number y){
		int z = x.value - y.value;
		return new Number(z);	
	}
	
	public static Number multiplication(Number x, Number y){
		int z = x.value * y.value;
		return new Number(z);	
	}
	
	public static Number dividation(Number x, Number y){	
		float z =  (float) x.value / y.value;
		return new Number(z);	
	}
}

