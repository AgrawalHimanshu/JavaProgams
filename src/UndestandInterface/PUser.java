package UndestandInterface;

public class PUser {

	public static void invoke(P x){
		x.p();
	}
	
	public static void main(String arr[]){
		//PUser p1 = new PUser();
		invoke(new PQR());
	}
}
