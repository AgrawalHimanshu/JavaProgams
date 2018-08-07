package ToCheck;

public class Manager11 {
	
	enum A{
		CON1, CON2, 
		CON3
		{
			void test()
			{
				System.out.println("CSCB-test");
			}
		}, CON4, CON5;
		
		void test(){
			System.out.println("test");
		}
	}
	
	public static void main(String args[]){
		A a1 = A.CON5;
		A a2 = A.CON1;
		
		A a3 = A.CON3;
		A a4 = A.CON4;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		a1.test();
		a3.test();
		
		a2.test();
		
		a4.test();
		


		
	}

}
