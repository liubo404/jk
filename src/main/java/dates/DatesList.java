package dates;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static java.util.Calendar.*;
/**
 * Created by Thinkpad on 2017/4/1.
 */
public class DatesList {
    private final static SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");

    public static List<Date> dateInterval(Date initial, Date end) {
        List<Date> dates = new ArrayList<Date>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(initial);

        while (calendar.getTime().before(end)) {
            Date result = calendar.getTime();
            dates.add(result);
            calendar.add(Calendar.DATE, 1);
        }

        return dates;
    }

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();   // this takes current date
        c.set(MONTH, 0);

        System.out.println(printCalendar(c ));
        System.out.println("s-----------");
        List<Date> dateList = dateInterval(c.getTime(),new Date());
        for(Date d : dateList){
            System.out.println(d);
        }
        System.out.println("e------------");
        int month = 8, year = 2016;

        Calendar start = Calendar.getInstance();
        start.set(MONTH, month - 1);  // month is 0 based on calendar
        start.set(YEAR, year);
        start.set(DAY_OF_MONTH, 1);
        start.getTime();
        start.set(DAY_OF_WEEK, SUNDAY);
        if (start.get(MONTH) <= (month - 1))
            start.add(DATE, -7);

        System.out.println(printCalendar(start));

        Calendar end = Calendar.getInstance();
        end.set(MONTH, month);  // next month
        end.set(YEAR, year);
        end.set(DAY_OF_MONTH, 1);
        end.getTime();
        end.set(DATE, -1);
        end.set(DAY_OF_WEEK, SATURDAY);
        start.getTime();
        if (end.get(MONTH) != month)
            end.add(DATE, +7);

        System.out.println(printCalendar(end));
    }

    private static String printCalendar(Calendar c) {
        return df.format(c.getTime());
    }
}
