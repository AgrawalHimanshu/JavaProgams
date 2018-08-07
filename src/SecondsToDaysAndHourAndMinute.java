
public class SecondsToDaysAndHourAndMinute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long number = 369121517;  //129600
		
		long Days=0;
		int Hour, Minute, Seconds;
			
		Days = number /(24*60*600);
		
		System.out.println(Days);
		
		number = number%(24*60*60);
		
		Hour = (int) (number/60*60);
		
		System.out.println(Hour);
		
		number = number%(60*60);
		
		Minute = (int) (number/60);
		
		System.out.println(Minute);
		
		number = number%60;
		
		Seconds = (int) number;
		
		System.out.println(Seconds);
		
		

	}

}
