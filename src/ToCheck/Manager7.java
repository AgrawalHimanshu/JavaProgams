package ToCheck;

enum Y{
	A,B,C,D;
}

public class Manager7 {
	
	enum X{
		A,B,C,D;
	}
	
	enum E{
		CON, TEST(30), REGH(45,60);
		
		E(){
			
		}
		
		E(int i, int j){
			
		}
		
		E(int i){
			
		}
		
		public static void main(String arr[]){
			System.out.println("Hello");
			E e1 = E.TEST;
			
			System.out.println(e1);
		}
	}
	
	public static void main(String arr[]){
		System.out.println(Y.A);
		X x1 = X.C;
		
		switch(x1){
		
		case A:
		{
			System.out.println("in A");
			break;
		}
		
		case B:
		{
			System.out.println("in B");
			break;
		}
		
		case C:
		{
			System.out.println("in C");
			break;
		}
		
		case D:
		{
			System.out.println("in D");
			break;
		}
		}
		
		System.out.println("Done");
		
		E e1 = E.TEST;
		
		System.out.println(e1);
	}

}
