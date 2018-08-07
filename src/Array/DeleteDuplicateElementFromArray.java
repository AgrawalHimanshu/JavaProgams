package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Set;

public class DeleteDuplicateElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {8,4,5,6,5,7,7,7,7,8};
		int count = 1;
		Set<Integer> set = new HashSet<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i<=arr.length-1; i++){
			System.out.println(set.add(arr[i]));
			
		}
		
		for(int i : set){
			System.out.println(i);
		}
	
		//set.forEach(System.out::println);

		/*for(Entry<Integer,Integer> entry: map.entrySet()){
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		*/
		/*for (Integer s : set) {
		    System.out.println(s);
		}*/
		
	}

}
