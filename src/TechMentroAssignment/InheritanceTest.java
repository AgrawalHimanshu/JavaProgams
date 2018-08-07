package TechMentroAssignment;


public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Rectangle r = new Rectangle(6,7);
		Hello h = new Hello();
		h.print();
		
		Rectangle r = new Rectangle(5,7);
		r.display();
		int area = r.area();
		int perimeter = r.perimeter();
		System.out.println("Area = " + area);
		System.out.println("Perimeter = " + perimeter);
		
		Cuboid C = new Cuboid(5,6,7);
		
		C.display();
		int volume = C.volume();
		System.out.println("Volume = " + volume);

	}

}
