package TechMentroAssignment;

interface Switch{
	void on();
	void off();
}

class Device {
	private String name;
	private boolean state;

	public Device(String n) {
		name = n;
		state = false;
	}
	
	public Switch getSwitch(){
		Switch btn = new Switch(){
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

public class AnoymousClassTest2 {
	public static void main(String arr[]) {
		Device d1 = new Device("TV");
		Device d2 = new Device("Laptop");
		d1.currentState();
		d2.currentState();
		
		Switch s1 = d1.getSwitch();
		Switch s2 = d2.getSwitch();
		s1.on(); s2.on();
		
		d1.currentState();
		d2.currentState();	
		
		s1.off();
		d1.currentState();
		d2.currentState();
	}
}
