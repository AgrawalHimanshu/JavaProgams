package String;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 12345;
		
		System.out.println("number: " + i);
		
		int j = reverse(i);
		System.out.println("Reverse Number: " + j);
	}
	
	public static int reverse(int k){
		
		String s = String.valueOf(k);
				
		char[] strChars = s.toCharArray();
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int l=strChars.length-1; l>=0 ; l--){
			stringBuilder.append(strChars[l]);
			//System.out.println(strChars[l]);
			
		}
		
		String s3 = stringBuilder.toString();
		
		int m = Integer.parseInt(s3);
		return m;
		
	}

}
