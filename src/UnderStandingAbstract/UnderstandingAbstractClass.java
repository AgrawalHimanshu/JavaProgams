package UnderStandingAbstract;

public class UnderstandingAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ABC abc2 = new XYZ();
		
		abc2.b();

	}

}	
abstract class ABC{
	
	public ABC(){
		System.out.println("Abstract class constructor ABC() ");
	}
	
	//public abstract int z();
	
	public void a(){
		System.out.println("a");
	}
	
	public void b(){
		System.out.println("b");
	}
	
	public void c(){
		System.out.println("c");
	}
}


class XYZ extends ABC {
	
	public void b(){
		System.out.println("XYZ -> b");
	}
	
	public void c(){
		System.out.println("XYZ -> c");
	}
	
}

