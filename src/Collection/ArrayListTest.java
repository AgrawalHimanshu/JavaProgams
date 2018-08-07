package Collection;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(9);
		al.add(3);
		al.add(8);
		al.add(3,4);
		al.add(156);
		al.add(16);
		al.add(15);
		al.add(78);
		al.add(89);
		al.add(90);
		System.out.println("Array List Element:....");
		
		for(int k:al){
			System.out.println(k);
		}
		
		al.remove(Integer.valueOf(900));
		al.remove(new Integer(10));
		
		System.out.println("Array List Element:....");
		
		for(int k:al){
			System.out.println(k);
		}
	}

}
