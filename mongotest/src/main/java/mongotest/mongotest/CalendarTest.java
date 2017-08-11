package mongotest.mongotest;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	
	public Calendar startCalendar = Calendar.getInstance();
	
	public static void main(String[] args) {
		CalendarTest calendarTest = new CalendarTest();
		System.out.println(calendarTest.getStartTime().getYear());
		System.out.println(System.currentTimeMillis());
	}
	
	public Date getStartTime(){
		Calendar crtCalendar = Calendar.getInstance();
		crtCalendar.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH);
		return (crtCalendar.getTime());
	}
}
