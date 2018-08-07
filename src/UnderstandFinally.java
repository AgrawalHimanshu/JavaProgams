
public class UnderstandFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean value = UnderstandFinally.method();
		System.out.println(value);
		try{
			int x = 300;
			
			try{
				String s= "hello";
				int[] a= {2,3,5};
				System.out.println(a[6]);
							}
			catch(Exception e){
				e.printStackTrace();
				//System.exit(0);
			
			}
			finally{
				System.out.println("Finally in try Block");
			}
			
		}
		
		finally
		{
			System.out.println("Finally block executed");
			try{
				String s1 = "Hello";
				int[] a= {2,3,5};
				System.out.println(a[2]);
			}
			catch(Exception e){
				e.printStackTrace();
				System.out.println("In Catch block");
			}
			finally{
				System.out.println("Inner Finally Block i.e with in Finally Block");
			}
		}

	}
	
	public static boolean method(){
		try{
			String s= "hello";
			/*int[] a= {2,3,5};
			System.out.println(a[6]);*/
			return true;

		}
		catch(Exception e){
			e.printStackTrace();
			//System.exit(0);
			return false;
		
		}
		finally{
			System.out.println("Finally block within a return statement");
			return false;
		}
	}

}
