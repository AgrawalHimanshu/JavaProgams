package ToCheck;

/*enum Month {
	
	RED, GREEN, BLUE;

}*/

class A{
	
	enum Month {
		
		RED, GREEN, BLUE;

	}
	
	enum B{
		C1, C2, C3,C4, C5;
	}
	
	static void test(){
		B b1 = B.valueOf("C2");
		System.out.println(b1);
		
		B b2 = B.C3;
		System.out.println(b2);
		
		System.out.println(b1.ordinal());
		
		System.out.println(b2.ordinal());
	}
	
	/*public static void main (String arr[]){
		Month c1 = Month.RED;
		System.out.println(c1);
		
		Month c2 = Month.GREEN;
		System.out.println(c2);
		
		Month c3 = Month.BLUE;
		System.out.println(c3);
	}*/
}

 public class Test{
	 public static void main(String args[]){
		 A.B b1 = A.B.C3;
		 System.out.println(b1);
		 
		 System.out.println(b1.ordinal());
		 
		 A.B b2 = A.B.C4;
		 System.out.println(b2);
		 
		 System.out.println(b2.ordinal());

		 
		 A.test();
	 }
	
}