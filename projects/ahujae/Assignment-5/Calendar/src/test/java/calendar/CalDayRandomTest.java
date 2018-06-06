package calendar;


import org.junit.Test;
import java.util.Calendar;
import java.util.Random;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable {

			 long startTime = Calendar.getInstance().getTimeInMillis();
			 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


			 System.out.println("Start testing...");

			 try{
				 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
					 long randomseed =System.currentTimeMillis(); //10
					 //			System.out.println(" Seed:"+randomseed );
					 Random random = new Random(randomseed);

					 int startHour=ValuesGenerator.getRandomIntBetween(random, -5, 30);
					 int startMinute=ValuesGenerator.getRandomIntBetween(random, -5, 70);
					 int startDay=ValuesGenerator.getRandomIntBetween(random, 0, 40);
					 int startMonth=ValuesGenerator.getRandomIntBetween(random, 0, 15);
					 int startYear=ValuesGenerator.getRandomIntBetween(random, 0, 5000);
					 String title="Birthday Party";
					 String description="This is my birthday party.";
					 String emailAddress="xyz@gmail.com";
					 DataHandler dataHandler;
					 dataHandler = new DataHandler();

					 //Construct a new Appointment object with the initial data
					 //Construct a new Appointment object with the initial data
					 Appt appt = new Appt(startHour,
							 startMinute ,
							 startDay ,
							 startMonth ,
							 startYear ,
							 title,
							 description,
							 emailAddress);

					 dataHandler.saveAppt(appt);
					 GregorianCalendar today = new GregorianCalendar(startYear, startMonth, startDay);
					 GregorianCalendar tomorrow = new GregorianCalendar(startYear+50, startMonth, startDay);
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




					 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
					 if((iteration%10000)==0 && iteration!=0 )
						 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

				 }
			 }catch(NullPointerException e){

			 }

			 System.out.println("Done testing...");
		 }

	 }





	

