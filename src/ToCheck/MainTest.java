package ToCheck;

class UnderstandMain {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		main(new int[]{1, 2, 3});
		main(new String[]{"Hello", "There", "You"}, new int[]{2,3});

	}*/	
	public static void main(int[] args){
		System.out.println("Hello From Overloaded Main");
	}
	
	public static void main(String arr[], int agrs[]){
		System.out.println("Hello from overrided main");
		
	}

}

class OverloadedMain extends MainTest {
	public static void main(int[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from Overrided main");

	}	
}

class MainTest{
	public static void main(String args[]){
		UnderstandMain.main(new String[]{"Hello", "There", "You"}, new int[]{2,3});
		//OverloadedMain.main(args);
	}
}
