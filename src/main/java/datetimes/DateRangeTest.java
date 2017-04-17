package datetimes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static java.util.Calendar.MONTH;

/**
 * Created by Thinkpad on 2017/4/11.
 */
public class DateRangeTest {
    public static void main(String[] args){
        System.out.println("date range test");
        List<Date> dateList = getDateList();
        for (Date d : dateList) {
            System.out.println(d);
        }
    }

    public static List<Date> getDateList() {
        Calendar c = Calendar.getInstance();//现在
        c.set(MONTH, 0);
        //昨天
         Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);

        return dateInterval(c.getTime(), cal.getTime());
    }

    /**
     * 取日期范围内的日期
     *
     * @param begin
     * @param end
     * @return
     */
    public static List<Date> dateInterval(Date begin, Date end) {
        List<Date> dates = new ArrayList<Date>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(begin);

        while (calendar.getTime().before(end)) {
            Date result = calendar.getTime();
            dates.add(result);
            calendar.add(Calendar.DATE, 1);
        }

        return dates;
    }
}
