package String;

public class StringBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello/There/You";
		
		String [] s2 = s.split("/");
		
		String s3 = (s2[2].toString());
		
		System.out.println(s3);

	}

}
