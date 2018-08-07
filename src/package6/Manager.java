package package6;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Job j1 = new Job("Software", 6000);
		Job j2 = new Job("Admin", 7000);
		Job j3 = new Job("HR", 8000);
		
		Job[] x = {j1,j2,j3};
		
		Employee emp = new Employee(x);
		print(emp);
		System.out.println("=============");
		print(emp);
		System.out.println("=============");
		print(emp);
	}
	
	private static void print(Employee emp){
		Employee.Iterator it = emp.getIterator();
		Job j = null;
		while(it.hasNext()){
			j = it.nextJob();
			
			System.out.println(j.title + " : " + j.salary);
		}
	}

}
