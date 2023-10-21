package sufiyan.com;

import java.sql.SQLOutput;
import java.util.Calendar;

public class gregorian_calendar_and_time_zone {
    public static void main(String[]args){
        Calendar c= Calendar.getInstance();
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.APRIL));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.SECOND));
    }
}
