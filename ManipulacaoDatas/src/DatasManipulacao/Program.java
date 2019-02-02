package DatasManipulacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date d1 = sdf.parse("28/01/2019");
        Date d2 = sdf2.parse("31/01/2019 18:04:58");

        Date x1 = new Date();
        System.out.println("Data atual: " + x1);
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L);
        Date x5 = Date.from(Instant.parse("2019-06-25T15:42:07Z"));

        System.out.println(sdf2.format(d1));

        System.out.println("d1: " + sdf2.format(d1));
        System.out.println("d2: " + sdf2.format(d2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("x5: " + sdf2.format(x5));
        System.out.println("x5: " + sdf2.format(x5));
        System.out.println("========================");
        System.out.println("d1: " + sdf3.format(d1));
        System.out.println("d2: " + sdf3.format(d2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
        System.out.println("x5: " + sdf3.format(x5));
        System.out.println("x5: " + sdf3.format(x5));
    }
}
