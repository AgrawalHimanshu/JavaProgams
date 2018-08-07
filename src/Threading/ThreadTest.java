package Threading;

class A {
static int counter;
int no;

public A(){
	Thread t = Thread.currentThread();
	no = ++counter;
	System.out.println("Object " + no + " is being created in " + t.getName() + " branch." );
}

protected void finalize(){
	counter--;
	Thread t = Thread.currentThread();
	System.out.println("Object " + no + " of A is being destroyed in " + t.getName() + " branch.");
}
}

class ThreadTest {
	public static void main(String arr[]) throws Exception{
		System.out.println("Creating 3 object of A in main method");
		new A();
		A x = new A(); // it would not get deleted 
		new A();
		x = null; // until you explicitly drop an object reference by setting the value of a 
				// variable whose data type is a reference type to null.
		System.gc();
		Thread.sleep(1000);
		
		System.out.println("Total number of object left " + A.counter);
		x = null;
	}
}