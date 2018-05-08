/** A JUnit test class to test the class ApptTest. */


package calendar;

import org.junit.Assert;
import org.junit.Test;

public class ApptTest {
    public ApptTest() {
    }

    @Test(
            timeout = 4000L
    )
    public void test00() throws Throwable {
        Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
        String string0 = appt0.toString();
        Assert.assertEquals(2L, (long)appt0.getRecurBy());
        Assert.assertFalse(appt0.isRecurring());
        Assert.assertEquals("\t14/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
        Assert.assertEquals(0L, (long)appt0.getRecurIncrement());
        appt0.setValid();
    }

    @Test(
            timeout = 4000L
    )
    public void test01() throws Throwable {
        Appt appt1 = new Appt(15, 30, 9, -2, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
        for (int i = -10; i < 15; i++) {

            appt1.setStartMonth(i);
            appt1.setValid();
            if (i < 1 || i > 12) {
                Assert.assertFalse(appt1.getValid());
            }

        }
    }
    @Test(
            timeout = 4000L
    )
    public void test02() throws Throwable {
        //for (int i = -150; i < 150; i++) {
            Appt appt2 = new Appt(67, 30, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
            appt2.setValid();
        Assert.assertFalse(appt2.getValid());


        //}
    }

    @Test(
            timeout = 4000L
    )
    public void test03() throws Throwable {
        Appt appt3 = new Appt(-5, 30, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
        appt3.setValid();
        Assert.assertFalse(appt3.getValid());

    }

    @Test(
            timeout = 4000L
    )
    public void test04() throws Throwable {
        Appt appt4 = new Appt(15, -1, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
        appt4.setValid();
        Assert.assertFalse(appt4.getValid());

    }

    @Test(
            timeout = 4000L
    )
    public void test05() throws Throwable {
        Appt appt5 = new Appt(15, 99, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
        appt5.setValid();
        Assert.assertFalse(appt5.getValid());


    }

    @Test(
            timeout = 4000L
    )
    public void test06() throws Throwable {
        Appt appt6 = new Appt(15, 30, 9, 9, -2, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
        appt6.setValid();
        Assert.assertFalse(appt6.getValid());

    }

    @Test(
            timeout = 4000L
    )
    public void test07() throws Throwable {
        Appt appt7 = new Appt(15, 30, -1, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
        appt7.setValid();
        Assert.assertFalse(appt7.getValid());

    }

    @Test(
            timeout = 4000L
    )
    public void test08() throws Throwable {
        Appt appt8 = new Appt(15, 30, 50, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
        appt8.setValid();
        Assert.assertFalse(appt8.getValid());

    }

    @Test(
            timeout = 4000L
    )
    public void test09() throws Throwable {
        Appt appt9 = new Appt(50, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
        appt9.setValid();
        Assert.assertFalse(appt9.getValid());

    }
}

