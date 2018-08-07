package TechMentroAssignment;

abstract class SwitchThree implements Cloneable{
	abstract void on();
	abstract void off();
	
	void printHello(){
		System.out.println("Hello from anstract class");
	}
	
}

class DeviceThree {
	private String name;
	private boolean state;

	public DeviceThree(String n) {
		name = n;
		state = false;
	}
	
	public SwitchThree getSwitch(){
		SwitchThree btn = new SwitchThree(){
			public void on(){
				state = true;
			}
			
			public void off(){
				state = false;
			}
			
		};
		return btn;
	}
	
	
	public void currentState() {
		if (state) {
			System.out.println(name + " is on");
		} else {
			System.out.println(name + " is off");
		}
	}


}

public class AnoymousClassTest3  {
	public static void main(String arr[]) throws CloneNotSupportedException {
		/*DeviceThree d1 = new DeviceThree("TV");
		DeviceThree d2 = new DeviceThree("Laptop");
		d1.currentState();
		d2.currentState();
		
		SwitchThree s1 = d1.getSwitch();
		SwitchThree s2 = d2.getSwitch();
		s1.on(); s2.on();
				
		d1.currentState();
		d2.currentState();	
		
		s1.off();
		d1.currentState();
		d2.currentState();
		
		System.out.println(d1.toString());
		System.out.println(d1.getSwitch());
		
		New s3 = new New();
		System.out.println(s3);
		
		Object s4 = s3.clone();
		System.out.println(s4);*/
		
		AnotherOne an = new AnotherOne();
		
		an.display();
		
		
		AnotherTwo anTwo = (AnotherTwo)an.clone();
		
		anTwo.display();
		
	
		
	}
}

class New extends SwitchThree implements Cloneable {
	public void on(){
		
	}
	
	public void off(){
		
	}
}

class AnotherOne implements Cloneable{
	public void display(){
		System.out.println("Display method of Another One class");
	}
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
}

class AnotherTwo extends AnotherOne implements Cloneable {
	int number ;
	String name;
	
	public AnotherTwo(int i, String n){
		number =i;
		name = n;
	}
	
	public void display(){
		System.out.println("name is: " + name);
		System.out.println("RollNumber is: " + number);
	}
}