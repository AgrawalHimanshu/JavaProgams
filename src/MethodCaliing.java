
public class MethodCaliing {
	
	public void print(String s){
		System.out.println(s);
		System.out.println();
	}
	
	public void print(int i){
		System.out.println(i);
	}
	
	public void print(float f){
		System.out.println(f);
	}
	
	public static void main (String args[]){
		MethodCaliing mc = new MethodCaliing();
		mc.print(null);
	}

}
