package q2017011805733;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class q2017011805733 {

	public static void main(String[] args) {
		LocalDate d = LocalDate.of(2017, Month.JANUARY, 18);
		Period p = Period.of(1, 2, 3);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(f.format(d));
		System.out.println(d);

	}

}
