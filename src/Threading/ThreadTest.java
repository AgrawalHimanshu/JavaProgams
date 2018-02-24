package Threading;

public class ThreadTest {
	
	

	public static void main(String args[]) throws InterruptedException {
	      ThreadProgram T1 = new ThreadProgram( "Thread-1");
	      T1.start();
	      T1.suspend();
	      ThreadProgram T2 = new ThreadProgram( "Thread-2");
	      T2.start();
	      T1.resume();
	   }  
}
