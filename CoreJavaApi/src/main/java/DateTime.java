import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by vitaly on 14.08.15.
 */
public class DateTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2015, Month.AUGUST, 14);
        LocalDate date2 = LocalDate.of(2015, 9, 14);

        LocalTime time1 = LocalTime.of(15, 10);
        LocalTime time2 = LocalTime.of(12, 1, 15);
        LocalTime time3 = LocalTime.of(23, 59, 59, 9999);

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time3);

        System.out.println(dateTime2);

        LocalDate start = LocalDate.of(2015, 4, 1);
        LocalDate end = start.plusMonths(4);
        Period period = Period.ofMonths(1);

        perfomeAnimalEnrichment(start, end, period);

        System.out.println(date1.getYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.getDayOfYear());

        System.out.println(date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
        DateTimeFormatter short_format = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        System.out.println(short_format.format(time1)); //UnsupportedTemporalTypeException
        System.out.println(short_format.format(date1)); //14.08.15
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(myFormatter.format(date1));

        LocalDate parsedDate = LocalDate.parse("04-05-1978", myFormatter);
        System.out.println(parsedDate);
    }

    static void perfomeAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate now = start;
        while (now.isBefore(end)) {
            System.out.println("give new toy: " + now);
            now = now.plus(period);
        }
    }
}
