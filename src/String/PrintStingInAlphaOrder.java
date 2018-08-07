package String;

import java.util.Arrays;

public class PrintStingInAlphaOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello How Are You XYZ?";
		//s= s + " ";
		printAlphaInOrder(s);
	}

	public static void printAlphaInOrder(String s){
		String arr[] = s.split(" ");
		Arrays.sort(arr);
		for(String str:arr){
			System.out.print(str + " ");
		}
	}
}
