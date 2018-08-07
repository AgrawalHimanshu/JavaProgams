package ToCheck;

public class ToCheckInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer i1 = 128;
		
		Integer i2 = 128;
		
		Integer a[] = {128,128,4,5};
		
		System.out.println(a[0].equals(a[1]));
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1.equals(i2));
		
		String s1 = "Hello";

		String s2 = "Hello";
		System.out.println("---------");

		System.out.println(s1==s2);
		System.out.println(129 == 129);
		
		Integer i3 = new Integer(129);
		Integer i4 = new Integer(129);
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));

		int i =10;
		  boolean negative = (i < 0);
		  System.out.println(negative);
		  
		int j = Integer.valueOf(129);
		
		int k = Integer.valueOf(129);
		
		System.out.println(j==k);
		
		String s3 = "Hello";
		
		String s4 = "Hello";
		
		/*String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1==s2);
		
		System.out.println(s3==s4);*/
	}

}
