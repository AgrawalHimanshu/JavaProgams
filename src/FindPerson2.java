
public class FindPerson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		
		String s = Integer.toBinaryString(i);
		
        StringBuilder strBuilder = new StringBuilder();

		System.out.println(s);	
		
        char[] strChars = s.toCharArray();
        
        char ch = s.charAt(0);
        
        for (int k = 1; k <= strChars.length-1; k++) {
        	
            strBuilder.append(strChars[k]);
        }
        
        strBuilder.append(ch);
        
        

        String s2 = strBuilder.toString();
        
        System.out.println(s2);
		
		System.out.println("Output: "+Integer.parseInt(s2,2));


	}

}
