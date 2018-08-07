package ToCheck;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Scanner;

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
		System.out.println("This is a normal constructor");
	}
static{
	System.out.println("static block");
	//a=9;
}

static New n = new New("2");

static New n1 = new New();

static{
	System.out.println("Static Block 2");
}

{
	System.out.println("Anonymous Block");
}

{
	System.out.println("Anonymous Block2");
}


	
	
	public static void main(String[] args) throws IOException {
		PrintStream pr = new PrintStream(System.out);
		pr.println("Hello on System Console");
		//PrintStream pr = new PrintStream("MineConsole.txt");
		PrintStream pr1 = new PrintStream("Book1.xls");
		pr1.print("Username: "); pr1.print("\t"); pr1.print("username");
		pr1.print("\n");
		pr1.print("Password: " + "password");
		int a;
		a=5;
		//BufferedReader bf = new BufferedReader();
		Scanner sc = new Scanner("MineConsole.txt");
		String sr = sc.nextLine();
		System.out.println(sr);
		Properties prop = new Properties();
		
		FileReader fr = new FileReader("MineConsole.properties");
		
		prop.load(fr);
		
		String username = prop.getProperty("Username");
		System.out.println(username);
		System.out.println(prop.getProperty("Password"));
		
		
		
		
	//	n.method();
	//	System.out.println("Hello");
		//System.out.println(n.a);
	}
	
	public void method(){
		System.out.println("This is Another method in class New");
	}

}
