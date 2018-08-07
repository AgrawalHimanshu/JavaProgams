package lara.innrerClass;

public class C {
	
	int i;
	
	static int j;
	
	 class D{
		
		static final int k=10;		
		
		//static k=10;
		
		/*static final void test3(){
			
		}*/
	}
	 
	 static final void test3(){
			
	}
	
	static class E{
		
		void test5(){
			//i =1 ;
		}
	}
	
	void test1(){
		i = 1;
		j = 2;
		
		D d1 = new D();
		E e1 = new E();
		System.out.println("d1 and e1 are created");
		test1();
		
		test2();
	}
	
	static void test2(){
		//i = 1;
		j = 2;
		
		E e1 = new E();
		test2();
	}
	
	public static void main(String... arr){
		
		E e1 = new E();
		E e2 = new C.E();

		D d1 = null;
		
		d1 = new C().new D();
		 
		C c = new C();
		c.test1();
	}

}
