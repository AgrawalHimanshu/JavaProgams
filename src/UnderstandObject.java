
public class UnderstandObject {
	
	public void finalize(){
		System.out.println("finalie method is called");
	}


	@SuppressWarnings("null")
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		UnderstandObject uso = new UnderstandObject();
		UnderstandObject uso1 = new UnderstandObject();
		
	/*uso = null;
	uso1 = null;*/
		/*System.out.println(uso.toString());
		System.out.println(uso1.toString());*/
		
		//System.out.println(uso1.equals(uso));
		
		System.gc();
		//System.out.println(uso);
		//System.out.println(uso);

		
	}

}
