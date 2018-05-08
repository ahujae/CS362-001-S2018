/** A JUnit test class to test the class CalDay. */

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package calendar;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import org.junit.Test;

public class CalDayTest {
  public CalDayTest() {
  }

  @Test(
          timeout = 4000L
  )
  public void test00() throws Throwable {
    DataHandler dataHandler = new DataHandler();
    Appt appt = new Appt(15, 30, 28, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    dataHandler.saveAppt(appt);
    GregorianCalendar today = new GregorianCalendar(2018, 3, 20);
    GregorianCalendar tomorrow = new GregorianCalendar(2018, 5, 28);
    new LinkedList();
    LinkedList<CalDay> calDays = (LinkedList)dataHandler.getApptRange(today, tomorrow);

    for(int i = 0; i < 67; ++i) {
      CalDay calday = (CalDay)calDays.get(i);
      System.out.println("\n\n" + calday.toString());
      String str = calday.getFullInfomrationApp(calday);
      LinkedList<Appt> appts = ((CalDay)calDays.get(i)).getAppts();

      for(int index = 0; index < appts.size(); ++index) {
        Appt appt_ = (Appt)appts.get(index);
        System.out.println("\n\n" + appt_.toString());
      }
    }

  }

  @Test(
          timeout = 4000L
  )
  public void test01() throws Throwable {
    DataHandler dataHandler = new DataHandler();
    Appt appt = new Appt(15, 9, 28, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    dataHandler.saveAppt(appt);
    GregorianCalendar today = new GregorianCalendar(2018, 3, 20);
    GregorianCalendar tomorrow = new GregorianCalendar(2018, 5, 28);
    new LinkedList();
    LinkedList<CalDay> calDays = (LinkedList)dataHandler.getApptRange(today, tomorrow);

    for(int i = 0; i < 67; ++i) {
      CalDay calday = (CalDay)calDays.get(i);
      System.out.println("\n\n" + calday.toString());
      String str = calday.getFullInfomrationApp(calday);
      LinkedList<Appt> appts = ((CalDay)calDays.get(i)).getAppts();

      for(int index = 0; index < appts.size(); ++index) {
        Appt appt_ = (Appt)appts.get(index);
        System.out.println("\n\n" + appt_.toString());
      }
    }

  }
}