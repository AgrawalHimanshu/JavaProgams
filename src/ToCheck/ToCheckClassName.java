package ToCheck;

public class ToCheckClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToCheckClassName toCheckClassName = new ToCheckClassName();
		toCheckClassName.Print();
	}

	public void Print(){
		System.out.println(this.getClass().getSimpleName());
	}
}
