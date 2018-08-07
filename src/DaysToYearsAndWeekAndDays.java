
public class DaysToYearsAndWeekAndDays {
	
	public static void main(String args[]){
		
		int number = 396;
		
		int years, weeks, days;
		
		years = number/(365);
		
		System.out.println(years);
		
		number = number%(365);
		
		weeks = number/(7);
		
		System.out.println(weeks);
		
		number = number%(7);
		
		days = number;
		
		System.out.println(days);
		
		
	}

}
