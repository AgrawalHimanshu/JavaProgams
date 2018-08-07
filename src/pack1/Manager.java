package pack1;

class Job {
	
	String title;
	double salary;
	
	Job(String title, double salary){
		this.title = title;
		this.salary = salary;
	}
	
}

class Employee{
	private int index;
	Job x[];

	public Employee(Job x[])  {
		this.x = x;
	}

	Job nextJob(){
		return x[index++];
	}
	
	boolean hasNext(){
		if(index == x.length){
			index = 0;
			return false;
		}
		return true;
	}
}

class Manager{
	public static void main(String args[]){
		Job j1 = new Job("IT", 89990.9);
		Job j2 = new Job("HR", 7665.9);
		Job j3 = new Job("Admin", 655445.67);
		
		Job x[] = {j1,j2,j3};
		
		Employee emp = new Employee(x);
		
		print(emp);
		System.out.println("------");
		print(emp);
		System.out.println("------");
		print(emp);
		System.out.println("------");
	}	
		
	private static void print(Employee emp){
			
			Job j = null;
			
			while(emp.hasNext()){
				j = emp.nextJob();
				
				System.out.println("Title: " + j.title + " and Salary: " + j.salary);
			}
			
		}
	
}

//Output 
/*boolean hasNext(){
	return index < x.length;
}*/
/*Title: IT and Salary: 89990.9
Title: HR and Salary: 7665.9
Title: Admin and Salary: 655445.67
------
------
------*/
