
public class UnderstandTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(UnderstandTryCatch.print());
	}

	public static int print(){
		try{
			return 1;
		}
		catch(Exception e){
			e.printStackTrace();
			return 2;
		}
		
		finally{
			System.out.println("Hello");
			return 3;
		}
	}
}
