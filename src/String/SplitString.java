package String;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello.Himanshu.Agrawal";
		
		String arr[] = s1.split("\\.");
		
		for(int i =0; i<=arr.length-1; i++){
			System.out.println(arr[i]);
		}
		//System.out.println("Hello ");
	}

}
