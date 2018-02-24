import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NewProgram2 {
	public static String date;
	public static int dayOfWeek;
	
	public static void main(String ...koi) throws ParseException {
		/*int number = 65;
		char c = (char) number;
		System.out.println(c);*/
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
		date= date_format.format(calendar.getTime());
		Date convertedDate = date_format.parse(date);
		calendar.setTime(convertedDate);
		calendar.add(Calendar.MONTH, -1);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		System.out.println("Date Of Joining is : " + date_format.format(calendar.getTime()));
		dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		if(dayOfWeek==1 && dayOfWeek==7){
			calendar.add(Calendar.DATE, +2);
			dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			System.out.println(dayOfWeek);
			date= date_format.format(calendar.getTime());
			
		}
		date= date_format.format(calendar.getTime());
		System.out.println(date);
		
	}
}
