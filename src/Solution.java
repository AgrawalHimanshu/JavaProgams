import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        LinkedList<Integer> Li = new LinkedList<Integer>();
        System.out.println("Enter a integer number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        
        
        Li.add(5);
        Li.add(10);
        Li.add(11);
        Li.add(34);
        Li.add(9);
        
        for(int n: Li){
        	System.out.print(n);
        	System.out.print(" ");
        }
        
        System.out.println("\n");
        
        int  length = Li.size();

        if (num> length){
        	System.out.println("Nil");
        }
        
        else{
        	int k = length-num;
        	
        	System.out.println("Your Answer is: " +Li.get(k));
        }
       /* int i;
        System.out.println(Li.get(length-1));*/
      /*  for (i=0 ; i<length; i++ ){
        	System.out.println(Li.get(i));
        }
            */
        
    }
}