package Threading;

public class ThreadProgram extends Thread {

	static String name, id;

	private String threadName;

	ThreadProgram(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}
	
	public void run(){
		for (int i=1; i<50; i++){
			System.out.println(threadName + "---->" +i);
		}
	}

}
