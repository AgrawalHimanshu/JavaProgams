
public class Equation {
	
	public static void main(String args[]){
		int a = 3;
		int b = 2;
		//int c = a++ + a++ + a++ + ++a + ++a + ++a + ++a + ++a + b + b++ + ++b;
		int d = a++ + ++a + b + ++a + ++a + b++ + ++a + a++ + a++ + ++a + ++b;
		System.out.println(d);
		//System.out.println(c);
	}

}
