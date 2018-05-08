//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package calendar;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import org.junit.Test;

public class DataHandlerTest {
  public DataHandlerTest() {
  }

  @Test(
          timeout = 4000L
  )
  public void test00() throws Throwable {
    DataHandler dataHandler = new DataHandler();
    Appt appt = new Appt(15, 30, 28, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    int[] recurDaysArr = new int[]{2, 3, 4};
    appt.setRecurrence(recurDaysArr, 1, 2, 1000);
    dataHandler.saveAppt(appt);
    GregorianCalendar today = new GregorianCalendar(2018, 3, 20);
    GregorianCalendar tomorrow = new GregorianCalendar(2018, 7, 28);
    new LinkedList();
    LinkedList<CalDay> calDays = (LinkedList)dataHandler.getApptRange(today, tomorrow);
    dataHandler.deleteAppt(appt);
  }

  @Test(
          timeout = 4000L
  )
  public void test01() throws Throwable {
  }
}
