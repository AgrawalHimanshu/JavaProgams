package TechMentroAssignment;

public class Rectangle extends Common{
	public Rectangle(int x, int y){
		super(x,y);
	}
	
	public int area(){
		return l*b;
	}
	
	public int perimeter(){
		return 2*(l+b);
	}		
}
