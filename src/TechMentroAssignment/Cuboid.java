package TechMentroAssignment;

public class Cuboid extends Common{
	int h;
	
	public Cuboid(int x, int y, int z){
		super(x,y);
		h =z;
	}
	
	public void display(){
		super.display();
		System.out.println("Height = " + h);
	}
	
	public int volume(){
		return l*b*h;
	}
}
