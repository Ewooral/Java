
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static void main(String[] args) {

        // OLDER VERSION OF THE DATE API
        Date date = new Date();
        System.out.println(date);

        GregorianCalendar gc = new GregorianCalendar(1993, 1, 28);
        gc.add(GregorianCalendar.DATE, 1);
        Date date2 = gc.getTime();
        System.out.println(date2);

        DateFormat dateformat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("formatted date: " + dateformat.format(date2));

        // NEWER DATE VERSION
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.of(2009, 1, 28);
        System.out.println(localDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dateTimeFormatter.format(localDate));

    }
}
