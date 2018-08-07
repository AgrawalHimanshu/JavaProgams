
public class UnderstandFinalize {
	
	public void finalize(){
		System.out.println("finalie method is called");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnderstandFinalize f1=new UnderstandFinalize();  
		UnderstandFinalize f2=new UnderstandFinalize();  
		f1=null;  
		f2=null;  
		System.gc();  
		
		
	}

}
