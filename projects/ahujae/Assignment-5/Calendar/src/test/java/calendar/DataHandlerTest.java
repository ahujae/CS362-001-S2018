
/** A JUnit test class to test the class DataHandler. */


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;


public class DataHandlerTest{

	@Test(timeout = 4000)
	public void test00()  throws Throwable  {
		DataHandler dataHandler;
		dataHandler = new DataHandler();
		Appt appt = new Appt(15, 30, 28, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		int[] recurDaysArr={2,3,4};
		appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
		dataHandler.saveAppt(appt);

		GregorianCalendar today = new GregorianCalendar(2018, 3, 20);
		GregorianCalendar tomorrow = new GregorianCalendar(2018, 7, 28);
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();

		calDays = (LinkedList<CalDay>) dataHandler.getApptRange(today, tomorrow);
		dataHandler.deleteAppt(appt);




	}
	@Test(timeout = 4000)
	public void test01()  throws Throwable  {

	}

}