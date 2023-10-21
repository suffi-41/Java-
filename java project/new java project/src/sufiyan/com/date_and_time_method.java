package sufiyan.com;

import com.sun.security.jgss.GSSUtil;

import java.util.Date;

public class date_and_time_method {
    public static void main(String[]args){
//        System.out.println(System.currentTimeMillis()/10000);

        Date date=new Date();
        System.out.println(date.getTime());
        System.out.println(date);
        System.out.println(date.getDate());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDay());
        System.out.println(date.getSeconds());
        System.out.println(date.getMinutes());
        System.out.println(date.getHours());


    }

}
