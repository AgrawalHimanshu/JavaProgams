package TechMentroAssignment1;

public class CaseFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = '$';
		System.out.println((int)ch);
		
		if((int)ch>=97 && (int)ch<=122){
			System.out.println("Letter is in small case");
		}
		
		else if((int)ch>=65 && (int)ch<=90){
			System.out.println("Letter is in CAPITAL case");
		}
		
		else
			System.out.println("Letter is not a alpha character");

	}

}
