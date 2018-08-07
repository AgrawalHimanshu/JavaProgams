package TechMentroAssignment;


class DeviceTwo {
	private String name;
	private boolean state;

	public DeviceTwo(String n) {
		name = n;
		state = false;
	}
	
	public class Switch{
		public void on(){
			state = true;
		}
		
		public void off(){
			state = false;
		}
	}
	
	/*public Switch getSwitch(){
		
		Switch btn = new Switch(){
			void on(){
				state = true;
			}
			
			void off(){
				state = false;
			}
		};
		return btn;
	}*/
	
	public void currentState() {
		if (state) {
			System.out.println(name + " is on");
		} else {
			System.out.println(name + " is off");
		}
	}


}

public class AnoymousTest {
	public static void main(String arr[]) {
		DeviceTwo d1 = new DeviceTwo("TV");
		DeviceTwo d2 = new DeviceTwo("Laptop");
		d1.currentState();
		d2.currentState();
		
		DeviceTwo.Switch s1 = d1.new Switch();
		DeviceTwo.Switch s2 = d2.new Switch();
		s1.on(); s2.on();
		
		d1.currentState();
		d2.currentState();	
		
		s1.off();
		d1.currentState();
		d2.currentState();
	}
}
