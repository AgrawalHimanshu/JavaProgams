package ToCheck;

public class New5 {

	private static int $;
	static String s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(s);
		System.out.println($);*/
		
		AB ab1 =  new BC();
		ab1.m1();
		
	}

}

class AB{
	public void m1(){
		System.out.println("in AB m1");
	}
}

class BC extends AB{
	public void m1(){
		System.out.println("in BC m1");
	}
	
	public void m2(){
		System.out.println("in BC m2");
	}
}