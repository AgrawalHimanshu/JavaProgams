package UnderstandConstructor;

public class PrivateConstructor {

	private static String color  = "White";
	
	private PrivateConstructor(String color){
		//this.color = color;
		System.out.println(color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateConstructor p1 = new PrivateConstructor("Black");
		
	}

}
