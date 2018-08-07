package TechMentroAssignment;

public class Calculate {
	
	public class Common{
		int l,b;
		
		public Common(int x, int y){
			l = x;
			b = y;
		}
		
		public void display(){
			System.out.println("Length = " + l);
			System.out.println("Breadth = " + b);
		}		
	}
	
	public class Hello{
		public void print(){
			System.out.println("Hello in Hello Class");
		}
	}
	
	public static class HelloTwo{
		public void print(){
				System.out.println("Hello from Hello Two Class");
			}
		
		public static void main(String arr[]){
			System.out.println("Hello from Main method of HelloTwo class");
		}
		}
	
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
	
	public static class InhertanceTest {
		public static void main(String args[]){
			Calculate c = new Calculate();
			Rectangle r = c.new Rectangle(6, 7);
			r.display();
			int area = r.area();
			int perimeter = r.perimeter();
			System.out.println("Area = " + area);
			System.out.println("Perimeter = " + perimeter);
			
			Cuboid Cu= c.new Cuboid(4,6,7);
			
			Cu.display();
			int volume = Cu.volume();
			System.out.println("Volume = " + volume);
			
			Calculate.HelloTwo helloTwo= new Calculate.HelloTwo();
			System.out.println(helloTwo.toString());
			
			
	}
	}
}
