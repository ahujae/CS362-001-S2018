/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import java.util.*;


public class CalDayTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {

        DataHandler dataHandler;
        dataHandler = new DataHandler();

        Appt appt = new Appt(15, 30, 28, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");

        dataHandler.saveAppt(appt);


        GregorianCalendar today = new GregorianCalendar(2018, 3, 20);
        GregorianCalendar tomorrow = new GregorianCalendar(2018, 5, 28);
        LinkedList<CalDay> calDays = new LinkedList<CalDay>();

        calDays = (LinkedList<CalDay>) dataHandler.getApptRange(today, tomorrow);

        for (int i = 0; i < 67; i++) {
            CalDay calday = calDays.get(i);
            System.out.println("\n\n" + calday.toString());

            String str = calday.getFullInfomrationApp(calday);

            LinkedList<Appt> appts = calDays.get(i).getAppts();
            for (int index = 0; index < appts.size(); index++) {
                Appt appt_ = appts.get(index);
                System.out.println("\n\n" + appt_.toString());
            }
        }

    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {

        DataHandler dataHandler;
        dataHandler = new DataHandler();

        Appt appt = new Appt(15, 9, 28, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");

        dataHandler.saveAppt(appt);


        GregorianCalendar today = new GregorianCalendar(2018, 3, 20);
        GregorianCalendar tomorrow = new GregorianCalendar(2018, 5, 28);
        LinkedList<CalDay> calDays = new LinkedList<CalDay>();

        calDays = (LinkedList<CalDay>) dataHandler.getApptRange(today, tomorrow);

        for (int i = 0; i < 67; i++) {
            CalDay calday = calDays.get(i);
            System.out.println("\n\n" + calday.toString());

            String str = calday.getFullInfomrationApp(calday);

            LinkedList<Appt> appts = calDays.get(i).getAppts();
            for (int index = 0; index < appts.size(); index++) {
                Appt appt_ = appts.get(index);
                System.out.println("\n\n" + appt_.toString());
            }
        }


    }
}