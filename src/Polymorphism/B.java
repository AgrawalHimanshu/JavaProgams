package Polymorphism;

public class B extends A{
	
	B(int a){
		System.out.println("Constructor 1");
	}
	
	B(int a,int b){
		super();
		System.out.println("Constructor 2");
	}
	
	public void a(){
		
		System.out.println("Hello from B");
	}
	
	public void display(){
		super.a();
	}
		
	public static void main(String arr[]){
	

	B x = new B(8,7);
	
	x.a();
	
	x.display();
	
	/*x.getClass().getSuperclass().getMethods().*/
	
	}

}
