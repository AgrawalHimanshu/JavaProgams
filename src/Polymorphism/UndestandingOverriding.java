package Polymorphism;

public class UndestandingOverriding {

	public static void main(String... args){
		XYZ x = new XYZ();
		x.a();
		x.display();
		x.display2();
	}
}



class ABC{
	
	public void a(){
		System.out.println("In ABC- a");
	}
	
	public void b(){
		System.out.println("In ABC- b");
	}
	
	
}


class XYZ extends ABC {
	
	public void a(){
		System.out.println("In XYZ-a");
	}
	
	public void display(){
		super.a();
	}
	
	
	public void display2(){
		this.a();
	}
	
}
