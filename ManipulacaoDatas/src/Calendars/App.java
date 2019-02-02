package Calendars;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2019-01-25T15:42:14Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
//        cal.add(Calendar.HOUR_OF_DAY, 4);
//        d = cal.getTime();
        int minutes = cal.get(Calendar.MINUTE);
        System.out.println("Minutes: " + minutes);

    }
}
