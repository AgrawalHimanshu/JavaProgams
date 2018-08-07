package String;

public class UnderstandStringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Stored values in StringPool. If a different variable referring to same value of the String
		// it Will not create a new address in memory
		// Also == operator checks for address and equals() method checks for Value in string
		
 		String s1 = "foo";
		String s2 = "foo";
		// so, these both print true
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		// new String(), forcefully create a different object in memory.
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		// So, == will print false and equals() will print true
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));

	}

}
