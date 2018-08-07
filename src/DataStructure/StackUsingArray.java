package DataStructure;

public class StackUsingArray {
	static int size = 10;
	static int stack[] = new int[size];

	static int top = -1;

	static void push(int value) {
		if (top == size - 1) {
			System.out.println("Stack is full, Insertion is not possible");
		}
		else {
			top++;
			stack[top] = value;
			System.out.println(value + " has been pushed");
		}
	}
	
	static void pop(){
		if (top==-1){
			System.out.println("Stack is empty, Deletion is not possible");
		}
		else {
			top--;
			int value = stack[top];
			System.out.println(value + " has been poped");
			
		}
	}
	
	static void display(){
		if(top==-1){
			System.out.println("Stack is empty");
		}
		else{
			System.out.println("Element in Stack: ");
			for(int i=top; i>=0; i--){
				System.out.print (stack[i]);
				System.out.print(",");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String args[]) {
		pop();
		push(10);
		push(18);
		push(19);
		push(18);
		push(18);
		display();
		pop();
		display();
		push(91);
		display();
		push(91);
		push(92);
		push(93);
		push(95);
		push(96);
		push(1000);
		display();
		
	}

}
