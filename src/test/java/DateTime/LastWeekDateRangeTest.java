package DateTime;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static DateTime.WeekUtils.*;

/**
 * User: liubo
 * Datetime: 2017/5/2317:53
 */
public class LastWeekDateRangeTest {

    @Test
    public void testLastWeekDateRange(){
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int i = c.get(Calendar.DAY_OF_WEEK) - c.getFirstDayOfWeek();
        c.add(Calendar.DATE, -i - 7);
        Date start = c.getTime();
        c.add(Calendar.DATE, 6);
        Date end = c.getTime();
        System.out.println(start + " - " + end);
    }

    @Test
    public void testWeek(){
        System.out.println(Calendar.WEEK_OF_YEAR);
        Calendar c =  Calendar.getInstance();
        c.get(Calendar.WEEK_OF_YEAR);
        System.out.println(c.get(Calendar.WEEK_OF_YEAR));


        Date d1 = new Date();
        Calendar cl = Calendar. getInstance();
        cl.setTime(d1);

        System.out.println("today is " + cl.WEEK_OF_YEAR+ " week of the year");
        System.out.println("today is a "+cl.DAY_OF_MONTH + "month of the year");
        System.out.println("today is a "+cl.WEEK_OF_MONTH +"week of the month");

    }

    @Test
    public void testJoda(){
        /*DateTime dateTime = new DateTime();
        System.out.println(dateTime);*/
        int year = 2017;
        int week = 9;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date today = new Date();


        System.out.println("current date = " + sdf.format(today));
        System.out.println("getWeekOfYear = " + getWeekOfYear(today));
        System.out.println("getMaxWeekNumOfYear = " + getMaxWeekNumOfYear(year));
        System.out.println("getFirstDayOfWeek = " + sdf.format(getFirstDayOfWeek(year, week)));
        System.out.println("getLastDayOfWeek = " + sdf.format(getLastDayOfWeek(year, week)));
        System.out.println("getFirstDayOfWeek = " + sdf.format(getFirstDayOfWeek(today)));
        System.out.println("getLastDayOfWeek = " + sdf.format(getLastDayOfWeek(today)));




    }
}
