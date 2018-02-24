package ToCheck;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class New {

	int a=8;
	int b =9;
	{
		System.out.println("Anonymous Block3");
	}

	New(String a){
		System.out.println("This is a parameterized constrcutor");
	}
	New() {
		// TODO Auto-generated constructor stub
	}
static{
	System.out.println("static block");
//	a=9;
}

static New n = new New("2");

static{
	System.out.println("Static Block 2");
}

{
	System.out.println("Anonymous Block");
}

{
	System.out.println("Anonymous Block2");
}


	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//PrintStream pr = new PrintStream("MineConsole.txt");
		PrintStream pr1 = new PrintStream("MineConsole.txt");
		pr1.println("Hello");
		int a;
		a=5;
		n.method();
		System.out.println("Hello");
		//System.out.println(n.a);
	}
	
	public void method(){
		System.out.println("This is Another method in class New");
	}

}
