package DateFunctions;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class CalculateNumbeOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long days = ChronoUnit.DAYS.between(LocalDate.of(2014, Month.MARCH, 01), LocalDate.of(2014, Month.FEBRUARY, 15));

	}

}
