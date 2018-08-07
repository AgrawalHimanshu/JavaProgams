import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadDataFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] a = readData();
		
		System.out.println(a[0]);
		System.out.println(a[1]);

	}
	
	
	public static Object[] readData(){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Please Enter Series:   ");
		System.out.println("Enter a Number to continue.... or N to stop entering");

		
		while (true){
			
			try{
			int i = sc.nextInt();
			al.add(i);
			}
			catch(Exception e){
				break;				
			}
		}
		System.out.println(al.size());
		return al.toArray();
	}

}
