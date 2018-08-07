package package6;

public class Employee {
	
	Job x[];
	
	Employee(Job x[]){
		this.x = x;
	}
	
	Iterator getIterator(){
		
		return new Iterator(x);

	}
	
	/*static*/ class Iterator{ // if define index value static it will print the result only once.
		private /*static*/ int index; // cause after first iteration the value of index will be 3 .
		
		Job[] x;
		
		Iterator(Job x[]){
			this.x= x;
		}
		
		Job nextJob(){
			return x[index++];
		}
		
		boolean hasNext(){
			return index<x.length;
		}
	}

}
