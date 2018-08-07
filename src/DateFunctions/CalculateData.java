package DateFunctions;

import java.util.Date;

public class CalculateData {
	
	
	
	
 
	public static void main(String[] args) {
		String date = "05-05-2015";
		
		String st = date + "-";
		
		String a [] = st.split("-");
		// TODO Auto-generated method stub
		int day = Integer.parseInt(a[0]);
		int month = Integer.parseInt(a[1]);
		int year = Integer.parseInt(a[2]);
		
		String currentDate  = "06-09-2018";
		
		st = currentDate+ "-";
		
		String a1[] = st.split("-");
		int currentDay = Integer.parseInt(a1[0]);
		int currentMonth = Integer.parseInt(a1[1]);
		int curentYear = Integer.parseInt(a1[2]);
		
	//	int totalDays = (curentYear-year)*365 + (currentMonth-month)*
	}

}
