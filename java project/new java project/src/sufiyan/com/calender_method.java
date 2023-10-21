package sufiyan.com;

import java.util.Calendar;
import java.util.TimeZone;

public class calender_method {
    public static void main(String[]args){
       Calendar c=  Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone().getID());


        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeZone().getID());

       while(true){
           try{
               Thread.sleep(1000);
               System.out.println(calendar.getTime());
           }
           catch (Exception e){
               System.out.println(e);
           }

       }

    }
}








