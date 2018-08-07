
public class MethodCalling {
	
/*	public void print(){
		System.out.println();
	}
	*/
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
		MethodCalling mc = new MethodCalling();
		mc.print(8);
		//mc.print();
		mc.print(null);
		mc.print("null");
		mc.print("Hello");



	}

}
