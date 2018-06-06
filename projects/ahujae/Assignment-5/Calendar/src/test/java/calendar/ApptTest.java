/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {

	@Test(timeout = 4000)
	public void test00()  throws Throwable  {
		System.out.println("Start testing... appt 1");
		Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		String string0 = appt0.toString();
		assertEquals(2, appt0.getRecurBy());
		assertFalse(appt0.isRecurring());
		assertEquals("\t14/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
		assertEquals(0, appt0.getRecurIncrement());
		appt0.setValid();
	}

	@Test(timeout = 4000)
	public void test01()  throws Throwable  {
		Appt appt1 = new Appt(15, 30, 9, 0, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt1.setValid();

	}

	@Test(timeout = 4000)
	public void test02()  throws Throwable {
		Appt appt2 = new Appt(99, 30, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt2.setValid();
	}

	@Test(timeout = 4000)
	public void test03()  throws Throwable {
		Appt appt3 = new Appt(-1, 30, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt3.setValid();
	}
	@Test(timeout = 4000)
	public void test04()  throws Throwable {
		Appt appt4 = new Appt(15, -1, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt4.setValid();
	}

	@Test(timeout = 4000)
	public void test05()  throws Throwable {
		Appt appt5 = new Appt(15, 99, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt5.setValid();
	}

	@Test(timeout = 4000)
	public void test06()  throws Throwable {
		Appt appt6 = new Appt(15, 30, 9, 9, -2, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt6.setValid();
	}

	@Test(timeout = 4000)
	public void test07()  throws Throwable {
		Appt appt7 = new Appt(15, 30, -1, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt7.setValid();
	}

	@Test(timeout = 4000)
	public void test08()  throws Throwable {
		Appt appt8 = new Appt(15, 30, 50, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt8.setValid();
	}

	@Test(timeout = 4000)
	public void test09()  throws Throwable {
		Appt appt9 = new Appt( 50, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt9.setValid();
	}

}
